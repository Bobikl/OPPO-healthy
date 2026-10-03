package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public class gy3 {
    public static Looper a;

    public static synchronized Looper a() {
        if (a == null) {
            HandlerThread handlerThread = new HandlerThread("ConnThread");
            handlerThread.start();
            a = handlerThread.getLooper();
        }
        return a;
    }
}
