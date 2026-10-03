package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements InvocationHandler {
    public g a;
    public Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f564c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.a = gVar;
        this.b = cls;
        this.f564c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f564c.a(method, objArr);
    }
}
