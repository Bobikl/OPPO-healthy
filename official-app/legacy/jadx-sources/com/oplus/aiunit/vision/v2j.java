package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public interface v2j<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(c3j c3jVar);
}
