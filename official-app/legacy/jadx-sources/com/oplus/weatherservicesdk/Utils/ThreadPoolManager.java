package com.oplus.weatherservicesdk.Utils;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class ThreadPoolManager {
    private static volatile ThreadPoolManager sThreadPollManager;
    private ThreadPoolExecutor mIoThreadPollManager = null;
    private ThreadPoolExecutor mComputationPoolExecutor = null;

    private ThreadPoolManager() {
    }

    public static ThreadPoolManager getInstance() {
        if (sThreadPollManager == null) {
            synchronized (ThreadPoolManager.class) {
                if (sThreadPollManager == null) {
                    sThreadPollManager = new ThreadPoolManager();
                }
            }
        }
        return sThreadPollManager;
    }

    public ThreadPoolExecutor getComputationPoolExecutor() {
        if (this.mComputationPoolExecutor == null) {
            int iMax = Math.max(2, Runtime.getRuntime().availableProcessors() / 2);
            this.mComputationPoolExecutor = new ThreadPoolExecutor(iMax, iMax, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        return this.mComputationPoolExecutor;
    }

    public ThreadPoolExecutor getIOPoolExecutor() {
        if (this.mIoThreadPollManager == null) {
            int iMax = Math.max(2, Runtime.getRuntime().availableProcessors());
            this.mIoThreadPollManager = new ThreadPoolExecutor(iMax, iMax, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        return this.mIoThreadPollManager;
    }
}
