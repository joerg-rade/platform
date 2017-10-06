package org.incode.domainapp.example.dom.lib.poly.dom.poly.caseprimary;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCasePrimaryContentLink extends PersistableExpressionImpl<CasePrimaryContentLink> implements PersistableExpression<CasePrimaryContentLink>
{
    public static final QCasePrimaryContentLink jdoCandidate = candidate("this");

    public static QCasePrimaryContentLink candidate(String name)
    {
        return new QCasePrimaryContentLink(null, name, 5);
    }

    public static QCasePrimaryContentLink candidate()
    {
        return jdoCandidate;
    }

    public static QCasePrimaryContentLink parameter(String name)
    {
        return new QCasePrimaryContentLink(CasePrimaryContentLink.class, name, ExpressionType.PARAMETER);
    }

    public static QCasePrimaryContentLink variable(String name)
    {
        return new QCasePrimaryContentLink(CasePrimaryContentLink.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression contentObjectType;
    public final StringExpression contentIdentifier;

    public QCasePrimaryContentLink(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.contentObjectType = new StringExpressionImpl(this, "contentObjectType");
        this.contentIdentifier = new StringExpressionImpl(this, "contentIdentifier");
    }

    public QCasePrimaryContentLink(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.contentObjectType = new StringExpressionImpl(this, "contentObjectType");
        this.contentIdentifier = new StringExpressionImpl(this, "contentIdentifier");
    }
}
