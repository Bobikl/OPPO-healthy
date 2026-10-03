package com.oplus.aiunit.vision;

import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public class knl {
    public static final String TAG = "PayLog.web";
    public static final boolean a = f();
    public static final boolean b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f13362c = false;

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
            if (stackTrace[i].getClass() != knl.class) {
                String className = stackTrace[i].getClassName();
                return className.substring(className.lastIndexOf(".") + 1);
            }
        }
        return "";
    }

    public static boolean d() {
        return a || b;
    }

    public static boolean e() {
        return skj.a("persist.sys.assert.panic").equalsIgnoreCase(SpeechConstant.TRUE_STR) || skj.a(SystemSettingsUtilsKt.LOG_ON_MKT).equalsIgnoreCase(SpeechConstant.TRUE_STR);
    }

    public static boolean f() {
        return Log.isLoggable("PayLog.web", 2);
    }

    public static void g(String str) {
        if (d()) {
            Log.w("PayLog.web:" + c(), str);
        }
    }
}
