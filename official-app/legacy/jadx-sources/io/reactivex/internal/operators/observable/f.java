package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.yki;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T> implements bed<T> {
    public final ObservableSequenceEqual$EqualCoordinator<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yki<T> f20496j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f20497l;
    public Throwable m;

    public f(ObservableSequenceEqual$EqualCoordinator<T> observableSequenceEqual$EqualCoordinator, int i, int i2) {
        this.i = observableSequenceEqual$EqualCoordinator;
        this.k = i;
        this.f20496j = new yki<>(i2);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.f20497l = true;
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.m = th;
        this.f20497l = true;
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.f20496j.offer(t);
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        this.i.setDisposable(cv5Var, this.k);
    }
}
