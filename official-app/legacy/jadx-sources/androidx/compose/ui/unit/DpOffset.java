package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR#\u0010\r\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
public final class DpOffset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m4174getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m4175getZeroRKDOV3M() {
            return DpOffset.Zero;
        }
    }

    static {
        float f = 0;
        Zero = DpKt.m4125DpOffsetYgX7TsA(Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f));
        Dp.Companion companion = Dp.INSTANCE;
        Unspecified = DpKt.m4125DpOffsetYgX7TsA(companion.m4124getUnspecifiedD9Ej5fM(), companion.m4124getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m4159boximpl(long j2) {
        return new DpOffset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4160constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m4161copytPigGR8(long j2, float f, float f2) {
        return DpKt.m4125DpOffsetYgX7TsA(f, f2);
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m4162copytPigGR8$default(long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m4165getXD9Ej5fM(j2);
        }
        if ((i & 2) != 0) {
            f2 = m4167getYD9Ej5fM(j2);
        }
        return m4161copytPigGR8(j2, f, f2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4163equalsimpl(long j2, Object obj) {
        return (obj instanceof DpOffset) && j2 == ((DpOffset) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4164equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m4165getXD9Ej5fM(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4104constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)));
    }

    @Stable
    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4166getXD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m4167getYD9Ej5fM(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4104constructorimpl(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Stable
    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4168getYD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4169hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m4170minusCBMgk4(long j2, long j3) {
        return DpKt.m4125DpOffsetYgX7TsA(Dp.m4104constructorimpl(m4165getXD9Ej5fM(j2) - m4165getXD9Ej5fM(j3)), Dp.m4104constructorimpl(m4167getYD9Ej5fM(j2) - m4167getYD9Ej5fM(j3)));
    }

    @Stable
    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m4171plusCBMgk4(long j2, long j3) {
        return DpKt.m4125DpOffsetYgX7TsA(Dp.m4104constructorimpl(m4165getXD9Ej5fM(j2) + m4165getXD9Ej5fM(j3)), Dp.m4104constructorimpl(m4167getYD9Ej5fM(j2) + m4167getYD9Ej5fM(j3)));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4172toStringimpl(long j2) {
        if (!(j2 != INSTANCE.m4174getUnspecifiedRKDOV3M())) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) Dp.m4115toStringimpl(m4165getXD9Ej5fM(j2))) + ", " + ((Object) Dp.m4115toStringimpl(m4167getYD9Ej5fM(j2))) + ')';
    }

    public boolean equals(Object obj) {
        return m4163equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4169hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4172toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
