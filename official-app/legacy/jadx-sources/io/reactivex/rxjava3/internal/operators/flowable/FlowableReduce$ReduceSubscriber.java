package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReduce$ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements vu7<T> {
    private static final long serialVersionUID = -4663883003264602070L;
    final md1<T, T, T> reducer;
    c3j upstream;

    public FlowableReduce$ReduceSubscriber(v2j<? super T> v2jVar, md1<T, T, T> md1Var) {
        super(v2jVar);
        this.reducer = md1Var;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
        this.upstream = SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        c3j c3jVar = this.upstream;
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar == subscriptionHelper) {
            return;
        }
        this.upstream = subscriptionHelper;
        T t = this.value;
        if (t != null) {
            complete(t);
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        c3j c3jVar = this.upstream;
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar == subscriptionHelper) {
            g4g.u(th);
        } else {
            this.upstream = subscriptionHelper;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.upstream == SubscriptionHelper.CANCELLED) {
            return;
        }
        T t2 = this.value;
        if (t2 == null) {
            this.value = t;
            return;
        }
        try {
            T tApply = this.reducer.apply(t2, t);
            Objects.requireNonNull(tApply, "The reducer returned a null value");
            this.value = tApply;
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
