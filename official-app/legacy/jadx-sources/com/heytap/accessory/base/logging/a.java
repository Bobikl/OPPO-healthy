package com.heytap.accessory.base.logging;

import com.heytap.accessory.logging.CommonLog;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static void a(String str, String str2) {
        CommonLog.d("TPLog." + str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        CommonLog.w("TPLog." + str, str2, th);
    }

    public static void c(String str, String str2) {
        CommonLog.i("TPLog." + str, str2);
    }

    public static void d(String str, String str2) {
        CommonLog.v("TPLog." + str, str2);
    }

    public static void e(String str, String str2) {
        CommonLog.w("TPLog." + str, str2);
    }

    public static void a(String str) {
        CommonLog.d("TPLog", str);
    }

    public static void b(String str, Throwable th) {
        CommonLog.w("TPLog", str, th);
    }

    public static void c(String str) {
        CommonLog.i("TPLog", str);
    }

    public static void a(String str, String str2, Throwable th) {
        CommonLog.e("TPLog." + str, str2, th);
    }

    public static void b(String str, String str2) {
        CommonLog.e("TPLog." + str, str2);
    }

    public static void a(String str, Throwable th) {
        CommonLog.e("TPLog", str, th);
    }

    public static void b(String str) {
        CommonLog.e("TPLog", str);
    }
}
