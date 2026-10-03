package io.reactivex.rxjava3.internal.operators.flowable;

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
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlattenIterable$FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements vu7<T> {
    private static final long serialVersionUID = -3096000382929934955L;
    volatile boolean cancelled;
    int consumed;
    Iterator<? extends R> current;
    volatile boolean done;
    final v2j<? super R> downstream;
    int fusionMode;
    final int limit;
    final d08<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;
    f4h<T> queue;
    c3j upstream;
    final AtomicReference<Throwable> error = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableFlattenIterable$FlattenIterableSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends Iterable<? extends R>> d08Var, int i) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, f4h<?> f4hVar) {
        if (this.cancelled) {
            this.current = null;
            f4hVar.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (this.error.get() == null) {
            if (!z2) {
                return false;
            }
            v2jVar.onComplete();
            return true;
        }
        Throwable thE = ExceptionHelper.e(this.error);
        this.current = null;
        f4hVar.clear();
        v2jVar.onError(thE);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public void clear() {
        this.current = null;
        this.queue.clear();
    }

    public void consumedOne(boolean z) {
        if (z) {
            int i = this.consumed + 1;
            if (i != this.limit) {
                this.consumed = i;
            } else {
                this.consumed = 0;
                this.upstream.request(i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0123 A[PHI: r6
  0x0123: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0080, B:68:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x012a A[SYNTHETIC] */
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<?> v2jVar = this.downstream;
        f4h<T> f4hVar = this.queue;
        boolean z = true;
        boolean z2 = this.fusionMode != 1;
        Iterator<? extends R> it = this.current;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z3 = this.done;
                try {
                    T tPoll = f4hVar.poll();
                    if (checkTerminated(z3, tPoll == null ? z : false, v2jVar, f4hVar)) {
                        return;
                    }
                    if (tPoll != null) {
                        try {
                            it = this.mapper.apply(tPoll).iterator();
                            if (it.hasNext()) {
                                this.current = it;
                            } else {
                                consumedOne(z2);
                                it = null;
                            }
                        } catch (Throwable th) {
                            hu6.b(th);
                            this.upstream.cancel();
                            ExceptionHelper.a(this.error, th);
                            v2jVar.onError(ExceptionHelper.e(this.error));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    this.upstream.cancel();
                    ExceptionHelper.a(this.error, th2);
                    Throwable thE = ExceptionHelper.e(this.error);
                    this.current = null;
                    f4hVar.clear();
                    v2jVar.onError(thE);
                    return;
                }
            }
            if (it != null) {
                long j2 = this.requested.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (checkTerminated(this.done, false, v2jVar, f4hVar)) {
                        return;
                    }
                    try {
                        R next = it.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        v2jVar.onNext(next);
                        if (checkTerminated(this.done, false, v2jVar, f4hVar)) {
                            return;
                        }
                        j3++;
                        try {
                            if (!it.hasNext()) {
                                consumedOne(z2);
                                this.current = null;
                                it = null;
                                break;
                            }
                        } catch (Throwable th3) {
                            hu6.b(th3);
                            this.current = null;
                            this.upstream.cancel();
                            ExceptionHelper.a(this.error, th3);
                            v2jVar.onError(ExceptionHelper.e(this.error));
                            return;
                        }
                    } catch (Throwable th4) {
                        hu6.b(th4);
                        this.current = null;
                        this.upstream.cancel();
                        ExceptionHelper.a(this.error, th4);
                        v2jVar.onError(ExceptionHelper.e(this.error));
                        return;
                    }
                }
                if (j3 == j2) {
                    if (checkTerminated(this.done, f4hVar.isEmpty() && it == null, v2jVar, f4hVar)) {
                        return;
                    }
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j3);
                }
                if (it != null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            } else {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            z = true;
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return this.current == null && this.queue.isEmpty();
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
        if (this.done || !ExceptionHelper.a(this.error, th)) {
            g4g.u(th);
        } else {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.fusionMode != 0 || this.queue.offer(t)) {
            drain();
        } else {
            onError(new MissingBackpressureException("Queue is full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof g7f) {
                g7f g7fVar = (g7f) c3jVar;
                int iRequestFusion = g7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = g7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
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

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public R poll() throws Throwable {
        Iterator<? extends R> it = this.current;
        while (it == null) {
            T tPoll = this.queue.poll();
            if (tPoll != null) {
                it = this.mapper.apply(tPoll).iterator();
                if (it.hasNext()) {
                    this.current = it;
                    break;
                }
                it = null;
            } else {
                return null;
            }
        }
        R next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.current = null;
        }
        return next;
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
        return ((i & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
    }
}
