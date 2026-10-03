package com.lifesense.android.bluetooth.core.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import com.oplus.aiunit.vision.f58;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale"})
public class k {
    static {
        Uri.parse("content://sms/");
    }

    public static String a(Context context) {
        return "gpsStatus=" + c(context) + "; locationPermission=" + b(context);
    }

    public static boolean b(Context context) {
        try {
            return a(context, "android.permission.ACCESS_FINE_LOCATION");
        } catch (Exception e2) {
            com.lifesense.android.bluetooth.core.business.log.d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception, true, "failed to get fine location permission,has exception:" + e2.toString(), null);
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled(f58.GPS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        if (context != null) {
            try {
                if (context.getPackageManager() != null && context.getPackageName() != null && str != null) {
                    PackageManager packageManager = context.getPackageManager();
                    String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                    if (strArr != null && strArr.length != 0) {
                        for (String str2 : strArr) {
                            if (str.equalsIgnoreCase(str2) && packageManager.checkPermission(str2, context.getPackageName()) == 0) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
