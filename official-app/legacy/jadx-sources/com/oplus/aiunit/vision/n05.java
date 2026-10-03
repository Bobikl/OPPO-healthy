package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/n05;", "", "Ljava/time/LocalDate;", "date", "", "j", ClickApiEntity.TIME, b2n.f, "Ljava/time/LocalDateTime;", MapSchema.FIELD_NAME_KEY, b2n.g, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "a", "", LogFieldKey.LEVEL_KEY, "startTime", "d", "c", "b", MapSchema.FIELD_NAME_ENTRY, "f", "date1", "n", "time1", LogFieldKey.MESSAGE_KEY, "i", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class n05 {

    @NotNull
    public static final n05 INSTANCE = new n05();

    @JvmStatic
    @NotNull
    public static final LocalDate g(long time) {
        LocalDate localDate = INSTANCE.h(time).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "getLocalDateTimeFromTime(time).toLocalDate()");
        return localDate;
    }

    @JvmStatic
    public static final long j(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return RangesKt___RangesKt.coerceAtLeast(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L);
    }

    public final int a(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return ((int) RangesKt___RangesKt.coerceAtLeast(endDate.toEpochDay() - startDate.toEpochDay(), 0L)) + 1;
    }

    public final int b(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return (((endDate.getYear() - startDate.getYear()) * 12) + endDate.getMonthValue()) - startDate.getMonthValue();
    }

    public final long c(long startTime) {
        return g(startTime).atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long d(long startTime) {
        return g(startTime).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public final LocalDate e(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWith = date.with(TemporalAdjusters.firstDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "date.with(TemporalAdjusters.firstDayOfMonth())");
        return localDateWith;
    }

    @NotNull
    public final LocalDate f(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateWith = date.with(TemporalAdjusters.lastDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "date.with(TemporalAdjusters.lastDayOfMonth())");
        return localDateWith;
    }

    @NotNull
    public final LocalDateTime h(long time) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(\n        Insta…eId.systemDefault()\n    )");
        return localDateTimeOfInstant;
    }

    public final long i(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date.with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long k(@NotNull LocalDateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final boolean l(@NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(date, "date");
        return Intrinsics.areEqual(startDate, date) || Intrinsics.areEqual(endDate, date) || (date.isAfter(startDate) && date.isBefore(endDate));
    }

    public final boolean m(long time, long time1) {
        return Intrinsics.areEqual(g(time), g(time1));
    }

    public final boolean n(@NotNull LocalDate date, @NotNull LocalDate date1) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(date1, "date1");
        return date.getYear() == date1.getYear() && date1.getMonthValue() == date.getMonthValue();
    }
}
