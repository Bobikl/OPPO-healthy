package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface mob<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(cv5 cv5Var);

    void onSuccess(T t);
}
