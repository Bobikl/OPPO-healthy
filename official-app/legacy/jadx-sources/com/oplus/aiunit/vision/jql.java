package com.oplus.aiunit.vision;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class jql {
    public static Date a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTime(date);
        calendar.set(7, calendar.getFirstDayOfWeek());
        return calendar.getTime();
    }

    public static Date b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTime(date);
        calendar.set(7, calendar.getFirstDayOfWeek() + 6);
        return calendar.getTime();
    }
}
