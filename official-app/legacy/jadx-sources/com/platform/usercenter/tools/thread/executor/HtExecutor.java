package com.platform.usercenter.tools.thread.executor;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class HtExecutor implements ExecutorService {
    private static final String DEFAULT_UI_SINGLE_EXECUTOR_NAME = "core-single";
    private static final int MAXIMUM_AUTOMATIC_THREAD_COUNT = 4;
    private static volatile int bestThreadCount;
    private final ExecutorService delegate;

    public static class DefaultThreadFactory implements ThreadFactory {
        private static final int DEFAULT_PRIORITY = 9;
        private final String name;
        private int threadNum;

        public DefaultThreadFactory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "ui-xy-" + this.name + "-thread-" + this.threadNum) { // from class: com.platform.usercenter.tools.thread.executor.HtExecutor.DefaultThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(9);
                    try {
                        super.run();
                    } catch (Throwable unused) {
                    }
                }
            };
            this.threadNum = this.threadNum + 1;
            return thread;
        }
    }

    public HtExecutor(ExecutorService executorService) {
        this.delegate = executorService;
    }

    public static int calculateBestThreadCount() {
        if (bestThreadCount == 0) {
            bestThreadCount = Math.min(4, RuntimeCompat.availableProcessors());
        }
        return bestThreadCount;
    }

    public static HtExecutor newSingleExecutor() {
        return newSingleExecutor(DEFAULT_UI_SINGLE_EXECUTOR_NAME);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        if (isShutdown()) {
            return;
        }
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.delegate.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public static HtExecutor newSingleExecutor(String str) {
        return new HtExecutor(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory(str)));
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.delegate.submit(callable);
    }
}
