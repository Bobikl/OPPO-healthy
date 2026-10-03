package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.NonNull;
import com.oplusos.vfxmodelviewer.filament.Entity;

/* JADX INFO: loaded from: classes9.dex */
public class FilamentInstance {
    private Animator mAnimator = null;
    private FilamentAsset mAsset;
    private long mNativeObject;

    public FilamentInstance(FilamentAsset filamentAsset, long j2) {
        this.mAsset = filamentAsset;
        this.mNativeObject = j2;
    }

    private static native long nGetAnimator(long j2);

    private static native void nGetEntities(long j2, int[] iArr);

    private static native int nGetEntityCount(long j2);

    private static native int nGetRoot(long j2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @NonNull
    public Animator getAnimator() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            return animator;
        }
        Animator animator2 = new Animator(nGetAnimator(this.mNativeObject));
        this.mAnimator = animator2;
        return animator2;
    }

    @NonNull
    public FilamentAsset getAsset() {
        return this.mAsset;
    }

    @NonNull
    @Entity
    public int[] getEntities() {
        int[] iArr = new int[nGetEntityCount(this.mNativeObject)];
        nGetEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int getRoot() {
        return nGetRoot(this.mNativeObject);
    }
}
