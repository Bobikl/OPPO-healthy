package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableThrottleLatest$ThrottleLatestSubscriber<T> extends AtomicInteger implements wu7<T>, c3j, Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super T> downstream;
    final boolean emitLast;
    long emitted;
    Throwable error;
    final AtomicReference<T> latest = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();
    final long timeout;
    volatile boolean timerFired;
    boolean timerRunning;
    final TimeUnit unit;
    c3j upstream;
    final zeg.c worker;

    public FlowableThrottleLatest$ThrottleLatestSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, zeg.c cVar, boolean z) {
        this.downstream = v2jVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
        this.emitLast = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        this.worker.dispose();
        if (getAndIncrement() == 0) {
            this.latest.lazySet(null);
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference<T> atomicReference = this.latest;
        AtomicLong atomicLong = this.requested;
        v2j<? super T> v2jVar = this.downstream;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = this.done;
            if (z && this.error != null) {
                atomicReference.lazySet(null);
                v2jVar.onError(this.error);
                this.worker.dispose();
                return;
            }
            boolean z2 = atomicReference.get() == null;
            if (z) {
                if (z2 || !this.emitLast) {
                    atomicReference.lazySet(null);
                    v2jVar.onComplete();
                } else {
                    T andSet = atomicReference.getAndSet(null);
                    long j2 = this.emitted;
                    if (j2 != atomicLong.get()) {
                        this.emitted = j2 + 1;
                        v2jVar.onNext(andSet);
                        v2jVar.onComplete();
                    } else {
                        v2jVar.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                    }
                }
                this.worker.dispose();
                return;
            }
            if (z2) {
                if (this.timerFired) {
                    this.timerRunning = false;
                    this.timerFired = false;
                }
            } else if (!this.timerRunning || this.timerFired) {
                T andSet2 = atomicReference.getAndSet(null);
                long j3 = this.emitted;
                if (j3 == atomicLong.get()) {
                    this.upstream.cancel();
                    v2jVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                    this.worker.dispose();
                    return;
                } else {
                    v2jVar.onNext(andSet2);
                    this.emitted = j3 + 1;
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.c(this, this.timeout, this.unit);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.latest.set(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.timerFired = true;
        drain();
    }
}
