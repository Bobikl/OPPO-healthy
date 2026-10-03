package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lhd {
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
