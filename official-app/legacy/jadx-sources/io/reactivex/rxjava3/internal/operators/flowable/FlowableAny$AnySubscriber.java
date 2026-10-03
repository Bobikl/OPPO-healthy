package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.mpe;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableAny$AnySubscriber<T> extends DeferredScalarSubscription<Boolean> implements vu7<T> {
    private static final long serialVersionUID = -2311252482644620661L;
    boolean done;
    final mpe<? super T> predicate;
    c3j upstream;

    public FlowableAny$AnySubscriber(v2j<? super Boolean> v2jVar, mpe<? super T> mpeVar) {
        super(v2jVar);
        this.predicate = mpeVar;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        complete(Boolean.FALSE);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            if (this.predicate.test(t)) {
                this.done = true;
                this.upstream.cancel();
                complete(Boolean.TRUE);
            }
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
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
