package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.content.pm.PackageInfoCompat;

/* JADX INFO: loaded from: classes15.dex */
public class gr2 {
    public static final String CALENDAR_7_1_NAME = "com.coloros.calendar";

    public static PackageInfo a(Context context) {
        if (TextUtils.isEmpty("com.coloros.calendar") || context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.coloros.calendar", 1);
        } catch (PackageManager.NameNotFoundException unused) {
            a7b.b("CalendarVersionUtils", "not this package");
            return null;
        }
    }

    public static int b(Context context) {
        PackageInfo packageInfoA = a(context);
        if (packageInfoA == null) {
            return 0;
        }
        return (int) PackageInfoCompat.getLongVersionCode(packageInfoA);
    }

    public static boolean c() {
        return b(b78.a()) >= 7003000;
    }

    public static boolean d() {
        return b(b78.a()) >= 7001000;
    }

    public static boolean e(Context context) {
        boolean z;
        try {
            z = (context.getPackageManager().getApplicationInfo("com.coloros.calendar", 128).metaData.getBoolean("mergeVersion") && context.getPackageManager().getApplicationInfo("com.android.providers.calendar", 128).metaData.getBoolean("mergeVersion")) && Settings.System.getInt(context.getContentResolver(), "key_calendar_migration", 0) == 1;
        } catch (Exception e2) {
            a7b.b("CalendarVersionUtils", "isMigratedVersion error " + e2.getMessage());
        }
        boolean z2 = ilj.l() >= 27;
        a7b.f("CalendarVersionUtils", "isMigratedVersion " + z + "isAbove13_1 " + z2);
        return z && z2;
    }
}
