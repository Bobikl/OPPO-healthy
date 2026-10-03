package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class irl {
    public static final String TAG = "PayLog.web";
    public static final boolean a = f();
    public static final boolean b = e();
    public static volatile boolean c = false;

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
            if (stackTrace[i].getClass() != irl.class) {
                String className = stackTrace[i].getClassName();
                return className.substring(className.lastIndexOf(d14.POINT_REGEX) + 1);
            }
        }
        return "";
    }

    public static boolean d() {
        return a || b;
    }

    public static boolean e() {
        return ooj.a("persist.sys.assert.panic").equalsIgnoreCase("true") || ooj.a(SystemSettingsUtilsKt.LOG_ON_MKT).equalsIgnoreCase("true");
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
