package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ContentDrawScope extends DrawScope {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m2102drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap image, long j2, long j3, long j4, long j5, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            ContentDrawScope.super.mo2059drawImageAZ2fEMs(image, j2, j3, j4, j5, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2103getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo2152getCenterF1C5BW0();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2104getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo2153getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2105roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo306roundToPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2106roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo307roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2107toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo308toDpGaN1DYA(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2108toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo309toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2110toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo311toDpSizekrfVVM(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2111toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo312toPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2112toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo313toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return ContentDrawScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2113toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo314toSizeXkaWNTQ(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2114toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo315toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2115toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo316toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2109toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo310toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2116toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo317toSpkPz2Gy4(i);
        }
    }

    void drawContent();
}
