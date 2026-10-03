package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface x5h<T> {
    void onError(Throwable th);

    void onSuccess(T t);

    boolean tryOnError(Throwable th);
}
