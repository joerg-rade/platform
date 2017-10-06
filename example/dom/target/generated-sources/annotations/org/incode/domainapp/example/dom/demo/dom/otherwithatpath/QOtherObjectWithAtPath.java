package org.incode.domainapp.example.dom.demo.dom.otherwithatpath;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QOtherObjectWithAtPath extends PersistableExpressionImpl<OtherObjectWithAtPath> implements PersistableExpression<OtherObjectWithAtPath>
{
    public static final QOtherObjectWithAtPath jdoCandidate = candidate("this");

    public static QOtherObjectWithAtPath candidate(String name)
    {
        return new QOtherObjectWithAtPath(null, name, 5);
    }

    public static QOtherObjectWithAtPath candidate()
    {
        return jdoCandidate;
    }

    public static QOtherObjectWithAtPath parameter(String name)
    {
        return new QOtherObjectWithAtPath(OtherObjectWithAtPath.class, name, ExpressionType.PARAMETER);
    }

    public static QOtherObjectWithAtPath variable(String name)
    {
        return new QOtherObjectWithAtPath(OtherObjectWithAtPath.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression atPath;

    public QOtherObjectWithAtPath(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.atPath = new StringExpressionImpl(this, "atPath");
    }

    public QOtherObjectWithAtPath(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.atPath = new StringExpressionImpl(this, "atPath");
    }
}
