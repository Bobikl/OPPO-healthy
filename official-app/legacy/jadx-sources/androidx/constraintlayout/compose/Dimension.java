package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000 \u00032\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/constraintlayout/compose/Dimension;", "", "Coercible", "Companion", "MaxCoercible", "MinCoercible", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Dimension {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Coercible extends Dimension {
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001b\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Companion;", "", "()V", "fillToConstraints", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getFillToConstraints", "()Landroidx/constraintlayout/compose/Dimension$Coercible;", "matchParent", "Landroidx/constraintlayout/compose/Dimension;", "getMatchParent", "()Landroidx/constraintlayout/compose/Dimension;", "preferredWrapContent", "getPreferredWrapContent", "wrapContent", "getWrapContent", ParserTag.TAG_PERCENT, "", "preferredValue", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "dp", "Landroidx/compose/ui/unit/Dp;", "preferredValue-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "ratio", "", "value", "value-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Coercible getFillToConstraints() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$fillToConstraints$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    androidx.constraintlayout.core.state.Dimension dimensionSuggested = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(dimensionSuggested, "Suggested(SPREAD_DIMENSION)");
                    return dimensionSuggested;
                }
            });
        }

        @NotNull
        public final Dimension getMatchParent() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$matchParent$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    androidx.constraintlayout.core.state.Dimension dimensionParent = androidx.constraintlayout.core.state.Dimension.Parent();
                    Intrinsics.checkNotNullExpressionValue(dimensionParent, "Parent()");
                    return dimensionParent;
                }
            });
        }

        @NotNull
        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$preferredWrapContent$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    androidx.constraintlayout.core.state.Dimension dimensionSuggested = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(dimensionSuggested, "Suggested(WRAP_DIMENSION)");
                    return dimensionSuggested;
                }
            });
        }

        @NotNull
        public final Dimension getWrapContent() {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$wrapContent$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    androidx.constraintlayout.core.state.Dimension dimensionFixed = androidx.constraintlayout.core.state.Dimension.Fixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(dimensionFixed, "Fixed(WRAP_DIMENSION)");
                    return dimensionFixed;
                }
            });
        }

        @NotNull
        public final Dimension percent(final float percent) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$percent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    androidx.constraintlayout.core.state.Dimension dimensionSuggested = androidx.constraintlayout.core.state.Dimension.Percent(0, percent).suggested(0);
                    Intrinsics.checkNotNullExpressionValue(dimensionSuggested, "Percent(0, percent).suggested(0)");
                    return dimensionSuggested;
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: preferredValue-0680j_4, reason: not valid java name */
        public final MinCoercible m4399preferredValue0680j_4(final float dp) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$preferredValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    androidx.constraintlayout.core.state.Dimension dimensionSuggested = androidx.constraintlayout.core.state.Dimension.Suggested(state.convertDimension(Dp.m4102boximpl(dp))).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(dimensionSuggested, "Suggested(state.convertDimension(dp)).suggested(SPREAD_DIMENSION)");
                    return dimensionSuggested;
                }
            });
        }

        @NotNull
        public final Dimension ratio(@NotNull final String ratio) {
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$ratio$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    androidx.constraintlayout.core.state.Dimension dimensionSuggested = androidx.constraintlayout.core.state.Dimension.Ratio(ratio).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                    Intrinsics.checkNotNullExpressionValue(dimensionSuggested, "Ratio(ratio).suggested(SPREAD_DIMENSION)");
                    return dimensionSuggested;
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: value-0680j_4, reason: not valid java name */
        public final Dimension m4400value0680j_4(final float dp) {
            return new DimensionDescription(new Function1<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$value$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final androidx.constraintlayout.core.state.Dimension invoke(@NotNull State state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    androidx.constraintlayout.core.state.Dimension dimensionFixed = androidx.constraintlayout.core.state.Dimension.Fixed(state.convertDimension(Dp.m4102boximpl(dp)));
                    Intrinsics.checkNotNullExpressionValue(dimensionFixed, "Fixed(state.convertDimension(dp))");
                    return dimensionFixed;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface MaxCoercible extends Dimension {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface MinCoercible extends Dimension {
    }
}
