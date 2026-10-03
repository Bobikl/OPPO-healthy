package com.oplus.statistics.storage;

import android.content.Context;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PreferenceHandler {
    public static final String ACTIVITY_END_TIME = "activity.end.time";
    public static final String ACTIVITY_START_TIME = "activity.start.time";
    public static final String CURRENT_ACTIVITY = "current.activity";
    public static final String EVENT_START = "event.start";
    public static final String KVEVENT_START = "kv.start";
    public static final String PAGEVISIT_DURATION = "pagevisit.duration";
    public static final String PAGEVISIT_ROUTES = "pagevisit.routes";
    public static final String SESSION_TIMEOUT = "session.timeout";
    public static final int SESSION_TIMEOUT_DEFAULT = 30;
    public static final String SSOID = "ssoid";
    public static final MemoryPreference a = new MemoryPreference();

    public static long getActivityEndTime(Context context) {
        return a.getLong(ACTIVITY_END_TIME, -1L);
    }

    public static long getActivityStartTime(Context context) {
        return a.getLong(ACTIVITY_START_TIME, -1L);
    }

    public static String getCurrentActivity(Context context) {
        return a.getString(CURRENT_ACTIVITY, "");
    }

    public static long getEventStart(Context context, String str, String str2) {
        return a.getLong(EVENT_START + str + "_" + str2, 0L);
    }

    public static String getKVEventStart(Context context, String str, String str2) {
        return a.getString(KVEVENT_START + str + "_" + str2, "");
    }

    public static long getLong(Context context, String str, long j) {
        return a.getLong(str, j);
    }

    public static int getPageVisitDuration(Context context) {
        return a.getInt(PAGEVISIT_DURATION, 0);
    }

    public static String getPageVisitRoutes(Context context) {
        return a.getString(PAGEVISIT_ROUTES, "");
    }

    public static int getSessionTimeout(Context context) {
        return a.getInt(SESSION_TIMEOUT, 30);
    }

    public static String getSsoID(Context context) {
        return a.getString(SSOID, "0");
    }

    public static String getString(Context context, String str, String str2) {
        return a.getString(str, str2);
    }

    public static void setActivityEndTime(Context context, long j) {
        a.setLong(ACTIVITY_END_TIME, j);
    }

    public static void setActivityStartTime(Context context, long j) {
        a.setLong(ACTIVITY_START_TIME, j);
    }

    public static void setCurrentActivity(Context context, String str) {
        a.setString(CURRENT_ACTIVITY, str);
    }

    public static void setEventStart(Context context, String str, String str2, long j) {
        a.setLong(EVENT_START + str + "_" + str2, j);
    }

    public static void setKVEventStart(String str, String str2, String str3) {
        a.setString(KVEVENT_START + str + "_" + str3, str2);
    }

    public static void setLong(Context context, String str, long j) {
        a.setLong(str, j);
    }

    public static void setPageVisitDuration(Context context, int i) {
        a.setInt(PAGEVISIT_DURATION, i);
    }

    public static void setPageVisitRoutes(Context context, String str) {
        a.setString(PAGEVISIT_ROUTES, "");
    }

    public static void setSessionTimeout(Context context, int i) {
        a.setInt(SESSION_TIMEOUT, i);
    }

    public static void setSsoID(Context context, String str) {
        a.setString(SSOID, str);
    }

    public static void setString(Context context, String str, String str2) {
        a.setString(str, str2);
    }

    public static void setSsoID(Context context) {
        a.setString(SSOID, "0");
    }
}
