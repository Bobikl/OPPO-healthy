package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes13.dex */
public class qdk {
    public int a;
    public Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JavaType f15758c;
    public boolean d;

    public qdk() {
    }

    public qdk(Class<?> cls, boolean z) {
        this.b = cls;
        this.f15758c = null;
        this.d = z;
        this.a = z ? e(cls) : g(cls);
    }

    public static final int d(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public static final int e(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int f(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int g(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public Class<?> a() {
        return this.b;
    }

    public JavaType b() {
        return this.f15758c;
    }

    public boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        qdk qdkVar = (qdk) obj;
        if (qdkVar.d != this.d) {
            return false;
        }
        Class<?> cls = this.b;
        if (cls != null) {
            return qdkVar.b == cls;
        }
        return this.f15758c.equals(qdkVar.f15758c);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        if (this.b != null) {
            return "{class: " + this.b.getName() + ", typed? " + this.d + "}";
        }
        return "{type: " + this.f15758c + ", typed? " + this.d + "}";
    }

    public qdk(JavaType javaType, boolean z) {
        this.f15758c = javaType;
        this.b = null;
        this.d = z;
        this.a = z ? d(javaType) : f(javaType);
    }
}
