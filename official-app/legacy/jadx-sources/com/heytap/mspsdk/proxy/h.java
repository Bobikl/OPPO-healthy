package com.heytap.mspsdk.proxy;

import com.heytap.mspsdk.exception.MspProxyException;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.log.MspLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class h implements com.heytap.mspsdk.interceptor.b<e, Object> {
    public static final String TAG = "RealIPCInterceptor";

    public static <T extends Throwable> T d(Throwable th) throws Throwable {
        throw th;
    }

    @Override // com.heytap.mspsdk.interceptor.b
    public Object a(com.heytap.mspsdk.interceptor.a<e, Object> aVar) {
        return b(aVar.request());
    }

    public final Object b(e eVar) {
        eVar.c("realCallStart");
        return c(eVar.a, eVar.b, eVar.f7407c, eVar.f7408e);
    }

    public final Object c(Object obj, Method method, Object[] objArr, com.heytap.mspsdk.event.a aVar) {
        int length;
        if (objArr == null) {
            length = -1;
        } else {
            try {
                length = objArr.length;
            } catch (IllegalAccessException e2) {
                throw new MspSdkException(3012, "reflect exception:" + e2.getMessage());
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                aVar.m();
                if (cause != null) {
                    throw new MspProxyException(cause);
                }
                throw ((RuntimeException) d(e3));
            }
        }
        MspLog.iIgnore(TAG, "before invoke [" + obj.getClass().getSimpleName() + "#" + method.getName() + "], len(args) = " + length + ", thread name = " + Thread.currentThread().getName());
        aVar.n();
        Object objInvoke = method.invoke(obj, objArr);
        aVar.j();
        aVar.l();
        MspLog.iIgnore(TAG, "after invoke [" + obj.getClass().getSimpleName() + "#" + method.getName() + "]");
        return objInvoke;
    }
}
