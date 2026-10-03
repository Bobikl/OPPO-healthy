package com.oplus.aiunit.vision;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class c38 {
    public static Boolean a;

    public static boolean a() {
        if (!wuk.b()) {
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
            uml.d("GMSUtils", "WearableOptionsClass not find");
            return false;
        }
        try {
            ApplicationInfo applicationInfo = e88.a().getPackageManager().getApplicationInfo("com.google.android.gms", 0);
            boolean z = applicationInfo != null && applicationInfo.enabled;
            if (!z) {
                uml.d("GMSUtils", "gms disable");
            }
            return z;
        } catch (PackageManager.NameNotFoundException e) {
            uml.k("GMSUtils", "getPackageManager: failed " + e);
            return false;
        }
    }
}
