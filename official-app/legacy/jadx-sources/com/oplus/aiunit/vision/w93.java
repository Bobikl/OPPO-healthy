package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class w93 {
    public static void a(Object obj, String str) {
        if (obj == null) {
            u6b.b("Checker", str);
            if (p04.DEBUG) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static void b(Object obj, String str) {
        a(obj, str);
        if ((obj instanceof String) && obj.toString().isEmpty() && p04.DEBUG) {
            throw new IllegalArgumentException(str);
        }
    }
}
