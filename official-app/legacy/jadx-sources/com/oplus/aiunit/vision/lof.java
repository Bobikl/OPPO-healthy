package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.heytap.health.watch.calendar.bean.CalendarBean;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.TreeMap;
import org.json.JSONObject;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public class lof {
    public static final int ANDROID_BASE_ID = 1000000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile lof f13776c;
    public static final String[] d = {"_id", "title", "eventLocation", iim.a.f, "dtstart", "dtend", "eventTimezone", HrvHistoryActivity.ALL_DAY, "hasAlarm", "rrule", "duration", "eventStatus", "calendar_id", "events_json_extensions", "rdate", "exrule", "exdate", "original_id", "originalInstanceTime", "originalAllDay", "visible"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f13777e = {"_id", "title", "eventLocation", iim.a.f, "dtstart", "dtend", "eventTimezone", HrvHistoryActivity.ALL_DAY, "hasAlarm", "rrule", "duration", "eventStatus", "calendar_id", "rdate", "exrule", "exdate", "original_id", "originalInstanceTime", "originalAllDay", "visible"};
    public static final String[] f = {of5.ARG_EVENT_ID, "minutes", "method"};
    public static final String[] g = {of5.ARG_EVENT_ID, "state"};
    public Context a;
    public boolean b = ilj.C();

    public static lof d() {
        if (f13776c == null) {
            synchronized (lof.class) {
                if (f13776c == null) {
                    f13776c = new lof();
                }
            }
        }
        return f13776c;
    }

    public static /* synthetic */ int h(Integer num, Integer num2) {
        return num2.compareTo(num);
    }

    public final void b(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e2) {
            a7b.f("CalHealth.RemoteDbManger", "closeCursor error" + e2.getMessage());
        }
    }

    public final ArrayList<CalendarBean> c() {
        return f("com.android.calendar");
    }

    public final ArrayList<CalendarBean> e() {
        return f("com.coloros.calendar");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e4 A[Catch: all -> 0x02cb, Exception -> 0x02d5, TRY_ENTER, TRY_LEAVE, TryCatch #28 {Exception -> 0x02d5, all -> 0x02cb, blocks: (B:88:0x02b8, B:90:0x02bd, B:108:0x02f6, B:110:0x0339, B:111:0x0341, B:91:0x02c1, B:101:0x02e4), top: B:291:0x02b8 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e8 A[Catch: all -> 0x045e, Exception -> 0x0462, TRY_ENTER, TRY_LEAVE, TryCatch #32 {Exception -> 0x0462, all -> 0x045e, blocks: (B:113:0x0369, B:117:0x037f, B:99:0x02df, B:103:0x02e8), top: B:283:0x0369 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:110:0x0339 A[Catch: all -> 0x02cb, Exception -> 0x02d5, TryCatch #28 {Exception -> 0x02d5, all -> 0x02cb, blocks: (B:88:0x02b8, B:90:0x02bd, B:108:0x02f6, B:110:0x0339, B:111:0x0341, B:91:0x02c1, B:101:0x02e4), top: B:291:0x02b8 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x037d  */
    /* JADX WARN: Code duplicated, block: B:116:0x037e  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:130:0x03de  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:136:0x03f6 A[Catch: Exception -> 0x03cf, all -> 0x04aa, TRY_ENTER, TryCatch #7 {all -> 0x04aa, blocks: (B:120:0x03c4, B:139:0x043b, B:141:0x0441, B:128:0x03d6, B:131:0x03e0, B:134:0x03ea, B:136:0x03f6, B:138:0x041a, B:170:0x04a2), top: B:255:0x03c4 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0418 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x041a A[Catch: Exception -> 0x03cf, all -> 0x04aa, TRY_LEAVE, TryCatch #7 {all -> 0x04aa, blocks: (B:120:0x03c4, B:139:0x043b, B:141:0x0441, B:128:0x03d6, B:131:0x03e0, B:134:0x03ea, B:136:0x03f6, B:138:0x041a, B:170:0x04a2), top: B:255:0x03c4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x02dd  */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x03f6, please report this as an issue */
    @SuppressLint({"Range"})
    public final ArrayList<CalendarBean> f(String str) throws Throwable {
        lof lofVar;
        Cursor cursor;
        Throwable th;
        Cursor cursor2;
        Cursor cursor3;
        TreeMap treeMap;
        Exception exc;
        Throwable th2;
        String[] strArr;
        ArrayList arrayList;
        Cursor cursor4;
        Throwable th3;
        Exception e2;
        String str2;
        String str3;
        String strOptString;
        Exception exc2;
        JSONObject jSONObjectOptJSONObject;
        String string;
        String string2;
        String string3;
        int i;
        String string4;
        String string5;
        String str4;
        Exception e3;
        SparseArray sparseArray;
        Pair<String, Integer> pairE;
        String str5;
        lof lofVar2 = this;
        String str6 = "title";
        String str7 = NotificationApiService.CONTENT + str + "/events";
        String str8 = NotificationApiService.CONTENT + str + "/reminders";
        String str9 = NotificationApiService.CONTENT + str + "/calendar_alerts";
        boolean zEquals = TextUtils.equals("com.android.calendar", str);
        TreeMap treeMap2 = new TreeMap(new Comparator() { // from class: com.oplus.aiunit.vision.kof
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lof.h((Integer) obj, (Integer) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray2 = new SparseArray();
        try {
            boolean zL = kp2.l();
            boolean zD = gr2.d();
            a7b.f("CalHealth.RemoteDbManger", "getRemoteCalendar isMigratedVersion " + zL);
            ContentResolver contentResolver = lofVar2.a.getContentResolver();
            Uri uri = Uri.parse(str7);
            if ((!zEquals || zL) && gr2.c()) {
                try {
                    strArr = d;
                } catch (Exception e4) {
                    e = e4;
                    lofVar = lofVar2;
                    treeMap = treeMap2;
                    cursor = null;
                    cursor2 = null;
                    cursor3 = null;
                    exc = e;
                    try {
                        a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                        lofVar.b(cursor3);
                        lofVar.b(cursor);
                        lofVar.b(cursor2);
                        return new ArrayList<>(treeMap.values());
                    } catch (Throwable th4) {
                        th2 = th4;
                        th = th2;
                        lofVar.b(cursor3);
                        lofVar.b(cursor);
                        lofVar.b(cursor2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    lofVar = lofVar2;
                    cursor = null;
                    cursor2 = null;
                    cursor3 = null;
                    th = th2;
                    lofVar.b(cursor3);
                    lofVar.b(cursor);
                    lofVar.b(cursor2);
                    throw th;
                }
            } else {
                strArr = f13777e;
            }
            Cursor cursorQuery = contentResolver.query(uri, strArr, "deleted<>1", null, "_id desc ");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() != 0) {
                        rp2 rp2VarA = tp2.a(gl4.managerApi.getCurrentConnectId());
                        boolean zH8 = rp2VarA.H8();
                        boolean zH1 = rp2VarA.H1();
                        a7b.f("CalHealth.RemoteDbManger", "getRemoteCalendar useNewProtocol  = " + zH8);
                        while (true) {
                            arrayList = arrayList2;
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            try {
                                try {
                                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                                    if (cursorQuery.getInt(cursorQuery.getColumnIndex("visible")) == 0) {
                                        try {
                                            a7b.m("CalHealth.RemoteDbManger", "getRemoteCalendar is invisible event id = " + i2);
                                        } catch (Exception e5) {
                                            e = e5;
                                            lofVar = lofVar2;
                                            cursor2 = cursorQuery;
                                            treeMap = treeMap2;
                                            cursor = null;
                                            cursor3 = null;
                                            exc = e;
                                            a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                            lofVar.b(cursor3);
                                            lofVar.b(cursor);
                                            lofVar.b(cursor2);
                                            return new ArrayList<>(treeMap.values());
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            lofVar = lofVar2;
                                            cursor2 = cursorQuery;
                                            cursor = null;
                                            cursor3 = null;
                                            th = th2;
                                            lofVar.b(cursor3);
                                            lofVar.b(cursor);
                                            lofVar.b(cursor2);
                                            throw th;
                                        }
                                    } else {
                                        int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("eventStatus"));
                                        if (zH1 || i3 != 2) {
                                            String string6 = cursorQuery.getString(cursorQuery.getColumnIndex(str6));
                                            zH1 = zH1;
                                            String string7 = cursorQuery.getString(cursorQuery.getColumnIndex("eventLocation"));
                                            String string8 = cursorQuery.getString(cursorQuery.getColumnIndex(iim.a.f));
                                            TreeMap treeMap3 = treeMap2;
                                            try {
                                                try {
                                                    long timeInMillis = cursorQuery.getLong(cursorQuery.getColumnIndex("dtstart"));
                                                    SparseArray sparseArray3 = sparseArray2;
                                                    boolean z = zH8;
                                                    long timeInMillis2 = cursorQuery.getLong(cursorQuery.getColumnIndex("dtend"));
                                                    String string9 = cursorQuery.getString(cursorQuery.getColumnIndex("eventTimezone"));
                                                    int i4 = cursorQuery.getInt(cursorQuery.getColumnIndex(HrvHistoryActivity.ALL_DAY));
                                                    int i5 = cursorQuery.getInt(cursorQuery.getColumnIndex("hasAlarm"));
                                                    String string10 = cursorQuery.getString(cursorQuery.getColumnIndex("rrule"));
                                                    String string11 = cursorQuery.getString(cursorQuery.getColumnIndex("duration"));
                                                    int i6 = cursorQuery.getInt(cursorQuery.getColumnIndex("calendar_id"));
                                                    CalendarBean calendarBean = new CalendarBean();
                                                    if (!zEquals || zL) {
                                                        try {
                                                            try {
                                                                int columnIndex = cursorQuery.getColumnIndex("events_json_extensions");
                                                                str3 = string6;
                                                                if (columnIndex != -1) {
                                                                    try {
                                                                        String string12 = cursorQuery.getString(columnIndex);
                                                                        if (TextUtils.isEmpty(string12) || (jSONObjectOptJSONObject = new JSONObject(string12).optJSONObject("EVENT_ADDRESS")) == null) {
                                                                            str2 = str6;
                                                                        } else {
                                                                            strOptString = jSONObjectOptJSONObject.optString(str6);
                                                                            try {
                                                                                StringBuilder sb = new StringBuilder();
                                                                                str2 = str6;
                                                                                try {
                                                                                    sb.append("getRemoteCalendar location  = ");
                                                                                    sb.append(strOptString);
                                                                                } catch (Exception e6) {
                                                                                    e = e6;
                                                                                    exc2 = e;
                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                    string7 = strOptString;
                                                                                    sb2.append("getRemoteCalendar location error = ");
                                                                                    sb2.append(exc2.getMessage());
                                                                                    a7b.b("CalHealth.RemoteDbManger", sb2.toString());
                                                                                    strOptString = string7;
                                                                                }
                                                                            } catch (Exception e7) {
                                                                                e = e7;
                                                                                str2 = str6;
                                                                            }
                                                                        }
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        str2 = str6;
                                                                        exc2 = e;
                                                                        strOptString = string7;
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        string7 = strOptString;
                                                                        sb3.append("getRemoteCalendar location error = ");
                                                                        sb3.append(exc2.getMessage());
                                                                        a7b.b("CalHealth.RemoteDbManger", sb3.toString());
                                                                        strOptString = string7;
                                                                        string = cursorQuery.getString(cursorQuery.getColumnIndex("rdate"));
                                                                        string2 = cursorQuery.getString(cursorQuery.getColumnIndex("exrule"));
                                                                        string3 = cursorQuery.getString(cursorQuery.getColumnIndex("exdate"));
                                                                        i = cursorQuery.getInt(cursorQuery.getColumnIndex("original_id"));
                                                                        string4 = cursorQuery.getString(cursorQuery.getColumnIndex("originalInstanceTime"));
                                                                        string5 = cursorQuery.getString(cursorQuery.getColumnIndex("originalAllDay"));
                                                                        cursor4 = cursorQuery;
                                                                        if (zEquals) {
                                                                            str4 = string5;
                                                                            calendarBean.setEventId(i2);
                                                                            if (i <= 0) {
                                                                                calendarBean.setOriginalId("");
                                                                            } else {
                                                                                calendarBean.setOriginalId(String.valueOf(i));
                                                                            }
                                                                            if (zEquals) {
                                                                                a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                                Calendar calendar = Calendar.getInstance();
                                                                                calendar.setTimeInMillis(timeInMillis);
                                                                                calendar.set(11, 9);
                                                                                timeInMillis = calendar.getTimeInMillis();
                                                                                calendar.clear();
                                                                                calendar.setTimeInMillis(timeInMillis2);
                                                                                calendar.set(11, 9);
                                                                                timeInMillis2 = calendar.getTimeInMillis();
                                                                                if (calendarBean.getReminderTime() == null) {
                                                                                    calendarBean.setReminderTime(new ArrayList());
                                                                                }
                                                                                calendarBean.getReminderTime().add(0);
                                                                                a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                            } else {
                                                                                a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                                Calendar calendar2 = Calendar.getInstance();
                                                                                calendar2.setTimeInMillis(timeInMillis);
                                                                                calendar2.set(11, 9);
                                                                                timeInMillis = calendar2.getTimeInMillis();
                                                                                calendar2.clear();
                                                                                calendar2.setTimeInMillis(timeInMillis2);
                                                                                calendar2.set(11, 9);
                                                                                timeInMillis2 = calendar2.getTimeInMillis();
                                                                                if (calendarBean.getReminderTime() == null) {
                                                                                    calendarBean.setReminderTime(new ArrayList());
                                                                                }
                                                                                calendarBean.getReminderTime().add(0);
                                                                                a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                            }
                                                                            calendarBean.setTitle(str3);
                                                                            calendarBean.setLocation(strOptString);
                                                                            calendarBean.setDescription(string8);
                                                                            calendarBean.setStartTime(timeInMillis);
                                                                            if (timeInMillis2 > 0) {
                                                                                timeInMillis = timeInMillis2;
                                                                            }
                                                                            calendarBean.setEndTime(timeInMillis);
                                                                            calendarBean.setTimeZone(string9);
                                                                            calendarBean.setAllDay(i4);
                                                                            calendarBean.setHasAlarm(i5);
                                                                            calendarBean.setRepeatType(string10);
                                                                            calendarBean.setDuration(string11);
                                                                            calendarBean.setCalendarId(i6);
                                                                            calendarBean.setOther(-1);
                                                                            calendarBean.setRDate(string);
                                                                            calendarBean.setExRule(string2);
                                                                            calendarBean.setExDate(string3);
                                                                            calendarBean.setOriginalInstanceTime(string4);
                                                                            calendarBean.setOriginalAllDay(str4);
                                                                            calendarBean.setEventStatus(i3);
                                                                            if (z) {
                                                                                lofVar = this;
                                                                            } else {
                                                                                lofVar = this;
                                                                                try {
                                                                                    try {
                                                                                        if (!lofVar.b) {
                                                                                            str5 = str;
                                                                                            sparseArray = sparseArray3;
                                                                                        }
                                                                                        try {
                                                                                            treeMap = treeMap3;
                                                                                            try {
                                                                                                treeMap.put(Integer.valueOf(i2), calendarBean);
                                                                                                arrayList.add(String.valueOf(i2));
                                                                                                lofVar2 = lofVar;
                                                                                                arrayList2 = arrayList;
                                                                                                sparseArray2 = sparseArray;
                                                                                                treeMap2 = treeMap;
                                                                                                zH8 = z;
                                                                                                str6 = str2;
                                                                                                cursorQuery = cursor4;
                                                                                            } catch (Exception e9) {
                                                                                                e2 = e9;
                                                                                                exc = e2;
                                                                                                cursor2 = cursor4;
                                                                                                cursor = null;
                                                                                                cursor3 = null;
                                                                                                a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                                                                                lofVar.b(cursor3);
                                                                                                lofVar.b(cursor);
                                                                                                lofVar.b(cursor2);
                                                                                                return new ArrayList<>(treeMap.values());
                                                                                            }
                                                                                        } catch (Exception e10) {
                                                                                            e2 = e10;
                                                                                            treeMap = treeMap3;
                                                                                            exc = e2;
                                                                                            cursor2 = cursor4;
                                                                                            cursor = null;
                                                                                            cursor3 = null;
                                                                                            a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                                                                            lofVar.b(cursor3);
                                                                                            lofVar.b(cursor);
                                                                                            lofVar.b(cursor2);
                                                                                            return new ArrayList<>(treeMap.values());
                                                                                        }
                                                                                    } catch (Throwable th7) {
                                                                                        th3 = th7;
                                                                                        th = th3;
                                                                                        cursor2 = cursor4;
                                                                                        cursor = null;
                                                                                        cursor3 = null;
                                                                                        lofVar.b(cursor3);
                                                                                        lofVar.b(cursor);
                                                                                        lofVar.b(cursor2);
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Exception e11) {
                                                                                    e3 = e11;
                                                                                    exc = e3;
                                                                                    treeMap = treeMap3;
                                                                                    cursor2 = cursor4;
                                                                                    cursor = null;
                                                                                    cursor3 = null;
                                                                                    a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                                                                    lofVar.b(cursor3);
                                                                                    lofVar.b(cursor);
                                                                                    lofVar.b(cursor2);
                                                                                    return new ArrayList<>(treeMap.values());
                                                                                }
                                                                            }
                                                                            sparseArray = sparseArray3;
                                                                            pairE = (Pair) sparseArray.get(i6);
                                                                            if (pairE == null) {
                                                                                str5 = str;
                                                                                pairE = kp2.e(i6, str5);
                                                                                sparseArray.put(i6, pairE);
                                                                            } else {
                                                                                str5 = str;
                                                                            }
                                                                            if (lofVar.j(pairE.getFirst())) {
                                                                                a7b.m("CalHealth.RemoteDbManger", "filter Chinese Festival " + calendarBean.getMTitle());
                                                                                lofVar2 = lofVar;
                                                                                sparseArray2 = sparseArray;
                                                                                arrayList2 = arrayList;
                                                                                treeMap2 = treeMap3;
                                                                            } else {
                                                                                if (z) {
                                                                                    calendarBean.setPhoneEventId(String.valueOf(calendarBean.getEventId()));
                                                                                    calendarBean.setCalendarName(pairE.getFirst());
                                                                                    calendarBean.setCalendarColor(pairE.getSecond().intValue());
                                                                                }
                                                                                treeMap = treeMap3;
                                                                                treeMap.put(Integer.valueOf(i2), calendarBean);
                                                                                arrayList.add(String.valueOf(i2));
                                                                                lofVar2 = lofVar;
                                                                                arrayList2 = arrayList;
                                                                                sparseArray2 = sparseArray;
                                                                                treeMap2 = treeMap;
                                                                            }
                                                                            zH8 = z;
                                                                            str6 = str2;
                                                                            cursorQuery = cursor4;
                                                                        } else {
                                                                            str4 = string5;
                                                                            calendarBean.setEventId(i2);
                                                                            if (i <= 0) {
                                                                                calendarBean.setOriginalId("");
                                                                            } else {
                                                                                calendarBean.setOriginalId(String.valueOf(i));
                                                                            }
                                                                            if (zEquals) {
                                                                                a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                                Calendar calendar3 = Calendar.getInstance();
                                                                                calendar3.setTimeInMillis(timeInMillis);
                                                                                calendar3.set(11, 9);
                                                                                timeInMillis = calendar3.getTimeInMillis();
                                                                                calendar3.clear();
                                                                                calendar3.setTimeInMillis(timeInMillis2);
                                                                                calendar3.set(11, 9);
                                                                                timeInMillis2 = calendar3.getTimeInMillis();
                                                                                if (calendarBean.getReminderTime() == null) {
                                                                                    calendarBean.setReminderTime(new ArrayList());
                                                                                }
                                                                                calendarBean.getReminderTime().add(0);
                                                                                a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                            } else {
                                                                                a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                                Calendar calendar4 = Calendar.getInstance();
                                                                                calendar4.setTimeInMillis(timeInMillis);
                                                                                calendar4.set(11, 9);
                                                                                timeInMillis = calendar4.getTimeInMillis();
                                                                                calendar4.clear();
                                                                                calendar4.setTimeInMillis(timeInMillis2);
                                                                                calendar4.set(11, 9);
                                                                                timeInMillis2 = calendar4.getTimeInMillis();
                                                                                if (calendarBean.getReminderTime() == null) {
                                                                                    calendarBean.setReminderTime(new ArrayList());
                                                                                }
                                                                                calendarBean.getReminderTime().add(0);
                                                                                a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                                            }
                                                                            calendarBean.setTitle(str3);
                                                                            calendarBean.setLocation(strOptString);
                                                                            calendarBean.setDescription(string8);
                                                                            calendarBean.setStartTime(timeInMillis);
                                                                            if (timeInMillis2 > 0) {
                                                                                timeInMillis = timeInMillis2;
                                                                            }
                                                                            calendarBean.setEndTime(timeInMillis);
                                                                            calendarBean.setTimeZone(string9);
                                                                            calendarBean.setAllDay(i4);
                                                                            calendarBean.setHasAlarm(i5);
                                                                            calendarBean.setRepeatType(string10);
                                                                            calendarBean.setDuration(string11);
                                                                            calendarBean.setCalendarId(i6);
                                                                            calendarBean.setOther(-1);
                                                                            calendarBean.setRDate(string);
                                                                            calendarBean.setExRule(string2);
                                                                            calendarBean.setExDate(string3);
                                                                            calendarBean.setOriginalInstanceTime(string4);
                                                                            calendarBean.setOriginalAllDay(str4);
                                                                            calendarBean.setEventStatus(i3);
                                                                            if (z) {
                                                                                lofVar = this;
                                                                                if (!lofVar.b) {
                                                                                    str5 = str;
                                                                                    sparseArray = sparseArray3;
                                                                                }
                                                                                treeMap = treeMap3;
                                                                                treeMap.put(Integer.valueOf(i2), calendarBean);
                                                                                arrayList.add(String.valueOf(i2));
                                                                                lofVar2 = lofVar;
                                                                                arrayList2 = arrayList;
                                                                                sparseArray2 = sparseArray;
                                                                                treeMap2 = treeMap;
                                                                                zH8 = z;
                                                                                str6 = str2;
                                                                                cursorQuery = cursor4;
                                                                            } else {
                                                                                lofVar = this;
                                                                            }
                                                                            sparseArray = sparseArray3;
                                                                            pairE = (Pair) sparseArray.get(i6);
                                                                            if (pairE == null) {
                                                                                str5 = str;
                                                                                pairE = kp2.e(i6, str5);
                                                                                sparseArray.put(i6, pairE);
                                                                            } else {
                                                                                str5 = str;
                                                                            }
                                                                            if (lofVar.j(pairE.getFirst())) {
                                                                                a7b.m("CalHealth.RemoteDbManger", "filter Chinese Festival " + calendarBean.getMTitle());
                                                                                lofVar2 = lofVar;
                                                                                sparseArray2 = sparseArray;
                                                                                arrayList2 = arrayList;
                                                                                treeMap2 = treeMap3;
                                                                            } else {
                                                                                if (z) {
                                                                                    calendarBean.setPhoneEventId(String.valueOf(calendarBean.getEventId()));
                                                                                    calendarBean.setCalendarName(pairE.getFirst());
                                                                                    calendarBean.setCalendarColor(pairE.getSecond().intValue());
                                                                                }
                                                                                treeMap = treeMap3;
                                                                                treeMap.put(Integer.valueOf(i2), calendarBean);
                                                                                arrayList.add(String.valueOf(i2));
                                                                                lofVar2 = lofVar;
                                                                                arrayList2 = arrayList;
                                                                                sparseArray2 = sparseArray;
                                                                                treeMap2 = treeMap;
                                                                            }
                                                                            zH8 = z;
                                                                            str6 = str2;
                                                                            cursorQuery = cursor4;
                                                                        }
                                                                        lofVar.b(cursor3);
                                                                        lofVar.b(cursor);
                                                                        lofVar.b(cursor2);
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    str2 = str6;
                                                                    try {
                                                                        a7b.b("CalHealth.RemoteDbManger", "eventsJsonExtensionsIndex = -1");
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        exc2 = e;
                                                                        strOptString = string7;
                                                                        StringBuilder sb4 = new StringBuilder();
                                                                        string7 = strOptString;
                                                                        sb4.append("getRemoteCalendar location error = ");
                                                                        sb4.append(exc2.getMessage());
                                                                        a7b.b("CalHealth.RemoteDbManger", sb4.toString());
                                                                    }
                                                                }
                                                            } catch (Throwable th8) {
                                                                cursor = null;
                                                                cursor3 = null;
                                                                lofVar = this;
                                                                th = th8;
                                                                cursor2 = cursorQuery;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            str2 = str6;
                                                            str3 = string6;
                                                        }
                                                        string = cursorQuery.getString(cursorQuery.getColumnIndex("rdate"));
                                                        string2 = cursorQuery.getString(cursorQuery.getColumnIndex("exrule"));
                                                        string3 = cursorQuery.getString(cursorQuery.getColumnIndex("exdate"));
                                                        i = cursorQuery.getInt(cursorQuery.getColumnIndex("original_id"));
                                                        string4 = cursorQuery.getString(cursorQuery.getColumnIndex("originalInstanceTime"));
                                                        string5 = cursorQuery.getString(cursorQuery.getColumnIndex("originalAllDay"));
                                                        cursor4 = cursorQuery;
                                                        if (zEquals || !zD || zL) {
                                                            str4 = string5;
                                                            calendarBean.setEventId(i2);
                                                            if (i <= 0) {
                                                                calendarBean.setOriginalId("");
                                                            } else {
                                                                calendarBean.setOriginalId(String.valueOf(i));
                                                            }
                                                        } else {
                                                            str4 = string5;
                                                            try {
                                                                calendarBean.setEventId(i2 + 1000000000);
                                                                if (i <= 0) {
                                                                    calendarBean.setOriginalId("");
                                                                } else {
                                                                    calendarBean.setOriginalId(String.valueOf(i + 1000000000));
                                                                }
                                                            } catch (Exception e14) {
                                                                e3 = e14;
                                                                lofVar = this;
                                                                exc = e3;
                                                                treeMap = treeMap3;
                                                                cursor2 = cursor4;
                                                                cursor = null;
                                                                cursor3 = null;
                                                                a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                                                lofVar.b(cursor3);
                                                                lofVar.b(cursor);
                                                                lofVar.b(cursor2);
                                                                return new ArrayList<>(treeMap.values());
                                                            } catch (Throwable th9) {
                                                                cursor = null;
                                                                cursor3 = null;
                                                                lofVar = this;
                                                                th = th9;
                                                                cursor2 = cursor4;
                                                            }
                                                        }
                                                        if ((zEquals || zL) && i4 == 1) {
                                                            a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                            Calendar calendar5 = Calendar.getInstance();
                                                            calendar5.setTimeInMillis(timeInMillis);
                                                            calendar5.set(11, 9);
                                                            timeInMillis = calendar5.getTimeInMillis();
                                                            calendar5.clear();
                                                            calendar5.setTimeInMillis(timeInMillis2);
                                                            calendar5.set(11, 9);
                                                            timeInMillis2 = calendar5.getTimeInMillis();
                                                            if (calendarBean.getReminderTime() == null) {
                                                                calendarBean.setReminderTime(new ArrayList());
                                                            }
                                                            calendarBean.getReminderTime().add(0);
                                                            a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                        }
                                                        try {
                                                            calendarBean.setTitle(str3);
                                                            calendarBean.setLocation(strOptString);
                                                            calendarBean.setDescription(string8);
                                                            calendarBean.setStartTime(timeInMillis);
                                                            if (timeInMillis2 > 0) {
                                                                timeInMillis = timeInMillis2;
                                                            }
                                                            calendarBean.setEndTime(timeInMillis);
                                                            calendarBean.setTimeZone(string9);
                                                            calendarBean.setAllDay(i4);
                                                            calendarBean.setHasAlarm(i5);
                                                            calendarBean.setRepeatType(string10);
                                                            calendarBean.setDuration(string11);
                                                            calendarBean.setCalendarId(i6);
                                                            calendarBean.setOther(-1);
                                                            calendarBean.setRDate(string);
                                                            calendarBean.setExRule(string2);
                                                            calendarBean.setExDate(string3);
                                                            calendarBean.setOriginalInstanceTime(string4);
                                                            calendarBean.setOriginalAllDay(str4);
                                                            calendarBean.setEventStatus(i3);
                                                            if (z) {
                                                                lofVar = this;
                                                                if (!lofVar.b) {
                                                                    str5 = str;
                                                                    sparseArray = sparseArray3;
                                                                }
                                                                treeMap = treeMap3;
                                                                treeMap.put(Integer.valueOf(i2), calendarBean);
                                                                arrayList.add(String.valueOf(i2));
                                                                lofVar2 = lofVar;
                                                                arrayList2 = arrayList;
                                                                sparseArray2 = sparseArray;
                                                                treeMap2 = treeMap;
                                                                zH8 = z;
                                                                str6 = str2;
                                                                cursorQuery = cursor4;
                                                            } else {
                                                                lofVar = this;
                                                            }
                                                            sparseArray = sparseArray3;
                                                            pairE = (Pair) sparseArray.get(i6);
                                                            if (pairE == null) {
                                                                str5 = str;
                                                                pairE = kp2.e(i6, str5);
                                                                sparseArray.put(i6, pairE);
                                                            } else {
                                                                str5 = str;
                                                            }
                                                            if (lofVar.j(pairE.getFirst())) {
                                                                a7b.m("CalHealth.RemoteDbManger", "filter Chinese Festival " + calendarBean.getMTitle());
                                                                lofVar2 = lofVar;
                                                                sparseArray2 = sparseArray;
                                                                arrayList2 = arrayList;
                                                                treeMap2 = treeMap3;
                                                            } else {
                                                                if (z) {
                                                                    calendarBean.setPhoneEventId(String.valueOf(calendarBean.getEventId()));
                                                                    calendarBean.setCalendarName(pairE.getFirst());
                                                                    calendarBean.setCalendarColor(pairE.getSecond().intValue());
                                                                }
                                                                treeMap = treeMap3;
                                                                treeMap.put(Integer.valueOf(i2), calendarBean);
                                                                arrayList.add(String.valueOf(i2));
                                                                lofVar2 = lofVar;
                                                                arrayList2 = arrayList;
                                                                sparseArray2 = sparseArray;
                                                                treeMap2 = treeMap;
                                                            }
                                                            zH8 = z;
                                                            str6 = str2;
                                                            cursorQuery = cursor4;
                                                        } catch (Exception e15) {
                                                            e2 = e15;
                                                            lofVar = this;
                                                        } catch (Throwable th10) {
                                                            th3 = th10;
                                                            lofVar = this;
                                                            th = th3;
                                                            cursor2 = cursor4;
                                                            cursor = null;
                                                            cursor3 = null;
                                                            lofVar.b(cursor3);
                                                            lofVar.b(cursor);
                                                            lofVar.b(cursor2);
                                                            throw th;
                                                        }
                                                    } else {
                                                        str2 = str6;
                                                        str3 = string6;
                                                    }
                                                    strOptString = string7;
                                                    string = cursorQuery.getString(cursorQuery.getColumnIndex("rdate"));
                                                    string2 = cursorQuery.getString(cursorQuery.getColumnIndex("exrule"));
                                                    string3 = cursorQuery.getString(cursorQuery.getColumnIndex("exdate"));
                                                    i = cursorQuery.getInt(cursorQuery.getColumnIndex("original_id"));
                                                    string4 = cursorQuery.getString(cursorQuery.getColumnIndex("originalInstanceTime"));
                                                    string5 = cursorQuery.getString(cursorQuery.getColumnIndex("originalAllDay"));
                                                    cursor4 = cursorQuery;
                                                    if (zEquals) {
                                                        str4 = string5;
                                                        calendarBean.setEventId(i2);
                                                        if (i <= 0) {
                                                            calendarBean.setOriginalId("");
                                                        } else {
                                                            calendarBean.setOriginalId(String.valueOf(i));
                                                        }
                                                        if (zEquals) {
                                                            a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                            Calendar calendar6 = Calendar.getInstance();
                                                            calendar6.setTimeInMillis(timeInMillis);
                                                            calendar6.set(11, 9);
                                                            timeInMillis = calendar6.getTimeInMillis();
                                                            calendar6.clear();
                                                            calendar6.setTimeInMillis(timeInMillis2);
                                                            calendar6.set(11, 9);
                                                            timeInMillis2 = calendar6.getTimeInMillis();
                                                            if (calendarBean.getReminderTime() == null) {
                                                                calendarBean.setReminderTime(new ArrayList());
                                                            }
                                                            calendarBean.getReminderTime().add(0);
                                                            a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                        } else {
                                                            a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                            Calendar calendar7 = Calendar.getInstance();
                                                            calendar7.setTimeInMillis(timeInMillis);
                                                            calendar7.set(11, 9);
                                                            timeInMillis = calendar7.getTimeInMillis();
                                                            calendar7.clear();
                                                            calendar7.setTimeInMillis(timeInMillis2);
                                                            calendar7.set(11, 9);
                                                            timeInMillis2 = calendar7.getTimeInMillis();
                                                            if (calendarBean.getReminderTime() == null) {
                                                                calendarBean.setReminderTime(new ArrayList());
                                                            }
                                                            calendarBean.getReminderTime().add(0);
                                                            a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                        }
                                                        calendarBean.setTitle(str3);
                                                        calendarBean.setLocation(strOptString);
                                                        calendarBean.setDescription(string8);
                                                        calendarBean.setStartTime(timeInMillis);
                                                        if (timeInMillis2 > 0) {
                                                            timeInMillis = timeInMillis2;
                                                        }
                                                        calendarBean.setEndTime(timeInMillis);
                                                        calendarBean.setTimeZone(string9);
                                                        calendarBean.setAllDay(i4);
                                                        calendarBean.setHasAlarm(i5);
                                                        calendarBean.setRepeatType(string10);
                                                        calendarBean.setDuration(string11);
                                                        calendarBean.setCalendarId(i6);
                                                        calendarBean.setOther(-1);
                                                        calendarBean.setRDate(string);
                                                        calendarBean.setExRule(string2);
                                                        calendarBean.setExDate(string3);
                                                        calendarBean.setOriginalInstanceTime(string4);
                                                        calendarBean.setOriginalAllDay(str4);
                                                        calendarBean.setEventStatus(i3);
                                                        if (z) {
                                                            lofVar = this;
                                                            if (!lofVar.b) {
                                                                str5 = str;
                                                                sparseArray = sparseArray3;
                                                            }
                                                            treeMap = treeMap3;
                                                            treeMap.put(Integer.valueOf(i2), calendarBean);
                                                            arrayList.add(String.valueOf(i2));
                                                            lofVar2 = lofVar;
                                                            arrayList2 = arrayList;
                                                            sparseArray2 = sparseArray;
                                                            treeMap2 = treeMap;
                                                            zH8 = z;
                                                            str6 = str2;
                                                            cursorQuery = cursor4;
                                                        } else {
                                                            lofVar = this;
                                                        }
                                                        sparseArray = sparseArray3;
                                                        pairE = (Pair) sparseArray.get(i6);
                                                        if (pairE == null) {
                                                            str5 = str;
                                                            pairE = kp2.e(i6, str5);
                                                            sparseArray.put(i6, pairE);
                                                        } else {
                                                            str5 = str;
                                                        }
                                                        if (lofVar.j(pairE.getFirst())) {
                                                            a7b.m("CalHealth.RemoteDbManger", "filter Chinese Festival " + calendarBean.getMTitle());
                                                            lofVar2 = lofVar;
                                                            sparseArray2 = sparseArray;
                                                            arrayList2 = arrayList;
                                                            treeMap2 = treeMap3;
                                                        } else {
                                                            if (z) {
                                                                calendarBean.setPhoneEventId(String.valueOf(calendarBean.getEventId()));
                                                                calendarBean.setCalendarName(pairE.getFirst());
                                                                calendarBean.setCalendarColor(pairE.getSecond().intValue());
                                                            }
                                                            treeMap = treeMap3;
                                                            treeMap.put(Integer.valueOf(i2), calendarBean);
                                                            arrayList.add(String.valueOf(i2));
                                                            lofVar2 = lofVar;
                                                            arrayList2 = arrayList;
                                                            sparseArray2 = sparseArray;
                                                            treeMap2 = treeMap;
                                                        }
                                                        zH8 = z;
                                                        str6 = str2;
                                                        cursorQuery = cursor4;
                                                    } else {
                                                        str4 = string5;
                                                        calendarBean.setEventId(i2);
                                                        if (i <= 0) {
                                                            calendarBean.setOriginalId("");
                                                        } else {
                                                            calendarBean.setOriginalId(String.valueOf(i));
                                                        }
                                                        if (zEquals) {
                                                            a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                            Calendar calendar8 = Calendar.getInstance();
                                                            calendar8.setTimeInMillis(timeInMillis);
                                                            calendar8.set(11, 9);
                                                            timeInMillis = calendar8.getTimeInMillis();
                                                            calendar8.clear();
                                                            calendar8.setTimeInMillis(timeInMillis2);
                                                            calendar8.set(11, 9);
                                                            timeInMillis2 = calendar8.getTimeInMillis();
                                                            if (calendarBean.getReminderTime() == null) {
                                                                calendarBean.setReminderTime(new ArrayList());
                                                            }
                                                            calendarBean.getReminderTime().add(0);
                                                            a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                        } else {
                                                            a7b.f("CalHealth.RemoteDbManger", "allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                            Calendar calendar9 = Calendar.getInstance();
                                                            calendar9.setTimeInMillis(timeInMillis);
                                                            calendar9.set(11, 9);
                                                            timeInMillis = calendar9.getTimeInMillis();
                                                            calendar9.clear();
                                                            calendar9.setTimeInMillis(timeInMillis2);
                                                            calendar9.set(11, 9);
                                                            timeInMillis2 = calendar9.getTimeInMillis();
                                                            if (calendarBean.getReminderTime() == null) {
                                                                calendarBean.setReminderTime(new ArrayList());
                                                            }
                                                            calendarBean.getReminderTime().add(0);
                                                            a7b.m("CalHealth.RemoteDbManger", "fix allday calendar startTime = " + timeInMillis + " endTime = " + timeInMillis2);
                                                        }
                                                        calendarBean.setTitle(str3);
                                                        calendarBean.setLocation(strOptString);
                                                        calendarBean.setDescription(string8);
                                                        calendarBean.setStartTime(timeInMillis);
                                                        if (timeInMillis2 > 0) {
                                                            timeInMillis = timeInMillis2;
                                                        }
                                                        calendarBean.setEndTime(timeInMillis);
                                                        calendarBean.setTimeZone(string9);
                                                        calendarBean.setAllDay(i4);
                                                        calendarBean.setHasAlarm(i5);
                                                        calendarBean.setRepeatType(string10);
                                                        calendarBean.setDuration(string11);
                                                        calendarBean.setCalendarId(i6);
                                                        calendarBean.setOther(-1);
                                                        calendarBean.setRDate(string);
                                                        calendarBean.setExRule(string2);
                                                        calendarBean.setExDate(string3);
                                                        calendarBean.setOriginalInstanceTime(string4);
                                                        calendarBean.setOriginalAllDay(str4);
                                                        calendarBean.setEventStatus(i3);
                                                        if (z) {
                                                            lofVar = this;
                                                            if (!lofVar.b) {
                                                                str5 = str;
                                                                sparseArray = sparseArray3;
                                                            }
                                                            treeMap = treeMap3;
                                                            treeMap.put(Integer.valueOf(i2), calendarBean);
                                                            arrayList.add(String.valueOf(i2));
                                                            lofVar2 = lofVar;
                                                            arrayList2 = arrayList;
                                                            sparseArray2 = sparseArray;
                                                            treeMap2 = treeMap;
                                                            zH8 = z;
                                                            str6 = str2;
                                                            cursorQuery = cursor4;
                                                        } else {
                                                            lofVar = this;
                                                        }
                                                        sparseArray = sparseArray3;
                                                        pairE = (Pair) sparseArray.get(i6);
                                                        if (pairE == null) {
                                                            str5 = str;
                                                            pairE = kp2.e(i6, str5);
                                                            sparseArray.put(i6, pairE);
                                                        } else {
                                                            str5 = str;
                                                        }
                                                        if (lofVar.j(pairE.getFirst())) {
                                                            a7b.m("CalHealth.RemoteDbManger", "filter Chinese Festival " + calendarBean.getMTitle());
                                                            lofVar2 = lofVar;
                                                            sparseArray2 = sparseArray;
                                                            arrayList2 = arrayList;
                                                            treeMap2 = treeMap3;
                                                        } else {
                                                            if (z) {
                                                                calendarBean.setPhoneEventId(String.valueOf(calendarBean.getEventId()));
                                                                calendarBean.setCalendarName(pairE.getFirst());
                                                                calendarBean.setCalendarColor(pairE.getSecond().intValue());
                                                            }
                                                            treeMap = treeMap3;
                                                            treeMap.put(Integer.valueOf(i2), calendarBean);
                                                            arrayList.add(String.valueOf(i2));
                                                            lofVar2 = lofVar;
                                                            arrayList2 = arrayList;
                                                            sparseArray2 = sparseArray;
                                                            treeMap2 = treeMap;
                                                        }
                                                        zH8 = z;
                                                        str6 = str2;
                                                        cursorQuery = cursor4;
                                                    }
                                                } catch (Exception e16) {
                                                    e2 = e16;
                                                    lofVar = this;
                                                    cursor4 = cursorQuery;
                                                    treeMap = treeMap3;
                                                    exc = e2;
                                                    cursor2 = cursor4;
                                                    cursor = null;
                                                    cursor3 = null;
                                                    a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                                    lofVar.b(cursor3);
                                                    lofVar.b(cursor);
                                                    lofVar.b(cursor2);
                                                    return new ArrayList<>(treeMap.values());
                                                } catch (Throwable th11) {
                                                    th3 = th11;
                                                    lofVar = this;
                                                    cursor4 = cursorQuery;
                                                    th = th3;
                                                    cursor2 = cursor4;
                                                    cursor = null;
                                                    cursor3 = null;
                                                    lofVar.b(cursor3);
                                                    lofVar.b(cursor);
                                                    lofVar.b(cursor2);
                                                    throw th;
                                                }
                                            } catch (Exception e17) {
                                                e2 = e17;
                                                lofVar = lofVar2;
                                            }
                                        } else {
                                            a7b.m("CalHealth.RemoteDbManger", "Note: ignore the recurrence event status that was canceled! event id = " + i2);
                                        }
                                    }
                                    arrayList2 = arrayList;
                                } catch (Throwable th12) {
                                    th3 = th12;
                                    lofVar = lofVar2;
                                }
                            } catch (Exception e18) {
                                e2 = e18;
                                lofVar = lofVar2;
                                cursor4 = cursorQuery;
                                treeMap = treeMap2;
                            }
                            lofVar.b(cursor3);
                            lofVar.b(cursor);
                            lofVar.b(cursor2);
                            throw th;
                        }
                        lofVar = lofVar2;
                        cursor4 = cursorQuery;
                        treeMap = treeMap2;
                        try {
                            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                            StringBuilder sb5 = new StringBuilder(" in (");
                            int length = strArr2.length;
                            for (int i7 = 0; i7 < length; i7++) {
                                sb5.append("?,");
                            }
                            sb5.deleteCharAt(sb5.lastIndexOf(",")).append(")");
                            String string13 = sb5.toString();
                            Cursor cursorQuery2 = lofVar.a.getContentResolver().query(Uri.parse(str8), f, of5.ARG_EVENT_ID + string13, strArr2, null);
                            if (cursorQuery2 != null) {
                                try {
                                    if (cursorQuery2.getCount() > 0) {
                                        while (cursorQuery2.moveToNext()) {
                                            cursor2 = cursor4;
                                            try {
                                                int i8 = cursorQuery2.getInt(cursor2.getColumnIndex("_id"));
                                                int i9 = cursorQuery2.getInt(cursorQuery2.getColumnIndex("minutes"));
                                                int i10 = cursorQuery2.getInt(cursorQuery2.getColumnIndex("method"));
                                                CalendarBean calendarBean2 = (CalendarBean) treeMap.get(Integer.valueOf(i8));
                                                if (calendarBean2 != null) {
                                                    calendarBean2.setMethod(i10);
                                                    calendarBean2.setMinutes(i9);
                                                    if (i9 >= 0) {
                                                        if (calendarBean2.getReminderTime() == null) {
                                                            calendarBean2.setReminderTime(new ArrayList());
                                                        }
                                                        if (!calendarBean2.getReminderTime().contains(Integer.valueOf(i9))) {
                                                            calendarBean2.getReminderTime().add(Integer.valueOf(i9));
                                                        }
                                                    }
                                                }
                                                cursor4 = cursor2;
                                            } catch (Exception e19) {
                                                e = e19;
                                                exc = e;
                                                cursor3 = cursorQuery2;
                                                cursor = null;
                                                a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                                lofVar.b(cursor3);
                                                lofVar.b(cursor);
                                                lofVar.b(cursor2);
                                                return new ArrayList<>(treeMap.values());
                                            } catch (Throwable th13) {
                                                th = th13;
                                                th = th;
                                                cursor3 = cursorQuery2;
                                                cursor = null;
                                                lofVar.b(cursor3);
                                                lofVar.b(cursor);
                                                lofVar.b(cursor2);
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Exception e20) {
                                    e = e20;
                                    cursor2 = cursor4;
                                    exc = e;
                                    cursor3 = cursorQuery2;
                                    cursor = null;
                                } catch (Throwable th14) {
                                    th = th14;
                                    cursor2 = cursor4;
                                    th = th;
                                    cursor3 = cursorQuery2;
                                    cursor = null;
                                }
                            }
                            cursor2 = cursor4;
                            Cursor cursorQuery3 = lofVar.a.getContentResolver().query(Uri.parse(str9), g, of5.ARG_EVENT_ID + string13, strArr2, null);
                            if (cursorQuery3 != null) {
                                try {
                                    if (cursorQuery3.getCount() > 0) {
                                        while (cursorQuery3.moveToNext()) {
                                            int i11 = cursorQuery3.getInt(cursor2.getColumnIndex("_id"));
                                            int i12 = cursorQuery3.getInt(cursorQuery3.getColumnIndex("state"));
                                            CalendarBean calendarBean3 = (CalendarBean) treeMap.get(Integer.valueOf(i11));
                                            if (calendarBean3 != null) {
                                                calendarBean3.setState(i12);
                                            }
                                        }
                                    }
                                } catch (Exception e21) {
                                    exc = e21;
                                    cursor3 = cursorQuery2;
                                    cursor = cursorQuery3;
                                    a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                                    lofVar.b(cursor3);
                                    lofVar.b(cursor);
                                } catch (Throwable th15) {
                                    th = th15;
                                    cursor3 = cursorQuery2;
                                    cursor = cursorQuery3;
                                }
                            }
                            lofVar.b(cursorQuery2);
                            lofVar.b(cursorQuery3);
                        } catch (Exception e22) {
                            e = e22;
                            cursor2 = cursor4;
                            exc = e;
                            cursor = null;
                            cursor3 = null;
                        } catch (Throwable th16) {
                            th = th16;
                            cursor2 = cursor4;
                            th = th;
                            cursor = null;
                            cursor3 = null;
                        }
                        lofVar.b(cursor2);
                        return new ArrayList<>(treeMap.values());
                    }
                } catch (Exception e23) {
                    e = e23;
                    lofVar = lofVar2;
                    cursor2 = cursorQuery;
                    treeMap = treeMap2;
                } catch (Throwable th17) {
                    th = th17;
                    lofVar = lofVar2;
                    cursor2 = cursorQuery;
                }
                exc = e;
                cursor = null;
                cursor3 = null;
                a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                lofVar.b(cursor3);
                lofVar.b(cursor);
                lofVar.b(cursor2);
                return new ArrayList<>(treeMap.values());
            }
            lofVar = lofVar2;
            treeMap = treeMap2;
            try {
                a7b.b("CalHealth.RemoteDbManger", " get data empty for authority " + str);
                lofVar.b(cursorQuery);
                ArrayList<CalendarBean> arrayList3 = new ArrayList<>();
                lofVar.b(null);
                lofVar.b(null);
                lofVar.b(cursorQuery);
                return arrayList3;
            } catch (Exception e24) {
                e = e24;
                cursor = null;
                cursor2 = cursorQuery;
                cursor3 = null;
                exc = e;
                a7b.b("CalHealth.RemoteDbManger", "getRemoteCalendar error " + exc.getMessage());
                lofVar.b(cursor3);
                lofVar.b(cursor);
                lofVar.b(cursor2);
                return new ArrayList<>(treeMap.values());
            } catch (Throwable th18) {
                th2 = th18;
                cursor = null;
                cursor2 = cursorQuery;
                cursor3 = null;
                th = th2;
                lofVar.b(cursor3);
                lofVar.b(cursor);
                lofVar.b(cursor2);
                throw th;
            }
        } catch (Exception e25) {
            lofVar = lofVar2;
            treeMap = treeMap2;
            cursor = null;
            exc = e25;
            cursor2 = null;
            cursor3 = null;
        } catch (Throwable th19) {
            lofVar = lofVar2;
            cursor = null;
            th = th19;
            cursor2 = null;
            cursor3 = null;
        }
    }

    public ArrayList<CalendarBean> g() {
        ArrayList<CalendarBean> arrayListC = c();
        a7b.f("CalHealth.RemoteDbManger", "getRemoteCalendarBean android size " + arrayListC.size());
        CalendarBean calendarBean = !arrayListC.isEmpty() ? arrayListC.get(0) : null;
        if (kp2.t()) {
            ArrayList<CalendarBean> arrayListE = e();
            a7b.f("CalHealth.RemoteDbManger", "getRemoteCalendarBean oppo size " + arrayListE.size());
            if (!arrayListE.isEmpty()) {
                calendarBean = arrayListE.get(0);
            }
            arrayListC.addAll(arrayListE);
        }
        if (calendarBean != null) {
            String mLocation = calendarBean.getMLocation();
            if (mLocation == null) {
                mLocation = "";
            }
            String str = arrayListC.size() + "个日程\\n" + ("日程标题: " + v0j.a(calendarBean.getMTitle(), 1, 0) + "\\n日程时间: " + kp2.n(calendarBean.getMStartTime()) + "-" + kp2.n(calendarBean.getMEndTime()) + "\\n日程地点: " + v0j.a(mLocation, 3, 0));
            a7b.f("CalHealth.RemoteDbManger", "getRemoteCalendarBean infoContent " + str);
            n7a.a(68, 6, str);
        }
        return arrayListC;
    }

    public void i(Context context) {
        this.a = context;
    }

    public final boolean j(String str) {
        return this.b && TextUtils.equals("中国节日", str);
    }
}
