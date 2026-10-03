package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.a9a;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements vu7<T>, c3j, a9a<R> {
    private static final long serialVersionUID = -4255299542215038287L;
    volatile boolean cancelled;
    volatile InnerQueuedSubscriber<R> current;
    volatile boolean done;
    final v2j<? super R> downstream;
    final ErrorMode errorMode;
    final d08<? super T, ? extends k3f<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final xki<InnerQueuedSubscriber<R>> subscribers;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    public FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends k3f<? extends R>> d08Var, int i, int i2, ErrorMode errorMode) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
        this.subscribers = new xki<>(Math.min(i2, i));
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        this.errors.tryTerminateAndReport();
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

    @Override // com.oplus.aiunit.vision.a9a
    public void drain() {
        int i;
        boolean z;
        long j2;
        long j3;
        f4h<R> f4hVarQueue;
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
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                boolean z2 = this.done;
                innerQueuedSubscriberPoll = this.subscribers.poll();
                if (z2 && innerQueuedSubscriberPoll == null) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                } else if (innerQueuedSubscriberPoll != null) {
                    this.current = innerQueuedSubscriberPoll;
                }
            }
            if (innerQueuedSubscriberPoll == null || (f4hVarQueue = innerQueuedSubscriberPoll.queue()) == null) {
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
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        boolean zIsDone = innerQueuedSubscriberPoll.isDone();
                        try {
                            R rPoll = f4hVarQueue.poll();
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
                                innerQueuedSubscriberPoll.request(1L);
                                iAddAndGet = i;
                            }
                        } catch (Throwable th) {
                            hu6.b(th);
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
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    boolean zIsDone2 = innerQueuedSubscriberPoll.isDone();
                    boolean zIsEmpty = f4hVarQueue.isEmpty();
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

    @Override // com.oplus.aiunit.vision.a9a
    public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
        innerQueuedSubscriber.setDone();
        drain();
    }

    @Override // com.oplus.aiunit.vision.a9a
    public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            innerQueuedSubscriber.setDone();
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.a9a
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
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            k3f<? extends R> k3fVarApply = this.mapper.apply(t);
            Objects.requireNonNull(k3fVarApply, "The mapper returned a null Publisher");
            k3f<? extends R> k3fVar = k3fVarApply;
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
            hu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
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
            vr0.a(this.requested, j2);
            drain();
        }
    }
}
