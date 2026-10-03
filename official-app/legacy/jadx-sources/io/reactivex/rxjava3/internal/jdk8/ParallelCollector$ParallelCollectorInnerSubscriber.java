package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelCollector$ParallelCollectorInnerSubscriber<T, A, R> extends AtomicReference<c3j> implements vu7<T> {
    private static final long serialVersionUID = -7954444275102466525L;
    final BiConsumer<A, T> accumulator;
    final BinaryOperator<A> combiner;
    A container;
    boolean done;
    final ParallelCollector$ParallelCollectorSubscriber<T, A, R> parent;

    public ParallelCollector$ParallelCollectorInnerSubscriber(ParallelCollector$ParallelCollectorSubscriber<T, A, R> parallelCollector$ParallelCollectorSubscriber, A a, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator) {
        this.parent = parallelCollector$ParallelCollectorSubscriber;
        this.accumulator = biConsumer;
        this.combiner = binaryOperator;
        this.container = a;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        A a = this.container;
        this.container = null;
        this.done = true;
        this.parent.innerComplete(a, this.combiner);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.container = null;
        this.done = true;
        this.parent.innerError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            this.accumulator.accept(this.container, t);
        } catch (Throwable th) {
            hu6.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
