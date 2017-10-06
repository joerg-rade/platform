package org.incode.domainapp.example.dom.dom.settings;

import java.util.List;

import org.apache.isis.applib.Identifier;

public final class ExampleDomModuleSettingsModule {

    private ExampleDomModuleSettingsModule(){}

    public abstract static class ActionDomainEvent<S> extends org.apache.isis.applib.services.eventbus.ActionDomainEvent<S> {
        public ActionDomainEvent(final S source, final Identifier identifier) {
            super(source, identifier);
        }

        public ActionDomainEvent(final S source, final Identifier identifier, final Object... arguments) {
            super(source, identifier, arguments);
        }

        public ActionDomainEvent(final S source, final Identifier identifier, final List<Object> arguments) {
            super(source, identifier, arguments);
        }
    }

    public abstract static class CollectionDomainEvent<S,T> extends org.apache.isis.applib.services.eventbus.CollectionDomainEvent<S,T> {
        public CollectionDomainEvent(final S source, final Identifier identifier, final Of of) {
            super(source, identifier, of);
        }

        public CollectionDomainEvent(final S source, final Identifier identifier, final Of of, final T value) {
            super(source, identifier, of, value);
        }
    }

    public abstract static class PropertyDomainEvent<S,T> extends org.apache.isis.applib.services.eventbus.PropertyDomainEvent<S,T> {
        public PropertyDomainEvent(final S source, final Identifier identifier) {
            super(source, identifier);
        }

        public PropertyDomainEvent(final S source, final Identifier identifier, final T oldValue, final T newValue) {
            super(source, identifier, oldValue, newValue);
        }
    }
}
