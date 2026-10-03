package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.yf8;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWithLatestFromMany$WithLatestFromObserver<T, R> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 1577321883966341961L;
    final d08<? super Object[], R> combiner;
    volatile boolean done;
    final aed<? super R> downstream;
    final AtomicThrowable error;
    final ObservableWithLatestFromMany$WithLatestInnerObserver[] observers;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream;
    final AtomicReferenceArray<Object> values;

    public ObservableWithLatestFromMany$WithLatestFromObserver(aed<? super R> aedVar, d08<? super Object[], R> d08Var, int i) {
        this.downstream = aedVar;
        this.combiner = d08Var;
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = new ObservableWithLatestFromMany$WithLatestInnerObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            observableWithLatestFromMany$WithLatestInnerObserverArr[i2] = new ObservableWithLatestFromMany$WithLatestInnerObserver(this, i2);
        }
        this.observers = observableWithLatestFromMany$WithLatestInnerObserverArr;
        this.values = new AtomicReferenceArray<>(i);
        this.upstream = new AtomicReference<>();
        this.error = new AtomicThrowable();
    }

    public void cancelAllBut(int i) {
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = this.observers;
        for (int i2 = 0; i2 < observableWithLatestFromMany$WithLatestInnerObserverArr.length; i2++) {
            if (i2 != i) {
                observableWithLatestFromMany$WithLatestInnerObserverArr[i2].dispose();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        for (ObservableWithLatestFromMany$WithLatestInnerObserver observableWithLatestFromMany$WithLatestInnerObserver : this.observers) {
            observableWithLatestFromMany$WithLatestInnerObserver.dispose();
        }
    }

    public void innerComplete(int i, boolean z) {
        if (z) {
            return;
        }
        this.done = true;
        cancelAllBut(i);
        yf8.a(this.downstream, this, this.error);
    }

    public void innerError(int i, Throwable th) {
        this.done = true;
        DisposableHelper.dispose(this.upstream);
        cancelAllBut(i);
        yf8.c(this.downstream, th, this, this.error);
    }

    public void innerNext(int i, Object obj) {
        this.values.set(i, obj);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        yf8.a(this.downstream, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        yf8.c(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.values;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        int i = 0;
        objArr[0] = t;
        while (i < length) {
            Object obj = atomicReferenceArray.get(i);
            if (obj == null) {
                return;
            }
            i++;
            objArr[i] = obj;
        }
        try {
            R rApply = this.combiner.apply(objArr);
            Objects.requireNonNull(rApply, "combiner returned a null value");
            yf8.e(this.downstream, rApply, this, this.error);
        } catch (Throwable th) {
            hu6.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.upstream, aVar);
    }

    public void subscribe(jdd<?>[] jddVarArr, int i) {
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = this.observers;
        AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference = this.upstream;
        for (int i2 = 0; i2 < i && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i2++) {
            jddVarArr[i2].subscribe(observableWithLatestFromMany$WithLatestInnerObserverArr[i2]);
        }
    }
}
