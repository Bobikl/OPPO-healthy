package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b05 extends SQLiteOpenHelper {
    private final Context context;
    private a encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    public class a extends net.sqlcipher.database.SQLiteOpenHelper {
        public a(Context context, String str, int i, boolean z) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            if (z) {
                SQLiteDatabase.loadLibs(context);
            }
        }

        public wz4 a(SQLiteDatabase sQLiteDatabase) {
            return new hn6(sQLiteDatabase);
        }
    }

    public b05(Context context, String str, int i) {
        this(context, str, null, i);
    }

    private a checkEncryptedHelper() {
        if (this.encryptedHelper == null) {
            this.encryptedHelper = new a(this.context, this.name, this.version, this.loadSQLCipherNativeLibs);
        }
        return this.encryptedHelper;
    }

    public wz4 getEncryptedReadableDb(String str) {
        a aVarCheckEncryptedHelper = checkEncryptedHelper();
        return aVarCheckEncryptedHelper.a(aVarCheckEncryptedHelper.getReadableDatabase(str));
    }

    public wz4 getEncryptedWritableDb(String str) {
        a aVarCheckEncryptedHelper = checkEncryptedHelper();
        return aVarCheckEncryptedHelper.a(aVarCheckEncryptedHelper.getWritableDatabase(str));
    }

    public wz4 getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public wz4 getWritableDb() {
        return wrap(getWritableDatabase());
    }

    public void onCreate(wz4 wz4Var) {
    }

    public void onOpen(wz4 wz4Var) {
    }

    public void onUpgrade(wz4 wz4Var, int i, int i2) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z) {
        this.loadSQLCipherNativeLibs = z;
    }

    public wz4 wrap(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return new tli(sQLiteDatabase);
    }

    public b05(Context context, String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(wrap(sQLiteDatabase), i, i2);
    }

    public wz4 getEncryptedReadableDb(char[] cArr) {
        a aVarCheckEncryptedHelper = checkEncryptedHelper();
        return aVarCheckEncryptedHelper.a(aVarCheckEncryptedHelper.getReadableDatabase(cArr));
    }

    public wz4 getEncryptedWritableDb(char[] cArr) {
        a aVarCheckEncryptedHelper = checkEncryptedHelper();
        return aVarCheckEncryptedHelper.a(aVarCheckEncryptedHelper.getWritableDatabase(cArr));
    }
}
