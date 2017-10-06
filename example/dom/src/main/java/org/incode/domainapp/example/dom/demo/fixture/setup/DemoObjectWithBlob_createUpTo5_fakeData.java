package org.incode.domainapp.example.dom.demo.fixture.setup;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.io.ByteSource;
import com.google.common.io.Resources;

import org.apache.isis.applib.fixturescripts.FixtureScript;
import org.apache.isis.applib.value.Blob;

import org.isisaddons.module.fakedata.dom.FakeDataService;
import org.incode.domainapp.example.dom.demo.dom.demowithblob.DemoObjectWithBlob;
import org.incode.domainapp.example.dom.demo.dom.demowithblob.DemoObjectWithBlobMenu;

import lombok.Getter;

public class DemoObjectWithBlob_createUpTo5_fakeData extends FixtureScript {

    @javax.inject.Inject
    DemoObjectWithBlobMenu demoObjectMenu;

    @javax.inject.Inject
    FakeDataService fakeDataService;

    @Getter
    private Integer number ;
    public DemoObjectWithBlob_createUpTo5_fakeData setNumber(final Integer number) {
        this.number = number;
        return this;
    }

    @Getter
    private List<DemoObjectWithBlob> demoObjects = Lists.newArrayList();

    @Override
    protected void execute(final ExecutionContext ec) {

        defaultParam("number", ec, 3);
        if(getNumber() < 1 || getNumber() > 5) {
            // there are 5 sample PDFs
            throw new IllegalArgumentException("number of demo objects to create must be within [1,5]");
        }

        for (int i = 0; i < getNumber(); i++) {
            final DemoObjectWithBlob demoObject = create(i, ec);
            getDemoObjects().add(demoObject);
        }
    }

    private DemoObjectWithBlob create(final int n, final ExecutionContext ec) {
        final String name = fakeDataService.name().firstName();

        final String documentName = "Sample" + (n + 1) + ".PDF";
        final String urlStr = "http://www.pdfpdf.com/samples/" + documentName;

        Blob blob = asBlob(documentName, urlStr);

        final DemoObjectWithBlob demoObject = wrap(demoObjectMenu).createDemoObjectWithBlob(name);
        wrap(demoObject).setUrl(urlStr);
        wrap(demoObject).setBlob(blob);

        return ec.addResult(this, demoObject);
    }

    private Blob asBlob(final String documentName, final String urlStr) {
        try {
            final URL url = new URL(urlStr);

            final HttpURLConnection httpConn = openConnection(url);
            final String contentType = httpConn.getContentType();
            final MimeType mimeType = determineMimeType(contentType);

            httpConn.disconnect();

            final ByteSource byteSource = Resources.asByteSource(url);
            final byte[] bytes = byteSource.read();

            return new Blob(documentName, mimeType.getBaseType(), bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private HttpURLConnection openConnection(final URL url) throws IOException {
        final HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        final int responseCode = httpConn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("Response code: " + responseCode);
        }
        return httpConn;
    }

    private MimeType determineMimeType(final String contentType) throws MimeTypeParseException {
        final String mimeType = parseMimeType(contentType);
        if(mimeType == null) {
            return null;
        }
        return new MimeType(mimeType);
    }

    // text/plain; charset=UTF-8
    private String parseMimeType(final String contentType) {
        final Iterable<String> values = Splitter.on(";").split(contentType);
        for (String value : values) {
            // is simply the first part
            return value.trim();
        }

        return null;
    }

}
