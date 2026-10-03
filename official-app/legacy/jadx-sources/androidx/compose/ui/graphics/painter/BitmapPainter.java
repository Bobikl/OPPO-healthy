package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.heytap.sports.home.compose.SportsKeepListComposeKt;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0013\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J%\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\f\u0010'\u001a\u00020(*\u00020)H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010\r\u001a\u00020\u000eX\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", c8l.IMAGE_KEY, "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "I", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "size", "J", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "validateSize", "validateSize-N5eqBDc", "(JJ)J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BitmapPainter extends Painter {
    private float alpha;

    @Nullable
    private ColorFilter colorFilter;
    private int filterQuality;

    @NotNull
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j2, j3);
    }

    /* JADX INFO: renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m2220validateSizeN5eqBDc(long srcOffset, long srcSize) {
        if (IntOffset.m4222getXimpl(srcOffset) >= 0 && IntOffset.m4223getYimpl(srcOffset) >= 0 && IntSize.m4264getWidthimpl(srcSize) >= 0 && IntSize.m4263getHeightimpl(srcSize) >= 0 && IntSize.m4264getWidthimpl(srcSize) <= this.image.getWidth() && IntSize.m4263getHeightimpl(srcSize) <= this.image.getHeight()) {
            return srcSize;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return Intrinsics.areEqual(this.image, bitmapPainter.image) && IntOffset.m4221equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m4262equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m1708equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name and from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo2222getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m4274toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m4224hashCodeimpl(this.srcOffset)) * 31) + IntSize.m4265hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m1709hashCodeimpl(this.filterQuality);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        DrawScope.m2137drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSizeKt.IntSize(MathKt__MathJVMKt.roundToInt(Size.m1449getWidthimpl(drawScope.mo2153getSizeNHjbRc())), MathKt__MathJVMKt.roundToInt(Size.m1446getHeightimpl(drawScope.mo2153getSizeNHjbRc()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, SportsKeepListComposeKt.IMG_DEFAULT_WIDTH, null);
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m2223setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m4229toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m4267toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m1710toStringimpl(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.INSTANCE.m4232getZeronOccac() : j2, (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j2, long j3) {
        this.image = imageBitmap;
        this.srcOffset = j2;
        this.srcSize = j3;
        this.filterQuality = FilterQuality.INSTANCE.m1713getLowfv9h1I();
        this.size = m2220validateSizeN5eqBDc(j2, j3);
        this.alpha = 1.0f;
    }
}
