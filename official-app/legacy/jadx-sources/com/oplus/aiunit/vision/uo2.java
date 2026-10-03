package com.oplus.aiunit.vision;

import com.danikula.videocache.ProxyCacheException;

/* JADX INFO: loaded from: classes13.dex */
public interface uo2 {
    void a(byte[] bArr, int i) throws ProxyCacheException;

    long available() throws ProxyCacheException;

    int b(byte[] bArr, long j2, int i) throws ProxyCacheException;

    void close() throws ProxyCacheException;

    void complete() throws ProxyCacheException;

    boolean isCompleted();
}
