package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.wu7;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> implements wu7<Object> {
    public final FlowableSamplePublisher$SamplePublisherSubscriber<T> i;

    public d(FlowableSamplePublisher$SamplePublisherSubscriber<T> flowableSamplePublisher$SamplePublisherSubscriber) {
        this.i = flowableSamplePublisher$SamplePublisherSubscriber;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.i.complete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.i.error(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        this.i.run();
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        this.i.setOther(c3jVar);
    }
}
