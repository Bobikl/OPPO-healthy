package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnErrorReturn$OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
    private static final long serialVersionUID = -3740826063558713822L;
    final j08<? super Throwable, ? extends T> valueSupplier;

    public FlowableOnErrorReturn$OnErrorReturnSubscriber(v2j<? super T> v2jVar, j08<? super Throwable, ? extends T> j08Var) {
        super(v2jVar);
        this.valueSupplier = j08Var;
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        try {
            complete(abd.d(this.valueSupplier.apply(th), "The valueSupplier returned a null value"));
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext((Object) t);
    }
}
