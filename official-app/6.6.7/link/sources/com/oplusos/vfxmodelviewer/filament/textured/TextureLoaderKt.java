package com.oplusos.vfxmodelviewer.filament.textured;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.oplusos.vfxmodelviewer.filament.Engine;
import com.oplusos.vfxmodelviewer.filament.Texture;
import com.oplusos.vfxmodelviewer.filament.android.TextureHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\b\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"SKIP_BITMAP_COPY", "", "format", "Lcom/oplusos/vfxmodelviewer/filament/Texture$Format;", "bitmap", "Landroid/graphics/Bitmap;", "internalFormat", "Lcom/oplusos/vfxmodelviewer/filament/Texture$InternalFormat;", "type", "Lcom/oplusos/vfxmodelviewer/filament/textured/TextureType;", "loadTexture", "Lcom/oplusos/vfxmodelviewer/filament/Texture;", "engine", "Lcom/oplusos/vfxmodelviewer/filament/Engine;", "resources", "Landroid/content/res/Resources;", "resourceId", "", "Lcom/oplusos/vfxmodelviewer/filament/Texture$Type;", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class TextureLoaderKt {
    public static final boolean SKIP_BITMAP_COPY = true;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextureType.values().length];
            iArr[TextureType.COLOR.ordinal()] = 1;
            iArr[TextureType.NORMAL.ordinal()] = 2;
            iArr[TextureType.DATA.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Texture.Format format(Bitmap bitmap) {
        String strName = bitmap.getConfig().name();
        switch (strName.hashCode()) {
            case -189895305:
                if (strName.equals("ALPHA_8")) {
                    return Texture.Format.ALPHA;
                }
                break;
            case 223337875:
                if (strName.equals("ARGB_8888")) {
                    return Texture.Format.RGBA;
                }
                break;
            case 1717230432:
                if (strName.equals("RGBA_F16")) {
                    return Texture.Format.RGBA;
                }
                break;
            case 1857362722:
                if (strName.equals("RGB_565")) {
                    return Texture.Format.RGB;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown bitmap configuration");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Texture.InternalFormat internalFormat(TextureType textureType) throws NoWhenBranchMatchedException {
        int i = WhenMappings.$EnumSwitchMapping$0[textureType.ordinal()];
        if (i == 1) {
            return Texture.InternalFormat.SRGB8_A8;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Texture.InternalFormat.RGBA8;
    }

    @NotNull
    public static final Texture loadTexture(@NotNull Engine engine, @NotNull Resources resources, int i, @NotNull TextureType textureType) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(textureType, "type");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = textureType == TextureType.COLOR;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i, options);
        Texture textureBuild = new Texture.Builder().width(bitmapDecodeResource.getWidth()).height(bitmapDecodeResource.getHeight()).sampler(Texture.Sampler.SAMPLER_2D).format(internalFormat(textureType)).levels(255).build(engine);
        Intrinsics.checkNotNullExpressionValue(textureBuild, "Builder()\n            .w…           .build(engine)");
        TextureHelper.setBitmap(engine, textureBuild, 0, bitmapDecodeResource);
        textureBuild.generateMipmaps(engine);
        return textureBuild;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Texture.Type type(Bitmap bitmap) {
        String strName = bitmap.getConfig().name();
        switch (strName.hashCode()) {
            case -189895305:
                if (strName.equals("ALPHA_8")) {
                    return Texture.Type.USHORT;
                }
                break;
            case 223337875:
                if (strName.equals("ARGB_8888")) {
                    return Texture.Type.UBYTE;
                }
                break;
            case 1717230432:
                if (strName.equals("RGBA_F16")) {
                    return Texture.Type.HALF;
                }
                break;
            case 1857362722:
                if (strName.equals("RGB_565")) {
                    return Texture.Type.USHORT_565;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported bitmap configuration");
    }
}
