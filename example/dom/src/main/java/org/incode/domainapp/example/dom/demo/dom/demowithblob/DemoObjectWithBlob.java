package org.incode.domainapp.example.dom.demo.dom.demowithblob;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.VersionStrategy;

import com.google.common.collect.Ordering;

import org.wicketstuff.pdfjs.Scale;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.BookmarkPolicy;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.DomainObjectLayout;
import org.apache.isis.applib.annotation.Editing;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Property;
import org.apache.isis.applib.annotation.PropertyLayout;
import org.apache.isis.applib.annotation.SemanticsOf;
import org.apache.isis.applib.annotation.Title;
import org.apache.isis.applib.annotation.Where;
import org.apache.isis.applib.value.Blob;

import org.isisaddons.wicket.pdfjs.cpt.applib.PdfJsViewer;

import lombok.Getter;
import lombok.Setter;

@javax.jdo.annotations.PersistenceCapable(
        identityType=IdentityType.DATASTORE,
        schema = "exampleDemo"
)
@javax.jdo.annotations.DatastoreIdentity(strategy= IdGeneratorStrategy.IDENTITY, column = "id")
@javax.jdo.annotations.Version(strategy=VersionStrategy.VERSION_NUMBER, column = "version")
@DomainObject
@DomainObjectLayout(
        bookmarking = BookmarkPolicy.AS_ROOT,
        cssClassUiEvent = DemoObjectWithBlob.CssClassUiEvent.class
)
public class DemoObjectWithBlob implements Comparable<DemoObjectWithBlob> {


    public static class CssClassUiEvent
            extends org.apache.isis.applib.services.eventbus.CssClassUiEvent<DemoObjectWithBlob> {}


    @javax.jdo.annotations.Column(allowsNull="false")
    @Title(sequence="1")
    @Property(editing = Editing.ENABLED)
    @Getter @Setter
    private String name;


    @MemberOrder(name = "name", sequence = "1")
    public DemoObjectWithBlob updateName(String name) {
        setName(name);
        return this;
    }
    public String default0UpdateName() {
        return getName();
    }



    @javax.jdo.annotations.Column(allowsNull="true")
    @Property(editing = Editing.ENABLED)
    @Getter @Setter
    private String url;



    @javax.jdo.annotations.Persistent(defaultFetchGroup="false", columns = {
            @javax.jdo.annotations.Column(name = "blob_name"),
            @javax.jdo.annotations.Column(name = "blob_mimetype"),
            @javax.jdo.annotations.Column(name = "blob_bytes", jdbcType = "BLOB", sqlType = "LONGVARBINARY")
    })
    @Property(optionality = Optionality.OPTIONAL, editing = Editing.ENABLED)
    @PropertyLayout(hidden = Where.ALL_TABLES)
    @Setter
    private Blob blob;

    //    @Getter(onMethod = @__({ }))  throwing a compile exception :-(
    @PdfJsViewer(initialPageNum = 1, initialScale = Scale._1_00, initialHeight = 600)
    public Blob getBlob() {
        return blob;
    }




    @Action(semantics = SemanticsOf.SAFE)
    @MemberOrder(name = "url", sequence = "1")
    public URL openUrl() throws MalformedURLException {
        return new java.net.URL(getUrl());
    }
    public String disableOpenUrl() {
        if (getUrl() == null)
            return "No URL to open";
        return null;
    }






    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(final DemoObjectWithBlob other) {
        return Ordering.natural().onResultOf(DemoObjectWithBlob::getName).compare(this, other);
    }


}
