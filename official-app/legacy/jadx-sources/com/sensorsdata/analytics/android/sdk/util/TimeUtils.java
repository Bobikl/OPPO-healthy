package com.sensorsdata.analytics.android.sdk.util;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TimeUtils {
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    private static final String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
    public static Locale SDK_LOCALE = Locale.CHINA;
    private static Map<String, ThreadLocal<SimpleDateFormat>> formatMaps = new HashMap();

    public static Float duration(long j2, long j3) {
        long j4 = j3 - j2;
        try {
            return (j4 < 0 || j4 > 86400000) ? Float.valueOf(0.0f) : Float.valueOf(Math.round(j4) / 1000.0f);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return Float.valueOf(0.0f);
        }
    }

    public static String formatDate(Date date) {
        return formatDate(date, YYYY_MM_DD_HH_MM_SS_SSS);
    }

    public static String formatTime(long j2) {
        return formatTime(j2, SDK_LOCALE);
    }

    private static synchronized SimpleDateFormat getDateFormat(final String str, final Locale locale) {
        ThreadLocal<SimpleDateFormat> threadLocal;
        Map<String, ThreadLocal<SimpleDateFormat>> map = formatMaps;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(locale == null ? SDK_LOCALE.getCountry() : locale.getCountry());
        threadLocal = map.get(sb.toString());
        if (threadLocal == null) {
            threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.sensorsdata.analytics.android.sdk.util.TimeUtils.1
                @Override // java.lang.ThreadLocal
                public SimpleDateFormat initialValue() {
                    try {
                        return locale == null ? new SimpleDateFormat(str, TimeUtils.SDK_LOCALE) : new SimpleDateFormat(str, locale);
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                        return null;
                    }
                }
            };
            if (threadLocal.get() != null) {
                Map<String, ThreadLocal<SimpleDateFormat>> map2 = formatMaps;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("_");
                sb2.append(locale == null ? SDK_LOCALE.getCountry() : locale.getCountry());
                map2.put(sb2.toString(), threadLocal);
            }
        }
        return threadLocal.get();
    }

    public static Integer getZoneOffset() {
        try {
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            return Integer.valueOf((-(calendar.get(15) + calendar.get(16))) / 60000);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public static boolean isDateValid(Date date) {
        try {
            return date.after(getDateFormat(YYYY_MM_DD_HH_MM_SS_SSS, SDK_LOCALE).parse("2015-05-15 10:24:00.000"));
        } catch (ParseException e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public static String formatDate(Date date, String str) {
        return formatDate(date, str, SDK_LOCALE);
    }

    public static String formatTime(long j2, String str) {
        return formatTime(j2, str, SDK_LOCALE);
    }

    public static String formatDate(Date date, Locale locale) {
        return formatDate(date, YYYY_MM_DD_HH_MM_SS_SSS, locale);
    }

    public static String formatTime(long j2, Locale locale) {
        return formatTime(j2, null, locale);
    }

    public static String formatDate(Date date, String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            str = YYYY_MM_DD_HH_MM_SS_SSS;
        }
        SimpleDateFormat dateFormat = getDateFormat(str, locale);
        if (dateFormat == null) {
            return "";
        }
        try {
            return dateFormat.format(date);
        } catch (IllegalArgumentException e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public static String formatTime(long j2, String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            str = YYYY_MM_DD_HH_MM_SS_SSS;
        }
        SimpleDateFormat dateFormat = getDateFormat(str, locale);
        if (dateFormat == null) {
            return "";
        }
        try {
            return dateFormat.format(Long.valueOf(j2));
        } catch (IllegalArgumentException e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public static Float duration(float f) {
        return Float.valueOf(Math.round(f) / 1000.0f);
    }

    public static boolean isDateValid(long j2) {
        try {
            Date date = getDateFormat(YYYY_MM_DD_HH_MM_SS_SSS, SDK_LOCALE).parse("2015-05-15 10:24:00.000");
            return date != null && date.getTime() < j2;
        } catch (ParseException e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public static JSONObject formatDate(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Date) {
                    jSONObject.put(next, formatDate((Date) obj, SDK_LOCALE));
                }
            }
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
        return jSONObject;
    }
}
