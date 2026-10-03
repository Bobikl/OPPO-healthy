package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.kdd;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSampleWithObservable$SampleMainEmitLast<T> extends ObservableSampleWithObservable$SampleMainObserver<T> {
    private static final long serialVersionUID = -3029755663834015785L;
    volatile boolean done;
    final AtomicInteger wip;

    public ObservableSampleWithObservable$SampleMainEmitLast(bed<? super T> bedVar, kdd<?> kddVar) {
        super(bedVar, kddVar);
        this.wip = new AtomicInteger();
    }

    @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
    public void completion() {
        this.done = true;
        if (this.wip.getAndIncrement() == 0) {
            emit();
            this.downstream.onComplete();
        }
    }

    @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver
    public void run() {
        if (this.wip.getAndIncrement() == 0) {
            do {
                boolean z = this.done;
                emit();
                if (z) {
                    this.downstream.onComplete();
                    return;
                }
            } while (this.wip.decrementAndGet() != 0);
        }
    }
}
