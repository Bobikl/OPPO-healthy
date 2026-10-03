package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableGroupBy$State<T, K> extends BasicIntQueueSubscription<T> implements k3f<T> {
    private static final long serialVersionUID = -3852313036005250360L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final K key;
    boolean outputFused;
    final FlowableGroupBy$GroupBySubscriber<?, K, T> parent;
    int produced;
    final yki<T> queue;
    final AtomicLong requested = new AtomicLong();
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicReference<v2j<? super T>> actual = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public FlowableGroupBy$State(int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, K k, boolean z) {
        this.queue = new yki<>(i);
        this.parent = flowableGroupBy$GroupBySubscriber;
        this.key = k;
        this.delayError = z;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            this.parent.cancel(this.key);
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<? super T> v2jVar, boolean z3) {
        if (this.cancelled.get()) {
            this.queue.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            v2jVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        v2jVar.onComplete();
        return true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.queue.clear();
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
        yki<T> ykiVar = this.queue;
        v2j<? super T> v2jVar = this.actual.get();
        int iAddAndGet = 1;
        while (true) {
            if (v2jVar != null) {
                if (this.cancelled.get()) {
                    ykiVar.clear();
                    return;
                }
                boolean z = this.done;
                if (z && !this.delayError && (th = this.error) != null) {
                    ykiVar.clear();
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
        yki<T> ykiVar = this.queue;
        boolean z = this.delayError;
        v2j<? super T> v2jVar = this.actual.get();
        int iAddAndGet = 1;
        while (true) {
            if (v2jVar != null) {
                long j2 = this.requested.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z2 = this.done;
                    T tPoll = ykiVar.poll();
                    boolean z3 = tPoll == null;
                    if (checkTerminated(z2, z3, v2jVar, z)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    v2jVar.onNext(tPoll);
                    j3++;
                }
                if (j3 == j2 && checkTerminated(this.done, ykiVar.isEmpty(), v2jVar, z)) {
                    return;
                }
                if (j3 != 0) {
                    if (j2 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j3);
                    }
                    this.parent.upstream.request(j3);
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

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.queue.isEmpty();
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

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public T poll() {
        T tPoll = this.queue.poll();
        if (tPoll != null) {
            this.produced++;
            return tPoll;
        }
        int i = this.produced;
        if (i == 0) {
            return null;
        }
        this.produced = 0;
        this.parent.upstream.request(i);
        return null;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    @Override // com.oplus.aiunit.vision.k3f
    public void subscribe(v2j<? super T> v2jVar) {
        if (!this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), v2jVar);
            return;
        }
        v2jVar.onSubscribe(this);
        this.actual.lazySet(v2jVar);
        drain();
    }
}
