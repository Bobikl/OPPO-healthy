package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface job<T> extends f4h<T> {
    int consumerIndex();

    void drop();

    T peek();

    @Override // com.oplus.aiunit.vision.f4h
    T poll();

    int producerIndex();
}
