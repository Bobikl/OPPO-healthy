package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class i3e {
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
                    return d(next);
                }
                continue;
            } catch (Exception e2) {
                j1e.c("get processName form running app processes exception " + e2.getMessage());
            }
        }
        return "";
    }

    public static String b(Context context, String str) {
        String strE = e(context, str, "AppPlatformKey");
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        j1e.b("Start to get AppPlatformCode.");
        return e(context, str, "AppPlatformCode");
    }

    public static String c(Context context, int i, int i2) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        return (packagesForUid == null || packagesForUid.length != 1) ? a(context, i2) : packagesForUid[0];
    }

    public static String d(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        String[] strArr = runningAppProcessInfo.pkgList;
        if (strArr != null && strArr.length != 0) {
            return strArr[0];
        }
        String str = runningAppProcessInfo.processName;
        return str.contains(":") ? str.substring(0, str.indexOf(":")) : str;
    }

    public static String e(Context context, String str, String str2) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            return (bundle == null || !bundle.containsKey(str2)) ? "" : bundle.getString(str2);
        } catch (PackageManager.NameNotFoundException e2) {
            j1e.c("Unable to fetch metadata from teh manifest " + e2.getMessage());
            throw new RuntimeException("Unable to fetch metadata from teh manifest", e2);
        }
    }
}
