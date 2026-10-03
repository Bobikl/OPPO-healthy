package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.oplus.aiunit.vision.jzc;
import com.oplus.aiunit.vision.lka;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class NullsAsEmptyProvider implements jzc, Serializable {
    private static final long serialVersionUID = 1;
    protected final lka<?> _deserializer;

    public NullsAsEmptyProvider(lka<?> lkaVar) {
        this._deserializer = lkaVar;
    }

    @Override // com.oplus.aiunit.vision.jzc
    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return super.getAbsentValue(deserializationContext);
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.oplus.aiunit.vision.jzc
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }
}
