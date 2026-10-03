package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv7;
import com.oplus.aiunit.vision.ev7;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeoutTimed$TimeoutSubscriber<T> extends AtomicLong implements wu7<T>, c3j, cv7 {
    private static final long serialVersionUID = 3764492702657003550L;
    final v2j<? super T> downstream;
    final long timeout;
    final TimeUnit unit;
    final zeg.c worker;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableTimeoutTimed$TimeoutSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, zeg.c cVar) {
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
            h4g.r(th);
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.cv7
    public void onTimeout(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(new TimeoutException(ExceptionHelper.c(this.timeout, this.unit)));
            this.worker.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }

    public void startTimeout(long j2) {
        this.task.replace(this.worker.c(new ev7(j2, this), this.timeout, this.unit));
    }
}
