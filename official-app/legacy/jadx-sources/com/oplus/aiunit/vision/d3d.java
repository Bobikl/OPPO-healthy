package com.oplus.aiunit.vision;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.Nullable;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class d3d {
    public static final int DEFAULT_LEVEL_DEVELOP_MODE = 4;
    public static volatile Boolean a = Boolean.valueOf(g());
    public static String b = "ONet.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ContentObserver f10366c = new a(null);

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, @Nullable Uri uri, int i) {
            super.onChange(z);
            d3d.h(d3d.g());
        }
    }

    public static int b(String str, String str2) {
        if (!a.booleanValue()) {
            return -1;
        }
        String strD = d();
        return Log.d(xqm.a(new StringBuilder(), b, str), strD + "" + str2);
    }

    public static int c(String str, String str2) {
        String strD = d();
        return Log.e(xqm.a(new StringBuilder(), b, str), strD + "" + str2);
    }

    public static String d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null && stackTrace.length != 0) {
            for (int i = 0; i <= 0; i++) {
                StackTraceElement stackTraceElementE = e(null, i);
                if (!stackTraceElementE.isNativeMethod() && !stackTraceElementE.getClassName().equals(Thread.class.getName()) && !stackTraceElementE.getClassName().equals(d3d.class.getName())) {
                    StringBuilder sbA = zqm.a("(");
                    sbA.append(stackTraceElementE.getFileName());
                    sbA.append(":");
                    sbA.append(stackTraceElementE.getLineNumber());
                    sbA.append(")");
                    return sbA.toString();
                }
            }
        }
        return null;
    }

    public static StackTraceElement e(String str, int i) {
        return Thread.currentThread().getStackTrace()[i + 5];
    }

    public static int f(String str, String str2) {
        String strD = d();
        return Log.i(xqm.a(new StringBuilder(), b, str), strD + "" + str2);
    }

    public static boolean g() {
        try {
            return Settings.System.getInt(b94.a().getContentResolver(), SystemSettingsUtilsKt.LOG_SWITCH_TYPE, 0) != 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static synchronized void h(boolean z) {
        a = Boolean.valueOf(z);
    }

    public static int i(String str, String str2) {
        if (!a.booleanValue()) {
            return -1;
        }
        String strD = d();
        return Log.v(xqm.a(new StringBuilder(), b, str), strD + "" + str2);
    }

    public static int j(String str, String str2) {
        String strD = d();
        return Log.w(xqm.a(new StringBuilder(), b, str), strD + "" + str2);
    }
}
