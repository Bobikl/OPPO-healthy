package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.bv7;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.dv7;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.zu7;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeoutTimed$TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements vu7<T>, bv7 {
    private static final long serialVersionUID = 3764492702657003550L;
    long consumed;
    final v2j<? super T> downstream;
    k3f<? extends T> fallback;
    final AtomicLong index;
    final SequentialDisposable task;
    final long timeout;
    final TimeUnit unit;
    final AtomicReference<c3j> upstream;
    final cfg.c worker;

    public FlowableTimeoutTimed$TimeoutFallbackSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, cfg.c cVar, k3f<? extends T> k3fVar) {
        super(true);
        this.downstream = v2jVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
        this.fallback = k3fVar;
        this.task = new SequentialDisposable();
        this.upstream = new AtomicReference<>();
        this.index = new AtomicLong();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.worker.dispose();
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
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = this.index.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 + 1;
            if (this.index.compareAndSet(j2, j3)) {
                this.task.get().dispose();
                this.consumed++;
                this.downstream.onNext(t);
                startTimeout(j3);
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
            long j3 = this.consumed;
            if (j3 != 0) {
                produced(j3);
            }
            k3f<? extends T> k3fVar = this.fallback;
            this.fallback = null;
            k3fVar.subscribe(new zu7(this.downstream, this));
            this.worker.dispose();
        }
    }

    public void startTimeout(long j2) {
        this.task.replace(this.worker.c(new dv7(j2, this), this.timeout, this.unit));
    }
}
