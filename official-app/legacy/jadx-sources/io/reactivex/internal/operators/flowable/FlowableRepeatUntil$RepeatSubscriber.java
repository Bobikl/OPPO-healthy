package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.z12;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRepeatUntil$RepeatSubscriber<T> extends AtomicInteger implements wu7<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final v2j<? super T> downstream;
    long produced;
    final SubscriptionArbiter sa;
    final k3f<? extends T> source;
    final z12 stop;

    public FlowableRepeatUntil$RepeatSubscriber(v2j<? super T> v2jVar, z12 z12Var, SubscriptionArbiter subscriptionArbiter, k3f<? extends T> k3fVar) {
        this.downstream = v2jVar;
        this.sa = subscriptionArbiter;
        this.source = k3fVar;
        this.stop = z12Var;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        try {
            if (this.stop.getAsBoolean()) {
                this.downstream.onComplete();
            } else {
                subscribeNext();
            }
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
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
