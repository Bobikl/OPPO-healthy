package com.oppo.store.web.jsbridge;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class AsyncTaskExecutor {
    private static final ThreadPoolExecutor ASYNC_THREAD_POOL = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new AsyncTaskThreadFactory());
    private static final int JS_BRIDGE_TASK_THREAD_NUM = 3;

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void runOnAsyncThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        ASYNC_THREAD_POOL.execute(runnable);
    }

    public static void runOnMainThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static void shutDown() {
        ThreadPoolExecutor threadPoolExecutor = ASYNC_THREAD_POOL;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminating()) {
            return;
        }
        threadPoolExecutor.shutdown();
    }
}
