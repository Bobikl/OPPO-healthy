package com.oplus.aiunit.vision;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class ayj {
    public static int HOUR = 3600000;
    public static int MIN = 60000;
    public static final String TAG = "TimeFormatUtils";

    public static String a() {
        try {
            String[] strArrSplit = ukj.a("persist.sys.timezone").split("/");
            return strArrSplit[strArrSplit.length - 1].replace("_", " ");
        } catch (Exception e2) {
            a7b.b("TimeFormatUtils", "[getDefaultTimezoneCity] --> " + e2.getMessage());
            return "";
        }
    }

    public static int b(TimeZone timeZone) {
        if (timeZone == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        return timeZone.getRawOffset() + (timeZone.inDaylightTime(calendar.getTime()) ? timeZone.getDSTSavings() : 0);
    }

    public static String c(int i) {
        return String.format("%s%+02d%s%02d", v05.TIME_ZONE_0, Integer.valueOf((i / HOUR) % 24), ":", Integer.valueOf(Math.abs((i / MIN) % 60)));
    }
}
