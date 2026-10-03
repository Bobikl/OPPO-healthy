package com.heytap.health.watchface.business.creation.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oplus.aiunit.vision.i2b;

/* JADX INFO: loaded from: classes19.dex */
@Database(entities = {LivePhotoRecord.class}, exportSchema = false, version = 1)
public abstract class LivePhotoRecordDatabase extends RoomDatabase {
    public static final int DATABASE_VERSION = 1;
    public static volatile LivePhotoRecordDatabase f;

    public static LivePhotoRecordDatabase c(Context context) {
        return (LivePhotoRecordDatabase) Room.databaseBuilder(context, LivePhotoRecordDatabase.class, "livephoto_record_database.db").build();
    }

    public static LivePhotoRecordDatabase e(Context context) {
        if (f == null) {
            synchronized (LivePhotoRecordDatabase.class) {
                if (f == null) {
                    f = c(context);
                }
            }
        }
        return f;
    }

    public abstract i2b d();
}
