package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class io3<T> {
    public static final int ERROR_DEFAULT = 1;
    public static final int ERROR_NETWORK = 2;
    public T a;
    public int b;

    public io3(T t) {
        this.a = t;
    }

    public static <T> io3<T> a() {
        return new io3<>(1);
    }

    public static <T> io3<T> d(T t) {
        if (t != null) {
            return new io3<>(t);
        }
        throw new IllegalArgumentException("result can not be null");
    }

    public T b() {
        return this.a;
    }

    public boolean c() {
        return this.a != null;
    }

    public io3(int i) {
        this.b = i;
    }
}
