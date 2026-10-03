package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlattenIterable$FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements wu7<T> {
    private static final long serialVersionUID = -3096000382929934955L;
    volatile boolean cancelled;
    int consumed;
    Iterator<? extends R> current;
    volatile boolean done;
    final v2j<? super R> downstream;
    int fusionMode;
    final int limit;
    final j08<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;
    g4h<T> queue;
    c3j upstream;
    final AtomicReference<Throwable> error = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableFlattenIterable$FlattenIterableSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends Iterable<? extends R>> j08Var, int i) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
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

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, g4h<?> g4hVar) {
        if (this.cancelled) {
            this.current = null;
            g4hVar.clear();
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
        Throwable thB = ExceptionHelper.b(this.error);
        this.current = null;
        g4hVar.clear();
        v2jVar.onError(thB);
        return true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
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

    /* JADX WARN: Code duplicated, block: B:70:0x0124 A[PHI: r6
  0x0124: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0080, B:68:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x012b A[SYNTHETIC] */
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<?> v2jVar = this.downstream;
        g4h<T> g4hVar = this.queue;
        boolean z = true;
        boolean z2 = this.fusionMode != 1;
        Iterator<? extends R> it = this.current;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z3 = this.done;
                try {
                    T tPoll = g4hVar.poll();
                    if (checkTerminated(z3, tPoll == null ? z : false, v2jVar, g4hVar)) {
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
                            iu6.b(th);
                            this.upstream.cancel();
                            ExceptionHelper.a(this.error, th);
                            v2jVar.onError(ExceptionHelper.b(this.error));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    iu6.b(th2);
                    this.upstream.cancel();
                    ExceptionHelper.a(this.error, th2);
                    Throwable thB = ExceptionHelper.b(this.error);
                    this.current = null;
                    g4hVar.clear();
                    v2jVar.onError(thB);
                    return;
                }
            }
            if (it != null) {
                long j2 = this.requested.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (checkTerminated(this.done, false, v2jVar, g4hVar)) {
                        return;
                    }
                    try {
                        v2jVar.onNext((Object) abd.d(it.next(), "The iterator returned a null value"));
                        if (checkTerminated(this.done, false, v2jVar, g4hVar)) {
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
                            iu6.b(th3);
                            this.current = null;
                            this.upstream.cancel();
                            ExceptionHelper.a(this.error, th3);
                            v2jVar.onError(ExceptionHelper.b(this.error));
                            return;
                        }
                    } catch (Throwable th4) {
                        iu6.b(th4);
                        this.current = null;
                        this.upstream.cancel();
                        ExceptionHelper.a(this.error, th4);
                        v2jVar.onError(ExceptionHelper.b(this.error));
                        return;
                    }
                }
                if (j3 == j2) {
                    if (checkTerminated(this.done, g4hVar.isEmpty() && it == null, v2jVar, g4hVar)) {
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

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
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
            h4g.r(th);
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
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

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public R poll() throws Exception {
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
        R r = (R) abd.d(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.current = null;
        }
        return r;
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
        return ((i & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
    }
}
