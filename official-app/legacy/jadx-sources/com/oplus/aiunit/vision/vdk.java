package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.oplus.aiunit.vision.vdk;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public interface vdk<T extends vdk<T>> {
    mdk buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    wdk buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.As as);

    T init(JsonTypeInfo.Id id, odk odkVar);

    T typeIdVisibility(boolean z);

    T typeProperty(String str);

    default T withDefaultImpl(Class<?> cls) {
        return (T) defaultImpl(cls);
    }
}
