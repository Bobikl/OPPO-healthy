package io.reactivex.rxjava3.internal.operators.observable;

import OO0.O000;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMap$SwitchMapObserver<T, R> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
    static final ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> CANCELLED;
    private static final long serialVersionUID = -3491074160481096299L;
    final int bufferSize;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final aed<? super R> downstream;
    final d08<? super T, ? extends jdd<? extends R>> mapper;
    volatile long unique;
    io.reactivex.rxjava3.disposables.a upstream;
    final AtomicReference<ObservableSwitchMap$SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
    final AtomicThrowable errors = new AtomicThrowable();

    static {
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> observableSwitchMap$SwitchMapInnerObserver = new ObservableSwitchMap$SwitchMapInnerObserver<>(null, -1L, 1);
        CANCELLED = observableSwitchMap$SwitchMapInnerObserver;
        observableSwitchMap$SwitchMapInnerObserver.cancel();
    }

    public ObservableSwitchMap$SwitchMapObserver(aed<? super R> aedVar, d08<? super T, ? extends jdd<? extends R>> d08Var, int i, boolean z) {
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
        disposeInner();
        this.errors.tryTerminateAndReport();
    }

    public void disposeInner() {
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> andSet = this.active.getAndSet((ObservableSwitchMap$SwitchMapInnerObserver<T, R>) CANCELLED);
        if (andSet != null) {
            andSet.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x000f A[SYNTHETIC] */
    public void drain() {
        f4h<R> f4hVar;
        O000 o000Poll;
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super R> aedVar = this.downstream;
        AtomicReference<ObservableSwitchMap$SwitchMapInnerObserver<T, R>> atomicReference = this.active;
        boolean z = this.delayErrors;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (this.done) {
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    if (z2) {
                        Throwable th = this.errors.get();
                        if (th != null) {
                            aedVar.onError(th);
                            return;
                        } else {
                            aedVar.onComplete();
                            return;
                        }
                    }
                } else if (this.errors.get() != null) {
                    this.errors.tryTerminateConsumer(aedVar);
                    return;
                } else if (z2) {
                    aedVar.onComplete();
                    return;
                }
            }
            ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver = atomicReference.get();
            if (observableSwitchMap$SwitchMapInnerObserver != null && (f4hVar = observableSwitchMap$SwitchMapInnerObserver.queue) != null) {
                boolean z3 = false;
                while (!this.cancelled) {
                    if (observableSwitchMap$SwitchMapInnerObserver == atomicReference.get()) {
                        if (!z && this.errors.get() != null) {
                            this.errors.tryTerminateConsumer(aedVar);
                            return;
                        }
                        boolean z4 = observableSwitchMap$SwitchMapInnerObserver.done;
                        try {
                            o000Poll = f4hVar.poll();
                        } catch (Throwable th2) {
                            hu6.b(th2);
                            this.errors.tryAddThrowableOrReport(th2);
                            fue.a(atomicReference, observableSwitchMap$SwitchMapInnerObserver, null);
                            if (z) {
                                observableSwitchMap$SwitchMapInnerObserver.cancel();
                            } else {
                                disposeInner();
                                this.upstream.dispose();
                                this.done = true;
                            }
                            z3 = true;
                            o000Poll = null;
                        }
                        boolean z5 = o000Poll == null;
                        if (z4 && z5) {
                            fue.a(atomicReference, observableSwitchMap$SwitchMapInnerObserver, null);
                        } else if (!z5) {
                            aedVar.onNext(o000Poll);
                        }
                        if (z3) {
                            continue;
                        }
                    }
                    z3 = true;
                    if (z3) {
                        continue;
                    }
                }
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public void innerError(ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver, Throwable th) {
        if (observableSwitchMap$SwitchMapInnerObserver.index != this.unique || !this.errors.tryAddThrowable(th)) {
            g4g.u(th);
            return;
        }
        if (!this.delayErrors) {
            this.upstream.dispose();
            this.done = true;
        }
        observableSwitchMap$SwitchMapInnerObserver.done = true;
        drain();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
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

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver;
        long j2 = this.unique + 1;
        this.unique = j2;
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver2 = this.active.get();
        if (observableSwitchMap$SwitchMapInnerObserver2 != null) {
            observableSwitchMap$SwitchMapInnerObserver2.cancel();
        }
        try {
            jdd<? extends R> jddVarApply = this.mapper.apply(t);
            Objects.requireNonNull(jddVarApply, "The ObservableSource returned is null");
            jdd<? extends R> jddVar = jddVarApply;
            ObservableSwitchMap$SwitchMapInnerObserver observableSwitchMap$SwitchMapInnerObserver3 = new ObservableSwitchMap$SwitchMapInnerObserver(this, j2, this.bufferSize);
            do {
                observableSwitchMap$SwitchMapInnerObserver = this.active.get();
                if (observableSwitchMap$SwitchMapInnerObserver == CANCELLED) {
                    return;
                }
            } while (!fue.a(this.active, observableSwitchMap$SwitchMapInnerObserver, observableSwitchMap$SwitchMapInnerObserver3));
            jddVar.subscribe(observableSwitchMap$SwitchMapInnerObserver3);
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
