package com.heytap.accessory.stream.utils;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static volatile HandlerThread a;
    public static volatile HandlerThread b;

    public static Looper a() {
        if (a == null) {
            synchronized (a.class) {
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
            synchronized (a.class) {
                if (b == null) {
                    b = new HandlerThread("Sender-Thread");
                    b.start();
                }
            }
        }
        return b.getLooper();
    }
}
