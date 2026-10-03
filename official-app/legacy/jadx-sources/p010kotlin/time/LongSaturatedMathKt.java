package p010kotlin.time;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m6773checkInfiniteSumDefinedPjuGub4(long j2, long j3, long j4) {
        if (!Duration.m6677isInfiniteimpl(j3) || (j2 ^ j4) >= 0) {
            return j2;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j2) {
        return j2 < 0 ? Duration.INSTANCE.m6747getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m6746getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j2) {
        return ((j2 - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m6774saturatingAddNuflL3o(long j2, @NotNull DurationUnit unit, long j3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM6691toLongimpl = Duration.m6691toLongimpl(j3, unit);
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return m6773checkInfiniteSumDefinedPjuGub4(j2, j3, jM6691toLongimpl);
        }
        if ((1 | (jM6691toLongimpl - 1)) == Long.MAX_VALUE) {
            return m6775saturatingAddInHalvesNuflL3o(j2, unit, j3);
        }
        long j4 = j2 + jM6691toLongimpl;
        if (((j2 ^ j4) & (jM6691toLongimpl ^ j4)) < 0) {
            return j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j4;
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m6775saturatingAddInHalvesNuflL3o(long j2, DurationUnit durationUnit, long j3) {
        long jM6648divUwyO8pc = Duration.m6648divUwyO8pc(j3, 2);
        long jM6691toLongimpl = Duration.m6691toLongimpl(jM6648divUwyO8pc, durationUnit);
        return ((1 | (jM6691toLongimpl - 1)) > Long.MAX_VALUE ? 1 : ((1 | (jM6691toLongimpl - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? jM6691toLongimpl : m6774saturatingAddNuflL3o(m6774saturatingAddNuflL3o(j2, durationUnit, jM6648divUwyO8pc), durationUnit, Duration.m6680minusLRDsOJo(j3, jM6648divUwyO8pc));
    }

    public static final long saturatingDiff(long j2, long j3, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((1 | (j3 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j3 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? Duration.m6698unaryMinusUwyO8pc(infinityOfSign(j3)) : saturatingFiniteDiff(j2, j3, unit);
    }

    private static final long saturatingFiniteDiff(long j2, long j3, DurationUnit durationUnit) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return DurationKt.toDuration(j4, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m6698unaryMinusUwyO8pc(infinityOfSign(j4));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j5 = (j2 / jConvertDurationUnit) - (j3 / jConvertDurationUnit);
        long j6 = (j2 % jConvertDurationUnit) - (j3 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m6681plusLRDsOJo(DurationKt.toDuration(j5, durationUnit2), DurationKt.toDuration(j6, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j2, long j3, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            return j2 == j3 ? Duration.INSTANCE.m6748getZEROUwyO8pc() : Duration.m6698unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? infinityOfSign(j2) : saturatingFiniteDiff(j2, j3, unit);
    }
}
