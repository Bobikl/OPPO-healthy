package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: loaded from: classes13.dex */
public class cbd {
    public static final cbd f = new cbd(PropertyName.NO_NAME, Object.class, null, false, null);
    public final PropertyName a;
    public final Class<? extends ObjectIdGenerator<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<? extends com.fasterxml.jackson.annotation.a> f10018c;
    public final Class<?> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10019e;

    public cbd(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends com.fasterxml.jackson.annotation.a> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    public static cbd a() {
        return f;
    }

    public boolean b() {
        return this.f10019e;
    }

    public Class<? extends ObjectIdGenerator<?>> c() {
        return this.b;
    }

    public PropertyName d() {
        return this.a;
    }

    public Class<? extends com.fasterxml.jackson.annotation.a> e() {
        return this.f10018c;
    }

    public Class<?> f() {
        return this.d;
    }

    public cbd g(boolean z) {
        return this.f10019e == z ? this : new cbd(this.a, this.d, this.b, z, this.f10018c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.a + ", scope=" + nc3.X(this.d) + ", generatorType=" + nc3.X(this.b) + ", alwaysAsId=" + this.f10019e;
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends com.fasterxml.jackson.annotation.a>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends com.fasterxml.jackson.annotation.a>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cbd(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z, Class cls3) {
        this.a = propertyName;
        this.d = cls;
        this.b = cls2;
        this.f10019e = z;
        this.f10018c = cls3 == null ? com.fasterxml.jackson.annotation.b.class : cls3;
    }
}
