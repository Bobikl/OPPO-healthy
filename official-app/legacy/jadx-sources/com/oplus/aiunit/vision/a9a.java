package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;

/* JADX INFO: loaded from: classes10.dex */
public interface a9a<T> {
    void drain();

    void innerComplete(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void innerError(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);

    void innerNext(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);
}
