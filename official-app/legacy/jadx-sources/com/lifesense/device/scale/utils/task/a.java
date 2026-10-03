package com.lifesense.device.scale.utils.task;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static volatile Handler a;

    public static Handler a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    HandlerThread handlerThread = new HandlerThread(a.class.getSimpleName() + "Handler");
                    handlerThread.start();
                    a = new Handler(handlerThread.getLooper());
                }
            }
        }
        return a;
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    public static void c(Runnable runnable) {
        b.a(runnable);
    }

    public static void a(Runnable runnable) {
        a().post(runnable);
    }

    public static void a(Runnable runnable, long j2) {
        a().postDelayed(runnable, j2);
    }
}
