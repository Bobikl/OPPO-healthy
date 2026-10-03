package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSamplePublisher$SampleMainEmitLast<T> extends FlowableSamplePublisher$SamplePublisherSubscriber<T> {
    private static final long serialVersionUID = -3029755663834015785L;
    volatile boolean done;
    final AtomicInteger wip;

    public FlowableSamplePublisher$SampleMainEmitLast(v2j<? super T> v2jVar, k3f<?> k3fVar) {
        super(v2jVar, k3fVar);
        this.wip = new AtomicInteger();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber
    public void completion() {
        this.done = true;
        if (this.wip.getAndIncrement() == 0) {
            emit();
            this.downstream.onComplete();
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber
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
