package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.jdd;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSampleWithObservable$SampleMainNoLast<T> extends ObservableSampleWithObservable$SampleMainObserver<T> {
    private static final long serialVersionUID = -3029755663834015785L;

    public ObservableSampleWithObservable$SampleMainNoLast(aed<? super T> aedVar, jdd<?> jddVar) {
        super(aedVar, jddVar);
    }

    @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
    public void completion() {
        this.downstream.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
    public void run() {
        emit();
    }
}
