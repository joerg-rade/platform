package org.incode.domainapp.example.dom.demo.dom.demowithnotes;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoObjectWithNotes extends PersistableExpressionImpl<DemoObjectWithNotes> implements PersistableExpression<DemoObjectWithNotes>
{
    public static final QDemoObjectWithNotes jdoCandidate = candidate("this");

    public static QDemoObjectWithNotes candidate(String name)
    {
        return new QDemoObjectWithNotes(null, name, 5);
    }

    public static QDemoObjectWithNotes candidate()
    {
        return jdoCandidate;
    }

    public static QDemoObjectWithNotes parameter(String name)
    {
        return new QDemoObjectWithNotes(DemoObjectWithNotes.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoObjectWithNotes variable(String name)
    {
        return new QDemoObjectWithNotes(DemoObjectWithNotes.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression notes;

    public QDemoObjectWithNotes(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }

    public QDemoObjectWithNotes(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }
}
