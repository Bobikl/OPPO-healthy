package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.bv7;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.dv7;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeoutTimed$TimeoutSubscriber<T> extends AtomicLong implements vu7<T>, c3j, bv7 {
    private static final long serialVersionUID = 3764492702657003550L;
    final v2j<? super T> downstream;
    final long timeout;
    final TimeUnit unit;
    final cfg.c worker;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableTimeoutTimed$TimeoutSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, cfg.c cVar) {
        this.downstream = v2jVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.worker.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            g4g.u(th);
            return;
        }
        this.task.dispose();
        this.downstream.onError(th);
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                this.task.get().dispose();
                this.downstream.onNext(t);
                startTimeout(j3);
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
            this.downstream.onError(new TimeoutException(ExceptionHelper.g(this.timeout, this.unit)));
            this.worker.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }

    public void startTimeout(long j2) {
        this.task.replace(this.worker.c(new dv7(j2, this), this.timeout, this.unit));
    }
}
