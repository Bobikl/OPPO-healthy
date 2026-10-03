package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface kob<T> extends g4h<T> {
    int consumerIndex();

    void drop();

    T peek();

    @Override // com.oplus.aiunit.vision.g4h
    T poll();

    int producerIndex();
}
