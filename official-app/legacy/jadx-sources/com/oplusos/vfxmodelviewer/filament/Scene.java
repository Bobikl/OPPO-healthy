package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class Scene {

    @Nullable
    private IndirectLight mIndirectLight;
    private long mNativeObject;

    @Nullable
    private Skybox mSkybox;

    public Scene(long j2) {
        this.mNativeObject = j2;
    }

    private static native void nAddEntities(long j2, int[] iArr);

    private static native void nAddEntity(long j2, int i);

    private static native int nGetLightCount(long j2);

    private static native int nGetRenderableCount(long j2);

    private static native void nRemove(long j2, int i);

    private static native void nRemoveEntities(long j2, int[] iArr);

    private static native void nSetIndirectLight(long j2, long j3);

    private static native void nSetSkybox(long j2, long j3);

    public void addEntities(@Entity int[] iArr) {
        nAddEntities(getNativeObject(), iArr);
    }

    public void addEntity(@Entity int i) {
        nAddEntity(getNativeObject(), i);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    @Nullable
    public IndirectLight getIndirectLight() {
        return this.mIndirectLight;
    }

    public int getLightCount() {
        return nGetLightCount(getNativeObject());
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed Scene");
    }

    public int getRenderableCount() {
        return nGetRenderableCount(getNativeObject());
    }

    @Nullable
    public Skybox getSkybox() {
        return this.mSkybox;
    }

    @Deprecated
    public void remove(@Entity int i) {
        removeEntity(i);
    }

    public void removeEntities(@Entity int[] iArr) {
        nRemoveEntities(getNativeObject(), iArr);
    }

    public void removeEntity(@Entity int i) {
        nRemove(getNativeObject(), i);
    }

    public void setIndirectLight(@Nullable IndirectLight indirectLight) {
        this.mIndirectLight = indirectLight;
        long nativeObject = getNativeObject();
        IndirectLight indirectLight2 = this.mIndirectLight;
        nSetIndirectLight(nativeObject, indirectLight2 != null ? indirectLight2.getNativeObject() : 0L);
    }

    public void setSkybox(@Nullable Skybox skybox) {
        this.mSkybox = skybox;
        long nativeObject = getNativeObject();
        Skybox skybox2 = this.mSkybox;
        nSetSkybox(nativeObject, skybox2 != null ? skybox2.getNativeObject() : 0L);
    }
}
