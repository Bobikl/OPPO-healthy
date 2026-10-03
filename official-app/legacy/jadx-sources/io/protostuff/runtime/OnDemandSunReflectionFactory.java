package io.protostuff.runtime;

import java.lang.reflect.Constructor;
import sun.reflect.ReflectionFactory;

/* JADX INFO: loaded from: classes10.dex */
final class OnDemandSunReflectionFactory {
    private OnDemandSunReflectionFactory() {
    }

    public static <T> Constructor<T> getConstructor(Class<T> cls, Constructor<Object> constructor) {
        return ReflectionFactory.getReflectionFactory().newConstructorForSerialization(cls, constructor);
    }
}
