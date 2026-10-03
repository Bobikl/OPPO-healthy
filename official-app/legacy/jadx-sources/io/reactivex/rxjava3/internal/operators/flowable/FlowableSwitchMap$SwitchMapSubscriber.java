package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSwitchMap$SwitchMapSubscriber<T, R> extends AtomicInteger implements vu7<T>, c3j {
    static final FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> CANCELLED;
    private static final long serialVersionUID = -3491074160481096299L;
    final int bufferSize;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final v2j<? super R> downstream;
    final d08<? super T, ? extends k3f<? extends R>> mapper;
    volatile long unique;
    c3j upstream;
    final AtomicReference<FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();
    final AtomicThrowable errors = new AtomicThrowable();

    static {
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber = new FlowableSwitchMap$SwitchMapInnerSubscriber<>(null, -1L, 1);
        CANCELLED = flowableSwitchMap$SwitchMapInnerSubscriber;
        flowableSwitchMap$SwitchMapInnerSubscriber.cancel();
    }

    public FlowableSwitchMap$SwitchMapSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends k3f<? extends R>> d08Var, int i, boolean z) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        disposeInner();
        this.errors.tryTerminateAndReport();
    }

    public void disposeInner() {
        AtomicReference<FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber = CANCELLED;
        FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> andSet = atomicReference.getAndSet((FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>) flowableSwitchMap$SwitchMapInnerSubscriber);
        if (andSet == flowableSwitchMap$SwitchMapInnerSubscriber || andSet == null) {
            return;
        }
        andSet.cancel();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x000c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    public void drain() throws Throwable {
        boolean z;
        Object objPoll;
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (this.done) {
                if (this.delayErrors) {
                    if (this.active.get() == null) {
                        this.errors.tryTerminateConsumer(v2jVar);
                        return;
                    }
                } else if (this.errors.get() != null) {
                    disposeInner();
                    this.errors.tryTerminateConsumer(v2jVar);
                    return;
                } else if (this.active.get() == null) {
                    v2jVar.onComplete();
                    return;
                }
            }
            FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
            f4h<R> f4hVar = flowableSwitchMap$SwitchMapInnerSubscriber != null ? flowableSwitchMap$SwitchMapInnerSubscriber.queue : null;
            if (f4hVar != null) {
                long j2 = this.requested.get();
                long j3 = 0;
                while (true) {
                    if (j3 != j2) {
                        if (this.cancelled) {
                            return;
                        }
                        boolean z2 = flowableSwitchMap$SwitchMapInnerSubscriber.done;
                        try {
                            objPoll = f4hVar.poll();
                        } catch (Throwable th) {
                            hu6.b(th);
                            flowableSwitchMap$SwitchMapInnerSubscriber.cancel();
                            this.errors.tryAddThrowableOrReport(th);
                            objPoll = null;
                            z2 = true;
                        }
                        boolean z3 = objPoll == null;
                        if (flowableSwitchMap$SwitchMapInnerSubscriber == this.active.get()) {
                            if (z2) {
                                if (this.delayErrors) {
                                    if (z3) {
                                        fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                                    }
                                } else if (this.errors.get() != null) {
                                    this.errors.tryTerminateConsumer(v2jVar);
                                    return;
                                } else if (z3) {
                                    fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                                }
                            }
                            if (!z3) {
                                v2jVar.onNext(objPoll);
                                j3++;
                            }
                        }
                        z = true;
                        if (j3 != j2 && flowableSwitchMap$SwitchMapInnerSubscriber.done) {
                            if (this.delayErrors) {
                                if (f4hVar.isEmpty()) {
                                    fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                                }
                            } else if (this.errors.get() != null) {
                                disposeInner();
                                this.errors.tryTerminateConsumer(v2jVar);
                                return;
                            } else if (f4hVar.isEmpty()) {
                                fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                            }
                        }
                        if (j3 != 0 && !this.cancelled) {
                            if (j2 != Long.MAX_VALUE) {
                                this.requested.addAndGet(-j3);
                            }
                            flowableSwitchMap$SwitchMapInnerSubscriber.request(j3);
                        }
                        if (z) {
                            continue;
                        }
                    }
                    z = false;
                    if (j3 != j2) {
                    }
                    if (j3 != 0) {
                        if (j2 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j3);
                        }
                        flowableSwitchMap$SwitchMapInnerSubscriber.request(j3);
                    }
                    if (z) {
                        continue;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() throws Throwable {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) throws Throwable {
        if (this.done || !this.errors.tryAddThrowable(th)) {
            g4g.u(th);
            return;
        }
        if (!this.delayErrors) {
            disposeInner();
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) throws Throwable {
        FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> flowableSwitchMap$SwitchMapInnerSubscriber;
        if (this.done) {
            return;
        }
        long j2 = this.unique + 1;
        this.unique = j2;
        FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> flowableSwitchMap$SwitchMapInnerSubscriber2 = this.active.get();
        if (flowableSwitchMap$SwitchMapInnerSubscriber2 != null) {
            flowableSwitchMap$SwitchMapInnerSubscriber2.cancel();
        }
        try {
            k3f<? extends R> k3fVarApply = this.mapper.apply(t);
            Objects.requireNonNull(k3fVarApply, "The publisher returned is null");
            k3f<? extends R> k3fVar = k3fVarApply;
            FlowableSwitchMap$SwitchMapInnerSubscriber flowableSwitchMap$SwitchMapInnerSubscriber3 = new FlowableSwitchMap$SwitchMapInnerSubscriber(this, j2, this.bufferSize);
            do {
                flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
                if (flowableSwitchMap$SwitchMapInnerSubscriber == CANCELLED) {
                    return;
                }
            } while (!fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, flowableSwitchMap$SwitchMapInnerSubscriber3));
            k3fVar.subscribe(flowableSwitchMap$SwitchMapInnerSubscriber3);
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
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) throws Throwable {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            if (this.unique == 0) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                drain();
            }
        }
    }
}
