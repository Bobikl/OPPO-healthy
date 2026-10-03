package com.lifesense.device.scale.context;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public class LDAppHolder {
    public static String associatedId = null;
    public static boolean autoLogin = false;
    public static Context mContext;
    public static int subscriptionId;
    public static int tenantId;
    public static long userId;

    public static void clear() {
        tenantId = 0;
        subscriptionId = 0;
        associatedId = "";
        userId = 0L;
    }

    public static String getAppMsg() {
        return "[" + getAppName() + "][" + getVersionName() + "][" + getVersionCode() + "]";
    }

    public static String getAppName() {
        Context context = getContext();
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static String getAssociatedId() {
        return associatedId;
    }

    public static Context getContext() {
        return mContext;
    }

    public static int getSubscriptionId() {
        return subscriptionId;
    }

    public static int getTenantId() {
        return tenantId;
    }

    public static long getUserId() {
        return userId;
    }

    public static String getVersionCode() {
        try {
            Context context = getContext();
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode + "";
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getVersionName() {
        try {
            Context context = getContext();
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return (str == null || str.lastIndexOf("(") == -1) ? str : str.substring(0, str.lastIndexOf("("));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void init(Context context, int i, int i2, String str, long j2) {
        mContext = context.getApplicationContext();
        userId = j2;
        tenantId = i;
        subscriptionId = i2;
        associatedId = str;
    }

    public static boolean isAutoLogin() {
        return autoLogin;
    }

    public static void setAutoLogin(boolean z) {
        autoLogin = z;
    }
}
