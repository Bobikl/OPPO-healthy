package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReduce$ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements wu7<T> {
    private static final long serialVersionUID = -4663883003264602070L;
    final nd1<T, T, T> reducer;
    c3j upstream;

    public FlowableReduce$ReduceSubscriber(v2j<? super T> v2jVar, nd1<T, T, T> nd1Var) {
        super(v2jVar);
        this.reducer = nd1Var;
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
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
            h4g.r(th);
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
            this.value = (T) abd.d(this.reducer.apply(t2, t), "The reducer returned a null value");
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
