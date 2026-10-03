package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0001\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0001*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", c8l.IMAGE_KEY, "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_TO, ParserTag.TAG_COLORS, "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
public final class AndroidShader_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m1520ActualImageShaderF49vj9s(@NotNull ImageBitmap image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m1525toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m1525toAndroidTileMode0vamqd0(i2));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m1521ActualLinearGradientShaderVjE6UOU(long j2, long j3, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m1380getXimpl(j2), Offset.m1381getYimpl(j2), Offset.m1380getXimpl(j3), Offset.m1381getYimpl(j3), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m1525toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m1522ActualRadialGradientShader8uybcMk(long j2, float f, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m1380getXimpl(j2), Offset.m1381getYimpl(j2), f, makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m1525toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m1523ActualSweepGradientShader9KIMszo(long j2, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m1380getXimpl(j2), Offset.m1381getYimpl(j2), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return 0;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> colors, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int size = colors.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m1672toArgb8_81llA(colors.get(i2).m1628unboximpl());
        }
        return iArr;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> colors, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list != null) {
                return CollectionsKt___CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex; i3++) {
            long jM1628unboximpl = colors.get(i3).m1628unboximpl();
            float fFloatValue = list != null ? list.get(i3).floatValue() : i3 / CollectionsKt__CollectionsKt.getLastIndex(colors);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (Color.m1620getAlphaimpl(jM1628unboximpl) == 0.0f) {
                i2 = i4 + 1;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(CollectionsKt__CollectionsKt.getLastIndex(colors)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
