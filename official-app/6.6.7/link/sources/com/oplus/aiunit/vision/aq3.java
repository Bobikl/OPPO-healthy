package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class aq3 {
    public static String a = null;
    public static final String b = "14.1.0";
    public static final String c = "16.0.0";

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            q8b.e("CommonUtils", "dynamic get identifier, but context is null");
            return 0;
        }
        try {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        } catch (Resources.NotFoundException e) {
            q8b.f("CommonUtils", str2 + d14.POINT_REGEX + str + " not found, error " + e);
            return 0;
        }
    }

    public static String b(Context context) {
        Bundle bundle;
        if (context == null) {
            q8b.e("CommonUtils", "get coui version, but context is null");
            return null;
        }
        String str = a;
        if (str != null) {
            return str;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            String string = (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString("coui.support.appcompat.version");
            a = string;
            return string;
        } catch (PackageManager.NameNotFoundException e) {
            q8b.f("CommonUtils", "get coui version metaData fail! error = " + e.getMessage());
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            q8b.e("CommonUtils", "compare coui version, but context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            q8b.e("CommonUtils", "compare version is empty");
            return true;
        }
        String strB = b(context);
        if (!TextUtils.isEmpty(strB)) {
            return str.compareTo(strB) < 0;
        }
        q8b.e("CommonUtils", "coui version is empty");
        return false;
    }
}
