package com.oplus.aiunit.vision;

import com.danikula.videocache.ProxyCacheException;

/* JADX INFO: loaded from: classes13.dex */
public interface r3i {
    void a(long j2) throws ProxyCacheException;

    void close() throws ProxyCacheException;

    long length() throws ProxyCacheException;

    int read(byte[] bArr) throws ProxyCacheException;
}
