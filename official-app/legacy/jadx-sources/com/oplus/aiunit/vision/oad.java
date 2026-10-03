package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class oad {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static oad f14860c;
    public static Handler d;
    public final AtomicInteger a = new AtomicInteger(1);
    public ExecutorService b;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            Thread thread = (Thread) message.obj;
            wil.b("OafThreadPool", "handleMessage: timeout " + message.what + " " + thread);
            thread.interrupt();
        }
    }

    public static class b extends ThreadPoolExecutor {
        public final Handler i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f14861j;

        public b(int i, int i2, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, Handler handler, long j3) {
            super(i, i2, j2, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
            this.i = handler;
            this.f14861j = j3;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            this.i.removeMessages(runnable.hashCode());
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread thread, Runnable runnable) {
            this.i.sendMessageDelayed(this.i.obtainMessage(runnable.hashCode(), thread), this.f14861j);
        }
    }

    public oad() {
        HandlerThread handlerThread = new HandlerThread("oaf-timeout");
        handlerThread.start();
        d = new a(handlerThread.getLooper());
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.b = new b(0, 1, 30L, TimeUnit.SECONDS, linkedBlockingQueue, new ThreadFactory() { // from class: com.oplus.aiunit.vision.mad
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.i.d(runnable);
            }
        }, new RejectedExecutionHandler() { // from class: com.oplus.aiunit.vision.nad
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                oad.e(linkedBlockingQueue, runnable, threadPoolExecutor);
            }
        }, d, 15000L);
    }

    public static void c() {
        if (f14860c == null) {
            synchronized (oad.class) {
                if (f14860c == null) {
                    f14860c = new oad();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Thread d(Runnable runnable) {
        return new qv8(runnable, "oaf-pool-" + this.a.getAndIncrement());
    }

    public static /* synthetic */ void e(LinkedBlockingQueue linkedBlockingQueue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        wil.b("OafThreadPool", "OafThreadPool: thread pool has full " + linkedBlockingQueue.size() + " " + runnable + threadPoolExecutor);
        throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString());
    }

    public static void f(Runnable runnable) {
        c();
        d.post(runnable);
    }

    public static void g(Runnable runnable) {
        c();
        f14860c.b.submit(runnable);
    }
}
