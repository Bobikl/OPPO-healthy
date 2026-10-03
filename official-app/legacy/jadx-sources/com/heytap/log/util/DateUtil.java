package com.heytap.log.util;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes19.dex */
public class DateUtil {
    public static final String DATEFORMATDAY = "yyyy-MM-dd";
    public static final String DATEFORMATHOUR = "yyyy-MM-dd HH";
    public static final String DATEFORMATMILLISECOND = "yyyy-MM-dd HH:mm:ss SSS";
    public static final String DATEFORMATMINUTE = "yyyy-MM-dd HH:mm";
    public static final String DATEFORMATMONTH = "yyyy-MM";
    public static final String DATEFORMATSECOND = "yyyy-MM-dd HH:mm:ss";
    public static final String DATEFORMATYEAR = "yyyy";

    public static String format(Date date, String str) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(str).format(date);
    }

    public static String getBeforMinutesSysDate(int i) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, -i);
        return format(calendar.getTime(), DATEFORMATMINUTE);
    }

    public static String getDayFirstSecond(Date date) {
        if (date == null) {
            return null;
        }
        return format(date, "yyyy-MM-dd") + " 00:00:00";
    }

    public static Date getDayFirstTime(Date date) throws Exception {
        if (date == null) {
            return null;
        }
        return parase(format(date, "yyyy-MM-dd") + " 00:00:00 000", DATEFORMATMILLISECOND);
    }

    public static String getDayLastSecond(Date date) {
        if (date == null) {
            return null;
        }
        return format(date, "yyyy-MM-dd") + " 23:59:59";
    }

    public static Date getDayLastTime(Date date) throws Exception {
        if (date == null) {
            return null;
        }
        return parase(format(date, "yyyy-MM-dd") + " 23:59:59 999", DATEFORMATMILLISECOND);
    }

    public static Date getEndDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.getActualMaximum(5));
        return calendar.getTime();
    }

    public static Date getFirstDayOfNextYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(1, 1);
        calendar.set(6, 1);
        return calendar.getTime();
    }

    public static Date getFirstDayOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(6, 1);
        return calendar.getTime();
    }

    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.add(2, 1);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static Date getLastDayOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(6, calendar.getActualMaximum(6));
        return calendar.getTime();
    }

    public static String getLastMonthToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, calendar.get(2) - 1);
        return format(calendar.getTime(), "yyyy-MM-dd");
    }

    public static String getLastMonthTodayToSecond() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, calendar.get(2) - 1);
        return format(calendar.getTime(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getLastWeekToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -7);
        return format(calendar.getTime(), "yyyy-MM-dd");
    }

    public static String getLastWeekTodayToSecond() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -7);
        return format(calendar.getTime(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getMinuteSysDate() throws ParseException {
        return format(Calendar.getInstance().getTime(), DATEFORMATMINUTE);
    }

    public static Date getMonday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(7, 2);
        return calendar.getTime();
    }

    public static Date getNextDay(Date date) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, 1);
        return parase(format(calendar.getTime(), "yyyy-MM-dd"), "yyyy-MM-dd");
    }

    public static Date getStartDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date getStartDayOfNextMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, 1);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date getSunday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (7 == calendar.getFirstDayOfWeek()) {
            return date;
        }
        calendar.add(6, 7);
        calendar.set(7, 1);
        return calendar.getTime();
    }

    public static Date getSysDate() {
        return Calendar.getInstance().getTime();
    }

    public static String getToday() {
        return format(Calendar.getInstance().getTime(), "yyyy-MM-dd");
    }

    public static String getTodayToSecond() {
        return format(Calendar.getInstance().getTime(), "yyyy-MM-dd HH:mm:ss");
    }

    public static Date getTomorrow() throws ParseException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(getSysDate());
        gregorianCalendar.add(5, 1);
        return parase(format(gregorianCalendar.getTime(), "yyyy-MM-dd"), "yyyy-MM-dd");
    }

    public static Date getYestoday(String str) throws ParseException {
        if (str == null || str.length() <= 0) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(parase(str, "yyyy-MM-dd"));
        gregorianCalendar.add(5, -1);
        return parase(format(gregorianCalendar.getTime(), "yyyy-MM-dd"), "yyyy-MM-dd");
    }

    public static Date parase(String str, String str2) throws ParseException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new SimpleDateFormat(str2).parse(str);
    }

    public static String str_to_date_minute(String str) {
        return " str_to_date('" + str + "','%Y-%m-%d %H:%i') ";
    }

    public static String str_to_date_second(String str) {
        return " str_to_date('" + str + "','%Y-%m-%d %H:%i:%s') ";
    }

    public static Date string2Date(String str) throws ParseException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Date(new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
    }

    public static String getDayFirstSecond(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return getDayFirstSecond(string2Date(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getDayLastSecond(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            return getDayLastSecond(string2Date(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static Date getEndDayOfMonth(String str) throws ParseException {
        Date date = new SimpleDateFormat(DATEFORMATMONTH).parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.getActualMaximum(5));
        return calendar.getTime();
    }

    public static Date getFirstDayOfYear(String str) throws ParseException {
        Date dateParase = parase(str, "yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateParase);
        calendar.set(6, 1);
        return calendar.getTime();
    }

    public static Date getLastDayOfYear(String str) throws ParseException {
        Date dateParase = parase(str, "yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateParase);
        calendar.set(6, calendar.getActualMaximum(6));
        return calendar.getTime();
    }

    public static Date getStartDayOfMonth(String str) throws ParseException {
        Date date = new SimpleDateFormat(DATEFORMATMONTH).parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date getFirstDayOfNextYear(String str) throws ParseException {
        Date dateParase = parase(str, "yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateParase);
        calendar.add(1, 1);
        calendar.set(6, 1);
        return calendar.getTime();
    }

    public static Date getStartDayOfNextMonth(String str) throws ParseException {
        Date dateParase = parase(str, DATEFORMATMONTH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateParase);
        calendar.add(2, 1);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date getLastDayOfMonth(String str) throws ParseException {
        Date date = new SimpleDateFormat(DATEFORMATMONTH).parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.add(2, 1);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static String getYestoday() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        return format(calendar.getTime(), DATEFORMATMINUTE);
    }
}
