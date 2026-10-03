package com.oplus.aiunit.vision;

import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000\u001a\u0016\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000¨\u0006\u0005"}, d2 = {"", "Lkotlin/Pair;", "b", "a", "c", "sport_impl_release"}, k = 2, mv = {1, 8, 0})
public final class rw6 {
    @NotNull
    public static final Pair<Long, Long> a(long j2) {
        LocalDate localDateY = o05.y(o05.D(j2));
        Long lValueOf = Long.valueOf(o05.x(localDateY));
        LocalDate localDatePlusMonths = localDateY.plusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "it.plusMonths(1L)");
        return TuplesKt.to(lValueOf, Long.valueOf(o05.x(localDatePlusMonths) - 1));
    }

    @NotNull
    public static final Pair<Long, Long> b(long j2) {
        LocalDate it = o05.s(o05.D(j2));
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Long lValueOf = Long.valueOf(o05.x(it));
        LocalDate localDatePlusDays = it.plusDays(7L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "it.plusDays(7L)");
        return TuplesKt.to(lValueOf, Long.valueOf(o05.x(localDatePlusDays) - 1));
    }

    @NotNull
    public static final Pair<Long, Long> c(long j2) {
        LocalDate localDateWithMonth = o05.D(j2).withMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithMonth, "toLocalDate().withMonth(1)");
        LocalDate localDateY = o05.y(localDateWithMonth);
        Long lValueOf = Long.valueOf(o05.x(localDateY));
        LocalDate localDatePlusYears = localDateY.plusYears(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "it.plusYears(1L)");
        return TuplesKt.to(lValueOf, Long.valueOf(o05.x(localDatePlusYears) - 1));
    }
}
