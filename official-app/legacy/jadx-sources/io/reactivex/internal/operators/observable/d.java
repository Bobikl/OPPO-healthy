package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public interface d<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable);
}
