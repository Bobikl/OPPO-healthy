package androidx.compose.foundation.lazy.staggeredgrid;

import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.entity.TextEntity;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\n\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u0088\u0001\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "lane", "", c8l.SPAN_KEY, "constructor-impl", "(II)J", "packedValue", "", "(J)J", TextEntity.ELLIPSIZE_END, "getEnd-impl", "(J)I", "getPackedValue", "()J", "size", "getSize-impl", "start", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n879#1:1101\n878#1:1103\n48#2:1098\n55#2:1099\n62#2:1100\n62#2:1102\n55#2:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n880#1:1101\n880#1:1103\n876#1:1098\n878#1:1099\n879#1:1100\n880#1:1102\n880#1:1104\n*E\n"})
final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m654boximpl(long j2) {
        return new SpanRange(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m656constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m657equalsimpl(long j2, Object obj) {
        return (obj instanceof SpanRange) && j2 == ((SpanRange) obj).m664unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m658equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m659getEndimpl(long j2) {
        return (int) (j2 & 4294967295L);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m660getSizeimpl(long j2) {
        return ((int) (4294967295L & j2)) - ((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m661getStartimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m662hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m663toStringimpl(long j2) {
        return "SpanRange(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m657equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m662hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m663toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m664unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m655constructorimpl(int i, int i2) {
        return m656constructorimpl((((long) (i2 + i)) & 4294967295L) | (((long) i) << 32));
    }
}
