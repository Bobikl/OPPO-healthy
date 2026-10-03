package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ct6 implements bt6 {
    public final x56 a;

    public ct6(x56 x56Var) {
        this.a = x56Var;
    }

    @Override // com.oplus.aiunit.vision.bt6
    public List<zs6> a(List<zs6> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            HashSet hashSet = new HashSet();
            Iterator<zs6> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().a;
                if (str != null) {
                    hashSet.add(str);
                }
            }
            Map<String, zs6> mapH = h(writableDatabase, hashSet);
            for (zs6 zs6Var : list) {
                zs6 zs6Var2 = mapH.get(g(zs6Var.a, zs6Var.f19535c, zs6Var.d));
                boolean z = true;
                if (zs6Var2 != null && zs6Var2.equals(zs6Var)) {
                    z = false;
                }
                if (z) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("appId", zs6Var.a);
                    contentValues.put("event_key_long", Long.valueOf(zs6Var.b));
                    contentValues.put("eventGroup", zs6Var.f19535c);
                    contentValues.put("eventId", zs6Var.d);
                    contentValues.put("acceptNetType", Integer.valueOf(zs6Var.f19536e));
                    contentValues.put("headSwitch", Integer.valueOf(zs6Var.f));
                    contentValues.put("eventLevel", Integer.valueOf(zs6Var.g));
                    contentValues.put("uploadType", Integer.valueOf(zs6Var.h));
                    contentValues.put("status", Integer.valueOf(zs6Var.i));
                    contentValues.put("v", Integer.valueOf(zs6Var.k));
                    contentValues.put("updated_at", Long.valueOf(zs6Var.f19538l));
                    contentValues.put(SpeechConstant.KEY_SAMPLE_RATE, Integer.valueOf(zs6Var.f19537j));
                    if (writableDatabase.insertWithOnConflict("event_rules", null, contentValues, 5) != -1) {
                        arrayList.add(zs6Var);
                    }
                }
            }
            writableDatabase.setTransactionSuccessful();
            return arrayList;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.bt6
    public List<zs6> b(Set<String> set) {
        return new ArrayList(h(this.a.getReadableDatabase(), set).values());
    }

    @Override // com.oplus.aiunit.vision.bt6
    public Map<String, Integer> c() {
        HashMap map = new HashMap();
        Cursor cursorRawQuery = this.a.getReadableDatabase().rawQuery("SELECT appId, v FROM event_rules GROUP BY appId", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                String string = cursorRawQuery.getString(0);
                int i = cursorRawQuery.getInt(1);
                if (string != null) {
                    map.put(string, Integer.valueOf(i));
                }
            } finally {
                cursorRawQuery.close();
            }
        }
        return map;
    }

    @Override // com.oplus.aiunit.vision.bt6
    public zs6 d(String str, String str2, String str3) {
        zs6 zs6VarI = i(this.a.getReadableDatabase(), "appId=? AND eventGroup=? AND eventId=?", new String[]{str, str2, str3});
        if (zs6VarI != null) {
            return zs6VarI;
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.bt6
    public boolean e(String str) {
        if (str == null) {
            return false;
        }
        Cursor cursorQuery = this.a.getReadableDatabase().query("event_rules", new String[]{"appId"}, "appId=?", new String[]{str}, null, null, null, "1");
        try {
            return cursorQuery.moveToFirst();
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.bt6
    public List<zs6> f(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        Cursor cursorQuery = this.a.getReadableDatabase().query("event_rules", new String[]{"appId", "event_key_long", "eventGroup", "eventId", "acceptNetType", "headSwitch", "eventLevel", "uploadType", "status", "v", "updated_at", SpeechConstant.KEY_SAMPLE_RATE}, "appId=?", new String[]{str}, null, null, "eventGroup ASC, eventId ASC");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                zs6 zs6Var = new zs6();
                zs6Var.a = cursorQuery.getString(0);
                zs6Var.b = cursorQuery.getLong(1);
                zs6Var.f19535c = cursorQuery.getString(2);
                zs6Var.d = cursorQuery.getString(3);
                zs6Var.f19536e = cursorQuery.getInt(4);
                zs6Var.f = cursorQuery.getInt(5);
                zs6Var.g = cursorQuery.getInt(6);
                zs6Var.h = cursorQuery.getInt(7);
                zs6Var.i = cursorQuery.getInt(8);
                zs6Var.k = cursorQuery.getInt(9);
                zs6Var.f19538l = cursorQuery.getLong(10);
                zs6Var.f19537j = cursorQuery.getInt(11);
                arrayList.add(zs6Var);
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final String g(String str, String str2, String str3) {
        return str + "#" + str2 + "#" + str3;
    }

    public final Map<String, zs6> h(SQLiteDatabase sQLiteDatabase, Set<String> set) {
        HashMap map = new HashMap();
        if (set.isEmpty()) {
            return map;
        }
        ArrayList arrayList = new ArrayList(set);
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 500;
            List listSubList = arrayList.subList(i, Math.min(i2, arrayList.size()));
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM ");
            sb.append("event_rules");
            sb.append(" WHERE appId IN (");
            int i3 = 0;
            while (i3 < listSubList.size()) {
                sb.append(i3 == 0 ? "?" : ",?");
                i3++;
            }
            sb.append(")");
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) listSubList.toArray(new String[0]));
            while (cursorRawQuery.moveToNext()) {
                try {
                    zs6 zs6Var = new zs6();
                    zs6Var.a = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("appId"));
                    zs6Var.b = cursorRawQuery.getLong(cursorRawQuery.getColumnIndexOrThrow("event_key_long"));
                    zs6Var.f19535c = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("eventGroup"));
                    zs6Var.d = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("eventId"));
                    zs6Var.f19536e = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("acceptNetType"));
                    zs6Var.f = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("headSwitch"));
                    zs6Var.g = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("eventLevel"));
                    zs6Var.h = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("uploadType"));
                    zs6Var.i = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("status"));
                    zs6Var.k = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("v"));
                    zs6Var.f19538l = cursorRawQuery.getLong(cursorRawQuery.getColumnIndexOrThrow("updated_at"));
                    zs6Var.f19537j = cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow(SpeechConstant.KEY_SAMPLE_RATE));
                    map.put(g(zs6Var.a, zs6Var.f19535c, zs6Var.d), zs6Var);
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            i = i2;
        }
        return map;
    }

    public final zs6 i(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor cursorQuery = sQLiteDatabase.query("event_rules", new String[]{"appId", "event_key_long", "eventGroup", "eventId", "acceptNetType", "headSwitch", "eventLevel", "uploadType", "status", "v", "updated_at", SpeechConstant.KEY_SAMPLE_RATE}, str, strArr, null, null, null);
        try {
            if (!cursorQuery.moveToFirst()) {
                return null;
            }
            zs6 zs6Var = new zs6();
            zs6Var.a = cursorQuery.getString(0);
            zs6Var.b = cursorQuery.getLong(1);
            zs6Var.f19535c = cursorQuery.getString(2);
            zs6Var.d = cursorQuery.getString(3);
            zs6Var.f19536e = cursorQuery.getInt(4);
            zs6Var.f = cursorQuery.getInt(5);
            zs6Var.g = cursorQuery.getInt(6);
            zs6Var.h = cursorQuery.getInt(7);
            zs6Var.i = cursorQuery.getInt(8);
            zs6Var.k = cursorQuery.getInt(9);
            zs6Var.f19538l = cursorQuery.getLong(10);
            zs6Var.f19537j = cursorQuery.getInt(11);
            return zs6Var;
        } finally {
            cursorQuery.close();
        }
    }
}
