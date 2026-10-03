package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface bed<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(cv5 cv5Var);
}
