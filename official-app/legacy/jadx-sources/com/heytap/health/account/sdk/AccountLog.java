package com.heytap.health.account.sdk;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AccountLog {
    private static final String TAG = "ACCOUNT-";

    public static void d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(str);
    }

    public static void e(String str, String str2) {
        a7b.b(TAG + str, str2);
    }

    public static void i(String str, String str2) {
        a7b.f(TAG + str, str2);
    }

    public static void v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(str);
    }

    public static void w(String str, String str2) {
        a7b.m(TAG + str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        a7b.c(TAG + str, str2, th);
    }

    public static void w(String str, Throwable th) {
        a7b.n(TAG + str, "account warning", th);
    }
}
