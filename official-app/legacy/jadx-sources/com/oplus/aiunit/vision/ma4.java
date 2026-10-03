package com.oplus.aiunit.vision;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public interface ma4<F, T> {

    public static abstract class a {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.g(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return Utils.h(type);
        }

        @Nullable
        public ma4<?, gqf> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, evf evfVar) {
            return null;
        }

        @Nullable
        public ma4<cuf, ?> responseBodyConverter(Type type, Annotation[] annotationArr, evf evfVar) {
            return null;
        }

        @Nullable
        public ma4<?, String> stringConverter(Type type, Annotation[] annotationArr, evf evfVar) {
            return null;
        }
    }

    @Nullable
    T convert(F f) throws IOException;
}
