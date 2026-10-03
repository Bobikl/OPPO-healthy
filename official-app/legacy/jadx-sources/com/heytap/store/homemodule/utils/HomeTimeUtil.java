package com.heytap.store.homemodule.utils;

import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.home.R;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.util.Calendar;
import p010kotlin.Triple;

/* JADX INFO: loaded from: classes5.dex */
public class HomeTimeUtil {
    public static final int ALREADY_HAPPENED = -1;
    public static final int HAPPEN_AFTER_THIS_YEAR = 5;
    public static final int HAPPEN_AFTER_TOMORROW = 4;
    public static final int HAPPEN_TOMORROW = 3;
    public static final int LESS_THAN_A_HOUR = 1;
    public static final int MORE_THAN_A_HOUR = 2;

    public static int calculateTimeDistance(Long l2, Long l3) {
        Long lValueOf = Long.valueOf(l2 == null ? 0L : l2.longValue());
        Long lValueOf2 = Long.valueOf(l3 == null ? 0L : l3.longValue());
        if (lValueOf2.longValue() >= lValueOf.longValue()) {
            return -1;
        }
        if (dateDiffDay(lValueOf2, lValueOf) == 0) {
            return 1;
        }
        if (dateDiffDay(lValueOf2, lValueOf) > 0 && isHappenToday(lValueOf.longValue(), lValueOf2.longValue())) {
            return 2;
        }
        if (isHappenTomorrow(lValueOf.longValue(), lValueOf2.longValue())) {
            return 3;
        }
        return diffYear(lValueOf2, lValueOf) == 0 ? 4 : 5;
    }

    public static long dateDiffDay(Long l2, Long l3) {
        try {
            long jLongValue = (l3.longValue() - l2.longValue()) / 3600000;
            if (jLongValue > 0) {
                return jLongValue;
            }
            return 0L;
        } catch (Exception e2) {
            DataReportUtilKt.reportExceptionEvent(e2);
            e2.printStackTrace();
            return 0L;
        }
    }

    private static long diffYear(Long l2, Long l3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2.longValue());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(l3.longValue());
        return calendar2.get(1) - calendar.get(1);
    }

    public static String formatAppointmentDate(Long l2, Long l3) {
        Long lValueOf = Long.valueOf(l2 == null ? 0L : l2.longValue());
        Long lValueOf2 = Long.valueOf(l3 != null ? l3.longValue() : 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lValueOf.longValue());
        int iCalculateTimeDistance = calculateTimeDistance(lValueOf, lValueOf2);
        if (iCalculateTimeDistance != 1 && iCalculateTimeDistance != 2) {
            if (iCalculateTimeDistance == 3) {
                return String.format(ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.tomorrow_hour_minute), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
            }
            if (iCalculateTimeDistance == 4) {
                return String.format(ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.after_tomorrow_month_day_hour_minute), formatMonth(calendar.get(2)), formatDate2(calendar.get(5)), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
            }
            if (iCalculateTimeDistance != 5) {
                return null;
            }
            return String.format(ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.after_year_month_day_hour_minute), formatMonth(calendar.get(2)), formatDate2(calendar.get(5)), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
        }
        return String.format(ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.hour_minute), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
    }

    public static String formatAppointmentDateWhenCountDown(Long l2, Long l3) {
        Long lValueOf = Long.valueOf(l2 == null ? 0L : l2.longValue());
        Long lValueOf2 = Long.valueOf(l3 != null ? l3.longValue() : 0L);
        if (calculateTimeDistance(lValueOf, lValueOf2) != 1) {
            return null;
        }
        long jLongValue = (lValueOf.longValue() - lValueOf2.longValue()) / 1000;
        return String.format(ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.minute_second), formatMinute((int) (jLongValue / 60)), formatSecond((int) (jLongValue % 60)));
    }

    private static String formatDate2(int i) {
        return i + "";
    }

    public static Triple<String, String, String> formatDateWhenCountDown(Long l2, Long l3) {
        Long lValueOf = Long.valueOf(l2 == null ? 0L : l2.longValue());
        Long lValueOf2 = Long.valueOf(l3 != null ? l3.longValue() : 0L);
        if (calculateTimeDistance(lValueOf, lValueOf2) == -1) {
            return new Triple<>("00", "00", "00");
        }
        long jLongValue = (lValueOf.longValue() - lValueOf2.longValue()) / 1000;
        long j2 = (jLongValue / 60) / 60;
        String timeString = setTimeString(j2);
        long j3 = jLongValue - ((j2 * 60) * 60);
        long j4 = j3 / 60;
        return new Triple<>(timeString, setTimeString(j4), setTimeString(j3 - (j4 * 60)));
    }

    public static String formatHour(int i) {
        if (i < 0 || i >= 10) {
            return i + "";
        }
        return "0" + i;
    }

    public static String formatMinute(int i) {
        if (i < 0 || i >= 10) {
            return i + "";
        }
        return "0" + i;
    }

    private static String formatMonth(int i) {
        return (i + 1) + "";
    }

    public static String formatSecond(int i) {
        if (i < 0 || i >= 10) {
            return i + "";
        }
        return "0" + i;
    }

    private static boolean isHappenToday(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar2.get(5) - calendar.get(5) == 0;
    }

    private static boolean isHappenTomorrow(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar2.get(5) - calendar.get(5) == 1;
    }

    private static String setTimeString(long j2) {
        if (0 > j2 || j2 >= 10) {
            return j2 + "";
        }
        return "0" + j2;
    }
}
