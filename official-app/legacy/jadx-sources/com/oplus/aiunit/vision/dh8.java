package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes17.dex */
public class dh8 {
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

    public static void c(Runnable runnable, long j2) {
        HANDLER.postDelayed(runnable, j2);
    }
}
