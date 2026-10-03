package org.oconscrypt.metrics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class OptionalMethod {
    private final Method cachedMethod;

    public OptionalMethod(Class<?> cls, String str, Class<?>... clsArr) {
        this.cachedMethod = initializeMethod(cls, str, clsArr);
    }

    private static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    private static Method initializeMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            for (Class<?> cls2 : clsArr) {
                if (cls2 == null) {
                    return null;
                }
            }
            if (cls != null) {
                return cls.getMethod((String) checkNotNull(str), clsArr);
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    public Object invoke(Object obj, Object... objArr) {
        Method method = this.cachedMethod;
        if (method != null && obj != null) {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    public Object invokeStatic(Object... objArr) {
        Method method = this.cachedMethod;
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(null, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
