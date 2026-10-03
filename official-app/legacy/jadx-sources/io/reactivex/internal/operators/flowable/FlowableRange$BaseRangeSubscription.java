package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableRange$BaseRangeSubscription extends BasicQueueSubscription<Integer> {
    private static final long serialVersionUID = -2252972430506210021L;
    volatile boolean cancelled;
    final int end;
    int index;

    public FlowableRange$BaseRangeSubscription(int i, int i2) {
        this.index = i;
        this.end = i2;
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
    public final Integer poll() {
        int i = this.index;
        if (i == this.end) {
            return null;
        }
        this.index = i + 1;
        return Integer.valueOf(i);
    }
}
