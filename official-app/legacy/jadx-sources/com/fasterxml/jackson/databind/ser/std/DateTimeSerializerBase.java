package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h94;
import com.oplus.aiunit.vision.rka;
import com.oplus.aiunit.vision.yla;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements h94 {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    public void _acceptJsonFormatVisitor(rka rkaVar, JavaType javaType, boolean z) throws JsonMappingException {
        if (z) {
            visitIntFormat(rkaVar, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(rkaVar, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    public boolean _asTimestamp(eug eugVar) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (eugVar != null) {
            return eugVar.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        if (this._customFormat == null) {
            eugVar.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.t0(andSet.format(date));
        fue.a(this._reusedCustomFormat, null, andSet);
    }

    public abstract long _timestamp(T t);

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void acceptJsonFormatVisitor(rka rkaVar, JavaType javaType) throws JsonMappingException {
        _acceptJsonFormatVisitor(rkaVar, javaType, _asTimestamp(rkaVar.getProvider()));
    }

    @Override // com.oplus.aiunit.vision.h94
    public yla<?> createContextual(eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(eugVar, beanProperty, handledType());
        if (valueFindFormatOverrides == null) {
            return this;
        }
        JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
        if (shape.isNumeric()) {
            return withFormat2(Boolean.TRUE, null);
        }
        if (valueFindFormatOverrides.hasPattern()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(valueFindFormatOverrides.getPattern(), valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : eugVar.getLocale());
            simpleDateFormat.setTimeZone(valueFindFormatOverrides.hasTimeZone() ? valueFindFormatOverrides.getTimeZone() : eugVar.getTimeZone());
            return withFormat2(Boolean.FALSE, simpleDateFormat);
        }
        boolean zHasLocale = valueFindFormatOverrides.hasLocale();
        boolean zHasTimeZone = valueFindFormatOverrides.hasTimeZone();
        boolean z = shape == JsonFormat.Shape.STRING;
        if (!zHasLocale && !zHasTimeZone && !z) {
            return this;
        }
        DateFormat dateFormat = eugVar.getConfig().getDateFormat();
        if (dateFormat instanceof StdDateFormat) {
            StdDateFormat stdDateFormatWithTimeZone = (StdDateFormat) dateFormat;
            if (valueFindFormatOverrides.hasLocale()) {
                stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withLocale(valueFindFormatOverrides.getLocale());
            }
            if (valueFindFormatOverrides.hasTimeZone()) {
                stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withTimeZone(valueFindFormatOverrides.getTimeZone());
            }
            return withFormat2(Boolean.FALSE, stdDateFormatWithTimeZone);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            eugVar.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
        SimpleDateFormat simpleDateFormat3 = zHasLocale ? new SimpleDateFormat(simpleDateFormat2.toPattern(), valueFindFormatOverrides.getLocale()) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
        if ((timeZone == null || timeZone.equals(simpleDateFormat3.getTimeZone())) ? false : true) {
            simpleDateFormat3.setTimeZone(timeZone);
        }
        return withFormat2(Boolean.FALSE, simpleDateFormat3);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.jfg
    public ela getSchema(eug eugVar, Type type) {
        return createSchemaNode(_asTimestamp(eugVar) ? "number" : TypedValues.Custom.S_STRING, true);
    }

    @Override // com.oplus.aiunit.vision.yla
    public boolean isEmpty(eug eugVar, T t) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public abstract void serialize(T t, JsonGenerator jsonGenerator, eug eugVar) throws IOException;

    /* JADX INFO: renamed from: withFormat */
    public abstract DateTimeSerializerBase<T> withFormat2(Boolean bool, DateFormat dateFormat);
}
