package com.oplus.aiunit.vision;

import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public class l3n {
    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("xgame_router_sub_thread");
        thread.setDaemon(true);
        thread.start();
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
