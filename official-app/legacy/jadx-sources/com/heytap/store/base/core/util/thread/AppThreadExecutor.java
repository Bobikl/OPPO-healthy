package com.heytap.store.base.core.util.thread;

import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.p14;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class AppThreadExecutor {
    private static final int NUM_IO_BOUND_THREADS = 2;
    private static final int NUM_LIGHTWEIGHT_BACKGROUND_THREADS = 1;
    private static final AppThreadExecutor sInstance = new AppThreadExecutor();
    private final int THREAD_NUM;
    private ExecutorService executorService;
    private final Executor mBackgroundExecutor;
    private final Executor mDecodeExecutor;
    private final Executor mIoBoundExecutor;
    private final Executor mLightWeightBackgroundExecutor;

    private AppThreadExecutor() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        this.THREAD_NUM = iAvailableProcessors;
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.mIoBoundExecutor = new ThreadPoolExecutor(2, 2, 0L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10, "StoreIoBoundExecutor", true), callerRunsPolicy);
        this.mDecodeExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 0L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10, "StoreDecodeExecutor", true), callerRunsPolicy);
        this.mBackgroundExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 0L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10, "StoreBackgroundExecutor", true), callerRunsPolicy);
        this.mLightWeightBackgroundExecutor = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10, "StoreLightWeightBackgroundExecutor", true), callerRunsPolicy);
    }

    public static AppThreadExecutor getInstance() {
        return sInstance;
    }

    public void executeNormalTask(final Runnable runnable) {
        kbd.p("").i(new p14() { // from class: com.oplus.aiunit.vision.ge0
            @Override // com.oplus.aiunit.vision.p14
            public final void accept(Object obj) {
                runnable.run();
            }
        }).B(ifg.a()).w();
    }

    public <T> Future<T> executeNormalTaskWithResult(Callable<T> callable) {
        return executorService().submit(callable);
    }

    public void executeUploadTask(Runnable runnable) {
        this.mIoBoundExecutor.execute(runnable);
    }

    public synchronized ExecutorService executorService() {
        if (this.executorService == null) {
            this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.heytap.store.base.core.util.thread.AppThreadExecutor.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    return new Thread(runnable, "StoreDispatcher");
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return this.executorService;
    }

    public Executor forBackgroundTasks() {
        return this.mBackgroundExecutor;
    }

    public Executor forDecode() {
        return this.mDecodeExecutor;
    }

    public Executor forLightweightBackgroundTasks() {
        return this.mLightWeightBackgroundExecutor;
    }

    public Executor forLocalStorageRead() {
        return this.mIoBoundExecutor;
    }

    public Executor forLocalStorageWrite() {
        return this.mIoBoundExecutor;
    }

    public Executor forThumbnailProducer() {
        return this.mIoBoundExecutor;
    }
}
