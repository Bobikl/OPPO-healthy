package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class SingleZipArray$ZipCoordinator<T, R> extends AtomicInteger implements cv5 {
    private static final long serialVersionUID = -5556924161382950569L;
    final m6h<? super R> downstream;
    final SingleZipArray$ZipSingleObserver<T>[] observers;
    final Object[] values;
    final j08<? super Object[], ? extends R> zipper;

    public SingleZipArray$ZipCoordinator(m6h<? super R> m6hVar, int i, j08<? super Object[], ? extends R> j08Var) {
        super(i);
        this.downstream = m6hVar;
        this.zipper = j08Var;
        SingleZipArray$ZipSingleObserver<T>[] singleZipArray$ZipSingleObserverArr = new SingleZipArray$ZipSingleObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            singleZipArray$ZipSingleObserverArr[i2] = new SingleZipArray$ZipSingleObserver<>(this, i2);
        }
        this.observers = singleZipArray$ZipSingleObserverArr;
        this.values = new Object[i];
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (getAndSet(0) > 0) {
            for (SingleZipArray$ZipSingleObserver<T> singleZipArray$ZipSingleObserver : this.observers) {
                singleZipArray$ZipSingleObserver.dispose();
            }
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
            h4g.r(th);
        } else {
            disposeExcept(i);
            this.downstream.onError(th);
        }
    }

    public void innerSuccess(T t, int i) {
        this.values[i] = t;
        if (decrementAndGet() == 0) {
            try {
                this.downstream.onSuccess(abd.d(this.zipper.apply(this.values), "The zipper returned a null value"));
            } catch (Throwable th) {
                iu6.b(th);
                this.downstream.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() <= 0;
    }
}
