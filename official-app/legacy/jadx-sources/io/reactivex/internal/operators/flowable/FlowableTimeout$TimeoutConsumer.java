package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.yu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeout$TimeoutConsumer extends AtomicReference<c3j> implements wu7<Object>, cv5 {
    private static final long serialVersionUID = 8708641127342403073L;
    final long idx;
    final yu7 parent;

    public FlowableTimeout$TimeoutConsumer(long j2, yu7 yu7Var) {
        this.idx = j2;
        this.parent = yu7Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
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
            h4g.r(th);
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
