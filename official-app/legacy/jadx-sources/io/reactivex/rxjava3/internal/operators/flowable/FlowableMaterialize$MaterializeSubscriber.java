package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.avc;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMaterialize$MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, avc<T>> {
    private static final long serialVersionUID = -3740826063558713822L;

    public FlowableMaterialize$MaterializeSubscriber(v2j<? super avc<T>> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        complete(avc.a());
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        complete(avc.b(th));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(avc.c(t));
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber
    public void onDrop(avc<T> avcVar) {
        if (avcVar.e()) {
            g4g.u(avcVar.d());
        }
    }
}
