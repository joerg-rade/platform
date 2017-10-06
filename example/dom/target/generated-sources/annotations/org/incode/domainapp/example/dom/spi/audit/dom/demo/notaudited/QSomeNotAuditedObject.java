package org.incode.domainapp.example.dom.spi.audit.dom.demo.notaudited;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QSomeNotAuditedObject extends PersistableExpressionImpl<SomeNotAuditedObject> implements PersistableExpression<SomeNotAuditedObject>
{
    public static final QSomeNotAuditedObject jdoCandidate = candidate("this");

    public static QSomeNotAuditedObject candidate(String name)
    {
        return new QSomeNotAuditedObject(null, name, 5);
    }

    public static QSomeNotAuditedObject candidate()
    {
        return jdoCandidate;
    }

    public static QSomeNotAuditedObject parameter(String name)
    {
        return new QSomeNotAuditedObject(SomeNotAuditedObject.class, name, ExpressionType.PARAMETER);
    }

    public static QSomeNotAuditedObject variable(String name)
    {
        return new QSomeNotAuditedObject(SomeNotAuditedObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final ObjectExpression<java.lang.Integer> number;

    public QSomeNotAuditedObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.number = new ObjectExpressionImpl<java.lang.Integer>(this, "number");
    }

    public QSomeNotAuditedObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.number = new ObjectExpressionImpl<java.lang.Integer>(this, "number");
    }
}
