package com.platform.usercenter.tools.log.hook;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class UCHookLogUtil {
    public static void d(String str, int i, String str2) {
        UCLogUtil.d(str2 + str, i);
    }

    public static void dAll(String str, String str2, String str3) {
        UCLogUtil.dAll(str3 + str, str2);
    }

    public static void detailE(String str, String str2) {
        UCLogUtil.detailE(str2 + str);
    }

    public static void detailI(String str, String str2) {
        UCLogUtil.detailI(str2 + str);
    }

    public static void e(String str, String str2, String str3) {
        UCLogUtil.e(str3 + str, str2);
    }

    public static void i(String str, String str2, String str3) {
        UCLogUtil.i(str3 + str, str2);
    }

    public static void traceE(String str, String str2) {
        UCLogUtil.traceE(str2 + str);
    }

    public static void w(String str, String str2, String str3) {
        UCLogUtil.w(str3 + str, str2);
    }

    public static void d(String str, String str2, String str3) {
        UCLogUtil.d(str3 + str, str2);
    }

    public static void e(String str, String str2) {
        UCLogUtil.e(str2, str);
    }

    public static void i(String str, int i, String str2) {
        UCLogUtil.i(str2 + str, i);
    }

    public static void d(String str, String str2) {
        UCLogUtil.d(str2, str);
    }

    public static void e(String str, Exception exc, String str2) {
        UCLogUtil.e(str2 + str, exc);
    }

    public static void i(String str, String str2) {
        UCLogUtil.i(str2, str);
    }

    public static void e(Exception exc, String str) {
        UCLogUtil.e(str, exc);
    }

    public static void i(String str, double d, String str2) {
        UCLogUtil.i(str2 + str, d);
    }

    public static void i(String str, long j2, String str2) {
        UCLogUtil.i(str2 + str, j2);
    }

    public static void i(String str, float f, String str2) {
        UCLogUtil.i(str2 + str, f);
    }
}
