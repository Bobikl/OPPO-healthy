package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.oplusos.vfxmodelviewer.filament.proguard.UsedByReflection;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class EntityManager {
    private long mNativeObject;

    public static class Holder {
        static final EntityManager INSTANCE = new EntityManager();

        private Holder() {
        }
    }

    @NonNull
    public static EntityManager get() {
        return Holder.INSTANCE;
    }

    private static native int nCreate(long j);

    private static native void nCreateArray(long j, int i, int[] iArr);

    private static native void nDestroy(long j, int i);

    private static native void nDestroyArray(long j, int i, int[] iArr);

    private static native long nGetEntityManager();

    private static native boolean nIsAlive(long j, int i);

    @Entity
    public int create() {
        return nCreate(this.mNativeObject);
    }

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    @UsedByReflection("AssetLoader.java")
    public long getNativeObject() {
        return this.mNativeObject;
    }

    public boolean isAlive(@Entity int i) {
        return nIsAlive(this.mNativeObject, i);
    }

    private EntityManager() {
        this.mNativeObject = nGetEntityManager();
    }

    @NonNull
    @Entity
    public int[] create(@IntRange(from = 1) int i) {
        if (i < 1) {
            throw new ArrayIndexOutOfBoundsException("n must be at least 1");
        }
        int[] iArr = new int[i];
        nCreateArray(this.mNativeObject, i, iArr);
        return iArr;
    }

    public void destroy(@NonNull @Entity int[] iArr) {
        nDestroyArray(this.mNativeObject, iArr.length, iArr);
    }

    public EntityManager(long j) {
        nGetEntityManager();
        this.mNativeObject = j;
    }

    @NonNull
    public int[] create(@NonNull @Entity int[] iArr) {
        nCreateArray(this.mNativeObject, iArr.length, iArr);
        return iArr;
    }
}
