package com.oplus.aiunit.vision;

import android.util.Log;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public class qae {
    public static final String TAG = "PayLog";
    public static final boolean a = h();
    public static final boolean b = g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f15704c = false;

    public static boolean a() {
        return false;
    }

    public static void b(String str) {
        if (e()) {
            Log.d("PayLog:" + d(), str);
        }
        if (a()) {
            throw null;
        }
    }

    public static void c(String str) {
        if (e()) {
            Log.e("PayLog:" + d(), str);
        }
        if (a()) {
            throw null;
        }
    }

    public static String d() {
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int length = stackTrace.length;
        for (int i = 2; i < length; i++) {
            if (stackTrace[i].getClass() != qae.class) {
                String className = stackTrace[i].getClassName();
                return className.substring(className.lastIndexOf(".") + 1);
            }
        }
        return "";
    }

    public static boolean e() {
        return a || b;
    }

    public static void f(String str) {
        if (e()) {
            Log.i("PayLog:" + d(), str);
        }
        if (a()) {
            throw null;
        }
    }

    public static boolean g() {
        return rkj.a("persist.sys.assert.panic").equalsIgnoreCase(SpeechConstant.TRUE_STR) || rkj.a(SystemSettingsUtilsKt.LOG_ON_MKT).equalsIgnoreCase(SpeechConstant.TRUE_STR);
    }

    public static boolean h() {
        return Log.isLoggable(TAG, 2);
    }

    public static void i(String str) {
        if (e()) {
            Log.w("PayLog:" + d(), str);
        }
        if (a()) {
            throw null;
        }
    }
}
