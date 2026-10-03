package com.heytap.store.base.core.util.thread;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class MainLooper extends Handler {
    private static Object lock = new Object();
    private static Handler mainHandle;

    public static Handler getMainHandler() {
        if (mainHandle == null) {
            synchronized (lock) {
                if (mainHandle == null) {
                    mainHandle = new Handler(Looper.getMainLooper());
                }
            }
        }
        return mainHandle;
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            runnable.run();
        } else {
            getMainHandler().post(runnable);
        }
    }
}
