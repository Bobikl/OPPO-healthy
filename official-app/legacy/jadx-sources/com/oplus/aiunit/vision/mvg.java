package com.oplus.aiunit.vision;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class mvg<T> {
    public static <T> mvg<T> b(evf evfVar, Method method) {
        oqf oqfVarB = oqf.b(evfVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (Utils.j(genericReturnType)) {
            throw Utils.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return retrofit2.a.f(evfVar, method, oqfVarB);
        }
        throw Utils.m(method, "Service methods cannot return void.", new Object[0]);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
