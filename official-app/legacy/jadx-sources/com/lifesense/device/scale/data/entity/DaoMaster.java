package com.lifesense.device.scale.data.entity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.oplus.aiunit.vision.b05;
import com.oplus.aiunit.vision.b6;
import com.oplus.aiunit.vision.tli;
import com.oplus.aiunit.vision.wz4;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes4.dex */
public class DaoMaster extends b6 {
    public static final int SCHEMA_VERSION = 1;

    public static class a extends b {
        public a(Context context, String str) {
            super(context, str);
        }

        @Override // com.oplus.aiunit.vision.b05
        public void onUpgrade(wz4 wz4Var, int i, int i2) {
            Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
            DaoMaster.dropAllTables(wz4Var, true);
            onCreate(wz4Var);
        }
    }

    public static abstract class b extends b05 {
        public b(Context context, String str) {
            super(context, str, 1);
        }

        @Override // com.oplus.aiunit.vision.b05
        public void onCreate(wz4 wz4Var) {
            Log.i("greenDAO", "Creating tables for schema version 1");
            DaoMaster.createAllTables(wz4Var, false);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this(new tli(sQLiteDatabase));
    }

    public static void createAllTables(wz4 wz4Var, boolean z) {
        WeightDbDataDao.createTable(wz4Var, z);
        DeviceDao.createTable(wz4Var, z);
        DeviceSettingDao.createTable(wz4Var, z);
    }

    public static void dropAllTables(wz4 wz4Var, boolean z) {
        WeightDbDataDao.dropTable(wz4Var, z);
        DeviceDao.dropTable(wz4Var, z);
        DeviceSettingDao.dropTable(wz4Var, z);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new a(context, str).getWritableDb()).newSession();
    }

    @Override // com.oplus.aiunit.vision.b6
    public DaoSession newSession() {
        return new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    public DaoMaster(wz4 wz4Var) {
        super(wz4Var, 1);
        registerDaoClass(WeightDbDataDao.class);
        registerDaoClass(DeviceDao.class);
        registerDaoClass(DeviceSettingDao.class);
    }

    @Override // com.oplus.aiunit.vision.b6
    public DaoSession newSession(IdentityScopeType identityScopeType) {
        return new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }
}
