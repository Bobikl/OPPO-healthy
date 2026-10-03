package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSingle$SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements vu7<T> {
    private static final long serialVersionUID = -5526049321428043809L;
    final T defaultValue;
    boolean done;
    final boolean failOnEmpty;
    c3j upstream;

    public FlowableSingle$SingleElementSubscriber(v2j<? super T> v2jVar, T t, boolean z) {
        super(v2jVar);
        this.defaultValue = t;
        this.failOnEmpty = z;
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
        T t = this.value;
        this.value = null;
        if (t == null) {
            t = this.defaultValue;
        }
        if (t != null) {
            complete(t);
        } else if (this.failOnEmpty) {
            this.downstream.onError(new NoSuchElementException());
        } else {
            this.downstream.onComplete();
        }
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
        if (this.value == null) {
            this.value = t;
            return;
        }
        this.done = true;
        this.upstream.cancel();
        this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
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
