package org.incode.domainapp.example.dom.spi.security.dom.demo.tenanted;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTenantedEntity extends PersistableExpressionImpl<TenantedEntity> implements PersistableExpression<TenantedEntity>
{
    public static final QTenantedEntity jdoCandidate = candidate("this");

    public static QTenantedEntity candidate(String name)
    {
        return new QTenantedEntity(null, name, 5);
    }

    public static QTenantedEntity candidate()
    {
        return jdoCandidate;
    }

    public static QTenantedEntity parameter(String name)
    {
        return new QTenantedEntity(TenantedEntity.class, name, ExpressionType.PARAMETER);
    }

    public static QTenantedEntity variable(String name)
    {
        return new QTenantedEntity(TenantedEntity.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> MAX_LENGTH_NAME;
    public final NumericExpression<Integer> MAX_LENGTH_DESCRIPTION;
    public final StringExpression name;
    public final StringExpression description;
    public final StringExpression atPath;

    public QTenantedEntity(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.MAX_LENGTH_NAME = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_NAME");
        this.MAX_LENGTH_DESCRIPTION = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_DESCRIPTION");
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
        this.atPath = new StringExpressionImpl(this, "atPath");
    }

    public QTenantedEntity(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.MAX_LENGTH_NAME = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_NAME");
        this.MAX_LENGTH_DESCRIPTION = new NumericExpressionImpl<Integer>(this, "MAX_LENGTH_DESCRIPTION");
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
        this.atPath = new StringExpressionImpl(this, "atPath");
    }
}
