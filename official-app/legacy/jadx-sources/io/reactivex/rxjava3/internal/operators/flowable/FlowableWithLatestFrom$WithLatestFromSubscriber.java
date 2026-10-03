package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.it3;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWithLatestFrom$WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements it3<T>, c3j {
    private static final long serialVersionUID = -312246233408980075L;
    final md1<? super T, ? super U, ? extends R> combiner;
    final v2j<? super R> downstream;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<c3j> other = new AtomicReference<>();

    public FlowableWithLatestFrom$WithLatestFromSubscriber(v2j<? super R> v2jVar, md1<? super T, ? super U, ? extends R> md1Var) {
        this.downstream = v2jVar;
        this.combiner = md1Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        SubscriptionHelper.cancel(this.other);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        this.downstream.onError(th);
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

    public void otherError(Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }

    public boolean setOther(c3j c3jVar) {
        return SubscriptionHelper.setOnce(this.other, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.it3
    public boolean tryOnNext(T t) {
        U u = get();
        if (u != null) {
            try {
                R rApply = this.combiner.apply(t, u);
                Objects.requireNonNull(rApply, "The combiner returned a null value");
                this.downstream.onNext(rApply);
                return true;
            } catch (Throwable th) {
                hu6.b(th);
                cancel();
                this.downstream.onError(th);
            }
        }
        return false;
    }
}
