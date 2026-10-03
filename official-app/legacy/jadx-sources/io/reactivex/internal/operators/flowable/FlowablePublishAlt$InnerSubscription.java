package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublishAlt$InnerSubscription<T> extends AtomicLong implements c3j {
    private static final long serialVersionUID = 2845000326761540265L;
    final v2j<? super T> downstream;
    long emitted;
    final FlowablePublishAlt$PublishConnection<T> parent;

    public FlowablePublishAlt$InnerSubscription(v2j<? super T> v2jVar, FlowablePublishAlt$PublishConnection<T> flowablePublishAlt$PublishConnection) {
        this.downstream = v2jVar;
        this.parent = flowablePublishAlt$PublishConnection;
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
        wr0.b(this, j2);
        this.parent.drain();
    }
}
