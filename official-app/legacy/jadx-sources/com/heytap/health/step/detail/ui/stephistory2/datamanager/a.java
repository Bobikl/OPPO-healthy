package com.heytap.health.step.detail.ui.stephistory2.datamanager;

import com.heytap.health.step.detail.ui.stephistory2.detailitem.BaseItemView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.WeekPair;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.f04;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/a;", "", "Companion", "a", "step_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.step.detail.ui.stephistory2.datamanager.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fJ\u0016\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019J(\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\rJ\u0006\u0010!\u001a\u00020\u0002J\u0006\u0010\"\u001a\u00020\u0002J\u0006\u0010#\u001a\u00020\u0002J\u0016\u0010$\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010%\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010(\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010*\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004J\u0016\u0010+\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010,\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010-\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010.\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¨\u00061"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/a$a;", "", "Ljava/time/LocalDate;", "date", "", LogFieldKey.PROCESS_NAME_KEY, "Ljava/time/LocalDateTime;", "q", ClickApiEntity.TIME, "j", MapSchema.FIELD_NAME_KEY, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "a", "", "w", "startTime", "d", "c", "b", "localDate", "before", LogFieldKey.MESSAGE_KEY, "u", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "mode", "Lcom/oplus/aiunit/vision/ppl;", b2n.f, "endTime", "isJumpLogic", "logicJumpTap", b2n.g, "s", "o", "v", MapSchema.FIELD_NAME_ENTRY, "f", "i", "date1", "y", "time1", "x", "r", LogFieldKey.LEVEL_KEY, "n", "t", "<init>", "()V", "step_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.heytap.health.step.detail.ui.stephistory2.datamanager.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0645a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BaseItemView.CARD_MODE.values().length];
                try {
                    iArr[BaseItemView.CARD_MODE.MONTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BaseItemView.CARD_MODE.YEAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BaseItemView.CARD_MODE.WEEK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

        public final long c(long startTime) {
            return j(startTime).atTime(23, 59, 59).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        public final long d(long startTime) {
            return j(startTime).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @NotNull
        public final LocalDate e(@NotNull LocalDate localDate, boolean before) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            LocalDate localDateWith = localDate.with(TemporalAdjusters.firstDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "localDate.with(TemporalA…usters.firstDayOfMonth())");
            return localDateWith;
        }

        @NotNull
        public final LocalDate f(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            LocalDate localDateWith = date.with(TemporalAdjusters.firstDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "date.with(TemporalAdjusters.firstDayOfMonth())");
            return localDateWith;
        }

        @NotNull
        public final WeekPair g(@NotNull BaseItemView.CARD_MODE mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i = C0645a.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                LocalDate localDateMinusDays = o().minusDays(30L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "getMonthMaxDay().minusDays(30)");
                return l(localDateMinusDays, o());
            }
            if (i != 2) {
                LocalDate localDateMinusDays2 = s().minusDays(6L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "getWeekMaxDay().minusDays(6)");
                return r(localDateMinusDays2, s());
            }
            LocalDate localDateMinusMonths = v().withDayOfMonth(1).minusMonths(11L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "getYearMaxDay().withDayOfMonth(1).minusMonths(11)");
            return t(localDateMinusMonths, v());
        }

        @NotNull
        public final WeekPair h(@NotNull BaseItemView.CARD_MODE mode, long endTime, boolean isJumpLogic, int logicJumpTap) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i = C0645a.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                if (isJumpLogic && logicJumpTap == 2) {
                    LocalDate maxDate = (LocalDate) RangesKt___RangesKt.coerceAtMost(b.l(endTime).plusDays(30L), o());
                    LocalDate minDate = maxDate.minusDays(30L);
                    Intrinsics.checkNotNullExpressionValue(minDate, "minDate");
                    Intrinsics.checkNotNullExpressionValue(maxDate, "maxDate");
                    return l(minDate, maxDate);
                }
                LocalDate maxDate2 = (LocalDate) RangesKt___RangesKt.coerceAtMost(b.l(endTime).plusDays(30L), o());
                LocalDate minDate2 = maxDate2.minusDays(30L);
                Intrinsics.checkNotNullExpressionValue(minDate2, "minDate");
                Intrinsics.checkNotNullExpressionValue(maxDate2, "maxDate");
                return l(minDate2, maxDate2);
            }
            if (i != 2) {
                LocalDate maxDate3 = (LocalDate) RangesKt___RangesKt.coerceAtMost(b.l(endTime).plusDays(6L), s());
                LocalDate minDate3 = maxDate3.minusDays(6L);
                Intrinsics.checkNotNullExpressionValue(minDate3, "minDate");
                Intrinsics.checkNotNullExpressionValue(maxDate3, "maxDate");
                return r(minDate3, maxDate3);
            }
            if (isJumpLogic && logicJumpTap == 3) {
                LocalDate maxDate4 = (LocalDate) RangesKt___RangesKt.coerceAtMost(b.l(endTime).plusYears(1L), v());
                LocalDate minDate4 = maxDate4.withDayOfMonth(1).minusMonths(11L);
                Intrinsics.checkNotNullExpressionValue(minDate4, "minDate");
                Intrinsics.checkNotNullExpressionValue(maxDate4, "maxDate");
                return t(minDate4, maxDate4);
            }
            LocalDate maxDate5 = b.l(endTime).with(TemporalAdjusters.lastDayOfYear());
            LocalDate minDate5 = maxDate5.with(TemporalAdjusters.firstDayOfYear());
            Intrinsics.checkNotNullExpressionValue(minDate5, "minDate");
            Intrinsics.checkNotNullExpressionValue(maxDate5, "maxDate");
            return t(minDate5, maxDate5);
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

        @NotNull
        public final LocalDateTime k(long time) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(\n             …systemDefault()\n        )");
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
            LocalDate localDatePlusDays = e(localDateNow, true).plusDays(30L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "getFirstDayInMonth(Local…now(), true).plusDays(30)");
            return localDatePlusDays;
        }

        @JvmStatic
        public final long p(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return RangesKt___RangesKt.coerceAtLeast(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L);
        }

        public final long q(@NotNull LocalDateTime date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return date.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @NotNull
        public final WeekPair r(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            LocalDate localDateMinusDays = startDate.minusDays(7L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "startDate.minusDays(7)");
            LocalDate localDateMinusDays2 = startDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "startDate.minusDays(1)");
            return new WeekPair(localDateMinusDays, localDateMinusDays2, startDate, endDate);
        }

        @NotNull
        public final LocalDate s() {
            LocalDate localDateWith = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
            Intrinsics.checkNotNullExpressionValue(localDateWith, "now().with(TemporalAdjus…OrSame(DayOfWeek.SUNDAY))");
            return localDateWith;
        }

        @NotNull
        public final WeekPair t(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            LocalDate localDateMinusYears = startDate.minusYears(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusYears, "startDate.minusYears(1)");
            LocalDate localDateMinusDays = startDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "startDate.minusDays(1)");
            return new WeekPair(localDateMinusYears, localDateMinusDays, startDate, endDate);
        }

        @NotNull
        public final LocalDate u(@NotNull LocalDate localDate, boolean before) {
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
        public final LocalDate v() {
            LocalDate localDateWith = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
            Intrinsics.checkNotNullExpressionValue(localDateWith, "now().with(TemporalAdjusters.lastDayOfYear())");
            return localDateWith;
        }

        public final boolean w(@NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(date, "date");
            return Intrinsics.areEqual(startDate, date) || Intrinsics.areEqual(endDate, date) || (date.isAfter(startDate) && date.isBefore(endDate));
        }

        public final boolean x(long time, long time1) {
            return Intrinsics.areEqual(j(time), j(time1));
        }

        public final boolean y(@NotNull LocalDate date, @NotNull LocalDate date1) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(date1, "date1");
            return date.getYear() == date1.getYear() && date1.getMonthValue() == date.getMonthValue();
        }
    }
}
