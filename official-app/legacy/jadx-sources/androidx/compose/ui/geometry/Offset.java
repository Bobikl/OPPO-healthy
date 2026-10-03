package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010,J!\u0010/\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019J!\u00101\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
public final class Offset {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1391getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1392getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1393getZeroF1C5BW0$annotations() {
        }

        /* JADX INFO: renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m1394getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* JADX INFO: renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m1395getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m1396getZeroF1C5BW0() {
            return Offset.Zero;
        }
    }

    private /* synthetic */ Offset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m1369boximpl(long j2) {
        return new Offset(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1370component1impl(long j2) {
        return m1380getXimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1371component2impl(long j2) {
        return m1381getYimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1372constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m1373copydBAh8RU(long j2, float f, float f2) {
        return OffsetKt.Offset(f, f2);
    }

    /* JADX INFO: renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m1374copydBAh8RU$default(long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1380getXimpl(j2);
        }
        if ((i & 2) != 0) {
            f2 = m1381getYimpl(j2);
        }
        return m1373copydBAh8RU(j2, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m1375divtuRUvjQ(long j2, float f) {
        return OffsetKt.Offset(m1380getXimpl(j2) / f, m1381getYimpl(j2) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1376equalsimpl(long j2, Object obj) {
        return (obj instanceof Offset) && j2 == ((Offset) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1377equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m1378getDistanceimpl(long j2) {
        return (float) Math.sqrt((m1380getXimpl(j2) * m1380getXimpl(j2)) + (m1381getYimpl(j2) * m1381getYimpl(j2)));
    }

    @Stable
    /* JADX INFO: renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m1379getDistanceSquaredimpl(long j2) {
        return (m1380getXimpl(j2) * m1380getXimpl(j2)) + (m1381getYimpl(j2) * m1381getYimpl(j2));
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m1380getXimpl(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m1381getYimpl(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1382hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* JADX INFO: renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m1383isValidimpl(long j2) {
        if ((Float.isNaN(m1380getXimpl(j2)) || Float.isNaN(m1381getYimpl(j2))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* JADX INFO: renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m1384minusMKHz9U(long j2, long j3) {
        return OffsetKt.Offset(m1380getXimpl(j2) - m1380getXimpl(j3), m1381getYimpl(j2) - m1381getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m1385plusMKHz9U(long j2, long j3) {
        return OffsetKt.Offset(m1380getXimpl(j2) + m1380getXimpl(j3), m1381getYimpl(j2) + m1381getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m1386remtuRUvjQ(long j2, float f) {
        return OffsetKt.Offset(m1380getXimpl(j2) % f, m1381getYimpl(j2) % f);
    }

    @Stable
    /* JADX INFO: renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m1387timestuRUvjQ(long j2, float f) {
        return OffsetKt.Offset(m1380getXimpl(j2) * f, m1381getYimpl(j2) * f);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1388toStringimpl(long j2) {
        if (!OffsetKt.m1399isSpecifiedk4lQ0M(j2)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(m1380getXimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1381getYimpl(j2), 1) + ')';
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m1389unaryMinusF1C5BW0(long j2) {
        return OffsetKt.Offset(-m1380getXimpl(j2), -m1381getYimpl(j2));
    }

    public boolean equals(Object obj) {
        return m1376equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1382hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m1388toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
