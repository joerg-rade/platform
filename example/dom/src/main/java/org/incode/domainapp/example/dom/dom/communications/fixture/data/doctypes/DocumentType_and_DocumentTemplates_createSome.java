package org.incode.domainapp.example.dom.dom.communications.fixture.data.doctypes;

import java.io.IOException;
import java.net.URL;

import javax.inject.Inject;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import org.joda.time.LocalDate;

import org.apache.isis.applib.services.clock.ClockService;
import org.apache.isis.applib.value.Clob;

import org.incode.domainapp.example.dom.dom.document.dom.applicability.rmf.RenderModelFactoryOfDocumentAttachedToDemoInvoice;
import org.incode.module.document.dom.impl.docs.Document;
import org.incode.module.document.dom.impl.docs.DocumentTemplate;
import org.incode.module.document.dom.impl.rendering.RenderingStrategy;
import org.incode.module.document.dom.impl.rendering.RenderingStrategyRepository;
import org.incode.module.document.dom.impl.types.DocumentType;
import org.incode.module.document.fixture.DocumentTemplateFSAbstract;

import lombok.Getter;

public class DocumentType_and_DocumentTemplates_createSome extends DocumentTemplateFSAbstract {

    public static final String DOC_TYPE_REF_INVOICE = "INVOICE";
    public static final String DOC_TYPE_REF_RECEIPT = "RECEIPT";


    // applicable to DemoInvoice.class
    public static final String DOC_TYPE_REF_FREEMARKER_HTML = "FREEMARKER_HTML";

    @Getter
    DocumentTemplate fmkTemplate;

    @Getter
    DocumentTemplate siTemplate;

    @Getter
    DocumentTemplate xdpTemplate;

    @Getter
    DocumentTemplate xddTemplate;

    @Override
    protected void execute(final ExecutionContext executionContext) {

        // these document types have no associated templates
        final DocumentType invoiceType =
                upsertType(DOC_TYPE_REF_INVOICE, "Demo invoice document type", executionContext);
        final DocumentType docType =
                upsertType(DOC_TYPE_REF_RECEIPT, "Receipt document type", executionContext);


        // doc type for rendering cover notes.
        final DocumentType docTypeForFreemarkerHtml =
                upsertType(DOC_TYPE_REF_FREEMARKER_HTML, "Demo Freemarker HTML (eg email Cover Note)", executionContext);

        final RenderingStrategy fmkRenderingStrategy = renderingStrategyRepository.findByReference(
                RenderingStrategy_create1.REF_FMK);

        final String atPath = "/";


        //
        // freemarker template, with html
        //
        final LocalDate now = clockService.now();

        final Clob clob = new Clob(docTypeForFreemarkerHtml.getName(), "text/html",
                loadResource("FreemarkerHtmlCoverNote.html"));
        fmkTemplate = upsertDocumentClobTemplate(
                docTypeForFreemarkerHtml, now, atPath,
                ".html",
                false,
                clob, fmkRenderingStrategy,
                "Freemarker-html-cover-note-for-${demoInvoice.num}", fmkRenderingStrategy,
                executionContext);

        mixin(DocumentTemplate._applicable.class, fmkTemplate).applicable(
                Document.class,
                RenderModelFactoryOfDocumentAttachedToDemoInvoice.class,
                null);

        executionContext.addResult(this, fmkTemplate);

    }

    private static String loadResource(final String resourceName) {
        final URL templateUrl = Resources
                .getResource(DocumentType_and_DocumentTemplates_createSome.class, resourceName);
        try {
            return Resources.toString(templateUrl, Charsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(String.format("Unable to read resource URL '%s'", templateUrl));
        }
    }


    @Inject
    RenderingStrategyRepository renderingStrategyRepository;
    @Inject
    ClockService clockService;


}
