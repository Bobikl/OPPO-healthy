package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.zeg;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSampleTimed$SampleTimedEmitLast<T> extends ObservableSampleTimed$SampleTimedObserver<T> {
    private static final long serialVersionUID = -7139995637533111443L;
    final AtomicInteger wip;

    public ObservableSampleTimed$SampleTimedEmitLast(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg zegVar) {
        super(bedVar, j2, timeUnit, zegVar);
        this.wip = new AtomicInteger(1);
    }

    @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedObserver
    public void complete() {
        emit();
        if (this.wip.decrementAndGet() == 0) {
            this.downstream.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.wip.incrementAndGet() == 2) {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }
    }
}
