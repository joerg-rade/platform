package org.incode.domainapp.example.dom.lib.poly.dom.poly.caseprimary.fixedasset;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCasePrimaryContentLinkForFixedAsset extends org.incode.domainapp.example.dom.lib.poly.dom.poly.caseprimary.QCasePrimaryContentLink
{
    public static final QCasePrimaryContentLinkForFixedAsset jdoCandidate = candidate("this");

    public static QCasePrimaryContentLinkForFixedAsset candidate(String name)
    {
        return new QCasePrimaryContentLinkForFixedAsset(null, name, 5);
    }

    public static QCasePrimaryContentLinkForFixedAsset candidate()
    {
        return jdoCandidate;
    }

    public static QCasePrimaryContentLinkForFixedAsset parameter(String name)
    {
        return new QCasePrimaryContentLinkForFixedAsset(CasePrimaryContentLinkForFixedAsset.class, name, ExpressionType.PARAMETER);
    }

    public static QCasePrimaryContentLinkForFixedAsset variable(String name)
    {
        return new QCasePrimaryContentLinkForFixedAsset(CasePrimaryContentLinkForFixedAsset.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset fixedAsset;
    public final ObjectExpression<org.apache.isis.applib.services.bookmark.BookmarkService> bookmarkService;

    public QCasePrimaryContentLinkForFixedAsset(PersistableExpression parent, String name, int depth)
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

    public QCasePrimaryContentLinkForFixedAsset(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.fixedAsset = new org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset(this, "fixedAsset", 5);
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }
}
