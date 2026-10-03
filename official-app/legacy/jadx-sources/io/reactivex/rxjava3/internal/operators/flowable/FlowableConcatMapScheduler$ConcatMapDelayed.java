package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMapScheduler$ConcatMapDelayed<T, R> extends FlowableConcatMapScheduler$BaseConcatMapSubscriber<T, R> {
    private static final long serialVersionUID = -2945777694260521066L;
    final v2j<? super R> downstream;
    final boolean veryEnd;

    public FlowableConcatMapScheduler$ConcatMapDelayed(v2j<? super R> v2jVar, d08<? super T, ? extends k3f<? extends R>> d08Var, int i, boolean z, cfg.c cVar) {
        super(d08Var, i, cVar);
        this.downstream = v2jVar;
        this.veryEnd = z;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.inner.cancel();
        this.upstream.cancel();
        this.worker.dispose();
        this.errors.tryTerminateAndReport();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber, com.oplus.aiunit.vision.au7
    public void innerError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (!this.veryEnd) {
                this.upstream.cancel();
                this.done = true;
            }
            this.active = false;
            schedule();
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber, com.oplus.aiunit.vision.au7
    public void innerNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.done = true;
            schedule();
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.inner.request(j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        while (!this.cancelled) {
            if (!this.active) {
                boolean z = this.done;
                if (z && !this.veryEnd && this.errors.get() != null) {
                    this.errors.tryTerminateConsumer(this.downstream);
                    this.worker.dispose();
                    return;
                }
                try {
                    T tPoll = this.queue.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        this.worker.dispose();
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
                                    obj = ((f4j) k3fVar).get();
                                } catch (Throwable th) {
                                    hu6.b(th);
                                    this.errors.tryAddThrowableOrReport(th);
                                    if (!this.veryEnd) {
                                        this.upstream.cancel();
                                        this.errors.tryTerminateConsumer(this.downstream);
                                        this.worker.dispose();
                                        return;
                                    }
                                    obj = null;
                                }
                                if (obj != null && !this.cancelled) {
                                    if (this.inner.isUnbounded()) {
                                        this.downstream.onNext(obj);
                                    } else {
                                        this.active = true;
                                        this.inner.setSubscription(new FlowableConcatMap$SimpleScalarSubscription(obj, this.inner));
                                    }
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
                            this.worker.dispose();
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    hu6.b(th3);
                    this.upstream.cancel();
                    this.errors.tryAddThrowableOrReport(th3);
                    this.errors.tryTerminateConsumer(this.downstream);
                    this.worker.dispose();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber
    public void schedule() {
        if (getAndIncrement() == 0) {
            this.worker.b(this);
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapScheduler$BaseConcatMapSubscriber
    public void subscribeActual() {
        this.downstream.onSubscribe(this);
    }
}
