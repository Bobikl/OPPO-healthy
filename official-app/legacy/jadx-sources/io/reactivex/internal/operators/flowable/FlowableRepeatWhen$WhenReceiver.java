package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements wu7<Object>, c3j {
    private static final long serialVersionUID = 2827772011130406689L;
    final k3f<T> source;
    FlowableRepeatWhen$WhenSourceSubscriber<T, U> subscriber;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableRepeatWhen$WhenReceiver(k3f<T> k3fVar) {
        this.source = k3fVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.subscriber.cancel();
        this.subscriber.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.subscriber.cancel();
        this.subscriber.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.source.subscribe(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }
}
