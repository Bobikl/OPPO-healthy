package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import android.os.Parcelable;
import com.heytap.mspsdk.constants.MspSdkCode;
import com.heytap.mspsdk.exception.MspBridgeWrapException;
import com.heytap.mspsdk.exception.MspProxyException;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.exception.MspUnHandledException;
import com.heytap.mspsdk.log.MspLog;
import com.opos.process.bridge.provider.BridgeException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes19.dex */
public class d implements InvocationHandler {
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f7405j;
    public final Bundle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Parcelable f7406l;
    public com.heytap.msp.ipc.client.f m;

    public d(a aVar, Object obj, Parcelable parcelable, Bundle bundle, com.heytap.mspsdk.event.b bVar) {
        this.i = aVar;
        this.f7405j = obj;
        this.f7406l = parcelable;
        this.k = bundle;
    }

    public com.heytap.msp.ipc.client.f a() {
        return this.m;
    }

    public com.heytap.msp.ipc.client.f b(com.heytap.mspsdk.core.b bVar, Bundle bundle) {
        com.heytap.msp.ipc.client.f fVar = this.m;
        if (fVar != null) {
            return fVar;
        }
        Object obj = this.f7405j;
        Class cls = obj instanceof Class ? (Class) obj : null;
        if (cls == null || !cls.isInterface()) {
            throw new MspSdkException(2007, MspSdkCode.EXCEPTION_MSG_2007_INTERFACE_ERROR);
        }
        com.heytap.msp.ipc.client.f fVarA = com.heytap.mspsdk.core.c.a(com.heytap.mspsdk.core.f.d().b(), cls, c(), bundle);
        this.m = fVarA;
        fVarA.h(new c(bVar));
        return this.m;
    }

    public Parcelable c() {
        return this.f7406l;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Throwable cause;
        boolean z = false;
        if (method.getDeclaringClass() == Object.class) {
            if ("hashCode".equals(method.getName())) {
                return Integer.valueOf(hashCode());
            }
            if ("equals".equals(method.getName())) {
                if (objArr.length > 0 && objArr[0] != null && hashCode() == objArr[0].hashCode()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        try {
            com.heytap.mspsdk.event.b.a aVar = new com.heytap.mspsdk.event.b.a();
            aVar.a();
            com.heytap.mspsdk.core.b bVarG = com.heytap.mspsdk.core.b.g(com.heytap.mspsdk.core.f.d().b());
            e eVar = new e(this.f7405j, method, objArr, bVarG, this.k, aVar);
            eVar.c("invokeStart");
            LinkedList linkedList = new LinkedList();
            linkedList.add(new b());
            if (bVarG.d() && com.heytap.mspsdk.core.b.f()) {
                linkedList.add(new i());
                linkedList.add(new PreConnectCoreInterceptor(this.i));
            }
            if (!bVarG.d() || (this.f7405j instanceof Class)) {
                linkedList.add(new f(this));
            } else {
                linkedList.add(new h());
            }
            com.heytap.mspsdk.interceptor.c cVar = new com.heytap.mspsdk.interceptor.c(linkedList, 0, eVar);
            eVar.c("chainProceedStart");
            RESPONSE responseProceed = cVar.proceed(eVar);
            eVar.c("chainProceedEnd");
            return responseProceed;
        } catch (Throwable th) {
            MspLog.e(th);
            if (!(th instanceof MspProxyException) || (cause = th.getCause()) == null) {
                if (th instanceof MspSdkException) {
                    throw th;
                }
                throw new MspUnHandledException(th);
            }
            if (cause instanceof BridgeException) {
                throw new MspBridgeWrapException(cause.getMessage(), cause, ((BridgeException) cause).getCode());
            }
            if (cause instanceof MspSdkException) {
                throw cause;
            }
            throw new MspUnHandledException(cause);
        }
    }
}
