package com.oplus.aiunit.vision;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/jo4;", "Lcom/oplus/aiunit/vision/ll4;", "", "readLock", "readUnLock", "writeLock", "writeUnLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", "i", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", "mWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", "j", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", "mReadLock", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class jo4 implements ll4 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ReentrantReadWriteLock.WriteLock mWriteLock;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantReadWriteLock.ReadLock mReadLock;

    public jo4() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        this.mReadLock = lock;
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
        this.mWriteLock = writeLock;
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readLock() {
        this.mReadLock.lock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readUnLock() {
        this.mReadLock.unlock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeLock() {
        this.mWriteLock.lock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeUnLock() {
        this.mWriteLock.unlock();
    }
}
