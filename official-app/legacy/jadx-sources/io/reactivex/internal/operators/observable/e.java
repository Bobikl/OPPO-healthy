package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements bed<Object> {
    public final ObservableSampleWithObservable$SampleMainObserver<T> i;

    public e(ObservableSampleWithObservable$SampleMainObserver<T> observableSampleWithObservable$SampleMainObserver) {
        this.i = observableSampleWithObservable$SampleMainObserver;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.i.complete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.i.error(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(Object obj) {
        this.i.run();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        this.i.setOther(cv5Var);
    }
}
