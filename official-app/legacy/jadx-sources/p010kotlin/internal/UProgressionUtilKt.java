package p010kotlin.internal;

import com.oplus.smartenginehelper.entity.TextEntity;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.SinceKotlin;
import p010kotlin.UInt;
import p010kotlin.ULong;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", TextEntity.ELLIPSIZE_END, "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m6509differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i, i3);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i2, i3);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iM5382constructorimpl = UInt.m5382constructorimpl(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iM5382constructorimpl : UInt.m5382constructorimpl(iM5382constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m6510differenceModulosambcqE(long j2, long j3, long j4) {
        long jRemainderUnsigned = Long.remainderUnsigned(j2, j4);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j3, j4);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jM5461constructorimpl = ULong.m5461constructorimpl(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jM5461constructorimpl : ULong.m5461constructorimpl(jM5461constructorimpl + j4);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m6511getProgressionLastElement7ftBX0g(long j2, long j3, long j4) {
        if (j4 > 0) {
            return Long.compareUnsigned(j2, j3) >= 0 ? j3 : ULong.m5461constructorimpl(j3 - m6510differenceModulosambcqE(j3, j2, ULong.m5461constructorimpl(j4)));
        }
        if (j4 < 0) {
            return Long.compareUnsigned(j2, j3) <= 0 ? j3 : ULong.m5461constructorimpl(j3 + m6510differenceModulosambcqE(j2, j3, ULong.m5461constructorimpl(-j4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m6512getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compareUnsigned(i, i2) >= 0 ? i2 : UInt.m5382constructorimpl(i2 - m6509differenceModuloWZ9TVnA(i2, i, UInt.m5382constructorimpl(i3)));
        }
        if (i3 < 0) {
            return Integer.compareUnsigned(i, i2) <= 0 ? i2 : UInt.m5382constructorimpl(i2 + m6509differenceModuloWZ9TVnA(i, i2, UInt.m5382constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
