package org.incode.domainapp.example.dom.demo.dom.invoicewithatpath;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoInvoiceWithAtPath extends PersistableExpressionImpl<DemoInvoiceWithAtPath> implements PersistableExpression<DemoInvoiceWithAtPath>
{
    public static final QDemoInvoiceWithAtPath jdoCandidate = candidate("this");

    public static QDemoInvoiceWithAtPath candidate(String name)
    {
        return new QDemoInvoiceWithAtPath(null, name, 5);
    }

    public static QDemoInvoiceWithAtPath candidate()
    {
        return jdoCandidate;
    }

    public static QDemoInvoiceWithAtPath parameter(String name)
    {
        return new QDemoInvoiceWithAtPath(DemoInvoiceWithAtPath.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoInvoiceWithAtPath variable(String name)
    {
        return new QDemoInvoiceWithAtPath(DemoInvoiceWithAtPath.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> num;
    public final ObjectExpression<org.joda.time.LocalDate> dueBy;
    public final NumericExpression<Integer> numDays;
    public final StringExpression atPath;
    public final StringExpression rendered;
    public final ObjectExpression<org.incode.module.docfragment.dom.api.DocFragmentService> docFragmentService;

    public QDemoInvoiceWithAtPath(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.num = new NumericExpressionImpl<Integer>(this, "num");
        this.dueBy = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "dueBy");
        this.numDays = new NumericExpressionImpl<Integer>(this, "numDays");
        this.atPath = new StringExpressionImpl(this, "atPath");
        this.rendered = new StringExpressionImpl(this, "rendered");
        this.docFragmentService = new ObjectExpressionImpl<org.incode.module.docfragment.dom.api.DocFragmentService>(this, "docFragmentService");
    }

    public QDemoInvoiceWithAtPath(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.num = new NumericExpressionImpl<Integer>(this, "num");
        this.dueBy = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "dueBy");
        this.numDays = new NumericExpressionImpl<Integer>(this, "numDays");
        this.atPath = new StringExpressionImpl(this, "atPath");
        this.rendered = new StringExpressionImpl(this, "rendered");
        this.docFragmentService = new ObjectExpressionImpl<org.incode.module.docfragment.dom.api.DocFragmentService>(this, "docFragmentService");
    }
}
