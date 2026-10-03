package com.oplus.aiunit.vision;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public final class dsb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f10678c = new Class[0];
    public final String a;
    public final Class<?>[] b;

    public dsb(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int a() {
        return this.b.length;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != dsb.class) {
            return false;
        }
        dsb dsbVar = (dsb) obj;
        if (!this.a.equals(dsbVar.a)) {
            return false;
        }
        Class<?>[] clsArr = dsbVar.b;
        int length = this.b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.length;
    }

    public String toString() {
        return this.a + "(" + this.b.length + "-args)";
    }

    public dsb(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public dsb(String str, Class<?>[] clsArr) {
        this.a = str;
        this.b = clsArr == null ? f10678c : clsArr;
    }
}
