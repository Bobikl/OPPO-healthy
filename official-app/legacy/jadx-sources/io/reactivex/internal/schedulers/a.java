package io.reactivex.internal.schedulers;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.dfg;
import com.oplus.aiunit.vision.gv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.vba;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a extends zeg.c {
    public final ScheduledExecutorService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f20508j;

    public a(ThreadFactory threadFactory) {
        this.i = dfg.a(threadFactory);
    }

    @Override // com.oplus.aiunit.vision.zeg.c
    public cv5 b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // com.oplus.aiunit.vision.zeg.c
    public cv5 c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f20508j ? EmptyDisposable.INSTANCE : e(runnable, j2, timeUnit, null);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.f20508j) {
            return;
        }
        this.f20508j = true;
        this.i.shutdownNow();
    }

    public ScheduledRunnable e(Runnable runnable, long j2, TimeUnit timeUnit, gv5 gv5Var) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(h4g.t(runnable), gv5Var);
        if (gv5Var != null && !gv5Var.a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.setFuture(j2 <= 0 ? this.i.submit((Callable) scheduledRunnable) : this.i.schedule((Callable) scheduledRunnable, j2, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (gv5Var != null) {
                gv5Var.c(scheduledRunnable);
            }
            h4g.r(e2);
        }
        return scheduledRunnable;
    }

    public cv5 f(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(h4g.t(runnable));
        try {
            scheduledDirectTask.setFuture(j2 <= 0 ? this.i.submit(scheduledDirectTask) : this.i.schedule(scheduledDirectTask, j2, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            h4g.r(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public cv5 g(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Runnable runnableT = h4g.t(runnable);
        if (j3 <= 0) {
            vba vbaVar = new vba(runnableT, this.i);
            try {
                vbaVar.b(j2 <= 0 ? this.i.submit(vbaVar) : this.i.schedule(vbaVar, j2, timeUnit));
                return vbaVar;
            } catch (RejectedExecutionException e2) {
                h4g.r(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableT);
        try {
            scheduledDirectPeriodicTask.setFuture(this.i.scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            h4g.r(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void h() {
        if (this.f20508j) {
            return;
        }
        this.f20508j = true;
        this.i.shutdown();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.f20508j;
    }
}
