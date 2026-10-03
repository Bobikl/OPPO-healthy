package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableFromIterable$BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
    private static final long serialVersionUID = -2252972430506210021L;
    volatile boolean cancelled;
    Iterator<? extends T> it;
    boolean once;

    public FlowableFromIterable$BaseRangeSubscription(Iterator<? extends T> it) {
        this.it = it;
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void cancel() {
        this.cancelled = true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.g4h
    public final void clear() {
        this.it = null;
    }

    public abstract void fastPath();

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.g4h
    public final boolean isEmpty() {
        Iterator<? extends T> it = this.it;
        return it == null || !it.hasNext();
    }

    @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.g4h
    public final T poll() {
        Iterator<? extends T> it = this.it;
        if (it == null) {
            return null;
        }
        if (!this.once) {
            this.once = true;
        } else if (!it.hasNext()) {
            return null;
        }
        return (T) abd.d(this.it.next(), "Iterator.next() returned a null value");
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
}
