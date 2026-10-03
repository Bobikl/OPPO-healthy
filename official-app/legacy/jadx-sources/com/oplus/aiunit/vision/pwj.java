package com.oplus.aiunit.vision;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/pwj;", ExifInterface.LONGITUDE_EAST, "", "", "key", "value", "", "c", "(ILjava/lang/Object;)V", "", "b", "a", "()Ljava/lang/Object;", "Lkotlin/Function1;", "condition", "d", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "sparseArray", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadSafeSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeSparseArray.kt\ncom/heytap/health/ThreadSafeSparseArray\n+ 2 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,125:1\n56#2:126\n56#2:127\n56#2:128\n76#2,4:129\n*S KotlinDebug\n*F\n+ 1 ThreadSafeSparseArray.kt\ncom/heytap/health/ThreadSafeSparseArray\n*L\n75#1:126\n79#1:127\n87#1:128\n113#1:129,4\n*E\n"})
public final class pwj<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<E> sparseArray = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Nullable
    public final E a() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.sparseArray.size() == 0 ? null : this.sparseArray.valueAt(0);
        } finally {
            lock.unlock();
        }
    }

    public final boolean b() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.sparseArray.size() == 0;
        } finally {
            lock.unlock();
        }
    }

    public final void c(int key, E value) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.sparseArray.put(key, value);
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void d(@NotNull Function1<? super E, Boolean> condition) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(condition, "condition");
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            SparseArray<E> sparseArray = this.sparseArray;
            int size = sparseArray.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    numValueOf = null;
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i2);
                if (condition.invoke(sparseArray.valueAt(i2)).booleanValue()) {
                    numValueOf = Integer.valueOf(iKeyAt);
                    break;
                }
                i2++;
            }
            lock.unlock();
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    this.sparseArray.remove(iIntValue);
                    Unit unit = Unit.INSTANCE;
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                } finally {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
