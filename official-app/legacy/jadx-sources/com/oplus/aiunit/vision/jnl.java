package com.oplus.aiunit.vision;

import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public class jnl {
    public static final String TAG = "PayLog.web";
    public static final boolean a = g();
    public static final boolean b = f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f12962c = false;

    public static void a(String str) {
        if (d()) {
            Log.d("PayLog.web:" + c(), str);
        }
    }

    public static void b(String str) {
        if (d()) {
            Log.e("PayLog.web:" + c(), str);
        }
    }

    public static String c() {
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int length = stackTrace.length;
        for (int i = 2; i < length; i++) {
            if (stackTrace[i].getClass() != jnl.class) {
                String className = stackTrace[i].getClassName();
                return className.substring(className.lastIndexOf(".") + 1);
            }
        }
        return "";
    }

    public static boolean d() {
        return a || b;
    }

    public static void e(String str) {
        if (d()) {
            Log.i("PayLog.web:" + c(), str);
        }
    }

    public static boolean f() {
        return tkj.a("persist.sys.assert.panic").equalsIgnoreCase(SpeechConstant.TRUE_STR) || tkj.a(SystemSettingsUtilsKt.LOG_ON_MKT).equalsIgnoreCase(SpeechConstant.TRUE_STR);
    }

    public static boolean g() {
        return Log.isLoggable("PayLog.web", 2);
    }

    public static void h(String str) {
        if (d()) {
            Log.w("PayLog.web:" + c(), str);
        }
    }
}
