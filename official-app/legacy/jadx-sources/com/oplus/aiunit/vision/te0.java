package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class te0 {
    public static final String DRS_PACKAGE_NAME = "com.oplus.framework.network.drs";
    public static volatile String a = "";
    public static volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile PackageInfo f16976c;
    public static Object d = new Object();

    public static PackageInfo a(Context context) {
        if (f16976c == null) {
            synchronized (d) {
                if (f16976c == null) {
                    try {
                        f16976c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        z6b.p("DrsAppUtils", "get package info error", e2);
                    }
                }
            }
        }
        return f16976c;
    }

    public static int b(Context context) {
        if (b != 0) {
            return b;
        }
        PackageInfo packageInfoA = a(context);
        if (packageInfoA != null) {
            b = packageInfoA.versionCode;
        }
        return b;
    }

    public static String c(Context context) {
        String strD = d(context);
        int iB = b(context);
        return "Appinfo{" + context.getPackageName() + "," + strD + "," + iB + "}";
    }

    public static String d(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        PackageInfo packageInfoA = a(context);
        if (packageInfoA != null) {
            String str = packageInfoA.versionName;
            if (!TextUtils.isEmpty(str)) {
                a = str;
            }
        }
        return a;
    }
}
