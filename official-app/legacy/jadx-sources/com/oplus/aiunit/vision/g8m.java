package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
public final class g8m {

    @SuppressLint({"StaticFieldLeak"})
    public static Context a = null;
    public static boolean b = false;
    public static final int sdkVersion = 2010300;

    public static Context a() {
        return a;
    }

    public static boolean b() {
        return b;
    }

    public static void c(Context context) {
        a = context;
        b = true;
    }
}
