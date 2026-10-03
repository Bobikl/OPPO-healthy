package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes19.dex */
public class c90 {
    public static volatile Context a = null;
    public static volatile boolean b = false;

    public static Context a() {
        Context context = a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("TrackApi not initialized. Call static init first.");
    }

    @Nullable
    public static Context b() {
        return a;
    }

    public static void c(Application application) {
        e(application);
    }

    public static void d(Context context) {
        e(context);
    }

    public static void e(@NonNull Context context) {
        Context applicationContext;
        boolean zF = f(context);
        if ((context instanceof Application) || (applicationContext = context.getApplicationContext()) == null) {
            a = context;
        } else {
            if (zF) {
                applicationContext = a07.a(applicationContext);
            }
            a = applicationContext;
        }
        TrackLogger.m("DrsSdkCore", "context de=" + f(a), new Object[0]);
        b = fxe.g(a);
    }

    public static boolean f(@NonNull Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean g() {
        return a != null;
    }

    @JvmStatic
    public static boolean h() {
        return b;
    }
}
