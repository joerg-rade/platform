package org.incode.domainapp.example.dom.spi.command.dom.demo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QSomeCommandAnnotatedObject extends PersistableExpressionImpl<SomeCommandAnnotatedObject> implements PersistableExpression<SomeCommandAnnotatedObject>
{
    public static final QSomeCommandAnnotatedObject jdoCandidate = candidate("this");

    public static QSomeCommandAnnotatedObject candidate(String name)
    {
        return new QSomeCommandAnnotatedObject(null, name, 5);
    }

    public static QSomeCommandAnnotatedObject candidate()
    {
        return jdoCandidate;
    }

    public static QSomeCommandAnnotatedObject parameter(String name)
    {
        return new QSomeCommandAnnotatedObject(SomeCommandAnnotatedObject.class, name, ExpressionType.PARAMETER);
    }

    public static QSomeCommandAnnotatedObject variable(String name)
    {
        return new QSomeCommandAnnotatedObject(SomeCommandAnnotatedObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression description;
    public final StringExpression addressImplicitlyEditBackground;
    public final ObjectExpression<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour> colour;
    public final ObjectExpression<java.lang.Boolean> flag;
    public final ObjectExpression<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour> copyOfColorUpdatedBySubscribedBackgroundDirectAction;
    public final ObjectExpression<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour> copyOfColorUpdatedBySubscribedBackgroundMixinAction;
    public final ObjectExpression<org.apache.isis.applib.services.background.BackgroundService> backgroundService;

    public QSomeCommandAnnotatedObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
        this.addressImplicitlyEditBackground = new StringExpressionImpl(this, "addressImplicitlyEditBackground");
        this.colour = new ObjectExpressionImpl<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour>(this, "colour");
        this.flag = new ObjectExpressionImpl<java.lang.Boolean>(this, "flag");
        this.copyOfColorUpdatedBySubscribedBackgroundDirectAction = new ObjectExpressionImpl<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour>(this, "copyOfColorUpdatedBySubscribedBackgroundDirectAction");
        this.copyOfColorUpdatedBySubscribedBackgroundMixinAction = new ObjectExpressionImpl<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour>(this, "copyOfColorUpdatedBySubscribedBackgroundMixinAction");
        this.backgroundService = new ObjectExpressionImpl<org.apache.isis.applib.services.background.BackgroundService>(this, "backgroundService");
    }

    public QSomeCommandAnnotatedObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.description = new StringExpressionImpl(this, "description");
        this.addressImplicitlyEditBackground = new StringExpressionImpl(this, "addressImplicitlyEditBackground");
        this.colour = new ObjectExpressionImpl<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour>(this, "colour");
        this.flag = new ObjectExpressionImpl<java.lang.Boolean>(this, "flag");
        this.copyOfColorUpdatedBySubscribedBackgroundDirectAction = new ObjectExpressionImpl<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour>(this, "copyOfColorUpdatedBySubscribedBackgroundDirectAction");
        this.copyOfColorUpdatedBySubscribedBackgroundMixinAction = new ObjectExpressionImpl<org.incode.domainapp.example.dom.spi.command.dom.demo.SomeCommandAnnotatedObject.Colour>(this, "copyOfColorUpdatedBySubscribedBackgroundMixinAction");
        this.backgroundService = new ObjectExpressionImpl<org.apache.isis.applib.services.background.BackgroundService>(this, "backgroundService");
    }
}
