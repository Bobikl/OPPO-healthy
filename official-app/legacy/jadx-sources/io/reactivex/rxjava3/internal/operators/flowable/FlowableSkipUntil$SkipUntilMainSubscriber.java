package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.it3;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.yf8;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSkipUntil$SkipUntilMainSubscriber<T> extends AtomicInteger implements it3<T>, c3j {
    private static final long serialVersionUID = -6270983465606289181L;
    final v2j<? super T> downstream;
    volatile boolean gate;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();
    final FlowableSkipUntil$SkipUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
    final AtomicThrowable error = new AtomicThrowable();

    public final class OtherSubscriber extends AtomicReference<c3j> implements vu7<Object> {
        private static final long serialVersionUID = -5592042965931999169L;

        public OtherSubscriber() {
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            FlowableSkipUntil$SkipUntilMainSubscriber.this.gate = true;
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(FlowableSkipUntil$SkipUntilMainSubscriber.this.upstream);
            FlowableSkipUntil$SkipUntilMainSubscriber flowableSkipUntil$SkipUntilMainSubscriber = FlowableSkipUntil$SkipUntilMainSubscriber.this;
            yf8.d(flowableSkipUntil$SkipUntilMainSubscriber.downstream, th, flowableSkipUntil$SkipUntilMainSubscriber, flowableSkipUntil$SkipUntilMainSubscriber.error);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(Object obj) {
            FlowableSkipUntil$SkipUntilMainSubscriber.this.gate = true;
            get().cancel();
        }

        @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
        }
    }

    public FlowableSkipUntil$SkipUntilMainSubscriber(v2j<? super T> v2jVar) {
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
        if (tryOnNext(t)) {
            return;
        }
        this.upstream.get().request(1L);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }

    @Override // com.oplus.aiunit.vision.it3
    public boolean tryOnNext(T t) {
        if (!this.gate) {
            return false;
        }
        yf8.f(this.downstream, t, this, this.error);
        return true;
    }
}
