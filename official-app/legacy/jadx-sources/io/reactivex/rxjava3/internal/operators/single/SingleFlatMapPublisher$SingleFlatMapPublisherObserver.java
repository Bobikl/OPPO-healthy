package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapPublisher$SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements l6h<S>, vu7<T>, c3j {
    private static final long serialVersionUID = 7759721921468635667L;
    a disposable;
    final v2j<? super T> downstream;
    final d08<? super S, ? extends k3f<? extends T>> mapper;
    final AtomicReference<c3j> parent = new AtomicReference<>();

    public SingleFlatMapPublisher$SingleFlatMapPublisherObserver(v2j<? super T> v2jVar, d08<? super S, ? extends k3f<? extends T>> d08Var) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.disposable.dispose();
        SubscriptionHelper.cancel(this.parent);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        this.disposable = aVar;
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(S s) {
        try {
            k3f<? extends T> k3fVarApply = this.mapper.apply(s);
            Objects.requireNonNull(k3fVarApply, "the mapper returned a null Publisher");
            k3f<? extends T> k3fVar = k3fVarApply;
            if (this.parent.get() != SubscriptionHelper.CANCELLED) {
                k3fVar.subscribe(this);
            }
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.parent, this, j2);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.parent, this, c3jVar);
    }
}
