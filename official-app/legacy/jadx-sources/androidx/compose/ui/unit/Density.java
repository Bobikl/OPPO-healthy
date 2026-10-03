package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0013\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J\f\u0010!\u001a\u00020\"*\u00020#H\u0017J\u0019\u0010$\u001a\u00020\u001b*\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0019\u0010&\u001a\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\fH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006+À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"})
public interface Density {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4090roundToPxR2X_6o(@NotNull Density density, long j2) {
            return Density.super.mo306roundToPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4091roundToPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo307roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4092toDpGaN1DYA(@NotNull Density density, long j2) {
            return Density.super.mo308toDpGaN1DYA(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4094toDpu2uoSUM(@NotNull Density density, int i) {
            return Density.super.mo310toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4095toDpSizekrfVVM(@NotNull Density density, long j2) {
            return Density.super.mo311toDpSizekrfVVM(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4096toPxR2X_6o(@NotNull Density density, long j2) {
            return Density.super.mo312toPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4097toPx0680j_4(@NotNull Density density, float f) {
            return Density.super.mo313toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4098toSizeXkaWNTQ(@NotNull Density density, long j2) {
            return Density.super.mo314toSizeXkaWNTQ(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4099toSp0xMU5do(@NotNull Density density, float f) {
            return Density.super.mo315toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4101toSpkPz2Gy4(@NotNull Density density, int i) {
            return Density.super.mo317toSpkPz2Gy4(i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4093toDpu2uoSUM(@NotNull Density density, float f) {
            return Density.super.mo309toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4100toSpkPz2Gy4(@NotNull Density density, float f) {
            return Density.super.mo316toSpkPz2Gy4(f);
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo306roundToPxR2X_6o(long j2) {
        return MathKt__MathJVMKt.roundToInt(mo312toPxR2X_6o(j2));
    }

    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo307roundToPx0680j_4(float f) {
        float fMo313toPx0680j_4 = mo313toPx0680j_4(f);
        if (Float.isInfinite(fMo313toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt__MathJVMKt.roundToInt(fMo313toPx0680j_4);
    }

    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo308toDpGaN1DYA(long j2) {
        if (TextUnitType.m4313equalsimpl0(TextUnit.m4284getTypeUIouoOA(j2), TextUnitType.INSTANCE.m4318getSpUIouoOA())) {
            return Dp.m4104constructorimpl(TextUnit.m4285getValueimpl(j2) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo310toDpu2uoSUM(int i) {
        return Dp.m4104constructorimpl(i / getDensity());
    }

    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo311toDpSizekrfVVM(long j2) {
        return (j2 > Size.INSTANCE.m1457getUnspecifiedNHjbRc() ? 1 : (j2 == Size.INSTANCE.m1457getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m4126DpSizeYgX7TsA(mo309toDpu2uoSUM(Size.m1449getWidthimpl(j2)), mo309toDpu2uoSUM(Size.m1446getHeightimpl(j2))) : DpSize.INSTANCE.m4211getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo312toPxR2X_6o(long j2) {
        if (TextUnitType.m4313equalsimpl0(TextUnit.m4284getTypeUIouoOA(j2), TextUnitType.INSTANCE.m4318getSpUIouoOA())) {
            return TextUnit.m4285getValueimpl(j2) * getFontScale() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo313toPx0680j_4(float f) {
        return f * getDensity();
    }

    @Stable
    @NotNull
    default Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(mo313toPx0680j_4(dpRect.m4187getLeftD9Ej5fM()), mo313toPx0680j_4(dpRect.m4189getTopD9Ej5fM()), mo313toPx0680j_4(dpRect.m4188getRightD9Ej5fM()), mo313toPx0680j_4(dpRect.m4186getBottomD9Ej5fM()));
    }

    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo314toSizeXkaWNTQ(long j2) {
        return (j2 > DpSize.INSTANCE.m4211getUnspecifiedMYxV2XQ() ? 1 : (j2 == DpSize.INSTANCE.m4211getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(mo313toPx0680j_4(DpSize.m4202getWidthD9Ej5fM(j2)), mo313toPx0680j_4(DpSize.m4200getHeightD9Ej5fM(j2))) : Size.INSTANCE.m1457getUnspecifiedNHjbRc();
    }

    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo315toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo317toSpkPz2Gy4(int i) {
        return TextUnitKt.getSp(i / (getFontScale() * getDensity()));
    }

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo316toSpkPz2Gy4(float f) {
        return TextUnitKt.getSp(f / (getFontScale() * getDensity()));
    }

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo309toDpu2uoSUM(float f) {
        return Dp.m4104constructorimpl(f / getDensity());
    }
}
