package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.heytap.health.base.calendar.CalendarBean;
import com.heytap.health.base.calendar.CalendarLogUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class fr2 {
    public static long a(Context context) {
        a7b.f("CalendarUtils", "add calendar account begin");
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", vp2.CALENDAR_NAME_DEFAULT);
        contentValues.put("account_name", vp2.CALENDAR_ACCOUNT_NAME_DEFAULT);
        contentValues.put("account_type", vp2.CALENDAR_ACCOUNT_TYPE_DEFAULT);
        contentValues.put("calendar_displayName", vp2.CALENDAR_DISPLAY_NAME_DEFAULT);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_access_level", "calendar_access_level");
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", vp2.CALENDAR_ACCOUNT_NAME_DEFAULT);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(vp2.CALENDAR_URL).buildUpon().appendQueryParameter("caller_is_syncadapter", SpeechConstant.TRUE_STR).appendQueryParameter("account_name", vp2.CALENDAR_ACCOUNT_NAME_DEFAULT).appendQueryParameter("account_type", vp2.CALENDAR_ACCOUNT_TYPE_DEFAULT).build(), contentValues);
        long id = uriInsert == null ? -1L : ContentUris.parseId(uriInsert);
        a7b.f("CalendarUtils", "add calendar account end, id: " + id);
        return id;
    }

    public static Uri b(Context context, zq2 zq2Var) {
        a7b.f("CalendarUtils", "add calendar event begin");
        if (context == null) {
            return null;
        }
        int iC = c(context);
        if (iC < 0) {
            a7b.f("CalendarUtils", "add calendar event, call id < 0");
            return null;
        }
        zq2Var.a().put("calendar_id", Integer.valueOf(iC));
        zq2Var.a().put("hasAlarm", (Integer) 1);
        zq2Var.a().put("eventTimezone", TimeZone.getDefault().getID());
        Uri uriC = new mq2(zq2Var).c();
        if (uriC == null) {
            a7b.f("CalendarUtils", "add calendar event, insert uri is null");
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(of5.ARG_EVENT_ID, Long.valueOf(ContentUris.parseId(uriC)));
        contentValues.put("minutes", Long.valueOf(zq2Var.b()));
        contentValues.put("method", (Integer) 1);
        a7b.f("CalendarUtils", "addCalendarEvent contentValues:" + contentValues);
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(vp2.CALENDAR_REMINDER_URL), contentValues);
        if (uriInsert == null) {
            a7b.f("CalendarUtils", "add calendar event, reminder uri is null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("add calendar event, add reminder success, reminder uri is :");
        sb.append(uriInsert.toString());
        return uriC;
    }

    public static int c(Context context) {
        int iD = d(context);
        if (iD >= 0) {
            a7b.f("CalendarUtils", "oldId:" + iD);
            return iD;
        }
        if (a(context) < 0) {
            return -1;
        }
        a7b.f("CalendarUtils", "addId:" + iD);
        return d(context);
    }

    public static int d(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(vp2.CALENDAR_URL), null, null, null, null);
        try {
            if (cursorQuery == null) {
                a7b.f("CalendarUtils", "check calendar account, user cursor is null");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return -1;
            }
            int count = cursorQuery.getCount();
            a7b.f("CalendarUtils", "check calendar account, user cursor count:" + count);
            if (count > 0) {
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex("_id");
                if (columnIndex < 0) {
                    cursorQuery.close();
                    return -1;
                }
                int i = cursorQuery.getInt(columnIndex);
                a7b.f("CalendarUtils", "check calendar account, id:" + i);
                cursorQuery.close();
                return i;
            }
            return -1;
        } catch (Exception e2) {
            a7b.b("CalendarUtils", "check calendar account , exception, message: " + e2.getMessage());
            return -1;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static int e(Context context, zq2 zq2Var) {
        if (context == null) {
            return -1;
        }
        a7b.f("CalendarUtils", "deleteCalendar param:" + zq2Var);
        int iA = new mq2(zq2Var).a();
        a7b.f("CalendarUtils", "delete calendar event end, count:" + iA);
        return iA;
    }

    @SuppressLint({"Range"})
    public static List<CalendarBean> f(Context context, zq2 zq2Var) {
        String str = "_id";
        a7b.f("CalendarUtils", "query calendar event begin");
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        Cursor cursorD = new mq2(zq2Var).d();
        if (cursorD == null || cursorD.getCount() == 0) {
            a7b.f("CalendarUtils", "query calendar event, cursor is null or cursor's count is 0");
            if (cursorD != null) {
                cursorD.close();
            }
            return arrayList;
        }
        CalendarLogUtils calendarLogUtils = new CalendarLogUtils();
        while (cursorD.moveToNext()) {
            try {
                try {
                    int i = cursorD.getInt(cursorD.getColumnIndex(str));
                    String string = cursorD.getString(cursorD.getColumnIndex("account_name"));
                    String string2 = cursorD.getString(cursorD.getColumnIndex("calendar_displayName"));
                    String string3 = cursorD.getString(cursorD.getColumnIndex("account_type"));
                    String string4 = cursorD.getString(cursorD.getColumnIndex(str));
                    String string5 = cursorD.getString(cursorD.getColumnIndex("title"));
                    String string6 = cursorD.getString(cursorD.getColumnIndex(iim.a.f));
                    String string7 = cursorD.getString(cursorD.getColumnIndex("eventLocation"));
                    String string8 = cursorD.getString(cursorD.getColumnIndex("dtstart"));
                    String string9 = cursorD.getString(cursorD.getColumnIndex("dtend"));
                    String string10 = cursorD.getString(cursorD.getColumnIndex("deleted"));
                    calendarLogUtils.a(cursorD);
                    String str2 = str;
                    if (!string10.equals("1")) {
                        CalendarBean calendarBean = new CalendarBean();
                        calendarBean.setCalendarId(i);
                        calendarBean.setCalendAccountName(string);
                        calendarBean.setCalendarDisplayName(string2);
                        calendarBean.setAccountType(string3);
                        calendarBean.setId(string4);
                        calendarBean.setEventTitle(string5);
                        calendarBean.setEventDescription(string6);
                        calendarBean.setEventLocation(string7);
                        calendarBean.setEventDtStart(string8);
                        calendarBean.setEventDtEnd(string9);
                        calendarBean.setDeleteFlag(string10);
                        arrayList.add(calendarBean);
                    }
                    str = str2;
                } catch (Exception e2) {
                    a7b.b("CalendarUtils", e2.toString());
                }
            } catch (Throwable th) {
                cursorD.close();
                throw th;
            }
        }
        cursorD.close();
        a7b.f("CalendarUtils", "query calendar event, list :" + arrayList.toString());
        return arrayList;
    }

    public static int g(Context context, zq2 zq2Var, ContentValues contentValues) {
        a7b.f("CalendarUtils", "update calendar event begin");
        if (context == null) {
            return -1;
        }
        Iterator<Map.Entry<String, Object>> it = contentValues.valueSet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            if (next.getValue() == null && !next.getKey().equals("dtend")) {
                it.remove();
            }
        }
        int iE = new mq2(zq2Var).e(contentValues);
        a7b.f("CalendarUtils", "update calendar event end, count:" + iE);
        return iE;
    }
}
