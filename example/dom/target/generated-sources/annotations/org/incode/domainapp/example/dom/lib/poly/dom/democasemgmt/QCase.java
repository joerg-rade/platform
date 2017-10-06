package org.incode.domainapp.example.dom.lib.poly.dom.democasemgmt;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCase extends PersistableExpressionImpl<Case> implements PersistableExpression<Case>
{
    public static final QCase jdoCandidate = candidate("this");

    public static QCase candidate(String name)
    {
        return new QCase(null, name, 5);
    }

    public static QCase candidate()
    {
        return jdoCandidate;
    }

    public static QCase parameter(String name)
    {
        return new QCase(Case.class, name, ExpressionType.PARAMETER);
    }

    public static QCase variable(String name)
    {
        return new QCase(Case.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;
    public final ObjectExpression<org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.CaseContentLinks> caseContentLinks;

    public QCase(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.caseContentLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.CaseContentLinks>(this, "caseContentLinks");
    }

    public QCase(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.caseContentLinks = new ObjectExpressionImpl<org.incode.domainapp.example.dom.lib.poly.dom.poly.casecontent.CaseContentLinks>(this, "caseContentLinks");
    }
}
