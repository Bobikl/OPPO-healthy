package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableAndThenPublisher$AndThenPublisherSubscriber<R> extends AtomicReference<c3j> implements wu7<R>, bs3, c3j {
    private static final long serialVersionUID = -8948264376121066672L;
    final v2j<? super R> downstream;
    k3f<? extends R> other;
    final AtomicLong requested = new AtomicLong();
    cv5 upstream;

    public CompletableAndThenPublisher$AndThenPublisherSubscriber(v2j<? super R> v2jVar, k3f<? extends R> k3fVar) {
        this.downstream = v2jVar;
        this.other = k3fVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.dispose();
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        k3f<? extends R> k3fVar = this.other;
        if (k3fVar == null) {
            this.downstream.onComplete();
        } else {
            this.other = null;
            k3fVar.subscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this, this.requested, j2);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this, this.requested, c3jVar);
    }
}
