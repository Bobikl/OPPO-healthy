package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableThrottleLatest$ThrottleLatestObserver<T> extends AtomicInteger implements bed<T>, cv5, Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    volatile boolean cancelled;
    volatile boolean done;
    final bed<? super T> downstream;
    final boolean emitLast;
    Throwable error;
    final AtomicReference<T> latest = new AtomicReference<>();
    final long timeout;
    volatile boolean timerFired;
    boolean timerRunning;
    final TimeUnit unit;
    cv5 upstream;
    final zeg.c worker;

    public ObservableThrottleLatest$ThrottleLatestObserver(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg.c cVar, boolean z) {
        this.downstream = bedVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
        this.emitLast = z;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
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
        bed<? super T> bedVar = this.downstream;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = this.done;
            if (z && this.error != null) {
                atomicReference.lazySet(null);
                bedVar.onError(this.error);
                this.worker.dispose();
                return;
            }
            boolean z2 = atomicReference.get() == null;
            if (z) {
                T andSet = atomicReference.getAndSet(null);
                if (!z2 && this.emitLast) {
                    bedVar.onNext(andSet);
                }
                bedVar.onComplete();
                this.worker.dispose();
                return;
            }
            if (z2) {
                if (this.timerFired) {
                    this.timerRunning = false;
                    this.timerFired = false;
                }
            } else if (!this.timerRunning || this.timerFired) {
                bedVar.onNext(atomicReference.getAndSet(null));
                this.timerFired = false;
                this.timerRunning = true;
                this.worker.c(this, this.timeout, this.unit);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.latest.set(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.timerFired = true;
        drain();
    }
}
