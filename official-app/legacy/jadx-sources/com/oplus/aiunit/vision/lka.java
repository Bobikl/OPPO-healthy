package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public abstract class lka<T> implements jzc {

    public static abstract class a extends lka<Object> {
    }

    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, mdk mdkVar) throws IOException {
        return mdkVar.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    @Override // com.oplus.aiunit.vision.jzc
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public lka<?> getDelegatee() {
        return null;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public Collection<Object> getKnownPropertyNames() {
        return null;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Deprecated
    public T getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public LogicalType logicalType() {
        return null;
    }

    public lka<?> replaceDelegatee(lka<?> lkaVar) {
        throw new UnsupportedOperationException();
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public lka<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, mdk mdkVar, T t) throws IOException {
        deserializationContext.handleBadMerge(this);
        return deserializeWithType(jsonParser, deserializationContext, mdkVar);
    }

    @Deprecated
    public Object getEmptyValue() {
        return getNullValue();
    }

    @Override // com.oplus.aiunit.vision.jzc
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }
}
