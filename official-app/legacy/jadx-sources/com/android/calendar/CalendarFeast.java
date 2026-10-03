package com.android.calendar;

/* JADX INFO: loaded from: classes12.dex */
public class CalendarFeast {
    static final int LUNAR_FEAST_COUNT = 11;
    static final int OTHER_SOLAR_FEAST_COUNT = 6;
    static final int SOLAR_FEAST_COUNT = 11;
    static final int SOLAR_TERM_COUNT = 24;

    static {
        System.loadLibrary("calendar_feast");
    }

    public static native int getGvFeast2(int i, int i2);

    public static native int getGvFeastN(int i, int i2);

    public static native int getLeapMonth(int i);

    public static native int getLunarFeast(int i, int i2, int i3);

    public static native long getLunarMonthDays(int i, int i2);

    public static native int getMonthDays(int i, int i2);

    public static native int getOtherSolarFeast(int i, int i2, int i3);

    public static native int getSolarFeast(int i, int i2, int i3);

    public static native int getSolarTerm(int i, int i2, int i3);

    public static native int getTicketsDayFeast2(int i, int i2);

    public static native int getWeekDay(int i, int i2, int i3);
}
