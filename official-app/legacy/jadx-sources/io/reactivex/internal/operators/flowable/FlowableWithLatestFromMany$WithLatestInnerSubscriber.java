package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWithLatestFromMany$WithLatestInnerSubscriber extends AtomicReference<c3j> implements wu7<Object> {
    private static final long serialVersionUID = 3256684027868224024L;
    boolean hasValue;
    final int index;
    final FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> parent;

    public FlowableWithLatestFromMany$WithLatestInnerSubscriber(FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> flowableWithLatestFromMany$WithLatestFromSubscriber, int i) {
        this.parent = flowableWithLatestFromMany$WithLatestFromSubscriber;
        this.index = i;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.parent.innerComplete(this.index, this.hasValue);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        if (!this.hasValue) {
            this.hasValue = true;
        }
        this.parent.innerNext(this.index, obj);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
