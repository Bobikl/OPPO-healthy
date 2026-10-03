package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class re0 {
    public static String a(String str, String str2) {
        return str + "." + str2;
    }

    public static int b(Context context, String str, String str2) {
        String str3;
        StringBuilder sb;
        String str4;
        String string;
        if (context == null) {
            string = "getPlatformSDKVersion: context is null";
        } else {
            if (TextUtils.isEmpty(str)) {
                sb = new StringBuilder();
                str4 = "getPlatformSDKVersion: platformPackageName is ";
            } else {
                if (c(context, str)) {
                    try {
                        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(str, a(str, str2)), 128);
                        if (activityInfo == null) {
                            str3 = "getPlatformSDKVersion: appInfo is null";
                        } else {
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null) {
                                return bundle.getInt("BD_PLATFORM_SDK_VERSION", -1);
                            }
                            str3 = "getPlatformSDKVersion: appInfo.metaData is null";
                        }
                        h7b.a("AppUtil", str3);
                    } catch (PackageManager.NameNotFoundException e2) {
                        h7b.b("AppUtil", "getPlatformSDKVersion: fail to getActivityInfo", e2);
                    }
                    return -1;
                }
                sb = new StringBuilder();
                str4 = "getPlatformSDKVersion: app has not installed ";
            }
            sb.append(str4);
            sb.append(str);
            string = sb.toString();
        }
        h7b.a("AppUtil", string);
        return -1;
    }

    public static boolean c(Context context, String str) {
        String str2;
        if (context == null) {
            str2 = "isAppInstalled: context is null";
        } else {
            if (!TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                try {
                    if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                        return true;
                    }
                    h7b.a("AppUtil", "isAppInstalled: packageInfo is null");
                    return false;
                } catch (Exception e2) {
                    h7b.b("AppUtil", "isAppInstalled: fail to getPackageInfo", e2);
                    return false;
                }
            }
            str2 = "isAppInstalled: platformPackageName is " + str;
        }
        h7b.a("AppUtil", str2);
        return false;
    }
}
