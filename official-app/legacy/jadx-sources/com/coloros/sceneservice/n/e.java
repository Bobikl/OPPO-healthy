package com.coloros.sceneservice.n;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes13.dex */
public class e {
    public static Handler mHandler = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (t()) {
            b.getInstance().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void b(Runnable runnable) {
        mHandler.post(runnable);
    }

    public static boolean t() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
