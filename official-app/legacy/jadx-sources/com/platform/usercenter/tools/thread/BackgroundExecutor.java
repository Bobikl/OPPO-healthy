package com.platform.usercenter.tools.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes9.dex */
public class BackgroundExecutor {
    private static volatile ExecutorService mWorkExecutor;
    private static final Object sLock = new Object();
    private static volatile HandlerThread sLooperThread;
    private static volatile Handler sMainHandler;
    private static volatile Handler sWorkHandler;

    private BackgroundExecutor() {
    }

    public static Handler getMainHandler() {
        initMainHandler();
        return sMainHandler;
    }

    public static Looper getMainLooper() {
        initMainHandler();
        return sMainHandler.getLooper();
    }

    public static Executor getWorkExecutor() {
        initWorkExecutor();
        return mWorkExecutor;
    }

    public static Handler getWorkHandler() {
        initWorkHandler();
        return sWorkHandler;
    }

    public static Looper getWorkLooper() {
        initWorkHandler();
        return sLooperThread.getLooper();
    }

    private static void initMainHandler() {
        if (sMainHandler == null) {
            synchronized (sLock) {
                if (sMainHandler == null) {
                    sMainHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
    }

    private static void initWorkExecutor() {
        if (mWorkExecutor == null) {
            synchronized (sLock) {
                if (mWorkExecutor == null) {
                    mWorkExecutor = Executors.newCachedThreadPool();
                }
            }
        }
    }

    private static void initWorkHandler() {
        if (sLooperThread == null || sWorkHandler == null) {
            synchronized (sLock) {
                if (sLooperThread == null || sWorkHandler == null) {
                    sLooperThread = new HandlerThread("BackgroundExecutor");
                    sLooperThread.start();
                    sWorkHandler = new Handler(sLooperThread.getLooper());
                }
            }
        }
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void removeOnUiThread(Runnable runnable) {
        if (sMainHandler != null) {
            sMainHandler.removeCallbacks(runnable);
        }
    }

    public static void removeOnWorkHandler(Runnable runnable) {
        if (sWorkHandler != null) {
            sWorkHandler.removeCallbacks(runnable);
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            initMainHandler();
            sMainHandler.post(runnable);
        }
    }

    public static void runOnWorkHandler(Runnable runnable) {
        initWorkHandler();
        sWorkHandler.post(runnable);
    }

    public static void runOnWorkHandlerDelay(Runnable runnable, long j2) {
        initWorkHandler();
        sWorkHandler.postDelayed(runnable, j2);
    }

    public static void runOnWorkThread(Runnable runnable) {
        initWorkExecutor();
        mWorkExecutor.execute(runnable);
    }

    public static void runOnUiThread(Runnable runnable, long j2) {
        initMainHandler();
        sMainHandler.postDelayed(runnable, j2);
    }
}
