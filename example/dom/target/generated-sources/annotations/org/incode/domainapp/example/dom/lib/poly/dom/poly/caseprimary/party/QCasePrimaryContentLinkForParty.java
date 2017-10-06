package org.incode.domainapp.example.dom.lib.poly.dom.poly.caseprimary.party;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCasePrimaryContentLinkForParty extends org.incode.domainapp.example.dom.lib.poly.dom.poly.caseprimary.QCasePrimaryContentLink
{
    public static final QCasePrimaryContentLinkForParty jdoCandidate = candidate("this");

    public static QCasePrimaryContentLinkForParty candidate(String name)
    {
        return new QCasePrimaryContentLinkForParty(null, name, 5);
    }

    public static QCasePrimaryContentLinkForParty candidate()
    {
        return jdoCandidate;
    }

    public static QCasePrimaryContentLinkForParty parameter(String name)
    {
        return new QCasePrimaryContentLinkForParty(CasePrimaryContentLinkForParty.class, name, ExpressionType.PARAMETER);
    }

    public static QCasePrimaryContentLinkForParty variable(String name)
    {
        return new QCasePrimaryContentLinkForParty(CasePrimaryContentLinkForParty.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty party;
    public final ObjectExpression<org.apache.isis.applib.services.bookmark.BookmarkService> bookmarkService;

    public QCasePrimaryContentLinkForParty(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.party = new org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty(this, "party", depth-1);
        }
        else
        {
            this.party = null;
        }
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }

    public QCasePrimaryContentLinkForParty(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.party = new org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty(this, "party", 5);
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }
}
