package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bvc;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMaterialize$MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, bvc<T>> {
    private static final long serialVersionUID = -3740826063558713822L;

    public FlowableMaterialize$MaterializeSubscriber(v2j<? super bvc<T>> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        complete(bvc.a());
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        complete(bvc.b(th));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(bvc.c(t));
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
    public void onDrop(bvc<T> bvcVar) {
        if (bvcVar.e()) {
            h4g.r(bvcVar.d());
        }
    }
}
