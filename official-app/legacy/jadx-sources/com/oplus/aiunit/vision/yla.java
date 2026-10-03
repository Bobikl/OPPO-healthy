package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yla<T> {

    public static abstract class a extends yla<Object> {
    }

    public void acceptJsonFormatVisitor(rka rkaVar, JavaType javaType) throws JsonMappingException {
        rkaVar.j(javaType);
    }

    public yla<?> getDelegatee() {
        return null;
    }

    public Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(eug eugVar, T t) {
        return t == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<PropertyWriter> properties() {
        return nc3.n();
    }

    public yla<T> replaceDelegatee(yla<?> ylaVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, eug eugVar) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public void serializeWithType(T t, JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        Class clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = t.getClass();
        }
        eugVar.reportBadDefinition((Class<?>) clsHandledType, String.format("Type id handling not implemented for type %s (by serializer of type %s)", clsHandledType.getName(), getClass().getName()));
    }

    public yla<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yla<?> withFilterId(Object obj) {
        return this;
    }

    @Deprecated
    public boolean isEmpty(T t) {
        return isEmpty(null, t);
    }
}
