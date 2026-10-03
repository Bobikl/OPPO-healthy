package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableRangeLong$BaseRangeSubscription extends BasicQueueSubscription<Long> {
    private static final long serialVersionUID = -2252972430506210021L;
    volatile boolean cancelled;
    final long end;
    long index;

    public FlowableRangeLong$BaseRangeSubscription(long j2, long j3) {
        this.index = j2;
        this.end = j3;
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void cancel() {
        this.cancelled = true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.g4h
    public final void clear() {
        this.index = this.end;
    }

    public abstract void fastPath();

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.g4h
    public final boolean isEmpty() {
        return this.index == this.end;
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        if (SubscriptionHelper.validate(j2) && wr0.a(this, j2) == 0) {
            if (j2 == Long.MAX_VALUE) {
                fastPath();
            } else {
                slowPath(j2);
            }
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f7f
    public final int requestFusion(int i) {
        return i & 1;
    }

    public abstract void slowPath(long j2);

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.g4h
    public final Long poll() {
        long j2 = this.index;
        if (j2 == this.end) {
            return null;
        }
        this.index = 1 + j2;
        return Long.valueOf(j2);
    }
}
