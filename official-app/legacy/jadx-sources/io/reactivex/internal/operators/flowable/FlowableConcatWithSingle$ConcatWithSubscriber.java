package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatWithSingle$ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements m6h<T> {
    private static final long serialVersionUID = -7346385463600070225L;
    t6h<? extends T> other;
    final AtomicReference<cv5> otherDisposable;

    public FlowableConcatWithSingle$ConcatWithSubscriber(v2j<? super T> v2jVar, t6h<? extends T> t6hVar) {
        super(v2jVar);
        this.other = t6hVar;
        this.otherDisposable = new AtomicReference<>();
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.otherDisposable);
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.upstream = SubscriptionHelper.CANCELLED;
        t6h<? extends T> t6hVar = this.other;
        this.other = null;
        t6hVar.a(this);
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext((Object) t);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.otherDisposable, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        complete(t);
    }
}
