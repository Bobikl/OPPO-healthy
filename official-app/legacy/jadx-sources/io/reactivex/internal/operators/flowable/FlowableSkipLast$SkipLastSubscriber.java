package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSkipLast$SkipLastSubscriber<T> extends ArrayDeque<T> implements wu7<T>, c3j {
    private static final long serialVersionUID = -3807491841935125653L;
    final v2j<? super T> downstream;
    final int skip;
    c3j upstream;

    public FlowableSkipLast$SkipLastSubscriber(v2j<? super T> v2jVar, int i) {
        super(i);
        this.downstream = v2jVar;
        this.skip = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.skip == size()) {
            this.downstream.onNext(poll());
        } else {
            this.upstream.request(1L);
        }
        offer(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.upstream.request(j2);
    }
}
