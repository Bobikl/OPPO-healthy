package com.heytap.health.connect.rawapi.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003j\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/connect/rawapi/util/LockedHashMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "()V", "mReadLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;", "mWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", "readLock", "", "readUnLock", "writeLock", "writeUnLock", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LockedHashMap<K, V> extends HashMap<K, V> {

    @NotNull
    private final ReentrantReadWriteLock.ReadLock mReadLock;

    @NotNull
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    public LockedHashMap() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        this.mReadLock = lock;
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
        this.mWriteLock = writeLock;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    public final void readLock() {
        this.mReadLock.lock();
    }

    public final void readUnLock() {
        this.mReadLock.unlock();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    public final void writeLock() {
        this.mWriteLock.lock();
    }

    public final void writeUnLock() {
        this.mWriteLock.unlock();
    }
}
