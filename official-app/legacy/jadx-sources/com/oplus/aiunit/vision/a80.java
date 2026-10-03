package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class a80 {
    public static String a;
    public static String b;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        PackageManager packageManager = context.getPackageManager();
        StringBuilder sb = new StringBuilder();
        try {
            Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
            sb.append(c(context));
            sb.append("_");
            sb.append(bundle.get("versionCommit").toString());
            sb.append("_");
            sb.append(bundle.get("versionDate").toString());
            b = sb.toString();
        } catch (Exception e2) {
            bn.c("ApkInfoHelper", e2.getMessage());
        }
        return sb.toString();
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            bn.c("ApkInfoHelper", "getVersionCode failed! exception:" + e2);
            return 0;
        }
    }

    public static String c(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String str = null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            a = str;
            return str;
        } catch (Exception e2) {
            bn.c("ApkInfoHelper", "getVersionName failed! exception:" + e2.getMessage());
            return str;
        }
    }

    public static Boolean d(Context context) {
        try {
            return Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
