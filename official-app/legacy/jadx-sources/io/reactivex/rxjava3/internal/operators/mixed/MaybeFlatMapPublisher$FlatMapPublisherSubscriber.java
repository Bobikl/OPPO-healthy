package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapPublisher$FlatMapPublisherSubscriber<T, R> extends AtomicReference<c3j> implements vu7<R>, lob<T>, c3j {
    private static final long serialVersionUID = -8948264376121066672L;
    final v2j<? super R> downstream;
    final d08<? super T, ? extends k3f<? extends R>> mapper;
    final AtomicLong requested = new AtomicLong();
    a upstream;

    public MaybeFlatMapPublisher$FlatMapPublisherSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends k3f<? extends R>> d08Var) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.dispose();
        SubscriptionHelper.cancel(this);
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
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            k3f<? extends R> k3fVarApply = this.mapper.apply(t);
            Objects.requireNonNull(k3fVarApply, "The mapper returned a null Publisher");
            k3f<? extends R> k3fVar = k3fVarApply;
            if (get() != SubscriptionHelper.CANCELLED) {
                k3fVar.subscribe(this);
            }
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this, this.requested, j2);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this, this.requested, c3jVar);
    }
}
