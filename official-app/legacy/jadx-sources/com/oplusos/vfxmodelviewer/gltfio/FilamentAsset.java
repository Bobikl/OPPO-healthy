package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplusos.vfxmodelviewer.filament.Box;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Entity;
import com.oplusos.vfxmodelviewer.filament.MaterialInstance;

/* JADX INFO: loaded from: classes9.dex */
public class FilamentAsset {
    private Animator mAnimator = null;
    private Engine mEngine;
    private long mNativeObject;

    public FilamentAsset(Engine engine, long j2) {
        this.mEngine = engine;
        this.mNativeObject = j2;
    }

    private static native long nGetAnimator(long j2);

    private static native void nGetBoundingBox(long j2, float[] fArr);

    private static native void nGetCameraEntities(long j2, int[] iArr);

    private static native int nGetCameraEntityCount(long j2);

    private static native void nGetEntities(long j2, int[] iArr);

    private static native int nGetEntitiesByName(long j2, String str, int[] iArr);

    private static native int nGetEntitiesByPrefix(long j2, String str, int[] iArr);

    private static native int nGetEntityCount(long j2);

    private static native String nGetExtras(long j2, int i);

    private static native int nGetFirstEntityByName(long j2, String str);

    private static native void nGetLightEntities(long j2, int[] iArr);

    private static native int nGetLightEntityCount(long j2);

    private static native int nGetMaterialInstanceCount(long j2);

    private static native void nGetMaterialInstances(long j2, long[] jArr);

    private static native String nGetName(long j2, int i);

    private static native int nGetResourceUriCount(long j2);

    private static native void nGetResourceUris(long j2, String[] strArr);

    private static native int nGetRoot(long j2);

    private static native int nPopRenderable(long j2);

    private static native int nPopRenderables(long j2, int[] iArr);

    private static native void nReleaseSourceData(long j2);

    public void clearNativeObject() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            animator.clearNativeObject();
        }
        this.mNativeObject = 0L;
    }

    @NonNull
    public Animator getAnimator() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            return animator;
        }
        long jNGetAnimator = nGetAnimator(getNativeObject());
        if (jNGetAnimator == 0) {
            throw new IllegalStateException("Unable to create animator");
        }
        Animator animator2 = new Animator(jNGetAnimator);
        this.mAnimator = animator2;
        return animator2;
    }

    @NonNull
    public Box getBoundingBox() {
        float[] fArr = new float[6];
        nGetBoundingBox(this.mNativeObject, fArr);
        return new Box(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
    }

    @NonNull
    @Entity
    public int[] getCameraEntities() {
        int[] iArr = new int[nGetCameraEntityCount(this.mNativeObject)];
        nGetCameraEntities(this.mNativeObject, iArr);
        return iArr;
    }

    @NonNull
    @Entity
    public int[] getEntities() {
        int[] iArr = new int[nGetEntityCount(this.mNativeObject)];
        nGetEntities(this.mNativeObject, iArr);
        return iArr;
    }

    @NonNull
    @Entity
    public int[] getEntitiesByName(String str) {
        int[] iArr = new int[nGetEntitiesByName(this.mNativeObject, str, null)];
        nGetEntitiesByName(this.mNativeObject, str, iArr);
        return iArr;
    }

    @NonNull
    @Entity
    public int[] getEntitiesByPrefix(String str) {
        int[] iArr = new int[nGetEntitiesByPrefix(this.mNativeObject, str, null)];
        nGetEntitiesByPrefix(this.mNativeObject, str, iArr);
        return iArr;
    }

    @Nullable
    public String getExtras(@Entity int i) {
        return nGetExtras(this.mNativeObject, i);
    }

    @Entity
    public int getFirstEntityByName(String str) {
        return nGetFirstEntityByName(this.mNativeObject, str);
    }

    @NonNull
    @Entity
    public int[] getLightEntities() {
        int[] iArr = new int[nGetLightEntityCount(this.mNativeObject)];
        nGetLightEntities(this.mNativeObject, iArr);
        return iArr;
    }

    @NonNull
    public MaterialInstance[] getMaterialInstances() {
        int iNGetMaterialInstanceCount = nGetMaterialInstanceCount(this.mNativeObject);
        MaterialInstance[] materialInstanceArr = new MaterialInstance[iNGetMaterialInstanceCount];
        long[] jArr = new long[iNGetMaterialInstanceCount];
        nGetMaterialInstances(this.mNativeObject, jArr);
        for (int i = 0; i < iNGetMaterialInstanceCount; i++) {
            materialInstanceArr[i] = new MaterialInstance(this.mEngine, jArr[i]);
        }
        return materialInstanceArr;
    }

    public String getName(@Entity int i) {
        return nGetName(getNativeObject(), i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @NonNull
    public String[] getResourceUris() {
        String[] strArr = new String[nGetResourceUriCount(this.mNativeObject)];
        nGetResourceUris(this.mNativeObject, strArr);
        return strArr;
    }

    @Entity
    public int getRoot() {
        return nGetRoot(this.mNativeObject);
    }

    @Entity
    public int popRenderable() {
        return nPopRenderable(this.mNativeObject);
    }

    public int popRenderables(@Nullable @Entity int[] iArr) {
        return nPopRenderables(this.mNativeObject, iArr);
    }

    public void releaseSourceData() {
        nReleaseSourceData(this.mNativeObject);
    }
}
