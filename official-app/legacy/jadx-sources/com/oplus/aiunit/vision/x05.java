package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.camera.core.processing.util.GLUtils;
import com.heytap.health.base.R$string;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class x05 {
    public static final int DAY_HOUR_LENGTH = 24;
    public static final int DAY_SEC_LENGTH = 86400;
    public static final long DAY_TIMESTAMP_LENGTH = 86400000;
    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final int DIFF_TYPE_DAY = 4;
    public static final int DIFF_TYPE_HOUR = 3;
    public static final int DIFF_TYPE_MINUTE = 2;
    public static final int DIFF_TYPE_MONTH = 5;
    public static final int DIFF_TYPE_SEC = 1;
    public static final String EXTENDSTEP_PATTERN = "yyyy-MM-dd-HH-mm";
    public static final int HOUR_MINUTES_LENGTH = 60;
    public static final int HOUR_SEC_LENGTH = 3600;
    public static final long HOUR_TIMESTAMP_LENGTH = 3600000;
    public static final int MINUTES_SEC_LENGTH = 60;
    public static final long MINUTE_TIMESTAMP_LENGTH = 60000;
    public static final long MIN_CLICK_INTERVAL_TIME = 500;
    public static final int MONTH_DAY_LENGTH = 30;
    public static final long SEC_TIMESTAMP_LENGTH = 1000;
    public static final int WEEK_DAY_LENGTH = 7;
    public static final int YEAR_MONTH_LENGTH = 12;
    public static final DateTimeFormatter HEALT_YMD_TIME = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static ThreadLocal<SimpleDateFormat> a = new ThreadLocal<>();
    public static final DecimalFormatSymbols TIME_FORMAT_LOCALE_CN_SYMBOL = new DecimalFormatSymbols(Locale.CHINA);
    public static final DecimalFormat TIME_WITH_ZERO_FORMAT = new DecimalFormat("00");
    public static final DecimalFormat TIME_DEFAULT_DECIMAL_FORMAT = new DecimalFormat("0");
    public static final DecimalFormat TIME_ONE_DECIMAL_FORMAT = new DecimalFormat(GLUtils.VERSION_UNKNOWN);
    public static final DecimalFormat TIME_TWO_DECIMAL_FORMAT = new DecimalFormat("0.00");

    public static String a(long j2, String str) {
        try {
            q().applyPattern(str);
            return q().format(new Date(j2));
        } catch (Exception e2) {
            a7b.b("dateFormat", e2.getMessage());
            return String.valueOf(j2);
        }
    }

    public static String b(long j2, String str, TimeZone timeZone) {
        Date date = new Date(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }

    public static String c(String str, String str2, String str3) {
        long jI = i(str, str2);
        return 0 == jI ? str : a(jI, str3);
    }

    public static String d(long j2) {
        return new SimpleDateFormat(EXTENDSTEP_PATTERN, Locale.ENGLISH).format(Long.valueOf(j2));
    }

    public static long e(String str) {
        try {
            return LocalDate.parse(str, HEALT_YMD_TIME).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        } catch (Exception e2) {
            a7b.b("dateStrToTimeStamp() error", e2.getMessage());
            return 0L;
        }
    }

    public static String f(LocalDate localDate, String str) {
        return fn9.g(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), str);
    }

    public static String g(String str) {
        q().applyPattern(str);
        return q().format(new Date(System.currentTimeMillis()));
    }

    public static Date h(String str, String str2) {
        q().applyPattern(str2);
        try {
            return q().parse(str);
        } catch (NullPointerException | ParseException unused) {
            return new Date();
        }
    }

    public static long i(String str, String str2) {
        q().applyPattern(str2);
        try {
            return q().parse(str).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static int j(long j2) {
        LocalDateTime localDateTimeK = k(j2);
        return (localDateTimeK.getYear() * 10000) + (localDateTimeK.getMonthValue() * 100) + localDateTimeK.getDayOfMonth();
    }

    public static LocalDateTime k(long j2) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault());
    }

    public static int l(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.setTimeZone(TimeZone.getDefault());
        return calendar.get(5);
    }

    public static int m(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        int i = calendar.get(7) - 1;
        if (i == 0) {
            return 7;
        }
        return i;
    }

    public static long n(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long o(long j2, long j3) {
        return Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().toEpochDay());
    }

    public static int p(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return calendar.get(2) + 1;
    }

    public static SimpleDateFormat q() {
        SimpleDateFormat simpleDateFormat = a.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
        a.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static int r(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return calendar.get(1);
    }

    public static String s(Long l2) {
        return DateUtils.formatDateTime(b78.a(), l2.longValue(), 17);
    }

    public static String t(LocalDate localDate) {
        Context contextA = b78.a();
        String[] strArr = {contextA.getString(R$string.lib_base_date_monday), contextA.getString(R$string.lib_base_date_tuesday), contextA.getString(R$string.lib_base_date_wednesday), contextA.getString(R$string.lib_base_date_thursday), contextA.getString(R$string.lib_base_date_friday), contextA.getString(R$string.lib_base_date_saturday), contextA.getString(R$string.lib_base_date_sunday)};
        return localDate.getYear() == LocalDate.now().getYear() ? String.format("%s，%s", f(localDate, "MMMdd"), strArr[localDate.getDayOfWeek().getValue() - 1]) : String.format("%s，%s", f(localDate, "yyyyMMMdd"), strArr[localDate.getDayOfWeek().getValue() - 1]);
    }
}
