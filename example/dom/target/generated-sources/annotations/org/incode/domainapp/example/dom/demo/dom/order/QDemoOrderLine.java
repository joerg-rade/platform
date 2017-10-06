package org.incode.domainapp.example.dom.demo.dom.order;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoOrderLine extends PersistableExpressionImpl<DemoOrderLine> implements PersistableExpression<DemoOrderLine>
{
    public static final QDemoOrderLine jdoCandidate = candidate("this");

    public static QDemoOrderLine candidate(String name)
    {
        return new QDemoOrderLine(null, name, 5);
    }

    public static QDemoOrderLine candidate()
    {
        return jdoCandidate;
    }

    public static QDemoOrderLine parameter(String name)
    {
        return new QDemoOrderLine(DemoOrderLine.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoOrderLine variable(String name)
    {
        return new QDemoOrderLine(DemoOrderLine.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.order.QDemoOrder order;
    public final StringExpression description;
    public final NumericExpression<Integer> quantity;
    public final ObjectExpression<java.math.BigDecimal> cost;

    public QDemoOrderLine(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.order = new org.incode.domainapp.example.dom.demo.dom.order.QDemoOrder(this, "order", depth-1);
        }
        else
        {
            this.order = null;
        }
        this.description = new StringExpressionImpl(this, "description");
        this.quantity = new NumericExpressionImpl<Integer>(this, "quantity");
        this.cost = new ObjectExpressionImpl<java.math.BigDecimal>(this, "cost");
    }

    public QDemoOrderLine(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.order = new org.incode.domainapp.example.dom.demo.dom.order.QDemoOrder(this, "order", 5);
        this.description = new StringExpressionImpl(this, "description");
        this.quantity = new NumericExpressionImpl<Integer>(this, "quantity");
        this.cost = new ObjectExpressionImpl<java.math.BigDecimal>(this, "cost");
    }
}
