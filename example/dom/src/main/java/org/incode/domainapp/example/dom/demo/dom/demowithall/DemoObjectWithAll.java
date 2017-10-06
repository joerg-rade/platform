package org.incode.domainapp.example.dom.demo.dom.demowithall;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.VersionStrategy;
import javax.validation.constraints.Digits;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.google.common.collect.Ordering;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.BookmarkPolicy;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.DomainObjectLayout;
import org.apache.isis.applib.annotation.Editing;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Optionality;
import org.apache.isis.applib.annotation.Property;
import org.apache.isis.applib.annotation.PropertyLayout;
import org.apache.isis.applib.annotation.SemanticsOf;
import org.apache.isis.applib.annotation.Title;
import org.apache.isis.applib.value.Blob;
import org.apache.isis.applib.value.Clob;
import org.apache.isis.applib.value.Money;
import org.apache.isis.applib.value.Password;
import org.apache.isis.schema.utils.jaxbadapters.PersistentEntityAdapter;

import lombok.Getter;
import lombok.Setter;

@javax.jdo.annotations.PersistenceCapable(
        identityType=IdentityType.DATASTORE,
        schema = "exampleDemo"
)
@javax.jdo.annotations.DatastoreIdentity(
        strategy=javax.jdo.annotations.IdGeneratorStrategy.IDENTITY,
         column="id")
@javax.jdo.annotations.Version(
        strategy=VersionStrategy.VERSION_NUMBER, 
        column="version")
@DomainObject(
        editing = Editing.DISABLED
)
@DomainObjectLayout(
        bookmarking = BookmarkPolicy.AS_ROOT
)
@XmlJavaTypeAdapter(PersistentEntityAdapter.class)
public class DemoObjectWithAll implements Comparable<DemoObjectWithAll> {


    @Getter @Setter
    @javax.jdo.annotations.Column(allowsNull="false")
    @Title(sequence="1")
    @MemberOrder(sequence="1")
    private String name;

    @Getter @Setter
    private boolean someBoolean;

    @Getter @Setter
    private byte someByte;

    @Getter @Setter
    private short someShort;

    @Getter @Setter
    @PropertyLayout(describedAs = "description of some int")
    private int someInt;

    @Getter @Setter
    private long someLong;

    @Getter @Setter
    private float someFloat;

    @Getter @Setter
    private double someDouble;

    @Getter @Setter
    private char someChar;

    @Column(allowsNull = "true")
    @Getter @Setter
    private Boolean someBooleanWrapper;
    public Boolean getSomeBooleanWrapper() { return someBooleanWrapper; }
    public void setSomeBooleanWrapper(final Boolean someBooleanWrapper) { this.someBooleanWrapper = someBooleanWrapper; }

    @Column(allowsNull = "true")
    @Getter @Setter
    private Byte someByteWrapper;

    @Column(allowsNull = "true")
    @Getter @Setter
    private Short someShortWrapper;
    public Short getSomeShortWrapper() { return someShortWrapper; }

    @Column(allowsNull = "true")
    @Getter @Setter
    private Integer someIntegerWrapper;

    @Column(allowsNull = "true")
    @Getter @Setter
    private Long someLongWrapper;

    @Column(allowsNull = "true")
    @Getter @Setter
    private Float someFloatWrapper;

    @Column(allowsNull = "true")
    @Getter @Setter
    private Double someDoubleWrapper;

    @Column(allowsNull = "true")
    @Getter @Setter
    private Character someCharacterWrapper;
    public Character getSomeCharacterWrapper() { return someCharacterWrapper; }

    @Getter @Setter
    @Column(allowsNull = "true")
    private String someString;

    @javax.jdo.annotations.Persistent()
    @Column(allowsNull = "true")
    @Property(optionality=Optionality.OPTIONAL)
    private Password somePassword;
    public Password getSomePassword() { return somePassword; }
    public void setSomePassword(final Password somePassword) { this.somePassword = somePassword; }

    @javax.jdo.annotations.Persistent(defaultFetchGroup="false", columns = {
            @javax.jdo.annotations.Column(name = "someBlob_name"),
            @javax.jdo.annotations.Column(name = "someBlob_mimetype"),
            @javax.jdo.annotations.Column(name = "someBlob_bytes", jdbcType = "BLOB", sqlType = "LONGVARBINARY")
    })
    @Getter @Setter
    @Property(optionality = Optionality.OPTIONAL)
    private Blob someBlob;

