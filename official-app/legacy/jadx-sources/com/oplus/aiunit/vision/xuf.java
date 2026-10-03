package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class xuf<T> {
    public T a;

    public xuf(T t) {
        this.a = t;
    }

    public static <T> xuf<T> a() {
        return new xuf<>(null);
    }

    public static <T> xuf<T> d(T t) {
        if (t != null) {
            return new xuf<>(t);
        }
        throw new IllegalArgumentException("result can not be null");
    }

    public T b() {
        return this.a;
    }

    public boolean c() {
        return this.a != null;
    }
}
