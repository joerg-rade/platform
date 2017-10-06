package org.incode.domainapp.example.dom.dom.communications.dom.paperclips;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QPaperclipForDemoInvoice extends org.incode.module.document.dom.impl.paperclips.QPaperclip
{
    public static final QPaperclipForDemoInvoice jdoCandidate = candidate("this");

    public static QPaperclipForDemoInvoice candidate(String name)
    {
        return new QPaperclipForDemoInvoice(null, name, 5);
    }

    public static QPaperclipForDemoInvoice candidate()
    {
        return jdoCandidate;
    }

    public static QPaperclipForDemoInvoice parameter(String name)
    {
        return new QPaperclipForDemoInvoice(PaperclipForDemoInvoice.class, name, ExpressionType.PARAMETER);
    }

    public static QPaperclipForDemoInvoice variable(String name)
    {
        return new QPaperclipForDemoInvoice(PaperclipForDemoInvoice.class, name, ExpressionType.VARIABLE);
    }

    public final org.incode.domainapp.example.dom.demo.dom.invoice.QDemoInvoice demoInvoice;

    public QPaperclipForDemoInvoice(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        if (depth > 0)
        {
            this.demoInvoice = new org.incode.domainapp.example.dom.demo.dom.invoice.QDemoInvoice(this, "demoInvoice", depth-1);
        }
        else
        {
            this.demoInvoice = null;
        }
    }

    public QPaperclipForDemoInvoice(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.demoInvoice = new org.incode.domainapp.example.dom.demo.dom.invoice.QDemoInvoice(this, "demoInvoice", 5);
    }
}
