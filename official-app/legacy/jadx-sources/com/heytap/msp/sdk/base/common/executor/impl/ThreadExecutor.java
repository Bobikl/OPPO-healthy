package com.heytap.msp.sdk.base.common.executor.impl;

import com.heytap.msp.sdk.base.common.executor.IExecutor;
import com.heytap.msp.sdk.base.common.log.MspLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ThreadExecutor implements IExecutor {
    private static final int KEEP_ALIVE_TIME = 60;
    private static final int MAX_POOL_SIZE = Integer.MAX_VALUE;
    private static IExecutor sThreadExecutor;
    private Executor mExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, Integer.MAX_VALUE, 60, TIME_UNIT, WORK_QUEUE, threadFactory("MSP Thread", false));
    private static final int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors() * 2;
    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    private static final BlockingQueue<Runnable> WORK_QUEUE = new LinkedBlockingQueue();

    private ThreadExecutor() {
    }

    public static IExecutor getInstance() {
        if (sThreadExecutor == null) {
            sThreadExecutor = new ThreadExecutor();
        }
        return sThreadExecutor;
    }

    private ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.heytap.msp.sdk.base.common.executor.impl.ThreadExecutor.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                MspLog.d("ThreadFactory", "new thread,name:" + thread.getName() + ",id:" + thread.getId());
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    @Override // com.heytap.msp.sdk.base.common.executor.IExecutor
    public void execute(Runnable runnable) {
        Executor executor = this.mExecutor;
        if (executor != null) {
            executor.execute(runnable);
        }
    }
}
