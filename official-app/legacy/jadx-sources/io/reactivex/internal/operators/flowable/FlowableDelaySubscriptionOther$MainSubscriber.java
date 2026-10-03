package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDelaySubscriptionOther$MainSubscriber<T> extends AtomicLong implements wu7<T>, c3j {
    private static final long serialVersionUID = 2259811067697317255L;
    final v2j<? super T> downstream;
    final k3f<? extends T> main;
    final FlowableDelaySubscriptionOther$MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
    final AtomicReference<c3j> upstream = new AtomicReference<>();

    public final class OtherSubscriber extends AtomicReference<c3j> implements wu7<Object> {
        private static final long serialVersionUID = -3892798459447644106L;

        public OtherSubscriber() {
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            if (get() != SubscriptionHelper.CANCELLED) {
                FlowableDelaySubscriptionOther$MainSubscriber.this.next();
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            if (get() != SubscriptionHelper.CANCELLED) {
                FlowableDelaySubscriptionOther$MainSubscriber.this.downstream.onError(th);
            } else {
                h4g.r(th);
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(Object obj) {
            c3j c3jVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (c3jVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                c3jVar.cancel();
                FlowableDelaySubscriptionOther$MainSubscriber.this.next();
            }
        }

        @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            if (SubscriptionHelper.setOnce(this, c3jVar)) {
                c3jVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableDelaySubscriptionOther$MainSubscriber(v2j<? super T> v2jVar, k3f<? extends T> k3fVar) {
        this.downstream = v2jVar;
        this.main = k3fVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.other);
        SubscriptionHelper.cancel(this.upstream);
    }

    public void next() {
        this.main.subscribe(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            SubscriptionHelper.deferredRequest(this.upstream, this, j2);
        }
    }
}
