package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class en {
    public static boolean a(Context context, String str) {
        g9f.a().b("PackageManager", "getPackageInfo", "获取get package info4");
        return false;
    }

    public static String b(Context context) {
        g9f.a().b("PackageManager", "getPackageInfo", "获取get package info4");
        return "-1";
    }

    public static List<ResolveInfo> c(Intent intent) {
        try {
            return b78.a().getPackageManager().queryIntentActivities(intent, 65536);
        } catch (Exception e2) {
            a7b.b("SdkUtil", "isActivityExist: " + e2.getMessage());
            return new ArrayList();
        }
    }

    public static List<ResolveInfo> d(PackageManager packageManager, Intent intent, int i) {
        g9f.a().b("PackageManager", "queryIntentActivities", "获取get package info2");
        return m3k.h() ? c(intent) : new ArrayList();
    }
}
