package org.incode.domainapp.example.dom.demo.dom.todo;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoToDoItem extends PersistableExpressionImpl<DemoToDoItem> implements PersistableExpression<DemoToDoItem>
{
    public static final QDemoToDoItem jdoCandidate = candidate("this");

    public static QDemoToDoItem candidate(String name)
    {
        return new QDemoToDoItem(null, name, 5);
    }

    public static QDemoToDoItem candidate()
    {
        return jdoCandidate;
    }

    public static QDemoToDoItem parameter(String name)
    {
        return new QDemoToDoItem(DemoToDoItem.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoToDoItem variable(String name)
    {
        return new QDemoToDoItem(DemoToDoItem.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression description;
    public final ObjectExpression<org.joda.time.LocalDate> dueBy;
    public final ObjectExpression<org.incode.domainapp.example.dom.demo.dom.todo.Category> category;
    public final ObjectExpression<org.incode.domainapp.example.dom.demo.dom.todo.Subcategory> subcategory;
    public final StringExpression ownedBy;
    public final BooleanExpression complete;
    public final ObjectExpression<java.math.BigDecimal> cost;
    public final ObjectExpression<java.math.BigDecimal> previousCost;
    public final StringExpression notes;
    public final ObjectExpression<org.apache.isis.applib.value.Blob> attachment;
    public final CollectionExpression dependencies;
    public final ObjectExpression<java.lang.Double> locationLatitude;
    public final ObjectExpression<java.lang.Double> locationLongitude;
    public final NumericExpression<Long> ONE_WEEK_IN_MILLIS;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;
    public final ObjectExpression<org.incode.domainapp.example.dom.demo.dom.todo.DemoToDoItemMenu> toDoItems;
    public final ObjectExpression<org.isisaddons.module.excel.dom.ExcelService> excelService;
    public final ObjectExpression<org.isisaddons.wicket.gmap3.cpt.service.LocationLookupService> locationLookupService;

    public QDemoToDoItem(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.description = new StringExpressionImpl(this, "description");
        this.dueBy = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "dueBy");
        this.category = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.todo.Category>(this, "category");
        this.subcategory = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.todo.Subcategory>(this, "subcategory");
        this.ownedBy = new StringExpressionImpl(this, "ownedBy");
        this.complete = new BooleanExpressionImpl(this, "complete");
        this.cost = new ObjectExpressionImpl<java.math.BigDecimal>(this, "cost");
        this.previousCost = new ObjectExpressionImpl<java.math.BigDecimal>(this, "previousCost");
        this.notes = new StringExpressionImpl(this, "notes");
        this.attachment = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "attachment");
        this.dependencies = new CollectionExpressionImpl(this, "dependencies");
        this.locationLatitude = new ObjectExpressionImpl<java.lang.Double>(this, "locationLatitude");
        this.locationLongitude = new ObjectExpressionImpl<java.lang.Double>(this, "locationLongitude");
        this.ONE_WEEK_IN_MILLIS = new NumericExpressionImpl<Long>(this, "ONE_WEEK_IN_MILLIS");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.toDoItems = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.todo.DemoToDoItemMenu>(this, "toDoItems");
        this.excelService = new ObjectExpressionImpl<org.isisaddons.module.excel.dom.ExcelService>(this, "excelService");
        this.locationLookupService = new ObjectExpressionImpl<org.isisaddons.wicket.gmap3.cpt.service.LocationLookupService>(this, "locationLookupService");
    }

    public QDemoToDoItem(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.description = new StringExpressionImpl(this, "description");
        this.dueBy = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "dueBy");
        this.category = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.todo.Category>(this, "category");
        this.subcategory = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.todo.Subcategory>(this, "subcategory");
        this.ownedBy = new StringExpressionImpl(this, "ownedBy");
        this.complete = new BooleanExpressionImpl(this, "complete");
        this.cost = new ObjectExpressionImpl<java.math.BigDecimal>(this, "cost");
        this.previousCost = new ObjectExpressionImpl<java.math.BigDecimal>(this, "previousCost");
        this.notes = new StringExpressionImpl(this, "notes");
        this.attachment = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "attachment");
        this.dependencies = new CollectionExpressionImpl(this, "dependencies");
        this.locationLatitude = new ObjectExpressionImpl<java.lang.Double>(this, "locationLatitude");
        this.locationLongitude = new ObjectExpressionImpl<java.lang.Double>(this, "locationLongitude");
        this.ONE_WEEK_IN_MILLIS = new NumericExpressionImpl<Long>(this, "ONE_WEEK_IN_MILLIS");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
        this.toDoItems = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.todo.DemoToDoItemMenu>(this, "toDoItems");
        this.excelService = new ObjectExpressionImpl<org.isisaddons.module.excel.dom.ExcelService>(this, "excelService");
        this.locationLookupService = new ObjectExpressionImpl<org.isisaddons.wicket.gmap3.cpt.service.LocationLookupService>(this, "locationLookupService");
    }
}
