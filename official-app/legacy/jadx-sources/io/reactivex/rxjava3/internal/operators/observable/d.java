package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> implements aed<Object> {
    public final ObservableSampleWithObservable$SampleMainObserver<T> i;

    public d(ObservableSampleWithObservable$SampleMainObserver<T> observableSampleWithObservable$SampleMainObserver) {
        this.i = observableSampleWithObservable$SampleMainObserver;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.i.complete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.i.error(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(Object obj) {
        this.i.run();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.i.setOther(aVar);
    }
}
