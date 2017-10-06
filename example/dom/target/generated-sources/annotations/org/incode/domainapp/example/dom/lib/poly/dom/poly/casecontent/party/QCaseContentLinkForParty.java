package org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.party;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCaseContentLinkForParty extends org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.QCaseContentLink
{
    public static final QCaseContentLinkForParty jdoCandidate = candidate("this");

    public static QCaseContentLinkForParty candidate(String name)
    {
        return new QCaseContentLinkForParty(null, name, 5);
    }

    public static QCaseContentLinkForParty candidate()
    {
        return jdoCandidate;
    }

    public static QCaseContentLinkForParty parameter(String name)
    {
        return new QCaseContentLinkForParty(CaseContentLinkForParty.class, name, ExpressionType.PARAMETER);
    }

    public static QCaseContentLinkForParty variable(String name)
    {
        return new QCaseContentLinkForParty(CaseContentLinkForParty.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty party;
    public final ObjectExpression<org.apache.isis.applib.services.bookmark.BookmarkService> bookmarkService;

    public QCaseContentLinkForParty(PersistableExpression parent, String name, int depth)
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

    public QCaseContentLinkForParty(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.party = new org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty(this, "party", 5);
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }
}
