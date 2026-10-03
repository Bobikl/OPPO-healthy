package com.oplusos.vfxmodelviewer.utils;

import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.IndirectLight;
import com.oplusos.vfxmodelviewer.filament.Skybox;
import com.oplusos.vfxmodelviewer.filament.Texture;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bJ)\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J!\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0082 ¨\u0006\u001d"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/KTXLoader;", "", "()V", "createIndirectLight", "Lcom/oplusos/vfxmodelviewer/filament/IndirectLight;", "engine", "Lcom/oplusos/vfxmodelviewer/filament/Engine;", "buffer", "Ljava/nio/Buffer;", "options", "Lcom/oplusos/vfxmodelviewer/utils/KTXLoader$Options;", "createSkybox", "Lcom/oplusos/vfxmodelviewer/filament/Skybox;", "createTexture", "Lcom/oplusos/vfxmodelviewer/filament/Texture;", "getSphericalHarmonics", "", "nCreateIndirectLight", "", "nativeEngine", "remaining", "", "srgb", "", "nCreateKTXTexture", "nCreateSkybox", "nGetSphericalHarmonics", "outSphericalHarmonics", "Options", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KTXLoader {

    @NotNull
    public static final KTXLoader INSTANCE = new KTXLoader();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/KTXLoader$Options;", "", "()V", "srgb", "", "getSrgb", "()Z", "setSrgb", "(Z)V", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Options {
        private boolean srgb;

        public final boolean getSrgb() {
            return this.srgb;
        }

        public final void setSrgb(boolean z) {
            this.srgb = z;
        }
    }

    private KTXLoader() {
    }

    public static /* synthetic */ IndirectLight createIndirectLight$default(KTXLoader kTXLoader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return kTXLoader.createIndirectLight(engine, buffer, options);
    }

    public static /* synthetic */ Skybox createSkybox$default(KTXLoader kTXLoader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return kTXLoader.createSkybox(engine, buffer, options);
    }

    public static /* synthetic */ Texture createTexture$default(KTXLoader kTXLoader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return kTXLoader.createTexture(engine, buffer, options);
    }

    private final native long nCreateIndirectLight(long nativeEngine, Buffer buffer, int remaining, boolean srgb);

    private final native long nCreateKTXTexture(long nativeEngine, Buffer buffer, int remaining, boolean srgb);

    private final native long nCreateSkybox(long nativeEngine, Buffer buffer, int remaining, boolean srgb);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int remaining, float[] outSphericalHarmonics);

    @NotNull
    public final IndirectLight createIndirectLight(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new IndirectLight(nCreateIndirectLight(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    @NotNull
    public final Skybox createSkybox(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Skybox(nCreateSkybox(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    @NotNull
    public final Texture createTexture(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Texture(nCreateKTXTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    @Nullable
    public final float[] getSphericalHarmonics(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        float[] fArr = new float[27];
        if (nGetSphericalHarmonics(buffer, buffer.remaining(), fArr)) {
            return fArr;
        }
        return null;
    }
}
