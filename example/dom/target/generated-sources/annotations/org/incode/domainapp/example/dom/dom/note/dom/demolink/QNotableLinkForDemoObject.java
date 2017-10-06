package org.incode.domainapp.example.dom.dom.note.dom.demolink;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QNotableLinkForDemoObject extends org.incode.module.note.dom.impl.notablelink.QNotableLink
{
    public static final QNotableLinkForDemoObject jdoCandidate = candidate("this");

    public static QNotableLinkForDemoObject candidate(String name)
    {
        return new QNotableLinkForDemoObject(null, name, 5);
    }

    public static QNotableLinkForDemoObject candidate()
    {
        return jdoCandidate;
    }

    public static QNotableLinkForDemoObject parameter(String name)
    {
        return new QNotableLinkForDemoObject(NotableLinkForDemoObject.class, name, ExpressionType.PARAMETER);
    }

    public static QNotableLinkForDemoObject variable(String name)
    {
        return new QNotableLinkForDemoObject(NotableLinkForDemoObject.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject demoObject;

    public QNotableLinkForDemoObject(PersistableExpression parent, String name, int depth)
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

    public QNotableLinkForDemoObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject(this, "demoObject", 5);
    }
}
