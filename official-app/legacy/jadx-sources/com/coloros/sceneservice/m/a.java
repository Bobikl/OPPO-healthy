package com.coloros.sceneservice.m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.coloros.sceneservice.SceneSDKInit;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static final String TAG = "AppUtils";

    public static boolean a(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
        } catch (Exception e2) {
            f.e(TAG, e2.getMessage());
            applicationInfo = null;
        }
        return applicationInfo != null && applicationInfo.enabled;
    }

    public static boolean b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Exception e2) {
            f.e(TAG, e2.getMessage());
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e2) {
            f.e(TAG, e2.getMessage());
            return "";
        }
    }

    public static int j(String str) {
        PackageInfo packageInfo;
        if (SceneSDKInit.getContext() == null || TextUtils.isEmpty(str)) {
            f.d(TAG, "context or packageName is null");
            return 0;
        }
        try {
            PackageManager packageManager = SceneSDKInit.getContext().getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 0)) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" version code = ");
                sb.append(packageInfo.versionCode);
                f.d(TAG, sb.toString());
                return packageInfo.versionCode;
            }
        } catch (Throwable th) {
            f.d(TAG, "getAppVersionCode: throwable = " + th);
        }
        return 0;
    }

    public static String k(String str) {
        Context context = SceneSDKInit.getContext();
        try {
            return String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Exception e2) {
            f.e(TAG, e2.getMessage());
            return "";
        }
    }

    public static boolean q() {
        return j("com.coloros.sceneservice") >= 20801;
    }

    public static boolean r() {
        return j("com.coloros.sceneservice") >= 20500;
    }
}
