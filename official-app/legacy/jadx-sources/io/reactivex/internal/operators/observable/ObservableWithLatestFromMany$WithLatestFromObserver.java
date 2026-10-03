package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.zf8;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWithLatestFromMany$WithLatestFromObserver<T, R> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = 1577321883966341961L;
    final j08<? super Object[], R> combiner;
    volatile boolean done;
    final bed<? super R> downstream;
    final AtomicThrowable error;
    final ObservableWithLatestFromMany$WithLatestInnerObserver[] observers;
    final AtomicReference<cv5> upstream;
    final AtomicReferenceArray<Object> values;

    public ObservableWithLatestFromMany$WithLatestFromObserver(bed<? super R> bedVar, j08<? super Object[], R> j08Var, int i) {
        this.downstream = bedVar;
        this.combiner = j08Var;
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

    @Override // com.oplus.aiunit.vision.cv5
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
        zf8.a(this.downstream, this, this.error);
    }

    public void innerError(int i, Throwable th) {
        this.done = true;
        DisposableHelper.dispose(this.upstream);
        cancelAllBut(i);
        zf8.c(this.downstream, th, this, this.error);
    }

    public void innerNext(int i, Object obj) {
        this.values.set(i, obj);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        zf8.a(this.downstream, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        zf8.c(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
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
            zf8.e(this.downstream, abd.d(this.combiner.apply(objArr), "combiner returned a null value"), this, this.error);
        } catch (Throwable th) {
            iu6.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.upstream, cv5Var);
    }

    public void subscribe(kdd<?>[] kddVarArr, int i) {
        ObservableWithLatestFromMany$WithLatestInnerObserver[] observableWithLatestFromMany$WithLatestInnerObserverArr = this.observers;
        AtomicReference<cv5> atomicReference = this.upstream;
        for (int i2 = 0; i2 < i && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i2++) {
            kddVarArr[i2].subscribe(observableWithLatestFromMany$WithLatestInnerObserverArr[i2]);
        }
    }
}
