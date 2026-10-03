package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class gga extends cfg {
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;
    public static final RxThreadFactory m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RxThreadFactory f11751n;
    public static final c q;
    public static boolean r;
    public static final a s;
    public final ThreadFactory k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference<a> f11752l;
    public static final TimeUnit p = TimeUnit.SECONDS;
    public static final long o = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    public static final class a implements Runnable {
        public final long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f11753j;
        public final xs3 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ScheduledExecutorService f11754l;
        public final Future<?> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ThreadFactory f11755n;

        public a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.i = nanos;
            this.f11753j = new ConcurrentLinkedQueue<>();
            this.k = new xs3();
            this.f11755n = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, gga.f11751n);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f11754l = scheduledExecutorServiceNewScheduledThreadPool;
            this.m = scheduledFutureScheduleWithFixedDelay;
        }

        public static void a(ConcurrentLinkedQueue<c> concurrentLinkedQueue, xs3 xs3Var) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.l() > jC) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    xs3Var.c(cVar);
                }
            }
        }

        public static long c() {
            return System.nanoTime();
        }

        public c b() {
            if (this.k.isDisposed()) {
                return gga.q;
            }
            while (!this.f11753j.isEmpty()) {
                c cVarPoll = this.f11753j.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f11755n);
            this.k.a(cVar);
            return cVar;
        }

        public void d(c cVar) {
            cVar.n(c() + this.i);
            this.f11753j.offer(cVar);
        }

        public void e() {
            this.k.dispose();
            Future<?> future = this.m;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f11754l;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f11753j, this.k);
        }
    }

    public static final class b extends cfg.c implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f11756j;
        public final c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicBoolean f11757l = new AtomicBoolean();
        public final xs3 i = new xs3();

        public b(a aVar) {
            this.f11756j = aVar;
            this.k = aVar.b();
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.i.isDisposed() ? EmptyDisposable.INSTANCE : this.k.g(runnable, j2, timeUnit, this.i);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.f11757l.compareAndSet(false, true)) {
                this.i.dispose();
                if (gga.r) {
                    this.k.g(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f11756j.d(this.k);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f11757l.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11756j.d(this.k);
        }
    }

    public static final class c extends io.reactivex.rxjava3.internal.schedulers.a {
        public long k;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.k = 0L;
        }

        public long l() {
            return this.k;
        }

        public void n(long j2) {
            this.k = j2;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        q = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        m = rxThreadFactory;
        f11751n = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        r = Boolean.getBoolean("rx3.io-scheduled-release");
        a aVar = new a(0L, null, rxThreadFactory);
        s = aVar;
        aVar.e();
    }

    public gga() {
        this(m);
    }

    @Override // com.oplus.aiunit.vision.cfg
    public cfg.c c() {
        return new b(this.f11752l.get());
    }

    public void k() {
        a aVar = new a(o, p, this.k);
        if (fue.a(this.f11752l, s, aVar)) {
            return;
        }
        aVar.e();
    }

    public gga(ThreadFactory threadFactory) {
        this.k = threadFactory;
        this.f11752l = new AtomicReference<>(s);
        k();
    }
}
