package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class phb {
    public static boolean a(Context context, String str) {
        char c;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str + "&caller=" + context.getPackageName()));
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                packageManager.getApplicationInfo(t16.MARKET_PKG_NAME_OLD, 0);
                c = 1;
            } catch (PackageManager.NameNotFoundException unused) {
                packageManager.getApplicationInfo(t16.MARKET_PKG_NAME_NEW, 0);
                c = 2;
            }
            if (2 == c) {
                intent.setPackage(t16.MARKET_PKG_NAME_NEW);
            } else {
                intent.setPackage(t16.MARKET_PKG_NAME_OLD);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return false;
        }
    }
}
