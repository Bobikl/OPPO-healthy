package androidx.compose.ui.graphics;

import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0018\u0010\t\u001a\u00020\n*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0010*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u0011\u001a\u00020\u0012*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u0013\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u0016*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u0017\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a%\u0010\u001b\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001a\u0010#\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010$H\u0000\u001a%\u0010%\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\rH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001f\u001a\u001a\u0010'\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010(H\u0000\u001a \u0010)\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u000e\u0010\u0019\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0000\u001a%\u0010,\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0010H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001f\u001a%\u0010.\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0012H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a\u0018\u00100\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0018\u00101\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a%\u00102\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001a\n\u00104\u001a\u00020\u0001*\u00020\u0003*\n\u00105\"\u00020\u00032\u00020\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Paint", "Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "Landroid/graphics/Paint;", "getNativeAlpha", "", "Landroidx/compose/ui/graphics/NativePaint;", "getNativeAntiAlias", "", "getNativeColor", "Landroidx/compose/ui/graphics/Color;", "(Landroid/graphics/Paint;)J", "getNativeFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "(Landroid/graphics/Paint;)I", "getNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeMiterLimit", "getNativeStrokeWidth", "getNativeStyle", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeAlpha", "", "value", "setNativeAntiAlias", "setNativeBlendMode", "mode", "Landroidx/compose/ui/graphics/BlendMode;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeColor", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "setNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativePathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "setNativeShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeMiterLimit", "setNativeStrokeWidth", "setNativeStyle", "setNativeStyle--5YerkU", "toComposePaint", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidPaint_androidKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[android.graphics.Paint.Style.values().length];
            try {
                iArr[android.graphics.Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[android.graphics.Paint.Cap.values().length];
            try {
                iArr2[android.graphics.Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[android.graphics.Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[android.graphics.Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[android.graphics.Paint.Join.values().length];
            try {
                iArr3[android.graphics.Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[android.graphics.Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[android.graphics.Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m1715getNonefv9h1I() : FilterQuality.INSTANCE.m1713getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        android.graphics.Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return StrokeCap.INSTANCE.m1961getButtKaPHkGw();
        }
        if (i != 2) {
            return i != 3 ? StrokeCap.INSTANCE.m1961getButtKaPHkGw() : StrokeCap.INSTANCE.m1963getSquareKaPHkGw();
        }
        return StrokeCap.INSTANCE.m1962getRoundKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        android.graphics.Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return StrokeJoin.INSTANCE.m1972getMiterLxFBmk8();
        }
        if (i != 2) {
            return i != 3 ? StrokeJoin.INSTANCE.m1972getMiterLxFBmk8() : StrokeJoin.INSTANCE.m1973getRoundLxFBmk8();
        }
        return StrokeJoin.INSTANCE.m1971getBevelLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        android.graphics.Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m1879getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m1878getFillTiuSbCo();
    }

    @NotNull
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(@NotNull android.graphics.Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(@NotNull android.graphics.Paint paint, boolean z) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAntiAlias(z);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m1505setNativeBlendModeGB0RdKg(@NotNull android.graphics.Paint setNativeBlendMode, int i) {
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        WrapperVerificationHelperMethods.INSTANCE.m2011setBlendModeGB0RdKg(setNativeBlendMode, i);
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m1506setNativeColor4WTKRHQ(@NotNull android.graphics.Paint setNativeColor, long j2) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(ColorKt.m1672toArgb8_81llA(j2));
    }

    public static final void setNativeColorFilter(@NotNull android.graphics.Paint paint, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m1507setNativeFilterQuality50PEsBU(@NotNull android.graphics.Paint setNativeFilterQuality, int i) {
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!FilterQuality.m1708equalsimpl0(i, FilterQuality.INSTANCE.m1715getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@NotNull android.graphics.Paint paint, @Nullable PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@NotNull android.graphics.Paint paint, @Nullable Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m1508setNativeStrokeCapCSYIeUk(@NotNull android.graphics.Paint setNativeStrokeCap, int i) {
        android.graphics.Paint.Cap cap;
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        if (StrokeCap.m1957equalsimpl0(i, companion.m1963getSquareKaPHkGw())) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else if (StrokeCap.m1957equalsimpl0(i, companion.m1962getRoundKaPHkGw())) {
            cap = android.graphics.Paint.Cap.ROUND;
        } else {
            cap = StrokeCap.m1957equalsimpl0(i, companion.m1961getButtKaPHkGw()) ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m1509setNativeStrokeJoinkLtJ_vA(@NotNull android.graphics.Paint setNativeStrokeJoin, int i) {
        android.graphics.Paint.Join join;
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        if (StrokeJoin.m1967equalsimpl0(i, companion.m1972getMiterLxFBmk8())) {
            join = android.graphics.Paint.Join.MITER;
        } else if (StrokeJoin.m1967equalsimpl0(i, companion.m1971getBevelLxFBmk8())) {
            join = android.graphics.Paint.Join.BEVEL;
        } else {
            join = StrokeJoin.m1967equalsimpl0(i, companion.m1973getRoundLxFBmk8()) ? android.graphics.Paint.Join.ROUND : android.graphics.Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(@NotNull android.graphics.Paint paint, float f) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m1510setNativeStyle5YerkU(@NotNull android.graphics.Paint setNativeStyle, int i) {
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(PaintingStyle.m1874equalsimpl0(i, PaintingStyle.INSTANCE.m1879getStrokeTiuSbCo()) ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    @NotNull
    public static final Paint toComposePaint(@NotNull android.graphics.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return new AndroidPaint(paint);
    }
}
