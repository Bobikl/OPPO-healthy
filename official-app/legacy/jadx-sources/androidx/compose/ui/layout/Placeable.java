package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0019\u0010\"\u001a\u0015\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e\u0018\u00010#¢\u0006\u0002\b%H$ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u001eH\u0002R\u001d\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u0013R\u001e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "apparentToRealOffset", "Landroidx/compose/ui/unit/IntOffset;", "getApparentToRealOffset-nOcc-ac", "()J", "<set-?>", "", Fields.HEIGHT_FIELD, "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "J", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", Fields.WIDTH_FIELD, "getWidth", "placeAt", "", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "recalculateWidthAndHeight", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private int width;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u0016JJ\u0010\u001b\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u001b\b\b\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001d¢\u0006\u0002\b\u001fH\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!JJ\u0010\"\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u001b\b\b\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001d¢\u0006\u0002\b\u001fH\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010!J)\u0010$\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0018J$\u0010$\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u0016JD\u0010&\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0002\b\u001fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010!J?\u0010&\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0002\b\u001fJD\u0010(\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0002\b\u001fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010!J?\u0010(\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0002\b\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates$annotations", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,421:1\n318#1,2:422\n335#1:424\n336#1:426\n321#1,2:427\n335#1,2:429\n327#1:431\n318#1,2:432\n335#1:434\n336#1:436\n321#1,2:437\n335#1,2:439\n327#1:441\n335#1:442\n336#1:444\n335#1:445\n336#1:447\n318#1,2:448\n335#1:450\n336#1:452\n321#1,2:453\n335#1,2:455\n327#1:457\n318#1,2:458\n335#1:460\n336#1:462\n321#1,2:463\n335#1,2:465\n327#1:467\n335#1:468\n336#1:470\n335#1:471\n336#1:473\n335#1:474\n336#1:476\n335#1:477\n336#1:479\n86#2:425\n86#2:435\n86#2:443\n86#2:446\n86#2:451\n86#2:461\n86#2:469\n86#2:472\n86#2:475\n86#2:478\n86#2:480\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n184#1:422,2\n184#1:424\n184#1:426\n184#1:427,2\n184#1:429,2\n184#1:431\n200#1:432,2\n200#1:434\n200#1:436\n200#1:437,2\n200#1:439,2\n200#1:441\n212#1:442\n212#1:444\n224#1:445\n224#1:447\n247#1:448,2\n247#1:450\n247#1:452\n247#1:453,2\n247#1:455,2\n247#1:457\n271#1:458,2\n271#1:460\n271#1:462\n271#1:463,2\n271#1:465,2\n271#1:467\n291#1:468\n291#1:470\n310#1:471\n310#1:473\n319#1:474\n319#1:476\n321#1:477\n321#1:479\n184#1:425\n200#1:435\n212#1:443\n224#1:446\n247#1:451\n271#1:461\n291#1:469\n310#1:472\n319#1:475\n321#1:478\n335#1:480\n*E\n"})
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        @Nullable
        private static LayoutCoordinates _coordinates;

        @Nullable
        private static LayoutNodeLayoutDelegate layoutDelegate;
        private static int parentWidth;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002JA\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0019\b\u0004\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190\u001c¢\u0006\u0002\b\u001dH\u0086\bø\u0001\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "()V", "_coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getCoordinates$annotations", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "parentWidth", "getParentWidth", "()I", "configureForPlacingForAlignment", "", "scope", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "executeWithRtlMirroringValues", "", "lookaheadCapablePlaceable", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean configureForPlacingForAlignment(LookaheadCapablePlaceable scope) {
                boolean z = false;
                if (scope == null) {
                    PlacementScope._coordinates = null;
                    PlacementScope.layoutDelegate = null;
                    return false;
                }
                boolean zIsPlacingForAlignment$ui_release = scope.getIsPlacingForAlignment();
                LookaheadCapablePlaceable parent = scope.getParent();
                if (parent != null && parent.getIsPlacingForAlignment()) {
                    z = true;
                }
                if (z) {
                    scope.setPlacingForAlignment$ui_release(true);
                }
                PlacementScope.layoutDelegate = scope.getLayoutNode().getLayoutDelegate();
                if (scope.getIsPlacingForAlignment() || scope.getIsShallowPlacing()) {
                    PlacementScope._coordinates = null;
                } else {
                    PlacementScope._coordinates = scope.getCoordinates();
                }
                return zIsPlacingForAlignment$ui_release;
            }

            @ExperimentalComposeUiApi
            public static /* synthetic */ void getCoordinates$annotations() {
            }

            public final void executeWithRtlMirroringValues(int parentWidth, @NotNull LayoutDirection parentLayoutDirection, @Nullable LookaheadCapablePlaceable lookaheadCapablePlaceable, @NotNull Function1<? super PlacementScope, Unit> block) {
                Intrinsics.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(block, "block");
                LayoutCoordinates layoutCoordinates = PlacementScope._coordinates;
                Companion companion = PlacementScope.INSTANCE;
                int parentWidth2 = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.layoutDelegate;
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
                boolean zConfigureForPlacingForAlignment = configureForPlacingForAlignment(lookaheadCapablePlaceable);
                block.invoke(this);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                }
                PlacementScope.parentWidth = parentWidth2;
                PlacementScope.parentLayoutDirection = parentLayoutDirection2;
                PlacementScope._coordinates = layoutCoordinates;
                PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @Nullable
            public LayoutCoordinates getCoordinates() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.layoutDelegate;
                if (layoutNodeLayoutDelegate != null) {
                    layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(true);
                }
                return PlacementScope._coordinates;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }

            private Companion() {
            }
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCoordinates$annotations() {
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3180place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m3184place70tqf50(placeable, j2, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3181placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m3187placeRelative70tqf50(placeable, j2, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3182placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3188placeRelativeWithLayeraW9wM(placeable, j2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3183placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3189placeWithLayeraW9wM(placeable, j2, f2, function1);
        }

        @ExperimentalComposeUiApi
        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            long jM3175getApparentToRealOffsetnOccac = placeable.m3175getApparentToRealOffsetnOccac();
            placeable.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m3184place70tqf50(@NotNull Placeable place, long j2, float f) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long jM3175getApparentToRealOffsetnOccac = place.m3175getApparentToRealOffsetnOccac();
            place.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(j2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(j2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, null);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3185placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeApparentToRealOffset, long j2, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long jM3175getApparentToRealOffsetnOccac = placeApparentToRealOffset.m3175getApparentToRealOffsetnOccac();
            placeApparentToRealOffset.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(j2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(j2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, function1);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3186placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeAutoMirrored, long j2, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeAutoMirrored, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3175getApparentToRealOffsetnOccac = placeAutoMirrored.m3175getApparentToRealOffsetnOccac();
                placeAutoMirrored.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(j2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(j2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeAutoMirrored.getWidth()) - IntOffset.m4222getXimpl(j2), IntOffset.m4223getYimpl(j2));
                long jM3175getApparentToRealOffsetnOccac2 = placeAutoMirrored.m3175getApparentToRealOffsetnOccac();
                placeAutoMirrored.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac2), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac2)), f, function1);
            }
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3175getApparentToRealOffsetnOccac = placeable.m3175getApparentToRealOffsetnOccac();
                placeable.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m4222getXimpl(jIntOffset), IntOffset.m4223getYimpl(jIntOffset));
                long jM3175getApparentToRealOffsetnOccac2 = placeable.m3175getApparentToRealOffsetnOccac();
                placeable.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac2), IntOffset.m4223getYimpl(jIntOffset2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac2)), f, null);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m3187placeRelative70tqf50(@NotNull Placeable placeRelative, long j2, float f) {
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3175getApparentToRealOffsetnOccac = placeRelative.m3175getApparentToRealOffsetnOccac();
                placeRelative.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(j2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(j2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelative.getWidth()) - IntOffset.m4222getXimpl(j2), IntOffset.m4223getYimpl(j2));
                long jM3175getApparentToRealOffsetnOccac2 = placeRelative.m3175getApparentToRealOffsetnOccac();
                placeRelative.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac2), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac2)), f, null);
            }
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3175getApparentToRealOffsetnOccac = placeable.m3175getApparentToRealOffsetnOccac();
                placeable.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, layerBlock);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m4222getXimpl(jIntOffset), IntOffset.m4223getYimpl(jIntOffset));
                long jM3175getApparentToRealOffsetnOccac2 = placeable.m3175getApparentToRealOffsetnOccac();
                placeable.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac2), IntOffset.m4223getYimpl(jIntOffset2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac2)), f, layerBlock);
            }
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3188placeRelativeWithLayeraW9wM(@NotNull Placeable placeRelativeWithLayer, long j2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM3175getApparentToRealOffsetnOccac = placeRelativeWithLayer.m3175getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(j2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(j2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, layerBlock);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelativeWithLayer.getWidth()) - IntOffset.m4222getXimpl(j2), IntOffset.m4223getYimpl(j2));
                long jM3175getApparentToRealOffsetnOccac2 = placeRelativeWithLayer.m3175getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac2), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac2)), f, layerBlock);
            }
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            long jM3175getApparentToRealOffsetnOccac = placeable.m3175getApparentToRealOffsetnOccac();
            placeable.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(jIntOffset) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(jIntOffset) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, layerBlock);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3189placeWithLayeraW9wM(@NotNull Placeable placeWithLayer, long j2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jM3175getApparentToRealOffsetnOccac = placeWithLayer.m3175getApparentToRealOffsetnOccac();
            placeWithLayer.mo3133placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m4222getXimpl(j2) + IntOffset.m4222getXimpl(jM3175getApparentToRealOffsetnOccac), IntOffset.m4223getYimpl(j2) + IntOffset.m4223getYimpl(jM3175getApparentToRealOffsetnOccac)), f, layerBlock);
        }
    }

    private final void recalculateWidthAndHeight() {
        this.width = RangesKt___RangesKt.coerceIn(IntSize.m4264getWidthimpl(this.measuredSize), Constraints.m4062getMinWidthimpl(this.measurementConstraints), Constraints.m4060getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt___RangesKt.coerceIn(IntSize.m4263getHeightimpl(this.measuredSize), Constraints.m4061getMinHeightimpl(this.measurementConstraints), Constraints.m4059getMaxHeightimpl(this.measurementConstraints));
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m3175getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m4264getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m4263getHeightimpl(this.measuredSize)) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m4263getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m4264getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo3133placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m3178setMeasuredSizeozmzZPI(long j2) {
        if (IntSize.m4262equalsimpl0(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m3179setMeasurementConstraintsBRTryo0(long j2) {
        if (Constraints.m4053equalsimpl0(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        recalculateWidthAndHeight();
    }
}
