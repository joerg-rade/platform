package org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.party;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCommunicationChannelOwnerLinkForParty extends org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.QCommunicationChannelOwnerLink
{
    public static final QCommunicationChannelOwnerLinkForParty jdoCandidate = candidate("this");

    public static QCommunicationChannelOwnerLinkForParty candidate(String name)
    {
        return new QCommunicationChannelOwnerLinkForParty(null, name, 5);
    }

    public static QCommunicationChannelOwnerLinkForParty candidate()
    {
        return jdoCandidate;
    }

    public static QCommunicationChannelOwnerLinkForParty parameter(String name)
    {
        return new QCommunicationChannelOwnerLinkForParty(CommunicationChannelOwnerLinkForParty.class, name, ExpressionType.PARAMETER);
    }

    public static QCommunicationChannelOwnerLinkForParty variable(String name)
    {
        return new QCommunicationChannelOwnerLinkForParty(CommunicationChannelOwnerLinkForParty.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty party;
    public final ObjectExpression<org.apache.isis.applib.services.bookmark.BookmarkService> bookmarkService;

    public QCommunicationChannelOwnerLinkForParty(PersistableExpression parent, String name, int depth)
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

    public QCommunicationChannelOwnerLinkForParty(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.party = new org.incode.domainapp.example.dom.lib.poly.dom.demoparty.QParty(this, "party", 5);
        this.bookmarkService = new ObjectExpressionImpl<org.apache.isis.applib.services.bookmark.BookmarkService>(this, "bookmarkService");
    }
}
