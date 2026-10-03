package com.heytap.store.base.core.util;

import android.content.Context;
import com.heytap.connect.TapConst;
import com.heytap.log.util.DateUtil;
import com.heytap.store.base.core.R;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.v05;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class TimeUtil {
    public static final int ALREADY_HAPPENED = -1;
    public static final int HAPPEN_AFTER_THIS_YEAR = 5;
    public static final int HAPPEN_AFTER_TOMORROW = 4;
    public static final int HAPPEN_TOMORROW = 3;
    public static final int LESS_THAN_A_HOUR = 1;
    public static final int MORE_THAN_A_HOUR = 2;
    private static final long TIME_GAP_DAY = 86400000;
    private static final long TIME_GAP_HOUR = 3600000;
    private static final long TIME_GAP_MIN = 60000;
    private static final long TIME_SAMPLE = 1000000000000L;

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

    public static int compareData(long j2, long j3) {
        return (int) ((dateToStamp(stampToDate(j3)) - dateToStamp(stampToDate(j2))) / 86400000);
    }

    public static String currentDateString() {
        return new SimpleDateFormat(v05.DATE_FORMAT_14, Locale.US).format(new Date());
    }

    public static long dateDiffDay(Long l2, Long l3) {
        try {
            long jLongValue = (l3.longValue() - l2.longValue()) / 3600000;
            if (jLongValue > 0) {
                return jLongValue;
            }
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static long dateToStamp(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    private static long diffMonth(Long l2, Long l3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2.longValue());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(l3.longValue());
        return calendar2.get(2) - calendar.get(2);
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
        if (iCalculateTimeDistance == 1) {
            return formatAppointmentDateWhenCountDown(lValueOf, lValueOf2);
        }
        if (iCalculateTimeDistance == 2) {
            return String.format(ContextGetterUtils.INSTANCE.getApp().getString(R.string.hour_minute), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
        }
        if (iCalculateTimeDistance == 3) {
            return String.format(ContextGetterUtils.INSTANCE.getApp().getString(R.string.tomorrow_hour_minute), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
        }
        if (iCalculateTimeDistance == 4) {
            return String.format(ContextGetterUtils.INSTANCE.getApp().getString(R.string.after_tomorrow_month_day_hour_minute), formatMonth(calendar.get(2)), formatDate2(calendar.get(5)), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
        }
        if (iCalculateTimeDistance != 5) {
            return null;
        }
        return String.format(ContextGetterUtils.INSTANCE.getApp().getString(R.string.after_year_month_day_hour_minute), formatMonth(calendar.get(2)), formatDate2(calendar.get(5)), formatHour(calendar.get(11)), formatMinute(calendar.get(12)));
    }

    public static String formatAppointmentDateWhenCountDown(Long l2, Long l3) {
        Long lValueOf = Long.valueOf(l2 == null ? 0L : l2.longValue());
        Long lValueOf2 = Long.valueOf(l3 != null ? l3.longValue() : 0L);
        if (calculateTimeDistance(lValueOf, lValueOf2) != 1) {
            return null;
        }
        long jLongValue = (lValueOf.longValue() - lValueOf2.longValue()) / 1000;
        return String.format(ContextGetterUtils.INSTANCE.getApp().getString(R.string.minute_second), formatMinute((int) (jLongValue / 60)), formatSecond((int) (jLongValue % 60)));
    }

    private static String formatDate(int i) {
        if (i <= 0 || i >= 10) {
            return i + "";
        }
        return "0" + i;
    }

    private static String formatDate2(int i) {
        return i + "";
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

    public static String getCustormFormatTime(long j2, SimpleDateFormat simpleDateFormat) {
        if (j2 < TIME_SAMPLE) {
            j2 *= 1000;
        }
        return simpleDateFormat.format(new Date(j2));
    }

    public static String getDetailTime(long j2) {
        if (j2 < TIME_SAMPLE) {
            j2 *= 1000;
        }
        return new SimpleDateFormat(DateUtil.DATEFORMATMINUTE).format(new Date(j2));
    }

    public static String getDetailTime2(long j2) {
        if (j2 < TIME_SAMPLE) {
            j2 *= 1000;
        }
        return new SimpleDateFormat("yyyy.MM.dd HH:mm").format(new Date(j2));
    }

    public static String getFormatDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1) + "" + formatMonth(calendar.get(2)) + formatDate(calendar.get(5));
    }

    public static String getGoodsDetailTime(long j2) {
        if (j2 < TIME_SAMPLE) {
            j2 *= 1000;
        }
        return new SimpleDateFormat("yyyy年MM月dd日 HH:mm").format(new Date(j2));
    }

    public static String getHMTime(long j2) {
        if (j2 < TIME_SAMPLE) {
            j2 *= 1000;
        }
        return new SimpleDateFormat(v05.DATE_FORMAT_HOUR).format(new Date(j2));
    }

    public static long getMSTimeValue() {
        return System.currentTimeMillis() / 1000;
    }

    public static long getStringToMills(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String getTime(long j2) {
        if (j2 < TIME_SAMPLE) {
            j2 *= 1000;
        }
        return new SimpleDateFormat("MM-dd HH:mm").format(new Date(j2));
    }

    public static String getTime1(long j2) {
        return getTime1(j2, false, false, false, false);
    }

    public static String getTime2(long j2) {
        String str;
        String str2;
        String str3;
        long j3 = j2 / 1000;
        long j4 = j3 / 86400;
        long j5 = j3 % 86400;
        long j6 = j5 / TapConst.IP_TTL_DEFAULT;
        if (j4 >= 1) {
            j6 += 24 * j4;
        }
        if (j6 < 10) {
            str = "0" + j6;
        } else {
            str = "" + j6;
        }
        long j7 = j5 % TapConst.IP_TTL_DEFAULT;
        long j8 = j7 / 60;
        if (j8 < 10) {
            str2 = "0" + j8;
        } else {
            str2 = "" + j8;
        }
        long j9 = j7 % 60;
        if (j9 < 10) {
            str3 = "0" + j9;
        } else {
            str3 = "" + j9;
        }
        if (j4 > 0) {
            return str + " : " + str2 + " : " + str3;
        }
        return str + " : " + str2 + " : " + str3;
    }

    public static String getTime3(long j2) {
        String str;
        String str2;
        String str3;
        long j3 = j2 / 1000;
        long j4 = j3 / 86400;
        long j5 = j3 % 86400;
        long j6 = j5 / TapConst.IP_TTL_DEFAULT;
        if (j4 >= 1) {
            j6 += 24 * j4;
        }
        if (j6 < 10) {
            str = "0" + j6;
        } else {
            str = "" + j6;
        }
        long j7 = j5 % TapConst.IP_TTL_DEFAULT;
        long j8 = j7 / 60;
        if (j8 < 10) {
            str2 = "0" + j8;
        } else {
            str2 = "" + j8;
        }
        long j9 = j7 % 60;
        if (j9 < 10) {
            str3 = "0" + j9;
        } else {
            str3 = "" + j9;
        }
        if (j4 > 0) {
            return str + ":" + str2 + ":" + str3;
        }
        return str + ":" + str2 + ":" + str3;
    }

    public static String getTime4(long j2) {
        long j3 = j2 / 1000;
        return (j3 / 86400) + "天" + ((j3 % 86400) / TapConst.IP_TTL_DEFAULT) + "小时";
    }

    public static Boolean getTimeDay(long j2) {
        return j2 > 172800000 ? Boolean.TRUE : Boolean.FALSE;
    }

    public static String getTimeHm(long j2) {
        return getTime1(j2, true, false, false, false);
    }

    public static String getTimeHms(long j2) {
        return getTime1(j2, false, true, false, false);
    }

    public static String getTimeMs(long j2) {
        return getTime1(j2, false, false, true, false);
    }

    public static String getTimeWithUnit(long j2) {
        return getTime1(j2, false, false, false, true);
    }

    public static long getTodayStart(Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(9, 0);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long time = 0;
        try {
            Date time2 = calendar.getTime();
            if (time2 != null) {
                time = time2.getTime();
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        return time / 1000;
    }

    public static boolean isHappenToday(long j2, long j3) {
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
        calendar.add(5, 1);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar2.get(5) == calendar.get(5);
    }

    public static String stampToDate(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(j2));
    }

    public static String getTime1(long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        String str2;
        String str3;
        long j3 = j2 / 1000;
        long j4 = j3 / 86400;
        long j5 = j3 % 86400;
        long j6 = j5 / TapConst.IP_TTL_DEFAULT;
        if (j6 < 10) {
            str = "0" + j6;
        } else {
            str = "" + j6;
        }
        long j7 = j5 % TapConst.IP_TTL_DEFAULT;
        long j8 = j7 / 60;
        if (j8 < 10) {
            str2 = "0" + j8;
        } else {
            str2 = "" + j8;
        }
        long j9 = j7 % 60;
        if (j9 < 10) {
            str3 = "0" + j9;
        } else {
            str3 = "" + j9;
        }
        if (z) {
            return str + ":" + str2;
        }
        if (z2) {
            return str + ":" + str2 + ":" + str3;
        }
        if (z3) {
            if (j6 <= 0) {
                return str2 + ":" + str3;
            }
            return str + ":" + str2 + ":" + str3;
        }
        if (j4 <= 0) {
            if (!z4) {
                return str + ":" + str2 + ":" + str3;
            }
            return str + "时" + str2 + "分" + str3 + "秒";
        }
        if (!z4) {
            return j4 + "天" + str + ":" + str2 + ":" + str3;
        }
        return j4 + "天" + str + "时" + str2 + "分" + str3 + "秒";
    }
}
