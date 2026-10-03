package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class f3e {
    public static boolean a(String str) {
        return iba.b(b78.a(), str);
    }

    public static void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (packageManager != null) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                c(context, str2);
                return;
            }
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    public static void c(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
        }
    }

    public static void d(Context context, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (Exception e2) {
            t6b.d("PackageUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }
}
