package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes18.dex */
public class z9g {
    public static boolean a(Context context, String str) {
        return b(context, str, false);
    }

    public static boolean b(Context context, String str, boolean z) {
        return g(context).getBoolean(str, z);
    }

    public static int c(Context context, String str) {
        return d(context, str, 0);
    }

    public static int d(Context context, String str, int i) {
        return g(context).getInt(str, i);
    }

    public static long e(Context context, String str) {
        return f(context, str, 0L);
    }

    public static long f(Context context, String str, long j2) {
        return g(context).getLong(str, j2);
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("wallet_share", 0);
    }

    public static String h(Context context, String str) {
        return i(context, str, null);
    }

    public static String i(Context context, String str, String str2) {
        return g(context).getString(str, str2);
    }

    public static String j(String str, String str2) {
        return i(qz0.mContext, str, str2);
    }

    public static void k(Context context, String str) {
        SharedPreferences.Editor editorEdit = g(context).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static void l(Context context, String str, boolean z) {
        g(context).edit().putBoolean(str, z).apply();
    }

    public static void m(String str, boolean z) {
        l(qz0.mContext, str, z);
    }

    public static void n(Context context, String str, int i) {
        g(context).edit().putInt(str, i).apply();
    }

    public static void o(Context context, String str, long j2) {
        g(context).edit().putLong(str, j2).apply();
    }

    public static void p(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = g(context).edit();
        if (str2 == null) {
            editorEdit.remove(str).apply();
        } else {
            editorEdit.putString(str, str2).apply();
        }
    }

    public static void q(String str, String str2) {
        p(qz0.mContext, str, str2);
    }
}
