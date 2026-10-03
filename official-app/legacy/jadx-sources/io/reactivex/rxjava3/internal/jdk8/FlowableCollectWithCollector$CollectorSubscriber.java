package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCollectWithCollector$CollectorSubscriber<T, A, R> extends DeferredScalarSubscription<R> implements vu7<T> {
    private static final long serialVersionUID = -229544830565448758L;
    final BiConsumer<A, T> accumulator;
    A container;
    boolean done;
    final Function<A, R> finisher;
    c3j upstream;

    public FlowableCollectWithCollector$CollectorSubscriber(v2j<? super R> v2jVar, A a, BiConsumer<A, T> biConsumer, Function<A, R> function) {
        super(v2jVar);
        this.container = a;
        this.accumulator = biConsumer;
        this.finisher = function;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        A a = this.container;
        this.container = null;
        try {
            R rApply = this.finisher.apply(a);
            Objects.requireNonNull(rApply, "The finisher returned a null value");
            complete(rApply);
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        this.upstream = SubscriptionHelper.CANCELLED;
        this.container = null;
        this.downstream.onError(th);
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
            this.upstream.cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
