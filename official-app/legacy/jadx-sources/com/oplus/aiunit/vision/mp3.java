package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class mp3 {
    public static String a = null;
    public static final String b = "14.1.0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14150c = "16.0.0";

    public static int a(Context context, String str, String str2) {
        if (context == null) {
            e7b.e("CommonUtils", "dynamic get identifier, but context is null");
            return 0;
        }
        try {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        } catch (Resources.NotFoundException e2) {
            e7b.f("CommonUtils", str2 + "." + str + " not found, error " + e2);
            return 0;
        }
    }

    public static String b(Context context) {
        Bundle bundle;
        if (context == null) {
            e7b.e("CommonUtils", "get coui version, but context is null");
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
        } catch (PackageManager.NameNotFoundException e2) {
            e7b.f("CommonUtils", "get coui version metaData fail! error = " + e2.getMessage());
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            e7b.e("CommonUtils", "compare coui version, but context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            e7b.e("CommonUtils", "compare version is empty");
            return true;
        }
        String strB = b(context);
        if (!TextUtils.isEmpty(strB)) {
            return str.compareTo(strB) < 0;
        }
        e7b.e("CommonUtils", "coui version is empty");
        return false;
    }
}
