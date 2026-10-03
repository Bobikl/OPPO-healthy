package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.yki;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMap$MergeSubscriber<T, U> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = -2117620485640801370L;
    final int bufferSize;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final v2j<? super U> downstream;
    final AtomicThrowable errs = new AtomicThrowable();
    long lastId;
    int lastIndex;
    final j08<? super T, ? extends k3f<? extends U>> mapper;
    final int maxConcurrency;
    volatile c4h<U> queue;
    final AtomicLong requested;
    int scalarEmitted;
    final int scalarLimit;
    final AtomicReference<FlowableFlatMap$InnerSubscriber<?, ?>[]> subscribers;
    long uniqueId;
    c3j upstream;
    static final FlowableFlatMap$InnerSubscriber<?, ?>[] EMPTY = new FlowableFlatMap$InnerSubscriber[0];
    static final FlowableFlatMap$InnerSubscriber<?, ?>[] CANCELLED = new FlowableFlatMap$InnerSubscriber[0];

    public FlowableFlatMap$MergeSubscriber(v2j<? super U> v2jVar, j08<? super T, ? extends k3f<? extends U>> j08Var, boolean z, int i, int i2) {
        AtomicReference<FlowableFlatMap$InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
        this.subscribers = atomicReference;
        this.requested = new AtomicLong();
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
        this.scalarLimit = Math.max(1, i >> 1);
        atomicReference.lazySet(EMPTY);
    }

    public boolean addInner(FlowableFlatMap$InnerSubscriber<T, U> flowableFlatMap$InnerSubscriber) {
        FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr;
        FlowableFlatMap$InnerSubscriber[] flowableFlatMap$InnerSubscriberArr2;
        do {
            flowableFlatMap$InnerSubscriberArr = this.subscribers.get();
            if (flowableFlatMap$InnerSubscriberArr == CANCELLED) {
                flowableFlatMap$InnerSubscriber.dispose();
                return false;
            }
            int length = flowableFlatMap$InnerSubscriberArr.length;
            flowableFlatMap$InnerSubscriberArr2 = new FlowableFlatMap$InnerSubscriber[length + 1];
            System.arraycopy(flowableFlatMap$InnerSubscriberArr, 0, flowableFlatMap$InnerSubscriberArr2, 0, length);
            flowableFlatMap$InnerSubscriberArr2[length] = flowableFlatMap$InnerSubscriber;
        } while (!fue.a(this.subscribers, flowableFlatMap$InnerSubscriberArr, flowableFlatMap$InnerSubscriberArr2));
        return true;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        c4h<U> c4hVar;
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        disposeAll();
        if (getAndIncrement() != 0 || (c4hVar = this.queue) == null) {
            return;
        }
        c4hVar.clear();
    }

    public boolean checkTerminate() {
        if (this.cancelled) {
            clearScalarQueue();
            return true;
        }
        if (this.delayErrors || this.errs.get() == null) {
            return false;
        }
        clearScalarQueue();
        Throwable thTerminate = this.errs.terminate();
        if (thTerminate != ExceptionHelper.TERMINATED) {
            this.downstream.onError(thTerminate);
        }
        return true;
    }

    public void clearScalarQueue() {
        c4h<U> c4hVar = this.queue;
        if (c4hVar != null) {
            c4hVar.clear();
        }
    }

    public void disposeAll() {
        FlowableFlatMap$InnerSubscriber<?, ?>[] andSet;
        FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr = this.subscribers.get();
        FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr2 = CANCELLED;
        if (flowableFlatMap$InnerSubscriberArr == flowableFlatMap$InnerSubscriberArr2 || (andSet = this.subscribers.getAndSet(flowableFlatMap$InnerSubscriberArr2)) == flowableFlatMap$InnerSubscriberArr2) {
            return;
        }
        for (FlowableFlatMap$InnerSubscriber<?, ?> flowableFlatMap$InnerSubscriber : andSet) {
            flowableFlatMap$InnerSubscriber.dispose();
        }
        Throwable thTerminate = this.errs.terminate();
        if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
            return;
        }
        h4g.r(thTerminate);
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drainLoop() {
        long j2;
        long j3;
        boolean z;
        int i;
        int i2;
        long j4;
        Object obj;
        v2j<? super U> v2jVar = this.downstream;
        int iAddAndGet = 1;
        while (!checkTerminate()) {
            c4h<U> c4hVar = this.queue;
            long jAddAndGet = this.requested.get();
            boolean z2 = jAddAndGet == Long.MAX_VALUE;
            long j5 = 0;
            long j6 = 0;
            if (c4hVar != null) {
                do {
                    long j7 = 0;
                    obj = null;
                    while (jAddAndGet != 0) {
                        U uPoll = c4hVar.poll();
                        if (checkTerminate()) {
                            return;
                        }
                        if (uPoll == null) {
                            obj = uPoll;
                            break;
                        }
                        v2jVar.onNext(uPoll);
                        j6++;
                        j7++;
                        jAddAndGet--;
                        obj = uPoll;
                    }
                    if (j7 != 0) {
                        jAddAndGet = z2 ? Long.MAX_VALUE : this.requested.addAndGet(-j7);
                    }
                    if (jAddAndGet == 0) {
                        break;
                    }
                } while (obj != null);
            }
            boolean z3 = this.done;
            c4h<U> c4hVar2 = this.queue;
            FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr = this.subscribers.get();
            int length = flowableFlatMap$InnerSubscriberArr.length;
            if (z3 && ((c4hVar2 == null || c4hVar2.isEmpty()) && length == 0)) {
                Throwable thTerminate = this.errs.terminate();
                if (thTerminate != ExceptionHelper.TERMINATED) {
                    if (thTerminate == null) {
                        v2jVar.onComplete();
                        return;
                    } else {
                        v2jVar.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
            int i3 = iAddAndGet;
            if (length != 0) {
                long j8 = this.lastId;
                int i4 = this.lastIndex;
                if (length <= i4 || flowableFlatMap$InnerSubscriberArr[i4].id != j8) {
                    if (length <= i4) {
                        i4 = 0;
                    }
                    for (int i5 = 0; i5 < length && flowableFlatMap$InnerSubscriberArr[i4].id != j8; i5++) {
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.lastIndex = i4;
                    this.lastId = flowableFlatMap$InnerSubscriberArr[i4].id;
                }
                int i6 = i4;
                boolean z4 = false;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        z = z4;
                        break;
                    }
                    if (checkTerminate()) {
                        return;
                    }
                    FlowableFlatMap$InnerSubscriber<T, U> flowableFlatMap$InnerSubscriber = flowableFlatMap$InnerSubscriberArr[i6];
                    Object obj2 = null;
                    while (!checkTerminate()) {
                        g4h<U> g4hVar = flowableFlatMap$InnerSubscriber.queue;
                        if (g4hVar == null) {
                            i = length;
                        } else {
                            i = length;
                            Object obj3 = obj2;
                            long j9 = j5;
                            while (jAddAndGet != j5) {
                                try {
                                    U uPoll2 = g4hVar.poll();
                                    if (uPoll2 == null) {
                                        obj3 = uPoll2;
                                        j5 = 0;
                                        break;
                                    }
                                    v2jVar.onNext(uPoll2);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    jAddAndGet--;
                                    j9++;
                                    obj3 = uPoll2;
                                    j5 = 0;
                                } catch (Throwable th) {
                                    iu6.b(th);
                                    flowableFlatMap$InnerSubscriber.dispose();
                                    this.errs.addThrowable(th);
                                    if (!this.delayErrors) {
                                        this.upstream.cancel();
                                    }
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    removeInner(flowableFlatMap$InnerSubscriber);
                                    i7++;
                                    z4 = true;
                                    i2 = 1;
                                }
                            }
                            if (j9 != j5) {
                                jAddAndGet = !z2 ? this.requested.addAndGet(-j9) : Long.MAX_VALUE;
                                flowableFlatMap$InnerSubscriber.requestMore(j9);
                                j4 = 0;
                            } else {
                                j4 = j5;
                            }
                            if (jAddAndGet != j4 && obj3 != null) {
                                length = i;
                                obj2 = obj3;
                                j5 = 0;
                            }
                        }
                        boolean z5 = flowableFlatMap$InnerSubscriber.done;
                        g4h<U> g4hVar2 = flowableFlatMap$InnerSubscriber.queue;
                        if (z5 && (g4hVar2 == null || g4hVar2.isEmpty())) {
                            removeInner(flowableFlatMap$InnerSubscriber);
                            if (checkTerminate()) {
                                return;
                            }
                            j6++;
                            z4 = true;
                        }
                        if (jAddAndGet == 0) {
                            z = z4;
                            break;
                        }
                        i6++;
                        if (i6 == i) {
                            i6 = 0;
                        }
                        i2 = 1;
                        i7 += i2;
                        length = i;
                        j5 = 0;
                    }
                    return;
                }
                this.lastIndex = i6;
                this.lastId = flowableFlatMap$InnerSubscriberArr[i6].id;
                j3 = j6;
                j2 = 0;
            } else {
                j2 = 0;
                j3 = j6;
                z = false;
            }
            if (j3 != j2 && !this.cancelled) {
                this.upstream.request(j3);
            }
            if (z) {
                iAddAndGet = i3;
            } else {
                iAddAndGet = addAndGet(-i3);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public g4h<U> getInnerQueue(FlowableFlatMap$InnerSubscriber<T, U> flowableFlatMap$InnerSubscriber) {
        g4h<U> g4hVar = flowableFlatMap$InnerSubscriber.queue;
        if (g4hVar != null) {
            return g4hVar;
        }
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
        flowableFlatMap$InnerSubscriber.queue = spscArrayQueue;
        return spscArrayQueue;
    }

    public g4h<U> getMainQueue() {
        c4h<U> ykiVar = this.queue;
        if (ykiVar == null) {
            ykiVar = this.maxConcurrency == Integer.MAX_VALUE ? new yki<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
            this.queue = ykiVar;
        }
        return ykiVar;
    }

    public void innerError(FlowableFlatMap$InnerSubscriber<T, U> flowableFlatMap$InnerSubscriber, Throwable th) {
        if (!this.errs.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        flowableFlatMap$InnerSubscriber.done = true;
        if (!this.delayErrors) {
            this.upstream.cancel();
            for (FlowableFlatMap$InnerSubscriber<?, ?> flowableFlatMap$InnerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                flowableFlatMap$InnerSubscriber2.dispose();
            }
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
        } else if (!this.errs.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            k3f k3fVar = (k3f) abd.d(this.mapper.apply(t), "The mapper returned a null Publisher");
            if (!(k3fVar instanceof Callable)) {
                long j2 = this.uniqueId;
                this.uniqueId = 1 + j2;
                FlowableFlatMap$InnerSubscriber flowableFlatMap$InnerSubscriber = new FlowableFlatMap$InnerSubscriber(this, j2);
                if (addInner(flowableFlatMap$InnerSubscriber)) {
                    k3fVar.subscribe(flowableFlatMap$InnerSubscriber);
                    return;
                }
                return;
            }
            try {
                Object objCall = ((Callable) k3fVar).call();
                if (objCall != null) {
                    tryEmitScalar(objCall);
                    return;
                }
                if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                    return;
                }
                int i = this.scalarEmitted + 1;
                this.scalarEmitted = i;
                int i2 = this.scalarLimit;
                if (i == i2) {
                    this.scalarEmitted = 0;
                    this.upstream.request(i2);
                }
            } catch (Throwable th) {
                iu6.b(th);
                this.errs.addThrowable(th);
                drain();
            }
        } catch (Throwable th2) {
            iu6.b(th2);
            this.upstream.cancel();
            onError(th2);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            if (this.cancelled) {
                return;
            }
            int i = this.maxConcurrency;
            if (i == Integer.MAX_VALUE) {
                c3jVar.request(Long.MAX_VALUE);
            } else {
                c3jVar.request(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeInner(FlowableFlatMap$InnerSubscriber<T, U> flowableFlatMap$InnerSubscriber) {
        FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr;
        FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr2;
        do {
            flowableFlatMap$InnerSubscriberArr = this.subscribers.get();
            int length = flowableFlatMap$InnerSubscriberArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (flowableFlatMap$InnerSubscriberArr[i] == flowableFlatMap$InnerSubscriber) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                flowableFlatMap$InnerSubscriberArr2 = EMPTY;
            } else {
                FlowableFlatMap$InnerSubscriber<?, ?>[] flowableFlatMap$InnerSubscriberArr3 = new FlowableFlatMap$InnerSubscriber[length - 1];
                System.arraycopy(flowableFlatMap$InnerSubscriberArr, 0, flowableFlatMap$InnerSubscriberArr3, 0, i);
                System.arraycopy(flowableFlatMap$InnerSubscriberArr, i + 1, flowableFlatMap$InnerSubscriberArr3, i, (length - i) - 1);
                flowableFlatMap$InnerSubscriberArr2 = flowableFlatMap$InnerSubscriberArr3;
            }
        } while (!fue.a(this.subscribers, flowableFlatMap$InnerSubscriberArr, flowableFlatMap$InnerSubscriberArr2));
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    public void tryEmit(U u, FlowableFlatMap$InnerSubscriber<T, U> flowableFlatMap$InnerSubscriber) {
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.requested.get();
            g4h<U> innerQueue = flowableFlatMap$InnerSubscriber.queue;
            if (j2 == 0 || !(innerQueue == null || innerQueue.isEmpty())) {
                if (innerQueue == null) {
                    innerQueue = getInnerQueue(flowableFlatMap$InnerSubscriber);
                }
                if (!innerQueue.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                }
            } else {
                this.downstream.onNext(u);
                if (j2 != Long.MAX_VALUE) {
                    this.requested.decrementAndGet();
                }
                flowableFlatMap$InnerSubscriber.requestMore(1L);
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            g4h spscArrayQueue = flowableFlatMap$InnerSubscriber.queue;
            if (spscArrayQueue == null) {
                spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                flowableFlatMap$InnerSubscriber.queue = spscArrayQueue;
            }
            if (!spscArrayQueue.offer(u)) {
                onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    public void tryEmitScalar(U u) {
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.requested.get();
            g4h<U> mainQueue = this.queue;
            if (j2 == 0 || !(mainQueue == null || mainQueue.isEmpty())) {
                if (mainQueue == null) {
                    mainQueue = getMainQueue();
                }
                if (!mainQueue.offer(u)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                }
            } else {
                this.downstream.onNext(u);
                if (j2 != Long.MAX_VALUE) {
                    this.requested.decrementAndGet();
                }
                if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                    int i = this.scalarEmitted + 1;
                    this.scalarEmitted = i;
                    int i2 = this.scalarLimit;
                    if (i == i2) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i2);
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else if (!getMainQueue().offer(u)) {
            onError(new IllegalStateException("Scalar queue full?!"));
            return;
        } else if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }
}
