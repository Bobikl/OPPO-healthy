package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class AbstractBackpressureThrottlingSubscriber<T, R> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -5050301752721603566L;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super R> downstream;
    Throwable error;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<R> current = new AtomicReference<>();

    public AbstractBackpressureThrottlingSubscriber(v2j<? super R> v2jVar) {
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.current.lazySet(null);
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, AtomicReference<R> atomicReference) {
        if (this.cancelled) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            atomicReference.lazySet(null);
            v2jVar.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        v2jVar.onComplete();
        return true;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        AtomicLong atomicLong = this.requested;
        AtomicReference<R> atomicReference = this.current;
        int iAddAndGet = 1;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == atomicLong.get()) {
                    break;
                }
                boolean z = this.done;
                R andSet = atomicReference.getAndSet(null);
                boolean z2 = andSet == null;
                if (checkTerminated(z, z2, v2jVar, atomicReference)) {
                    return;
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(andSet);
                j2++;
            }
            if (j2 == atomicLong.get()) {
                if (checkTerminated(this.done, atomicReference.get() == null, v2jVar, atomicReference)) {
                    return;
                }
            }
            if (j2 != 0) {
                vr0.e(atomicLong, j2);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
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
    public abstract void onNext(T t);

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
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
            vr0.a(this.requested, j2);
            drain();
        }
    }
}
