package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class h3e {
    public static String a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "";
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo next = it.next();
            try {
                if (next.pid == i) {
                    return c(next);
                }
                continue;
            } catch (Exception e2) {
                l7b.d("Epona->PackageUtils", "get processName form running app processes exception %s", e2.getMessage());
            }
        }
        return "";
    }

    public static String b(int i, int i2) {
        Context contextG = ep6.g();
        if (contextG == null) {
            return "";
        }
        String[] packagesForUid = contextG.getPackageManager().getPackagesForUid(i);
        return (packagesForUid == null || packagesForUid.length != 1) ? a(contextG, i2) : packagesForUid[0];
    }

    public static String c(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        String[] strArr = runningAppProcessInfo.pkgList;
        if (strArr != null && strArr.length != 0) {
            return strArr[0];
        }
        String str = runningAppProcessInfo.processName;
        return str.contains(":") ? str.substring(0, str.indexOf(":")) : str;
    }
}
