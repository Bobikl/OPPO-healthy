package com.sensorsdata.analytics.android.sdk.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes10.dex */
public class OldBDatabaseHelper extends SQLiteOpenHelper {
    public OldBDatabaseHelper(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
    }

    public void getAllEvents(SQLiteDatabase sQLiteDatabase, SAProviderHelper.QueryEventsListener queryEventsListener) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery(String.format("SELECT * FROM %s ORDER BY %s", DbParams.TABLE_EVENTS, "created_at"), null);
                sQLiteDatabase.beginTransaction();
                while (cursorRawQuery.moveToNext()) {
                    queryEventsListener.insert(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("created_at")));
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                close();
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                sQLiteDatabase.endTransaction();
                close();
                if (cursorRawQuery == null) {
                    return;
                }
            }
            cursorRawQuery.close();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            close();
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
