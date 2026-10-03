package io.reactivex.internal.operators.observable;

import OO0.O000;
import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMap$SwitchMapObserver<T, R> extends AtomicInteger implements bed<T>, cv5 {
    static final ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> CANCELLED;
    private static final long serialVersionUID = -3491074160481096299L;
    final int bufferSize;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final bed<? super R> downstream;
    final j08<? super T, ? extends kdd<? extends R>> mapper;
    volatile long unique;
    cv5 upstream;
    final AtomicReference<ObservableSwitchMap$SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
    final AtomicThrowable errors = new AtomicThrowable();

    static {
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> observableSwitchMap$SwitchMapInnerObserver = new ObservableSwitchMap$SwitchMapInnerObserver<>(null, -1L, 1);
        CANCELLED = observableSwitchMap$SwitchMapInnerObserver;
        observableSwitchMap$SwitchMapInnerObserver.cancel();
    }

    public ObservableSwitchMap$SwitchMapObserver(bed<? super R> bedVar, j08<? super T, ? extends kdd<? extends R>> j08Var, int i, boolean z) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
        disposeInner();
    }

    public void disposeInner() {
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> andSet;
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver = this.active.get();
        ObservableSwitchMap$SwitchMapInnerObserver<Object, Object> observableSwitchMap$SwitchMapInnerObserver2 = CANCELLED;
        if (observableSwitchMap$SwitchMapInnerObserver == observableSwitchMap$SwitchMapInnerObserver2 || (andSet = this.active.getAndSet((ObservableSwitchMap$SwitchMapInnerObserver<T, R>) observableSwitchMap$SwitchMapInnerObserver2)) == observableSwitchMap$SwitchMapInnerObserver2 || andSet == null) {
            return;
        }
        andSet.cancel();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e9 A[SYNTHETIC] */
    public void drain() {
        g4h<R> g4hVar;
        O000 o000Poll;
        if (getAndIncrement() != 0) {
            return;
        }
        bed<? super R> bedVar = this.downstream;
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
                            bedVar.onError(th);
                            return;
                        } else {
                            bedVar.onComplete();
                            return;
                        }
                    }
                } else if (this.errors.get() != null) {
                    bedVar.onError(this.errors.terminate());
                    return;
                } else if (z2) {
                    bedVar.onComplete();
                    return;
                }
            }
            ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver = atomicReference.get();
            if (observableSwitchMap$SwitchMapInnerObserver != null && (g4hVar = observableSwitchMap$SwitchMapInnerObserver.queue) != null) {
                if (observableSwitchMap$SwitchMapInnerObserver.done) {
                    boolean zIsEmpty = g4hVar.isEmpty();
                    if (z) {
                        if (zIsEmpty) {
                            fue.a(atomicReference, observableSwitchMap$SwitchMapInnerObserver, null);
                        }
                    } else if (this.errors.get() != null) {
                        bedVar.onError(this.errors.terminate());
                        return;
                    } else if (zIsEmpty) {
                        fue.a(atomicReference, observableSwitchMap$SwitchMapInnerObserver, null);
                    }
                }
                boolean z3 = false;
                while (!this.cancelled) {
                    if (observableSwitchMap$SwitchMapInnerObserver == atomicReference.get()) {
                        if (!z && this.errors.get() != null) {
                            bedVar.onError(this.errors.terminate());
                            return;
                        }
                        boolean z4 = observableSwitchMap$SwitchMapInnerObserver.done;
                        try {
                            o000Poll = g4hVar.poll();
                        } catch (Throwable th2) {
                            iu6.b(th2);
                            this.errors.addThrowable(th2);
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
                            bedVar.onNext(o000Poll);
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
        if (observableSwitchMap$SwitchMapInnerObserver.index != this.unique || !this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            this.upstream.dispose();
        }
        observableSwitchMap$SwitchMapInnerObserver.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.done || !this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            disposeInner();
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver;
        long j2 = this.unique + 1;
        this.unique = j2;
        ObservableSwitchMap$SwitchMapInnerObserver<T, R> observableSwitchMap$SwitchMapInnerObserver2 = this.active.get();
        if (observableSwitchMap$SwitchMapInnerObserver2 != null) {
            observableSwitchMap$SwitchMapInnerObserver2.cancel();
        }
        try {
            kdd kddVar = (kdd) abd.d(this.mapper.apply(t), "The ObservableSource returned is null");
            ObservableSwitchMap$SwitchMapInnerObserver observableSwitchMap$SwitchMapInnerObserver3 = new ObservableSwitchMap$SwitchMapInnerObserver(this, j2, this.bufferSize);
            do {
                observableSwitchMap$SwitchMapInnerObserver = this.active.get();
                if (observableSwitchMap$SwitchMapInnerObserver == CANCELLED) {
                    return;
                }
            } while (!fue.a(this.active, observableSwitchMap$SwitchMapInnerObserver, observableSwitchMap$SwitchMapInnerObserver3));
            kddVar.subscribe(observableSwitchMap$SwitchMapInnerObserver3);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
