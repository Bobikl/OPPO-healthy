package com.oplus.aiunit.vision;

import android.content.Intent;

/* JADX INFO: loaded from: classes18.dex */
public class t6b {
    public static String a = "WearWallet";

    public static void a(String str) {
    }

    public static void b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(":");
        sb.append(str);
    }

    public static void c(String str) {
        a7b.m(a, str);
    }

    public static void d(String str, String str2) {
        a7b.m(a + ":" + str, str2);
    }

    public static void e(String str) {
        a7b.f(a, str);
    }

    public static void f(String str, String str2) {
        a7b.f(a + ":" + str, str2);
    }

    public static void g(String str, Intent intent) {
        sca.a(str, intent);
    }

    public static void h(String str) {
        a7b.m(a + ":", str);
    }

    public static void i(String str, String str2) {
        a7b.m(a + ":" + str, str2);
    }
}
