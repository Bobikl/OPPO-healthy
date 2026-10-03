package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class voe {
    public static void a(Object... objArr) {
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T d(T t) {
        t.getClass();
        return t;
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
