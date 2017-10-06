package org.incode.domainapp.example.dom.dom.alias.dom;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAliasForDemoObject extends org.incode.module.alias.dom.impl.QAlias
{
    public static final QAliasForDemoObject jdoCandidate = candidate("this");

    public static QAliasForDemoObject candidate(String name)
    {
        return new QAliasForDemoObject(null, name, 5);
    }

    public static QAliasForDemoObject candidate()
    {
        return jdoCandidate;
    }

    public static QAliasForDemoObject parameter(String name)
    {
        return new QAliasForDemoObject(AliasForDemoObject.class, name, ExpressionType.PARAMETER);
    }

    public static QAliasForDemoObject variable(String name)
    {
        return new QAliasForDemoObject(AliasForDemoObject.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject demoObject;

    public QAliasForDemoObject(PersistableExpression parent, String name, int depth)
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

    public QAliasForDemoObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demo.QDemoObject(this, "demoObject", 5);
    }
}
