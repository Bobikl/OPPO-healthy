package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cu7;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMap$ConcatMapImmediate<T, R> extends FlowableConcatMap$BaseConcatMapSubscriber<T, R> {
    private static final long serialVersionUID = 7898995095634264146L;
    final v2j<? super R> downstream;
    final AtomicInteger wip;

    public FlowableConcatMap$ConcatMapImmediate(v2j<? super R> v2jVar, j08<? super T, ? extends k3f<? extends R>> j08Var, int i) {
        super(j08Var, i);
        this.downstream = v2jVar;
        this.wip = new AtomicInteger();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.inner.cancel();
        this.upstream.cancel();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber
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
                                k3f k3fVar = (k3f) abd.d(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                if (this.sourceMode != 1) {
                                    int i = this.consumed + 1;
                                    if (i == this.limit) {
                                        this.consumed = 0;
                                        this.upstream.request(i);
                                    } else {
                                        this.consumed = i;
                                    }
                                }
                                if (k3fVar instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) k3fVar).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (!this.inner.isUnbounded()) {
                                            this.active = true;
                                            FlowableConcatMap$ConcatMapInner<R> flowableConcatMap$ConcatMapInner = this.inner;
                                            flowableConcatMap$ConcatMapInner.setSubscription(new cu7(objCall, flowableConcatMap$ConcatMapInner));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.downstream.onNext(objCall);
                                            if (!compareAndSet(1, 0)) {
                                                this.downstream.onError(this.errors.terminate());
                                                return;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        iu6.b(th);
                                        this.upstream.cancel();
                                        this.errors.addThrowable(th);
                                        this.downstream.onError(this.errors.terminate());
                                        return;
                                    }
                                } else {
                                    this.active = true;
                                    k3fVar.subscribe(this.inner);
                                }
                            } catch (Throwable th2) {
                                iu6.b(th2);
                                this.upstream.cancel();
                                this.errors.addThrowable(th2);
                                this.downstream.onError(this.errors.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        iu6.b(th3);
                        this.upstream.cancel();
                        this.errors.addThrowable(th3);
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.bu7
    public void innerError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.downstream.onError(this.errors.terminate());
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.bu7
    public void innerNext(R r) {
        if (get() == 0 && compareAndSet(0, 1)) {
            this.downstream.onNext(r);
            if (compareAndSet(1, 0)) {
                return;
            }
            this.downstream.onError(this.errors.terminate());
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        this.inner.cancel();
        if (getAndIncrement() == 0) {
            this.downstream.onError(this.errors.terminate());
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.inner.request(j2);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap$BaseConcatMapSubscriber
    public void subscribeActual() {
        this.downstream.onSubscribe(this);
    }
}
