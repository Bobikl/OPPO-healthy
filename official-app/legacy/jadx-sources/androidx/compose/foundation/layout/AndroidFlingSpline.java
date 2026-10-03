package androidx.compose.foundation.layout;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", ClickApiEntity.TIME, "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n25#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n684#1:709,3\n*E\n"})
final class AndroidFlingSpline {
    private static final int NbSamples = 100;

    @NotNull
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    @NotNull
    private static final float[] SplinePositions = new float[101];

    @NotNull
    private static final float[] SplineTimes = new float[101];

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n34#2:709\n41#2:710\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n701#1:709\n706#1:710\n*E\n"})
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j2) {
            this.packedValue = j2;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m361boximpl(long j2) {
            return new FlingResult(j2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m362constructorimpl(long j2) {
            return j2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m363equalsimpl(long j2, Object obj) {
            return (obj instanceof FlingResult) && j2 == ((FlingResult) obj).getPackedValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m364equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* JADX INFO: renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m365getDistanceCoefficientimpl(long j2) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j2 >> 32));
        }

        /* JADX INFO: renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m366getVelocityCoefficientimpl(long j2) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m367hashCodeimpl(long j2) {
            return Long.hashCode(j2);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m368toStringimpl(long j2) {
            return "FlingResult(packedValue=" + j2 + ')';
        }

        public boolean equals(Object obj) {
            return m363equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m367hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m368toStringimpl(this.packedValue);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f11 = i / 100;
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                if (Math.abs(f13 - f11) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            SplinePositions[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (Math.abs(f16 - f11) >= 1.0E-5d) {
                    if (f16 > f11) {
                        f15 = f5;
                    } else {
                        f10 = f5;
                    }
                    f14 = 0.5f;
                }
            }
            SplineTimes[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }

    /* JADX INFO: renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m360flingPositionLfoxSSI(float time) {
        float f;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * time);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = SplinePositions;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            f = f6 + ((time - f4) * f2);
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        return FlingResult.m362constructorimpl((((long) Float.floatToIntBits(f)) << 32) | (((long) Float.floatToIntBits(f2)) & 4294967295L));
    }
}
