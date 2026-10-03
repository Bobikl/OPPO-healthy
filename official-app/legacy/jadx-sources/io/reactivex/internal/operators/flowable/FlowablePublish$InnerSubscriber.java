package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublish$InnerSubscriber<T> extends AtomicLong implements c3j {
    private static final long serialVersionUID = -4453897557930727610L;
    final v2j<? super T> child;
    long emitted;
    volatile FlowablePublish$PublishSubscriber<T> parent;

    public FlowablePublish$InnerSubscriber(v2j<? super T> v2jVar) {
        this.child = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        FlowablePublish$PublishSubscriber<T> flowablePublish$PublishSubscriber;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (flowablePublish$PublishSubscriber = this.parent) == null) {
            return;
        }
        flowablePublish$PublishSubscriber.remove(this);
        flowablePublish$PublishSubscriber.dispatch();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.b(this, j2);
            FlowablePublish$PublishSubscriber<T> flowablePublish$PublishSubscriber = this.parent;
            if (flowablePublish$PublishSubscriber != null) {
                flowablePublish$PublishSubscriber.dispatch();
            }
        }
    }
}
