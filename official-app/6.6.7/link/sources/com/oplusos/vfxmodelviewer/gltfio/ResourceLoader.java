package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.NonNull;
import com.oplusos.vfxmodelviewer.filament.Engine;
import java.nio.Buffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ResourceLoader {
    private final long mNativeObject;

    public ResourceLoader(@NonNull Engine engine) {
        this.mNativeObject = nCreateResourceLoader(engine.getNativeObject(), false, false);
    }

    private static native void nAddResourceData(long j, String str, Buffer buffer, int i);

    private static native boolean nAsyncBeginLoad(long j, long j2);

    private static native void nAsyncCancelLoad(long j);

    private static native float nAsyncGetLoadProgress(long j);

    private static native void nAsyncUpdateLoad(long j);

    private static native long nCreateResourceLoader(long j, boolean z, boolean z2);

    private static native void nDestroyResourceLoader(long j);

    private static native void nEvictResourceData(long j);

    private static native boolean nHasResourceData(long j, String str);

    private static native void nLoadResources(long j, long j2);

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
