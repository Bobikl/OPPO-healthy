package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a,\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,178:1\n37#1:179\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:179\n*E\n"})
public final class DrawTransformKt {
    public static final void inset(@NotNull DrawTransform drawTransform, float f, float f2) {
        Intrinsics.checkNotNullParameter(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m2212rotateRad0AR0LA0(@NotNull DrawTransform rotateRad, float f, long j2) {
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        rotateRad.mo2084rotateUv8p0NA(DegreesKt.degrees(f), j2);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m2213rotateRad0AR0LA0$default(DrawTransform rotateRad, float f, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = rotateRad.mo2082getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        rotateRad.mo2084rotateUv8p0NA(DegreesKt.degrees(f), j2);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m2214scale0AR0LA0(@NotNull DrawTransform scale, float f, long j2) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        scale.mo2085scale0AR0LA0(f, f, j2);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m2215scale0AR0LA0$default(DrawTransform scale, float f, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = scale.mo2082getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        scale.mo2085scale0AR0LA0(f, f, j2);
    }

    public static final void inset(@NotNull DrawTransform drawTransform, float f) {
        Intrinsics.checkNotNullParameter(drawTransform, "<this>");
        drawTransform.inset(f, f, f, f);
    }
}
