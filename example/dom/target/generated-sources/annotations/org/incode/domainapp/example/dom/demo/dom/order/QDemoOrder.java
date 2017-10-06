package org.incode.domainapp.example.dom.demo.dom.order;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoOrder extends PersistableExpressionImpl<DemoOrder> implements PersistableExpression<DemoOrder>
{
    public static final QDemoOrder jdoCandidate = candidate("this");

    public static QDemoOrder candidate(String name)
    {
        return new QDemoOrder(null, name, 5);
    }

    public static QDemoOrder candidate()
    {
        return jdoCandidate;
    }

    public static QDemoOrder parameter(String name)
    {
        return new QDemoOrder(DemoOrder.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoOrder variable(String name)
    {
        return new QDemoOrder(DemoOrder.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression number;
    public final StringExpression customerName;
    public final ObjectExpression<org.joda.time.LocalDate> date;
    public final StringExpression preferences;
    public final CollectionExpression orderLines;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;

    public QDemoOrder(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.number = new StringExpressionImpl(this, "number");
        this.customerName = new StringExpressionImpl(this, "customerName");
        this.date = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "date");
        this.preferences = new StringExpressionImpl(this, "preferences");
        this.orderLines = new CollectionExpressionImpl(this, "orderLines");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }

    public QDemoOrder(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.number = new StringExpressionImpl(this, "number");
        this.customerName = new StringExpressionImpl(this, "customerName");
        this.date = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "date");
        this.preferences = new StringExpressionImpl(this, "preferences");
        this.orderLines = new CollectionExpressionImpl(this, "orderLines");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }
}
