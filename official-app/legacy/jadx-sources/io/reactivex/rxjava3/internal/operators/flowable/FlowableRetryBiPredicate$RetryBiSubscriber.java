package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.od1;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRetryBiPredicate$RetryBiSubscriber<T> extends AtomicInteger implements vu7<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final v2j<? super T> downstream;
    final od1<? super Integer, ? super Throwable> predicate;
    long produced;
    int retries;
    final SubscriptionArbiter sa;
    final k3f<? extends T> source;

    public FlowableRetryBiPredicate$RetryBiSubscriber(v2j<? super T> v2jVar, od1<? super Integer, ? super Throwable> od1Var, SubscriptionArbiter subscriptionArbiter, k3f<? extends T> k3fVar) {
        this.downstream = v2jVar;
        this.sa = subscriptionArbiter;
        this.source = k3fVar;
        this.predicate = od1Var;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        try {
            od1<? super Integer, ? super Throwable> od1Var = this.predicate;
            int i = this.retries + 1;
            this.retries = i;
            if (od1Var.a(Integer.valueOf(i), th)) {
                subscribeNext();
            } else {
                this.downstream.onError(th);
            }
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        this.sa.setSubscription(c3jVar);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.sa.isCancelled()) {
                long j2 = this.produced;
                if (j2 != 0) {
                    this.produced = 0L;
                    this.sa.produced(j2);
                }
                this.source.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
