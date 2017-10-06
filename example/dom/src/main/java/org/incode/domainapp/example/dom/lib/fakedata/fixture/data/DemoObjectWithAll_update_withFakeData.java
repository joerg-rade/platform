package org.incode.domainapp.example.dom.lib.fakedata.fixture.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import org.apache.isis.applib.annotation.Programmatic;
import org.apache.isis.applib.fixturescripts.FixtureScript;
import org.apache.isis.applib.value.Blob;
import org.apache.isis.applib.value.Clob;
import org.apache.isis.applib.value.Money;
import org.apache.isis.applib.value.Password;

import org.isisaddons.module.fakedata.dom.FakeDataService;

import org.incode.domainapp.example.dom.demo.dom.demowithall.DemoObjectWithAll;
import org.incode.domainapp.example.dom.demo.dom.demowithall.EnumOf3;

import lombok.Getter;
import lombok.Setter;

public class DemoObjectWithAll_update_withFakeData extends FixtureScript {


    @Getter(onMethod = @__( @Programmatic )) @Setter
    private DemoObjectWithAll fakeDataDemoObject;

    @Getter(onMethod = @__( @Programmatic)) @Setter
    private String name;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Boolean someBoolean;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Character someChar;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Byte someByte;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Short someShort;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Integer someInt;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Long someLong;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Float someFloat;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Double someDouble;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private String someString;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Password somePassword;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Blob someBlob;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Clob someClob;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Date someJavaUtilDate;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private java.sql.Date someJavaSqlDate;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private LocalDate someJodaLocalDate;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private DateTime someJodaDateTime;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Timestamp someJavaSqlTimestamp;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private BigInteger someBigInteger;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private BigDecimal someBigDecimal;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private URL someUrl;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private UUID someUuid;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private Money someMoney;

    @Getter(onMethod = @__( @Programmatic )) @Setter
    private EnumOf3 someEnumOf3;


    @Override
    protected void execute(final ExecutionContext executionContext) {

        // mandatory
        this.checkParam("fakeDataDemoObject", executionContext, DemoObjectWithAll.class);

        // defaults
        this.defaultParam("someBoolean", executionContext, fakeDataService.booleans().any());
        this.defaultParam("someChar", executionContext, fakeDataService.chars().any());
        this.defaultParam("someByte", executionContext, fakeDataService.bytes().any());
        this.defaultParam("someShort", executionContext, fakeDataService.shorts().any());
        this.defaultParam("someInt", executionContext, fakeDataService.ints().any());
        this.defaultParam("someLong", executionContext, fakeDataService.longs().any());
        this.defaultParam("someFloat", executionContext, fakeDataService.floats().any());
        this.defaultParam("someDouble", executionContext, fakeDataService.doubles().any());

        this.defaultParam("someString", executionContext, fakeDataService.lorem().sentence());
        this.defaultParam("somePassword", executionContext, fakeDataService.isisPasswords().any());

        this.defaultParam("someBlob", executionContext, fakeDataService.isisBlobs().any());
        this.defaultParam("someClob", executionContext, fakeDataService.isisClobs().any());

        this.defaultParam("someJavaUtilDate", executionContext, fakeDataService.javaUtilDates().any());
        this.defaultParam("someJavaSqlDate", executionContext, fakeDataService.javaSqlDates().any());
        this.defaultParam("someJodaLocalDate", executionContext, fakeDataService.jodaLocalDates().any());
        this.defaultParam("someJodaDateTime", executionContext, fakeDataService.jodaDateTimes().any());
        this.defaultParam("someJavaSqlTimestamp", executionContext, fakeDataService.javaSqlTimestamps().any());

        this.defaultParam("someBigDecimal", executionContext, fakeDataService.bigDecimals().any(14,4));
        this.defaultParam("someBigInteger", executionContext, fakeDataService.bigIntegers().any());

        this.defaultParam("someUrl", executionContext, fakeDataService.urls().any());
        this.defaultParam("someUuid", executionContext, fakeDataService.uuids().any());
        this.defaultParam("someMoney", executionContext, fakeDataService.isisMoneys().any());
        this.defaultParam("someEnumOf3", executionContext, fakeDataService.enums().anyOf(EnumOf3.class));

        // updates
        final DemoObjectWithAll fakeDataDemoObject = getFakeDataDemoObject();
        
        wrap(fakeDataDemoObject).updateSomeBoolean(getSomeBoolean());
        wrap(fakeDataDemoObject).updateSomeBooleanWrapper(getSomeBoolean());

        wrap(fakeDataDemoObject).updateSomeByte(getSomeByte());
        wrap(fakeDataDemoObject).updateSomeByteWrapper(getSomeByte());

        wrap(fakeDataDemoObject).updateSomeShort(getSomeShort());
        wrap(fakeDataDemoObject).updateSomeShortWrapper(getSomeShort());

        wrap(fakeDataDemoObject).updateSomeInt(getSomeInt());
        wrap(fakeDataDemoObject).updateSomeIntegerWrapper(getSomeInt());

        wrap(fakeDataDemoObject).updateSomeLong(getSomeLong());
        wrap(fakeDataDemoObject).updateSomeLongWrapper(getSomeLong());

        wrap(fakeDataDemoObject).updateSomeFloat(getSomeFloat());
        wrap(fakeDataDemoObject).updateSomeFloatWrapper(getSomeFloat());

        wrap(fakeDataDemoObject).updateSomeDouble(getSomeDouble());
        wrap(fakeDataDemoObject).updateSomeDoubleWrapper(getSomeDouble());

        wrap(fakeDataDemoObject).updateSomeChar(getSomeChar());
        wrap(fakeDataDemoObject).updateSomeCharacterWrapper(getSomeChar());

        wrap(fakeDataDemoObject).updateSomeString(getSomeString());
        wrap(fakeDataDemoObject).updateSomePassword(getSomePassword());

        wrap(fakeDataDemoObject).updateSomeBlob(getSomeBlob());
        wrap(fakeDataDemoObject).updateSomeClob(getSomeClob());

        wrap(fakeDataDemoObject).updateSomeJavaUtilDate(getSomeJavaUtilDate());
        wrap(fakeDataDemoObject).updateSomeJavaSqlDate(getSomeJavaSqlDate());
        wrap(fakeDataDemoObject).updateSomeJodaLocalDate(getSomeJodaLocalDate());
        wrap(fakeDataDemoObject).updateSomeJodaDateTime(getSomeJodaDateTime());
        wrap(fakeDataDemoObject).updateSomeJavaSqlTimestamp(getSomeJavaSqlTimestamp());

        wrap(fakeDataDemoObject).updateSomeBigDecimal(getSomeBigDecimal());
        wrap(fakeDataDemoObject).updateSomeBigInteger(getSomeBigInteger());

        wrap(fakeDataDemoObject).updateSomeUrl(getSomeUrl());
        wrap(fakeDataDemoObject).updateSomeUuid(getSomeUuid());
        wrap(fakeDataDemoObject).updateSomeMoney(getSomeMoney());

        wrap(fakeDataDemoObject).updateSomeEnumOf3(getSomeEnumOf3());

        executionContext.addResult(this, this.fakeDataDemoObject);
    }

    @javax.inject.Inject
    FakeDataService fakeDataService;
}
