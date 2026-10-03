package com.oplus.aiunit.vision;

import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class k55 extends ThreadPoolExecutor {
    public static final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13155j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile k55 f13156l;

    public class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            x0.logger.error(ILogger.defaultTag, "Task rejected, too many task!");
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        i = iAvailableProcessors;
        int i2 = iAvailableProcessors + 1;
        f13155j = i2;
        k = i2;
    }

    public k55(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i2, i3, j2, timeUnit, blockingQueue, threadFactory, new a());
    }

    public static k55 a() {
        if (f13156l == null) {
            synchronized (k55.class) {
                if (f13156l == null) {
                    f13156l = new k55(f13155j, k, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new z65());
                }
            }
        }
        return f13156l;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                th = e2;
            } catch (ExecutionException e3) {
                th = e3.getCause();
            }
        }
        if (th != null) {
            x0.logger.warning(ILogger.defaultTag, "Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + mtj.a(th.getStackTrace()));
        }
    }
}
