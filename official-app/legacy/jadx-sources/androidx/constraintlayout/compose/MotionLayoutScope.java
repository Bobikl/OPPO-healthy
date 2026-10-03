package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "(Landroidx/constraintlayout/compose/MotionMeasurer;)V", "myMeasurer", "motionColor", "Landroidx/compose/ui/graphics/Color;", "id", "", "name", "motionColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "motionDistance", "Landroidx/compose/ui/unit/Dp;", "motionDistance-chRvn1I", "(Ljava/lang/String;Ljava/lang/String;)F", "motionFloat", "", "motionFontSize", "Landroidx/compose/ui/unit/TextUnit;", "motionFontSize-5XXgJZs", "motionInt", "", "motionProperties", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableState;", "tag", "MotionProperties", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MotionLayoutScope {
    public static final int $stable = 8;

    @NotNull
    private MotionMeasurer myMeasurer;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "", "id", "", "tag", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/MotionMeasurer;)V", "myId", "myMeasurer", "myTag", "", "color", "Landroidx/compose/ui/graphics/Color;", "name", "color-vNxB06k", "(Ljava/lang/String;)J", "distance", "Landroidx/compose/ui/unit/Dp;", "distance-u2uoSUM", "(Ljava/lang/String;)F", TypedValues.Custom.S_FLOAT, "", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontSize-kPz2Gy4", "int", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MotionProperties {
        public static final int $stable = 8;

        @NotNull
        private String myId;

        @NotNull
        private MotionMeasurer myMeasurer;

        @Nullable
        private Void myTag;

        public MotionProperties(@NotNull String id, @Nullable String str, @NotNull MotionMeasurer measurer) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(measurer, "measurer");
            this.myId = id;
            this.myMeasurer = measurer;
        }

        /* JADX INFO: renamed from: color-vNxB06k, reason: not valid java name */
        public final long m4429colorvNxB06k(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.myMeasurer.m4440getCustomColorWaAFU9c(this.myId, name);
        }

        /* JADX INFO: renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m4430distanceu2uoSUM(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return Dp.m4104constructorimpl(this.myMeasurer.getCustomFloat(this.myId, name));
        }

        /* JADX INFO: renamed from: float, reason: not valid java name */
        public final float m4431float(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.myMeasurer.getCustomFloat(this.myId, name);
        }

        /* JADX INFO: renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m4432fontSizekPz2Gy4(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return TextUnitKt.getSp(this.myMeasurer.getCustomFloat(this.myId, name));
        }

        @NotNull
        /* JADX INFO: renamed from: id, reason: from getter */
        public final String getMyId() {
            return this.myId;
        }

        /* JADX INFO: renamed from: int, reason: not valid java name */
        public final int m4433int(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (int) this.myMeasurer.getCustomFloat(this.myId, name);
        }

        @Nullable
        public final String tag() {
            return (String) this.myTag;
        }
    }

    @PublishedApi
    public MotionLayoutScope(@NotNull MotionMeasurer measurer) {
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        this.myMeasurer = measurer;
    }

    /* JADX INFO: renamed from: motionColor-WaAFU9c, reason: not valid java name */
    public final long m4426motionColorWaAFU9c(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.myMeasurer.m4440getCustomColorWaAFU9c(id, name);
    }

    /* JADX INFO: renamed from: motionDistance-chRvn1I, reason: not valid java name */
    public final float m4427motionDistancechRvn1I(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return Dp.m4104constructorimpl(this.myMeasurer.getCustomFloat(id, name));
    }

    public final float motionFloat(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return this.myMeasurer.getCustomFloat(id, name);
    }

    /* JADX INFO: renamed from: motionFontSize-5XXgJZs, reason: not valid java name */
    public final long m4428motionFontSize5XXgJZs(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return TextUnitKt.getSp(this.myMeasurer.getCustomFloat(id, name));
    }

    public final int motionInt(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return (int) this.myMeasurer.getCustomFloat(id, name);
    }

    @Composable
    @NotNull
    public final MutableState<MotionProperties> motionProperties(@NotNull String id, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        composer.startReplaceableGroup(-1035552373);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MotionProperties(id, null, this.myMeasurer), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState<MotionProperties> mutableState = (MutableState) objRememberedValue;
        composer.endReplaceableGroup();
        return mutableState;
    }

    @NotNull
    public final MotionProperties motionProperties(@NotNull String id, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new MotionProperties(id, tag, this.myMeasurer);
    }
}
