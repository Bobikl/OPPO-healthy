package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes2.dex */
public class a8b<D> implements aed<D> {
    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        yha.a("LoggerObserver", "onComplete：");
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        yha.j(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(D d) {
        yha.a("LoggerObserver", "onNext：");
        yha.b("LoggerObserver", "onNext：", d);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        yha.a("LoggerObserver", "onSubscribe：", aVar);
    }
}
