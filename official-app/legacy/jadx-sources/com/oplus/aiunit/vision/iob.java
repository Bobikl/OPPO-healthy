package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class iob<T> extends xnb<T> implements ndg<T> {
    public final T i;

    public iob(T t) {
        this.i = t;
    }

    @Override // com.oplus.aiunit.vision.ndg, com.oplus.aiunit.vision.f4j
    public T get() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        lobVar.onSubscribe(io.reactivex.rxjava3.disposables.a.d());
        lobVar.onSuccess(this.i);
    }
}
