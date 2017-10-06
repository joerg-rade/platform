package org.incode.domainapp.example.dom.lib.poly.dom.demofixedasset;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QFixedAsset extends PersistableExpressionImpl<FixedAsset> implements PersistableExpression<FixedAsset>
{
    public static final QFixedAsset jdoCandidate = candidate("this");

    public static QFixedAsset candidate(String name)
    {
        return new QFixedAsset(null, name, 5);
    }

    public static QFixedAsset candidate()
    {
        return jdoCandidate;
    }

    public static QFixedAsset parameter(String name)
    {
        return new QFixedAsset(FixedAsset.class, name, ExpressionType.PARAMETER);
    }

    public static QFixedAsset variable(String name)
    {
        return new QFixedAsset(FixedAsset.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;
    public final ObjectExpression<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks> communicationChannelOwnerLinks;

    public QFixedAsset(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.communicationChannelOwnerLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks>(this, "communicationChannelOwnerLinks");
    }

    public QFixedAsset(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.communicationChannelOwnerLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.ccowner.CommunicationChannelOwnerLinks>(this, "communicationChannelOwnerLinks");
    }
}
