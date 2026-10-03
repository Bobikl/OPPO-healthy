package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;

/* JADX INFO: loaded from: classes19.dex */
public class zp2 extends SQLiteOpenHelper {
    public static final String TAG = "CalHealth.CalendarDbHelper";
    public static final String i = String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY,%s INTEGER NOT NULL,%s TEXT ,%s TEXT ,%s TEXT ,%s INTEGER ,%s INTEGER ,%s TEXT ,%s INTEGER ,%s INTEGER ,%s INTEGER ,%s INTEGER ,%s TEXT ,%s TEXT ,%s INTEGER ,%s INTEGER ,%s INTEGER ,%s LONG ,%s INTEGER ,%s TEXT ,%s TEXT ,%s TEXT ,%s TEXT ,%s TEXT ,%s TEXT ,%s TEXT ,%s INTEGER ,%s TEXT ,%s INTEGER ,%s TEXT ,%s INTEGER ,%s LONG );", "calendar_health", "_id", of5.ARG_EVENT_ID, "title", "eventLocation", iim.a.f, "dtstart", "dtend", "eventTimezone", HrvHistoryActivity.ALL_DAY, "hasAlarm", "method", "minutes", "repeat_type", "duration", "calendar_id", "state", "other", "operate_time", "status", "reminder_time", "rdate", "exrule", "exdate", "original_id", "originalInstanceTime", "originalAllDay", "eventStatus", "phone_event_id", "watch_event_id", "calendar_name", "calendar_color", "event_update_time");

    public zp2(Context context) {
        super(context, "calendar_schedule.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN reminder_time TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN rdate TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN exrule TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN exdate TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN original_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN originalInstanceTime TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN originalAllDay TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN eventStatus INTEGER");
    }

    public final void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN phone_event_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN watch_event_id INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN calendar_name TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN calendar_color INTEGER");
        sQLiteDatabase.execSQL("ALTER TABLE calendar_health ADD COLUMN event_update_time LONG");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (sQLiteDatabase != null) {
            if (i2 == 1) {
                if (i3 == 2) {
                    a(sQLiteDatabase);
                    return;
                } else {
                    if (i3 == 3) {
                        a(sQLiteDatabase);
                        g(sQLiteDatabase);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 2) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS calendar_health;");
                onCreate(sQLiteDatabase);
            } else if (i3 == 3) {
                g(sQLiteDatabase);
            }
        }
    }
}
