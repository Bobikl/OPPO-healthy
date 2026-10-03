package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.store.base.core.http.HttpUtils;

/* JADX INFO: loaded from: classes6.dex */
public class hdf extends SQLiteOpenHelper {
    public hdf(Context context) {
        super(g(context), "oplus_statistic_rom_realtime", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Context g(Context context) {
        Context contextH = w56.h();
        return contextH != null ? contextH : context;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA " + str + HttpUtils.EQUAL_SIGN + str2, null);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable th) {
            z6b.u("RealtimeSQLiteOpenHelper", "Failed to set PRAGMA " + str + HttpUtils.EQUAL_SIGN + str2 + ", err=" + th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.enableWriteAheadLogging();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(false);
        a(sQLiteDatabase, "synchronous", "NORMAL");
        a(sQLiteDatabase, "temp_store", "MEMORY");
        a(sQLiteDatabase, "busy_timeout", UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS common_info_rt (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_key_long INTEGER,header_index INTEGER,common_header TEXT,body_blob BLOB NOT NULL,sequence_id TEXT,common_appid TEXT,common_logtag TEXT,common_eventid TEXT,head_switch INTEGER,event_level INTEGER,network_type INTEGER,upload_type INTEGER,event_time INTEGER,cache_flag INTEGER,event_source INTEGER,raw_size INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_rt_event_time ON common_info_rt(event_time)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_rt_state ON common_info_rt(cache_flag, event_time, _id)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_rt_triplet ON common_info_rt(common_appid, common_logtag, common_eventid)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_rt_sequence ON common_info_rt(sequence_id)");
        z6b.q("RealtimeSQLiteOpenHelper", "Realtime DB created");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z6b.q("RealtimeSQLiteOpenHelper", "onUpgrade " + i + " -> " + i2);
    }
}
