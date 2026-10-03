package com.oplus.aiunit.vision;

import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class n60 implements ss9 {
    public final Object a;
    public final Method b;

    public n60(Object obj, Method method) {
        this.a = obj;
        this.b = method;
    }

    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        try {
            this.b.setAccessible(true);
            this.b.invoke(this.a, skaVar, rs9Var);
        } catch (IllegalAccessException unused) {
            JsApiResponse.invokeIllegal(rs9Var);
        } catch (InvocationTargetException unused2) {
            JsApiResponse.invokeIllegal(rs9Var);
        }
    }
}
