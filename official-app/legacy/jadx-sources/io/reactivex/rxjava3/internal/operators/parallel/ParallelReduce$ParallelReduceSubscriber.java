package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelReduce$ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
    private static final long serialVersionUID = 8200530050639449080L;
    R accumulator;
    boolean done;
    final md1<R, ? super T, R> reducer;

    public ParallelReduce$ParallelReduceSubscriber(v2j<? super R> v2jVar, R r, md1<R, ? super T, R> md1Var) {
        super(v2jVar);
        this.accumulator = r;
        this.reducer = md1Var;
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        R r = this.accumulator;
        this.accumulator = null;
        complete(r);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        this.accumulator = null;
        this.downstream.onError(th);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            R rApply = this.reducer.apply(this.accumulator, t);
            Objects.requireNonNull(rApply, "The reducer returned a null value");
            this.accumulator = rApply;
        } catch (Throwable th) {
            hu6.b(th);
            cancel();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
