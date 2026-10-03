package io.reactivex.internal.schedulers;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.dfg;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.vba;
import com.oplus.aiunit.vision.ys3;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends zeg {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RxThreadFactory f20509l;
    public static final ScheduledExecutorService m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadFactory f20510j;
    public final AtomicReference<ScheduledExecutorService> k;

    public static final class a extends zeg.c {
        public final ScheduledExecutorService i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ys3 f20511j = new ys3();
        public volatile boolean k;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.i = scheduledExecutorService;
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        public cv5 c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.k) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(h4g.t(runnable), this.f20511j);
            this.f20511j.a(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j2 <= 0 ? this.i.submit((Callable) scheduledRunnable) : this.i.schedule((Callable) scheduledRunnable, j2, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e2) {
                dispose();
                h4g.r(e2);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.k) {
                return;
            }
            this.k = true;
            this.f20511j.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.k;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        m = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f20509l = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public b() {
        this(f20509l);
    }

    public static ScheduledExecutorService f(ThreadFactory threadFactory) {
        return dfg.a(threadFactory);
    }

    @Override // com.oplus.aiunit.vision.zeg
    public zeg.c a() {
        return new a(this.k.get());
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 d(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(h4g.t(runnable));
        try {
            scheduledDirectTask.setFuture(j2 <= 0 ? this.k.get().submit(scheduledDirectTask) : this.k.get().schedule(scheduledDirectTask, j2, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            h4g.r(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Runnable runnableT = h4g.t(runnable);
        if (j3 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableT);
            try {
                scheduledDirectPeriodicTask.setFuture(this.k.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                h4g.r(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.k.get();
        vba vbaVar = new vba(runnableT, scheduledExecutorService);
        try {
            vbaVar.b(j2 <= 0 ? scheduledExecutorService.submit(vbaVar) : scheduledExecutorService.schedule(vbaVar, j2, timeUnit));
            return vbaVar;
        } catch (RejectedExecutionException e3) {
            h4g.r(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    public b(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.k = atomicReference;
        this.f20510j = threadFactory;
        atomicReference.lazySet(f(threadFactory));
    }
}
