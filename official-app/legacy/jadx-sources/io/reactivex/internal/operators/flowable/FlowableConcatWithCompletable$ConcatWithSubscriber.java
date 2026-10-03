package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatWithCompletable$ConcatWithSubscriber<T> extends AtomicReference<cv5> implements wu7<T>, bs3, c3j {
    private static final long serialVersionUID = -7346385463600070225L;
    final v2j<? super T> downstream;
    boolean inCompletable;
    es3 other;
    c3j upstream;

    public FlowableConcatWithCompletable$ConcatWithSubscriber(v2j<? super T> v2jVar, es3 es3Var) {
        this.downstream = v2jVar;
        this.other = es3Var;
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
        es3 es3Var = this.other;
        this.other = null;
        es3Var.a(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
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

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
