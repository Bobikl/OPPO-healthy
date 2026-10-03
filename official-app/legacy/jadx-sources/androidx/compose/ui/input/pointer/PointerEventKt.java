package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0007\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0007\u001a\f\u0010\n\u001a\u00020\b*\u00020\u0002H\u0007\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u0002ø\u0001\u0001¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0012\u0010\u0018\u001a\u00020\u0015*\u00020\u0002ø\u0001\u0001¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0001H\u0002ø\u0001\u0001¢\u0006\u0002\u0010\u001b\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"anyChangeConsumed", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "consumeAllChanges", "", "consumeDownChange", "consumePositionChange", "isOutOfBounds", "size", "Landroidx/compose/ui/unit/IntSize;", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "positionChange", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeConsumed", "positionChangeIgnoreConsumed", "positionChangeInternal", "ignoreConsumed", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChanged", "positionChangedIgnoreConsumed", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointerEventKt {
    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @Deprecated(message = "Use consume() instead", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        pointerInputChange.consume();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (Offset.m1377equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m1396getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m2961isOutOfBoundsO0kMr_c(@NotNull PointerInputChange isOutOfBounds, long j2) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long jM3014getPositionF1C5BW0 = isOutOfBounds.getPosition();
        float fM1380getXimpl = Offset.m1380getXimpl(jM3014getPositionF1C5BW0);
        float fM1381getYimpl = Offset.m1381getYimpl(jM3014getPositionF1C5BW0);
        return fM1380getXimpl < 0.0f || fM1380getXimpl > ((float) IntSize.m4264getWidthimpl(j2)) || fM1381getYimpl < 0.0f || fM1381getYimpl > ((float) IntSize.m4263getHeightimpl(j2));
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m2962isOutOfBoundsjwHxaWs(@NotNull PointerInputChange isOutOfBounds, long j2, long j3) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (!PointerType.m3085equalsimpl0(isOutOfBounds.getType(), PointerType.INSTANCE.m3092getTouchT8wyACA())) {
            return m2961isOutOfBoundsO0kMr_c(isOutOfBounds, j2);
        }
        long jM3014getPositionF1C5BW0 = isOutOfBounds.getPosition();
        float fM1380getXimpl = Offset.m1380getXimpl(jM3014getPositionF1C5BW0);
        float fM1381getYimpl = Offset.m1381getYimpl(jM3014getPositionF1C5BW0);
        return fM1380getXimpl < (-Size.m1449getWidthimpl(j3)) || fM1380getXimpl > ((float) IntSize.m4264getWidthimpl(j2)) + Size.m1449getWidthimpl(j3) || fM1381getYimpl < (-Size.m1446getHeightimpl(j3)) || fM1381getYimpl > ((float) IntSize.m4263getHeightimpl(j2)) + Size.m1446getHeightimpl(j3);
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, false);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long jM1384minusMKHz9U = Offset.m1384minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        return (z || !pointerInputChange.isConsumed()) ? jM1384minusMKHz9U : Offset.INSTANCE.m1396getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m1377equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.INSTANCE.m1396getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m1377equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.INSTANCE.m1396getZeroF1C5BW0());
    }
}
