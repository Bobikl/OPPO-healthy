package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: loaded from: classes13.dex */
public final class dbd {
    public final JavaType a;
    public final wtg b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObjectIdGenerator<?> f10479c;
    public final yla<Object> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10480e;

    public dbd(JavaType javaType, wtg wtgVar, ObjectIdGenerator<?> objectIdGenerator, yla<?> ylaVar, boolean z) {
        this.a = javaType;
        this.b = wtgVar;
        this.f10479c = objectIdGenerator;
        this.d = ylaVar;
        this.f10480e = z;
    }

    public static dbd a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        String simpleName = propertyName == null ? null : propertyName.getSimpleName();
        return new dbd(javaType, simpleName != null ? new SerializedString(simpleName) : null, objectIdGenerator, null, z);
    }

    public dbd b(boolean z) {
        return z == this.f10480e ? this : new dbd(this.a, this.b, this.f10479c, this.d, z);
    }

    public dbd c(yla<?> ylaVar) {
        return new dbd(this.a, this.b, this.f10479c, ylaVar, this.f10480e);
    }
}
