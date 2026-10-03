package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes17.dex */
public class d3c {
    public static volatile HandlerThread a;
    public static volatile Handler b;

    public static Handler a() {
        if (b == null) {
            synchronized (d3c.class) {
                if (b == null) {
                    a = new HandlerThread("default_monitor_name");
                    a.start();
                    b = new Handler(a.getLooper());
                }
            }
        }
        return b;
    }
}
