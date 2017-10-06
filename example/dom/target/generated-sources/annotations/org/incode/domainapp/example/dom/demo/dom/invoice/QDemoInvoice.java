package org.incode.domainapp.example.dom.demo.dom.invoice;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoInvoice extends PersistableExpressionImpl<DemoInvoice> implements PersistableExpression<DemoInvoice>
{
    public static final QDemoInvoice jdoCandidate = candidate("this");

    public static QDemoInvoice candidate(String name)
    {
        return new QDemoInvoice(null, name, 5);
    }

    public static QDemoInvoice candidate()
    {
        return jdoCandidate;
    }

    public static QDemoInvoice parameter(String name)
    {
        return new QDemoInvoice(DemoInvoice.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoInvoice variable(String name)
    {
        return new QDemoInvoice(DemoInvoice.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression num;
    public final org.incode.domainapp.example.dom.demo.dom.demowithnotes.QDemoObjectWithNotes customer;

    public QDemoInvoice(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.num = new StringExpressionImpl(this, "num");
        if (depth > 0)
        {
            this.customer = new org.incode.domainapp.example.dom.demo.dom.demowithnotes.QDemoObjectWithNotes(this, "customer", depth-1);
        }
        else
        {
            this.customer = null;
        }
    }

    public QDemoInvoice(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.num = new StringExpressionImpl(this, "num");
        this.customer = new org.incode.domainapp.example.dom.demo.dom.demowithnotes.QDemoObjectWithNotes(this, "customer", 5);
    }
}
