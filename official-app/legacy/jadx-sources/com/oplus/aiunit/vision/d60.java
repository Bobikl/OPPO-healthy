package com.oplus.aiunit.vision;

import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class d60 implements mr9 {
    public final Object a;
    public final Method b;

    public d60(Object obj, Method method) {
        this.a = obj;
        this.b = method;
    }

    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        try {
            this.b.setAccessible(true);
            this.b.invoke(this.a, kjaVar, lr9Var);
        } catch (IllegalAccessException unused) {
            JsApiResponse.invokeIllegal(lr9Var);
        } catch (InvocationTargetException unused2) {
            JsApiResponse.invokeIllegal(lr9Var);
        }
    }
}
