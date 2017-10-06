package org.incode.domainapp.example.dom.demo.dom.customer;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoCustomer extends PersistableExpressionImpl<DemoCustomer> implements PersistableExpression<DemoCustomer>
{
    public static final QDemoCustomer jdoCandidate = candidate("this");

    public static QDemoCustomer candidate(String name)
    {
        return new QDemoCustomer(null, name, 5);
    }

    public static QDemoCustomer candidate()
    {
        return jdoCandidate;
    }

    public static QDemoCustomer parameter(String name)
    {
        return new QDemoCustomer(DemoCustomer.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoCustomer variable(String name)
    {
        return new QDemoCustomer(DemoCustomer.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression title;
    public final StringExpression firstName;
    public final StringExpression lastName;
    public final StringExpression atPath;
    public final StringExpression rendered;
    public final ObjectExpression<java.lang.String[]> PROPERTY_NAMES;
    public final ObjectExpression<org.incode.module.docfragment.dom.api.DocFragmentService> docFragmentService;

    public QDemoCustomer(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.title = new StringExpressionImpl(this, "title");
        this.firstName = new StringExpressionImpl(this, "firstName");
        this.lastName = new StringExpressionImpl(this, "lastName");
        this.atPath = new StringExpressionImpl(this, "atPath");
        this.rendered = new StringExpressionImpl(this, "rendered");
        this.PROPERTY_NAMES = new ObjectExpressionImpl<java.lang.String[]>(this, "PROPERTY_NAMES");
        this.docFragmentService = new ObjectExpressionImpl<org.incode.module.docfragment.dom.api.DocFragmentService>(this, "docFragmentService");
    }

    public QDemoCustomer(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.title = new StringExpressionImpl(this, "title");
        this.firstName = new StringExpressionImpl(this, "firstName");
        this.lastName = new StringExpressionImpl(this, "lastName");
        this.atPath = new StringExpressionImpl(this, "atPath");
        this.rendered = new StringExpressionImpl(this, "rendered");
        this.PROPERTY_NAMES = new ObjectExpressionImpl<java.lang.String[]>(this, "PROPERTY_NAMES");
        this.docFragmentService = new ObjectExpressionImpl<org.incode.module.docfragment.dom.api.DocFragmentService>(this, "docFragmentService");
    }
}
