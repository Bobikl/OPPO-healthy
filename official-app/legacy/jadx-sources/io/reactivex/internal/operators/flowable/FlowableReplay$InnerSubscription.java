package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$InnerSubscription<T> extends AtomicLong implements c3j, cv5 {
    static final long CANCELLED = Long.MIN_VALUE;
    private static final long serialVersionUID = -4453897557930727610L;
    final v2j<? super T> child;
    boolean emitting;
    Object index;
    boolean missed;
    final FlowableReplay$ReplaySubscriber<T> parent;
    final AtomicLong totalRequested = new AtomicLong();

    public FlowableReplay$InnerSubscription(FlowableReplay$ReplaySubscriber<T> flowableReplay$ReplaySubscriber, v2j<? super T> v2jVar) {
        this.parent = flowableReplay$ReplaySubscriber;
        this.child = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.parent.remove(this);
            this.parent.manageRequests();
            this.index = null;
        }
    }

    public <U> U index() {
        return (U) this.index;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == Long.MIN_VALUE;
    }

    public long produced(long j2) {
        return wr0.f(this, j2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (!SubscriptionHelper.validate(j2) || wr0.b(this, j2) == Long.MIN_VALUE) {
            return;
        }
        wr0.a(this.totalRequested, j2);
        this.parent.manageRequests();
        this.parent.buffer.replay(this);
    }
}
