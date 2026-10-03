package com.heytap.health.watch.music.transfer.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.dac;
import com.oplus.aiunit.vision.v9c;

/* JADX INFO: loaded from: classes19.dex */
@Database(entities = {dac.class}, exportSchema = false, version = 1)
public abstract class MusicDatabase extends RoomDatabase {
    public static volatile MusicDatabase f;
    public static final Object g = new Object();

    public static MusicDatabase d() {
        MusicDatabase musicDatabase;
        synchronized (g) {
            if (f == null) {
                f = (MusicDatabase) Room.databaseBuilder(b78.a().getApplicationContext(), MusicDatabase.class, "music.db").fallbackToDestructiveMigration().build();
            }
            musicDatabase = f;
        }
        return musicDatabase;
    }

    public abstract v9c e();
}
