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
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class AccessoryDatabase_Impl extends AccessoryDatabase {
    public volatile f c;
    public volatile b d;
    public volatile o e;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ChannelDescription` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `channelId` INTEGER NOT NULL, `class` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `dataType` INTEGER NOT NULL, `agentId` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ChannelDescription_agentId_channelId` ON `ChannelDescription` (`agentId`, `channelId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `ServiceDescription` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `deviceId` INTEGER NOT NULL, `appName` TEXT NOT NULL, `appHash` TEXT NOT NULL, `profileId` TEXT NOT NULL, `agentImplClass` TEXT NOT NULL, `agentId` INTEGER NOT NULL, `role` INTEGER NOT NULL, `transportId` INTEGER NOT NULL, `mexSupport` INTEGER NOT NULL, `socketSupport` INTEGER NOT NULL, `persistence` TEXT NOT NULL, `aspVer` TEXT NOT NULL, `privilegeLevel` INTEGER NOT NULL, `serviceLimitId` INTEGER NOT NULL, `connectionTimeOut` INTEGER NOT NULL, `sdkVersionCode` INTEGER NOT NULL, `awakenable` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Device` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `transportId` INTEGER NOT NULL, `transportAddress` TEXT, `uuidType` INTEGER NOT NULL, `deviceName` TEXT NOT NULL, `checkSum` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `IgnoreDevice` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uniqueDeviceId` TEXT, `deviceName` TEXT, `address` TEXT, `deviceMajorClass` INTEGER NOT NULL, `deviceSpeClass` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_IgnoreDevice_uniqueDeviceId` ON `IgnoreDevice` (`uniqueDeviceId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `a_e` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `auth_code` TEXT, `is_enable` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `packageName` TEXT, `capability_name` TEXT, `expiration` INTEGER NOT NULL, `permission` BLOB, `last_update_time` INTEGER NOT NULL, `cache_time` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ef7b58431a0bf401525eb83c3c470e76')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ChannelDescription`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `ServiceDescription`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Device`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `IgnoreDevice`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `a_e`");
            if (((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) AccessoryDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            AccessoryDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) AccessoryDatabase_Impl.this).mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            map.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, (String) null, 1));
            map.put("channelId", new TableInfo.Column("channelId", "INTEGER", true, 0, (String) null, 1));
            map.put("class", new TableInfo.Column("class", "INTEGER", true, 0, (String) null, 1));
            map.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, (String) null, 1));
            map.put("dataType", new TableInfo.Column("dataType", "INTEGER", true, 0, (String) null, 1));
            map.put("agentId", new TableInfo.Column("agentId", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_ChannelDescription_agentId_channelId", true, Arrays.asList("agentId", "channelId")));
            TableInfo tableInfo = new TableInfo("ChannelDescription", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "ChannelDescription");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "ChannelDescription(com.heytap.accessory.base.database.ChannelDescriptionDbBean).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(18);
            map2.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, (String) null, 1));
            map2.put(Constants.EXTRA_DEVICE_ID, new TableInfo.Column(Constants.EXTRA_DEVICE_ID, "INTEGER", true, 0, (String) null, 1));
            map2.put("appName", new TableInfo.Column("appName", "TEXT", true, 0, (String) null, 1));
            map2.put("appHash", new TableInfo.Column("appHash", "TEXT", true, 0, (String) null, 1));
            map2.put("profileId", new TableInfo.Column("profileId", "TEXT", true, 0, (String) null, 1));
            map2.put("agentImplClass", new TableInfo.Column("agentImplClass", "TEXT", true, 0, (String) null, 1));
            map2.put("agentId", new TableInfo.Column("agentId", "INTEGER", true, 0, (String) null, 1));
            map2.put("role", new TableInfo.Column("role", "INTEGER", true, 0, (String) null, 1));
            map2.put("transportId", new TableInfo.Column("transportId", "INTEGER", true, 0, (String) null, 1));
            map2.put("mexSupport", new TableInfo.Column("mexSupport", "INTEGER", true, 0, (String) null, 1));
            map2.put("socketSupport", new TableInfo.Column("socketSupport", "INTEGER", true, 0, (String) null, 1));
            map2.put("persistence", new TableInfo.Column("persistence", "TEXT", true, 0, (String) null, 1));
            map2.put("aspVer", new TableInfo.Column("aspVer", "TEXT", true, 0, (String) null, 1));
            map2.put("privilegeLevel", new TableInfo.Column("privilegeLevel", "INTEGER", true, 0, (String) null, 1));
            map2.put("serviceLimitId", new TableInfo.Column("serviceLimitId", "INTEGER", true, 0, (String) null, 1));
            map2.put("connectionTimeOut", new TableInfo.Column("connectionTimeOut", "INTEGER", true, 0, (String) null, 1));
            map2.put("sdkVersionCode", new TableInfo.Column("sdkVersionCode", "INTEGER", true, 0, (String) null, 1));
            map2.put("awakenable", new TableInfo.Column("awakenable", "INTEGER", true, 0, (String) null, 1));
            TableInfo tableInfo3 = new TableInfo("ServiceDescription", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "ServiceDescription");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "ServiceDescription(com.heytap.accessory.base.database.ServiceDescriptionDbBean).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(6);
            map3.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, (String) null, 1));
            map3.put("transportId", new TableInfo.Column("transportId", "INTEGER", true, 0, (String) null, 1));
            map3.put("transportAddress", new TableInfo.Column("transportAddress", "TEXT", false, 0, (String) null, 1));
            map3.put("uuidType", new TableInfo.Column("uuidType", "INTEGER", true, 0, (String) null, 1));
            map3.put("deviceName", new TableInfo.Column("deviceName", "TEXT", true, 0, (String) null, 1));
            map3.put("checkSum", new TableInfo.Column("checkSum", "INTEGER", true, 0, (String) null, 1));
            TableInfo tableInfo5 = new TableInfo("Device", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "Device");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "Device(com.heytap.accessory.base.database.DeviceDbBean).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(6);
            map4.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, (String) null, 1));
            map4.put("uniqueDeviceId", new TableInfo.Column("uniqueDeviceId", "TEXT", false, 0, (String) null, 1));
            map4.put("deviceName", new TableInfo.Column("deviceName", "TEXT", false, 0, (String) null, 1));
            map4.put("address", new TableInfo.Column("address", "TEXT", false, 0, (String) null, 1));
            map4.put("deviceMajorClass", new TableInfo.Column("deviceMajorClass", "INTEGER", true, 0, (String) null, 1));
            map4.put("deviceSpeClass", new TableInfo.Column("deviceSpeClass", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_IgnoreDevice_uniqueDeviceId", true, Arrays.asList("uniqueDeviceId")));
            TableInfo tableInfo7 = new TableInfo("IgnoreDevice", map4, hashSet3, hashSet4);
            TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "IgnoreDevice");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "IgnoreDevice(com.heytap.accessory.base.database.DiscoveryIgnoreDeviceBean).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(10);
            map5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
            map5.put(ProtocolEventManager.Event.AUTH_CODE, new TableInfo.Column(ProtocolEventManager.Event.AUTH_CODE, "TEXT", false, 0, (String) null, 1));
            map5.put("is_enable", new TableInfo.Column("is_enable", "INTEGER", true, 0, (String) null, 1));
            map5.put("uid", new TableInfo.Column("uid", "INTEGER", true, 0, (String) null, 1));
            map5.put("packageName", new TableInfo.Column("packageName", "TEXT", false, 0, (String) null, 1));
            map5.put("capability_name", new TableInfo.Column("capability_name", "TEXT", false, 0, (String) null, 1));
            map5.put("expiration", new TableInfo.Column("expiration", "INTEGER", true, 0, (String) null, 1));
            map5.put("permission", new TableInfo.Column("permission", "BLOB", false, 0, (String) null, 1));
            map5.put("last_update_time", new TableInfo.Column("last_update_time", "INTEGER", true, 0, (String) null, 1));
            map5.put("cache_time", new TableInfo.Column("cache_time", "INTEGER", true, 0, (String) null, 1));
            TableInfo tableInfo9 = new TableInfo("a_e", map5, new HashSet(0), new HashSet(0));
            TableInfo tableInfo10 = TableInfo.read(supportSQLiteDatabase, "a_e");
            if (tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "a_e(com.heytap.accessory.base.database.AuthenticationDbBean).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `ChannelDescription`");
            writableDatabase.execSQL("DELETE FROM `ServiceDescription`");
            writableDatabase.execSQL("DELETE FROM `Device`");
            writableDatabase.execSQL("DELETE FROM `IgnoreDevice`");
            writableDatabase.execSQL("DELETE FROM `a_e`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"ChannelDescription", "ServiceDescription", "Device", "IgnoreDevice", "a_e"});
    }

    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(5), "ef7b58431a0bf401525eb83c3c470e76", "48ab72d3643e4317ddd30d903075bd41")).build());
    }

    @Override // com.heytap.accessory.base.database.AccessoryDatabase
    public o c() {
        o oVar;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new p(this);
            }
            oVar = this.e;
        }
        return oVar;
    }

    @Override // com.heytap.accessory.base.database.AccessoryDatabase
    public b a() {
        b bVar;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new c(this);
            }
            bVar = this.d;
        }
        return bVar;
    }

    @Override // com.heytap.accessory.base.database.AccessoryDatabase
    public f b() {
        f fVar;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new g(this);
            }
            fVar = this.c;
        }
        return fVar;
    }
}
