package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableSampleTimed$SampleTimedSubscriber<T> extends AtomicReference<T> implements vu7<T>, c3j, Runnable {
    private static final long serialVersionUID = -3517602651313910099L;
    final v2j<? super T> downstream;
    final long period;
    final cfg scheduler;
    final TimeUnit unit;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final SequentialDisposable timer = new SequentialDisposable();

    public FlowableSampleTimed$SampleTimedSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
        this.downstream = v2jVar;
        this.period = j2;
        this.unit = timeUnit;
        this.scheduler = cfgVar;
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
                vr0.e(this.requested, 1L);
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

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            SequentialDisposable sequentialDisposable = this.timer;
            cfg cfgVar = this.scheduler;
            long j2 = this.period;
            sequentialDisposable.replace(cfgVar.j(this, j2, j2, this.unit));
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
        }
    }
}
