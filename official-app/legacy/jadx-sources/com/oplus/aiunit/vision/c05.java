package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes13.dex */
public class c05 extends SQLiteOpenHelper implements u3i {
    public static final String[] i = {"_id", "url", "length", "mime"};

    public c05(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        voe.d(context);
    }

    @Override // com.oplus.aiunit.vision.u3i
    public void a(String str, t3i t3iVar) {
        voe.a(str, t3iVar);
        boolean z = get(str) != null;
        ContentValues contentValuesG = g(t3iVar);
        if (z) {
            getWritableDatabase().update("SourceInfo", contentValuesG, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, contentValuesG);
        }
    }

    public final ContentValues g(t3i t3iVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", t3iVar.a);
        contentValues.put("length", Long.valueOf(t3iVar.b));
        contentValues.put("mime", t3iVar.f16880c);
        return contentValues;
    }

    @Override // com.oplus.aiunit.vision.u3i
    public t3i get(String str) throws Throwable {
        voe.d(str);
        Cursor cursor = null;
        t3iVarH = null;
        t3i t3iVarH = null;
        try {
            Cursor cursorQuery = getReadableDatabase().query("SourceInfo", i, "url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        t3iVarH = h(cursorQuery);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return t3iVarH;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final t3i h(Cursor cursor) {
        return new t3i(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        voe.d(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
