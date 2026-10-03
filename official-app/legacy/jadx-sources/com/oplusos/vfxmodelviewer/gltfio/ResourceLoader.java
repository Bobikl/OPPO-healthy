package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.NonNull;
import com.oplusos.vfxmodelviewer.filament.Engine;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceLoader {
    private final long mNativeObject;

    public ResourceLoader(@NonNull Engine engine) {
        this.mNativeObject = nCreateResourceLoader(engine.getNativeObject(), false, false);
    }

    private static native void nAddResourceData(long j2, String str, Buffer buffer, int i);

    private static native boolean nAsyncBeginLoad(long j2, long j3);

    private static native void nAsyncCancelLoad(long j2);

    private static native float nAsyncGetLoadProgress(long j2);

    private static native void nAsyncUpdateLoad(long j2);

    private static native long nCreateResourceLoader(long j2, boolean z, boolean z2);

    private static native void nDestroyResourceLoader(long j2);

    private static native void nEvictResourceData(long j2);

    private static native boolean nHasResourceData(long j2, String str);

    private static native void nLoadResources(long j2, long j3);

    @NonNull
    public ResourceLoader addResourceData(@NonNull String str, @NonNull Buffer buffer) {
        nAddResourceData(this.mNativeObject, str, buffer, buffer.remaining());
        return this;
    }

    public boolean asyncBeginLoad(@NonNull FilamentAsset filamentAsset) {
        return nAsyncBeginLoad(this.mNativeObject, filamentAsset.getNativeObject());
    }

    public void asyncCancelLoad() {
        nAsyncCancelLoad(this.mNativeObject);
    }

    public float asyncGetLoadProgress() {
        return nAsyncGetLoadProgress(this.mNativeObject);
    }

    public void asyncUpdateLoad() {
        nAsyncUpdateLoad(this.mNativeObject);
    }

    public void destroy() {
        nDestroyResourceLoader(this.mNativeObject);
    }

    public void evictResourceData() {
        nEvictResourceData(this.mNativeObject);
    }

    public boolean hasResourceData(@NonNull String str) {
        return nHasResourceData(this.mNativeObject, str);
    }

    @NonNull
    public ResourceLoader loadResources(@NonNull FilamentAsset filamentAsset) {
        nLoadResources(this.mNativeObject, filamentAsset.getNativeObject());
        return this;
    }

    public ResourceLoader(@NonNull Engine engine, boolean z, boolean z2) {
        this.mNativeObject = nCreateResourceLoader(engine.getNativeObject(), z, z2);
    }
}
