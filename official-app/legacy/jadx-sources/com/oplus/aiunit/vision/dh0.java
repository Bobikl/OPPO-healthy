package com.oplus.aiunit.vision;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes13.dex */
public final class dh0 {
    public static Object a(Class cls, int i) {
        return Array.newInstance((Class<?>) cls, i);
    }

    public static void b(Object obj, int i, Object obj2) {
        Array.set(obj, i, obj2);
    }
}
