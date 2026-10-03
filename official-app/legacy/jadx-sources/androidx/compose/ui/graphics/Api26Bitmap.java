package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0001¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Api26Bitmap {

    @NotNull
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap) {
        ColorSpace colorSpaceComposeColorSpace$ui_graphics_release;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (colorSpaceComposeColorSpace$ui_graphics_release = composeColorSpace$ui_graphics_release(colorSpace)) == null) ? ColorSpaces.INSTANCE.getSrgb() : colorSpaceComposeColorSpace$ui_graphics_release;
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    /* JADX INFO: renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
    public static final Bitmap m1527createBitmapx__hDU$ui_graphics_release(int width, int height, int bitmapConfig, boolean hasAlpha, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.m1490toBitmapConfig1JJdX4A(bitmapConfig), hasAlpha, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(@NotNull ColorSpace colorSpace) {
        android.graphics.ColorSpace.Named named;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            named = android.graphics.ColorSpace.Named.SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            named = android.graphics.ColorSpace.Named.ACES;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            named = android.graphics.ColorSpace.Named.ACESCG;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            named = android.graphics.ColorSpace.Named.ADOBE_RGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            named = android.graphics.ColorSpace.Named.BT2020;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            named = android.graphics.ColorSpace.Named.BT709;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            named = android.graphics.ColorSpace.Named.CIE_LAB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            named = android.graphics.ColorSpace.Named.CIE_XYZ;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            named = android.graphics.ColorSpace.Named.DCI_P3;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            named = android.graphics.ColorSpace.Named.DISPLAY_P3;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            named = android.graphics.ColorSpace.Named.EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            named = android.graphics.ColorSpace.Named.LINEAR_SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            named = android.graphics.ColorSpace.Named.NTSC_1953;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            named = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC()) ? android.graphics.ColorSpace.Named.SMPTE_C : android.graphics.ColorSpace.Named.SRGB;
        }
        android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(named);
        Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(frameworkNamedSpace)");
        return colorSpace2;
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final ColorSpace composeColorSpace$ui_graphics_release(@NotNull android.graphics.ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB))) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES))) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG))) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB))) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020))) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709))) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB))) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ))) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3))) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3))) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB))) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB))) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953))) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB))) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        return Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C)) ? ColorSpaces.INSTANCE.getSmpteC() : ColorSpaces.INSTANCE.getSrgb();
    }
}
