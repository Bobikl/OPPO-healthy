package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnErrorReturn$OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
    private static final long serialVersionUID = -3740826063558713822L;
    final d08<? super Throwable, ? extends T> valueSupplier;

    public FlowableOnErrorReturn$OnErrorReturnSubscriber(v2j<? super T> v2jVar, d08<? super Throwable, ? extends T> d08Var) {
        super(v2jVar);
        this.valueSupplier = d08Var;
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        try {
            T tApply = this.valueSupplier.apply(th);
            Objects.requireNonNull(tApply, "The valueSupplier returned a null value");
            complete(tApply);
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext((Object) t);
    }
}
