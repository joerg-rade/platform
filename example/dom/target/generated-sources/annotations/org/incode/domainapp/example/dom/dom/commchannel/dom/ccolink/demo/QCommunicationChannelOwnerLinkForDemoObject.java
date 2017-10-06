package org.incode.domainapp.example.dom.dom.commchannel.dom.ccolink.demo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCommunicationChannelOwnerLinkForDemoObject extends org.incode.module.commchannel.dom.impl.ownerlink.QCommunicationChannelOwnerLink
{
    public static final QCommunicationChannelOwnerLinkForDemoObject jdoCandidate = candidate("this");

    public static QCommunicationChannelOwnerLinkForDemoObject candidate(String name)
    {
        return new QCommunicationChannelOwnerLinkForDemoObject(null, name, 5);
    }

    public static QCommunicationChannelOwnerLinkForDemoObject candidate()
    {
        return jdoCandidate;
    }

    public static QCommunicationChannelOwnerLinkForDemoObject parameter(String name)
    {
        return new QCommunicationChannelOwnerLinkForDemoObject(CommunicationChannelOwnerLinkForDemoObject.class, name, ExpressionType.PARAMETER);
    }

    public static QCommunicationChannelOwnerLinkForDemoObject variable(String name)
    {
        return new QCommunicationChannelOwnerLinkForDemoObject(CommunicationChannelOwnerLinkForDemoObject.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject demoObject;

    public QCommunicationChannelOwnerLinkForDemoObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject(this, "demoObject", depth-1);
        }
        else
        {
            this.demoObject = null;
        }
    }

    public QCommunicationChannelOwnerLinkForDemoObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject(this, "demoObject", 5);
    }
}
