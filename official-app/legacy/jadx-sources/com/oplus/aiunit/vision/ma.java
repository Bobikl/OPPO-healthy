package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class ma {
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.annotation.Annotation] */
    public static <T> T a(Request request, Class<T> cls) {
        Method methodA;
        if (request == null || (methodA = ((ega) request.s(ega.class)).a()) == null) {
            return null;
        }
        for (Annotation annotation : methodA.getDeclaredAnnotations()) {
            ?? r3 = (T) annotation;
            if (r3.annotationType().equals(cls)) {
                return r3;
            }
        }
        return null;
    }
}
