package org.incode.domainapp.example.dom.dom.communications.dom.commchannels;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCommunicationChannelOwnerLinkForDemoObjectWithNotes extends org.incode.module.communications.dom.impl.commchannel.QCommunicationChannelOwnerLink
{
    public static final QCommunicationChannelOwnerLinkForDemoObjectWithNotes jdoCandidate = candidate("this");

    public static QCommunicationChannelOwnerLinkForDemoObjectWithNotes candidate(String name)
    {
        return new QCommunicationChannelOwnerLinkForDemoObjectWithNotes(null, name, 5);
    }

    public static QCommunicationChannelOwnerLinkForDemoObjectWithNotes candidate()
    {
        return jdoCandidate;
    }

    public static QCommunicationChannelOwnerLinkForDemoObjectWithNotes parameter(String name)
    {
        return new QCommunicationChannelOwnerLinkForDemoObjectWithNotes(CommunicationChannelOwnerLinkForDemoObjectWithNotes.class, name, ExpressionType.PARAMETER);
    }

    public static QCommunicationChannelOwnerLinkForDemoObjectWithNotes variable(String name)
    {
        return new QCommunicationChannelOwnerLinkForDemoObjectWithNotes(CommunicationChannelOwnerLinkForDemoObjectWithNotes.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.demowithnotes.QDemoObjectWithNotes demoCustomer;

    public QCommunicationChannelOwnerLinkForDemoObjectWithNotes(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.demoCustomer = new org.incode.domainapp.example.dom.demo.dom.demowithnotes.QDemoObjectWithNotes(this, "demoCustomer", depth-1);
        }
        else
        {
            this.demoCustomer = null;
        }
    }

    public QCommunicationChannelOwnerLinkForDemoObjectWithNotes(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoCustomer = new org.incode.domainapp.example.dom.demo.dom.demowithnotes.QDemoObjectWithNotes(this, "demoCustomer", 5);
    }
}
