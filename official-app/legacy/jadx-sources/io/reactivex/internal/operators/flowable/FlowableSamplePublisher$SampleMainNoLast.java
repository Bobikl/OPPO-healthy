package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSamplePublisher$SampleMainNoLast<T> extends FlowableSamplePublisher$SamplePublisherSubscriber<T> {
    private static final long serialVersionUID = -3029755663834015785L;

    public FlowableSamplePublisher$SampleMainNoLast(v2j<? super T> v2jVar, k3f<?> k3fVar) {
        super(v2jVar, k3fVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber
    public void completion() {
        this.downstream.onComplete();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber
    public void run() {
        emit();
    }
}
