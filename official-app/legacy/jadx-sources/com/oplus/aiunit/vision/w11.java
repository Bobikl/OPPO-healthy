package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public abstract class w11<T> extends jv5<T> {
    public abstract void b(T t);

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        ltl.i("BaseDisposableObserver", th.getMessage());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        b(t);
    }
}
