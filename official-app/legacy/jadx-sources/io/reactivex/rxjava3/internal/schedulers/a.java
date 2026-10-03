package io.reactivex.rxjava3.internal.schedulers;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.efg;
import com.oplus.aiunit.vision.fv5;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.uba;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a extends cfg.c {
    public final ScheduledExecutorService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f20630j;

    public a(ThreadFactory threadFactory) {
        this.i = efg.a(threadFactory);
    }

    @Override // com.oplus.aiunit.vision.cfg.c
    public io.reactivex.rxjava3.disposables.a b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // com.oplus.aiunit.vision.cfg.c
    public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f20630j ? EmptyDisposable.INSTANCE : g(runnable, j2, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.f20630j) {
            return;
        }
        this.f20630j = true;
        this.i.shutdownNow();
    }

    public ScheduledRunnable g(Runnable runnable, long j2, TimeUnit timeUnit, fv5 fv5Var) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(g4g.x(runnable), fv5Var);
        if (fv5Var != null && !fv5Var.a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.setFuture(j2 <= 0 ? this.i.submit((Callable) scheduledRunnable) : this.i.schedule((Callable) scheduledRunnable, j2, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (fv5Var != null) {
                fv5Var.c(scheduledRunnable);
            }
            g4g.u(e2);
        }
        return scheduledRunnable;
    }

    public io.reactivex.rxjava3.disposables.a h(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(g4g.x(runnable), true);
        try {
            scheduledDirectTask.setFuture(j2 <= 0 ? this.i.submit(scheduledDirectTask) : this.i.schedule(scheduledDirectTask, j2, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            g4g.u(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.f20630j;
    }

    public io.reactivex.rxjava3.disposables.a j(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Runnable runnableX = g4g.x(runnable);
        if (j3 <= 0) {
            uba ubaVar = new uba(runnableX, this.i);
            try {
                ubaVar.b(j2 <= 0 ? this.i.submit(ubaVar) : this.i.schedule(ubaVar, j2, timeUnit));
                return ubaVar;
            } catch (RejectedExecutionException e2) {
                g4g.u(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableX, true);
        try {
            scheduledDirectPeriodicTask.setFuture(this.i.scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            g4g.u(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void k() {
        if (this.f20630j) {
            return;
        }
        this.f20630j = true;
        this.i.shutdown();
    }
}
