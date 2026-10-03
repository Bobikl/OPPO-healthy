package com.heytap.health.connect.rawapi.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/connect/rawapi/util/LockedHashSet;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "()V", "mReadLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", "mWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", "readLock", "", "readUnLock", "writeLock", "writeUnLock", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LockedHashSet<T> extends HashSet<T> {

    @NotNull
    private final ReentrantReadWriteLock.ReadLock mReadLock;

    @NotNull
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    public LockedHashSet() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        this.mReadLock = lock;
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
        this.mWriteLock = writeLock;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final void readLock() {
        this.mReadLock.lock();
    }

    public final void readUnLock() {
        this.mReadLock.unlock();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public final void writeLock() {
        this.mWriteLock.lock();
    }

    public final void writeUnLock() {
        this.mWriteLock.unlock();
    }
}