    @javax.jdo.annotations.Persistent(defaultFetchGroup="false", columns = {
            @javax.jdo.annotations.Column(name = "someClob_name"),
            @javax.jdo.annotations.Column(name = "someClob_mimetype"),
            @javax.jdo.annotations.Column(name = "someClob_chars", jdbcType = "CLOB", sqlType = "LONGVARCHAR")
    })
    @Getter @Setter
    @Property(optionality=Optionality.OPTIONAL)
    private Clob someClob;

    @Column(allowsNull = "true")
    @Getter @Setter
    private java.util.Date someJavaUtilDate;
    public Date getSomeJavaUtilDate() { return someJavaUtilDate; }

    @Column(allowsNull = "true")
    @Getter @Setter
    private java.sql.Date someJavaSqlDate;

    @Column(allowsNull = "true")
    @javax.jdo.annotations.Persistent(defaultFetchGroup="true")
    @Getter @Setter
    private org.joda.time.LocalDate someJodaLocalDate;

    @Column(allowsNull = "true")
    @javax.jdo.annotations.Persistent(defaultFetchGroup="true")
    @Getter @Setter
    private org.joda.time.DateTime someJodaDateTime;

    @Column(allowsNull = "true")
    @Getter @Setter
    private java.sql.Timestamp someJavaSqlTimestamp;

    @Column(allowsNull = "true")
    @Getter @Setter
    private BigInteger someBigInteger;

    @Column(allowsNull = "true", length = 14, scale = 4)
    @Getter @Setter
    private BigDecimal someBigDecimal;

    @Column(allowsNull = "true")
    @Getter @Setter
    private java.net.URL someUrl;

    @Column(allowsNull = "true")
    @Getter @Setter
    private java.util.UUID someUuid;

    @javax.jdo.annotations.Persistent(defaultFetchGroup="true", columns = {
            @javax.jdo.annotations.Column(name = "someMoneyOptional_amount"),
            @javax.jdo.annotations.Column(name = "someMoneyOptional_currency")
    })
    @Property(optionality = Optionality.OPTIONAL)
    @Getter @Setter
    private Money someMoney;

    @Column(allowsNull = "true")
    @Getter @Setter
    private EnumOf3 someEnumOf3;
    public EnumOf3 getSomeEnumOf3() { return someEnumOf3; }


