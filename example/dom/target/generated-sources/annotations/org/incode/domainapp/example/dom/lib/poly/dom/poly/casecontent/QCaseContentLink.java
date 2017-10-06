package org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCaseContentLink extends PersistableExpressionImpl<CaseContentLink> implements PersistableExpression<CaseContentLink>
{
    public static final QCaseContentLink jdoCandidate = candidate("this");

    public static QCaseContentLink candidate(String name)
    {
        return new QCaseContentLink(null, name, 5);
    }

    public static QCaseContentLink candidate()
    {
        return jdoCandidate;
    }

    public static QCaseContentLink parameter(String name)
    {
        return new QCaseContentLink(CaseContentLink.class, name, ExpressionType.PARAMETER);
    }

    public static QCaseContentLink variable(String name)
    {
        return new QCaseContentLink(CaseContentLink.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression contentObjectType;
    public final StringExpression contentIdentifier;

    public QCaseContentLink(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.contentObjectType = new StringExpressionImpl(this, "contentObjectType");
        this.contentIdentifier = new StringExpressionImpl(this, "contentIdentifier");
    }

    public QCaseContentLink(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.contentObjectType = new StringExpressionImpl(this, "contentObjectType");
        this.contentIdentifier = new StringExpressionImpl(this, "contentIdentifier");
    }
}
