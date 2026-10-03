package com.oplus.aiunit.vision;

import android.os.Build;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class wrm {
    public static wrm a = new wrm();

    public static wrm a() {
        return a;
    }

    public static String b(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static String c() {
        return "android";
    }

    public static boolean d() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i] + com.heytap.health.safety.safetycheck.a.BINARY_SU).exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean e() {
        try {
            return Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic");
        } catch (Exception unused) {
            return false;
        }
    }

    public static String f() {
        return Build.BOARD;
    }

    public static String g() {
        return Build.BRAND;
    }

    public static String h() {
        return Build.DEVICE;
    }

    public static String i() {
        return Build.DISPLAY;
    }

    public static String j() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String k() {
        return Build.MANUFACTURER;
    }

    public static String l() {
        return Build.MODEL;
    }

    public static String m() {
        return Build.PRODUCT;
    }

    public static String n() {
        return Build.VERSION.RELEASE;
    }

    public static String o() {
        return Build.VERSION.SDK;
    }

    public static String p() {
        return Build.TAGS;
    }

    public static String q() {
        return b("ro.kernel.qemu", "0");
    }
}
