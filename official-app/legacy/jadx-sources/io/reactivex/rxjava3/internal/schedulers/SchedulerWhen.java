package io.reactivex.rxjava3.internal.schedulers;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.cfg;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class SchedulerWhen extends cfg implements io.reactivex.rxjava3.disposables.a {
    public static final io.reactivex.rxjava3.disposables.a k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final io.reactivex.rxjava3.disposables.a f20628l = io.reactivex.rxjava3.disposables.a.d();

    public static class DelayedAction extends ScheduledAction {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(Runnable runnable, long j2, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j2;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.SchedulerWhen.ScheduledAction
        public io.reactivex.rxjava3.disposables.a callActual(cfg.c cVar, as3 as3Var) {
            return cVar.c(new a(this.action, as3Var), this.delayTime, this.unit);
        }
    }

    public static class ImmediateAction extends ScheduledAction {
        private final Runnable action;

        public ImmediateAction(Runnable runnable) {
            this.action = runnable;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.SchedulerWhen.ScheduledAction
        public io.reactivex.rxjava3.disposables.a callActual(cfg.c cVar, as3 as3Var) {
            return cVar.b(new a(this.action, as3Var));
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements io.reactivex.rxjava3.disposables.a {
        public ScheduledAction() {
            super(SchedulerWhen.k);
        }

        public void call(cfg.c cVar, as3 as3Var) {
            io.reactivex.rxjava3.disposables.a aVar;
            io.reactivex.rxjava3.disposables.a aVar2 = get();
            if (aVar2 != SchedulerWhen.f20628l && aVar2 == (aVar = SchedulerWhen.k)) {
                io.reactivex.rxjava3.disposables.a aVarCallActual = callActual(cVar, as3Var);
                if (compareAndSet(aVar, aVarCallActual)) {
                    return;
                }
                aVarCallActual.dispose();
            }
        }

        public abstract io.reactivex.rxjava3.disposables.a callActual(cfg.c cVar, as3 as3Var);

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            getAndSet(SchedulerWhen.f20628l).dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    public static class a implements Runnable {
        public final as3 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Runnable f20629j;

        public a(Runnable runnable, as3 as3Var) {
            this.f20629j = runnable;
            this.i = as3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20629j.run();
            } finally {
                this.i.onComplete();
            }
        }
    }

    public static final class b implements io.reactivex.rxjava3.disposables.a {
        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return false;
        }
    }
}
