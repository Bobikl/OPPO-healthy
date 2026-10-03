package com.oplus.aiunit.vision;

import android.text.format.DateFormat;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health_base.R$string;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001eJ\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004J\u0016\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004J\u0016\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004J\u0016\u00101\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u0006R\u0014\u00102\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00103R\u0014\u00107\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u00108\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u00103R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0017\u0010E\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010:R\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010:¨\u0006J"}, d2 = {"Lcom/oplus/aiunit/vision/mq8;", "", "", "C", "", "millis", "", "x", "Ljava/time/DayOfWeek;", b2n.g, "", "datePattern", "q", "o", "n", "c", "b", "pattern", "y", "w", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "startMillis", "endMillis", "v", LogFieldKey.MESSAGE_KEY, "", MapSchema.FIELD_NAME_ENTRY, "date", b2n.f, "Ljava/time/LocalDate;", LogFieldKey.PROCESS_NAME_KEY, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "f", "timestamp", "j", "s", "r", "u", "t", "minusDays", "z", "plusDays", c8l.KEY_B, "minusMonths", "A", "minute", "isNullData", "a", "SLEEP_DIVIDE_HOUR", "I", "ONE_MINUTE_MILLIS", "HALF_HOUR_MILLIS", "ONE_HOUR_MILLIS", "SIX_HOURS_MILLIS", "ONE_DAY_MILLIS", "ONE_SECOND", "J", "Ljava/time/ZoneId;", "Ljava/time/ZoneId;", "d", "()Ljava/time/ZoneId;", "setDEFAULT_ZONE_ID", "(Ljava/time/ZoneId;)V", "DEFAULT_ZONE_ID", "Ljava/time/LocalDate;", "i", "()Ljava/time/LocalDate;", "HEALTH_MIN_DATE", "CHART_DETAILS_START_TIME", "CHART_DETAILS_SLEEP_START_TIME", "<init>", "()V", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class mq8 {
    public static final int $stable;
    public static final long CHART_DETAILS_SLEEP_START_TIME = 1546257600000L;
    public static final long CHART_DETAILS_START_TIME = 1546272000000L;
    public static final int HALF_HOUR_MILLIS = 1800000;

    @NotNull
    public static final mq8 INSTANCE = new mq8();
    public static final int ONE_DAY_MILLIS = 86400000;
    public static final int ONE_HOUR_MILLIS = 3600000;
    public static final int ONE_MINUTE_MILLIS = 60000;
    public static final long ONE_SECOND = 1000;
    public static final int SIX_HOURS_MILLIS = 21600000;
    public static final int SLEEP_DIVIDE_HOUR = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static ZoneId DEFAULT_ZONE_ID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final LocalDate HEALTH_MIN_DATE;

    static {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault()");
        DEFAULT_ZONE_ID = zoneIdSystemDefault;
        LocalDate localDateOf = LocalDate.of(2019, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(2019, 1, 1)");
        HEALTH_MIN_DATE = localDateOf;
        $stable = 8;
    }

    public final long A(long millis, long minusMonths) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).minusMonths(minusMonths).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long B(long millis, long plusDays) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).plusDays(plusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final void C() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault()");
        DEFAULT_ZONE_ID = zoneIdSystemDefault;
    }

    @NotNull
    public final String a(int minute, boolean isNullData) {
        if (minute <= 0 && isNullData) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = b78.a().getString(R$string.health_base_time_hour2);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…g.health_base_time_hour2)");
            String str = String.format(string, Arrays.copyOf(new Object[]{"-- "}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (minute % 60 <= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = b78.a().getString(R$string.health_base_time_hour2);
            Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…g.health_base_time_hour2)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(minute / 60)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        double dFloor = Math.floor(((double) (minute / 60.0f)) * 10.0d) / ((double) 10);
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String string3 = b78.a().getString(R$string.health_base_time_hour2);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext().getStrin…g.health_base_time_hour2)");
        String str3 = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(dFloor)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    public final long b(long millis) {
        return LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).toLocalDate(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long c(long millis) {
        return LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).toLocalDate(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public final ZoneId d() {
        return DEFAULT_ZONE_ID;
    }

    public final int e(long millis) {
        try {
            String str = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            Intrinsics.checkNotNullExpressionValue(str, "ofInstant(Instant.ofEpoc…er.ofPattern(\"yyyyMMdd\"))");
            return Integer.parseInt(str);
        } catch (Exception e2) {
            a7b.f("HealthDateUtils", "parseString2Int e:" + e2.getMessage());
            return -1;
        }
    }

    public final int f(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return (((endDate.getYear() - startDate.getYear()) * 12) + endDate.getMonthValue()) - startDate.getMonthValue();
    }

    public final long g(int date) {
        if (date < 10000000 || date > 100000000) {
            return 0L;
        }
        return LocalDateTime.of(LocalDate.of(date / 10000, (date % 10000) / 100, date % 100), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public final DayOfWeek h(long millis) {
        DayOfWeek dayOfWeek = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).toLocalDate().getDayOfWeek();
        Intrinsics.checkNotNullExpressionValue(dayOfWeek, "ofInstant(Instant.ofEpoc… .toLocalDate().dayOfWeek");
        return dayOfWeek;
    }

    @NotNull
    public final LocalDate i() {
        return HEALTH_MIN_DATE;
    }

    @NotNull
    public final LocalDate j(long timestamp) {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofInstant(Instant.ofEpoc…mDefault()).toLocalDate()");
        return localDate;
    }

    public final long k(long millis) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).toLocalDate().plusMonths(1L).with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1;
    }

    public final long l(long millis) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long m(long startMillis, long endMillis) {
        return Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(startMillis), ZoneId.systemDefault()).toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(endMillis), ZoneId.systemDefault()).toLocalDate().toEpochDay());
    }

    public final long n(long millis) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault());
        return (localDateTimeOfInstant.getHour() >= 20 ? LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).plusDays(1L).withHour(20).withMinute(0).withSecond(0).withNano(0) : LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).withHour(20).withMinute(0).withSecond(0).withNano(0)).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long o(long millis) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault());
        return (localDateTimeOfInstant.getHour() >= 20 ? LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).withHour(20).withMinute(0).withSecond(0).withNano(0) : LocalDateTime.of(localDateTimeOfInstant.toLocalDate().minusDays(1L), LocalTime.MIN).withHour(20).withMinute(0).withSecond(0).withNano(0)).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long p(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public final String q(long millis, @NotNull String datePattern) {
        Intrinsics.checkNotNullParameter(datePattern, "datePattern");
        String str = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(datePattern));
        Intrinsics.checkNotNullExpressionValue(str, "ofInstant(Instant.ofEpoc…r.ofPattern(datePattern))");
        return str;
    }

    public final long r(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().plusWeeks(1L).with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1;
    }

    public final long s(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final long t(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().plusYears(1L).with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1;
    }

    public final long u(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final boolean v(long startMillis, long endMillis) {
        return Math.abs(endMillis - startMillis) < 86400000 && m(startMillis, endMillis) == 0;
    }

    public final boolean w(long millis) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).getDayOfMonth() == 1;
    }

    public final boolean x(long millis) {
        DayOfWeek dayOfWeekH = h(millis);
        return dayOfWeekH == DayOfWeek.SATURDAY || dayOfWeekH == DayOfWeek.SUNDAY;
    }

    @NotNull
    public final String y(long millis, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), pattern), millis).toString();
    }

    public final long z(long millis, long minusDays) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault()).minusDays(minusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
