package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class ci8 implements bi8 {
    public final x56 a;

    public ci8(x56 x56Var) {
        this.a = x56Var;
    }

    @Override // com.oplus.aiunit.vision.bi8
    public String a() {
        Cursor cursorRawQuery = this.a.getReadableDatabase().rawQuery("SELECT headerJson FROM header_index ORDER BY _id DESC LIMIT 1", null);
        try {
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getString(0) : null;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.bi8
    public String b(long j2) {
        if (j2 <= 0) {
            return null;
        }
        Cursor cursorRawQuery = this.a.getReadableDatabase().rawQuery("SELECT headerJson FROM header_index WHERE _id=? LIMIT 1", new String[]{String.valueOf(j2)});
        try {
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getString(0) : null;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.bi8
    public long c(String str) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("headerJson", str);
        contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        long jInsertWithOnConflict = writableDatabase.insertWithOnConflict("header_index", null, contentValues, 4);
        if (jInsertWithOnConflict != -1) {
            return jInsertWithOnConflict;
        }
        Cursor cursorQuery = writableDatabase.query("header_index", new String[]{"_id"}, "headerJson=?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getLong(0);
            }
            return -1L;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.bi8
    public int d() {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT COUNT(*) FROM header_index", null);
        try {
            if (!cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                return 0;
            }
            if (cursorRawQuery.getLong(0) <= 50) {
                cursorRawQuery.close();
                return 0;
            }
            cursorRawQuery.close();
            Cursor cursorRawQuery2 = writableDatabase.rawQuery("SELECT created_at, _id FROM header_index ORDER BY created_at DESC, _id DESC LIMIT 1 OFFSET 49", null);
            try {
                if (!cursorRawQuery2.moveToFirst()) {
                    return 0;
                }
                long j2 = cursorRawQuery2.getLong(0);
                return writableDatabase.delete("header_index", "created_at < ? OR (created_at = ? AND _id < ?)", new String[]{String.valueOf(j2), String.valueOf(j2), String.valueOf(cursorRawQuery2.getLong(1))});
            } finally {
                cursorRawQuery2.close();
            }
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
