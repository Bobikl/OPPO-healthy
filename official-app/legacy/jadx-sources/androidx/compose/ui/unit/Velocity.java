package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0019J!\u0010*\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OhffZ5M", "(JFF)J", "div", "operand", "div-adjELrA", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-AH228Gc", "(JJ)J", "plus", "plus-AH228Gc", "rem", "rem-adjELrA", "times", "times-adjELrA", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-9UxMQ8M", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n34#2:145\n41#2:146\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n45#1:145\n52#1:146\n*E\n"})
public final class Velocity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = VelocityKt.Velocity(0.0f, 0.0f);
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/Velocity$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/Velocity;", "getZero-9UxMQ8M$annotations", "getZero-9UxMQ8M", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m4339getZero9UxMQ8M$annotations() {
        }

        /* JADX INFO: renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m4340getZero9UxMQ8M() {
            return Velocity.Zero;
        }
    }

    private /* synthetic */ Velocity(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m4320boximpl(long j2) {
        return new Velocity(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m4321component1impl(long j2) {
        return m4329getXimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m4322component2impl(long j2) {
        return m4330getYimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4323constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m4324copyOhffZ5M(long j2, float f, float f2) {
        return VelocityKt.Velocity(f, f2);
    }

    /* JADX INFO: renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m4325copyOhffZ5M$default(long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m4329getXimpl(j2);
        }
        if ((i & 2) != 0) {
            f2 = m4330getYimpl(j2);
        }
        return m4324copyOhffZ5M(j2, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: div-adjELrA, reason: not valid java name */
    public static final long m4326divadjELrA(long j2, float f) {
        return VelocityKt.Velocity(m4329getXimpl(j2) / f, m4330getYimpl(j2) / f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4327equalsimpl(long j2, Object obj) {
        return (obj instanceof Velocity) && j2 == ((Velocity) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4328equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m4329getXimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m4330getYimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4331hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* JADX INFO: renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m4332minusAH228Gc(long j2, long j3) {
        return VelocityKt.Velocity(m4329getXimpl(j2) - m4329getXimpl(j3), m4330getYimpl(j2) - m4330getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m4333plusAH228Gc(long j2, long j3) {
        return VelocityKt.Velocity(m4329getXimpl(j2) + m4329getXimpl(j3), m4330getYimpl(j2) + m4330getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m4334remadjELrA(long j2, float f) {
        return VelocityKt.Velocity(m4329getXimpl(j2) % f, m4330getYimpl(j2) % f);
    }

    @Stable
    /* JADX INFO: renamed from: times-adjELrA, reason: not valid java name */
    public static final long m4335timesadjELrA(long j2, float f) {
        return VelocityKt.Velocity(m4329getXimpl(j2) * f, m4330getYimpl(j2) * f);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4336toStringimpl(long j2) {
        return '(' + m4329getXimpl(j2) + ", " + m4330getYimpl(j2) + ") px/sec";
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m4337unaryMinus9UxMQ8M(long j2) {
        return VelocityKt.Velocity(-m4329getXimpl(j2), -m4330getYimpl(j2));
    }

    public boolean equals(Object obj) {
        return m4327equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4331hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m4336toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
