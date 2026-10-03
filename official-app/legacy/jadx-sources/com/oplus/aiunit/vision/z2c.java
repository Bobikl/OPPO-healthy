package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes15.dex */
public class z2c {
    public static volatile Looper a;

    public static Looper a() {
        if (a == null) {
            synchronized (z2c.class) {
                if (a == null) {
                    HandlerThread handlerThread = new HandlerThread("oaf-bg");
                    handlerThread.start();
                    a = handlerThread.getLooper();
                }
            }
        }
        return a;
    }
}
