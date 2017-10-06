package org.incode.domainapp.example.dom.demo.dom.demo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoObject extends PersistableExpressionImpl<DemoObject> implements PersistableExpression<DemoObject>
{
    public static final QDemoObject jdoCandidate = candidate("this");

    public static QDemoObject candidate(String name)
    {
        return new QDemoObject(null, name, 5);
    }

    public static QDemoObject candidate()
    {
        return jdoCandidate;
    }

    public static QDemoObject parameter(String name)
    {
        return new QDemoObject(DemoObject.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoObject variable(String name)
    {
        return new QDemoObject(DemoObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;

    public QDemoObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
    }

    public QDemoObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
    }
}
