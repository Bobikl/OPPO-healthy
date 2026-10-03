package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.channel.client.data.Action;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n48#2:180\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:180\n*E\n"})
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m4216constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m4233lerp81ZRxRo(long j2, long j3, float f) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m4222getXimpl(j2), IntOffset.m4222getXimpl(j3), f), MathHelpersKt.lerp(IntOffset.m4223getYimpl(j2), IntOffset.m4223getYimpl(j3), f));
    }

    @Stable
    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m4234minusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m1380getXimpl(j2) - IntOffset.m4222getXimpl(j3), Offset.m1381getYimpl(j2) - IntOffset.m4223getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m4235minusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m4222getXimpl(j2) - Offset.m1380getXimpl(j3), IntOffset.m4223getYimpl(j2) - Offset.m1381getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m4236plusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m1380getXimpl(j2) + IntOffset.m4222getXimpl(j3), Offset.m1381getYimpl(j2) + IntOffset.m4223getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m4237plusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m4222getXimpl(j2) + Offset.m1380getXimpl(j3), IntOffset.m4223getYimpl(j2) + Offset.m1381getYimpl(j3));
    }

    @Stable
    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m4238roundk4lQ0M(long j2) {
        return IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m1380getXimpl(j2)), MathKt__MathJVMKt.roundToInt(Offset.m1381getYimpl(j2)));
    }

    @Stable
    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m4239toOffsetgyyYBs(long j2) {
        return OffsetKt.Offset(IntOffset.m4222getXimpl(j2), IntOffset.m4223getYimpl(j2));
    }
}
