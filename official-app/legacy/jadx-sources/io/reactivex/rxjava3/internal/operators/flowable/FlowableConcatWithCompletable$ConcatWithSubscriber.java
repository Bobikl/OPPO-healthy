package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatWithCompletable$ConcatWithSubscriber<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements vu7<T>, as3, c3j {
    private static final long serialVersionUID = -7346385463600070225L;
    final v2j<? super T> downstream;
    boolean inCompletable;
    ds3 other;
    c3j upstream;

    public FlowableConcatWithCompletable$ConcatWithSubscriber(v2j<? super T> v2jVar, ds3 ds3Var) {
        this.downstream = v2jVar;
        this.other = ds3Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.inCompletable) {
            this.downstream.onComplete();
            return;
        }
        this.inCompletable = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        ds3 ds3Var = this.other;
        this.other = null;
        ds3Var.a(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.upstream.request(j2);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
