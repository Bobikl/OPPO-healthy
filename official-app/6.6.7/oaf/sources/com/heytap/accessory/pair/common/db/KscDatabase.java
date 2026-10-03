package com.heytap.accessory.pair.common.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Database(entities = {EncryptedKscInfo.class}, exportSchema = false, version = 1)
public abstract class KscDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "ksc.db";
    public static final int KSC_DATABASE_VERSION = 1;
    private static volatile KscDatabase sInstance;

    private static KscDatabase buildDatabase(Context context) {
        return (KscDatabase) Room.databaseBuilder(context, KscDatabase.class, DATABASE_NAME).build();
    }

    public static KscDatabase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (KscDatabase.class) {
                if (sInstance == null) {
                    sInstance = buildDatabase(context);
                }
            }
        }
        return sInstance;
    }

    public abstract KscDao getKscDao();
}
