package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.ld1;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelCollect$ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
    private static final long serialVersionUID = -4767392946044436228L;
    C collection;
    final ld1<? super C, ? super T> collector;
    boolean done;

    public ParallelCollect$ParallelCollectSubscriber(v2j<? super C> v2jVar, C c2, ld1<? super C, ? super T> ld1Var) {
        super(v2jVar);
        this.collection = c2;
        this.collector = ld1Var;
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
        C c2 = this.collection;
        this.collection = null;
        complete(c2);
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        this.collection = null;
        this.downstream.onError(th);
    }

    @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            this.collector.accept(this.collection, t);
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
