package io.reactivex.internal.schedulers;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zeg;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class SchedulerWhen extends zeg implements cv5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final cv5 f20506j = new b();
    public static final cv5 k = io.reactivex.disposables.a.a();

    public static class DelayedAction extends ScheduledAction {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(Runnable runnable, long j2, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j2;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        public cv5 callActual(zeg.c cVar, bs3 bs3Var) {
            return cVar.c(new a(this.action, bs3Var), this.delayTime, this.unit);
        }
    }

    public static class ImmediateAction extends ScheduledAction {
        private final Runnable action;

        public ImmediateAction(Runnable runnable) {
            this.action = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        public cv5 callActual(zeg.c cVar, bs3 bs3Var) {
            return cVar.b(new a(this.action, bs3Var));
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<cv5> implements cv5 {
        public ScheduledAction() {
            super(SchedulerWhen.f20506j);
        }

        public void call(zeg.c cVar, bs3 bs3Var) {
            cv5 cv5Var;
            cv5 cv5Var2 = get();
            if (cv5Var2 != SchedulerWhen.k && cv5Var2 == (cv5Var = SchedulerWhen.f20506j)) {
                cv5 cv5VarCallActual = callActual(cVar, bs3Var);
                if (compareAndSet(cv5Var, cv5VarCallActual)) {
                    return;
                }
                cv5VarCallActual.dispose();
            }
        }

        public abstract cv5 callActual(zeg.c cVar, bs3 bs3Var);

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            cv5 cv5Var;
            cv5 cv5Var2 = SchedulerWhen.k;
            do {
                cv5Var = get();
                if (cv5Var == SchedulerWhen.k) {
                    return;
                }
            } while (!compareAndSet(cv5Var, cv5Var2));
            if (cv5Var != SchedulerWhen.f20506j) {
                cv5Var.dispose();
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    public static class a implements Runnable {
        public final bs3 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Runnable f20507j;

        public a(Runnable runnable, bs3 bs3Var) {
            this.f20507j = runnable;
            this.i = bs3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20507j.run();
            } finally {
                this.i.onComplete();
            }
        }
    }

    public static final class b implements cv5 {
        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return false;
        }
    }
}
