package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.yf8;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTakeUntil$TakeUntilMainSubscriber<T> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -4945480365982832967L;
    final v2j<? super T> downstream;
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final FlowableTakeUntil$TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
    final AtomicThrowable error = new AtomicThrowable();

    public final class OtherSubscriber extends AtomicReference<c3j> implements vu7<Object> {
        private static final long serialVersionUID = -3592821756711087922L;

        public OtherSubscriber() {
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            SubscriptionHelper.cancel(FlowableTakeUntil$TakeUntilMainSubscriber.this.upstream);
            FlowableTakeUntil$TakeUntilMainSubscriber flowableTakeUntil$TakeUntilMainSubscriber = FlowableTakeUntil$TakeUntilMainSubscriber.this;
            yf8.b(flowableTakeUntil$TakeUntilMainSubscriber.downstream, flowableTakeUntil$TakeUntilMainSubscriber, flowableTakeUntil$TakeUntilMainSubscriber.error);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(FlowableTakeUntil$TakeUntilMainSubscriber.this.upstream);
            FlowableTakeUntil$TakeUntilMainSubscriber flowableTakeUntil$TakeUntilMainSubscriber = FlowableTakeUntil$TakeUntilMainSubscriber.this;
            yf8.d(flowableTakeUntil$TakeUntilMainSubscriber.downstream, th, flowableTakeUntil$TakeUntilMainSubscriber, flowableTakeUntil$TakeUntilMainSubscriber.error);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(Object obj) {
            SubscriptionHelper.cancel(this);
            onComplete();
        }

        @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
        }
    }

    public FlowableTakeUntil$TakeUntilMainSubscriber(v2j<? super T> v2jVar) {
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        SubscriptionHelper.cancel(this.other);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        yf8.b(this.downstream, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        yf8.d(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        yf8.f(this.downstream, t, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }
}
