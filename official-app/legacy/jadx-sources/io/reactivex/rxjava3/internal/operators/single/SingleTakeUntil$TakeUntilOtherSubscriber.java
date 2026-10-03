package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleTakeUntil$TakeUntilOtherSubscriber extends AtomicReference<c3j> implements vu7<Object> {
    private static final long serialVersionUID = 5170026210238877381L;
    final SingleTakeUntil$TakeUntilMainObserver<?> parent;

    public SingleTakeUntil$TakeUntilOtherSubscriber(SingleTakeUntil$TakeUntilMainObserver<?> singleTakeUntil$TakeUntilMainObserver) {
        this.parent = singleTakeUntil$TakeUntilMainObserver;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            this.parent.otherError(new CancellationException());
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.otherError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        if (SubscriptionHelper.cancel(this)) {
            this.parent.otherError(new CancellationException());
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
