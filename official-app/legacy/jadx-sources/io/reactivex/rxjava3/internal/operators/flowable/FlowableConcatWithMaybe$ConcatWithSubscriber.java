package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatWithMaybe$ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements lob<T> {
    private static final long serialVersionUID = -7346385463600070225L;
    boolean inMaybe;
    pob<? extends T> other;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> otherDisposable;

    public FlowableConcatWithMaybe$ConcatWithSubscriber(v2j<? super T> v2jVar, pob<? extends T> pobVar) {
        super(v2jVar);
        this.other = pobVar;
        this.otherDisposable = new AtomicReference<>();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.otherDisposable);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.inMaybe) {
            this.downstream.onComplete();
            return;
        }
        this.inMaybe = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        pob<? extends T> pobVar = this.other;
        this.other = null;
        pobVar.a(this);
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

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.otherDisposable, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        complete(t);
    }
}
