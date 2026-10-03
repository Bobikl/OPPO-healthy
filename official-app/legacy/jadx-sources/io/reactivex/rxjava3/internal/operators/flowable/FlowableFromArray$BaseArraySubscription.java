package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableFromArray$BaseArraySubscription<T> extends BasicQueueSubscription<T> {
    private static final long serialVersionUID = -2252972430506210021L;
    final T[] array;
    volatile boolean cancelled;
    int index;

    public FlowableFromArray$BaseArraySubscription(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void cancel() {
        this.cancelled = true;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f4h
    public final void clear() {
        this.index = this.array.length;
    }

    public abstract void fastPath();

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f4h
    public final boolean isEmpty() {
        return this.index == this.array.length;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f4h
    public final T poll() {
        int i = this.index;
        T[] tArr = this.array;
        if (i == tArr.length) {
            return null;
        }
        this.index = i + 1;
        T t = tArr[i];
        Objects.requireNonNull(t, "array element is null");
        return t;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        if (SubscriptionHelper.validate(j2) && vr0.a(this, j2) == 0) {
            if (j2 == Long.MAX_VALUE) {
                fastPath();
            } else {
                slowPath(j2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.e7f
    public final int requestFusion(int i) {
        return i & 1;
    }

    public abstract void slowPath(long j2);
}
