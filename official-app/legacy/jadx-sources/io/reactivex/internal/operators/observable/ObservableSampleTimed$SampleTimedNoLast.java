package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.zeg;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSampleTimed$SampleTimedNoLast<T> extends ObservableSampleTimed$SampleTimedObserver<T> {
    private static final long serialVersionUID = -7139995637533111443L;

    public ObservableSampleTimed$SampleTimedNoLast(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg zegVar) {
        super(bedVar, j2, timeUnit, zegVar);
    }

    @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver
    public void complete() {
        this.downstream.onComplete();
    }

    @Override // java.lang.Runnable
    public void run() {
        emit();
    }
}
