package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xu7;
import com.oplus.aiunit.vision.zu7;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeout$TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements vu7<T>, xu7 {
    private static final long serialVersionUID = 3764492702657003550L;
    long consumed;
    final v2j<? super T> downstream;
    k3f<? extends T> fallback;
    final AtomicLong index;
    final d08<? super T, ? extends k3f<?>> itemTimeoutIndicator;
    final SequentialDisposable task;
    final AtomicReference<c3j> upstream;

    public FlowableTimeout$TimeoutFallbackSubscriber(v2j<? super T> v2jVar, d08<? super T, ? extends k3f<?>> d08Var, k3f<? extends T> k3fVar) {
        super(true);
        this.downstream = v2jVar;
        this.itemTimeoutIndicator = d08Var;
        this.task = new SequentialDisposable();
        this.upstream = new AtomicReference<>();
        this.fallback = k3fVar;
        this.index = new AtomicLong();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.task.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            g4g.u(th);
            return;
        }
        this.task.dispose();
        this.downstream.onError(th);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = this.index.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 + 1;
            if (this.index.compareAndSet(j2, j3)) {
                io.reactivex.rxjava3.disposables.a aVar = this.task.get();
                if (aVar != null) {
                    aVar.dispose();
                }
                this.consumed++;
                this.downstream.onNext(t);
                try {
                    k3f<?> k3fVarApply = this.itemTimeoutIndicator.apply(t);
                    Objects.requireNonNull(k3fVarApply, "The itemTimeoutIndicator returned a null Publisher.");
                    k3f<?> k3fVar = k3fVarApply;
                    FlowableTimeout$TimeoutConsumer flowableTimeout$TimeoutConsumer = new FlowableTimeout$TimeoutConsumer(j3, this);
                    if (this.task.replace(flowableTimeout$TimeoutConsumer)) {
                        k3fVar.subscribe(flowableTimeout$TimeoutConsumer);
                    }
                } catch (Throwable th) {
                    hu6.b(th);
                    this.upstream.get().cancel();
                    this.index.getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this.upstream, c3jVar)) {
            setSubscription(c3jVar);
        }
    }

    @Override // com.oplus.aiunit.vision.bv7
    public void onTimeout(long j2) {
        if (this.index.compareAndSet(j2, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            k3f<? extends T> k3fVar = this.fallback;
            this.fallback = null;
            long j3 = this.consumed;
            if (j3 != 0) {
                produced(j3);
            }
            k3fVar.subscribe(new zu7(this.downstream, this));
        }
    }

    @Override // com.oplus.aiunit.vision.xu7
    public void onTimeoutError(long j2, Throwable th) {
        if (!this.index.compareAndSet(j2, Long.MAX_VALUE)) {
            g4g.u(th);
        } else {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }
    }

    public void startFirstTimeout(k3f<?> k3fVar) {
        if (k3fVar != null) {
            FlowableTimeout$TimeoutConsumer flowableTimeout$TimeoutConsumer = new FlowableTimeout$TimeoutConsumer(0L, this);
            if (this.task.replace(flowableTimeout$TimeoutConsumer)) {
                k3fVar.subscribe(flowableTimeout$TimeoutConsumer);
            }
        }
    }
}
