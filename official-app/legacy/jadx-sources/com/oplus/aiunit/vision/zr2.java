package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public interface zr2<R, T> {

    public static abstract class a {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.g(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return Utils.h(type);
        }

        @Nullable
        public abstract zr2<?, ?> get(Type type, Annotation[] annotationArr, evf evfVar);
    }

    T adapt(xr2<R> xr2Var);

    Type responseType();
}
