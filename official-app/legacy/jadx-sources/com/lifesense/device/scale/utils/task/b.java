package com.lifesense.device.scale.utils.task;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static volatile Handler a;

    public static Handler a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new Handler(Looper.getMainLooper());
                }
            }
        }
        return a;
    }

    public static void a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }
}
