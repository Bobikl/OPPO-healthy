package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;

/* JADX INFO: loaded from: classes10.dex */
public final class zu7<T> implements vu7<T> {
    public final v2j<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SubscriptionArbiter f19554j;

    public zu7(v2j<? super T> v2jVar, SubscriptionArbiter subscriptionArbiter) {
        this.i = v2jVar;
        this.f19554j = subscriptionArbiter;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.i.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.i.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.i.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        this.f19554j.setSubscription(c3jVar);
    }
}
