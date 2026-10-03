package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableGroupBy$State<T, K> extends BasicIntQueueSubscription<T> implements k3f<T> {
    static final int ABANDONED = 2;
    static final int ABANDONED_HAS_SUBSCRIBER = 3;
    static final int FRESH = 0;
    static final int HAS_SUBSCRIBER = 1;
    private static final long serialVersionUID = -3852313036005250360L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final K key;
    boolean outputFused;
    final FlowableGroupBy$GroupBySubscriber<?, K, T> parent;
    int produced;
    final xki<T> queue;
    final AtomicLong requested = new AtomicLong();
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicReference<v2j<? super T>> actual = new AtomicReference<>();
    final AtomicInteger once = new AtomicInteger();
    final AtomicBoolean evictOnce = new AtomicBoolean();

    public FlowableGroupBy$State(int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, K k, boolean z) {
        this.queue = new xki<>(i);
        this.parent = flowableGroupBy$GroupBySubscriber;
        this.key = k;
        this.delayError = z;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            cancelParent();
            drain();
        }
    }

    public void cancelParent() {
        if ((this.once.get() & 2) == 0 && this.evictOnce.compareAndSet(false, true)) {
            this.parent.cancel(this.key);
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<? super T> v2jVar, boolean z3, long j2, boolean z4) {
        if (this.cancelled.get()) {
            cleanupQueue(j2, z4);
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            this.cancelled.lazySet(true);
            Throwable th = this.error;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
                replenishParent(j2, z4);
            }
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            this.cancelled.lazySet(true);
            v2jVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.cancelled.lazySet(true);
        v2jVar.onComplete();
        replenishParent(j2, z4);
        return true;
    }

    public void cleanupQueue(long j2, boolean z) {
        while (this.queue.poll() != null) {
            j2++;
        }
        replenishParent(j2, z);
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public void clear() {
        xki<T> xkiVar = this.queue;
        while (xkiVar.poll() != null) {
            this.produced++;
        }
        tryReplenish();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        if (this.outputFused) {
            drainFused();
        } else {
            drainNormal();
        }
    }

    public void drainFused() {
        Throwable th;
        xki<T> xkiVar = this.queue;
        v2j<? super T> v2jVar = this.actual.get();
        int iAddAndGet = 1;
        while (true) {
            if (v2jVar != null) {
                if (this.cancelled.get()) {
                    return;
                }
                boolean z = this.done;
                if (z && !this.delayError && (th = this.error) != null) {
                    xkiVar.clear();
                    v2jVar.onError(th);
                    return;
                }
                v2jVar.onNext(null);
                if (z) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        v2jVar.onError(th2);
                        return;
                    } else {
                        v2jVar.onComplete();
                        return;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (v2jVar == null) {
                v2jVar = this.actual.get();
            }
        }
    }

    public void drainNormal() {
        long j2;
        long j3;
        long j4;
        xki<T> xkiVar = this.queue;
        boolean z = this.delayError;
        v2j<? super T> v2jVar = this.actual.get();
        AtomicBoolean atomicBoolean = this.cancelled;
        v2j<? super T> v2jVar2 = v2jVar;
        int iAddAndGet = 1;
        while (true) {
            long j5 = 0;
            if (atomicBoolean.get()) {
                cleanupQueue(0L, false);
            } else if (v2jVar2 != null) {
                long j6 = this.requested.get();
                long j7 = 0;
                while (true) {
                    if (j7 != j6) {
                        boolean z2 = this.done;
                        T tPoll = xkiVar.poll();
                        boolean z3 = tPoll == null;
                        long j8 = j7;
                        j2 = j5;
                        if (checkTerminated(z2, z3, v2jVar2, z, j8, !z3)) {
                            continue;
                        } else if (z3) {
                            j3 = j8;
                        } else {
                            v2jVar2.onNext(tPoll);
                            j7 = j8 + 1;
                            j5 = j2;
                        }
                    } else {
                        j2 = j5;
                        j3 = j7;
                    }
                    if (j7 == j6) {
                        long j9 = j3;
                        if (checkTerminated(this.done, xkiVar.isEmpty(), v2jVar2, z, j3, false)) {
                            continue;
                        } else {
                            j4 = j9;
                        }
                    } else {
                        j4 = j3;
                    }
                    if (j4 != j2) {
                        vr0.e(this.requested, j4);
                        requestParent(j4);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (v2jVar2 == null) {
                v2jVar2 = this.actual.get();
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        if (this.queue.isEmpty()) {
            tryReplenish();
            return true;
        }
        tryReplenish();
        return false;
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public T poll() {
        T tPoll = this.queue.poll();
        if (tPoll != null) {
            this.produced++;
            return tPoll;
        }
        tryReplenish();
        return null;
    }

    public void replenishParent(long j2, boolean z) {
        if (z) {
            j2++;
        }
        if (j2 != 0) {
            requestParent(j2);
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.e7f
    public int requestFusion(int i) {
        return 0;
    }

    public void requestParent(long j2) {
        if ((this.once.get() & 2) == 0) {
            this.parent.requestGroup(j2);
        }
    }

    @Override // com.oplus.aiunit.vision.k3f
    public void subscribe(v2j<? super T> v2jVar) {
        int i;
        do {
            i = this.once.get();
            if ((i & 1) != 0) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), v2jVar);
                return;
            }
        } while (!this.once.compareAndSet(i, i | 1));
        v2jVar.onSubscribe(this);
        this.actual.lazySet(v2jVar);
        if (this.cancelled.get()) {
            this.actual.lazySet(null);
        } else {
            drain();
        }
    }

    public boolean tryAbandon() {
        return this.once.get() == 0 && this.once.compareAndSet(0, 2);
    }

    public boolean tryComplete() {
        boolean zCompareAndSet = this.evictOnce.compareAndSet(false, true);
        this.done = true;
        drain();
        return zCompareAndSet;
    }

    public void tryReplenish() {
        int i = this.produced;
        if (i != 0) {
            this.produced = 0;
            requestParent(i);
        }
    }
}
