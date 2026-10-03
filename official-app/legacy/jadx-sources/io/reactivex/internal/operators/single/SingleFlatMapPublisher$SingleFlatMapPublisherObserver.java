package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapPublisher$SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements m6h<S>, wu7<T>, c3j {
    private static final long serialVersionUID = 7759721921468635667L;
    cv5 disposable;
    final v2j<? super T> downstream;
    final j08<? super S, ? extends k3f<? extends T>> mapper;
    final AtomicReference<c3j> parent = new AtomicReference<>();

    public SingleFlatMapPublisher$SingleFlatMapPublisherObserver(v2j<? super T> v2jVar, j08<? super S, ? extends k3f<? extends T>> j08Var) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.disposable.dispose();
        SubscriptionHelper.cancel(this.parent);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        this.disposable = cv5Var;
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(S s) {
        try {
            ((k3f) abd.d(this.mapper.apply(s), "the mapper returned a null Publisher")).subscribe(this);
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.parent, this, j2);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.parent, this, c3jVar);
    }
}
