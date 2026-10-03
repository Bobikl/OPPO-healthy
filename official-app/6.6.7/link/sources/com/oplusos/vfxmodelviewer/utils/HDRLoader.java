package com.oplusos.vfxmodelviewer.utils;

import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Texture;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/HDRLoader;", "", "()V", "createTexture", "Lcom/oplusos/vfxmodelviewer/filament/Texture;", "engine", "Lcom/oplusos/vfxmodelviewer/filament/Engine;", "buffer", "Ljava/nio/Buffer;", "options", "Lcom/oplusos/vfxmodelviewer/utils/HDRLoader$Options;", "nCreateHDRTexture", "", "nativeEngine", "remaining", "", "format", "Options", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HDRLoader {

    @NotNull
    public static final HDRLoader INSTANCE = new HDRLoader();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/HDRLoader$Options;", "", "()V", "desiredFormat", "Lcom/oplusos/vfxmodelviewer/filament/Texture$InternalFormat;", "getDesiredFormat", "()Lcom/oplusos/vfxmodelviewer/filament/Texture$InternalFormat;", "setDesiredFormat", "(Lcom/oplusos/vfxmodelviewer/filament/Texture$InternalFormat;)V", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Options {

        @NotNull
        private Texture.InternalFormat desiredFormat = Texture.InternalFormat.RGB16F;

        @NotNull
        public final Texture.InternalFormat getDesiredFormat() {
            return this.desiredFormat;
        }

        public final void setDesiredFormat(@NotNull Texture.InternalFormat internalFormat) {
            Intrinsics.checkNotNullParameter(internalFormat, "<set-?>");
            this.desiredFormat = internalFormat;
        }
    }

    private HDRLoader() {
    }

    public static /* synthetic */ Texture createTexture$default(HDRLoader hDRLoader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return hDRLoader.createTexture(engine, buffer, options);
    }

    private final native long nCreateHDRTexture(long nativeEngine, Buffer buffer, int remaining, int format);

    @Nullable
    public final Texture createTexture(@NotNull Engine engine, @NotNull Buffer buffer, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        long jNCreateHDRTexture = nCreateHDRTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getDesiredFormat().ordinal());
        if (jNCreateHDRTexture == 0) {
            return null;
        }
        return new Texture(jNCreateHDRTexture);
    }
}
