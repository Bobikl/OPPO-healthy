package com.oplus.aiunit.vision;

import android.os.Process;
import com.heytap.msp.okipc.exception.IPCServerRejectedException;
import com.oplus.drs.base.concurrent.DeviceTier;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class lu9 {
    public static volatile ThreadPoolExecutor a;
    public static int b;

    public class a extends ThreadPoolExecutor {
        public a(int i, int i2, long j2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j2, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int activeCount = getActiveCount();
            int size = getQueue().size();
            if (activeCount >= lu9.b) {
                z6b.u("IPC_EXECUTOR", "execute: threads at limit! activeCount=" + activeCount + "/" + lu9.b + ", queueSize=" + size + ", poolSize=" + getPoolSize() + ", completedTasks=" + getCompletedTaskCount());
            }
            super.execute(runnable);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DeviceTier.values().length];
            a = iArr;
            try {
                iArr[DeviceTier.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DeviceTier.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DeviceTier.MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class c implements RejectedExecutionHandler {
        public c() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            throw new IPCServerRejectedException("IPC dispatch blocked: all " + threadPoolExecutor.getActiveCount() + " worker threads are busy, queue full (" + threadPoolExecutor.getQueue().size() + "/" + (threadPoolExecutor.getQueue().size() + threadPoolExecutor.getQueue().remainingCapacity()) + "). Check for blocking operations in IPC handlers.");
        }
    }

    public static final class d implements ThreadFactory {
        public final AtomicInteger i;

        public class a implements Runnable {
            public final /* synthetic */ Runnable i;

            public a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(-2);
                } catch (Throwable unused) {
                }
                this.i.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new a(runnable), String.format(Locale.US, "DRS-IPC-%d", Integer.valueOf(this.i.getAndIncrement())));
            thread.setDaemon(false);
            return thread;
        }

        public d() {
            this.i = new AtomicInteger(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ThreadPoolExecutor b() {
        int i;
        if (a == null) {
            synchronized (lu9.class) {
                if (a == null) {
                    DeviceTier deviceTierG = u56.g();
                    int i2 = b.a[deviceTierG.ordinal()];
                    if (i2 != 1) {
                        int i3 = 2;
                        if (i2 == 2) {
                            i3 = 3;
                        }
                        i = i3;
                    } else {
                        i = 1;
                    }
                    b = i;
                    z6b.q("IPC_EXECUTOR", "IPCExecutor created: deviceTier=" + deviceTierG + ", corePoolSize=" + i + ", maxPoolSize=" + i + ", queue=unbounded, keepAliveTime=30s");
                    a = new a(i, i, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d(), new c());
                    a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return a;
    }
}
