package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public final class o77 implements Cursor {
    public final CursorWindow i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14817j;
    public final int k;

    public o77(CursorWindow cursorWindow) {
        this.i = cursorWindow;
        this.k = cursorWindow.getNumRows();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        return this.i.getBlob(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public String getColumnName(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getCount() {
        return this.i.getNumRows();
    }

    @Override // android.database.Cursor
    public double getDouble(int i) {
        return this.i.getDouble(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public float getFloat(int i) {
        return this.i.getFloat(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public int getInt(int i) {
        return this.i.getInt(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public long getLong(int i) {
        return this.i.getLong(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f14817j;
    }

    @Override // android.database.Cursor
    public short getShort(int i) {
        return this.i.getShort(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public String getString(int i) {
        return this.i.getString(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public int getType(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.f14817j == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.f14817j == this.k - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i) {
        return this.i.isNull(this.f14817j, i);
    }

    @Override // android.database.Cursor
    public boolean move(int i) {
        return moveToPosition(this.f14817j + i);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        this.f14817j = 0;
        return this.k > 0;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        int i = this.k;
        if (i <= 0) {
            return false;
        }
        this.f14817j = i - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        int i = this.f14817j;
        if (i >= this.k - 1) {
            return false;
        }
        this.f14817j = i + 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i < 0 || i >= this.k) {
            return false;
        }
        this.f14817j = i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i = this.f14817j;
        if (i <= 0) {
            return false;
        }
        this.f14817j = i - 1;
        return true;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }
}
