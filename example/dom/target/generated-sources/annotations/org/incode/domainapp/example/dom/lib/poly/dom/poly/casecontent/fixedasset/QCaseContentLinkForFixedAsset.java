package org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.fixedasset;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCaseContentLinkForFixedAsset extends org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.QCaseContentLink
{
    public static final QCaseContentLinkForFixedAsset jdoCandidate = candidate("this");

    public static QCaseContentLinkForFixedAsset candidate(String name)
    {
        return new QCaseContentLinkForFixedAsset(null, name, 5);
    }

    public static QCaseContentLinkForFixedAsset candidate()
    {
        return jdoCandidate;
    }

    public static QCaseContentLinkForFixedAsset parameter(String name)
    {
        return new QCaseContentLinkForFixedAsset(CaseContentLinkForFixedAsset.class, name, ExpressionType.PARAMETER);
    }

    public static QCaseContentLinkForFixedAsset variable(String name)
    {
        return new QCaseContentLinkForFixedAsset(CaseContentLinkForFixedAsset.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset fixedAsset;
    public final ObjectExpression<org.apache.isis.applib.services.bookmark.BookmarkService> bookmarkService;

    public QCaseContentLinkForFixedAsset(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.fixedAsset = new org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset(this, "fixedAsset", depth-1);
        }
        else
        {
            this.fixedAsset = null;
        }
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }

    public QCaseContentLinkForFixedAsset(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.fixedAsset = new org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset(this, "fixedAsset", 5);
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }
}
