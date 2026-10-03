package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelReduceFull$ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
    private static final long serialVersionUID = -5370107872170712765L;
    final AtomicReference<ParallelReduceFull$SlotPair<T>> current;
    final AtomicReference<Throwable> error;
    final nd1<T, T, T> reducer;
    final AtomicInteger remaining;
    final ParallelReduceFull$ParallelReduceFullInnerSubscriber<T>[] subscribers;

    public ParallelReduceFull$ParallelReduceFullMainSubscriber(v2j<? super T> v2jVar, int i, nd1<T, T, T> nd1Var) {
        super(v2jVar);
        this.current = new AtomicReference<>();
        this.remaining = new AtomicInteger();
        this.error = new AtomicReference<>();
        ParallelReduceFull$ParallelReduceFullInnerSubscriber<T>[] parallelReduceFull$ParallelReduceFullInnerSubscriberArr = new ParallelReduceFull$ParallelReduceFullInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            parallelReduceFull$ParallelReduceFullInnerSubscriberArr[i2] = new ParallelReduceFull$ParallelReduceFullInnerSubscriber<>(this, nd1Var);
        }
        this.subscribers = parallelReduceFull$ParallelReduceFullInnerSubscriberArr;
        this.reducer = nd1Var;
        this.remaining.lazySet(i);
    }

    public ParallelReduceFull$SlotPair<T> addValue(T t) {
        ParallelReduceFull$SlotPair<T> parallelReduceFull$SlotPair;
        int iTryAcquireSlot;
        while (true) {
            parallelReduceFull$SlotPair = this.current.get();
            if (parallelReduceFull$SlotPair == null) {
                parallelReduceFull$SlotPair = new ParallelReduceFull$SlotPair<>();
                if (!fue.a(this.current, null, parallelReduceFull$SlotPair)) {
                    continue;
                }
            }
            iTryAcquireSlot = parallelReduceFull$SlotPair.tryAcquireSlot();
            if (iTryAcquireSlot >= 0) {
                break;
            }
            fue.a(this.current, parallelReduceFull$SlotPair, null);
        }
        if (iTryAcquireSlot == 0) {
            parallelReduceFull$SlotPair.first = t;
        } else {
            parallelReduceFull$SlotPair.second = t;
        }
        if (!parallelReduceFull$SlotPair.releaseSlot()) {
            return null;
        }
        fue.a(this.current, parallelReduceFull$SlotPair, null);
        return parallelReduceFull$SlotPair;
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        for (ParallelReduceFull$ParallelReduceFullInnerSubscriber<T> parallelReduceFull$ParallelReduceFullInnerSubscriber : this.subscribers) {
            parallelReduceFull$ParallelReduceFullInnerSubscriber.cancel();
        }
    }

    public void innerComplete(T t) {
        if (t != null) {
            while (true) {
                ParallelReduceFull$SlotPair<T> parallelReduceFull$SlotPairAddValue = addValue(t);
                if (parallelReduceFull$SlotPairAddValue == null) {
                    break;
                }
                try {
                    t = (T) abd.d(this.reducer.apply(parallelReduceFull$SlotPairAddValue.first, parallelReduceFull$SlotPairAddValue.second), "The reducer returned a null value");
                } catch (Throwable th) {
                    iu6.b(th);
                    innerError(th);
                    return;
                }
            }
        }
        if (this.remaining.decrementAndGet() == 0) {
            ParallelReduceFull$SlotPair<T> parallelReduceFull$SlotPair = this.current.get();
            this.current.lazySet(null);
            if (parallelReduceFull$SlotPair != null) {
                complete(parallelReduceFull$SlotPair.first);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public void innerError(Throwable th) {
        if (fue.a(this.error, null, th)) {
            cancel();
            this.downstream.onError(th);
        } else if (th != this.error.get()) {
            h4g.r(th);
        }
    }
}
