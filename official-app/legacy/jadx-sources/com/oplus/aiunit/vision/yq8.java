package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes15.dex */
public class yq8 {
    public static final ThreadPoolExecutor a = c();
    public static final ThreadPoolExecutor b;

    public static class a extends AbstractExecutorService {
        public final ExecutorService i;

        public a(ExecutorService executorService) {
            this.i = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            return this.i.awaitTermination(j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.i.execute(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.i.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
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

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.i.submit(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
            return this.i.invokeAll(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.i.invokeAny(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.i.submit(callable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.i.submit(runnable, t);
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutorD = d(Runtime.getRuntime().availableProcessors());
        b = threadPoolExecutorD;
        threadPoolExecutorD.allowCoreThreadTimeOut(false);
    }

    public static ThreadPoolExecutor a() {
        return a;
    }

    public static ThreadPoolExecutor b() {
        return b;
    }

    public static ThreadPoolExecutor c() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new rv8(apj.Thread_Type_Executor_Cached));
    }

    public static ThreadPoolExecutor d(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i * 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rv8(apj.Thread_Type_Executor_Fixed));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rv8(apj.Thread_Type_Executor_Single));
        threadPoolExecutor.allowCoreThreadTimeOut(false);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rv8(apj.Thread_Type_Executor_Single));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
