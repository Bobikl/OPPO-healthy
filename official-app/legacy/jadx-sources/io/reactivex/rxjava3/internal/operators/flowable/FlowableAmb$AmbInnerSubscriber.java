package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.yt7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableAmb$AmbInnerSubscriber<T> extends AtomicReference<c3j> implements vu7<T>, c3j {
    private static final long serialVersionUID = -1185974347409665484L;
    final v2j<? super T> downstream;
    final int index;
    final AtomicLong missedRequested = new AtomicLong();
    final yt7<T> parent;
    boolean won;

    public FlowableAmb$AmbInnerSubscriber(yt7<T> yt7Var, int i, v2j<? super T> v2jVar) {
        this.index = i;
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (!this.won) {
            throw null;
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.won) {
            throw null;
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (!this.won) {
            throw null;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this, this.missedRequested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this, this.missedRequested, j2);
    }
}
