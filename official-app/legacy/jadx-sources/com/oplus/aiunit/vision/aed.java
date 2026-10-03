package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface aed<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(io.reactivex.rxjava3.disposables.a aVar);
}
