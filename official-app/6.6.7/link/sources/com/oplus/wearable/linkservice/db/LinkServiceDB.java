package com.oplus.wearable.linkservice.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oplus.aiunit.vision.fi5;
import com.oplus.aiunit.vision.qj5;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Database(entities = {qj5.class}, exportSchema = false, version = 1)
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

    public abstract fi5 d();
}
