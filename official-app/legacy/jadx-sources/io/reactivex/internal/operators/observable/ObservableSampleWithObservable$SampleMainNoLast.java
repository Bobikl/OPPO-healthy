package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.kdd;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSampleWithObservable$SampleMainNoLast<T> extends ObservableSampleWithObservable$SampleMainObserver<T> {
    private static final long serialVersionUID = -3029755663834015785L;

    public ObservableSampleWithObservable$SampleMainNoLast(bed<? super T> bedVar, kdd<?> kddVar) {
        super(bedVar, kddVar);
    }

    @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
    public void completion() {
        this.downstream.onComplete();
    }

    @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
    public void run() {
        emit();
    }
}
