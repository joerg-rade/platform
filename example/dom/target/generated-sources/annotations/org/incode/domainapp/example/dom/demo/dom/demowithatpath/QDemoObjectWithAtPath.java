package org.incode.domainapp.example.dom.demo.dom.demowithatpath;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoObjectWithAtPath extends PersistableExpressionImpl<DemoObjectWithAtPath> implements PersistableExpression<DemoObjectWithAtPath>
{
    public static final QDemoObjectWithAtPath jdoCandidate = candidate("this");

    public static QDemoObjectWithAtPath candidate(String name)
    {
        return new QDemoObjectWithAtPath(null, name, 5);
    }

    public static QDemoObjectWithAtPath candidate()
    {
        return jdoCandidate;
    }

    public static QDemoObjectWithAtPath parameter(String name)
    {
        return new QDemoObjectWithAtPath(DemoObjectWithAtPath.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoObjectWithAtPath variable(String name)
    {
        return new QDemoObjectWithAtPath(DemoObjectWithAtPath.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression atPath;

    public QDemoObjectWithAtPath(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.atPath = new StringExpressionImpl(this, "atPath");
    }

    public QDemoObjectWithAtPath(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.atPath = new StringExpressionImpl(this, "atPath");
    }
}
