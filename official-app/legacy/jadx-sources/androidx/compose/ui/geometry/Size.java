package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000bJ*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", Fields.HEIGHT_FIELD, "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", Fields.WIDTH_FIELD, "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,225:1\n34#2:226\n41#2:227\n152#3:228\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:226\n61#1:227\n138#1:228\n*E\n"})
public final class Size {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1455getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1456getZeroNHjbRc$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m1457getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m1458getZeroNHjbRc() {
            return Size.Zero;
        }
    }

    private /* synthetic */ Size(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m1437boximpl(long j2) {
        return new Size(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1438component1impl(long j2) {
        return m1449getWidthimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1439component2impl(long j2) {
        return m1446getHeightimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1440constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m1441copyxjbvk4A(long j2, float f, float f2) {
        return SizeKt.Size(f, f2);
    }

    /* JADX INFO: renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m1442copyxjbvk4A$default(long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m1449getWidthimpl(j2);
        }
        if ((i & 2) != 0) {
            f2 = m1446getHeightimpl(j2);
        }
        return m1441copyxjbvk4A(j2, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m1443div7Ah8Wj8(long j2, float f) {
        return SizeKt.Size(m1449getWidthimpl(j2) / f, m1446getHeightimpl(j2) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1444equalsimpl(long j2, Object obj) {
        return (obj instanceof Size) && j2 == ((Size) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1445equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final float m1446getHeightimpl(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* JADX INFO: renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m1447getMaxDimensionimpl(long j2) {
        return Math.max(Math.abs(m1449getWidthimpl(j2)), Math.abs(m1446getHeightimpl(j2)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* JADX INFO: renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m1448getMinDimensionimpl(long j2) {
        return Math.min(Math.abs(m1449getWidthimpl(j2)), Math.abs(m1446getHeightimpl(j2)));
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final float m1449getWidthimpl(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1450hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1451isEmptyimpl(long j2) {
        return m1449getWidthimpl(j2) <= 0.0f || m1446getHeightimpl(j2) <= 0.0f;
    }

    @Stable
    /* JADX INFO: renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m1452times7Ah8Wj8(long j2, float f) {
        return SizeKt.Size(m1449getWidthimpl(j2) * f, m1446getHeightimpl(j2) * f);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1453toStringimpl(long j2) {
        if (!(j2 != INSTANCE.m1457getUnspecifiedNHjbRc())) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(m1449getWidthimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1446getHeightimpl(j2), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m1444equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1450hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m1453toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
