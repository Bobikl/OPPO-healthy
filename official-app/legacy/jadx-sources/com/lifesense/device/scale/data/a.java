package com.lifesense.device.scale.data;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static volatile a b;
    public Handler a;

    public a() {
        b();
        a();
    }

    public static a c() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("devicemanager_db_read_thread");
        handlerThread.start();
        new Handler(handlerThread.getLooper());
    }

    public final void b() {
        HandlerThread handlerThread = new HandlerThread("devicemanager_db_write_thread");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.a.post(runnable);
    }
}
