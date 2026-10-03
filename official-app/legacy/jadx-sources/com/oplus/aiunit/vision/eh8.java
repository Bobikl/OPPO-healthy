package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes15.dex */
public class eh8 {
    public static final Handler HANDLER = new Handler(Looper.getMainLooper());

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void b(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }
}
