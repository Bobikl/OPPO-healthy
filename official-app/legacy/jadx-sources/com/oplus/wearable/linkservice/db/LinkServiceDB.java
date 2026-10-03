package com.oplus.wearable.linkservice.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oplus.aiunit.vision.jh5;
import com.oplus.aiunit.vision.ui5;

/* JADX INFO: loaded from: classes5.dex */
@Database(entities = {ui5.class}, exportSchema = false, version = 1)
public abstract class LinkServiceDB extends RoomDatabase {
    public static volatile LinkServiceDB f;

    public static LinkServiceDB c(Context context) {
        if (f == null) {
            synchronized (LinkServiceDB.class) {
                if (f == null) {
                    f = (LinkServiceDB) Room.databaseBuilder(context.getApplicationContext(), LinkServiceDB.class, "link_service.db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
                }
            }
        }
        return f;
    }

    public abstract jh5 d();
}
