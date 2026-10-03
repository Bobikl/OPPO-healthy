package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public class b80 {
    @Deprecated
    public static int a(Context context) {
        return b(context, context.getPackageName());
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            q7b.e("ApkInfoHelper", "getVersionCode failed! %s", e2.getMessage());
            return 0;
        }
    }
}
