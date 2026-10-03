package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.oplus.aiunit.vision.jzc;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class NullsConstantProvider implements jzc, Serializable {
    private static final long serialVersionUID = 1;
    protected final AccessPattern _access;
    protected final Object _nullValue;
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    private static final NullsConstantProvider NULLER = new NullsConstantProvider(null);

    public NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? NULLER : new NullsConstantProvider(obj);
    }

    public static boolean isNuller(jzc jzcVar) {
        return jzcVar == NULLER;
    }

    public static boolean isSkipper(jzc jzcVar) {
        return jzcVar == SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    @Override // com.oplus.aiunit.vision.jzc
    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return super.getAbsentValue(deserializationContext);
    }

    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override // com.oplus.aiunit.vision.jzc
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
