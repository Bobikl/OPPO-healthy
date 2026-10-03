package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class yan {
    public static int a() {
        return 1010;
    }

    public static boolean b(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(kqm.a("Y29tLmhleXRhcC54Z2FtZQ=="), 128).packageName.equals(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(kqm.a("Y29tLmhleXRhcC54Z2FtZQ=="), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static boolean d(Context context) {
        return b(context, kqm.a("Y29tLmhleXRhcC54Z2FtZQ=="));
    }
}
