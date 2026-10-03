package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.b9a;
import com.oplus.aiunit.vision.c3j;
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
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j, b9a<R> {
    private static final long serialVersionUID = -4255299542215038287L;
    volatile boolean cancelled;
    volatile InnerQueuedSubscriber<R> current;
    volatile boolean done;
    final v2j<? super R> downstream;
    final ErrorMode errorMode;
    final j08<? super T, ? extends k3f<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final yki<InnerQueuedSubscriber<R>> subscribers;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    public FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends k3f<? extends R>> j08Var, int i, int i2, ErrorMode errorMode) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
        this.subscribers = new yki<>(Math.min(i2, i));
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        drainAndCancel();
    }

    public void cancelAll() {
        InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
        this.current = null;
        if (innerQueuedSubscriber != null) {
            innerQueuedSubscriber.cancel();
        }
        while (true) {
            InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.subscribers.poll();
            if (innerQueuedSubscriberPoll == null) {
                return;
            } else {
                innerQueuedSubscriberPoll.cancel();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.b9a
    public void drain() {
        int i;
        boolean z;
        long j2;
        long j3;
        g4h<R> g4hVarQueue;
        if (getAndIncrement() != 0) {
            return;
        }
        InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.current;
        v2j<? super R> v2jVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        int iAddAndGet = 1;
        while (true) {
            long j4 = this.requested.get();
            if (innerQueuedSubscriberPoll != null) {
                innerQueuedSubscriberPoll = innerQueuedSubscriberPoll;
            } else {
                if (errorMode != ErrorMode.END && this.errors.get() != null) {
                    cancelAll();
                    v2jVar.onError(this.errors.terminate());
                    return;
                }
                boolean z2 = this.done;
                innerQueuedSubscriberPoll = this.subscribers.poll();
                if (z2 && innerQueuedSubscriberPoll == null) {
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != null) {
                        v2jVar.onError(thTerminate);
                        return;
                    } else {
                        v2jVar.onComplete();
                        return;
                    }
                }
                if (innerQueuedSubscriberPoll != null) {
                    this.current = innerQueuedSubscriberPoll;
                }
            }
            if (innerQueuedSubscriberPoll == null || (g4hVarQueue = innerQueuedSubscriberPoll.queue()) == null) {
                i = iAddAndGet;
                z = false;
                j2 = 0;
                j3 = 0;
            } else {
                j3 = 0;
                while (true) {
                    i = iAddAndGet;
                    if (j3 != j4) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            v2jVar.onError(this.errors.terminate());
                            return;
                        }
                        boolean zIsDone = innerQueuedSubscriberPoll.isDone();
                        try {
                            R rPoll = g4hVarQueue.poll();
                            boolean z3 = rPoll == null;
                            if (zIsDone && z3) {
                                this.current = null;
                                this.upstream.request(1L);
                                innerQueuedSubscriberPoll = null;
                                z = true;
                                break;
                            }
                            if (!z3) {
                                v2jVar.onNext(rPoll);
                                j3++;
                                innerQueuedSubscriberPoll.requestOne();
                                iAddAndGet = i;
                            }
                        } catch (Throwable th) {
                            iu6.b(th);
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            v2jVar.onError(th);
                            return;
                        }
                    }
                    z = false;
                    break;
                }
                if (j3 == j4) {
                    if (this.cancelled) {
                        cancelAll();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                        this.current = null;
                        innerQueuedSubscriberPoll.cancel();
                        cancelAll();
                        v2jVar.onError(this.errors.terminate());
                        return;
                    }
                    boolean zIsDone2 = innerQueuedSubscriberPoll.isDone();
                    boolean zIsEmpty = g4hVarQueue.isEmpty();
                    if (zIsDone2 && zIsEmpty) {
                        this.current = null;
                        this.upstream.request(1L);
                        innerQueuedSubscriberPoll = null;
                        z = true;
                    }
                }
                j2 = 0;
            }
            if (j3 != j2 && j4 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j3);
            }
            if (z) {
                iAddAndGet = i;
            } else {
                iAddAndGet = addAndGet(-i);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public void drainAndCancel() {
        if (getAndIncrement() == 0) {
            do {
                cancelAll();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // com.oplus.aiunit.vision.b9a
    public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
        innerQueuedSubscriber.setDone();
        drain();
    }

    @Override // com.oplus.aiunit.vision.b9a
    public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        innerQueuedSubscriber.setDone();
        if (this.errorMode != ErrorMode.END) {
            this.upstream.cancel();
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.b9a
    public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
        if (innerQueuedSubscriber.queue().offer(r)) {
            drain();
        } else {
            innerQueuedSubscriber.cancel();
            innerError(innerQueuedSubscriber, new MissingBackpressureException());
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            k3f k3fVar = (k3f) abd.d(this.mapper.apply(t), "The mapper returned a null Publisher");
            InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
            if (this.cancelled) {
                return;
            }
            this.subscribers.offer(innerQueuedSubscriber);
            k3fVar.subscribe(innerQueuedSubscriber);
            if (this.cancelled) {
                innerQueuedSubscriber.cancel();
                drainAndCancel();
            }
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
            c3jVar.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
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
