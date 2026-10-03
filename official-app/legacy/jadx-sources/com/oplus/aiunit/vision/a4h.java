package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class a4h<O> implements aed<O> {
    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        a7b.c("SimpleObserver", " --> Observer onError ", th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(O o) {
        StringBuilder sb = new StringBuilder();
        sb.append(" --> Observer onNext ");
        sb.append(o);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(" --> Observer onSubscribe ");
        sb.append(aVar);
    }
}
