package com.oplus.aiunit.vision;

import io.reactivex.internal.subscribers.InnerQueuedSubscriber;

/* JADX INFO: loaded from: classes10.dex */
public interface b9a<T> {
    void drain();

    void innerComplete(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void innerError(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);

    void innerNext(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);
}
