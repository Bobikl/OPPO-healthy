package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnErrorNext$OnErrorNextSubscriber<T> extends SubscriptionArbiter implements vu7<T> {
    private static final long serialVersionUID = 4063763155303814625L;
    boolean done;
    final v2j<? super T> downstream;
    final d08<? super Throwable, ? extends k3f<? extends T>> nextSupplier;
    boolean once;
    long produced;

    public FlowableOnErrorNext$OnErrorNextSubscriber(v2j<? super T> v2jVar, d08<? super Throwable, ? extends k3f<? extends T>> d08Var) {
        super(false);
        this.downstream = v2jVar;
        this.nextSupplier = d08Var;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.once = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.once) {
            if (this.done) {
                g4g.u(th);
                return;
            } else {
                this.downstream.onError(th);
                return;
            }
        }
        this.once = true;
        try {
            k3f<? extends T> k3fVarApply = this.nextSupplier.apply(th);
            Objects.requireNonNull(k3fVarApply, "The nextSupplier returned a null Publisher");
            k3f<? extends T> k3fVar = k3fVarApply;
            long j2 = this.produced;
            if (j2 != 0) {
                produced(j2);
            }
            k3fVar.subscribe(this);
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (!this.once) {
            this.produced++;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        setSubscription(c3jVar);
    }
}
