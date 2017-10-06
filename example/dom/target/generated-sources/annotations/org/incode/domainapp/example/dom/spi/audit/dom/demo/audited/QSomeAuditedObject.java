package org.incode.domainapp.example.dom.spi.audit.dom.demo.audited;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QSomeAuditedObject extends PersistableExpressionImpl<SomeAuditedObject> implements PersistableExpression<SomeAuditedObject>
{
    public static final QSomeAuditedObject jdoCandidate = candidate("this");

    public static QSomeAuditedObject candidate(String name)
    {
        return new QSomeAuditedObject(null, name, 5);
    }

    public static QSomeAuditedObject candidate()
    {
        return jdoCandidate;
    }

    public static QSomeAuditedObject parameter(String name)
    {
        return new QSomeAuditedObject(SomeAuditedObject.class, name, ExpressionType.PARAMETER);
    }

    public static QSomeAuditedObject variable(String name)
    {
        return new QSomeAuditedObject(SomeAuditedObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final ObjectExpression<java.lang.Integer> number;

    public QSomeAuditedObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.number = new ObjectExpressionImpl<java.lang.Integer>(this, "number");
    }

    public QSomeAuditedObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.number = new ObjectExpressionImpl<java.lang.Integer>(this, "number");
    }
}
