package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface lob<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(io.reactivex.rxjava3.disposables.a aVar);

    void onSuccess(T t);
}
