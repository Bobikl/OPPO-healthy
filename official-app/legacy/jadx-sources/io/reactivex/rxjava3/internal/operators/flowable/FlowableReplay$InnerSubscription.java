package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$InnerSubscription<T> extends AtomicLong implements c3j, io.reactivex.rxjava3.disposables.a {
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

    @Override // io.reactivex.rxjava3.disposables.a
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

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == Long.MIN_VALUE;
    }

    public long produced(long j2) {
        return vr0.f(this, j2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (!SubscriptionHelper.validate(j2) || vr0.b(this, j2) == Long.MIN_VALUE) {
            return;
        }
        vr0.a(this.totalRequested, j2);
        this.parent.manageRequests();
        this.parent.buffer.replay(this);
    }
}
