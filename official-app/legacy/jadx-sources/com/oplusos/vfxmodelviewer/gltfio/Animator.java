package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes9.dex */
public class Animator {
    private long mNativeObject;

    public Animator(long j2) {
        this.mNativeObject = j2;
    }

    private static native void nApplyAnimation(long j2, int i, float f);

    private static native int nGetAnimationCount(long j2);

    private static native float nGetAnimationDuration(long j2, int i);

    private static native String nGetAnimationName(long j2, int i);

    private static native void nUpdateBoneMatrices(long j2);

    public void applyAnimation(@IntRange(from = 0) int i, float f) {
        nApplyAnimation(getNativeObject(), i, f);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getAnimationCount() {
        return nGetAnimationCount(getNativeObject());
    }

    public float getAnimationDuration(@IntRange(from = 0) int i) {
        return nGetAnimationDuration(getNativeObject(), i);
    }

    public String getAnimationName(@IntRange(from = 0) int i) {
        return nGetAnimationName(getNativeObject(), i);
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Using Animator on destroyed asset");
    }

    public void updateBoneMatrices() {
        nUpdateBoneMatrices(getNativeObject());
    }
}
