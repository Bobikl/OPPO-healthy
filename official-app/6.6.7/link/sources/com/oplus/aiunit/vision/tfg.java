package com.oplus.aiunit.vision;

import android.net.Uri;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class tfg {
    public static boolean a(String str) {
        try {
            return "true".equals(Uri.parse(str).getQueryParameter("WHITE_DOMAIN"));
        } catch (Exception e) {
            y8b.g("Failed to parse white domain parameter: " + e.getMessage(), new Throwable[0]);
            return false;
        }
    }

    public static void b(String str) {
        agg.a(str);
    }

    public static boolean c(String str) {
        boolean zB = agg.b(str);
        y8b.l("SafeHelper", "verifyHitPkgBlackList:" + zB);
        return zB;
    }

    public static boolean d(String str, int i) {
        boolean zC = agg.c(str, i);
        y8b.l("SafeHelper", "hitWhiteHostSafeLevel:" + zC);
        return zC;
    }

    public static boolean e(String str) {
        boolean z = a(str) || agg.d(str);
        y8b.l("SafeHelper", "hitWhiteHost:" + z);
        return z;
    }
}
