package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(Landroid/graphics/ColorFilter;)V", "getNativeColorFilter$ui_graphics_release", "()Landroid/graphics/ColorFilter;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorFilter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final android.graphics.ColorFilter nativeColorFilter;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "()V", "colorMatrix", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "lighting", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "lighting--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m1659tintxETnrds$default(Companion companion, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.INSTANCE.m1560getSrcIn0nO6VwU();
            }
            return companion.m1662tintxETnrds(j2, i);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m1660colorMatrixjHGOpc(@NotNull float[] colorMatrix) {
            Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
            return AndroidColorFilter_androidKt.m1485actualColorMatrixColorFilterjHGOpc(colorMatrix);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m1661lightingOWjLjI(long multiply, long add) {
            return AndroidColorFilter_androidKt.m1486actualLightingColorFilterOWjLjI(multiply, add);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m1662tintxETnrds(long color, int blendMode) {
            return AndroidColorFilter_androidKt.m1487actualTintColorFilterxETnrds(color, blendMode);
        }
    }

    public ColorFilter(@NotNull android.graphics.ColorFilter nativeColorFilter) {
        Intrinsics.checkNotNullParameter(nativeColorFilter, "nativeColorFilter");
        this.nativeColorFilter = nativeColorFilter;
    }

    @NotNull
    /* JADX INFO: renamed from: getNativeColorFilter$ui_graphics_release, reason: from getter */
    public final android.graphics.ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
