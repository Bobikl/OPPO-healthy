package com.heytap.accessory.pair.common.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.heytap.accessory.constant.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class KscDatabase_Impl extends KscDatabase {
    private volatile KscDao _kscDao;

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
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) { // from class: com.heytap.accessory.pair.common.db.KscDatabase_Impl.1
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
                hashSet2.add(new TableInfo.Index("index_ksc_info_deviceId_alias", true, Arrays.asList(Constants.EXTRA_DEVICE_ID, "alias"), Arrays.asList("ASC", "ASC")));
                TableInfo tableInfo = new TableInfo("ksc_info", map, hashSet, hashSet2);
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "ksc_info");
                if (tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(true, (String) null);
                }
                return new RoomOpenHelper.ValidationResult(false, "ksc_info(com.heytap.accessory.pair.common.db.EncryptedKscInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
        }, "4d7104bd469dbfc8015b6cc60d2126ac", "d66cca1cc4b2fd903e98c58f6c1d2c09")).build());
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // com.heytap.accessory.pair.common.db.KscDatabase
    public KscDao getKscDao() {
        KscDao kscDao;
        if (this._kscDao != null) {
            return this._kscDao;
        }
        synchronized (this) {
            if (this._kscDao == null) {
                this._kscDao = new KscDao_Impl(this);
            }
            kscDao = this._kscDao;
        }
        return kscDao;
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(KscDao.class, KscDao_Impl.getRequiredConverters());
        return map;
    }
}
