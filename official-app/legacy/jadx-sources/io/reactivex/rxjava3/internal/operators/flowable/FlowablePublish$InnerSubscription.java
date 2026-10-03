package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublish$InnerSubscription<T> extends AtomicLong implements c3j {
    private static final long serialVersionUID = 2845000326761540265L;
    final v2j<? super T> downstream;
    long emitted;
    final FlowablePublish$PublishConnection<T> parent;

    public FlowablePublish$InnerSubscription(v2j<? super T> v2jVar, FlowablePublish$PublishConnection<T> flowablePublish$PublishConnection) {
        this.downstream = v2jVar;
        this.parent = flowablePublish$PublishConnection;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.parent.remove(this);
            this.parent.drain();
        }
    }

    public boolean isCancelled() {
        return get() == Long.MIN_VALUE;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.b(this, j2);
            this.parent.drain();
        }
    }
}
