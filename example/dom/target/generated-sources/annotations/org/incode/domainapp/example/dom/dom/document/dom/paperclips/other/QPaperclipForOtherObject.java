package org.incode.domainapp.example.dom.dom.document.dom.paperclips.other;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPaperclipForOtherObject extends org.incode.module.document.dom.impl.paperclips.QPaperclip
{
    public static final QPaperclipForOtherObject jdoCandidate = candidate("this");

    public static QPaperclipForOtherObject candidate(String name)
    {
        return new QPaperclipForOtherObject(null, name, 5);
    }

    public static QPaperclipForOtherObject candidate()
    {
        return jdoCandidate;
    }

    public static QPaperclipForOtherObject parameter(String name)
    {
        return new QPaperclipForOtherObject(PaperclipForOtherObject.class, name, ExpressionType.PARAMETER);
    }

    public static QPaperclipForOtherObject variable(String name)
    {
        return new QPaperclipForOtherObject(PaperclipForOtherObject.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.other.QOtherObject otherObject;

    public QPaperclipForOtherObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.otherObject = new org.incode.domainapp.example.dom.demo.dom.other.QOtherObject(this, "otherObject", depth-1);
        }
        else
        {
            this.otherObject = null;
        }
    }

    public QPaperclipForOtherObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.otherObject = new org.incode.domainapp.example.dom.demo.dom.other.QOtherObject(this, "otherObject", 5);
    }
}
