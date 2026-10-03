package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class mq2 {
    public static final ContentResolver b = b78.a().getContentResolver();
    public final zq2 a;

    public mq2(zq2 zq2Var) {
        woe.b(zq2Var);
        this.a = zq2Var;
    }

    public int a() {
        a7b.f("CalendarOperation", "delete event begin");
        List<Uri> listB = b();
        int iDelete = 0;
        if (listB.isEmpty()) {
            a7b.f("CalendarOperation", "delete event, uri list is empty");
            return 0;
        }
        if (listB.size() != 1) {
            a7b.f("CalendarOperation", "delete event, uri list count bigger than 1");
            return 0;
        }
        Iterator<Uri> it = listB.iterator();
        while (it.hasNext()) {
            iDelete += b.delete(it.next(), null, null);
        }
        a7b.f("CalendarOperation", "delete event end, count:" + iDelete);
        return iDelete;
    }

    public List<Uri> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorD = d();
        if (cursorD == null || cursorD.getCount() == 0) {
            a7b.f("CalendarOperation", "get uri, cursor is null or cursor's count is 0");
            if (cursorD != null) {
                cursorD.close();
            }
            return arrayList;
        }
        cursorD.moveToFirst();
        while (!cursorD.isAfterLast()) {
            int columnIndex = cursorD.getColumnIndex("_id");
            if (columnIndex >= 0) {
                Uri uriWithAppendedId = ContentUris.withAppendedId(Uri.parse(vp2.CALENDAR_EVENT_URL), cursorD.getInt(columnIndex));
                StringBuilder sb = new StringBuilder();
                sb.append("get uri success, uri is :");
                sb.append(uriWithAppendedId.toString());
                arrayList.add(uriWithAppendedId);
            }
            cursorD.moveToNext();
        }
        cursorD.close();
        return arrayList;
    }

    public Uri c() {
        a7b.f("CalendarOperation", "insert event begin");
        Uri uriInsert = b.insert(Uri.parse(vp2.CALENDAR_EVENT_URL), this.a.a());
        if (uriInsert == null) {
            a7b.b("CalendarOperation", "insertUri == null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("insert event end, uri :");
        sb.append(uriInsert.toString());
        return uriInsert;
    }

    public Cursor d() {
        String[] strArr;
        a7b.f("CalendarOperation", "query event begin");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ContentValues contentValuesA = this.a.a();
        Set<String> setKeySet = contentValuesA.keySet();
        int size = setKeySet.size();
        String[] strArr2 = new String[size];
        setKeySet.toArray(strArr2);
        for (int i = 0; i < size; i++) {
            String str = strArr2[i];
            if (contentValuesA.getAsString(str) != null) {
                if (!sb.toString().equals("")) {
                    sb.append(" and ");
                }
                sb.append(str);
                sb.append(" =?");
                arrayList.add(contentValuesA.getAsString(str));
            }
        }
        if (arrayList.size() > 0) {
            strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
        } else {
            strArr = null;
        }
        Cursor cursorQuery = b.query(Uri.parse(vp2.CALENDAR_EVENT_URL), null, sb.toString(), strArr, null);
        a7b.f("CalendarOperation", "query event end");
        return cursorQuery;
    }

    public int e(ContentValues contentValues) {
        a7b.f("CalendarOperation", "update event begin");
        List<Uri> listB = b();
        int iUpdate = 0;
        if (listB.isEmpty()) {
            a7b.f("CalendarOperation", "update event, uris is empty");
            return 0;
        }
        if (listB.size() != 1) {
            a7b.f("CalendarOperation", "update event, uri list count bigger than 1");
            return 0;
        }
        a7b.f("CalendarOperation", "update calendar,contentValues:" + contentValues);
        Iterator<Uri> it = listB.iterator();
        while (it.hasNext()) {
            iUpdate += b.update(it.next(), contentValues, null, null);
        }
        a7b.f("CalendarOperation", "update event end, count:" + iUpdate);
        return iUpdate;
    }
}
