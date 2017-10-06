package org.incode.domainapp.example.dom.lib.poly.dom.demoparty;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QParty extends PersistableExpressionImpl<Party> implements PersistableExpression<Party>
{
    public static final QParty jdoCandidate = candidate("this");

    public static QParty candidate(String name)
    {
        return new QParty(null, name, 5);
    }

    public static QParty candidate()
    {
        return jdoCandidate;
    }

    public static QParty parameter(String name)
    {
        return new QParty(Party.class, name, ExpressionType.PARAMETER);
    }

    public static QParty variable(String name)
    {
        return new QParty(Party.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;
    public final ObjectExpression<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks> communicationChannelOwnerLinks;

    public QParty(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.communicationChannelOwnerLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks>(this, "communicationChannelOwnerLinks");
    }

    public QParty(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.communicationChannelOwnerLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks>(this, "communicationChannelOwnerLinks");
    }
}
