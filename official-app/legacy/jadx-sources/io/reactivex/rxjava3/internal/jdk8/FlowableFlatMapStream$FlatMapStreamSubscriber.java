package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.g7f;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMapStream$FlatMapStreamSubscriber<T, R> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -5127032662980523968L;
    volatile boolean cancelled;
    int consumed;
    AutoCloseable currentCloseable;
    Iterator<? extends R> currentIterator;
    final v2j<? super R> downstream;
    long emitted;
    final d08<? super T, ? extends Stream<? extends R>> mapper;
    final int prefetch;
    f4h<T> queue;
    int sourceMode;
    c3j upstream;
    volatile boolean upstreamDone;
    final AtomicLong requested = new AtomicLong();
    final AtomicThrowable error = new AtomicThrowable();

    public FlowableFlatMapStream$FlatMapStreamSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends Stream<? extends R>> d08Var, int i) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
        this.prefetch = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        drain();
    }

    public void clearCurrentRethrowCloseError() throws Exception {
        this.currentIterator = null;
        AutoCloseable autoCloseable = this.currentCloseable;
        this.currentCloseable = null;
        if (autoCloseable != null) {
            autoCloseable.close();
        }
    }

    public void clearCurrentSuppressCloseError() {
        try {
            clearCurrentRethrowCloseError();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        f4h<T> f4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.error;
        Iterator<? extends R> it = this.currentIterator;
        long j2 = this.requested.get();
        long j3 = this.emitted;
        int i = this.prefetch;
        int i2 = i - (i >> 2);
        int i3 = 0;
        ?? r12 = 1;
        boolean z = this.sourceMode != 1;
        long j4 = j3;
        int iAddAndGet = 1;
        long j5 = j2;
        Iterator<? extends R> it2 = it;
        while (true) {
            if (this.cancelled) {
                f4hVar.clear();
                clearCurrentSuppressCloseError();
            } else {
                boolean z2 = this.upstreamDone;
                if (atomicThrowable.get() != null) {
                    v2jVar.onError(atomicThrowable.get());
                    this.cancelled = r12;
                } else if (it2 == null) {
                    try {
                        T tPoll = f4hVar.poll();
                        ?? r16 = tPoll == null ? r12 : i3;
                        if (z2 && r16 != 0) {
                            v2jVar.onComplete();
                            this.cancelled = r12;
                        } else if (r16 == 0) {
                            if (z) {
                                int i4 = this.consumed + r12;
                                this.consumed = i4;
                                if (i4 == i2) {
                                    this.consumed = i3;
                                    this.upstream.request(i2);
                                }
                            }
                            try {
                                Stream<? extends R> streamApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                                Stream<? extends R> stream = streamApply;
                                it2 = stream.iterator();
                                if (it2.hasNext()) {
                                    this.currentIterator = it2;
                                    this.currentCloseable = stream;
                                } else {
                                    it2 = null;
                                }
                            } catch (Throwable th) {
                                hu6.b(th);
                                trySignalError(v2jVar, th);
                            }
                        }
                        if (it2 == null && j4 != j5) {
                            try {
                                Object obj = (R) it2.next();
                                Objects.requireNonNull(obj, "The Stream.Iterator returned a null value");
                                if (!this.cancelled) {
                                    v2jVar.onNext(obj);
                                    j4++;
                                    if (!this.cancelled) {
                                        try {
                                            if (!it2.hasNext()) {
                                                try {
                                                    clearCurrentRethrowCloseError();
                                                    it2 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    it2 = null;
                                                    hu6.b(th);
                                                    trySignalError(v2jVar, th);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                hu6.b(th4);
                                trySignalError(v2jVar, th4);
                            }
                        }
                    } catch (Throwable th5) {
                        hu6.b(th5);
                        trySignalError(v2jVar, th5);
                    }
                } else if (it2 == null) {
                }
                i3 = 0;
                r12 = 1;
            }
            this.emitted = j4;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            j5 = this.requested.get();
            i3 = 0;
            r12 = 1;
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.upstreamDone = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.error.compareAndSet(null, th)) {
            g4g.u(th);
        } else {
            this.upstreamDone = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.sourceMode == 2 || this.queue.offer(t)) {
            drain();
        } else {
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof g7f) {
                g7f g7fVar = (g7f) c3jVar;
                int iRequestFusion = g7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    this.upstreamDone = true;
                    this.downstream.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    this.downstream.onSubscribe(this);
                    c3jVar.request(this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            this.downstream.onSubscribe(this);
            c3jVar.request(this.prefetch);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
    }

    public void trySignalError(v2j<?> v2jVar, Throwable th) {
        if (!this.error.compareAndSet(null, th)) {
            g4g.u(th);
            return;
        }
        this.upstream.cancel();
        this.cancelled = true;
        v2jVar.onError(th);
    }
}
