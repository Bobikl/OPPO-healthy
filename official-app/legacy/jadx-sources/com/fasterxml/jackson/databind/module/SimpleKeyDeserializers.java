package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.oplus.aiunit.vision.oc1;
import com.oplus.aiunit.vision.yna;
import com.oplus.aiunit.vision.zna;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class SimpleKeyDeserializers implements zna, Serializable {
    private static final long serialVersionUID = 1;
    protected HashMap<ClassKey, yna> _classMappings = null;

    public SimpleKeyDeserializers addDeserializer(Class<?> cls, yna ynaVar) {
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(new ClassKey(cls), ynaVar);
        return this;
    }

    @Override // com.oplus.aiunit.vision.zna
    public yna findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, oc1 oc1Var) {
        HashMap<ClassKey, yna> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(javaType.getRawClass()));
    }
}
