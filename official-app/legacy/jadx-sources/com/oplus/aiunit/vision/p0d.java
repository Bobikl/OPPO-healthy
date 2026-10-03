package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class p0d {
    public final HashMap a = new HashMap();
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public final m0d a(final String str, s3d s3dVar) {
        m0d m0dVar = new m0d() { // from class: com.oplus.aiunit.vision.o0d
        };
        Lock lockWriteLock = this.b.writeLock();
        lockWriteLock.lock();
        try {
            this.a.put(str, s3dVar);
            return m0dVar;
        } finally {
            lockWriteLock.unlock();
        }
    }
}
