package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle;", "", Const.Arguments.Open.STYLE, "Landroidx/constraintlayout/core/state/State$Chain;", "Landroidx/constraintlayout/compose/SolverChain;", "bias", "", "(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V", "getBias$compose_release", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStyle$compose_release", "()Landroidx/constraintlayout/core/state/State$Chain;", "Companion", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChainStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final ChainStyle Packed;

    @NotNull
    private static final ChainStyle Spread;

    @NotNull
    private static final ChainStyle SpreadInside;

    @Nullable
    private final Float bias;

    @NotNull
    private final androidx.constraintlayout.core.state.State.Chain style;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/ChainStyle$Companion;", "", "()V", "Packed", "Landroidx/constraintlayout/compose/ChainStyle;", "getPacked$annotations", "getPacked", "()Landroidx/constraintlayout/compose/ChainStyle;", "Spread", "getSpread$annotations", "getSpread", "SpreadInside", "getSpreadInside$annotations", "getSpreadInside", "bias", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getPacked$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpread$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpreadInside$annotations() {
        }

        @Stable
        @NotNull
        public final ChainStyle Packed(float bias) {
            return new ChainStyle(androidx.constraintlayout.core.state.State.Chain.PACKED, Float.valueOf(bias));
        }

        @NotNull
        public final ChainStyle getPacked() {
            return ChainStyle.Packed;
        }

        @NotNull
        public final ChainStyle getSpread() {
            return ChainStyle.Spread;
        }

        @NotNull
        public final ChainStyle getSpreadInside() {
            return ChainStyle.SpreadInside;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        int i = 2;
        Spread = new ChainStyle(androidx.constraintlayout.core.state.State.Chain.SPREAD, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        SpreadInside = new ChainStyle(androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Packed = companion.Packed(0.5f);
    }

    public ChainStyle(@NotNull androidx.constraintlayout.core.state.State.Chain style, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.style = style;
        this.bias = f;
    }

    @Nullable
    /* JADX INFO: renamed from: getBias$compose_release, reason: from getter */
    public final Float getBias() {
        return this.bias;
    }

    @NotNull
    /* JADX INFO: renamed from: getStyle$compose_release, reason: from getter */
    public final androidx.constraintlayout.core.state.State.Chain getStyle() {
        return this.style;
    }

    public /* synthetic */ ChainStyle(androidx.constraintlayout.core.state.State.Chain chain, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chain, (i & 2) != 0 ? null : f);
    }
}
