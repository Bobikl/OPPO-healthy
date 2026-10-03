package io.reactivex.rxjava3.internal.schedulers;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.efg;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.uba;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends cfg {
    public static final RxThreadFactory m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ScheduledExecutorService f20631n;
    public final ThreadFactory k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f20632l;

    public static final class a extends cfg.c {
        public final ScheduledExecutorService i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final xs3 f20633j = new xs3();
        public volatile boolean k;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.i = scheduledExecutorService;
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.k) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(g4g.x(runnable), this.f20633j);
            this.f20633j.a(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j2 <= 0 ? this.i.submit((Callable) scheduledRunnable) : this.i.schedule((Callable) scheduledRunnable, j2, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e2) {
                dispose();
                g4g.u(e2);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.k) {
                return;
            }
            this.k = true;
            this.f20633j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f20631n = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        m = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public b() {
        this(m);
    }

    public static ScheduledExecutorService k(ThreadFactory threadFactory) {
        return efg.a(threadFactory);
    }

    @Override // com.oplus.aiunit.vision.cfg
    public cfg.c c() {
        return new a(this.f20632l.get());
    }

    @Override // com.oplus.aiunit.vision.cfg
    public io.reactivex.rxjava3.disposables.a h(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(g4g.x(runnable), true);
        try {
            scheduledDirectTask.setFuture(j2 <= 0 ? this.f20632l.get().submit(scheduledDirectTask) : this.f20632l.get().schedule(scheduledDirectTask, j2, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            g4g.u(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // com.oplus.aiunit.vision.cfg
    public io.reactivex.rxjava3.disposables.a j(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Runnable runnableX = g4g.x(runnable);
        if (j3 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableX, true);
            try {
                scheduledDirectPeriodicTask.setFuture(this.f20632l.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                g4g.u(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f20632l.get();
        uba ubaVar = new uba(runnableX, scheduledExecutorService);
        try {
            ubaVar.b(j2 <= 0 ? scheduledExecutorService.submit(ubaVar) : scheduledExecutorService.schedule(ubaVar, j2, timeUnit));
            return ubaVar;
        } catch (RejectedExecutionException e3) {
            g4g.u(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    public b(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f20632l = atomicReference;
        this.k = threadFactory;
        atomicReference.lazySet(k(threadFactory));
    }
}
