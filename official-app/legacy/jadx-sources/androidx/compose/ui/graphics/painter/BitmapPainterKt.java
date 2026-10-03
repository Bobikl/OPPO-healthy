package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", c8l.IMAGE_KEY, "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BitmapPainterKt {
    @NotNull
    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m2224BitmapPainterQZhYCtY(@NotNull ImageBitmap image, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        BitmapPainter bitmapPainter = new BitmapPainter(image, j2, j3, null);
        bitmapPainter.m2223setFilterQualityvDHp3xo$ui_graphics_release(i);
        return bitmapPainter;
    }

    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m2225BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j2, long j3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = IntOffset.INSTANCE.m4232getZeronOccac();
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            i = FilterQuality.INSTANCE.m1713getLowfv9h1I();
        }
        return m2224BitmapPainterQZhYCtY(imageBitmap, j4, j5, i);
    }
}
