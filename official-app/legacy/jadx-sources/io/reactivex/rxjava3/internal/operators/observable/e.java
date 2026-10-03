package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.xki;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements aed<T> {
    public final ObservableSequenceEqual$EqualCoordinator<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xki<T> f20607j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f20608l;
    public Throwable m;

    public e(ObservableSequenceEqual$EqualCoordinator<T> observableSequenceEqual$EqualCoordinator, int i, int i2) {
        this.i = observableSequenceEqual$EqualCoordinator;
        this.k = i;
        this.f20607j = new xki<>(i2);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.f20608l = true;
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.m = th;
        this.f20608l = true;
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.f20607j.offer(t);
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.i.setDisposable(aVar, this.k);
    }
}
