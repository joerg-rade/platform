package org.incode.domainapp.example.dom.demo.dom.demowithurl;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoObjectWithUrl extends PersistableExpressionImpl<DemoObjectWithUrl> implements PersistableExpression<DemoObjectWithUrl>
{
    public static final QDemoObjectWithUrl jdoCandidate = candidate("this");

    public static QDemoObjectWithUrl candidate(String name)
    {
        return new QDemoObjectWithUrl(null, name, 5);
    }

    public static QDemoObjectWithUrl candidate()
    {
        return jdoCandidate;
    }

    public static QDemoObjectWithUrl parameter(String name)
    {
        return new QDemoObjectWithUrl(DemoObjectWithUrl.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoObjectWithUrl variable(String name)
    {
        return new QDemoObjectWithUrl(DemoObjectWithUrl.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression url;

    public QDemoObjectWithUrl(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.url = new StringExpressionImpl(this, "url");
    }

    public QDemoObjectWithUrl(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.url = new StringExpressionImpl(this, "url");
    }
}
