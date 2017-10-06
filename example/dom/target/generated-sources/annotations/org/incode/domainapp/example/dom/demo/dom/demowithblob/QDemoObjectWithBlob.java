package org.incode.domainapp.example.dom.demo.dom.demowithblob;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoObjectWithBlob extends PersistableExpressionImpl<DemoObjectWithBlob> implements PersistableExpression<DemoObjectWithBlob>
{
    public static final QDemoObjectWithBlob jdoCandidate = candidate("this");

    public static QDemoObjectWithBlob candidate(String name)
    {
        return new QDemoObjectWithBlob(null, name, 5);
    }

    public static QDemoObjectWithBlob candidate()
    {
        return jdoCandidate;
    }

    public static QDemoObjectWithBlob parameter(String name)
    {
        return new QDemoObjectWithBlob(DemoObjectWithBlob.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoObjectWithBlob variable(String name)
    {
        return new QDemoObjectWithBlob(DemoObjectWithBlob.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression url;
    public final ObjectExpression<org.apache.isis.applib.value.Blob> blob;

    public QDemoObjectWithBlob(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.url = new StringExpressionImpl(this, "url");
        this.blob = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "blob");
    }

    public QDemoObjectWithBlob(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.url = new StringExpressionImpl(this, "url");
        this.blob = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "blob");
    }
}
