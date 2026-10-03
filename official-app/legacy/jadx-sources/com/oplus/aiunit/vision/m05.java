package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.ui.itemview.CardMode;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/m05;", "", "Companion", "a", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class m05 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.m05$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0007J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0007J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010$\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006J\u0016\u0010%\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010(\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\n\u0010)\u001a\u00020\u0002*\u00020\u0006J\n\u0010*\u001a\u00020\u0006*\u00020\u0002J\n\u0010+\u001a\u00020\u0004*\u00020\u0002J\n\u0010,\u001a\u00020\u0002*\u00020\u0002¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/m05$a;", "", "", ClickApiEntity.TIME, "Ljava/time/LocalDateTime;", MapSchema.FIELD_NAME_KEY, "Ljava/time/LocalDate;", "date", LogFieldKey.PROCESS_NAME_KEY, "j", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "a", "", "v", "startTime", "d", "c", "b", "localDate", "before", LogFieldKey.MESSAGE_KEY, "t", "Lcom/heytap/health/daily/ui/itemview/CardMode;", "mode", "Lcom/oplus/aiunit/vision/m05$a$a;", b2n.f, "r", "o", "u", MapSchema.FIELD_NAME_ENTRY, "f", "i", b2n.g, "date1", "w", "q", LogFieldKey.LEVEL_KEY, "n", "s", "y", "z", "A", "x", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.m05$a$a, reason: collision with other inner class name and from toString */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/m05$a$a;", "", "Ljava/time/LocalDate;", "a", "b", "c", "d", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/time/LocalDate;", "getBeforeStartDate", "()Ljava/time/LocalDate;", "beforeStartDate", "getBeforeEndDate", "beforeEndDate", "getStartDate", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "getEndDate", "endDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "daily_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class WeekPair {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final LocalDate beforeStartDate;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final LocalDate beforeEndDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final LocalDate startDate;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            @NotNull
            public final LocalDate endDate;

            public WeekPair(@NotNull LocalDate beforeStartDate, @NotNull LocalDate beforeEndDate, @NotNull LocalDate startDate, @NotNull LocalDate endDate) {
                Intrinsics.checkNotNullParameter(beforeStartDate, "beforeStartDate");
                Intrinsics.checkNotNullParameter(beforeEndDate, "beforeEndDate");
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
                this.beforeStartDate = beforeStartDate;
                this.beforeEndDate = beforeEndDate;
                this.startDate = startDate;
                this.endDate = endDate;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDate getBeforeStartDate() {
                return this.beforeStartDate;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final LocalDate getBeforeEndDate() {
                return this.beforeEndDate;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getStartDate() {
                return this.startDate;
            }

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final LocalDate getEndDate() {
                return this.endDate;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WeekPair)) {
                    return false;
                }
                WeekPair weekPair = (WeekPair) other;
                return Intrinsics.areEqual(this.beforeStartDate, weekPair.beforeStartDate) && Intrinsics.areEqual(this.beforeEndDate, weekPair.beforeEndDate) && Intrinsics.areEqual(this.startDate, weekPair.startDate) && Intrinsics.areEqual(this.endDate, weekPair.endDate);
            }

            public int hashCode() {
                return (((((this.beforeStartDate.hashCode() * 31) + this.beforeEndDate.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode();
            }

            @NotNull
            public String toString() {
                return "WeekPair(beforeStartDate=" + this.beforeStartDate + ", beforeEndDate=" + this.beforeEndDate + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.m05$a$b */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CardMode.values().length];
                try {
                    iArr[CardMode.MONTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CardMode.YEAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocalDateTime A(long j2) {
            return m05.INSTANCE.k(j2);
        }

        public final int a(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            return (int) RangesKt___RangesKt.coerceAtLeast(endDate.toEpochDay() - startDate.toEpochDay(), 0L);
        }

        public final int b(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            return (((endDate.getYear() - startDate.getYear()) * 12) + endDate.getMonthValue()) - startDate.getMonthValue();
        }

        @JvmStatic
        public final long c(long startTime) {
            return j(startTime).atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @JvmStatic
        public final long d(long startTime) {
            return j(startTime).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @NotNull
        public final LocalDate e(@NotNull LocalDate localDate, boolean before) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            if (before) {
                LocalDate localDateWith = Intrinsics.areEqual(localDate.with(TemporalAdjusters.firstDayOfMonth()), localDate) ? localDate.minusDays(1L).with(TemporalAdjusters.firstDayOfMonth()) : localDate.with(TemporalAdjusters.firstDayOfMonth());
                Intrinsics.checkNotNullExpressionValue(localDateWith, "{\n                if (lo…          }\n            }");
                return localDateWith;
            }
            LocalDate localDateWith2 = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith2, "{\n                localD…extMonth())\n            }");
            return localDateWith2;
        }

        public final long f(long time) {
            LocalDate localDateWith = j(time).with(TemporalAdjusters.firstDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "getLocalDateFromTime(tim…usters.firstDayOfMonth())");
            return p(localDateWith);
        }

        @NotNull
        public final WeekPair g(@NotNull CardMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i = b.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                LocalDate localDateMinusDays = o().minusDays(30L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "getMonthMaxDay().minusDays(30)");
                return l(localDateMinusDays, o());
            }
            if (i != 2) {
                LocalDate localDateMinusDays2 = r().minusDays(6L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "getWeekMaxDay().minusDays(6)");
                return q(localDateMinusDays2, r());
            }
            LocalDate localDateMinusMonths = u().withDayOfMonth(1).minusMonths(11L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "getYearMaxDay().withDayOfMonth(1).minusMonths(11)");
            return s(localDateMinusMonths, u());
        }

        public final long h(long time) {
            LocalDate localDateWith = j(time).with(TemporalAdjusters.lastDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "getLocalDateFromTime(tim…justers.lastDayOfMonth())");
            return p(localDateWith);
        }

        @NotNull
        public final LocalDate i(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            LocalDate localDateWith = date.with(TemporalAdjusters.lastDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "date.with(TemporalAdjusters.lastDayOfMonth())");
            return localDateWith;
        }

        @NotNull
        public final LocalDate j(long time) {
            LocalDate localDate = k(time).toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "getLocalDateTimeFromTime(time).toLocalDate()");
            return localDate;
        }

        public final LocalDateTime k(long time) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(\n            I…systemDefault()\n        )");
            return localDateTimeOfInstant;
        }

        @NotNull
        public final WeekPair l(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            LocalDate localDateMinusMonths = startDate.minusMonths(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "startDate.minusMonths(1)");
            LocalDate localDateMinusDays = startDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "startDate.minusDays(1)");
            return new WeekPair(localDateMinusMonths, localDateMinusDays, startDate, endDate);
        }

        @NotNull
        public final LocalDate m(@NotNull LocalDate localDate, boolean before) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            if (before) {
                LocalDate localDateWith = localDate.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
                Intrinsics.checkNotNullExpressionValue(localDateWith, "{\n                localD…ek.MONDAY))\n            }");
                return localDateWith;
            }
            LocalDate localDateWith2 = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            Intrinsics.checkNotNullExpressionValue(localDateWith2, "{\n                localD…ek.MONDAY))\n            }");
            return localDateWith2;
        }

        public final int n(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            LocalDate localDateWith = date.with(TemporalAdjusters.firstDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "date.with(TemporalAdjusters.firstDayOfMonth())");
            LocalDate localDateWith2 = date.with(TemporalAdjusters.lastDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith2, "date.with(TemporalAdjusters.lastDayOfMonth())");
            return a(localDateWith, localDateWith2) + 1;
        }

        @NotNull
        public final LocalDate o() {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
            return i(localDateNow);
        }

        @JvmStatic
        public final long p(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return RangesKt___RangesKt.coerceAtLeast(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L);
        }

        @NotNull
        public final WeekPair q(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            LocalDate localDateMinusDays = startDate.minusDays(7L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "startDate.minusDays(7)");
            LocalDate localDateMinusDays2 = startDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "startDate.minusDays(1)");
            return new WeekPair(localDateMinusDays, localDateMinusDays2, startDate, endDate);
        }

        @NotNull
        public final LocalDate r() {
            LocalDate localDateWith = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
            Intrinsics.checkNotNullExpressionValue(localDateWith, "now().with(TemporalAdjus…OrSame(DayOfWeek.SUNDAY))");
            return localDateWith;
        }

        @NotNull
        public final WeekPair s(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            LocalDate localDateMinusYears = startDate.minusYears(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusYears, "startDate.minusYears(1)");
            LocalDate localDateMinusDays = startDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "startDate.minusDays(1)");
            return new WeekPair(localDateMinusYears, localDateMinusDays, startDate, endDate);
        }

        @NotNull
        public final LocalDate t(@NotNull LocalDate localDate, boolean before) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            if (before) {
                LocalDate localDateWithDayOfYear = localDate.withDayOfYear(1).isBefore(localDate) ? localDate.withDayOfYear(1) : localDate.withDayOfYear(1).minusYears(1L);
                Intrinsics.checkNotNullExpressionValue(localDateWithDayOfYear, "{\n                if (lo…          }\n            }");
                return localDateWithDayOfYear;
            }
            LocalDate localDateWith = localDate.with(TemporalAdjusters.firstDayOfNextYear());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "{\n                localD…NextYear())\n            }");
            return localDateWith;
        }

        @NotNull
        public final LocalDate u() {
            LocalDate localDateWith = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "now().with(TemporalAdjusters.lastDayOfYear())");
            return localDateWith;
        }

        public final boolean v(@NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(date, "date");
            return Intrinsics.areEqual(startDate, date) || Intrinsics.areEqual(endDate, date) || (date.isAfter(startDate) && date.isBefore(endDate));
        }

        public final boolean w(@NotNull LocalDate date, @NotNull LocalDate date1) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(date1, "date1");
            return date.getYear() == date1.getYear() && date1.getMonthValue() == date.getMonthValue();
        }

        public final long x(long j2) {
            return y(m05.INSTANCE.j(j2));
        }

        public final long y(@NotNull LocalDate localDate) {
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @NotNull
        public final LocalDate z(long j2) {
            return m05.INSTANCE.j(j2);
        }
    }

    @JvmStatic
    public static final long a(long j2) {
        return INSTANCE.c(j2);
    }

    @JvmStatic
    public static final long b(@NotNull LocalDate localDate) {
        return INSTANCE.p(localDate);
    }
}
