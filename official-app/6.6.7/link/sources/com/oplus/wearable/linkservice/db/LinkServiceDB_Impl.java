package com.oplus.wearable.linkservice.db;

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
import com.oplus.aiunit.vision.fi5;
import com.oplus.aiunit.vision.hi5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class LinkServiceDB_Impl extends LinkServiceDB {
    public volatile fi5 g;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `device_info` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `node_id` TEXT, `product_type` INTEGER NOT NULL, `main_mac` TEXT, `main_type` INTEGER NOT NULL, `stub_mac` TEXT, `stub_type` INTEGER NOT NULL, `encrypt_key` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_device_info_node_id` ON `device_info` (`node_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd2b67928aed89dd79dba22f7bd26c09b')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `device_info`");
            if (((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) LinkServiceDB_Impl.this).mDatabase = supportSQLiteDatabase;
            LinkServiceDB_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) LinkServiceDB_Impl.this).mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(8);
            map.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, (String) null, 1));
            map.put("node_id", new TableInfo.Column("node_id", "TEXT", false, 0, (String) null, 1));
            map.put("product_type", new TableInfo.Column("product_type", "INTEGER", true, 0, (String) null, 1));
            map.put("main_mac", new TableInfo.Column("main_mac", "TEXT", false, 0, (String) null, 1));
            map.put("main_type", new TableInfo.Column("main_type", "INTEGER", true, 0, (String) null, 1));
            map.put("stub_mac", new TableInfo.Column("stub_mac", "TEXT", false, 0, (String) null, 1));
            map.put("stub_type", new TableInfo.Column("stub_type", "INTEGER", true, 0, (String) null, 1));
            map.put("encrypt_key", new TableInfo.Column("encrypt_key", "TEXT", false, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_device_info_node_id", true, Arrays.asList("node_id"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo(fi5.TABLE_DEVICE_INFO, map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, fi5.TABLE_DEVICE_INFO);
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "device_info(com.oplus.wearable.linkservice.db.device.DeviceInfoT).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `device_info`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{fi5.TABLE_DEVICE_INFO});
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(1), "d2b67928aed89dd79dba22f7bd26c09b", "066ea6ad208828f0a50d90491e286ff5")).build());
    }

    @Override // com.oplus.wearable.linkservice.db.LinkServiceDB
    public fi5 d() {
        fi5 fi5Var;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new hi5(this);
            }
            fi5Var = this.g;
        }
        return fi5Var;
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(fi5.class, hi5.a());
        return map;
    }
}
