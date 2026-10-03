package androidx.compose.animation.core;

import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\b\u0092\u0001\u00020\tø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JvmInline
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m120boximpl(long j2) {
        return new StartOffset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m122constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m123constructorimpl$default(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.INSTANCE.m138getDelayEo1U57Q();
        }
        return m121constructorimpl(i, i2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m124equalsimpl(long j2, Object obj) {
        return (obj instanceof StartOffset) && j2 == ((StartOffset) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m125equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m126getOffsetMillisimpl(long j2) {
        return Math.abs((int) j2);
    }

    /* JADX INFO: renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m127getOffsetTypeEo1U57Q(long j2) {
        boolean z = j2 > 0;
        if (z) {
            return StartOffsetType.INSTANCE.m139getFastForwardEo1U57Q();
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.INSTANCE.m138getDelayEo1U57Q();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m128hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m129toStringimpl(long j2) {
        return "StartOffset(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m124equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m128hashCodeimpl(this.value);
    }

    public String toString() {
        return m129toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m121constructorimpl(int i, int i2) {
        return m122constructorimpl(i * i2);
    }
}
