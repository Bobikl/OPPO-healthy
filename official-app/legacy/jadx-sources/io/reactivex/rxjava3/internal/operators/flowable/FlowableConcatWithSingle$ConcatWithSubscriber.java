package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatWithSingle$ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements l6h<T> {
    private static final long serialVersionUID = -7346385463600070225L;
    s6h<? extends T> other;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> otherDisposable;

    public FlowableConcatWithSingle$ConcatWithSubscriber(v2j<? super T> v2jVar, s6h<? extends T> s6hVar) {
        super(v2jVar);
        this.other = s6hVar;
        this.otherDisposable = new AtomicReference<>();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.otherDisposable);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.upstream = SubscriptionHelper.CANCELLED;
        s6h<? extends T> s6hVar = this.other;
        this.other = null;
        s6hVar.b(this);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext((Object) t);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.otherDisposable, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        complete(t);
    }
}
