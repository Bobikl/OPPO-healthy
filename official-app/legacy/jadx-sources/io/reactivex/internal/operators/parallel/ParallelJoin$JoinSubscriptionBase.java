package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
abstract class ParallelJoin$JoinSubscriptionBase<T> extends AtomicInteger implements c3j {
    private static final long serialVersionUID = 3100232009247827843L;
    volatile boolean cancelled;
    final v2j<? super T> downstream;
    final ParallelJoin$JoinInnerSubscriber<T>[] subscribers;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicInteger done = new AtomicInteger();

    public ParallelJoin$JoinSubscriptionBase(v2j<? super T> v2jVar, int i, int i2) {
        this.downstream = v2jVar;
        ParallelJoin$JoinInnerSubscriber<T>[] parallelJoin$JoinInnerSubscriberArr = new ParallelJoin$JoinInnerSubscriber[i];
        for (int i3 = 0; i3 < i; i3++) {
            parallelJoin$JoinInnerSubscriberArr[i3] = new ParallelJoin$JoinInnerSubscriber<>(this, i2);
        }
        this.subscribers = parallelJoin$JoinInnerSubscriberArr;
        this.done.lazySet(i);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        cancelAll();
        if (getAndIncrement() == 0) {
            cleanup();
        }
    }

    public void cancelAll() {
        for (ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber : this.subscribers) {
            parallelJoin$JoinInnerSubscriber.cancel();
        }
    }

    public void cleanup() {
        for (ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber : this.subscribers) {
            parallelJoin$JoinInnerSubscriber.queue = null;
        }
    }

    public abstract void drain();

    public abstract void onComplete();

    public abstract void onError(Throwable th);

    public abstract void onNext(ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber, T t);

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }
}
