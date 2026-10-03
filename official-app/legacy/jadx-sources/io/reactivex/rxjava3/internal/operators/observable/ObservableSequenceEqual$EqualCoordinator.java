package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.od1;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSequenceEqual$EqualCoordinator<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -6178010334400373240L;
    volatile boolean cancelled;
    final od1<? super T, ? super T> comparer;
    final aed<? super Boolean> downstream;
    final jdd<? extends T> first;
    final e<T>[] observers;
    final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
    final jdd<? extends T> second;
    T v1;
    T v2;

    public ObservableSequenceEqual$EqualCoordinator(aed<? super Boolean> aedVar, int i, jdd<? extends T> jddVar, jdd<? extends T> jddVar2, od1<? super T, ? super T> od1Var) {
        this.downstream = aedVar;
        this.first = jddVar;
        this.second = jddVar2;
        this.comparer = od1Var;
        this.observers = new e[]{new e<>(this, 0, i), new e<>(this, 1, i)};
    }

    public void cancel(xki<T> xkiVar, xki<T> xkiVar2) {
        this.cancelled = true;
        xkiVar.clear();
        xkiVar2.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.resources.dispose();
        if (getAndIncrement() == 0) {
            e<T>[] eVarArr = this.observers;
            eVarArr[0].f20607j.clear();
            eVarArr[1].f20607j.clear();
        }
    }

    public void drain() {
        Throwable th;
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        e<T>[] eVarArr = this.observers;
        e<T> eVar = eVarArr[0];
        xki<T> xkiVar = eVar.f20607j;
        e<T> eVar2 = eVarArr[1];
        xki<T> xkiVar2 = eVar2.f20607j;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = eVar.f20608l;
            if (z && (th2 = eVar.m) != null) {
                cancel(xkiVar, xkiVar2);
                this.downstream.onError(th2);
                return;
            }
            boolean z2 = eVar2.f20608l;
            if (z2 && (th = eVar2.m) != null) {
                cancel(xkiVar, xkiVar2);
                this.downstream.onError(th);
                return;
            }
            if (this.v1 == null) {
                this.v1 = xkiVar.poll();
            }
            boolean z3 = this.v1 == null;
            if (this.v2 == null) {
                this.v2 = xkiVar2.poll();
            }
            T t = this.v2;
            boolean z4 = t == null;
            if (z && z2 && z3 && z4) {
                this.downstream.onNext(Boolean.TRUE);
                this.downstream.onComplete();
                return;
            }
            if (z && z2 && z3 != z4) {
                cancel(xkiVar, xkiVar2);
                this.downstream.onNext(Boolean.FALSE);
                this.downstream.onComplete();
                return;
            }
            if (!z3 && !z4) {
                try {
                    if (!this.comparer.a(this.v1, t)) {
                        cancel(xkiVar, xkiVar2);
                        this.downstream.onNext(Boolean.FALSE);
                        this.downstream.onComplete();
                        return;
                    }
                    this.v1 = null;
                    this.v2 = null;
                } catch (Throwable th3) {
                    hu6.b(th3);
                    cancel(xkiVar, xkiVar2);
                    this.downstream.onError(th3);
                    return;
                }
            }
            if (z3 || z4) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        xkiVar.clear();
        xkiVar2.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    public boolean setDisposable(io.reactivex.rxjava3.disposables.a aVar, int i) {
        return this.resources.setResource(i, aVar);
    }

    public void subscribe() {
        e<T>[] eVarArr = this.observers;
        this.first.subscribe(eVarArr[0]);
        this.second.subscribe(eVarArr[1]);
    }
}
