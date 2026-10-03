package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatWithMaybe$ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements mob<T> {
    private static final long serialVersionUID = -7346385463600070225L;
    boolean inMaybe;
    qob<? extends T> other;
    final AtomicReference<cv5> otherDisposable;

    public FlowableConcatWithMaybe$ConcatWithSubscriber(v2j<? super T> v2jVar, qob<? extends T> qobVar) {
        super(v2jVar);
        this.other = qobVar;
        this.otherDisposable = new AtomicReference<>();
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        DisposableHelper.dispose(this.otherDisposable);
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.inMaybe) {
            this.downstream.onComplete();
            return;
        }
        this.inMaybe = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        qob<? extends T> qobVar = this.other;
        this.other = null;
        qobVar.a(this);
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

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.otherDisposable, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        complete(t);
    }
}
