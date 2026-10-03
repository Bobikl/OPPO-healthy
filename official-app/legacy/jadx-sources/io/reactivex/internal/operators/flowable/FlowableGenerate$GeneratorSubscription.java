package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.ll6;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableGenerate$GeneratorSubscription<T, S> extends AtomicLong implements ll6<T>, c3j {
    private static final long serialVersionUID = 7565982551505011832L;
    volatile boolean cancelled;
    final p14<? super S> disposeState;
    final v2j<? super T> downstream;
    final nd1<S, ? super ll6<T>, S> generator;
    boolean hasNext;
    S state;
    boolean terminate;

    public FlowableGenerate$GeneratorSubscription(v2j<? super T> v2jVar, nd1<S, ? super ll6<T>, S> nd1Var, p14<? super S> p14Var, S s) {
        this.downstream = v2jVar;
        this.generator = nd1Var;
        this.disposeState = p14Var;
        this.state = s;
    }

    private void dispose(S s) {
        try {
            this.disposeState.accept(s);
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        if (wr0.a(this, 1L) == 0) {
            S s = this.state;
            this.state = null;
            dispose(s);
        }
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onComplete() {
        if (this.terminate) {
            return;
        }
        this.terminate = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onError(Throwable th) {
        if (this.terminate) {
            h4g.r(th);
            return;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.terminate = true;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onNext(T t) {
        if (this.terminate) {
            return;
        }
        if (this.hasNext) {
            onError(new IllegalStateException("onNext already called in this generate turn"));
        } else if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.hasNext = true;
            this.downstream.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2) && wr0.a(this, j2) == 0) {
            S sApply = this.state;
            nd1<S, ? super ll6<T>, S> nd1Var = this.generator;
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
                            sApply = nd1Var.apply(sApply, this);
                            if (this.terminate) {
                                this.cancelled = true;
                                this.state = null;
                                dispose(sApply);
                                return;
                            }
                            j3++;
                        } catch (Throwable th) {
                            iu6.b(th);
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