    //region > updateSomeBoolean (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeBoolean(final boolean b) {
        setSomeBoolean(b);
        return this;
    }
    public boolean default0UpdateSomeBoolean() {
        return isSomeBoolean();
    }
    //endregion

    //region > updateSomeByte (action)
    @Action(semantics= SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeByte(final byte b) {
        setSomeByte(b);
        return this;
    }
    public byte default0UpdateSomeByte() {
        return getSomeByte();
    }
    //endregion

    //region > updateSomeShort (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeShort(final short s) {
        setSomeShort(s);
        return this;
    }
    public short default0UpdateSomeShort() {
        return getSomeShort();
    }
    //endregion

    //region > updateSomeInt (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeInt(final int i) {
        setSomeInt(i);
        return this;
    }
    public int default0UpdateSomeInt() {
        return getSomeInt();
    }
    //endregion

    //region > updateSomeLong (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeLong(final long l) {
        setSomeLong(l);
        return this;
    }
    public long default0UpdateSomeLong() {
        return getSomeLong();
    }
    //endregion

    //region > updateSomeFloat (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeFloat(final float f) {
        setSomeFloat(f);
        return this;
    }
    public float default0UpdateSomeFloat() {
        return getSomeFloat();
    }
    //endregion

    //region > updateSomeDouble (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeDouble(final double d) {
        setSomeDouble(d);
        return this;
    }
    public double default0UpdateSomeDouble() {
        return getSomeDouble();
    }
    //endregion

    //region > updateSomeChar (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeChar(final char i) {
        setSomeChar(i);
        return this;
    }
    public char default0UpdateSomeChar() {
        return getSomeChar();
    }
    //endregion

    //region > updateSomeBooleanWrapperOptional / resetSomeBooleanWrapper(action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeBooleanWrapper(
            @Nullable
            final Boolean i) {
        setSomeBooleanWrapper(i);
        return this;
    }
    public Boolean default0UpdateSomeBooleanWrapper() {
        return getSomeBooleanWrapper();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeBooleanWrapper() {
        setSomeBooleanWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeByteWrapperOptional / resetSomeByteWrapper (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeByteWrapper(@Nullable final Byte b) {
        setSomeByteWrapper(b);
        return this;
    }

    public Byte default0UpdateSomeByteWrapper() {
        return getSomeByteWrapper();
    }
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeByteWrapper() {
        setSomeByteWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeShortWrapperOptional (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeShortWrapper(@Nullable final Short s) {
        setSomeShortWrapper(s);
        return this;
    }
    public Short default0UpdateSomeShortWrapper() {
        return getSomeShortWrapper();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeShortWrapper() {
        setSomeShortWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeIntegerWrapperOptional / resetSomeIntegerWrapper (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeIntegerWrapper(@Nullable final Integer i) {
        setSomeIntegerWrapper(i);
        return this;
    }
    public Integer default0UpdateSomeIntegerWrapper() {
        return getSomeIntegerWrapper();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeIntegerWrapper() {
        setSomeIntegerWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeLongWrapperOptional / resetSomeLongWrapper (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeLongWrapper(@Nullable final Long l) {
        setSomeLongWrapper(l);
        return this;
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeLongWrapper() {
        setSomeLongWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeFloatWrapper / resetSomeFloatWrapper (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeFloatWrapper(@Nullable final Float f) {
        setSomeFloatWrapper(f);
        return this;
    }
    public Float default0UpdateSomeFloatWrapper() {
        return getSomeFloatWrapper();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeFloatWrapper() {
        setSomeFloatWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeDoubleWrapper / resetSomeDoubleWrapper (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeDoubleWrapper(@Nullable final Double d) {
        setSomeDoubleWrapper(d);
        return this;
    }
    public Double default0UpdateSomeDoubleWrapper() {
        return getSomeDoubleWrapper();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeDoubleWrapper() {
        setSomeDoubleWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeCharacterWrapper / resetSomeCharacterWrapper (action)

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeCharacterWrapper(@Nullable final Character i) {
        setSomeCharacterWrapper(i);
        return this;
    }
    public Character default0UpdateSomeCharacterWrapper() {
        return getSomeCharacterWrapper();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeCharacterWrapper() {
        setSomeCharacterWrapper(null);
        return this;
    }
    //endregion

    //region > updateSomeString / resetSomeString (action)

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeString(@Nullable final String i) {
        setSomeString(i);
        return this;
    }
    public String default0UpdateSomeString() {
        return getSomeString();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeString() {
        setSomeString(null);
        return this;
    }
    //endregion

    //region > updateSomePassword / resetSomePassword (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomePassword(@Nullable final Password password) {
        setSomePassword(password);
        return this;
    }
    public Password default0UpdateSomePassword() {
        return getSomePassword();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomePassword() {
        setSomePassword(null);
        return this;
    }
    //endregion

    //region > updateSomeBlob / resetSomeBlob (action)
    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeBlob(
            @Nullable
            final Blob blob) {
        setSomeBlob(blob);
        return this;
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeBlob() {
        setSomeBlob(null);
        return this;
    }
    //endregion

    //region > updateSomeClob / resetSomeClob (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeClob(@Nullable final Clob clob) {
        setSomeClob(clob);
        return this;
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeClob() {
        setSomeClob(null);
        return this;
    }
    //endregion

    //region > updateSomeJavaUtilDate / resetSomeJavaUtilDate (action)
    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeJavaUtilDate(@Nullable final Date i) {
        setSomeJavaUtilDate(i);
        return this;
    }
    public java.util.Date default0UpdateSomeJavaUtilDate() {
        return getSomeJavaUtilDate();
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeJavaUtilDate() {
        setSomeJavaUtilDate(null);
        return this;
    }
    //endregion

    //region > updateSomeJavaSqlDate / resetSomeJavaSqlDate (action)

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeJavaSqlDate(@Nullable final java.sql.Date i) {
        setSomeJavaSqlDate(i);
        return this;
    }
    public java.sql.Date default0UpdateSomeJavaSqlDate() {
        return getSomeJavaSqlDate();
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeJavaSqlDate() {
        setSomeJavaSqlDate(null);
        return this;
    }
    //endregion

    //region > updateSomeJodaLocalDate / resetSomeJodaLocalDate (action)

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeJodaLocalDate(@Nullable final LocalDate i) {
        setSomeJodaLocalDate(i);
        return this;
    }
    public org.joda.time.LocalDate default0UpdateSomeJodaLocalDate() {
        return getSomeJodaLocalDate();
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeJodaLocalDate() {
        setSomeJodaLocalDate(null);
        return this;
    }
    //endregion

    // region > JodaLocalDateTime (commented out)

    /*

    //region > updateSomeJodaLocalDateTime / resetSomeJodaLocalDateTime (action)
    @javax.jdo.annotations.Persistent(defaultFetchGroup="true")
    @Column(allowsNull = "true")
    @Getter @Setter
    private org.joda.time.LocalDateTime someJodaLocalDateTime;


    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public FakeDataDemoObject updateSomeJodaLocalDateTime(@Parameter(ity = ity.) final LocalDateTime i) {
        setSomeJodaLocalDateTime(i);
        return this;
    }
    public org.joda.time.LocalDateTime default0UpdateSomeJodaLocalDateTime() {
        return getSomeJodaLocalDateTime();
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public FakeDataDemoObject resetSomeJodaLocalDateTime() {
        setSomeJodaLocalDateTime(null);
        return this;
    }
    //endregion
     */
    //endregion

    //
    // the applib datetime/date classes are commented out because they haven't been mapped to the DataNucleus objectstore,
    // and will almost certainly remove in Isis 2.0
    //

    //region > updateSomeJodaDateTime / resetSomeJodaDateTime (action)
    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeJodaDateTime(@Nullable final DateTime i) {
        setSomeJodaDateTime(i);
        return this;
    }
    public org.joda.time.DateTime default0UpdateSomeJodaDateTime() {
        return getSomeJodaDateTime();
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeJodaDateTime() {
        setSomeJodaDateTime(null);
        return this;
    }
    //endregion

    //region > updateSomeJavaSqlTimestamp / resetSomeJavaSqlTimestamp (action)
    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeJavaSqlTimestamp(@Nullable final Timestamp i) {
        setSomeJavaSqlTimestamp(i);
        return this;
    }
    public java.sql.Timestamp default0UpdateSomeJavaSqlTimestamp() {
        return getSomeJavaSqlTimestamp();
    }

    @Action(semantics = SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeJavaSqlTimestamp() {
        setSomeJavaSqlTimestamp(null);
        return this;
    }
    //endregion

    //region > updateSomeBigInteger / resetSomeBigInteger (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeBigInteger(
            @Nullable
            final BigInteger d) {
        setSomeBigInteger(d);
        return this;
    }
    public BigInteger default0UpdateSomeBigInteger() {
        return getSomeBigInteger();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeBigInteger() {
        setSomeBigInteger(null);
        return this;
    }
    //endregion

    //region > updateSomeBigDecimal / resetSomeBigDecimal (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeBigDecimal(
            @Nullable @Digits(integer = 10, fraction = 4) final BigDecimal d) {
        setSomeBigDecimal(d);
        return this;
    }
    public BigDecimal default0UpdateSomeBigDecimal() {
        return getSomeBigDecimal();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeBigDecimal() {
        setSomeBigDecimal(null);
        return this;
    }
    //endregion

    //region > updateSomeUrl / resetSomeUrl (action)
    @Action(semantics= SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeUrl(@Nullable final URL i) {
        setSomeUrl(i);
        return this;
    }
    public java.net.URL default0UpdateSomeUrl() {
        return getSomeUrl();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeUrl() {
        setSomeUrl(null);
        return this;
    }
    //endregion

    //region > updateSomeUuid / resetSomeUuid (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeUuid(@Nullable final UUID i) {
        setSomeUuid(i);
        return this;
    }
    public java.util.UUID default0UpdateSomeUuid() {
        return getSomeUuid();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeUuid() {
        setSomeUuid(null);
        return this;
    }
    //endregion

    //region > updateSomeMoney / resetSomeMoney (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeMoney(@Nullable final Money i) {
        setSomeMoney(i);
        return this;
    }
    public Money default0UpdateSomeMoney() {
        return getSomeMoney();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeMoney() {
        setSomeMoney(null);
        return this;
    }
    //endregion

    //region > updateSomeEnumOf3 / resetSomeEnumOf3 (action)
    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll updateSomeEnumOf3(@Nullable final EnumOf3 i) {
        setSomeEnumOf3(i);
        return this;
    }
    public EnumOf3 default0UpdateSomeEnumOf3() {
        return getSomeEnumOf3();
    }

    @Action(semantics=SemanticsOf.IDEMPOTENT)
    public DemoObjectWithAll resetSomeEnumOf3() {
        setSomeEnumOf3(null);
        return this;
    }
    //endregion


    //region > compareTo

    @Override
    public int compareTo(final DemoObjectWithAll other) {
        return Ordering.natural().onResultOf(DemoObjectWithAll::getName).compare(this, other);
    }

    //endregion

    //region > injected services

    @javax.inject.Inject
    @SuppressWarnings("unused")
    DomainObjectContainer container;

    //endregion

}
