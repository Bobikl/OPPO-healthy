package com.oplus.aiunit.vision;

import io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class scd<T> extends kbd<T> implements Callable {
    public final T i;

    public scd(T t) {
        this.i = t;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(bedVar, this.i);
        bedVar.onSubscribe(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.i;
    }
}
