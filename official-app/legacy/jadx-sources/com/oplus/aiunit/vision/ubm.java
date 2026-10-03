package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class ubm {
    public static ubm a = new ubm();

    public static ubm a() {
        return a;
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
