package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.EntityManager;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes9.dex */
public class AssetLoader {
    private Engine mEngine;
    private MaterialProvider mMaterialCache;
    private long mNativeObject;

    public AssetLoader(@NonNull Engine engine, @NonNull MaterialProvider materialProvider, @NonNull EntityManager entityManager) {
        long jNCreateAssetLoader = nCreateAssetLoader(engine.getNativeObject(), materialProvider, entityManager.getNativeObject());
        this.mNativeObject = jNCreateAssetLoader;
        if (jNCreateAssetLoader == 0) {
            throw new IllegalStateException("Unable to parse glTF asset.");
        }
        this.mEngine = engine;
        this.mMaterialCache = materialProvider;
    }

    private static native long nCreateAssetFromBinary(long j2, Buffer buffer, int i);

    private static native long nCreateAssetFromJson(long j2, Buffer buffer, int i);

    private static native long nCreateAssetLoader(long j2, Object obj, long j3);

    private static native long nCreateInstance(long j2, long j3);

    private static native long nCreateInstancedAsset(long j2, Buffer buffer, int i, long[] jArr);

    private static native void nDestroyAsset(long j2, long j3);

    private static native void nDestroyAssetLoader(long j2);

    private static native void nEnableDiagnostics(long j2, boolean z);

    @Nullable
    public FilamentAsset createAssetFromBinary(@NonNull Buffer buffer) {
        long jNCreateAssetFromBinary = nCreateAssetFromBinary(this.mNativeObject, buffer, buffer.remaining());
        if (jNCreateAssetFromBinary != 0) {
            return new FilamentAsset(this.mEngine, jNCreateAssetFromBinary);
        }
        return null;
    }

    @Nullable
    public FilamentAsset createAssetFromJson(@NonNull Buffer buffer) {
        long jNCreateAssetFromJson = nCreateAssetFromJson(this.mNativeObject, buffer, buffer.remaining());
        if (jNCreateAssetFromJson != 0) {
            return new FilamentAsset(this.mEngine, jNCreateAssetFromJson);
        }
        return null;
    }

    @Nullable
    public FilamentInstance createInstance(@NonNull FilamentAsset filamentAsset) {
        long jNCreateInstance = nCreateInstance(this.mNativeObject, filamentAsset.getNativeObject());
        if (jNCreateInstance == 0) {
            return null;
        }
        return new FilamentInstance(filamentAsset, jNCreateInstance);
    }

    @Nullable
    public FilamentAsset createInstancedAsset(@NonNull Buffer buffer, @NonNull FilamentInstance[] filamentInstanceArr) {
        int length = filamentInstanceArr.length;
        long[] jArr = new long[length];
        long jNCreateInstancedAsset = nCreateInstancedAsset(this.mNativeObject, buffer, buffer.remaining(), jArr);
        if (jNCreateInstancedAsset == 0) {
            return null;
        }
        FilamentAsset filamentAsset = new FilamentAsset(this.mEngine, jNCreateInstancedAsset);
        for (int i = 0; i < length; i++) {
            filamentInstanceArr[i] = new FilamentInstance(filamentAsset, jArr[i]);
        }
        return filamentAsset;
    }

    public void destroy() {
        this.mMaterialCache.destroyMaterials();
        nDestroyAssetLoader(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public void destroyAsset(@NonNull FilamentAsset filamentAsset) {
        nDestroyAsset(this.mNativeObject, filamentAsset.getNativeObject());
        filamentAsset.clearNativeObject();
    }

    public void enableDiagnostics(boolean z) {
        nEnableDiagnostics(this.mNativeObject, z);
    }
}
