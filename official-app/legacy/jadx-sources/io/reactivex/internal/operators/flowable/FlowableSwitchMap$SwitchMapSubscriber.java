package io.reactivex.internal.operators.flowable;

import OO0.O000;
import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSwitchMap$SwitchMapSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j {
    static final FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> CANCELLED;
    private static final long serialVersionUID = -3491074160481096299L;
    final int bufferSize;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final v2j<? super R> downstream;
    final j08<? super T, ? extends k3f<? extends R>> mapper;
    volatile long unique;
    c3j upstream;
    final AtomicReference<FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();
    final AtomicThrowable error = new AtomicThrowable();

    static {
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber = new FlowableSwitchMap$SwitchMapInnerSubscriber<>(null, -1L, 1);
        CANCELLED = flowableSwitchMap$SwitchMapInnerSubscriber;
        flowableSwitchMap$SwitchMapInnerSubscriber.cancel();
    }

    public FlowableSwitchMap$SwitchMapSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends k3f<? extends R>> j08Var, int i, boolean z) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
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
    }

    public void disposeInner() {
        FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> andSet;
        FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
        FlowableSwitchMap$SwitchMapInnerSubscriber<Object, Object> flowableSwitchMap$SwitchMapInnerSubscriber2 = CANCELLED;
        if (flowableSwitchMap$SwitchMapInnerSubscriber == flowableSwitchMap$SwitchMapInnerSubscriber2 || (andSet = this.active.getAndSet((FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>) flowableSwitchMap$SwitchMapInnerSubscriber2)) == flowableSwitchMap$SwitchMapInnerSubscriber2 || andSet == null) {
            return;
        }
        andSet.cancel();
    }

    public void drain() {
        boolean z;
        O000 o000Poll;
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (this.done) {
                if (this.delayErrors) {
                    if (this.active.get() == null) {
                        if (this.error.get() != null) {
                            v2jVar.onError(this.error.terminate());
                            return;
                        } else {
                            v2jVar.onComplete();
                            return;
                        }
                    }
                } else if (this.error.get() != null) {
                    disposeInner();
                    v2jVar.onError(this.error.terminate());
                    return;
                } else if (this.active.get() == null) {
                    v2jVar.onComplete();
                    return;
                }
            }
            FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
            g4h<R> g4hVar = flowableSwitchMap$SwitchMapInnerSubscriber != null ? flowableSwitchMap$SwitchMapInnerSubscriber.queue : null;
            if (g4hVar != null) {
                if (flowableSwitchMap$SwitchMapInnerSubscriber.done) {
                    if (this.delayErrors) {
                        if (g4hVar.isEmpty()) {
                            fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                        }
                    } else if (this.error.get() != null) {
                        disposeInner();
                        v2jVar.onError(this.error.terminate());
                        return;
                    } else if (g4hVar.isEmpty()) {
                        fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                    }
                }
                long j2 = this.requested.get();
                long j3 = 0;
                while (true) {
                    z = false;
                    if (j3 != j2) {
                        if (!this.cancelled) {
                            boolean z2 = flowableSwitchMap$SwitchMapInnerSubscriber.done;
                            try {
                                o000Poll = g4hVar.poll();
                            } catch (Throwable th) {
                                iu6.b(th);
                                flowableSwitchMap$SwitchMapInnerSubscriber.cancel();
                                this.error.addThrowable(th);
                                o000Poll = null;
                                z2 = true;
                            }
                            boolean z3 = o000Poll == null;
                            if (flowableSwitchMap$SwitchMapInnerSubscriber == this.active.get()) {
                                if (z2) {
                                    if (this.delayErrors) {
                                        if (z3) {
                                            fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                                        }
                                    } else if (this.error.get() != null) {
                                        v2jVar.onError(this.error.terminate());
                                        return;
                                    } else if (z3) {
                                        fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, null);
                                    }
                                }
                                if (z3) {
                                    break;
                                }
                                v2jVar.onNext(o000Poll);
                                j3++;
                            }
                            z = true;
                            break;
                        }
                        return;
                    }
                    break;
                }
                if (j3 != 0 && !this.cancelled) {
                    if (j2 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j3);
                    }
                    flowableSwitchMap$SwitchMapInnerSubscriber.get().request(j3);
                }
                if (z) {
                    continue;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.active.lazySet(null);
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
        if (this.done || !this.error.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            disposeInner();
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
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
            k3f k3fVar = (k3f) abd.d(this.mapper.apply(t), "The publisher returned is null");
            FlowableSwitchMap$SwitchMapInnerSubscriber flowableSwitchMap$SwitchMapInnerSubscriber3 = new FlowableSwitchMap$SwitchMapInnerSubscriber(this, j2, this.bufferSize);
            do {
                flowableSwitchMap$SwitchMapInnerSubscriber = this.active.get();
                if (flowableSwitchMap$SwitchMapInnerSubscriber == CANCELLED) {
                    return;
                }
            } while (!fue.a(this.active, flowableSwitchMap$SwitchMapInnerSubscriber, flowableSwitchMap$SwitchMapInnerSubscriber3));
            k3fVar.subscribe(flowableSwitchMap$SwitchMapInnerSubscriber3);
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
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            if (this.unique == 0) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                drain();
            }
        }
    }
}
