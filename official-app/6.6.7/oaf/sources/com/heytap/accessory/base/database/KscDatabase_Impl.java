package com.heytap.accessory.base.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.heytap.accessory.constant.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class KscDatabase_Impl extends KscDatabase {
    public volatile m b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ksc_info` (`deviceId` TEXT, `alias` TEXT, `autoId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ksc` TEXT, `iv` TEXT, `date` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ksc_info_deviceId_alias` ON `ksc_info` (`deviceId`, `alias`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4d7104bd469dbfc8015b6cc60d2126ac')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ksc_info`");
            if (((RoomDatabase) KscDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) KscDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) KscDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) KscDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) KscDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) KscDatabase_Impl.this).mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) KscDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            KscDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) KscDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) KscDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) KscDatabase_Impl.this).mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(6);
            map.put(Constants.EXTRA_DEVICE_ID, new TableInfo.Column(Constants.EXTRA_DEVICE_ID, "TEXT", false, 0, (String) null, 1));
            map.put("alias", new TableInfo.Column("alias", "TEXT", false, 0, (String) null, 1));
            map.put("autoId", new TableInfo.Column("autoId", "INTEGER", true, 1, (String) null, 1));
            map.put("ksc", new TableInfo.Column("ksc", "TEXT", false, 0, (String) null, 1));
            map.put("iv", new TableInfo.Column("iv", "TEXT", false, 0, (String) null, 1));
            map.put("date", new TableInfo.Column("date", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_ksc_info_deviceId_alias", true, Arrays.asList(Constants.EXTRA_DEVICE_ID, "alias")));
            TableInfo tableInfo = new TableInfo("ksc_info", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "ksc_info");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "ksc_info(com.heytap.accessory.base.database.EncryptedKscInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `ksc_info`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"ksc_info"});
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "4d7104bd469dbfc8015b6cc60d2126ac", "85d25b233a76c96c07b8a7d2fa2874af")).build());
    }

    @Override // com.heytap.accessory.base.database.KscDatabase
    public m a() {
        m mVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new n(this);
            }
            mVar = this.b;
        }
        return mVar;
    }
}
