package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCombineLatest$CombineLatestInnerSubscriber<T> extends AtomicReference<c3j> implements wu7<T> {
    private static final long serialVersionUID = -8730235182291002949L;
    final int index;
    final int limit;
    final FlowableCombineLatest$CombineLatestCoordinator<T, ?> parent;
    final int prefetch;
    int produced;

    public FlowableCombineLatest$CombineLatestInnerSubscriber(FlowableCombineLatest$CombineLatestCoordinator<T, ?> flowableCombineLatest$CombineLatestCoordinator, int i, int i2) {
        this.parent = flowableCombineLatest$CombineLatestCoordinator;
        this.index = i;
        this.prefetch = i2;
        this.limit = i2 - (i2 >> 2);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.parent.innerComplete(this.index);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.parent.innerValue(this.index, t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, this.prefetch);
    }

    public void requestOne() {
        int i = this.produced + 1;
        if (i != this.limit) {
            this.produced = i;
        } else {
            this.produced = 0;
            get().request(i);
        }
    }
}
