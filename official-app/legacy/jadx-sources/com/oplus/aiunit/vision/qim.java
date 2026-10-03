package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class qim extends SQLiteOpenHelper {
    public static qim a;

    public qim(Context context) {
        super(context, "tracker.sqlite", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS biz ( id INTEGER PRIMARY KEY, data BLOB, eventId TEXT, createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP, monitorKey TEXT ) ");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS apm ( id INTEGER PRIMARY KEY, data BLOB, eventId TEXT, createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP, monitorKey TEXT  ) ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
