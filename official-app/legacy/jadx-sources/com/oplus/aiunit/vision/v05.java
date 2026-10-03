package com.oplus.aiunit.vision;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class v05 {
    public static final String DATE_FORMAT_12 = "yyyyMMddHHmm";
    public static final String DATE_FORMAT_14 = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT_17 = "yyyyMMddHHmmssfff";
    public static final String DATE_FORMAT_6 = "yyyyMM";
    public static final String DATE_FORMAT_8 = "yyyyMMdd";
    public static final String DATE_FORMAT_HOUR = "HH:mm";
    public static final String DATE_FORMAT_MILS = "yyyy-MM-dd HH:mm:ss:sss";
    public static final String DATE_FORMAT_YEAR = "yyyy";
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final int HALF_HOUR_IN_MILS = 1800000;
    public static final int HOURS_OF_DAY = 24;
    public static final int MILS_OF_SECOND = 1000;
    public static final int MINUTES_OF_HOURS = 60;
    public static final int MINUTE_IN_MILS = 60000;
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR_IN_MILS = 3600000;
    public static final int SECONDS_OF_MINUTE = 60;
    public static final String TIME_ZONE_0 = "GMT";
    public static final String TIME_ZONE_8 = "GMT+8";
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static long a(int i) {
        if (i < 10000000 || i > 100000000) {
            return 0L;
        }
        return LocalDateTime.of(LocalDate.of(i / 10000, (i % 10000) / 100, i % 100), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static long b() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static String c(LocalDateTime localDateTime, String str) {
        if (localDateTime == null) {
            localDateTime = LocalDateTime.now();
        }
        return DateTimeFormatter.ofPattern(str, Locale.ENGLISH).format(localDateTime);
    }

    public static String d(Date date, String str) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(str, Locale.ENGLISH).format(date);
    }

    public static long e(long j2) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdSystemDefault).toLocalDate(), LocalTime.MIN).withHour(20).plusDays(1L).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static long f(long j2) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdSystemDefault).toLocalDate(), LocalTime.MIN).withHour(20).minusDays(1L).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static String g(String str) {
        return c(LocalDateTime.now(), str);
    }

    public static long h(long j2) {
        return j2 - (j2 % 60000);
    }

    public static int i(long j2) {
        LocalDateTime localDateTimeJ = j(j2);
        return (localDateTimeJ.getYear() * 10000) + (localDateTimeJ.getMonthValue() * 100) + localDateTimeJ.getDayOfMonth();
    }

    public static LocalDateTime j(long j2) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault());
    }

    public static int k(long j2) {
        return w(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).format(a));
    }

    public static long l(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate(), LocalTime.MAX).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static int m(long j2) {
        return w(ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().plusDays(1L).format(a));
    }

    public static int n(long j2) {
        return w(ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().minusDays(1L).format(a));
    }

    public static long o(long j2) {
        long jT = t(j2);
        return j2 < jT ? jT - 1 : e(j2) - 1;
    }

    public static long p(long j2) {
        long jT = t(j2);
        return j2 >= jT ? jT : f(j2);
    }

    public static long q(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate(), LocalTime.MIN).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static String r(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return new SimpleDateFormat("Z").format(Calendar.getInstance().getTime());
    }

    public static String s(long j2, String str) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(str));
    }

    public static long t(long j2) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneIdSystemDefault).toLocalDate(), LocalTime.MIN).withHour(20).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static long u() {
        return (((long) ZonedDateTime.now().getHour()) * 60) + ((long) ZonedDateTime.now().getMinute()) + 1;
    }

    public static String v(long j2) {
        return new SimpleDateFormat(DATE_FORMAT_12, Locale.CHINA).format(new Date(j2));
    }

    public static int w(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            me8.b("DateUtil", "parseString2Int e = " + e2.getMessage());
            return -1;
        }
    }

    public static boolean x(long j2, long j3) {
        return i(j2) == i(j3);
    }

    public static long y(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return LocalDateTime.parse(LocalDateTime.ofInstant(Instant.ofEpochSecond(j2), zoneIdSystemDefault).format(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm")), DateTimeFormatter.ofPattern("yyyyMMdd HH:mm")).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }
}
