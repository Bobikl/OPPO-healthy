package com.heytap.accessory.pair.connectivity.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.heytap.accessory.pair.logging.PairLog;
import com.oplus.aiunit.vision.zq8;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public class ThreadManager {
    private static final String TAG = "ThreadManager";
    public static final String TYPE_DAEMON = "daemon";
    private static ThreadManager sThreadManager;
    private ExecutorService mExecutor;
    private Map<String, HandlerThread> mThreadMap = new HashMap();
    private Map<String, Handler> mHandlerMap = new HashMap();

    public static synchronized ThreadManager getInstance() {
        if (sThreadManager == null) {
            sThreadManager = new ThreadManager();
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
            this.mExecutor = zq8.a("oaf-tm");
        }
        return this.mExecutor;
    }

    public synchronized Handler getHandler(String str) {
        if (!isValidatedName(str)) {
            return null;
        }
        Handler handler = this.mHandlerMap.get(str);
        if (handler == null) {
            Looper looper = getLooper(str);
            if (looper != null) {
                handler = new Handler(looper);
                this.mHandlerMap.put(str, handler);
            } else {
                PairLog.e(TAG, "getHandler: loop is null " + str);
            }
        }
        return handler;
    }

    public synchronized Looper getLooper(String str) {
        HandlerThread thread;
        thread = getThread(str);
        return thread != null ? thread.getLooper() : null;
    }

    public synchronized boolean post(String str, Runnable runnable, long j2) {
        boolean zPostDelayed = false;
        if (isValidatedName(str) && runnable != null) {
            Handler handler = getHandler(str);
            if (handler != null) {
                zPostDelayed = j2 > 0 ? handler.postDelayed(runnable, j2) : handler.post(runnable);
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
