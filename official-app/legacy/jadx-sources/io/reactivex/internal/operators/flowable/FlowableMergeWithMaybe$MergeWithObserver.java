package io.reactivex.internal.operators.flowable;

import OO0.O000;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMergeWithMaybe$MergeWithObserver<T> extends AtomicInteger implements wu7<T>, c3j {
    static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
    static final int OTHER_STATE_HAS_VALUE = 1;
    private static final long serialVersionUID = -4592979584110982903L;
    volatile boolean cancelled;
    int consumed;
    final v2j<? super T> downstream;
    long emitted;
    final int limit;
    volatile boolean mainDone;
    volatile int otherState;
    final int prefetch;
    volatile c4h<T> queue;
    T singleItem;
    final AtomicReference<c3j> mainSubscription = new AtomicReference<>();
    final OtherObserver<T> otherObserver = new OtherObserver<>(this);
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    public static final class OtherObserver<T> extends AtomicReference<cv5> implements mob<T> {
        private static final long serialVersionUID = -2935427570954647017L;
        final FlowableMergeWithMaybe$MergeWithObserver<T> parent;

        public OtherObserver(FlowableMergeWithMaybe$MergeWithObserver<T> flowableMergeWithMaybe$MergeWithObserver) {
            this.parent = flowableMergeWithMaybe$MergeWithObserver;
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(T t) {
            this.parent.otherSuccess(t);
        }
    }

    public FlowableMergeWithMaybe$MergeWithObserver(v2j<? super T> v2jVar) {
        this.downstream = v2jVar;
        int iA = xt7.a();
        this.prefetch = iA;
        this.limit = iA - (iA >> 2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        SubscriptionHelper.cancel(this.mainSubscription);
        DisposableHelper.dispose(this.otherObserver);
        if (getAndIncrement() == 0) {
            this.queue = null;
            this.singleItem = null;
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        v2j<? super T> v2jVar = this.downstream;
        long j2 = this.emitted;
        int i = this.consumed;
        int i2 = this.limit;
        int i3 = 1;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.requested.get();
            while (j2 != j3) {
                if (this.cancelled) {
                    this.singleItem = null;
                    this.queue = null;
                    return;
                }
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    v2jVar.onError(this.error.terminate());
                    return;
                }
                int i4 = this.otherState;
                if (i4 == i3) {
                    T t = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    v2jVar.onNext(t);
                    j2++;
                } else {
                    boolean z = this.mainDone;
                    c4h<T> c4hVar = this.queue;
                    O000 o000Poll = c4hVar != null ? c4hVar.poll() : null;
                    boolean z2 = o000Poll == null;
                    if (z && z2 && i4 == 2) {
                        this.queue = null;
                        v2jVar.onComplete();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        v2jVar.onNext(o000Poll);
                        j2++;
                        i++;
                        if (i == i2) {
                            this.mainSubscription.get().request(i2);
                            i = 0;
                        }
                        i3 = 1;
                    }
                }
            }
            if (j2 == j3) {
                if (this.cancelled) {
                    this.singleItem = null;
                    this.queue = null;
                    return;
                }
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    v2jVar.onError(this.error.terminate());
                    return;
                }
                boolean z3 = this.mainDone;
                c4h<T> c4hVar2 = this.queue;
                boolean z4 = c4hVar2 == null || c4hVar2.isEmpty();
                if (z3 && z4 && this.otherState == 2) {
                    this.queue = null;
                    v2jVar.onComplete();
                    return;
                }
            }
            this.emitted = j2;
            this.consumed = i;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                i3 = 1;
            }
        }
    }

    public c4h<T> getOrCreateQueue() {
        c4h<T> c4hVar = this.queue;
        if (c4hVar != null) {
            return c4hVar;
        }
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(xt7.a());
        this.queue = spscArrayQueue;
        return spscArrayQueue;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.mainDone = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
        } else {
            SubscriptionHelper.cancel(this.mainSubscription);
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (compareAndSet(0, 1)) {
            long j2 = this.emitted;
            if (this.requested.get() != j2) {
                c4h<T> c4hVar = this.queue;
                if (c4hVar == null || c4hVar.isEmpty()) {
                    this.emitted = j2 + 1;
                    this.downstream.onNext(t);
                    int i = this.consumed + 1;
                    if (i == this.limit) {
                        this.consumed = 0;
                        this.mainSubscription.get().request(i);
                    } else {
                        this.consumed = i;
                    }
                } else {
                    c4hVar.offer(t);
                }
            } else {
                getOrCreateQueue().offer(t);
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            getOrCreateQueue().offer(t);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this.mainSubscription, c3jVar, this.prefetch);
    }

    public void otherComplete() {
        this.otherState = 2;
        drain();
    }

    public void otherError(Throwable th) {
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
        } else {
            SubscriptionHelper.cancel(this.mainSubscription);
            drain();
        }
    }

    public void otherSuccess(T t) {
        if (compareAndSet(0, 1)) {
            long j2 = this.emitted;
            if (this.requested.get() != j2) {
                this.emitted = j2 + 1;
                this.downstream.onNext(t);
                this.otherState = 2;
            } else {
                this.singleItem = t;
                this.otherState = 1;
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        } else {
            this.singleItem = t;
            this.otherState = 1;
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        wr0.a(this.requested, j2);
        drain();
    }
}
