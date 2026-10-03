package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapPublisher$FlatMapPublisherSubscriber<T, R> extends AtomicReference<c3j> implements wu7<R>, mob<T>, c3j {
    private static final long serialVersionUID = -8948264376121066672L;
    final v2j<? super R> downstream;
    final j08<? super T, ? extends k3f<? extends R>> mapper;
    final AtomicLong requested = new AtomicLong();
    cv5 upstream;

    public MaybeFlatMapPublisher$FlatMapPublisherSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends k3f<? extends R>> j08Var) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.dispose();
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        try {
            ((k3f) abd.d(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
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
