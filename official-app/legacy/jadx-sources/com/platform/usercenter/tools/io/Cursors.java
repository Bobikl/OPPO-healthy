package com.platform.usercenter.tools.io;

import android.database.Cursor;
import com.platform.usercenter.tools.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class Cursors {

    public static final class CursorIterator implements Iterator<Cursor> {
        private final Cursor mCursor;
        private int mNextPosition = 0;
        private final int mSize;

        public CursorIterator(Cursor cursor) {
            this.mCursor = cursor;
            this.mSize = Cursors.size(cursor);
        }

        @Override // java.util.Iterator
        public synchronized boolean hasNext() {
            int i;
            int i2;
            i = this.mSize;
            return i > 0 && (i2 = this.mNextPosition) >= 0 && i2 < i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cursor may not be removed");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public synchronized Cursor next() {
            Preconditions.checkPositionIndex(this.mNextPosition, this.mSize);
            Cursor cursor = this.mCursor;
            int i = this.mNextPosition;
            this.mNextPosition = i + 1;
            cursor.moveToPosition(i);
            return this.mCursor;
        }
    }

    private Cursors() {
    }

    public static void close(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static float getFloat(Cursor cursor, String str) {
        return cursor.getFloat(cursor.getColumnIndex(str));
    }

    public static int getInt(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public static long getLong(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    public static String getString(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndex(str));
    }

    public static boolean isNullOrEmpty(Cursor cursor) {
        return cursor == null || cursor.getCount() < 1;
    }

    public static Iterable<Cursor> newCursorIterable(final Cursor cursor) {
        return new Iterable<Cursor>() { // from class: com.platform.usercenter.tools.io.Cursors.1
            @Override // java.lang.Iterable
            public Iterator<Cursor> iterator() {
                return new CursorIterator(cursor);
            }
        };
    }

    public static int size(Cursor cursor) {
        if (isNullOrEmpty(cursor)) {
            return 0;
        }
        return cursor.getCount();
    }
}
