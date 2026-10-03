package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTakeLastOne$TakeLastOneSubscriber<T> extends DeferredScalarSubscription<T> implements vu7<T> {
    private static final long serialVersionUID = -5467847744262967226L;
    c3j upstream;

    public FlowableTakeLastOne$TakeLastOneSubscriber(v2j<? super T> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        T t = this.value;
        if (t != null) {
            complete(t);
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.value = t;
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
