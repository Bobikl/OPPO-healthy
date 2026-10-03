package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Animator {
    private long mNativeObject;

    public Animator(long j) {
        this.mNativeObject = j;
    }

    private static native void nApplyAnimation(long j, int i, float f);

    private static native int nGetAnimationCount(long j);

    private static native float nGetAnimationDuration(long j, int i);

    private static native String nGetAnimationName(long j, int i);

    private static native void nUpdateBoneMatrices(long j);

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
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Using Animator on destroyed asset");
    }

    public void updateBoneMatrices() {
        nUpdateBoneMatrices(getNativeObject());
    }
}
