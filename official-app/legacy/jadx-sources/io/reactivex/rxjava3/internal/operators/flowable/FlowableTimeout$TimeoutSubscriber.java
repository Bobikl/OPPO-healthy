package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xu7;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeout$TimeoutSubscriber<T> extends AtomicLong implements vu7<T>, c3j, xu7 {
    private static final long serialVersionUID = 3764492702657003550L;
    final v2j<? super T> downstream;
    final d08<? super T, ? extends k3f<?>> itemTimeoutIndicator;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableTimeout$TimeoutSubscriber(v2j<? super T> v2jVar, d08<? super T, ? extends k3f<?>> d08Var) {
        this.downstream = v2jVar;
        this.itemTimeoutIndicator = d08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            g4g.u(th);
        } else {
            this.task.dispose();
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                io.reactivex.rxjava3.disposables.a aVar = this.task.get();
                if (aVar != null) {
                    aVar.dispose();
                }
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
                    getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.bv7
    public void onTimeout(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(new TimeoutException());
        }
    }

    @Override // com.oplus.aiunit.vision.xu7
    public void onTimeoutError(long j2, Throwable th) {
        if (!compareAndSet(j2, Long.MAX_VALUE)) {
            g4g.u(th);
        } else {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
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
