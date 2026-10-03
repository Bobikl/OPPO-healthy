package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.kd1;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelCollect$ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
    private static final long serialVersionUID = -4767392946044436228L;
    C collection;
    final kd1<? super C, ? super T> collector;
    boolean done;

    public ParallelCollect$ParallelCollectSubscriber(v2j<? super C> v2jVar, C c2, kd1<? super C, ? super T> kd1Var) {
        super(v2jVar);
        this.collection = c2;
        this.collector = kd1Var;
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
        C c2 = this.collection;
        this.collection = null;
        complete(c2);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        this.collection = null;
        this.downstream.onError(th);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            this.collector.accept(this.collection, t);
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
