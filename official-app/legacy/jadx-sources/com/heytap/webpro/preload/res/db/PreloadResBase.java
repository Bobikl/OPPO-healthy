package com.heytap.webpro.preload.res.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.heytap.webpro.preload.res.db.entity.H5OfflineRecord;
import com.oplus.aiunit.vision.d94;
import com.oplus.aiunit.vision.fd8;

/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {H5OfflineRecord.class}, version = 1)
public abstract class PreloadResBase extends RoomDatabase {
    public static volatile PreloadResBase f;

    public static PreloadResBase e() {
        if (f == null) {
            synchronized (PreloadResBase.class) {
                if (f == null) {
                    f = (PreloadResBase) Room.databaseBuilder(d94.b(), PreloadResBase.class, "h5_offline_record.db").fallbackToDestructiveMigration().build();
                    f.getOpenHelper().setWriteAheadLoggingEnabled(false);
                }
            }
        }
        return f;
    }

    public abstract fd8 d();
}
