package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelCollector$ParallelCollectorSubscriber<T, A, R> extends DeferredScalarSubscription<R> {
    private static final long serialVersionUID = -5370107872170712765L;
    final AtomicReference<ParallelCollector$SlotPair<A>> current;
    final AtomicThrowable error;
    final Function<A, R> finisher;
    final AtomicInteger remaining;
    final ParallelCollector$ParallelCollectorInnerSubscriber<T, A, R>[] subscribers;

    public ParallelCollector$ParallelCollectorSubscriber(v2j<? super R> v2jVar, int i, Collector<T, A, R> collector) {
        super(v2jVar);
        this.current = new AtomicReference<>();
        this.remaining = new AtomicInteger();
        this.error = new AtomicThrowable();
        this.finisher = collector.finisher();
        ParallelCollector$ParallelCollectorInnerSubscriber<T, A, R>[] parallelCollector$ParallelCollectorInnerSubscriberArr = new ParallelCollector$ParallelCollectorInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            parallelCollector$ParallelCollectorInnerSubscriberArr[i2] = new ParallelCollector$ParallelCollectorInnerSubscriber<>(this, collector.supplier().get(), collector.accumulator(), collector.combiner());
        }
        this.subscribers = parallelCollector$ParallelCollectorInnerSubscriberArr;
        this.remaining.lazySet(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParallelCollector$SlotPair<A> addValue(A a) {
        ParallelCollector$SlotPair<A> parallelCollector$SlotPair;
        int iTryAcquireSlot;
        while (true) {
            parallelCollector$SlotPair = this.current.get();
            if (parallelCollector$SlotPair == null) {
                parallelCollector$SlotPair = new ParallelCollector$SlotPair<>();
                if (!fue.a(this.current, null, parallelCollector$SlotPair)) {
                    continue;
                }
            }
            iTryAcquireSlot = parallelCollector$SlotPair.tryAcquireSlot();
            if (iTryAcquireSlot >= 0) {
                break;
            }
            fue.a(this.current, parallelCollector$SlotPair, null);
        }
        if (iTryAcquireSlot == 0) {
            parallelCollector$SlotPair.first = a;
        } else {
            parallelCollector$SlotPair.second = a;
        }
        if (!parallelCollector$SlotPair.releaseSlot()) {
            return null;
        }
        fue.a(this.current, parallelCollector$SlotPair, null);
        return parallelCollector$SlotPair;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        for (ParallelCollector$ParallelCollectorInnerSubscriber<T, A, R> parallelCollector$ParallelCollectorInnerSubscriber : this.subscribers) {
            parallelCollector$ParallelCollectorInnerSubscriber.cancel();
        }
    }

    public void innerComplete(A a, BinaryOperator<A> binaryOperator) {
        while (true) {
            ParallelCollector$SlotPair<A> parallelCollector$SlotPairAddValue = addValue(a);
            if (parallelCollector$SlotPairAddValue == null) {
                break;
            }
            try {
                a = (A) binaryOperator.apply(parallelCollector$SlotPairAddValue.first, parallelCollector$SlotPairAddValue.second);
            } catch (Throwable th) {
                hu6.b(th);
                innerError(th);
                return;
            }
        }
        if (this.remaining.decrementAndGet() == 0) {
            ParallelCollector$SlotPair<A> parallelCollector$SlotPair = this.current.get();
            this.current.lazySet(null);
            try {
                R rApply = this.finisher.apply(parallelCollector$SlotPair.first);
                Objects.requireNonNull(rApply, "The finisher returned a null value");
                complete(rApply);
            } catch (Throwable th2) {
                hu6.b(th2);
                innerError(th2);
            }
        }
    }

    public void innerError(Throwable th) {
        if (this.error.compareAndSet(null, th)) {
            cancel();
            this.downstream.onError(th);
        } else if (th != this.error.get()) {
            g4g.u(th);
        }
    }
}
