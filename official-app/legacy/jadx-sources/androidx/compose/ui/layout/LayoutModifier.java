package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J)\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", Fields.WIDTH_FIELD, "maxIntrinsicWidth", Fields.HEIGHT_FIELD, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LayoutModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull LayoutModifier layoutModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return LayoutModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull LayoutModifier layoutModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return LayoutModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull LayoutModifier layoutModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) LayoutModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull LayoutModifier layoutModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) LayoutModifier.super.foldOut(r, operation);
        }

        @Deprecated
        public static int maxIntrinsicHeight(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.maxIntrinsicHeight(receiver, measurable, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.maxIntrinsicWidth(receiver, measurable, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.minIntrinsicHeight(receiver, measurable, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.minIntrinsicWidth(receiver, measurable, i);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull LayoutModifier layoutModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return LayoutModifier.super.then(other);
        }
    }

    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxHeight$ui_release(this, intrinsicMeasureScope, measurable, i);
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxWidth$ui_release(this, intrinsicMeasureScope, measurable, i);
    }

    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo22measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minHeight$ui_release(this, intrinsicMeasureScope, measurable, i);
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minWidth$ui_release(this, intrinsicMeasureScope, measurable, i);
    }
}
