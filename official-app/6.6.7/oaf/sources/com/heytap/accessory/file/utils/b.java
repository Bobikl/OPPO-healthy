package com.heytap.accessory.file.utils;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static volatile HandlerThread a;
    public static volatile HandlerThread b;

    public static Looper a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new HandlerThread("Receiver-Thread");
                    a.start();
                }
            }
        }
        return a.getLooper();
    }

    public static Looper b() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new HandlerThread("Sender-Thread");
                    b.start();
                }
            }
        }
        return b.getLooper();
    }
}
