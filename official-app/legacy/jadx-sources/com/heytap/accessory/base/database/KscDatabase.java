package com.heytap.accessory.base.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/* JADX INFO: loaded from: classes14.dex */
@Database(entities = {k.class}, exportSchema = false, version = 1)
public abstract class KscDatabase extends RoomDatabase {
    public static volatile KscDatabase a;

    public static KscDatabase a(Context context) {
        return (KscDatabase) Room.databaseBuilder(context, KscDatabase.class, "ksc.db").build();
    }

    public static KscDatabase b(Context context) {
        if (a == null) {
            synchronized (KscDatabase.class) {
                if (a == null) {
                    a = a(context);
                }
            }
        }
        return a;
    }

    public abstract m a();
}
