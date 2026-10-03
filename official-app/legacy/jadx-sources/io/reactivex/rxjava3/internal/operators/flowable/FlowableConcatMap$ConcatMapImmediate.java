package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.yf8;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMap$ConcatMapImmediate<T, R> extends FlowableConcatMap$BaseConcatMapSubscriber<T, R> {
    private static final long serialVersionUID = 7898995095634264146L;
    final v2j<? super R> downstream;
    final AtomicInteger wip;

    public FlowableConcatMap$ConcatMapImmediate(v2j<? super R> v2jVar, d08<? super T, ? extends k3f<? extends R>> d08Var, int i) {
        super(d08Var, i);
        this.downstream = v2jVar;
        this.wip = new AtomicInteger();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.inner.cancel();
        this.upstream.cancel();
        this.errors.tryTerminateAndReport();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber
    public void drain() {
        if (this.wip.getAndIncrement() == 0) {
            while (!this.cancelled) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        T tPoll = this.queue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.downstream.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                k3f<? extends R> k3fVarApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(k3fVarApply, "The mapper returned a null Publisher");
                                k3f<? extends R> k3fVar = k3fVarApply;
                                if (this.sourceMode != 1) {
                                    int i = this.consumed + 1;
                                    if (i == this.limit) {
                                        this.consumed = 0;
                                        this.upstream.request(i);
                                    } else {
                                        this.consumed = i;
                                    }
                                }
                                if (k3fVar instanceof f4j) {
                                    try {
                                        Object obj = ((f4j) k3fVar).get();
                                        if (obj == null) {
                                            continue;
                                        } else if (!this.inner.isUnbounded()) {
                                            this.active = true;
                                            this.inner.setSubscription(new FlowableConcatMap$SimpleScalarSubscription(obj, this.inner));
                                        } else if (!yf8.f(this.downstream, obj, this, this.errors)) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        hu6.b(th);
                                        this.upstream.cancel();
                                        this.errors.tryAddThrowableOrReport(th);
                                        this.errors.tryTerminateConsumer(this.downstream);
                                        return;
                                    }
                                } else {
                                    this.active = true;
                                    k3fVar.subscribe(this.inner);
                                }
                            } catch (Throwable th2) {
                                hu6.b(th2);
                                this.upstream.cancel();
                                this.errors.tryAddThrowableOrReport(th2);
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        hu6.b(th3);
                        this.upstream.cancel();
                        this.errors.tryAddThrowableOrReport(th3);
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.au7
    public void innerError(Throwable th) {
        this.upstream.cancel();
        yf8.d(this.downstream, th, this, this.errors);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.au7
    public void innerNext(R r) {
        yf8.f(this.downstream, r, this, this.errors);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.inner.cancel();
        yf8.d(this.downstream, th, this, this.errors);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.inner.request(j2);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber
    public void subscribeActual() {
        this.downstream.onSubscribe(this);
    }
}
