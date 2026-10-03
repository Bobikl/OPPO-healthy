package com.heytap.mspsdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.heytap.msp.ipc.client.IMspIPCLog;
import com.heytap.msp.ipc.client.h;
import com.heytap.mspsdk.core.crash.d;
import com.heytap.mspsdk.core.crash.e;
import com.heytap.mspsdk.core.f;
import com.heytap.mspsdk.event.b;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.log.MspLog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class MspSdk {
    private static final String TAG = "MspSdk";
    private static final AtomicBoolean sInitialized = new AtomicBoolean(false);

    public static void addMspProcessCrashListener(Context context, String str, e eVar) {
        try {
            MspLog.d(TAG, "addMspProcessCrashListener:" + str);
            if (context != null && context.getApplicationContext() != null) {
                String strO = d.o(context, str);
                d.f().m(context);
                d.f().d(context, strO, eVar);
            }
        } catch (Exception e2) {
            MspLog.e(TAG, e2);
        }
    }

    public static <T, R extends T> T apiProxy(R r) throws MspSdkException {
        return (T) apiProxy(r, (b) null);
    }

    public static synchronized void init(Context context) {
        AtomicBoolean atomicBoolean = sInitialized;
        if (atomicBoolean.get()) {
            MspLog.iIgnore(TAG, "Sdk has initialized! version:2.0.1.13");
            return;
        }
        MspLog.iIgnore(TAG, "Sdk init start");
        f.d().f(context);
        atomicBoolean.set(true);
        MspLog.iIgnore(TAG, "Sdk init finish, version:2.0.1.13");
        h.f(new IMspIPCLog() { // from class: com.heytap.mspsdk.a
            @Override // com.heytap.msp.ipc.client.IMspIPCLog
            public final int println(int i, String str, String str2) {
                return MspSdk.lambda$init$0(i, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$init$0(int i, String str, String str2) {
        if ("COMPONENT".equals(str)) {
            MspLog.i(str, str2);
        }
        return i;
    }

    public static boolean preConnectToMspCore() {
        return f.d().g(null);
    }

    public static void removeOnDownloadInstallListener() {
        f.d().i();
    }

    public static void setOnDownloadInstallListener(com.heytap.mspsdk.guide.b bVar) {
        f.d().setOnDownloadInstallListener(bVar);
    }

    public static void unbind(Object obj) {
        com.heytap.mspsdk.proxy.a.b().h(obj);
    }

    public static <T, R extends T> T apiProxy(R r, b bVar) throws MspSdkException {
        return (T) com.heytap.mspsdk.proxy.a.b().d(r, bVar);
    }

    public static <T> T apiProxy(Class<T> cls, Bundle bundle) throws MspSdkException {
        return (T) com.heytap.mspsdk.proxy.a.b().c(cls, null, bundle);
    }

    public static <T> T apiProxy(Class<T> cls, Parcelable parcelable, Bundle bundle) throws MspSdkException {
        return (T) com.heytap.mspsdk.proxy.a.b().c(cls, parcelable, bundle);
    }
}
