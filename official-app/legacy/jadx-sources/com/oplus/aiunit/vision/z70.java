package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class z70 {
    @Deprecated
    public static int a(Context context) {
        return b(context, context.getPackageName());
    }

    public static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            m7b.e("ApkInfoHelper", "getVersionCode failed! %s", e2.getMessage());
            return 0;
        }
    }
}
