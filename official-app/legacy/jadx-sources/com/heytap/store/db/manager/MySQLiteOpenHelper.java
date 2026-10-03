package com.heytap.store.db.manager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.heytap.store.db.entity.dao.DaoMaster;
import com.oplus.aiunit.vision.wz4;

/* JADX INFO: loaded from: classes4.dex */
public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
    private static final String DB_NAME = "store_db";
    private static final String TAG = "MySQLiteOpenHelper";
    private static MySQLiteOpenHelper instance;
    private OnExecuteMigrationListener onExecuteMigrationListener;

    public interface OnExecuteMigrationListener {
        void executeMigrations(wz4 wz4Var, int i, int i2);
    }

    public MySQLiteOpenHelper(Context context, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, DB_NAME, cursorFactory);
    }

    public static MySQLiteOpenHelper getInstance(Context context) {
        if (instance == null) {
            synchronized (MySQLiteOpenHelper.class) {
                if (instance == null) {
                    instance = new MySQLiteOpenHelper(context, null);
                }
            }
        }
        return instance;
    }

    @Override // com.heytap.store.db.entity.dao.DaoMaster.OpenHelper, com.oplus.aiunit.vision.b05
    public void onCreate(wz4 wz4Var) {
        super.onCreate(wz4Var);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        DaoMaster.dropAllTables(wrap(sQLiteDatabase), true);
        DaoMaster.createAllTables(wrap(sQLiteDatabase), false);
    }

    @Override // com.oplus.aiunit.vision.b05
    public void onUpgrade(wz4 wz4Var, int i, int i2) {
        if (this.onExecuteMigrationListener == null) {
            this.onExecuteMigrationListener = new DBMigration();
        }
        OnExecuteMigrationListener onExecuteMigrationListener = this.onExecuteMigrationListener;
        if (onExecuteMigrationListener != null) {
            onExecuteMigrationListener.executeMigrations(wz4Var, i, i2);
        }
    }
}
