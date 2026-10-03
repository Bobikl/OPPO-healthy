package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class j80 {
    @Deprecated
    public static int a(Context context) {
        return b(context, context.getPackageName());
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            y8b.e("ApkInfoHelper", "getVersionCode failed! %s", e.getMessage());
            return 0;
        }
    }
}
