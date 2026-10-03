package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes5.dex */
public class ufd {
    public static Handler a;

    public static synchronized void a(Runnable runnable) {
        if (a == null) {
            HandlerThread handlerThread = new HandlerThread("olink");
            handlerThread.start();
            a = new Handler(handlerThread.getLooper());
        }
        a.post(runnable);
    }
}
