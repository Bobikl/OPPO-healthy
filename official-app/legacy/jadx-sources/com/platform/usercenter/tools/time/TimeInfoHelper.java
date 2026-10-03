package com.platform.usercenter.tools.time;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.platform.usercenter.tools.Preconditions;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class TimeInfoHelper {
    private static final String COLON = ":";
    private static final String LINE = "-";
    private static final String TAG = "TimeInfoHelper";
    private static final String YYYY_MM = "yyyyMM";
    private static final String ZERO = "0";

    public static long date2Mills(String str) {
        return date2Mills(str, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDate(int i) {
        if (i <= 0 || i >= 10) {
            return i + "";
        }
        return "0" + i;
    }

    public static String formatMonth(int i) {
        int i2 = i + 1;
        if (i2 <= 0 || i2 >= 10) {
            return i2 + "";
        }
        return "0" + i2;
    }

    public static String formatTime(int i) {
        if (i < 0 || i >= 10) {
            return i + "";
        }
        return "0" + i;
    }

    public static int getAge(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(1) - calendar2.get(1);
        return (calendar2.get(6) - calendar.get(6) > 3 || calendar2.get(2) > calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) > calendar.get(5))) ? i - 1 : i;
    }

    public static Locale getCurrentLocale(Context context) {
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        return locales.size() != 0 ? locales.get(0) : Locale.CHINA;
    }

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static long getDayZero(int i) {
        Date date = new Date();
        return (date.getTime() - (((long) i) * 86400000)) - (date.getTime() % 86400000);
    }

    public static String getFormatDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getCurrentTime());
        return calendar.get(1) + "" + formatMonth(calendar.get(2)) + formatDate(calendar.get(5));
    }

    public static String getFormatDayTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getCurrentTime());
        return calendar.get(1) + "" + formatMonth(calendar.get(2)) + formatDate(calendar.get(5)) + formatTime(calendar.get(11));
    }

    public static String getFormatTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getCurrentTime());
        return calendar.get(1) + LINE + formatMonth(calendar.get(2)) + LINE + formatDate(calendar.get(5)) + " " + formatTime(calendar.get(11)) + ":" + formatTime(calendar.get(12)) + ":" + formatTime(calendar.get(13));
    }

    public static String getMouthDay(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return formatDate(calendar.get(5));
    }

    public static boolean inSameDay(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j3);
        return inSameDay(calendar, calendar2);
    }

    public static final boolean isToday(long j2) {
        return j2 >= getDayZero(0);
    }

    public static final boolean isYesterday(long j2) {
        return !isToday(j2) && j2 >= getDayZero(1);
    }

    public static String mills2YearMount(long j2) {
        return j2 <= 0 ? "" : DateFormat.format("yyyyMM", j2).toString();
    }

    public static String yearMouth2Date(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        long jYearMouth2mills = yearMouth2mills(context, str);
        return jYearMouth2mills <= 0 ? str : DateFormat.format("yyyy年MM月", jYearMouth2mills).toString();
    }

    public static long yearMouth2mills(Context context, String str) {
        Date date;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            date = new SimpleDateFormat("yyyyMM", Locale.getDefault()).parse(str);
        } catch (ParseException e2) {
            UCLogUtil.e(TAG, e2);
            date = null;
        }
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static long date2Mills(String str, String str2) {
        Date date;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                date = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            } catch (ParseException e2) {
                UCLogUtil.e(TAG, e2);
                date = null;
            }
            if (date != null) {
                return date.getTime();
            }
        }
        return 0L;
    }

    public static String getFormatTime(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return calendar.get(1) + LINE + formatMonth(calendar.get(2)) + LINE + formatDate(calendar.get(5)) + " " + formatTime(calendar.get(11)) + ":" + formatTime(calendar.get(12)) + ":" + formatTime(calendar.get(13));
    }

    public static final boolean inSameDay(Calendar calendar, Calendar calendar2) {
        Preconditions.checkNotNull(calendar);
        Preconditions.checkNotNull(calendar2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }
}
