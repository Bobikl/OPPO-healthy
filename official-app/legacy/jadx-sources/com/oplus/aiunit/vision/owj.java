package com.oplus.aiunit.vision;

import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class owj {
    public static final int a;
    public static final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15090c;
    public static final ThreadFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f15091e;
    public static final RejectedExecutionHandler f;
    public static final ExecutorService g;

    public class a implements ThreadFactory {
        public final AtomicInteger i = new AtomicInteger(1);

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.owj$a$a, reason: collision with other inner class name */
        public class RunnableC0911a implements Runnable {
            public final /* synthetic */ Runnable i;

            public RunnableC0911a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.i.run();
                } catch (Throwable th) {
                    TrackLogger.d("DRS_SDK_COMMON_ThreadPoolUtil", "error", th, new Object[0]);
                }
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0911a(runnable), "DRS-OBus-" + this.i.getAndIncrement());
        }
    }

    public static class b implements ExecutorService {
        public final ExecutorService i;

        public b(ExecutorService executorService) {
            this.i = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            return this.i.awaitTermination(j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.i.execute(new c(runnable));
            } catch (Throwable th) {
                TrackLogger.d("DRS_SDK_COMMON_ThreadPoolUtil", "execute", th, new Object[0]);
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.i.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.i.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.i.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.i.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.i.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.i.shutdownNow();
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.i.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
            return this.i.invokeAll(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.i.invokeAny(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.i.submit(runnable, t);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.i.submit(runnable);
        }
    }

    public static class c implements Runnable {
        public final Runnable i;

        public c(Runnable runnable) {
            if (runnable == null) {
                TrackLogger.e("DRS_SDK_COMMON_ThreadPoolUtil", "Runnable cannot be null in SafeRunnable", new Object[0]);
            }
            this.i = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.i;
            if (runnable != null) {
                runnable.run();
            } else {
                TrackLogger.e("DRS_SDK_COMMON_ThreadPoolUtil", "Cannot run null Runnable", new Object[0]);
            }
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        a = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        b = iMax;
        int iMin = Math.min((iAvailableProcessors * 2) + 1, 16);
        f15090c = iMin;
        a aVar = new a();
        d = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f15091e = linkedBlockingQueue;
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        f = discardPolicy;
        TrackLogger.c("DRS_SDK_COMMON_ThreadPoolUtil", "corePoolSize=%s, maxPoolSize=%s", Integer.valueOf(iMax), Integer.valueOf(iMin));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, iMin, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar, discardPolicy);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        g = b(threadPoolExecutor);
    }

    public static void a(Runnable runnable) {
        g.execute(runnable);
    }

    public static ExecutorService b(ExecutorService executorService) {
        return new b(executorService);
    }
}
