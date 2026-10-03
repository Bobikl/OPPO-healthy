package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes13.dex */
public interface ka4<IN, OUT> {

    public static abstract class a implements ka4<Object, Object> {
    }

    JavaType a(TypeFactory typeFactory);

    JavaType b(TypeFactory typeFactory);

    OUT convert(IN in);
}
