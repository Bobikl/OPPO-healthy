package io.reactivex.internal.operators.flowable;

import OO0.O000;
import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMapMaybe$FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = 8600231336733376951L;
    volatile boolean cancelled;
    final boolean delayErrors;
    final v2j<? super R> downstream;
    final j08<? super T, ? extends qob<? extends R>> mapper;
    final int maxConcurrency;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final ys3 set = new ys3();
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicInteger active = new AtomicInteger(1);
    final AtomicReference<yki<R>> queue = new AtomicReference<>();

    public final class InnerObserver extends AtomicReference<cv5> implements mob<R>, cv5 {
        private static final long serialVersionUID = -502562646270949838L;

        public InnerObserver() {
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            FlowableFlatMapMaybe$FlatMapMaybeSubscriber.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            FlowableFlatMapMaybe$FlatMapMaybeSubscriber.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(R r) {
            FlowableFlatMapMaybe$FlatMapMaybeSubscriber.this.innerSuccess(this, r);
        }
    }

    public FlowableFlatMapMaybe$FlatMapMaybeSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends qob<? extends R>> j08Var, boolean z, int i) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.delayErrors = z;
        this.maxConcurrency = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        this.set.dispose();
    }

    public void clear() {
        yki<R> ykiVar = this.queue.get();
        if (ykiVar != null) {
            ykiVar.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        v2j<? super R> v2jVar = this.downstream;
        AtomicInteger atomicInteger = this.active;
        AtomicReference<yki<R>> atomicReference = this.queue;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (true) {
                if (j3 == j2) {
                    break;
                }
                if (this.cancelled) {
                    clear();
                    return;
                }
                if (!this.delayErrors && this.errors.get() != null) {
                    Throwable thTerminate = this.errors.terminate();
                    clear();
                    v2jVar.onError(thTerminate);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                yki<R> ykiVar = atomicReference.get();
                O000 o000Poll = ykiVar != null ? ykiVar.poll() : null;
                boolean z2 = o000Poll == null;
                if (z && z2) {
                    Throwable thTerminate2 = this.errors.terminate();
                    if (thTerminate2 != null) {
                        v2jVar.onError(thTerminate2);
                        return;
                    } else {
                        v2jVar.onComplete();
                        return;
                    }
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(o000Poll);
                j3++;
            }
            if (j3 == j2) {
                if (this.cancelled) {
                    clear();
                    return;
                }
                if (!this.delayErrors && this.errors.get() != null) {
                    Throwable thTerminate3 = this.errors.terminate();
                    clear();
                    v2jVar.onError(thTerminate3);
                    return;
                }
                boolean z3 = atomicInteger.get() == 0;
                yki<R> ykiVar2 = atomicReference.get();
                boolean z4 = ykiVar2 == null || ykiVar2.isEmpty();
                if (z3 && z4) {
                    Throwable thTerminate4 = this.errors.terminate();
                    if (thTerminate4 != null) {
                        v2jVar.onError(thTerminate4);
                        return;
                    } else {
                        v2jVar.onComplete();
                        return;
                    }
                }
            }
            if (j3 != 0) {
                wr0.e(this.requested, j3);
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(j3);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public yki<R> getOrCreateQueue() {
        yki<R> ykiVar;
        do {
            yki<R> ykiVar2 = this.queue.get();
            if (ykiVar2 != null) {
                return ykiVar2;
            }
            ykiVar = new yki<>(xt7.a());
        } while (!fue.a(this.queue, null, ykiVar));
        return ykiVar;
    }

    public void innerComplete(FlowableFlatMapMaybe$FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver) {
        this.set.b(innerObserver);
        if (get() == 0) {
            if (compareAndSet(0, 1)) {
                boolean z = this.active.decrementAndGet() == 0;
                yki<R> ykiVar = this.queue.get();
                if (z && (ykiVar == null || ykiVar.isEmpty())) {
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != null) {
                        this.downstream.onError(thTerminate);
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    this.upstream.request(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
                drainLoop();
                return;
            }
        }
        this.active.decrementAndGet();
        if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1L);
        }
        drain();
    }

    public void innerError(FlowableFlatMapMaybe$FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, Throwable th) {
        this.set.b(innerObserver);
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            this.upstream.cancel();
            this.set.dispose();
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1L);
        }
        this.active.decrementAndGet();
        drain();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void innerSuccess(FlowableFlatMapMaybe$FlatMapMaybeSubscriber<T, R>.InnerObserver innerObserver, R r) {
        yki<R> orCreateQueue;
        this.set.b(innerObserver);
        if (get() == 0) {
            if (compareAndSet(0, 1)) {
                boolean z = this.active.decrementAndGet() == 0;
                if (this.requested.get() != 0) {
                    this.downstream.onNext(r);
                    yki<R> ykiVar = this.queue.get();
                    if (z && (ykiVar == null || ykiVar.isEmpty())) {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                    wr0.e(this.requested, 1L);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(1L);
                    }
                } else {
                    yki<R> orCreateQueue2 = getOrCreateQueue();
                    synchronized (orCreateQueue2) {
                        orCreateQueue2.offer(r);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                orCreateQueue = getOrCreateQueue();
                synchronized (orCreateQueue) {
                    orCreateQueue.offer(r);
                }
                this.active.decrementAndGet();
                if (getAndIncrement() != 0) {
                    return;
                }
            }
        } else {
            orCreateQueue = getOrCreateQueue();
            synchronized (orCreateQueue) {
                orCreateQueue.offer(r);
                this.active.decrementAndGet();
                if (getAndIncrement() != 0) {
                    return;
                }
            }
        }
        drainLoop();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.active.decrementAndGet();
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.active.decrementAndGet();
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            this.set.dispose();
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            qob qobVar = (qob) abd.d(this.mapper.apply(t), "The mapper returned a null MaybeSource");
            this.active.getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (this.cancelled || !this.set.a(innerObserver)) {
                return;
            }
            qobVar.a(innerObserver);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            int i = this.maxConcurrency;
            if (i == Integer.MAX_VALUE) {
                c3jVar.request(Long.MAX_VALUE);
            } else {
                c3jVar.request(i);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }
}
