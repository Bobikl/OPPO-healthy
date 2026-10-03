package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.pd1;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSequenceEqual$EqualCoordinator<T> extends AtomicInteger implements cv5 {
    private static final long serialVersionUID = -6178010334400373240L;
    volatile boolean cancelled;
    final pd1<? super T, ? super T> comparer;
    final bed<? super Boolean> downstream;
    final kdd<? extends T> first;
    final f<T>[] observers;
    final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
    final kdd<? extends T> second;
    T v1;
    T v2;

    public ObservableSequenceEqual$EqualCoordinator(bed<? super Boolean> bedVar, int i, kdd<? extends T> kddVar, kdd<? extends T> kddVar2, pd1<? super T, ? super T> pd1Var) {
        this.downstream = bedVar;
        this.first = kddVar;
        this.second = kddVar2;
        this.comparer = pd1Var;
        this.observers = new f[]{new f<>(this, 0, i), new f<>(this, 1, i)};
    }

    public void cancel(yki<T> ykiVar, yki<T> ykiVar2) {
        this.cancelled = true;
        ykiVar.clear();
        ykiVar2.clear();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.resources.dispose();
        if (getAndIncrement() == 0) {
            f<T>[] fVarArr = this.observers;
            fVarArr[0].f20496j.clear();
            fVarArr[1].f20496j.clear();
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
        yki<T> ykiVar = fVar.f20496j;
        f<T> fVar2 = fVarArr[1];
        yki<T> ykiVar2 = fVar2.f20496j;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = fVar.f20497l;
            if (z && (th2 = fVar.m) != null) {
                cancel(ykiVar, ykiVar2);
                this.downstream.onError(th2);
                return;
            }
            boolean z2 = fVar2.f20497l;
            if (z2 && (th = fVar2.m) != null) {
                cancel(ykiVar, ykiVar2);
                this.downstream.onError(th);
                return;
            }
            if (this.v1 == null) {
                this.v1 = ykiVar.poll();
            }
            boolean z3 = this.v1 == null;
            if (this.v2 == null) {
                this.v2 = ykiVar2.poll();
            }
            T t = this.v2;
            boolean z4 = t == null;
            if (z && z2 && z3 && z4) {
                this.downstream.onNext(Boolean.TRUE);
                this.downstream.onComplete();
                return;
            }
            if (z && z2 && z3 != z4) {
                cancel(ykiVar, ykiVar2);
                this.downstream.onNext(Boolean.FALSE);
                this.downstream.onComplete();
                return;
            }
            if (!z3 && !z4) {
                try {
                    if (!this.comparer.a(this.v1, t)) {
                        cancel(ykiVar, ykiVar2);
                        this.downstream.onNext(Boolean.FALSE);
                        this.downstream.onComplete();
                        return;
                    }
                    this.v1 = null;
                    this.v2 = null;
                } catch (Throwable th3) {
                    iu6.b(th3);
                    cancel(ykiVar, ykiVar2);
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
        ykiVar.clear();
        ykiVar2.clear();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    public boolean setDisposable(cv5 cv5Var, int i) {
        return this.resources.setResource(i, cv5Var);
    }

    public void subscribe() {
        f<T>[] fVarArr = this.observers;
        this.first.subscribe(fVarArr[0]);
        this.second.subscribe(fVarArr[1]);
    }
}
