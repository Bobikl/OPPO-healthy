package com.heytap.accessory.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ThreadManager {
    private static final String TAG = "ThreadManager";
    public static final String TYPE_AGENT = "agent_daemon";
    private static ThreadManager sThreadManager;
    private ExecutorService mExecutor;
    private Map<String, HandlerThread> mThreadMap = new HashMap();
    private Map<String, Handler> mHandlerMap = new HashMap();

    public static ThreadManager getInstance() {
        synchronized (ThreadManager.class) {
            if (sThreadManager == null) {
                sThreadManager = new ThreadManager();
            }
        }
        return sThreadManager;
    }

    private synchronized HandlerThread getThread(String str) {
        if (!isValidatedName(str)) {
            return null;
        }
        HandlerThread handlerThread = this.mThreadMap.get(str);
        if (handlerThread == null) {
            handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.mThreadMap.put(str, handlerThread);
        }
        return handlerThread;
    }

    private boolean isValidatedName(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public synchronized ExecutorService getExecutor() {
        if (this.mExecutor == null) {
            this.mExecutor = Executors.newCachedThreadPool();
        }
        return this.mExecutor;
    }

    public synchronized Handler getHandler(String str) {
        if (!isValidatedName(str)) {
            return null;
        }
        Handler handler = this.mHandlerMap.get(str);
        if (handler == null) {
            handler = new Handler(getLooper(str));
            this.mHandlerMap.put(str, handler);
        }
        return handler;
    }

    public synchronized Looper getLooper(String str) {
        HandlerThread thread;
        thread = getThread(str);
        return thread != null ? thread.getLooper() : null;
    }

    public synchronized boolean post(String str, Runnable runnable, long j) {
        boolean zPostDelayed = false;
        if (isValidatedName(str) && runnable != null) {
            Handler handler = getHandler(str);
            if (handler != null) {
                zPostDelayed = j > 0 ? handler.postDelayed(runnable, j) : handler.post(runnable);
            }
            return zPostDelayed;
        }
        return false;
    }

    public synchronized boolean quitThread(String str) {
        boolean zQuitSafely = false;
        if (!isValidatedName(str)) {
            return false;
        }
        HandlerThread thread = getThread(str);
        if (thread != null) {
            zQuitSafely = thread.quitSafely();
            this.mThreadMap.remove(str);
            this.mHandlerMap.remove(str);
        }
        return zQuitSafely;
    }
}
