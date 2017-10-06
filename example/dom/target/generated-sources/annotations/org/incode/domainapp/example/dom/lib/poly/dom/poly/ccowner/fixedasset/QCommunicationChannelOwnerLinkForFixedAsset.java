package org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.fixedasset;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCommunicationChannelOwnerLinkForFixedAsset extends org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.QCommunicationChannelOwnerLink
{
    public static final QCommunicationChannelOwnerLinkForFixedAsset jdoCandidate = candidate("this");

    public static QCommunicationChannelOwnerLinkForFixedAsset candidate(String name)
    {
        return new QCommunicationChannelOwnerLinkForFixedAsset(null, name, 5);
    }

    public static QCommunicationChannelOwnerLinkForFixedAsset candidate()
    {
        return jdoCandidate;
    }

    public static QCommunicationChannelOwnerLinkForFixedAsset parameter(String name)
    {
        return new QCommunicationChannelOwnerLinkForFixedAsset(CommunicationChannelOwnerLinkForFixedAsset.class, name, ExpressionType.PARAMETER);
    }

    public static QCommunicationChannelOwnerLinkForFixedAsset variable(String name)
    {
        return new QCommunicationChannelOwnerLinkForFixedAsset(CommunicationChannelOwnerLinkForFixedAsset.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset fixedAsset;
    public final ObjectExpression<org.apache.isis.applib.services.bookmark.BookmarkService> bookmarkService;

    public QCommunicationChannelOwnerLinkForFixedAsset(PersistableExpression parent, String name, int depth)
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

    public QCommunicationChannelOwnerLinkForFixedAsset(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.fixedAsset = new org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset.QFixedAsset(this, "fixedAsset", 5);
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }
}
