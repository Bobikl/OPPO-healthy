package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0006*\u00020\u0011H\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidImageBitmap_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m1489ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        m1490toBitmapConfig1JJdX4A(i3);
        return new AndroidImageBitmap(Api26Bitmap.m1527createBitmapx__hDU$ui_graphics_release(i, i2, i3, z, colorSpace));
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(imageBitmap, "<this>");
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    /* JADX INFO: renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m1490toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        if (ImageBitmapConfig.m1829equalsimpl0(i, companion.m1834getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m1829equalsimpl0(i, companion.m1833getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m1829equalsimpl0(i, companion.m1837getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        if (ImageBitmapConfig.m1829equalsimpl0(i, companion.m1835getF16_sVssgQ())) {
            return Bitmap.Config.RGBA_F16;
        }
        return ImageBitmapConfig.m1829equalsimpl0(i, companion.m1836getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.INSTANCE.m1833getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.INSTANCE.m1837getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.INSTANCE.m1834getArgb8888_sVssgQ();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return ImageBitmapConfig.INSTANCE.m1835getF16_sVssgQ();
        }
        return config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.INSTANCE.m1836getGpu_sVssgQ() : ImageBitmapConfig.INSTANCE.m1834getArgb8888_sVssgQ();
    }
}
