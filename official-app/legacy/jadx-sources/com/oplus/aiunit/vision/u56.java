package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.oplus.drs.base.concurrent.DeviceTier;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class u56 {
    public static final int INGEST_BACKPRESSURE_THRESHOLD = 10000;
    public static final int PRIORITY_NORMAL = 10;
    public static final int PRIORITY_REALTIME = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile ScheduledExecutorService f17295c;
    public static volatile ExecutorService d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ExecutorService f17296e;
    public static volatile ThreadPoolExecutor f;
    public static volatile ThreadPoolExecutor g;
    public static volatile ThreadPoolExecutor h;
    public static volatile ExecutorService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile ExecutorService f17297j;
    public static volatile ThreadPoolExecutor k;
    public static volatile HandlerThread m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile Handler f17299n;
    public static volatile DeviceTier a = DeviceTier.MID;
    public static volatile boolean b = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f17298l = new LinkedBlockingQueue();
    public static final AtomicInteger o = new AtomicInteger(0);

    public class a implements Runnable {
        public final /* synthetic */ Runnable i;

        public a(Runnable runnable) {
            this.i = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.i.run();
            } finally {
                u56.o.decrementAndGet();
            }
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

    public static final class c implements ThreadFactory {
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f17300j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Integer f17301l;
        public final AtomicInteger m;

        public class a implements Runnable {
            public final /* synthetic */ boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Runnable f17302j;

            public a(boolean z, Runnable runnable) {
                this.i = z;
                this.f17302j = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (c.this.f17301l == null) {
                        if (this.i) {
                            Process.setThreadPriority(10);
                        }
                        this.f17302j.run();
                    }
                    Process.setThreadPriority(c.this.f17301l.intValue());
                } catch (Throwable unused) {
                }
                this.f17302j.run();
            }
        }

        public c(String str, boolean z) {
            this(str, z, 5);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new a(this.f17300j, runnable), String.format(Locale.US, "%s-%d", this.i, Integer.valueOf(this.m.getAndIncrement())));
            try {
                thread.setPriority(this.k);
            } catch (Throwable unused) {
            }
            return thread;
        }

        public c(String str, boolean z, int i) {
            this(str, z, i, null);
        }

        public c(String str, boolean z, int i, Integer num) {
            this.m = new AtomicInteger(1);
            this.i = str;
            this.f17300j = z;
            this.k = i;
            this.f17301l = num;
        }
    }

    public static final class d {
        public final String a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17303c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17304e;

        public d(String str, int i, int i2, int i3, long j2) {
            this.a = str;
            this.b = i;
            this.f17303c = i2;
            this.d = i3;
            this.f17304e = j2;
        }

        public String toString() {
            return String.format(Locale.US, "[%s] pool=%d, active=%d, queue=%d, completed=%d", this.a, Integer.valueOf(this.b), Integer.valueOf(this.f17303c), Integer.valueOf(this.d), Long.valueOf(this.f17304e));
        }
    }

    public interface e {
        int getPriority();
    }

    public static final class f<T> extends FutureTask<T> implements Comparable<f<T>> {
        public static final AtomicLong k = new AtomicLong(0);
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f17305j;

        public f(Callable<T> callable) {
            super(callable);
            if (callable instanceof e) {
                this.i = ((e) callable).getPriority();
            } else {
                this.i = 10;
            }
            this.f17305j = k.getAndIncrement();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(f<T> fVar) {
            int iCompare = Integer.compare(this.i, fVar.i);
            return iCompare != 0 ? iCompare : Long.compare(this.f17305j, fVar.f17305j);
        }
    }

    public static ExecutorService b() {
        int i2;
        if (f17296e == null) {
            synchronized (u56.class) {
                if (f17296e == null) {
                    int i3 = b.a[a.ordinal()];
                    int i4 = 2;
                    if (i3 == 1) {
                        i2 = 1024;
                    } else if (i3 != 2) {
                        i4 = 3;
                        i2 = 2048;
                    } else {
                        i4 = 4;
                        i2 = 4096;
                    }
                    int i5 = i4;
                    f17296e = new ThreadPoolExecutor(i5, i5, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(i2), new c("DRS-CommonBg", true), new ThreadPoolExecutor.CallerRunsPolicy());
                    ((ThreadPoolExecutor) f17296e).allowCoreThreadTimeOut(true);
                }
            }
        }
        return f17296e;
    }

    public static ExecutorService c() {
        if (g == null) {
            synchronized (u56.class) {
                if (g == null) {
                    g = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(512), new c("DRS-DB-Read", false), new ThreadPoolExecutor.CallerRunsPolicy());
                    g.allowCoreThreadTimeOut(true);
                }
            }
        }
        return g;
    }

    public static ExecutorService d() {
        if (f == null) {
            synchronized (u56.class) {
                if (f == null) {
                    f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(256), new c("DRS-DB-Write", false));
                }
            }
        }
        return f;
    }

    public static d e(ThreadPoolExecutor threadPoolExecutor, String str) {
        if (threadPoolExecutor == null) {
            return null;
        }
        return new d(str, threadPoolExecutor.getPoolSize(), threadPoolExecutor.getActiveCount(), threadPoolExecutor.getQueue().size(), threadPoolExecutor.getCompletedTaskCount());
    }

    public static d f() {
        return e((ThreadPoolExecutor) d(), "DB-Write");
    }

    public static DeviceTier g() {
        return a;
    }

    public static int h() {
        j();
        return f17298l.size();
    }

    public static int i() {
        return o.get();
    }

    public static ExecutorService j() {
        if (k == null) {
            synchronized (u56.class) {
                if (k == null) {
                    k = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, f17298l, new c("DRS-Ingest-Worker", false));
                    k.allowCoreThreadTimeOut(true);
                }
            }
        }
        return k;
    }

    public static void k(Context context) {
        int i2;
        int i3;
        if (b) {
            return;
        }
        synchronized (u56.class) {
            if (b) {
                return;
            }
            a = new np5.a(context).resolve();
            int i4 = b.a[a.ordinal()];
            if (i4 != 1) {
                int i5 = 2;
                if (i4 != 2) {
                    i2 = 512;
                } else {
                    i5 = 3;
                    i2 = 1024;
                }
                i3 = i5;
            } else {
                i2 = 256;
                i3 = 1;
            }
            f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(256), new c("DRS-DB-Write", false));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            g = new ThreadPoolExecutor(i3, i3, 30L, timeUnit, new LinkedBlockingQueue(i2), new c("DRS-DB-Read", false), new ThreadPoolExecutor.CallerRunsPolicy());
            g.allowCoreThreadTimeOut(true);
            h = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingQueue(256), new c("DRS-DB-Read-RT", false), new ThreadPoolExecutor.CallerRunsPolicy());
            h.allowCoreThreadTimeOut(true);
            f17295c = new ScheduledThreadPoolExecutor(1, new c("DRS-Scheduler", false));
            ((ScheduledThreadPoolExecutor) f17295c).setRemoveOnCancelPolicy(true);
            ((ScheduledThreadPoolExecutor) f17295c).setKeepAliveTime(60L, timeUnit);
            ((ScheduledThreadPoolExecutor) f17295c).allowCoreThreadTimeOut(true);
            b = true;
        }
    }

    public static ExecutorService l() {
        int i2;
        int i3;
        if (d == null) {
            synchronized (u56.class) {
                if (d == null) {
                    int i4 = b.a[a.ordinal()];
                    if (i4 != 1) {
                        int i5 = 2;
                        if (i4 != 2) {
                            i2 = 256;
                        } else {
                            i5 = 3;
                            i2 = 512;
                        }
                        i3 = i5;
                    } else {
                        i2 = 128;
                        i3 = 1;
                    }
                    d = new ThreadPoolExecutor(i3, i3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(i2), new c("DRS-Net", true), new ThreadPoolExecutor.CallerRunsPolicy());
                    ((ThreadPoolExecutor) d).allowCoreThreadTimeOut(true);
                }
            }
        }
        return d;
    }

    public static void m(Runnable runnable) {
        int iIncrementAndGet = o.incrementAndGet();
        if (iIncrementAndGet > 5000) {
            z6b.u("DrsExecutors", "Reconciliation queue depth warning: pending=" + iIncrementAndGet);
        }
        n().post(new a(runnable));
    }

    public static Handler n() {
        if (f17299n == null) {
            synchronized (u56.class) {
                if (f17299n == null) {
                    m = new HandlerThread("DRS-Reconciliation-V2", 10);
                    m.start();
                    f17299n = new Handler(m.getLooper());
                }
            }
        }
        return f17299n;
    }

    public static ScheduledExecutorService o() {
        if (f17295c == null) {
            synchronized (u56.class) {
                if (f17295c == null) {
                    f17295c = new ScheduledThreadPoolExecutor(2, new c("DRS-Schedule", false));
                    ((ScheduledThreadPoolExecutor) f17295c).setKeepAliveTime(60L, TimeUnit.SECONDS);
                    ((ScheduledThreadPoolExecutor) f17295c).setRemoveOnCancelPolicy(true);
                    ((ScheduledThreadPoolExecutor) f17295c).allowCoreThreadTimeOut(true);
                }
            }
        }
        return f17295c;
    }

    public static <T> Future<T> p(Callable<T> callable) {
        f fVar = new f(callable);
        d().execute(fVar);
        return fVar;
    }

    public static ExecutorService q() {
        if (f17297j == null) {
            synchronized (u56.class) {
                if (f17297j == null) {
                    f17297j = Executors.newSingleThreadExecutor(new c("DRS-Upload-Nr", false, 5));
                }
            }
        }
        return f17297j;
    }

    public static ExecutorService r() {
        if (i == null) {
            synchronized (u56.class) {
                if (i == null) {
                    i = Executors.newSingleThreadExecutor(new c("DRS-Upload-Rt", false, 5, -8));
                }
            }
        }
        return i;
    }
}
