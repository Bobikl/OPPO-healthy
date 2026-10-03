package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class SingleZipArray$ZipCoordinator<T, R> extends AtomicInteger implements a {
    private static final long serialVersionUID = -5556924161382950569L;
    final l6h<? super R> downstream;
    final SingleZipArray$ZipSingleObserver<T>[] observers;
    Object[] values;
    final d08<? super Object[], ? extends R> zipper;

    public SingleZipArray$ZipCoordinator(l6h<? super R> l6hVar, int i, d08<? super Object[], ? extends R> d08Var) {
        super(i);
        this.downstream = l6hVar;
        this.zipper = d08Var;
        SingleZipArray$ZipSingleObserver<T>[] singleZipArray$ZipSingleObserverArr = new SingleZipArray$ZipSingleObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            singleZipArray$ZipSingleObserverArr[i2] = new SingleZipArray$ZipSingleObserver<>(this, i2);
        }
        this.observers = singleZipArray$ZipSingleObserverArr;
        this.values = new Object[i];
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (getAndSet(0) > 0) {
            for (SingleZipArray$ZipSingleObserver<T> singleZipArray$ZipSingleObserver : this.observers) {
                singleZipArray$ZipSingleObserver.dispose();
            }
            this.values = null;
        }
    }

    public void disposeExcept(int i) {
        SingleZipArray$ZipSingleObserver<T>[] singleZipArray$ZipSingleObserverArr = this.observers;
        int length = singleZipArray$ZipSingleObserverArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            singleZipArray$ZipSingleObserverArr[i2].dispose();
        }
        while (true) {
            i++;
            if (i >= length) {
                return;
            } else {
                singleZipArray$ZipSingleObserverArr[i].dispose();
            }
        }
    }

    public void innerError(Throwable th, int i) {
        if (getAndSet(0) <= 0) {
            g4g.u(th);
            return;
        }
        disposeExcept(i);
        this.values = null;
        this.downstream.onError(th);
    }

    public void innerSuccess(T t, int i) {
        Object[] objArr = this.values;
        if (objArr != null) {
            objArr[i] = t;
        }
        if (decrementAndGet() == 0) {
            try {
                R rApply = this.zipper.apply(objArr);
                Objects.requireNonNull(rApply, "The zipper returned a null value");
                this.values = null;
                this.downstream.onSuccess(rApply);
            } catch (Throwable th) {
                hu6.b(th);
                this.values = null;
                this.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() <= 0;
    }
}
