package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.zeg;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSampleTimed$SampleTimedNoLast<T> extends FlowableSampleTimed$SampleTimedSubscriber<T> {
    private static final long serialVersionUID = -7139995637533111443L;

    public FlowableSampleTimed$SampleTimedNoLast(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, zeg zegVar) {
        super(v2jVar, j2, timeUnit, zegVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedSubscriber
    public void complete() {
        this.downstream.onComplete();
    }

    @Override // java.lang.Runnable
    public void run() {
        emit();
    }
}
