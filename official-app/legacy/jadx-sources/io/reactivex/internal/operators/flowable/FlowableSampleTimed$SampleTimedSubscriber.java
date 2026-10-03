package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableSampleTimed$SampleTimedSubscriber<T> extends AtomicReference<T> implements wu7<T>, c3j, Runnable {
    private static final long serialVersionUID = -3517602651313910099L;
    final v2j<? super T> downstream;
    final long period;
    final zeg scheduler;
    final TimeUnit unit;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final SequentialDisposable timer = new SequentialDisposable();

    public FlowableSampleTimed$SampleTimedSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, zeg zegVar) {
        this.downstream = v2jVar;
        this.period = j2;
        this.unit = timeUnit;
        this.scheduler = zegVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        cancelTimer();
        this.upstream.cancel();
    }

    public void cancelTimer() {
        DisposableHelper.dispose(this.timer);
    }

    public abstract void complete();

    public void emit() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            if (this.requested.get() != 0) {
                this.downstream.onNext(andSet);
                wr0.e(this.requested, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        cancelTimer();
        complete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        cancelTimer();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        lazySet(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            SequentialDisposable sequentialDisposable = this.timer;
            zeg zegVar = this.scheduler;
            long j2 = this.period;
            sequentialDisposable.replace(zegVar.e(this, j2, j2, this.unit));
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
        }
    }
}
