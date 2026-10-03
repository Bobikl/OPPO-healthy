package com.oplus.aiunit.vision;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes5.dex */
public class z18 {
    public static Boolean a;

    public static boolean a() {
        if (!ark.b()) {
            return false;
        }
        if (a == null) {
            try {
                Class.forName("com.google.android.gms.wearable.Wearable$WearableOptions$Builder");
                a = Boolean.TRUE;
            } catch (Exception unused) {
                a = Boolean.FALSE;
                return false;
            }
        }
        if (!a.booleanValue()) {
            wil.d("GMSUtils", "WearableOptionsClass not find");
            return false;
        }
        try {
            ApplicationInfo applicationInfo = b78.a().getPackageManager().getApplicationInfo("com.google.android.gms", 0);
            boolean z = applicationInfo != null && applicationInfo.enabled;
            if (!z) {
                wil.d("GMSUtils", "gms disable");
            }
            return z;
        } catch (PackageManager.NameNotFoundException e2) {
            wil.k("GMSUtils", "getPackageManager: failed " + e2);
            return false;
        }
    }
}
