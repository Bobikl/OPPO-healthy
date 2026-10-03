package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCreate$LatestAsyncEmitter<T> extends FlowableCreate$BaseEmitter<T> {
    private static final long serialVersionUID = 4023437720691792495L;
    volatile boolean done;
    Throwable error;
    final AtomicReference<T> queue;
    final AtomicInteger wip;

    public FlowableCreate$LatestAsyncEmitter(v2j<? super T> v2jVar) {
        super(v2jVar);
        this.queue = new AtomicReference<>();
        this.wip = new AtomicInteger();
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        v2j<? super T> v2jVar = this.downstream;
        AtomicReference<T> atomicReference = this.queue;
        int iAddAndGet = 1;
        do {
            long j2 = get();
            long j3 = 0;
            while (true) {
                if (j3 == j2) {
                    break;
                }
                if (isCancelled()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z = this.done;
                T andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (z && z2) {
                    Throwable th = this.error;
                    if (th != null) {
                        error(th);
                        return;
                    } else {
                        complete();
                        return;
                    }
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(andSet);
                j3++;
            }
            if (j3 == j2) {
                if (isCancelled()) {
                    atomicReference.lazySet(null);
                    return;
                }
                boolean z3 = this.done;
                boolean z4 = atomicReference.get() == null;
                if (z3 && z4) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        error(th2);
                        return;
                    } else {
                        complete();
                        return;
                    }
                }
            }
            if (j3 != 0) {
                wr0.e(this, j3);
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter, com.oplus.aiunit.vision.ll6
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter, com.oplus.aiunit.vision.ll6
    public void onNext(T t) {
        if (this.done || isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.queue.set(t);
            drain();
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter
    public void onRequested() {
        drain();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter
    public void onUnsubscribed() {
        if (this.wip.getAndIncrement() == 0) {
            this.queue.lazySet(null);
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter
    public boolean tryOnError(Throwable th) {
        if (this.done || isCancelled()) {
            return false;
        }
        if (th == null) {
            onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
        this.error = th;
        this.done = true;
        drain();
        return true;
    }
}
