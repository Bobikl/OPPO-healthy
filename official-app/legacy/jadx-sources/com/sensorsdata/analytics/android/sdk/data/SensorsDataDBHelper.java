package com.sensorsdata.analytics.android.sdk.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes10.dex */
class SensorsDataDBHelper extends SQLiteOpenHelper {
    private static final String TAG = "SA.SQLiteOpenHelper";
    private static final String CREATE_EVENTS_TABLE = String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL DEFAULT 0);", DbParams.TABLE_EVENTS, "data", "created_at", DbParams.KEY_IS_INSTANT_EVENT);
    private static final String EVENTS_TIME_INDEX = String.format("CREATE INDEX IF NOT EXISTS time_idx ON %s (%s);", DbParams.TABLE_EVENTS, "created_at");
    private static final String CHANNEL_EVENT_PERSISTENT_TABLE = String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT PRIMARY KEY, %s INTEGER)", DbParams.TABLE_CHANNEL_PERSISTENT, DbParams.KEY_CHANNEL_EVENT_NAME, "result");

    public SensorsDataDBHelper(Context context) {
        super(context, DbParams.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 6);
    }

    private boolean checkColumnExist(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z = false;
        Cursor cursorRawQuery = null;
        try {
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                    if (cursorRawQuery != null && cursorRawQuery.getColumnIndex(str2) != -1) {
                        z = true;
                    }
                    if (cursorRawQuery != null) {
                        if (!cursorRawQuery.isClosed()) {
                            cursorRawQuery.close();
                        }
                    }
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                    if (cursorRawQuery != null) {
                        if (!cursorRawQuery.isClosed()) {
                            cursorRawQuery.close();
                        }
                    }
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        if (!cursorRawQuery.isClosed()) {
                            cursorRawQuery.close();
                        }
                    } catch (Exception e3) {
                        SALog.printStackTrace(e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            SALog.printStackTrace(e4);
        }
        return z;
    }

    private void createTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_EVENTS_TABLE);
        sQLiteDatabase.execSQL(EVENTS_TIME_INDEX);
        sQLiteDatabase.execSQL(CHANNEL_EVENT_PERSISTENT_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        SALog.i(TAG, "Creating a new Sensors Analytics DB");
        createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SALog.i(TAG, "Upgrading app, replacing Sensors Analytics DB, oldVersion:" + i + ", newVersion:" + i2);
        if (i < 4) {
            try {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", DbParams.TABLE_EVENTS));
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return;
            }
        }
        createTable(sQLiteDatabase);
        if (i < 4 || i > 5 || checkColumnExist(sQLiteDatabase, DbParams.TABLE_EVENTS, DbParams.KEY_IS_INSTANT_EVENT)) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN  is_instant_event INTEGER NOT NULL DEFAULT 0");
    }
}
