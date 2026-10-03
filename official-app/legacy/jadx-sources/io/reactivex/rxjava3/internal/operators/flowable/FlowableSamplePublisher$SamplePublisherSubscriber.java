package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableSamplePublisher$SamplePublisherSubscriber<T> extends AtomicReference<T> implements vu7<T>, c3j {
    private static final long serialVersionUID = -3517602651313910099L;
    final v2j<? super T> downstream;
    final k3f<?> sampler;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<c3j> other = new AtomicReference<>();

    public FlowableSamplePublisher$SamplePublisherSubscriber(v2j<? super T> v2jVar, k3f<?> k3fVar) {
        this.downstream = v2jVar;
        this.sampler = k3fVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.other);
        this.upstream.cancel();
    }

    public void complete() {
        this.upstream.cancel();
        completion();
    }

    public abstract void completion();

    public void emit() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            if (this.requested.get() != 0) {
                this.downstream.onNext(andSet);
                vr0.e(this.requested, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    public void error(Throwable th) {
        this.upstream.cancel();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        completion();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        lazySet(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            if (this.other.get() == null) {
                this.sampler.subscribe(new d(this));
                c3jVar.request(Long.MAX_VALUE);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
        }
    }

    public abstract void run();

    public void setOther(c3j c3jVar) {
        SubscriptionHelper.setOnce(this.other, c3jVar, Long.MAX_VALUE);
    }
}
