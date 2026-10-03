package io.reactivex.rxjava3.internal.operators.flowable;

import OO0.O000;
import com.oplus.aiunit.vision.b4h;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMergeWithSingle$MergeWithObserver<T> extends AtomicInteger implements vu7<T>, c3j {
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
    volatile b4h<T> queue;
    T singleItem;
    final AtomicReference<c3j> mainSubscription = new AtomicReference<>();
    final OtherObserver<T> otherObserver = new OtherObserver<>(this);
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    public static final class OtherObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements l6h<T> {
        private static final long serialVersionUID = -2935427570954647017L;
        final FlowableMergeWithSingle$MergeWithObserver<T> parent;

        public OtherObserver(FlowableMergeWithSingle$MergeWithObserver<T> flowableMergeWithSingle$MergeWithObserver) {
            this.parent = flowableMergeWithSingle$MergeWithObserver;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.parent.otherSuccess(t);
        }
    }

    public FlowableMergeWithSingle$MergeWithObserver(v2j<? super T> v2jVar) {
        this.downstream = v2jVar;
        int iA = wt7.a();
        this.prefetch = iA;
        this.limit = iA - (iA >> 2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        SubscriptionHelper.cancel(this.mainSubscription);
        DisposableHelper.dispose(this.otherObserver);
        this.errors.tryTerminateAndReport();
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
                if (this.errors.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    this.errors.tryTerminateConsumer(this.downstream);
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
                    b4h<T> b4hVar = this.queue;
                    O000 o000Poll = b4hVar != null ? b4hVar.poll() : null;
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
                if (this.errors.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                boolean z3 = this.mainDone;
                b4h<T> b4hVar2 = this.queue;
                boolean z4 = b4hVar2 == null || b4hVar2.isEmpty();
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

    public b4h<T> getOrCreateQueue() {
        b4h<T> b4hVar = this.queue;
        if (b4hVar != null) {
            return b4hVar;
        }
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(wt7.a());
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
        if (this.errors.tryAddThrowableOrReport(th)) {
            DisposableHelper.dispose(this.otherObserver);
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (compareAndSet(0, 1)) {
            long j2 = this.emitted;
            if (this.requested.get() != j2) {
                b4h<T> b4hVar = this.queue;
                if (b4hVar == null || b4hVar.isEmpty()) {
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
                    b4hVar.offer(t);
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

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this.mainSubscription, c3jVar, this.prefetch);
    }

    public void otherError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
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
        vr0.a(this.requested, j2);
        drain();
    }
}
