package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PressGestureScope extends Density {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m294roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j2) {
            return PressGestureScope.super.mo306roundToPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m295roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo307roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m296toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j2) {
            return PressGestureScope.super.mo308toDpGaN1DYA(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m297toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo309toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m299toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j2) {
            return PressGestureScope.super.mo311toDpSizekrfVVM(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m300toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j2) {
            return PressGestureScope.super.mo312toPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m301toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo313toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return PressGestureScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m302toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j2) {
            return PressGestureScope.super.mo314toSizeXkaWNTQ(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m303toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo315toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m304toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f) {
            return PressGestureScope.super.mo316toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m298toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo310toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m305toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i) {
            return PressGestureScope.super.mo317toSpkPz2Gy4(i);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
