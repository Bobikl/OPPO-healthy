package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSampleTimed$SampleTimedNoLast<T> extends FlowableSampleTimed$SampleTimedSubscriber<T> {
    private static final long serialVersionUID = -7139995637533111443L;

    public FlowableSampleTimed$SampleTimedNoLast(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
        super(v2jVar, j2, timeUnit, cfgVar);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed$SampleTimedSubscriber
    public void complete() {
        this.downstream.onComplete();
    }

    @Override // java.lang.Runnable
    public void run() {
        emit();
    }
}
