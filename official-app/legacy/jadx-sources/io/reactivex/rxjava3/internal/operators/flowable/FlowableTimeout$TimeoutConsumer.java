package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeout$TimeoutConsumer extends AtomicReference<c3j> implements vu7<Object>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 8708641127342403073L;
    final long idx;
    final xu7 parent;

    public FlowableTimeout$TimeoutConsumer(long j2, xu7 xu7Var) {
        this.idx = j2;
        this.parent = xu7Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar == subscriptionHelper) {
            g4g.u(th);
        } else {
            lazySet(subscriptionHelper);
            this.parent.onTimeoutError(this.idx, th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            c3jVar.cancel();
            lazySet(subscriptionHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
