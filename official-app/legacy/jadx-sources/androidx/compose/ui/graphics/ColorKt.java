package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.oplus.aiunit.vision.xnl;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.ULong;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,659:1\n587#1:660\n587#1:661\n587#1:662\n646#1:663\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:660\n568#1:661\n569#1:662\n658#1:663\n*E\n"})
public final class ColorKt {
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    @Stable
    public static final long Color(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        boolean z;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (f <= colorSpace.getMaxValue(0) && colorSpace.getMinValue(0) <= f) {
            if (f2 <= colorSpace.getMaxValue(1) && colorSpace.getMinValue(1) <= f2) {
                if (f3 <= colorSpace.getMaxValue(2) && colorSpace.getMinValue(2) <= f3) {
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            if (colorSpace.getIsSrgb()) {
                return Color.m1614constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
            }
            if (!(colorSpace.getComponentCount() == 3)) {
                throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
            }
            int id$ui_graphics_release = colorSpace.getId();
            if (!(id$ui_graphics_release != -1)) {
                throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
            }
            return Color.m1614constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(Float16.m1721constructorimpl(f2)) & xnl.PAYLOAD_SHORT_MAX) << 32) | ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(Float16.m1721constructorimpl(f)) & xnl.PAYLOAD_SHORT_MAX) << 48)) | ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(Float16.m1721constructorimpl(f3)) & xnl.PAYLOAD_SHORT_MAX) << 16)) | ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m5461constructorimpl(ULong.m5461constructorimpl(id$ui_graphics_release) & 63)));
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1663compositeOverOWjLjI(long j2, long j3) {
        long jM1615convertvNxB06k = Color.m1615convertvNxB06k(j2, Color.m1622getColorSpaceimpl(j3));
        float fM1620getAlphaimpl = Color.m1620getAlphaimpl(j3);
        float fM1620getAlphaimpl2 = Color.m1620getAlphaimpl(jM1615convertvNxB06k);
        float f = 1.0f - fM1620getAlphaimpl2;
        float f2 = (fM1620getAlphaimpl * f) + fM1620getAlphaimpl2;
        return Color((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m1624getRedimpl(jM1615convertvNxB06k) * fM1620getAlphaimpl2) + ((Color.m1624getRedimpl(j3) * fM1620getAlphaimpl) * f)) / f2, (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m1623getGreenimpl(jM1615convertvNxB06k) * fM1620getAlphaimpl2) + ((Color.m1623getGreenimpl(j3) * fM1620getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m1621getBlueimpl(jM1615convertvNxB06k) * fM1620getAlphaimpl2) + ((Color.m1621getBlueimpl(j3) * fM1620getAlphaimpl) * f)) / f2, f2, Color.m1622getColorSpaceimpl(j3));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m1664getComponents8_81llA(long j2) {
        return new float[]{Color.m1624getRedimpl(j2), Color.m1623getGreenimpl(j2), Color.m1621getBlueimpl(j2), Color.m1620getAlphaimpl(j2)};
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m1665isSpecified8_81llA(long j2) {
        return j2 != Color.INSTANCE.m1654getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1666isSpecified8_81llA$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m1667isUnspecified8_81llA(long j2) {
        return j2 == Color.INSTANCE.m1654getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1668isUnspecified8_81llA$annotations(long j2) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m1669lerpjxsXWHM(long j2, long j3, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM1615convertvNxB06k = Color.m1615convertvNxB06k(j2, oklab);
        long jM1615convertvNxB06k2 = Color.m1615convertvNxB06k(j3, oklab);
        float fM1620getAlphaimpl = Color.m1620getAlphaimpl(jM1615convertvNxB06k);
        float fM1624getRedimpl = Color.m1624getRedimpl(jM1615convertvNxB06k);
        float fM1623getGreenimpl = Color.m1623getGreenimpl(jM1615convertvNxB06k);
        float fM1621getBlueimpl = Color.m1621getBlueimpl(jM1615convertvNxB06k);
        float fM1620getAlphaimpl2 = Color.m1620getAlphaimpl(jM1615convertvNxB06k2);
        float fM1624getRedimpl2 = Color.m1624getRedimpl(jM1615convertvNxB06k2);
        float fM1623getGreenimpl2 = Color.m1623getGreenimpl(jM1615convertvNxB06k2);
        float fM1621getBlueimpl2 = Color.m1621getBlueimpl(jM1615convertvNxB06k2);
        return Color.m1615convertvNxB06k(Color(MathHelpersKt.lerp(fM1624getRedimpl, fM1624getRedimpl2, f), MathHelpersKt.lerp(fM1623getGreenimpl, fM1623getGreenimpl2, f), MathHelpersKt.lerp(fM1621getBlueimpl, fM1621getBlueimpl2, f), MathHelpersKt.lerp(fM1620getAlphaimpl, fM1620getAlphaimpl2, f), oklab), Color.m1622getColorSpaceimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m1670luminance8_81llA(long j2) {
        ColorSpace colorSpaceM1622getColorSpaceimpl = Color.m1622getColorSpaceimpl(j2);
        if (!ColorModel.m2015equalsimpl0(colorSpaceM1622getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m2022getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m2018toStringimpl(colorSpaceM1622getColorSpaceimpl.getModel()))).toString());
        }
        Intrinsics.checkNotNull(colorSpaceM1622getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM1622getColorSpaceimpl).getEotfFunc();
        return saturate((float) ((eotfFunc$ui_graphics_release.invoke(Color.m1624getRedimpl(j2)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m1623getGreenimpl(j2)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m1621getBlueimpl(j2)) * 0.0722d)));
    }

    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m1671takeOrElseDxMtmZc(long j2, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > Color.INSTANCE.m1654getUnspecified0d7_KjU() ? 1 : (j2 == Color.INSTANCE.m1654getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j2 : block.invoke().m1628unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m1672toArgb8_81llA(long j2) {
        return (int) ULong.m5461constructorimpl(Color.m1615convertvNxB06k(j2, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m1614constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j2) {
        return Color.m1614constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(ULong.m5461constructorimpl(j2) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
