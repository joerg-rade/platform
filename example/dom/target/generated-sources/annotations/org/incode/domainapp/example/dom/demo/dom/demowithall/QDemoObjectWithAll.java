package org.incode.domainapp.example.dom.demo.dom.demowithall;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDemoObjectWithAll extends PersistableExpressionImpl<DemoObjectWithAll> implements PersistableExpression<DemoObjectWithAll>
{
    public static final QDemoObjectWithAll jdoCandidate = candidate("this");

    public static QDemoObjectWithAll candidate(String name)
    {
        return new QDemoObjectWithAll(null, name, 5);
    }

    public static QDemoObjectWithAll candidate()
    {
        return jdoCandidate;
    }

    public static QDemoObjectWithAll parameter(String name)
    {
        return new QDemoObjectWithAll(DemoObjectWithAll.class, name, ExpressionType.PARAMETER);
    }

    public static QDemoObjectWithAll variable(String name)
    {
        return new QDemoObjectWithAll(DemoObjectWithAll.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final BooleanExpression someBoolean;
    public final ByteExpression someByte;
    public final NumericExpression<Short> someShort;
    public final NumericExpression<Integer> someInt;
    public final NumericExpression<Long> someLong;
    public final NumericExpression<Float> someFloat;
    public final NumericExpression<Double> someDouble;
    public final CharacterExpression someChar;
    public final ObjectExpression<java.lang.Boolean> someBooleanWrapper;
    public final ObjectExpression<java.lang.Byte> someByteWrapper;
    public final ObjectExpression<java.lang.Short> someShortWrapper;
    public final ObjectExpression<java.lang.Integer> someIntegerWrapper;
    public final ObjectExpression<java.lang.Long> someLongWrapper;
    public final ObjectExpression<java.lang.Float> someFloatWrapper;
    public final ObjectExpression<java.lang.Double> someDoubleWrapper;
    public final ObjectExpression<java.lang.Character> someCharacterWrapper;
    public final StringExpression someString;
    public final ObjectExpression<org.apache.isis.applib.value.Password> somePassword;
    public final ObjectExpression<org.apache.isis.applib.value.Blob> someBlob;
    public final ObjectExpression<org.apache.isis.applib.value.Clob> someClob;
    public final DateTimeExpression someJavaUtilDate;
    public final DateExpression someJavaSqlDate;
    public final ObjectExpression<org.joda.time.LocalDate> someJodaLocalDate;
    public final ObjectExpression<org.joda.time.DateTime> someJodaDateTime;
    public final ObjectExpression<java.sql.Timestamp> someJavaSqlTimestamp;
    public final ObjectExpression<java.math.BigInteger> someBigInteger;
    public final ObjectExpression<java.math.BigDecimal> someBigDecimal;
    public final ObjectExpression<java.net.URL> someUrl;
    public final ObjectExpression<java.util.UUID> someUuid;
    public final ObjectExpression<org.apache.isis.applib.value.Money> someMoney;
    public final ObjectExpression<org.incode.domainapp.example.dom.demo.dom.demowithall.EnumOf3> someEnumOf3;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;

    public QDemoObjectWithAll(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.someBoolean = new BooleanExpressionImpl(this, "someBoolean");
        this.someByte = new ByteExpressionImpl(this, "someByte");
        this.someShort = new NumericExpressionImpl<Short>(this, "someShort");
        this.someInt = new NumericExpressionImpl<Integer>(this, "someInt");
        this.someLong = new NumericExpressionImpl<Long>(this, "someLong");
        this.someFloat = new NumericExpressionImpl<Float>(this, "someFloat");
        this.someDouble = new NumericExpressionImpl<Double>(this, "someDouble");
        this.someChar = new CharacterExpressionImpl(this, "someChar");
        this.someBooleanWrapper = new ObjectExpressionImpl<java.lang.Boolean>(this, "someBooleanWrapper");
        this.someByteWrapper = new ObjectExpressionImpl<java.lang.Byte>(this, "someByteWrapper");
        this.someShortWrapper = new ObjectExpressionImpl<java.lang.Short>(this, "someShortWrapper");
        this.someIntegerWrapper = new ObjectExpressionImpl<java.lang.Integer>(this, "someIntegerWrapper");
        this.someLongWrapper = new ObjectExpressionImpl<java.lang.Long>(this, "someLongWrapper");
        this.someFloatWrapper = new ObjectExpressionImpl<java.lang.Float>(this, "someFloatWrapper");
        this.someDoubleWrapper = new ObjectExpressionImpl<java.lang.Double>(this, "someDoubleWrapper");
        this.someCharacterWrapper = new ObjectExpressionImpl<java.lang.Character>(this, "someCharacterWrapper");
        this.someString = new StringExpressionImpl(this, "someString");
        this.somePassword = new ObjectExpressionImpl<org.apache.isis.applib.value.Password>(this, "somePassword");
        this.someBlob = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "someBlob");
        this.someClob = new ObjectExpressionImpl<org.apache.isis.applib.value.Clob>(this, "someClob");
        this.someJavaUtilDate = new DateTimeExpressionImpl(this, "someJavaUtilDate");
        this.someJavaSqlDate = new DateExpressionImpl(this, "someJavaSqlDate");
        this.someJodaLocalDate = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "someJodaLocalDate");
        this.someJodaDateTime = new ObjectExpressionImpl<org.joda.time.DateTime>(this, "someJodaDateTime");
        this.someJavaSqlTimestamp = new ObjectExpressionImpl<java.sql.Timestamp>(this, "someJavaSqlTimestamp");
        this.someBigInteger = new ObjectExpressionImpl<java.math.BigInteger>(this, "someBigInteger");
        this.someBigDecimal = new ObjectExpressionImpl<java.math.BigDecimal>(this, "someBigDecimal");
        this.someUrl = new ObjectExpressionImpl<java.net.URL>(this, "someUrl");
        this.someUuid = new ObjectExpressionImpl<java.util.UUID>(this, "someUuid");
        this.someMoney = new ObjectExpressionImpl<org.apache.isis.applib.value.Money>(this, "someMoney");
        this.someEnumOf3 = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.demowithall.EnumOf3>(this, "someEnumOf3");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }

    public QDemoObjectWithAll(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.someBoolean = new BooleanExpressionImpl(this, "someBoolean");
        this.someByte = new ByteExpressionImpl(this, "someByte");
        this.someShort = new NumericExpressionImpl<Short>(this, "someShort");
        this.someInt = new NumericExpressionImpl<Integer>(this, "someInt");
        this.someLong = new NumericExpressionImpl<Long>(this, "someLong");
        this.someFloat = new NumericExpressionImpl<Float>(this, "someFloat");
        this.someDouble = new NumericExpressionImpl<Double>(this, "someDouble");
        this.someChar = new CharacterExpressionImpl(this, "someChar");
        this.someBooleanWrapper = new ObjectExpressionImpl<java.lang.Boolean>(this, "someBooleanWrapper");
        this.someByteWrapper = new ObjectExpressionImpl<java.lang.Byte>(this, "someByteWrapper");
        this.someShortWrapper = new ObjectExpressionImpl<java.lang.Short>(this, "someShortWrapper");
        this.someIntegerWrapper = new ObjectExpressionImpl<java.lang.Integer>(this, "someIntegerWrapper");
        this.someLongWrapper = new ObjectExpressionImpl<java.lang.Long>(this, "someLongWrapper");
        this.someFloatWrapper = new ObjectExpressionImpl<java.lang.Float>(this, "someFloatWrapper");
        this.someDoubleWrapper = new ObjectExpressionImpl<java.lang.Double>(this, "someDoubleWrapper");
        this.someCharacterWrapper = new ObjectExpressionImpl<java.lang.Character>(this, "someCharacterWrapper");
        this.someString = new StringExpressionImpl(this, "someString");
        this.somePassword = new ObjectExpressionImpl<org.apache.isis.applib.value.Password>(this, "somePassword");
        this.someBlob = new ObjectExpressionImpl<org.apache.isis.applib.value.Blob>(this, "someBlob");
        this.someClob = new ObjectExpressionImpl<org.apache.isis.applib.value.Clob>(this, "someClob");
        this.someJavaUtilDate = new DateTimeExpressionImpl(this, "someJavaUtilDate");
        this.someJavaSqlDate = new DateExpressionImpl(this, "someJavaSqlDate");
        this.someJodaLocalDate = new ObjectExpressionImpl<org.joda.time.LocalDate>(this, "someJodaLocalDate");
        this.someJodaDateTime = new ObjectExpressionImpl<org.joda.time.DateTime>(this, "someJodaDateTime");
        this.someJavaSqlTimestamp = new ObjectExpressionImpl<java.sql.Timestamp>(this, "someJavaSqlTimestamp");
        this.someBigInteger = new ObjectExpressionImpl<java.math.BigInteger>(this, "someBigInteger");
        this.someBigDecimal = new ObjectExpressionImpl<java.math.BigDecimal>(this, "someBigDecimal");
        this.someUrl = new ObjectExpressionImpl<java.net.URL>(this, "someUrl");
        this.someUuid = new ObjectExpressionImpl<java.util.UUID>(this, "someUuid");
        this.someMoney = new ObjectExpressionImpl<org.apache.isis.applib.value.Money>(this, "someMoney");
        this.someEnumOf3 = new ObjectExpressionImpl<org.incode.domainapp.example.dom.demo.dom.demowithall.EnumOf3>(this, "someEnumOf3");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }
}
