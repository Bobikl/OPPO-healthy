package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import android.os.Parcelable;
import com.heytap.msp.ipc.client.CompatServiceClient;
import com.heytap.mspsdk.exception.MspUnHandledException;
import com.heytap.mspsdk.log.MspLog;
import com.opos.process.bridge.client.BaseServiceClient;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public final ConcurrentHashMap<Long, CountDownLatch> a;
    public final Map<Object, d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7404c;

    public static class b {
        public static final a a = new a();
    }

    public static a b() {
        return b.a;
    }

    public ConcurrentHashMap<Long, CountDownLatch> a() {
        return this.a;
    }

    public <T> T c(Class<T> cls, Parcelable parcelable, Bundle bundle) {
        return (T) f(cls, null, parcelable, bundle);
    }

    public <T> T d(T t, com.heytap.mspsdk.event.b bVar) {
        return (T) e(t, null, bVar, null, null);
    }

    public <T> T e(Object obj, Class<T> cls, com.heytap.mspsdk.event.b bVar, Parcelable parcelable, Bundle bundle) {
        Class cls2;
        Class cls3;
        d dVar;
        if (obj == null && cls == null) {
            throw new RuntimeException("The instance of 'target' and 'class' is null");
        }
        try {
            if (cls != null) {
                dVar = new d(this, cls, parcelable, bundle, bVar);
                cls3 = cls;
                cls2 = cls3;
            } else {
                cls2 = obj.getClass();
                Class[] interfaces = obj.getClass().getInterfaces();
                if (interfaces == null || interfaces.length <= 0) {
                    throw new RuntimeException("The instance of 'target' doesn't implement an interface, please add 'makeInterface=true' at your moudle's BridgeTarget annotation");
                }
                MspLog.iIgnore("ApiProxy", "interfaces length " + interfaces.length);
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    MspLog.iIgnore("ApiProxy", "interfaces clazz name is " + interfaces[i].getSimpleName());
                }
                cls3 = interfaces[0];
                dVar = new d(this, obj, parcelable, bundle, bVar);
            }
            T t = (T) Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls3}, dVar);
            if (cls != null) {
                this.b.put(t, dVar);
            }
            return t;
        } catch (Throwable th) {
            throw new MspUnHandledException(th);
        }
    }

    public final <T> T f(Class<T> cls, com.heytap.mspsdk.event.b bVar, Parcelable parcelable, Bundle bundle) {
        return (T) e(null, cls, bVar, parcelable, bundle);
    }

    public Object g() {
        return this.f7404c;
    }

    public void h(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof BaseServiceClient) {
                ((BaseServiceClient) obj).destroyClient();
                return;
            }
            if (obj instanceof CompatServiceClient) {
                ((CompatServiceClient) obj).p();
                return;
            }
            d dVarRemove = this.b.remove(obj);
            if (dVarRemove != null) {
                com.heytap.msp.ipc.client.f fVarA = dVarRemove.a();
                if (fVarA instanceof CompatServiceClient) {
                    ((CompatServiceClient) fVarA).p();
                }
            }
        } catch (Throwable th) {
            MspLog.w("ApiProxy", th.getMessage());
        }
    }

    public a() {
        this.a = new ConcurrentHashMap<>();
        this.b = Collections.synchronizedMap(new WeakHashMap());
        this.f7404c = new Object();
    }
}
