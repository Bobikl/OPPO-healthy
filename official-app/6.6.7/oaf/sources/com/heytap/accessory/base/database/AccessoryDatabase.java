package com.heytap.accessory.base.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Database(entities = {d.class, q.class, h.class, j.class, com.heytap.accessory.base.database.a.class}, exportSchema = false, version = 5)
public abstract class AccessoryDatabase extends RoomDatabase {
    public static volatile AccessoryDatabase a;
    public static final Migration b = new a(4, 5);

    public class a extends Migration {
        public a(int i, int i2) {
            super(i, i2);
        }

        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE `ServiceDescription`  ADD COLUMN `awakenable` INTEGER NOT NULL DEFAULT(0)");
            supportSQLiteDatabase.execSQL("ALTER TABLE `Device`  ADD COLUMN `uuidType` INTEGER NOT NULL DEFAULT(0)");
        }
    }

    public static AccessoryDatabase a(Context context) {
        return (AccessoryDatabase) Room.databaseBuilder(context, AccessoryDatabase.class, "accessory.db").addMigrations(new Migration[]{b}).allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    public static AccessoryDatabase b(Context context) {
        if (a == null) {
            synchronized (AccessoryDatabase.class) {
                if (a == null) {
                    a = a(context);
                }
            }
        }
        return a;
    }

    public abstract b a();

    public abstract f b();

    public abstract o c();
}
