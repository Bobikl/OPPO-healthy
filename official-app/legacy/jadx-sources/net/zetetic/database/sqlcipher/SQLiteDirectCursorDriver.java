package net.zetetic.database.sqlcipher;

import android.database.Cursor;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes11.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private final CancellationSignal mCancellationSignal;
    private final SQLiteDatabase mDatabase;
    private final String mEditTable;
    private SQLiteQuery mQuery;
    private final String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = cancellationSignal;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorClosed() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void cursorRequeried(Cursor cursor) {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr) {
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.mDatabase, this.mSql, this.mCancellationSignal);
        try {
            sQLiteQuery.bindAllArgsAsStrings(strArr);
            Cursor sQLiteCursor = cursorFactory == null ? new SQLiteCursor(this, this.mEditTable, sQLiteQuery) : cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            this.mQuery = sQLiteQuery;
            return sQLiteCursor;
        } catch (RuntimeException e2) {
            sQLiteQuery.close();
            throw e2;
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void setBindArguments(String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }

    public Cursor query(SQLiteDatabase.CursorFactory cursorFactory, Object... objArr) {
        Cursor cursorNewCursor;
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.mDatabase, this.mSql, this.mCancellationSignal);
        try {
            sQLiteQuery.bindAllArgs(objArr);
            if (cursorFactory == null) {
                cursorNewCursor = new SQLiteCursor(this, this.mEditTable, sQLiteQuery);
            } else {
                cursorNewCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            }
            this.mQuery = sQLiteQuery;
            return cursorNewCursor;
        } catch (RuntimeException e2) {
            sQLiteQuery.close();
            throw e2;
        }
    }
}
