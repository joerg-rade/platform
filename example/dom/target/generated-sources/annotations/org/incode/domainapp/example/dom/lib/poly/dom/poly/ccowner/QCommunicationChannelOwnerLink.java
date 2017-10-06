package org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCommunicationChannelOwnerLink extends PersistableExpressionImpl<CommunicationChannelOwnerLink> implements PersistableExpression<CommunicationChannelOwnerLink>
{
    public static final QCommunicationChannelOwnerLink jdoCandidate = candidate("this");

    public static QCommunicationChannelOwnerLink candidate(String name)
    {
        return new QCommunicationChannelOwnerLink(null, name, 5);
    }

    public static QCommunicationChannelOwnerLink candidate()
    {
        return jdoCandidate;
    }

    public static QCommunicationChannelOwnerLink parameter(String name)
    {
        return new QCommunicationChannelOwnerLink(CommunicationChannelOwnerLink.class, name, ExpressionType.PARAMETER);
    }

    public static QCommunicationChannelOwnerLink variable(String name)
    {
        return new QCommunicationChannelOwnerLink(CommunicationChannelOwnerLink.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.lib.poly.dom.democommchannel.QCommunicationChannel communicationChannel;
    public final StringExpression ownerObjectType;
    public final StringExpression ownerIdentifier;

    public QCommunicationChannelOwnerLink(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.communicationChannel = new org.incode.domainapp.example.dom.lib.poly.dom.democommchannel.QCommunicationChannel(this, "communicationChannel", depth-1);
        }
        else
        {
            this.communicationChannel = null;
        }
        this.ownerObjectType = new StringExpressionImpl(this, "ownerObjectType");
        this.ownerIdentifier = new StringExpressionImpl(this, "ownerIdentifier");
    }

    public QCommunicationChannelOwnerLink(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.communicationChannel = new org.incode.domainapp.example.dom.lib.poly.dom.democommchannel.QCommunicationChannel(this, "communicationChannel", 5);
        this.ownerObjectType = new StringExpressionImpl(this, "ownerObjectType");
        this.ownerIdentifier = new StringExpressionImpl(this, "ownerIdentifier");
    }
}
