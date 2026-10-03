package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class hum {
    public static final ExecutorService a = Executors.newSingleThreadExecutor();
    public static Handler b = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.post(runnable);
    }
}
