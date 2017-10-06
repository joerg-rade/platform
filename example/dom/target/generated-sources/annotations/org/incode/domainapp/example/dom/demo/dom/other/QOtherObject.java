package org.incode.domainapp.example.dom.demo.dom.other;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QOtherObject extends PersistableExpressionImpl<OtherObject> implements PersistableExpression<OtherObject>
{
    public static final QOtherObject jdoCandidate = candidate("this");

    public static QOtherObject candidate(String name)
    {
        return new QOtherObject(null, name, 5);
    }

    public static QOtherObject candidate()
    {
        return jdoCandidate;
    }

    public static QOtherObject parameter(String name)
    {
        return new QOtherObject(OtherObject.class, name, ExpressionType.PARAMETER);
    }

    public static QOtherObject variable(String name)
    {
        return new QOtherObject(OtherObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;

    public QOtherObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
    }

    public QOtherObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
    }
}
