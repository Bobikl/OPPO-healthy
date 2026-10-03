package com.heytap.mspsdk.executor;

import com.heytap.mspsdk.log.MspLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes19.dex */
public class e implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f7400c;
    public static final TimeUnit d = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f7401e = new LinkedBlockingQueue(30);
    public final ThreadPoolExecutor a;
    public final AtomicLong b = new AtomicLong(0);

    public e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 15, 60L, d, f7401e, i(), h());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static a d() {
        if (f7400c == null) {
            f7400c = new e();
        }
        return f7400c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown()) {
            return;
        }
        threadPoolExecutor.getQueue().poll();
        threadPoolExecutor.execute(runnable);
        MspLog.v("ThreadExecutor", "Task rejected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Thread g(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: com.heytap.mspsdk.executor.d
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f(runnable);
            }
        }, "MSPSDK-Pool-" + this.b.incrementAndGet());
        thread.setDaemon(false);
        return thread;
    }

    @Override // com.heytap.mspsdk.executor.a
    public void execute(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(runnable);
        }
    }

    public final RejectedExecutionHandler h() {
        return new RejectedExecutionHandler() { // from class: com.heytap.mspsdk.executor.b
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                this.a.e(runnable, threadPoolExecutor);
            }
        };
    }

    public final ThreadFactory i() {
        return new ThreadFactory() { // from class: com.heytap.mspsdk.executor.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.i.g(runnable);
            }
        };
    }
}
