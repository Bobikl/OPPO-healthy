package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.yki;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T> implements bed<T> {
    public final ObservableSequenceEqualSingle$EqualCoordinator<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yki<T> f20498j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f20499l;
    public Throwable m;

    public g(ObservableSequenceEqualSingle$EqualCoordinator<T> observableSequenceEqualSingle$EqualCoordinator, int i, int i2) {
        this.i = observableSequenceEqualSingle$EqualCoordinator;
        this.k = i;
        this.f20498j = new yki<>(i2);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.f20499l = true;
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.m = th;
        this.f20499l = true;
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.f20498j.offer(t);
        this.i.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        this.i.setDisposable(cv5Var, this.k);
    }
}
