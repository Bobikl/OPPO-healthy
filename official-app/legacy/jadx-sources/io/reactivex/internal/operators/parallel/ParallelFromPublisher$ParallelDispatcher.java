package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelFromPublisher$ParallelDispatcher<T> extends AtomicInteger implements wu7<T> {
    private static final long serialVersionUID = -4470634016609963609L;
    volatile boolean cancelled;
    volatile boolean done;
    final long[] emissions;
    Throwable error;
    int index;
    final int limit;
    final int prefetch;
    int produced;
    g4h<T> queue;
    final AtomicLongArray requests;
    int sourceMode;
    final AtomicInteger subscriberCount = new AtomicInteger();
    final v2j<? super T>[] subscribers;
    c3j upstream;

    public final class a implements c3j {
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20502j;

        public a(int i, int i2) {
            this.i = i;
            this.f20502j = i2;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (ParallelFromPublisher$ParallelDispatcher.this.requests.compareAndSet(this.i + this.f20502j, 0L, 1L)) {
                ParallelFromPublisher$ParallelDispatcher parallelFromPublisher$ParallelDispatcher = ParallelFromPublisher$ParallelDispatcher.this;
                int i = this.f20502j;
                parallelFromPublisher$ParallelDispatcher.cancel(i + i);
            }
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            long j3;
            if (SubscriptionHelper.validate(j2)) {
                AtomicLongArray atomicLongArray = ParallelFromPublisher$ParallelDispatcher.this.requests;
                do {
                    j3 = atomicLongArray.get(this.i);
                    if (j3 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!atomicLongArray.compareAndSet(this.i, j3, wr0.c(j3, j2)));
                if (ParallelFromPublisher$ParallelDispatcher.this.subscriberCount.get() == this.f20502j) {
                    ParallelFromPublisher$ParallelDispatcher.this.drain();
                }
            }
        }
    }

    public ParallelFromPublisher$ParallelDispatcher(v2j<? super T>[] v2jVarArr, int i) {
        this.subscribers = v2jVarArr;
        this.prefetch = i;
        this.limit = i - (i >> 2);
        int length = v2jVarArr.length;
        int i2 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.requests = atomicLongArray;
        atomicLongArray.lazySet(i2, length);
        this.emissions = new long[length];
    }

    public void cancel(int i) {
        if (this.requests.decrementAndGet(i) == 0) {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        if (this.sourceMode == 1) {
            drainSync();
        } else {
            drainAsync();
        }
    }

    public void drainAsync() {
        Throwable th;
        g4h<T> g4hVar = this.queue;
        v2j<? super T>[] v2jVarArr = this.subscribers;
        AtomicLongArray atomicLongArray = this.requests;
        long[] jArr = this.emissions;
        int length = jArr.length;
        int i = this.index;
        int i2 = this.produced;
        int iAddAndGet = 1;
        while (true) {
            int i3 = 0;
            int i4 = 0;
            do {
                if (this.cancelled) {
                    g4hVar.clear();
                    return;
                }
                boolean z = this.done;
                if (z && (th = this.error) != null) {
                    g4hVar.clear();
                    int length2 = v2jVarArr.length;
                    while (i3 < length2) {
                        v2jVarArr[i3].onError(th);
                        i3++;
                    }
                    return;
                }
                boolean zIsEmpty = g4hVar.isEmpty();
                if (z && zIsEmpty) {
                    int length3 = v2jVarArr.length;
                    while (i3 < length3) {
                        v2jVarArr[i3].onComplete();
                        i3++;
                    }
                    return;
                }
                if (zIsEmpty) {
                    break;
                }
                long j2 = atomicLongArray.get(i);
                long j3 = jArr[i];
                if (j2 == j3 || atomicLongArray.get(length + i) != 0) {
                    i4++;
                } else {
                    try {
                        T tPoll = g4hVar.poll();
                        if (tPoll == null) {
                            break;
                        }
                        v2jVarArr[i].onNext(tPoll);
                        jArr[i] = j3 + 1;
                        i2++;
                        if (i2 == this.limit) {
                            this.upstream.request(i2);
                            i2 = 0;
                        }
                        i4 = 0;
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        this.upstream.cancel();
                        int length4 = v2jVarArr.length;
                        while (i3 < length4) {
                            v2jVarArr[i3].onError(th2);
                            i3++;
                        }
                        return;
                    }
                }
                i++;
                if (i == length) {
                    i = 0;
                }
            } while (i4 != length);
            int i5 = get();
            if (i5 == iAddAndGet) {
                this.index = i;
                this.produced = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i5;
            }
        }
    }

    public void drainSync() {
        g4h<T> g4hVar = this.queue;
        v2j<? super T>[] v2jVarArr = this.subscribers;
        AtomicLongArray atomicLongArray = this.requests;
        long[] jArr = this.emissions;
        int length = jArr.length;
        int i = this.index;
        int iAddAndGet = 1;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            do {
                if (this.cancelled) {
                    g4hVar.clear();
                    return;
                }
                if (g4hVar.isEmpty()) {
                    int length2 = v2jVarArr.length;
                    while (i2 < length2) {
                        v2jVarArr[i2].onComplete();
                        i2++;
                    }
                    return;
                }
                long j2 = atomicLongArray.get(i);
                long j3 = jArr[i];
                if (j2 == j3 || atomicLongArray.get(length + i) != 0) {
                    i3++;
                } else {
                    try {
                        T tPoll = g4hVar.poll();
                        if (tPoll == null) {
                            int length3 = v2jVarArr.length;
                            while (i2 < length3) {
                                v2jVarArr[i2].onComplete();
                                i2++;
                            }
                            return;
                        }
                        v2jVarArr[i].onNext(tPoll);
                        jArr[i] = j3 + 1;
                        i3 = 0;
                    } catch (Throwable th) {
                        iu6.b(th);
                        this.upstream.cancel();
                        int length4 = v2jVarArr.length;
                        while (i2 < length4) {
                            v2jVarArr[i2].onError(th);
                            i2++;
                        }
                        return;
                    }
                }
                i++;
                if (i == length) {
                    i = 0;
                }
            } while (i3 != length);
            int i4 = get();
            if (i4 == iAddAndGet) {
                this.index = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i4;
            }
        }
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
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            drain();
        } else {
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue is full?"));
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    setupSubscribers();
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    setupSubscribers();
                    c3jVar.request(this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            setupSubscribers();
            c3jVar.request(this.prefetch);
        }
    }

    public void setupSubscribers() {
        v2j<? super T>[] v2jVarArr = this.subscribers;
        int length = v2jVarArr.length;
        int i = 0;
        while (i < length && !this.cancelled) {
            int i2 = i + 1;
            this.subscriberCount.lazySet(i2);
            v2jVarArr[i].onSubscribe(new a(i, length));
            i = i2;
        }
    }
}
