package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class uy3 {
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
