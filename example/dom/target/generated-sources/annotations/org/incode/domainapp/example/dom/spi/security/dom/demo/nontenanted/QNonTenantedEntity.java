package org.incode.domainapp.example.dom.spi.security.dom.demo.nontenanted;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QNonTenantedEntity extends PersistableExpressionImpl<NonTenantedEntity> implements PersistableExpression<NonTenantedEntity>
{
    public static final QNonTenantedEntity jdoCandidate = candidate("this");

    public static QNonTenantedEntity candidate(String name)
    {
        return new QNonTenantedEntity(null, name, 5);
    }

    public static QNonTenantedEntity candidate()
    {
        return jdoCandidate;
    }

    public static QNonTenantedEntity parameter(String name)
    {
        return new QNonTenantedEntity(NonTenantedEntity.class, name, ExpressionType.PARAMETER);
    }

    public static QNonTenantedEntity variable(String name)
    {
        return new QNonTenantedEntity(NonTenantedEntity.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> MAX_LENGTH_NAME;
    public final NumericExpression<Integer> MAX_LENGTH_DESCRIPTION;
    public final StringExpression name;
    public final StringExpression description;

    public QNonTenantedEntity(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.MAX_LENGTH_NAME = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_NAME");
        this.MAX_LENGTH_DESCRIPTION = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_DESCRIPTION");
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
    }

    public QNonTenantedEntity(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.MAX_LENGTH_NAME = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_NAME");
        this.MAX_LENGTH_DESCRIPTION = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_DESCRIPTION");
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
    }
}
