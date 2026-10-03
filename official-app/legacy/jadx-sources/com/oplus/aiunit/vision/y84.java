package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.inner.content.ContextWrapper;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class y84 {

    @RequiresApi(api = 29)
    public static int BIND_FOREGROUND_SERVICE;

    @RequiresApi(api = 29)
    public static int BIND_FOREGROUND_SERVICE_WHILE_AWAKE;

    @RequiresApi(api = 25)
    public static String STATUS_BAR_SERVICE;

    static {
        try {
            if (jvk.j()) {
                STATUS_BAR_SERVICE = "statusbar";
                BIND_FOREGROUND_SERVICE_WHILE_AWAKE = 33554432;
                BIND_FOREGROUND_SERVICE = 67108864;
            } else if (jvk.l()) {
                STATUS_BAR_SERVICE = (String) c();
                BIND_FOREGROUND_SERVICE_WHILE_AWAKE = 33554432;
                BIND_FOREGROUND_SERVICE = 67108864;
            } else {
                if (!jvk.h()) {
                    throw new UnSupportedApiVersionException();
                }
                STATUS_BAR_SERVICE = "statusbar";
            }
        } catch (Throwable th) {
            Log.e("ContextNative", th.toString());
        }
    }

    @RequiresApi(api = 24)
    public static Context a(@NonNull Context context) throws UnSupportedApiVersionException {
        if (jvk.n()) {
            return context.createCredentialProtectedStorageContext();
        }
        if (jvk.j()) {
            return ContextWrapper.createCredentialProtectedStorageContext(context);
        }
        if (jvk.l()) {
            return (Context) b(context);
        }
        if (jvk.g()) {
            return context.createCredentialProtectedStorageContext();
        }
        throw new UnSupportedApiVersionException();
    }

    public static Object b(Context context) {
        return z84.a(context);
    }

    public static Object c() {
        return z84.b();
    }
}
