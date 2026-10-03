package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelReduce$ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
    private static final long serialVersionUID = 8200530050639449080L;
    R accumulator;
    boolean done;
    final nd1<R, ? super T, R> reducer;

    public ParallelReduce$ParallelReduceSubscriber(v2j<? super R> v2jVar, R r, nd1<R, ? super T, R> nd1Var) {
        super(v2jVar);
        this.accumulator = r;
        this.reducer = nd1Var;
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        R r = this.accumulator;
        this.accumulator = null;
        complete(r);
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        this.accumulator = null;
        this.downstream.onError(th);
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            this.accumulator = (R) abd.d(this.reducer.apply(this.accumulator, t), "The reducer returned a null value");
        } catch (Throwable th) {
            iu6.b(th);
            cancel();
            onError(th);
        }
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
