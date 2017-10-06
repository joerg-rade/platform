package org.incode.domainapp.example.dom.demo.dom.reminder;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoReminder extends PersistableExpressionImpl<DemoReminder> implements PersistableExpression<DemoReminder>
{
    public static final QDemoReminder jdoCandidate = candidate("this");

    public static QDemoReminder candidate(String name)
    {
        return new QDemoReminder(null, name, 5);
    }

    public static QDemoReminder candidate()
    {
        return jdoCandidate;
    }

    public static QDemoReminder parameter(String name)
    {
        return new QDemoReminder(DemoReminder.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoReminder variable(String name)
    {
        return new QDemoReminder(DemoReminder.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression description;
    public final StringExpression documentationPage;

    public QDemoReminder(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.description = new StringExpressionImpl(this, "description");
        this.documentationPage = new StringExpressionImpl(this, "documentationPage");
    }

    public QDemoReminder(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.description = new StringExpressionImpl(this, "description");
        this.documentationPage = new StringExpressionImpl(this, "documentationPage");
    }
}
