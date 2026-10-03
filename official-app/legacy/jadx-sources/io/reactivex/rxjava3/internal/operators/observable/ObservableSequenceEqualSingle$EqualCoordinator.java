package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.od1;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSequenceEqualSingle$EqualCoordinator<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -6178010334400373240L;
    volatile boolean cancelled;
    final od1<? super T, ? super T> comparer;
    final l6h<? super Boolean> downstream;
    final jdd<? extends T> first;
    final f<T>[] observers;
    final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
    final jdd<? extends T> second;
    T v1;
    T v2;

    public ObservableSequenceEqualSingle$EqualCoordinator(l6h<? super Boolean> l6hVar, int i, jdd<? extends T> jddVar, jdd<? extends T> jddVar2, od1<? super T, ? super T> od1Var) {
        this.downstream = l6hVar;
        this.first = jddVar;
        this.second = jddVar2;
        this.comparer = od1Var;
        this.observers = new f[]{new f<>(this, 0, i), new f<>(this, 1, i)};
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
            f<T>[] fVarArr = this.observers;
            fVarArr[0].f20609j.clear();
            fVarArr[1].f20609j.clear();
        }
    }

    public void drain() {
        Throwable th;
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        f<T>[] fVarArr = this.observers;
        f<T> fVar = fVarArr[0];
        xki<T> xkiVar = fVar.f20609j;
        f<T> fVar2 = fVarArr[1];
        xki<T> xkiVar2 = fVar2.f20609j;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = fVar.f20610l;
            if (z && (th2 = fVar.m) != null) {
                cancel(xkiVar, xkiVar2);
                this.downstream.onError(th2);
                return;
            }
            boolean z2 = fVar2.f20610l;
            if (z2 && (th = fVar2.m) != null) {
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
                this.downstream.onSuccess(Boolean.TRUE);
                return;
            }
            if (z && z2 && z3 != z4) {
                cancel(xkiVar, xkiVar2);
                this.downstream.onSuccess(Boolean.FALSE);
                return;
            }
            if (!z3 && !z4) {
                try {
                    if (!this.comparer.a(this.v1, t)) {
                        cancel(xkiVar, xkiVar2);
                        this.downstream.onSuccess(Boolean.FALSE);
                        return;
                    } else {
                        this.v1 = null;
                        this.v2 = null;
                    }
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
        f<T>[] fVarArr = this.observers;
        this.first.subscribe(fVarArr[0]);
        this.second.subscribe(fVarArr[1]);
    }
}
