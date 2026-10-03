package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.oplus.aiunit.vision.fuk;
import com.oplus.aiunit.vision.oc1;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class SimpleValueInstantiators extends fuk.a implements Serializable {
    private static final long serialVersionUID = -8929386427526115130L;
    protected HashMap<ClassKey, ValueInstantiator> _classMappings = new HashMap<>();

    public SimpleValueInstantiators addValueInstantiator(Class<?> cls, ValueInstantiator valueInstantiator) {
        this._classMappings.put(new ClassKey(cls), valueInstantiator);
        return this;
    }

    @Override // com.oplus.aiunit.vision.fuk.a, com.oplus.aiunit.vision.fuk
    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, oc1 oc1Var, ValueInstantiator valueInstantiator) {
        ValueInstantiator valueInstantiator2 = this._classMappings.get(new ClassKey(oc1Var.r()));
        return valueInstantiator2 == null ? valueInstantiator : valueInstantiator2;
    }
}
