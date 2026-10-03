package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public class agb {
    public static boolean a(Context context, String str) {
        char c2;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str + "&caller=" + context.getPackageName()));
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                packageManager.getApplicationInfo(v06.MARKET_PKG_NAME_OLD, 0);
                c2 = 1;
            } catch (PackageManager.NameNotFoundException unused) {
                packageManager.getApplicationInfo(v06.MARKET_PKG_NAME_NEW, 0);
                c2 = 2;
            }
            if (2 == c2) {
                intent.setPackage(v06.MARKET_PKG_NAME_NEW);
            } else {
                intent.setPackage(v06.MARKET_PKG_NAME_OLD);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return false;
        }
    }
}
