package org.incode.domainapp.example.dom.dom.document.dom.paperclips.demowithurl;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPaperclipForDemoObjectWithUrl extends org.incode.module.document.dom.impl.paperclips.QPaperclip
{
    public static final QPaperclipForDemoObjectWithUrl jdoCandidate = candidate("this");

    public static QPaperclipForDemoObjectWithUrl candidate(String name)
    {
        return new QPaperclipForDemoObjectWithUrl(null, name, 5);
    }

    public static QPaperclipForDemoObjectWithUrl candidate()
    {
        return jdoCandidate;
    }

    public static QPaperclipForDemoObjectWithUrl parameter(String name)
    {
        return new QPaperclipForDemoObjectWithUrl(PaperclipForDemoObjectWithUrl.class, name, ExpressionType.PARAMETER);
    }

    public static QPaperclipForDemoObjectWithUrl variable(String name)
    {
        return new QPaperclipForDemoObjectWithUrl(PaperclipForDemoObjectWithUrl.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.demowithurl.QDemoObjectWithUrl demoObject;

    public QPaperclipForDemoObjectWithUrl(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demowithurl.QDemoObjectWithUrl(this, "demoObject", depth-1);
        }
        else
        {
            this.demoObject = null;
        }
    }

    public QPaperclipForDemoObjectWithUrl(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoObject = new org.incode.domainapp.example.dom.demo.dom.demowithurl.QDemoObjectWithUrl(this, "demoObject", 5);
    }
}
