package com.heytap.store.db.entity.dao;

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
    public static final int SCHEMA_VERSION = 2;

    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
            super(context, str);
        }

        @Override // com.oplus.aiunit.vision.b05
        public void onUpgrade(wz4 wz4Var, int i, int i2) {
            Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
            DaoMaster.dropAllTables(wz4Var, true);
            onCreate(wz4Var);
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    public static abstract class OpenHelper extends b05 {
        public OpenHelper(Context context, String str) {
            super(context, str, 2);
        }

        @Override // com.oplus.aiunit.vision.b05
        public void onCreate(wz4 wz4Var) {
            Log.i("greenDAO", "Creating tables for schema version 2");
            DaoMaster.createAllTables(wz4Var, false);
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, 2);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this(new tli(sQLiteDatabase));
    }

    public static void createAllTables(wz4 wz4Var, boolean z) {
        AnnounceBannersDao.createTable(wz4Var, z);
    }

    public static void dropAllTables(wz4 wz4Var, boolean z) {
        AnnounceBannersDao.dropTable(wz4Var, z);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).newSession();
    }

    public DaoMaster(wz4 wz4Var) {
        super(wz4Var, 2);
        registerDaoClass(AnnounceBannersDao.class);
    }

    @Override // com.oplus.aiunit.vision.b6
    public DaoSession newSession() {
        return new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // com.oplus.aiunit.vision.b6
    public DaoSession newSession(IdentityScopeType identityScopeType) {
        return new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }
}
