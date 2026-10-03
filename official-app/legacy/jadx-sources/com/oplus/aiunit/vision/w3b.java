package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.heytap.health.watch.calendar.bean.CalendarBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class w3b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f18101c = new byte[0];
    public static volatile w3b d;
    public volatile SQLiteDatabase a = null;
    public volatile zp2 b = null;

    public static w3b f() {
        if (d == null) {
            synchronized (f18101c) {
                if (d == null) {
                    d = new w3b();
                }
            }
        }
        return d;
    }

    public final void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public boolean b() {
        SQLiteDatabase sQLiteDatabaseE = e();
        if (sQLiteDatabaseE == null) {
            return false;
        }
        sQLiteDatabaseE.delete("calendar_health", null, null);
        return true;
    }

    public boolean c(CalendarBean calendarBean) {
        SQLiteDatabase sQLiteDatabaseE = e();
        if (sQLiteDatabaseE == null || calendarBean == null) {
            return false;
        }
        String[] strArr = {String.valueOf(calendarBean.getEventId())};
        Cursor cursorQuery = sQLiteDatabaseE.query("calendar_health", null, "event_id = ? ", strArr, null, null, null);
        if (cursorQuery == null || cursorQuery.getCount() == 0) {
            a(cursorQuery);
            return true;
        }
        int iDelete = sQLiteDatabaseE.delete("calendar_health", "event_id = ? ", strArr);
        if (iDelete <= 0) {
            a(cursorQuery);
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("delete eventId ");
        sb.append(Arrays.toString(strArr));
        sb.append(" flag coloum:");
        sb.append(iDelete);
        a(cursorQuery);
        return true;
    }

    public final SQLiteDatabase d() {
        try {
            return this.b.getWritableDatabase();
        } catch (Exception e2) {
            a7b.b("CalHealth.LocalDbManager", "generateDb " + e2.getMessage());
            return null;
        }
    }

    public final SQLiteDatabase e() {
        if (this.a == null) {
            synchronized (w3b.class) {
                if (this.a == null) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i >= 3 || this.a != null) {
                            break;
                        }
                        this.a = d();
                        a7b.f("CalHealth.LocalDbManager", "getDatabaseRetry | db is " + this.a + " retry = " + i2);
                        i = i2;
                    }
                }
            }
        }
        return this.a;
    }

    public void finalize() throws Throwable {
        if (this.b != null) {
            this.b.close();
        }
        super.finalize();
    }

    @SuppressLint({"Range"})
    public final CalendarBean g(Cursor cursor) {
        CalendarBean calendarBean = new CalendarBean();
        calendarBean.setEventId(cursor.getInt(cursor.getColumnIndex(of5.ARG_EVENT_ID)));
        calendarBean.setTitle(cursor.getString(cursor.getColumnIndex("title")));
        calendarBean.setLocation(cursor.getString(cursor.getColumnIndex("eventLocation")));
        calendarBean.setDescription(cursor.getString(cursor.getColumnIndex(iim.a.f)));
        calendarBean.setStartTime(cursor.getLong(cursor.getColumnIndex("dtstart")));
        calendarBean.setEndTime(cursor.getLong(cursor.getColumnIndex("dtend")));
        calendarBean.setTimeZone(cursor.getString(cursor.getColumnIndex("eventTimezone")));
        calendarBean.setAllDay(cursor.getInt(cursor.getColumnIndex(HrvHistoryActivity.ALL_DAY)));
        calendarBean.setHasAlarm(cursor.getInt(cursor.getColumnIndex("hasAlarm")));
        calendarBean.setMethod(cursor.getInt(cursor.getColumnIndex("method")));
        calendarBean.setMinutes(cursor.getInt(cursor.getColumnIndex("minutes")));
        calendarBean.setRepeatType(cursor.getString(cursor.getColumnIndex("repeat_type")));
        calendarBean.setDuration(cursor.getString(cursor.getColumnIndex("duration")));
        calendarBean.setCalendarId(cursor.getInt(cursor.getColumnIndex("calendar_id")));
        calendarBean.setState(cursor.getInt(cursor.getColumnIndex("state")));
        calendarBean.setOther(cursor.getInt(cursor.getColumnIndex("other")));
        String string = cursor.getString(cursor.getColumnIndex("reminder_time"));
        String string2 = cursor.getString(cursor.getColumnIndex("rdate"));
        String string3 = cursor.getString(cursor.getColumnIndex("exrule"));
        String string4 = cursor.getString(cursor.getColumnIndex("exdate"));
        String string5 = cursor.getString(cursor.getColumnIndex("original_id"));
        String string6 = cursor.getString(cursor.getColumnIndex("originalInstanceTime"));
        String string7 = cursor.getString(cursor.getColumnIndex("originalAllDay"));
        int i = 0;
        if (!TextUtils.isEmpty(string)) {
            String[] strArrSplit = string.split(",");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                arrayList.add(Integer.valueOf(str));
            }
            calendarBean.setReminderTime(arrayList);
        }
        int columnIndex = cursor.getColumnIndex("eventStatus");
        if (columnIndex != -1) {
            i = cursor.getInt(columnIndex);
        } else {
            a7b.b("CalHealth.LocalDbManager", "calendar table column missing!");
        }
        calendarBean.setPhoneEventId(cursor.getString(cursor.getColumnIndex("phone_event_id")));
        calendarBean.setWatchEventId(cursor.getInt(cursor.getColumnIndex("watch_event_id")));
        calendarBean.setCalendarName(cursor.getString(cursor.getColumnIndex("calendar_name")));
        calendarBean.setCalendarColor(cursor.getInt(cursor.getColumnIndex("calendar_color")));
        calendarBean.setEventUpdateTime(cursor.getLong(cursor.getColumnIndex("event_update_time")));
        calendarBean.setOriginalId(string5);
        calendarBean.setRDate(string2);
        calendarBean.setExRule(string3);
        calendarBean.setExDate(string4);
        calendarBean.setOriginalInstanceTime(string6);
        calendarBean.setOriginalAllDay(string7);
        calendarBean.setEventStatus(i);
        return calendarBean;
    }

    public void h(Context context) {
        synchronized (w3b.class) {
            if (this.b == null) {
                this.b = new zp2(context);
            }
        }
    }

    public boolean i(CalendarBean calendarBean) {
        SQLiteDatabase sQLiteDatabaseE = e();
        StringBuilder sb = new StringBuilder();
        sb.append("start insert calendar item: ");
        sb.append(calendarBean);
        if (sQLiteDatabaseE != null && calendarBean != null) {
            if (j(calendarBean.getEventId())) {
                a7b.m("CalHealth.LocalDbManager", "item is exist! event id = " + calendarBean.getEventId());
                return true;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(of5.ARG_EVENT_ID, Integer.valueOf(calendarBean.getEventId()));
            contentValues.put("title", calendarBean.getMTitle());
            contentValues.put("eventLocation", calendarBean.getMLocation());
            contentValues.put(iim.a.f, calendarBean.getMDescription());
            contentValues.put("dtstart", Long.valueOf(calendarBean.getMStartTime()));
            contentValues.put("dtend", Long.valueOf(calendarBean.getMEndTime()));
            contentValues.put("eventTimezone", calendarBean.getMTimeZone());
            contentValues.put(HrvHistoryActivity.ALL_DAY, Integer.valueOf(calendarBean.getMAllDay()));
            contentValues.put("hasAlarm", Integer.valueOf(calendarBean.getMHasAlarm()));
            contentValues.put("method", Integer.valueOf(calendarBean.getMMethod()));
            contentValues.put("minutes", Integer.valueOf(calendarBean.getMMinutes()));
            contentValues.put("duration", calendarBean.getMDuration());
            contentValues.put("repeat_type", calendarBean.getMRepeatType());
            contentValues.put("calendar_id", Integer.valueOf(calendarBean.getMCalendarId()));
            contentValues.put("state", Integer.valueOf(calendarBean.getMState()));
            contentValues.put("other", Integer.valueOf(calendarBean.getMOther()));
            contentValues.put("operate_time", Long.valueOf(calendarBean.getMOperateTime()));
            contentValues.put("status", Integer.valueOf(calendarBean.getMOperateStatus()));
            StringBuilder sb2 = new StringBuilder();
            List<Integer> reminderTime = calendarBean.getReminderTime();
            if (reminderTime != null && !reminderTime.isEmpty()) {
                Iterator<Integer> it = reminderTime.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(",");
                }
                sb2.deleteCharAt(sb2.length() - 1);
            }
            contentValues.put("reminder_time", sb2.toString());
            contentValues.put("rdate", calendarBean.getRDate());
            contentValues.put("exrule", calendarBean.getExRule());
            contentValues.put("exdate", calendarBean.getExDate());
            contentValues.put("original_id", calendarBean.getOriginalId());
            contentValues.put("originalInstanceTime", calendarBean.getOriginalInstanceTime());
            contentValues.put("originalAllDay", calendarBean.getOriginalAllDay());
            contentValues.put("eventStatus", Integer.valueOf(calendarBean.getEventStatus()));
            contentValues.put("phone_event_id", calendarBean.getPhoneEventId());
            contentValues.put("watch_event_id", Integer.valueOf(calendarBean.getWatchEventId()));
            contentValues.put("calendar_name", calendarBean.getCalendarName());
            contentValues.put("calendar_color", Integer.valueOf(calendarBean.getCalendarColor()));
            contentValues.put("event_update_time", Long.valueOf(calendarBean.getEventUpdateTime()));
            if (sQLiteDatabaseE.insert("calendar_health", null, contentValues) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(int i) {
        SQLiteDatabase sQLiteDatabaseE = e();
        if (sQLiteDatabaseE == null) {
            return false;
        }
        Cursor cursorQuery = sQLiteDatabaseE.query("calendar_health", null, "event_id=?", new String[]{String.valueOf(i)}, null, null, null);
        if (cursorQuery == null || cursorQuery.getCount() == 0) {
            a(cursorQuery);
            return false;
        }
        a(cursorQuery);
        return true;
    }

    public ArrayList<CalendarBean> k() {
        SQLiteDatabase sQLiteDatabaseE = e();
        if (sQLiteDatabaseE == null) {
            return null;
        }
        ArrayList<CalendarBean> arrayList = new ArrayList<>();
        Cursor cursorQuery = sQLiteDatabaseE.query("calendar_health", null, null, null, null, null, "event_id asc");
        if (cursorQuery == null || cursorQuery.getCount() == 0) {
            a(cursorQuery);
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            arrayList.add(g(cursorQuery));
        }
        a(cursorQuery);
        return arrayList;
    }

    public boolean l(CalendarBean calendarBean) {
        SQLiteDatabase sQLiteDatabaseE;
        if (calendarBean == null || (sQLiteDatabaseE = e()) == null || !j(calendarBean.getEventId())) {
            return false;
        }
        String[] strArr = {String.valueOf(calendarBean.getEventId())};
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", calendarBean.getMTitle());
        contentValues.put("eventLocation", calendarBean.getMLocation());
        contentValues.put(iim.a.f, calendarBean.getMDescription());
        contentValues.put("dtstart", Long.valueOf(calendarBean.getMStartTime()));
        contentValues.put("dtend", Long.valueOf(calendarBean.getMEndTime()));
        contentValues.put("eventTimezone", calendarBean.getMTimeZone());
        contentValues.put(HrvHistoryActivity.ALL_DAY, Integer.valueOf(calendarBean.getMAllDay()));
        contentValues.put("hasAlarm", Integer.valueOf(calendarBean.getMHasAlarm()));
        contentValues.put("method", Integer.valueOf(calendarBean.getMMethod()));
        contentValues.put("minutes", Integer.valueOf(calendarBean.getMMinutes()));
        contentValues.put("duration", calendarBean.getMDuration());
        contentValues.put("repeat_type", calendarBean.getMRepeatType());
        contentValues.put("calendar_id", Integer.valueOf(calendarBean.getMCalendarId()));
        contentValues.put("state", Integer.valueOf(calendarBean.getMState()));
        contentValues.put("other", Integer.valueOf(calendarBean.getMOther()));
        contentValues.put("operate_time", Long.valueOf(calendarBean.getMOperateTime()));
        contentValues.put("status", Integer.valueOf(calendarBean.getMOperateStatus()));
        StringBuilder sb = new StringBuilder();
        List<Integer> reminderTime = calendarBean.getReminderTime();
        if (reminderTime != null && !reminderTime.isEmpty()) {
            Iterator<Integer> it = reminderTime.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        contentValues.put("reminder_time", sb.toString());
        contentValues.put("rdate", calendarBean.getRDate());
        contentValues.put("exrule", calendarBean.getExRule());
        contentValues.put("exdate", calendarBean.getExDate());
        contentValues.put("original_id", calendarBean.getOriginalId());
        contentValues.put("originalInstanceTime", calendarBean.getOriginalInstanceTime());
        contentValues.put("originalAllDay", calendarBean.getOriginalAllDay());
        contentValues.put("eventStatus", Integer.valueOf(calendarBean.getEventStatus()));
        contentValues.put("phone_event_id", calendarBean.getPhoneEventId());
        contentValues.put("watch_event_id", Integer.valueOf(calendarBean.getWatchEventId()));
        contentValues.put("calendar_name", calendarBean.getCalendarName());
        contentValues.put("calendar_color", Integer.valueOf(calendarBean.getCalendarColor()));
        contentValues.put("event_update_time", Long.valueOf(calendarBean.getEventUpdateTime()));
        int iUpdate = sQLiteDatabaseE.update("calendar_health", contentValues, "event_id=?", strArr);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateCalendarBean flag:");
        sb2.append(iUpdate);
        return iUpdate > 0;
    }
}
