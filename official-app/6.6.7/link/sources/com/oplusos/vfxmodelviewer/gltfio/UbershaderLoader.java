package com.oplusos.vfxmodelviewer.gltfio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Material;
import com.oplusos.vfxmodelviewer.filament.MaterialInstance;
import com.oplusos.vfxmodelviewer.filament.VertexBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class UbershaderLoader implements MaterialProvider {
    private long mNativeObject;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$oplusos$vfxmodelviewer$filament$VertexBuffer$VertexAttribute;

        static {
            int[] iArr = new int[VertexBuffer.VertexAttribute.values().length];
            $SwitchMap$com$oplusos$vfxmodelviewer$filament$VertexBuffer$VertexAttribute = iArr;
            try {
                iArr[VertexBuffer.VertexAttribute.UV0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$VertexBuffer$VertexAttribute[VertexBuffer.VertexAttribute.UV1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$oplusos$vfxmodelviewer$filament$VertexBuffer$VertexAttribute[VertexBuffer.VertexAttribute.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public UbershaderLoader(Engine engine) {
        this.mNativeObject = nCreateUbershaderLoader(engine.getNativeObject());
    }

    private static native long nCreateMaterialInstance(long j, MaterialProvider.MaterialKey materialKey, int[] iArr, String str);

    private static native long nCreateUbershaderLoader(long j);

    private static native void nDestroyMaterials(long j);

    private static native void nDestroyUbershaderLoader(long j);

    private static native int nGetMaterialCount(long j);

    private static native void nGetMaterials(long j, long[] jArr);

    @Override // com.oplusos.vfxmodelviewer.gltfio.MaterialProvider
    @Nullable
    public MaterialInstance createMaterialInstance(MaterialProvider.MaterialKey materialKey, @NonNull @Size(min = 8) int[] iArr, @Nullable String str) {
        long jNCreateMaterialInstance = nCreateMaterialInstance(this.mNativeObject, materialKey, iArr, str);
        if (jNCreateMaterialInstance == 0) {
            return null;
        }
        return new MaterialInstance((Engine) null, jNCreateMaterialInstance);
    }

    public void destroy() {
        nDestroyUbershaderLoader(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    @Override // com.oplusos.vfxmodelviewer.gltfio.MaterialProvider
    public void destroyMaterials() {
        nDestroyMaterials(this.mNativeObject);
    }

    @Override // com.oplusos.vfxmodelviewer.gltfio.MaterialProvider
    @NonNull
    public Material[] getMaterials() {
        int iNGetMaterialCount = nGetMaterialCount(this.mNativeObject);
        Material[] materialArr = new Material[iNGetMaterialCount];
        long[] jArr = new long[iNGetMaterialCount];
        nGetMaterials(this.mNativeObject, jArr);
        for (int i = 0; i < iNGetMaterialCount; i++) {
            materialArr[i] = new Material(jArr[i]);
        }
        return materialArr;
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Override // com.oplusos.vfxmodelviewer.gltfio.MaterialProvider
    public boolean needsDummyData(int i) {
        int i2 = 1.$SwitchMap$com$oplusos$vfxmodelviewer$filament$VertexBuffer$VertexAttribute[VertexBuffer.VertexAttribute.values()[i].ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }
}
