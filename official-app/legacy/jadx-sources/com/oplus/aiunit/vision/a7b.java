package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.heytap.health.base.log.LogChecker;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"HealthLint_AndroidLogDetector"})
public class a7b {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static final boolean a = qe0.w();

    public static void b(String str, String str2) {
        Log.e(k(str), "Health_" + str2);
        z7b.c(str, str2);
        l82.a(str, str2);
    }

    public static void c(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(Weather.SEPARATOR);
        sb.append(a ? e(th) : th.getMessage());
        String string = sb.toString();
        Log.e(k(str), "Health_" + string);
        z7b.c(str, string);
        l82.a(str, string);
    }

    public static void d(final String str, final String str2, final String str3) {
        if (str3 == null) {
            m("Health_", "[encryptionI] --> key is null");
        } else {
            f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.y6b
                @Override // com.oplus.aiunit.vision.o6h
                public final void a(x5h x5hVar) throws Exception {
                    a7b.j(str, str2, str3, x5hVar);
                }
            }).y(su8.c()).v();
            z7b.f(str, str2);
        }
    }

    public static String e(@Nullable Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void f(String str, String str2) {
        Log.i(k(str), "Health_" + str2);
        z7b.f(str, str2);
        l82.b(str, str2);
    }

    public static void g(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(Weather.SEPARATOR);
        sb.append(a ? e(th) : th.getMessage());
        String string = sb.toString();
        Log.i(k(str), "Health_" + string);
        z7b.f(str, string);
        l82.b(str, string);
    }

    public static void h(Context context) {
        z7b.g(context);
        Log.i("LogUtils", "Health_init");
        z7b.f("Health_", "onCreate app version name is: " + qe0.n());
    }

    @SuppressLint({"WrongConstant"})
    public static boolean i(@Nullable String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static /* synthetic */ void j(String str, String str2, String str3, x5h x5hVar) throws Exception {
        if (a) {
            Log.i(k(str), "Health_" + str2);
            return;
        }
        String strB = pq.b(str3, str2);
        Log.i(k(str), "Health_" + strB);
    }

    public static String k(String str) {
        if (str == null || str.isEmpty()) {
            str = "Health_";
        }
        String strSubstring = str.length() > 23 ? str.substring(0, 23) : str;
        LogChecker.h(str);
        return strSubstring;
    }

    public static String l(String str) {
        return Pattern.compile("([0-9A-Fa-f]{2}):([0-9A-Fa-f]{2}):([0-9A-Fa-f]{2}):([0-9A-Fa-f]{2}):([0-9A-Fa-f]{2}):([0-9A-Fa-f]{2})").matcher(str).replaceAll("$1:**:$3:$4:$5:$6");
    }

    public static void m(String str, String str2) {
        Log.w(k(str), "Health_" + str2);
        z7b.j(str, str2);
        l82.c(str, str2);
    }

    public static void n(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(Weather.SEPARATOR);
        sb.append(a ? e(th) : th.getMessage());
        String string = sb.toString();
        Log.w(k(str), "Health_" + string);
        z7b.j(str, string);
        l82.c(str, string);
    }
}
