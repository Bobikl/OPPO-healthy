package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class paf implements oaf {
    public final x56 a;

    public paf(x56 x56Var) {
        this.a = x56Var;
    }

    @Override // com.oplus.aiunit.vision.oaf
    public void a(String str, String str2, int i, long j2) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("UPDATE rate_limit_quota SET used_bytes = ?, updated_at = ? WHERE date_key=? AND app_id=? AND quota_type=?", new Object[]{Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()), str, str2, Integer.valueOf(i)});
            if (DatabaseUtils.longForQuery(writableDatabase, "SELECT changes()", null) == 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("date_key", str);
                contentValues.put("app_id", str2);
                contentValues.put("quota_type", Integer.valueOf(i));
                contentValues.put("used_bytes", Long.valueOf(j2));
                contentValues.put("dropped_bytes", (Integer) 0);
                contentValues.put("dropped_count", (Integer) 0);
                contentValues.put("updated_at", Long.valueOf(System.currentTimeMillis()));
                writableDatabase.insert("rate_limit_quota", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.oaf
    public void b(String str, String str2, int i, long j2, int i2) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("UPDATE rate_limit_quota SET dropped_bytes = dropped_bytes + ?, dropped_count = dropped_count + ?, updated_at = ? WHERE date_key=? AND app_id=? AND quota_type=?", new Object[]{Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis()), str, str2, Integer.valueOf(i)});
            if (DatabaseUtils.longForQuery(writableDatabase, "SELECT changes()", null) == 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("date_key", str);
                contentValues.put("app_id", str2);
                contentValues.put("quota_type", Integer.valueOf(i));
                contentValues.put("used_bytes", (Integer) 0);
                contentValues.put("dropped_bytes", Long.valueOf(j2));
                contentValues.put("dropped_count", Integer.valueOf(i2));
                contentValues.put("updated_at", Long.valueOf(System.currentTimeMillis()));
                writableDatabase.insert("rate_limit_quota", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.oaf
    public List<naf> c(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.a.getReadableDatabase().query("rate_limit_quota", new String[]{"date_key", "app_id", "quota_type", "used_bytes", "dropped_bytes", "dropped_count", "updated_at"}, "date_key=?", new String[]{str}, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(d(cursorQuery));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final naf d(Cursor cursor) {
        naf nafVar = new naf();
        nafVar.a = cursor.getString(0);
        nafVar.b = cursor.getString(1);
        nafVar.f14418c = cursor.getInt(2);
        nafVar.d = cursor.getLong(3);
        nafVar.f14419e = cursor.getLong(4);
        nafVar.f = cursor.getInt(5);
        nafVar.g = cursor.getLong(6);
        return nafVar;
    }
}
