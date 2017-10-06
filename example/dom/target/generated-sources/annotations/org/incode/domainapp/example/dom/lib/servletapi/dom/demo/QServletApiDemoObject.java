package org.incode.domainapp.example.dom.lib.servletapi.dom.demo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QServletApiDemoObject extends PersistableExpressionImpl<ServletApiDemoObject> implements PersistableExpression<ServletApiDemoObject>
{
    public static final QServletApiDemoObject jdoCandidate = candidate("this");

    public static QServletApiDemoObject candidate(String name)
    {
        return new QServletApiDemoObject(null, name, 5);
    }

    public static QServletApiDemoObject candidate()
    {
        return jdoCandidate;
    }

    public static QServletApiDemoObject parameter(String name)
    {
        return new QServletApiDemoObject(ServletApiDemoObject.class, name, ExpressionType.PARAMETER);
    }

    public static QServletApiDemoObject variable(String name)
    {
        return new QServletApiDemoObject(ServletApiDemoObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;
    public final ObjectExpression<org.isisaddons.module.servletapi.dom.ServletContextProvider> servletContextProvider;
    public final ObjectExpression<org.isisaddons.module.servletapi.dom.HttpServletRequestProvider> httpServletRequestProvider;
    public final ObjectExpression<org.isisaddons.module.servletapi.dom.HttpServletResponseProvider> httpServletResponseProvider;

    public QServletApiDemoObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.servletContextProvider = new ObjectExpressionImpl<org.isisaddons.module.servletapi.dom.ServletContextProvider>(this, "servletContextProvider");
        this.httpServletRequestProvider = new ObjectExpressionImpl<org.isisaddons.module.servletapi.dom.HttpServletRequestProvider>(this, "httpServletRequestProvider");
        this.httpServletResponseProvider = new ObjectExpressionImpl<org.isisaddons.module.servletapi.dom.HttpServletResponseProvider>(this, "httpServletResponseProvider");
    }

    public QServletApiDemoObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.servletContextProvider = new ObjectExpressionImpl<org.isisaddons.module.servletapi.dom.ServletContextProvider>(this, "servletContextProvider");
        this.httpServletRequestProvider = new ObjectExpressionImpl<org.isisaddons.module.servletapi.dom.HttpServletRequestProvider>(this, "httpServletRequestProvider");
        this.httpServletResponseProvider = new ObjectExpressionImpl<org.isisaddons.module.servletapi.dom.HttpServletResponseProvider>(this, "httpServletResponseProvider");
    }
}
