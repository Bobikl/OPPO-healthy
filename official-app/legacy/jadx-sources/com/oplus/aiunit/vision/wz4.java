package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.SQLException;

/* JADX INFO: loaded from: classes11.dex */
public interface wz4 {
    Object a();

    Cursor b(String str, String[] strArr);

    void beginTransaction();

    d05 compileStatement(String str);

    void endTransaction();

    void execSQL(String str) throws SQLException;

    void execSQL(String str, Object[] objArr) throws SQLException;

    boolean isDbLockedByCurrentThread();

    void setTransactionSuccessful();
}
