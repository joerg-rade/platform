package org.incode.domainapp.example.dom.dom.classification.dom.classification.otherwithatpath;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QClassificationForOtherObjectWithAtPath extends org.incode.module.classification.dom.impl.classification.QClassification
{
    public static final QClassificationForOtherObjectWithAtPath jdoCandidate = candidate("this");

    public static QClassificationForOtherObjectWithAtPath candidate(String name)
    {
        return new QClassificationForOtherObjectWithAtPath(null, name, 5);
    }

    public static QClassificationForOtherObjectWithAtPath candidate()
    {
        return jdoCandidate;
    }

    public static QClassificationForOtherObjectWithAtPath parameter(String name)
    {
        return new QClassificationForOtherObjectWithAtPath(ClassificationForOtherObjectWithAtPath.class, name, ExpressionType.PARAMETER);
    }

    public static QClassificationForOtherObjectWithAtPath variable(String name)
    {
        return new QClassificationForOtherObjectWithAtPath(ClassificationForOtherObjectWithAtPath.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.otherwithatpath.QOtherObjectWithAtPath otherObject;

    public QClassificationForOtherObjectWithAtPath(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.otherObject = new org.incode.domainapp.example.dom.demo.dom.otherwithatpath.QOtherObjectWithAtPath(this, "otherObject", depth-1);
        }
        else
        {
            this.otherObject = null;
        }
    }

    public QClassificationForOtherObjectWithAtPath(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.otherObject = new org.incode.domainapp.example.dom.demo.dom.otherwithatpath.QOtherObjectWithAtPath(this, "otherObject", 5);
    }
}
