package com.oplus.ocs.authenticate.data;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oplus.aiunit.vision.nbm;
import com.oplus.aiunit.vision.nlm;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {nlm.class}, exportSchema = false, version = 2)
public abstract class AuthenticationDb extends RoomDatabase {
    public static volatile AuthenticationDb f;

    public static AuthenticationDb e(Context context) {
        if (f == null) {
            synchronized (AuthenticationDb.class) {
                if (f == null) {
                    f = (AuthenticationDb) Room.databaseBuilder(context.getApplicationContext(), AuthenticationDb.class, "authentication.db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
                }
            }
        }
        return f;
    }

    public abstract nbm d();
}
