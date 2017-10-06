package org.incode.domainapp.example.dom.dom.communications;

import org.apache.isis.applib.AppManifestAbstract;

/**
 * Used by <code>isis-maven-plugin</code> (build-time validation of the module) and also by module-level integration tests.
 */
public class ExampleDomModuleCommunicationsDomManifest extends AppManifestAbstract {

    public static final Builder BUILDER = Builder.forModules(ExampleDomModuleCommunicationsModule.class);

    public ExampleDomModuleCommunicationsDomManifest() {
        super(BUILDER);
    }

}
