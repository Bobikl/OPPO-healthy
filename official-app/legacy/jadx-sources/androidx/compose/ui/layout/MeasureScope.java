package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", ParserTag.CHILD_LAYOUT, "Landroidx/compose/ui/layout/MeasureResult;", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MeasureScope extends IntrinsicMeasureScope {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i, int i2, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return MeasureScope.super.layout(i, i2, alignmentLines, placementBlock);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3160roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo306roundToPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3161roundToPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo307roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3162toDpGaN1DYA(@NotNull MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo308toDpGaN1DYA(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3163toDpu2uoSUM(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo309toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3165toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo311toDpSizekrfVVM(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3166toPxR2X_6o(@NotNull MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo312toPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3167toPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo313toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return MeasureScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3168toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo314toSizeXkaWNTQ(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3169toSp0xMU5do(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo315toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3170toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f) {
            return MeasureScope.super.mo316toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3164toDpu2uoSUM(@NotNull MeasureScope measureScope, int i) {
            return MeasureScope.super.mo310toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3171toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i) {
            return MeasureScope.super.mo317toSpkPz2Gy4(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        return measureScope.layout(i, i2, map, function1);
    }

    @NotNull
    default MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return new MeasureResult(width, height, alignmentLines, this, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            final /* synthetic */ int $width;

            @NotNull
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$width = width;
                this.this$0 = this;
                this.$placementBlock = placementBlock;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                int i = this.$width;
                LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                MeasureScope measureScope = this.this$0;
                LookaheadCapablePlaceable lookaheadCapablePlaceable = measureScope instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope : null;
                Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
                Placeable.PlacementScope.parentWidth = i;
                Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(lookaheadCapablePlaceable);
                function1.invoke(companion);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                }
                Placeable.PlacementScope.parentWidth = parentWidth;
                Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                Placeable.PlacementScope._coordinates = layoutCoordinates;
                Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
            }
        };
    }
}
