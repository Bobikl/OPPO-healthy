package io.netty.handler.ssl;

/* JADX INFO: loaded from: classes10.dex */
interface OpenSslEngineMap {
    void add(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine);

    ReferenceCountedOpenSslEngine get(long j2);

    ReferenceCountedOpenSslEngine remove(long j2);
}
