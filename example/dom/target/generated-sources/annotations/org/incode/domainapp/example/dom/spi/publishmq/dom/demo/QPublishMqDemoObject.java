package org.incode.domainapp.example.dom.spi.publishmq.dom.demo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPublishMqDemoObject extends PersistableExpressionImpl<PublishMqDemoObject> implements PersistableExpression<PublishMqDemoObject>
{
    public static final QPublishMqDemoObject jdoCandidate = candidate("this");

    public static QPublishMqDemoObject candidate(String name)
    {
        return new QPublishMqDemoObject(null, name, 5);
    }

    public static QPublishMqDemoObject candidate()
    {
        return jdoCandidate;
    }

    public static QPublishMqDemoObject parameter(String name)
    {
        return new QPublishMqDemoObject(PublishMqDemoObject.class, name, ExpressionType.PARAMETER);
    }

    public static QPublishMqDemoObject variable(String name)
    {
        return new QPublishMqDemoObject(PublishMqDemoObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression description;
    public final ObjectExpression<java.lang.Integer> count;
    public final ObjectExpression<org.apache.isis.applib.services.wrapper.WrapperFactory> wrapperFactory;

    public QPublishMqDemoObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
        this.count = new ObjectExpressionImpl<java.lang.Integer>(this, "count");
        this.wrapperFactory = new ObjectExpressionImpl<org.apache.isis.applib.services.wrapper.WrapperFactory>(this, "wrapperFactory");
    }

    public QPublishMqDemoObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
        this.count = new ObjectExpressionImpl<java.lang.Integer>(this, "count");
        this.wrapperFactory = new ObjectExpressionImpl<org.apache.isis.applib.services.wrapper.WrapperFactory>(this, "wrapperFactory");
    }
}
