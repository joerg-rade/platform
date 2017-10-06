package org.incode.domainapp.example.dom.dom.classification.dom.classification.demowithatpath;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QClassificationForDemoObjectWithAtPath extends org.incode.module.classification.dom.impl.classification.QClassification
{
    public static final QClassificationForDemoObjectWithAtPath jdoCandidate = candidate("this");

    public static QClassificationForDemoObjectWithAtPath candidate(String name)
    {
        return new QClassificationForDemoObjectWithAtPath(null, name, 5);
    }

    public static QClassificationForDemoObjectWithAtPath candidate()
    {
        return jdoCandidate;
    }

    public static QClassificationForDemoObjectWithAtPath parameter(String name)
    {
        return new QClassificationForDemoObjectWithAtPath(ClassificationForDemoObjectWithAtPath.class, name, ExpressionType.PARAMETER);
    }

    public static QClassificationForDemoObjectWithAtPath variable(String name)
    {
        return new QClassificationForDemoObjectWithAtPath(ClassificationForDemoObjectWithAtPath.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.demowithatpath.QDemoObjectWithAtPath demoObject;

    public QClassificationForDemoObjectWithAtPath(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demowithatpath.QDemoObjectWithAtPath(this, "demoObject", depth-1);
        }
        else
        {
            this.demoObject = null;
        }
    }

    public QClassificationForDemoObjectWithAtPath(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demowithatpath.QDemoObjectWithAtPath(this, "demoObject", 5);
    }
}
