package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes8.dex */
public class w5n {
    public static int a() {
        return 1010;
    }

    public static boolean b(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(bmm.a("Y29tLmhleXRhcC54Z2FtZQ=="), 128).packageName.equals(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(bmm.a("Y29tLmhleXRhcC54Z2FtZQ=="), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static boolean d(Context context) {
        return b(context, bmm.a("Y29tLmhleXRhcC54Z2FtZQ=="));
    }
}
