package com.platform.usercenter.tools;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class UCBasicUtils {
    public static final String SDK_TAG = "usBasic";

    @SuppressLint({"StaticFieldLeak"})
    public static Context sContext;

    private UCBasicUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void attachContext(Context context) {
        if (sContext == null) {
            sContext = context.getApplicationContext();
        }
    }
}
