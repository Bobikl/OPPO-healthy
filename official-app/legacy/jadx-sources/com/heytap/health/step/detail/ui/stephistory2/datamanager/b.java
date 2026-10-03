package com.heytap.health.step.detail.ui.stephistory2.datamanager;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.WeekPair;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.o05;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0000\u001a\u0012\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0000\u001a\u0012\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\t\u001a\u0012\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0000\u001a\u0012\u0010\f\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\t\u001a\u0012\u0010\r\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u0000\u001a\u0012\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000\u001a\u0012\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000\u001a\n\u0010\u0013\u001a\u00020\t*\u00020\u0000\u001a\u0012\u0010\u0014\u001a\n \u0006*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000\u001a\n\u0010\u0015\u001a\u00020\u0000*\u00020\u0000\u001a\u0012\u0010\u0016\u001a\n \u0006*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0000\u001a\n\u0010\u0019\u001a\u00020\u0000*\u00020\t\u001a\n\u0010\u001a\u001a\u00020\u0017*\u00020\t\u001a\n\u0010\u001b\u001a\u00020\t*\u00020\t\u001a\u0012\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000f\u001a\n\u0010\u001e\u001a\u00020\u0000*\u00020\u0000\u001a\u001a\u0010\"\u001a\u00020!*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000\u001a\n\u0010#\u001a\u00020\u0000*\u00020\u0000¨\u0006$"}, d2 = {"Ljava/time/LocalDate;", "Lcom/oplus/aiunit/vision/ppl;", "q", "Lcom/oplus/aiunit/vision/dlf;", LogFieldKey.PROCESS_NAME_KEY, "", "kotlin.jvm.PlatformType", "r", "w", "", "v", "u", "t", "s", "date", "", "b", "a", b2n.f, "o", "j", "d", MapSchema.FIELD_NAME_KEY, "Ljava/time/LocalDateTime;", "n", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "c", "weekAgo", "f", "i", "beforeDate", "afterDate", "", MapSchema.FIELD_NAME_ENTRY, b2n.g, "step_release"}, k = 2, mv = {1, 8, 0})
public final class b {
    public static final int a(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return a.INSTANCE.a(localDate, date);
    }

    public static final int b(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return a.INSTANCE.a(localDate, date) + 1;
    }

    public static final long c(long j2) {
        return a.INSTANCE.c(j2);
    }

    @NotNull
    public static final LocalDate d(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return a.INSTANCE.i(localDate);
    }

    public static final boolean e(@NotNull LocalDate localDate, @NotNull LocalDate beforeDate, @NotNull LocalDate afterDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(beforeDate, "beforeDate");
        Intrinsics.checkNotNullParameter(afterDate, "afterDate");
        return a.INSTANCE.w(beforeDate, afterDate, localDate);
    }

    @NotNull
    public static final LocalDate f(@NotNull LocalDate localDate, int i) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate localDateMinusWeeks = localDate.with((TemporalAdjuster) DayOfWeek.MONDAY).minusWeeks(RangesKt___RangesKt.coerceAtLeast(i, 0));
        Intrinsics.checkNotNullExpressionValue(localDateMinusWeeks, "this.with(DayOfWeek.MOND…               .toLong())");
        return localDateMinusWeeks;
    }

    public static final int g(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return a.INSTANCE.b(localDate, date);
    }

    @NotNull
    public static final LocalDate h(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate nextMonthFirstDay = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        Intrinsics.checkNotNullExpressionValue(nextMonthFirstDay, "nextMonthFirstDay");
        return nextMonthFirstDay;
    }

    @NotNull
    public static final LocalDate i(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        if (Intrinsics.areEqual(localDate, localDate.withDayOfMonth(1))) {
            LocalDate localDateWithDayOfMonth = localDate.minusDays(1L).withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "{\n        this.minusDays…).withDayOfMonth(1)\n    }");
            return localDateWithDayOfMonth;
        }
        LocalDate localDateWithDayOfMonth2 = localDate.withDayOfMonth(1);
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth2, "{\n        withDayOfMonth(1)\n    }");
        return localDateWithDayOfMonth2;
    }

    public static final LocalDate j(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.withDayOfMonth(1);
    }

    public static final LocalDate k(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.with(TemporalAdjusters.firstDayOfYear());
    }

    @NotNull
    public static final LocalDate l(long j2) {
        return a.INSTANCE.j(j2);
    }

    @NotNull
    public static final LocalDateTime m(long j2) {
        return a.INSTANCE.k(j2);
    }

    @NotNull
    public static final LocalDateTime n(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return a.INSTANCE.k(o(localDate));
    }

    public static final long o(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return a.INSTANCE.p(localDate);
    }

    @NotNull
    public static final RelativeDateRange p(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate localDateH = o05.h(localDate);
        LocalDate monthFirstDay = j(localDate);
        LocalDate lastMonthEndDay = monthFirstDay.minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(lastMonthEndDay, "lastMonthEndDay");
        LocalDate lastMonthStartDay = j(lastMonthEndDay);
        Intrinsics.checkNotNullExpressionValue(lastMonthStartDay, "lastMonthStartDay");
        Intrinsics.checkNotNullExpressionValue(monthFirstDay, "monthFirstDay");
        return new RelativeDateRange(lastMonthStartDay, lastMonthEndDay, monthFirstDay, localDateH);
    }

    @NotNull
    public static final WeekPair q(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate weekEndDay = o05.z(localDate);
        LocalDate weekStartDay = o05.s(localDate);
        LocalDate localDateMinusDays = weekStartDay.minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "weekStartDay.minusDays(1)");
        LocalDate lastWeekStartDay = o05.s(localDateMinusDays);
        Intrinsics.checkNotNullExpressionValue(lastWeekStartDay, "lastWeekStartDay");
        LocalDate lastWeekEndDay = o05.z(lastWeekStartDay);
        Intrinsics.checkNotNullExpressionValue(lastWeekEndDay, "lastWeekEndDay");
        Intrinsics.checkNotNullExpressionValue(weekStartDay, "weekStartDay");
        Intrinsics.checkNotNullExpressionValue(weekEndDay, "weekEndDay");
        return new WeekPair(lastWeekStartDay, lastWeekEndDay, weekStartDay, weekEndDay);
    }

    public static final String r(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return fn9.g(o(localDate), "MMMdd");
    }

    public static final String s(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return fn9.g(o(localDate), "yyyy");
    }

    public static final String t(long j2) {
        return fn9.g(j2, "yyyyMMM");
    }

    public static final String u(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return fn9.g(o(localDate), "yyyyMMM");
    }

    public static final String v(long j2) {
        return fn9.g(j2, "yyyyMMMdd");
    }

    public static final String w(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return fn9.g(o(localDate), "yyyyMMMdd");
    }
}
