package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes13.dex */
public interface jzc {
    default Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;
}
