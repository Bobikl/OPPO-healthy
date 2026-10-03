package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes13.dex */
public abstract class pdk implements odk {
    public final TypeFactory a;
    public final JavaType b;

    public pdk(JavaType javaType, TypeFactory typeFactory) {
        this.b = javaType;
        this.a = typeFactory;
    }

    @Override // com.oplus.aiunit.vision.odk
    public void d(JavaType javaType) {
    }

    @Override // com.oplus.aiunit.vision.odk
    public String f() {
        return e(null, this.b.getRawClass());
    }
}
