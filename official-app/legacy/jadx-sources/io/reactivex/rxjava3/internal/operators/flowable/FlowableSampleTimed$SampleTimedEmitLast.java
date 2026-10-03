package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSampleTimed$SampleTimedEmitLast<T> extends FlowableSampleTimed$SampleTimedSubscriber<T> {
    private static final long serialVersionUID = -7139995637533111443L;
    final AtomicInteger wip;

    public FlowableSampleTimed$SampleTimedEmitLast(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
        super(v2jVar, j2, timeUnit, cfgVar);
        this.wip = new AtomicInteger(1);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed$SampleTimedSubscriber
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
