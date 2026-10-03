package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class e6h<T> extends f5h<T> {
    public final T i;

    public e6h(T t) {
        this.i = t;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        l6hVar.onSubscribe(io.reactivex.rxjava3.disposables.a.d());
        l6hVar.onSuccess(this.i);
    }
}
