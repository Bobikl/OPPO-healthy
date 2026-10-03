package com.heytap.shield.authcode.dao;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oplus.aiunit.vision.bn0;
import com.oplus.aiunit.vision.dn0;

/* JADX INFO: loaded from: classes19.dex */
@Database(entities = {dn0.class}, exportSchema = false, version = 1)
public abstract class AuthenticationDb extends RoomDatabase {
    public static final int AUTHENTICATION_DATABASE_VERSION = 1;
    public static volatile AuthenticationDb f;

    public static AuthenticationDb e(Context context) {
        if (f == null) {
            synchronized (AuthenticationDb.class) {
                if (f == null) {
                    f = (AuthenticationDb) Room.databaseBuilder(context.getApplicationContext(), AuthenticationDb.class, "authentication.db").allowMainThreadQueries().build();
                }
            }
        }
        return f;
    }

    public abstract bn0 d();
}
