package com.heytap.msp.okipc.client;

import android.os.Process;
import com.heytap.msp.okipc.IErrorHandler;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    public static final class a implements RejectedExecutionHandler {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            RejectedExecutionException rejectedExecutionException = new RejectedExecutionException(String.format(Locale.US, "%s thread pool exhausted, queue size: %d, active threads: %d", this.a, Integer.valueOf(threadPoolExecutor.getQueue().size()), Integer.valueOf(threadPoolExecutor.getActiveCount())));
            IErrorHandler iErrorHandlerI = c.i();
            if (iErrorHandlerI == null) {
                throw rejectedExecutionException;
            }
            iErrorHandlerI.handleError(rejectedExecutionException);
            throw rejectedExecutionException;
        }
    }

    public static final class b implements ThreadFactory {
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicInteger f7334j = new AtomicInteger(1);

        public class a implements Runnable {
            public final /* synthetic */ Runnable i;

            public a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                this.i.run();
            }
        }

        public b(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new a(runnable), String.format(Locale.US, "%s-%d", this.i, Integer.valueOf(this.f7334j.getAndIncrement())));
            thread.setDaemon(false);
            return thread;
        }
    }

    public static Executor a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("DRS-IPCC-Recv"), new a("DRS-IPCC-Recv"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("DRS-IPCC-Send"), new a("DRS-IPCC-Send"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
