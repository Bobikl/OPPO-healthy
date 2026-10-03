package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\fJ\u001e\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)I", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-iSbpLlY", "(JII)J", "div", "operand", "", "div-Bjo55l4", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "minus", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "rem", "rem-Bjo55l4", "(JI)J", "times", "times-Bjo55l4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-nOcc-ac", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
public final class IntOffset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m4232getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m4213boximpl(long j2) {
        return new IntOffset(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m4214component1impl(long j2) {
        return m4222getXimpl(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m4215component2impl(long j2) {
        return m4223getYimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4216constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m4217copyiSbpLlY(long j2, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m4218copyiSbpLlY$default(long j2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m4222getXimpl(j2);
        }
        if ((i3 & 2) != 0) {
            i2 = m4223getYimpl(j2);
        }
        return m4217copyiSbpLlY(j2, i, i2);
    }

    @Stable
    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m4219divBjo55l4(long j2, float f) {
        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(m4222getXimpl(j2) / f), MathKt__MathJVMKt.roundToInt(m4223getYimpl(j2) / f));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4220equalsimpl(long j2, Object obj) {
        return (obj instanceof IntOffset) && j2 == ((IntOffset) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4221equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m4222getXimpl(long j2) {
        return (int) (j2 >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m4223getYimpl(long j2) {
        return (int) (j2 & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4224hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m4225minusqkQi6aY(long j2, long j3) {
        return IntOffsetKt.IntOffset(m4222getXimpl(j2) - m4222getXimpl(j3), m4223getYimpl(j2) - m4223getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m4226plusqkQi6aY(long j2, long j3) {
        return IntOffsetKt.IntOffset(m4222getXimpl(j2) + m4222getXimpl(j3), m4223getYimpl(j2) + m4223getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m4227remBjo55l4(long j2, int i) {
        return IntOffsetKt.IntOffset(m4222getXimpl(j2) % i, m4223getYimpl(j2) % i);
    }

    @Stable
    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m4228timesBjo55l4(long j2, float f) {
        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(m4222getXimpl(j2) * f), MathKt__MathJVMKt.roundToInt(m4223getYimpl(j2) * f));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4229toStringimpl(long j2) {
        return '(' + m4222getXimpl(j2) + ", " + m4223getYimpl(j2) + ')';
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m4230unaryMinusnOccac(long j2) {
        return IntOffsetKt.IntOffset(-m4222getXimpl(j2), -m4223getYimpl(j2));
    }

    public boolean equals(Object obj) {
        return m4220equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4224hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4229toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
