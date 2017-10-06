package org.incode.domainapp.example.dom.lib.poly.dom.democommchannel;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCommunicationChannel extends PersistableExpressionImpl<CommunicationChannel> implements PersistableExpression<CommunicationChannel>
{
    public static final QCommunicationChannel jdoCandidate = candidate("this");

    public static QCommunicationChannel candidate(String name)
    {
        return new QCommunicationChannel(null, name, 5);
    }

    public static QCommunicationChannel candidate()
    {
        return jdoCandidate;
    }

    public static QCommunicationChannel parameter(String name)
    {
        return new QCommunicationChannel(CommunicationChannel.class, name, ExpressionType.PARAMETER);
    }

    public static QCommunicationChannel variable(String name)
    {
        return new QCommunicationChannel(CommunicationChannel.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression details;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;
    public final ObjectExpression<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks> communicationChannelOwnerLinks;

    public QCommunicationChannel(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.details = new StringExpressionImpl(this, "details");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.communicationChannelOwnerLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks>(this, "communicationChannelOwnerLinks");
    }

    public QCommunicationChannel(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.details = new StringExpressionImpl(this, "details");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.communicationChannelOwnerLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks>(this, "communicationChannelOwnerLinks");
    }
}
