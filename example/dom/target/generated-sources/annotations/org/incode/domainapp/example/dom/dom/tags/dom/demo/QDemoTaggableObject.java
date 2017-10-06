package org.incode.domainapp.example.dom.dom.tags.dom.demo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoTaggableObject extends PersistableExpressionImpl<DemoTaggableObject> implements PersistableExpression<DemoTaggableObject>
{
    public static final QDemoTaggableObject jdoCandidate = candidate("this");

    public static QDemoTaggableObject candidate(String name)
    {
        return new QDemoTaggableObject(null, name, 5);
    }

    public static QDemoTaggableObject candidate()
    {
        return jdoCandidate;
    }

    public static QDemoTaggableObject parameter(String name)
    {
        return new QDemoTaggableObject(DemoTaggableObject.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoTaggableObject variable(String name)
    {
        return new QDemoTaggableObject(DemoTaggableObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression TAG_NAME_BRAND;
    public final StringExpression TAG_NAME_SECTOR;
    public final StringExpression name;
    public final org.isisaddons.module.tags.dom.QTag brandTag;
    public final org.isisaddons.module.tags.dom.QTag sectorTag;
    public final ObjectExpression<org.isisaddons.module.tags.dom.Tags> tags;

    public QDemoTaggableObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.TAG_NAME_BRAND = new StringExpressionImpl(this, "TAG_NAME_BRAND");
        this.TAG_NAME_SECTOR = new StringExpressionImpl(this, "TAG_NAME_SECTOR");
        this.name = new StringExpressionImpl(this, "name");
        if (depth > 0)
        {
            this.brandTag = new org.isisaddons.module.tags.dom.QTag(this, "brandTag", depth-1);
        }
        else
        {
            this.brandTag = null;
        }
        if (depth > 0)
        {
            this.sectorTag = new org.isisaddons.module.tags.dom.QTag(this, "sectorTag", depth-1);
        }
        else
        {
            this.sectorTag = null;
        }
        this.tags = new ObjectExpressionImpl<org.isisaddons.module.tags.dom.Tags>(this, "tags");
    }

    public QDemoTaggableObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.TAG_NAME_BRAND = new StringExpressionImpl(this, "TAG_NAME_BRAND");
        this.TAG_NAME_SECTOR = new StringExpressionImpl(this, "TAG_NAME_SECTOR");
        this.name = new StringExpressionImpl(this, "name");
        this.brandTag = new org.isisaddons.module.tags.dom.QTag(this, "brandTag", 5);
        this.sectorTag = new org.isisaddons.module.tags.dom.QTag(this, "sectorTag", 5);
        this.tags = new ObjectExpressionImpl<org.isisaddons.module.tags.dom.Tags>(this, "tags");
    }
}
