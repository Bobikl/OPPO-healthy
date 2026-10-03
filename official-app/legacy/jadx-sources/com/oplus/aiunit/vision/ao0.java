package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public abstract class ao0<T> implements aed<T> {
    public io.reactivex.rxjava3.disposables.a i;

    public final void a() {
        if (this.i.isDisposed()) {
            return;
        }
        this.i.dispose();
    }

    public abstract void b(T t);

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        a();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        a();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        b(t);
        a();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.i = aVar;
    }
}
