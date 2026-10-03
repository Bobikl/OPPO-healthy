package com.sensorsdata.analytics.android.sdk.util;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public class ThreadUtils {
    private static final String TAG = "SA.ThreadUtils";
    private static final Map<Integer, Map<Integer, ExecutorService>> TYPE_PRIORITY_POOLS = new HashMap();
    private static final byte TYPE_SINGLE = -1;

    public static final class LinkedBlockingQueueUtil extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile ThreadPoolExecutorUtil mPool;

        public LinkedBlockingQueueUtil() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueueUtil(boolean z) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueueUtil(int i) {
            this.mCapacity = i;
        }
    }

    public static final class ThreadPoolExecutorUtil extends ThreadPoolExecutor {
        private final AtomicInteger mSubmittedCount;
        private LinkedBlockingQueueUtil mWorkQueue;

        public ThreadPoolExecutorUtil(int i, int i2, long j2, TimeUnit timeUnit, LinkedBlockingQueueUtil linkedBlockingQueueUtil, ThreadFactory threadFactory) {
            super(i, i2, j2, timeUnit, linkedBlockingQueueUtil, threadFactory);
            this.mSubmittedCount = new AtomicInteger();
            linkedBlockingQueueUtil.mPool = this;
            this.mWorkQueue = linkedBlockingQueueUtil;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService createPool(int i, int i2) {
            if (i == -1) {
                return new ThreadPoolExecutorUtil(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueueUtil(), new UtilsThreadFactory("single", i2));
            }
            return new ThreadPoolExecutorUtil(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueueUtil(), new UtilsThreadFactory("fixed(" + i + ")", i2));
        }

        private int getSubmittedCount() {
            return this.mSubmittedCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.mSubmittedCount.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.mSubmittedCount.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                SALog.i(ThreadUtils.TAG, "This will not happen!");
                this.mWorkQueue.offer(runnable);
            } catch (Throwable unused2) {
                this.mSubmittedCount.decrementAndGet();
            }
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public UtilsThreadFactory(String str, int i) {
            this(str, i, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.namePrefix + getAndIncrement()) { // from class: com.sensorsdata.analytics.android.sdk.util.ThreadUtils.UtilsThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        super.run();
                    } catch (Throwable unused) {
                        SALog.i("ThreadUtils", "Request threw uncaught throwable");
                    }
                }
            };
            thread.setDaemon(this.isDaemon);
            thread.setPriority(this.priority);
            return thread;
        }

        public UtilsThreadFactory(String str, int i, boolean z) {
            this.namePrefix = str + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
            this.priority = i;
            this.isDaemon = z;
        }
    }

    private static ExecutorService getPoolByTypeAndPriority(int i) {
        return getPoolByTypeAndPriority(i, 5);
    }

    public static ExecutorService getSinglePool() {
        return getPoolByTypeAndPriority(-1);
    }

    private static ExecutorService getPoolByTypeAndPriority(int i, int i2) {
        ExecutorService executorServiceCreatePool;
        Map<Integer, Map<Integer, ExecutorService>> map = TYPE_PRIORITY_POOLS;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceCreatePool = ThreadPoolExecutorUtil.createPool(i, i2);
                concurrentHashMap.put(Integer.valueOf(i2), executorServiceCreatePool);
                map.put(Integer.valueOf(i), concurrentHashMap);
            } else {
                executorServiceCreatePool = map2.get(Integer.valueOf(i2));
                if (executorServiceCreatePool == null) {
                    executorServiceCreatePool = ThreadPoolExecutorUtil.createPool(i, i2);
                    map2.put(Integer.valueOf(i2), executorServiceCreatePool);
                }
            }
        }
        return executorServiceCreatePool;
    }

    public static ExecutorService getSinglePool(int i) {
        return getPoolByTypeAndPriority(-1, i);
    }
}
