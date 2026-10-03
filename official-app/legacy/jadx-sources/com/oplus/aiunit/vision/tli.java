package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class tli implements wz4 {
    public final SQLiteDatabase a;

    public tli(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // com.oplus.aiunit.vision.wz4
    public Object a() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.wz4
    public Cursor b(String str, String[] strArr) {
        return this.a.rawQuery(str, strArr);
    }

    @Override // com.oplus.aiunit.vision.wz4
    public void beginTransaction() {
        this.a.beginTransaction();
    }

    public SQLiteDatabase c() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.wz4
    public d05 compileStatement(String str) {
        return new uli(this.a.compileStatement(str));
    }

    @Override // com.oplus.aiunit.vision.wz4
    public void endTransaction() {
        this.a.endTransaction();
    }

    @Override // com.oplus.aiunit.vision.wz4
    public void execSQL(String str) throws SQLException {
        this.a.execSQL(str);
    }

    @Override // com.oplus.aiunit.vision.wz4
    public boolean isDbLockedByCurrentThread() {
        return this.a.isDbLockedByCurrentThread();
    }

    @Override // com.oplus.aiunit.vision.wz4
    public void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
    }

    @Override // com.oplus.aiunit.vision.wz4
    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.a.execSQL(str, objArr);
    }
}
