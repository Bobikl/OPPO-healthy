package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRepeat$RepeatSubscriber<T> extends AtomicInteger implements vu7<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final v2j<? super T> downstream;
    long produced;
    long remaining;
    final SubscriptionArbiter sa;
    final k3f<? extends T> source;

    public FlowableRepeat$RepeatSubscriber(v2j<? super T> v2jVar, long j2, SubscriptionArbiter subscriptionArbiter, k3f<? extends T> k3fVar) {
        this.downstream = v2jVar;
        this.sa = subscriptionArbiter;
        this.source = k3fVar;
        this.remaining = j2;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        long j2 = this.remaining;
        if (j2 != Long.MAX_VALUE) {
            this.remaining = j2 - 1;
        }
        if (j2 != 0) {
            subscribeNext();
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
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
