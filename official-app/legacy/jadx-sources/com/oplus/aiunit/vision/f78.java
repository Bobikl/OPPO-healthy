package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.core.content.pm.PackageInfoCompat;

/* JADX INFO: loaded from: classes15.dex */
public class f78 {
    public static final String CLOCK_PACKAGE = "com.coloros.alarmclock";

    public static PackageInfo a(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            a7b.b("GlobalClockVersionUtils", "not this package");
            return null;
        }
    }

    public static boolean b(Context context) {
        boolean zB = iba.b(context, CLOCK_PACKAGE);
        a7b.f("GlobalClockVersionUtils", "isClockInstalled --> " + zB);
        return zB;
    }

    public static boolean c(Context context) {
        PackageInfo packageInfoA = a(context, CLOCK_PACKAGE);
        if (packageInfoA == null) {
            return false;
        }
        boolean z = PackageInfoCompat.getLongVersionCode(packageInfoA) >= 7003000;
        a7b.f("GlobalClockVersionUtils", "[isClockVersion7_2] --> " + z);
        return z;
    }
}
