package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* JADX INFO: loaded from: classes13.dex */
public interface fuk {

    public static class a implements fuk {
        @Override // com.oplus.aiunit.vision.fuk
        public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, oc1 oc1Var, ValueInstantiator valueInstantiator) {
            return valueInstantiator;
        }
    }

    ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, oc1 oc1Var, ValueInstantiator valueInstantiator);
}
