package com.oplus.aiunit.vision;

import io.reactivex.internal.observers.InnerQueuedObserver;

/* JADX INFO: loaded from: classes10.dex */
public interface z8a<T> {
    void drain();

    void innerComplete(InnerQueuedObserver<T> innerQueuedObserver);

    void innerError(InnerQueuedObserver<T> innerQueuedObserver, Throwable th);

    void innerNext(InnerQueuedObserver<T> innerQueuedObserver, T t);
}
