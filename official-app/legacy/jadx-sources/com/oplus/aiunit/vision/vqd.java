package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes4.dex */
public class vqd {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Class<T> cls, Object obj) {
        if (obj == 0 || !cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }
}
