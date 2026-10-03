package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
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
public final class fga extends zeg {
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RxThreadFactory f11342l;
    public static final RxThreadFactory m;
    public static final c p;
    public static final a q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadFactory f11344j;
    public final AtomicReference<a> k;
    public static final TimeUnit o = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f11343n = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class a implements Runnable {
        public final long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f11345j;
        public final ys3 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ScheduledExecutorService f11346l;
        public final Future<?> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ThreadFactory f11347n;

        public a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.i = nanos;
            this.f11345j = new ConcurrentLinkedQueue<>();
            this.k = new ys3();
            this.f11347n = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, fga.m);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f11346l = scheduledExecutorServiceNewScheduledThreadPool;
            this.m = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.f11345j.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.f11345j) {
                if (cVar.i() > jC) {
                    return;
                }
                if (this.f11345j.remove(cVar)) {
                    this.k.c(cVar);
                }
            }
        }

        public c b() {
            if (this.k.isDisposed()) {
                return fga.p;
            }
            while (!this.f11345j.isEmpty()) {
                c cVarPoll = this.f11345j.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f11347n);
            this.k.a(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.j(c() + this.i);
            this.f11345j.offer(cVar);
        }

        public void e() {
            this.k.dispose();
            Future<?> future = this.m;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f11346l;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    public static final class b extends zeg.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f11348j;
        public final c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicBoolean f11349l = new AtomicBoolean();
        public final ys3 i = new ys3();

        public b(a aVar) {
            this.f11348j = aVar;
            this.k = aVar.b();
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        public cv5 c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.i.isDisposed() ? EmptyDisposable.INSTANCE : this.k.e(runnable, j2, timeUnit, this.i);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.f11349l.compareAndSet(false, true)) {
                this.i.dispose();
                this.f11348j.d(this.k);
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f11349l.get();
        }
    }

    public static final class c extends io.reactivex.internal.schedulers.a {
        public long k;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.k = 0L;
        }

        public long i() {
            return this.k;
        }

        public void j(long j2) {
            this.k = j2;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        p = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f11342l = rxThreadFactory;
        m = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        q = aVar;
        aVar.e();
    }

    public fga() {
        this(f11342l);
    }

    @Override // com.oplus.aiunit.vision.zeg
    public zeg.c a() {
        return new b(this.k.get());
    }

    public void f() {
        a aVar = new a(f11343n, o, this.f11344j);
        if (fue.a(this.k, q, aVar)) {
            return;
        }
        aVar.e();
    }

    public fga(ThreadFactory threadFactory) {
        this.f11344j = threadFactory;
        this.k = new AtomicReference<>(q);
        f();
    }
}
