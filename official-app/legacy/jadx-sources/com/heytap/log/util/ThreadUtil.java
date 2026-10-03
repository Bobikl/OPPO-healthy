package com.heytap.log.util;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ThreadUtil {
    private static final ExecutorService executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());

    public static void executeInThreadPool(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runInThreadPool(Runnable runnable) {
        executor.execute(runnable);
    }

    public static void shutdown() {
        executor.shutdown();
    }
}
