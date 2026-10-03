package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.content.pm.PackageInfoCompat;

/* JADX INFO: loaded from: classes16.dex */
public class a3e {
    public static int a(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return (int) PackageInfoCompat.getLongVersionCode(packageInfo);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ml4.c("PackageUtil", e2.getMessage());
        }
        return 0;
    }

    public static String b(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (PackageManager.NameNotFoundException e2) {
            ml4.c("PackageUtil", e2.getMessage());
            return "";
        }
    }

    public static boolean c(Context context, String str) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Exception e2) {
            ml4.c("PackageUtil", "hasAppInstalled: ex " + e2);
            return false;
        }
    }

    public static boolean d(Context context) {
        return c(context, "com.heytap.market") || c(context, "com.oppo.market");
    }

    public static void e(Context context, String str) {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str + "&caller=" + context.getPackageName() + "&atd=true&style=1"));
        intent.addFlags(268435456);
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.oppo.market", 0);
                if (packageInfo != null && (applicationInfo2 = packageInfo.applicationInfo) != null && applicationInfo2.enabled) {
                    intent.setPackage("com.oppo.market");
                }
            } catch (Throwable unused) {
                PackageInfo packageInfo2 = packageManager.getPackageInfo("com.heytap.market", 0);
                if (packageInfo2 != null && (applicationInfo = packageInfo2.applicationInfo) != null && applicationInfo.enabled) {
                    intent.setPackage("com.heytap.market");
                }
            }
        } catch (Throwable th) {
            ml4.c("PackageUtil", "openAppStore: ex " + th);
        }
        context.startActivity(intent);
    }

    public static boolean f(Context context) {
        return g(context, "com.heytap.health");
    }

    public static boolean g(Context context, String str) {
        if (!d(context)) {
            return false;
        }
        e(context, str);
        return true;
    }
}
