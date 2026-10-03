package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class c25 {
    public static long a(SQLiteDatabase sQLiteDatabase) {
        long jB = b(sQLiteDatabase, "PRAGMA page_count");
        long jB2 = b(sQLiteDatabase, "PRAGMA page_size");
        if (jB < 0 || jB2 < 0) {
            return -1L;
        }
        return jB * jB2;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, null);
        try {
            if (cursorRawQuery.moveToFirst()) {
                return cursorRawQuery.getLong(0);
            }
            return -1L;
        } finally {
            cursorRawQuery.close();
        }
    }
}
