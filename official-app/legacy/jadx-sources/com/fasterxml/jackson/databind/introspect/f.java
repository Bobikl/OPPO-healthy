package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.oplus.aiunit.vision.oc1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {

    public interface a {
        a copy();

        Class<?> findMixInClassFor(Class<?> cls);
    }

    public abstract f copy();

    public abstract oc1 forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, a aVar);

    public abstract oc1 forCreation(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract oc1 forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    @Deprecated
    public abstract oc1 forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, a aVar);

    public abstract oc1 forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, a aVar, oc1 oc1Var);

    public abstract oc1 forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, a aVar);

    public abstract oc1 forSerialization(SerializationConfig serializationConfig, JavaType javaType, a aVar);
}
