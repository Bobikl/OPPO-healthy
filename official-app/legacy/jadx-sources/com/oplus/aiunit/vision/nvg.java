package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes19.dex */
public final class nvg {
    public static final String[] a = {uvg.j(), uvg.e(), uvg.c(), uvg.d(), uvg.f(), uvg.h(), uvg.i()};
    public static final String[] b = {uvg.j(), uvg.f(), uvg.b(), uvg.g(), uvg.h(), uvg.i()};

    public static int a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            Log.e("SvcPkgInfo", "getVersionCode", e2);
            return 0;
        }
    }
}
