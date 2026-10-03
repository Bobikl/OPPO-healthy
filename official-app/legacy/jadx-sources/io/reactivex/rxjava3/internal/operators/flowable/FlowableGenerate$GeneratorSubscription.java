package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.ml6;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableGenerate$GeneratorSubscription<T, S> extends AtomicLong implements ml6<T>, c3j {
    private static final long serialVersionUID = 7565982551505011832L;
    volatile boolean cancelled;
    final o14<? super S> disposeState;
    final v2j<? super T> downstream;
    final md1<S, ? super ml6<T>, S> generator;
    boolean hasNext;
    S state;
    boolean terminate;

    public FlowableGenerate$GeneratorSubscription(v2j<? super T> v2jVar, md1<S, ? super ml6<T>, S> md1Var, o14<? super S> o14Var, S s) {
        this.downstream = v2jVar;
        this.generator = md1Var;
        this.disposeState = o14Var;
        this.state = s;
    }

    private void dispose(S s) {
        try {
            this.disposeState.accept(s);
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        if (vr0.a(this, 1L) == 0) {
            S s = this.state;
            this.state = null;
            dispose(s);
        }
    }

    @Override // com.oplus.aiunit.vision.ml6
    public void onComplete() {
        if (this.terminate) {
            return;
        }
        this.terminate = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.ml6
    public void onError(Throwable th) {
        if (this.terminate) {
            g4g.u(th);
            return;
        }
        if (th == null) {
            th = ExceptionHelper.b("onError called with a null Throwable.");
        }
        this.terminate = true;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.ml6
    public void onNext(T t) {
        if (this.terminate) {
            return;
        }
        if (this.hasNext) {
            onError(new IllegalStateException("onNext already called in this generate turn"));
        } else if (t == null) {
            onError(ExceptionHelper.b("onNext called with a null value."));
        } else {
            this.hasNext = true;
            this.downstream.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2) && vr0.a(this, j2) == 0) {
            S sApply = this.state;
            md1<S, ? super ml6<T>, S> md1Var = this.generator;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            this.state = null;
                            dispose(sApply);
                            return;
                        }
                        this.hasNext = false;
                        try {
                            sApply = md1Var.apply(sApply, this);
                            if (this.terminate) {
                                this.cancelled = true;
                                this.state = null;
                                dispose(sApply);
                                return;
                            }
                            j3++;
                        } catch (Throwable th) {
                            hu6.b(th);
                            this.cancelled = true;
                            this.state = null;
                            onError(th);
                            dispose(sApply);
                            return;
                        }
                    }
                }
                this.state = sApply;
                j2 = addAndGet(-j3);
            } while (j2 != 0);
        }
    }
}
