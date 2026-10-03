package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface ml6<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
