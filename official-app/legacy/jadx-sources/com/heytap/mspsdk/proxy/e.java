package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import com.heytap.mspsdk.constants.Constants;
import com.heytap.mspsdk.log.MspLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class e {
    public final Object a;
    public final Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f7407c;
    public final com.heytap.mspsdk.core.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.heytap.mspsdk.event.a f7408e;
    public Bundle f;

    public e(Object obj, Method method, Object[] objArr, com.heytap.mspsdk.core.b bVar, Bundle bundle, com.heytap.mspsdk.event.a aVar) {
        this.a = obj;
        this.b = method;
        this.f7407c = objArr;
        this.d = bVar;
        this.f7408e = aVar;
        this.f = com.heytap.mspsdk.util.c.b(obj, bundle);
    }

    public Bundle a() {
        return this.f;
    }

    public final Bundle b() {
        Bundle bundle = this.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(Constants.BUNDLE_KEY_MSP_SDK_COMMON_BUNDLE);
        if (bundle2 == null) {
            MspLog.e("InvokeRequest", "commBundle is null");
            return null;
        }
        Bundle bundle3 = bundle2.getBundle(Constants.BUNDLE_KEY_MSP_SDK_IPC_TIME_RECORDER);
        if (bundle3 == null) {
            MspLog.e("InvokeRequest", "timeRecorderBundle is null");
        }
        return bundle3;
    }

    public void c(String str) {
        try {
            Bundle bundleB = b();
            if (bundleB != null) {
                bundleB.putLong(str, System.currentTimeMillis());
            } else {
                MspLog.e("InvokeRequest", "timeRecorderBundle is null");
            }
        } catch (Throwable th) {
            MspLog.e(th);
        }
    }
}
