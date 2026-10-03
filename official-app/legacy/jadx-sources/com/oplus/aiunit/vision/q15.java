package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class q15 {
    public static volatile x56 a;
    public static final Object b = new Object();

    public static x56 a(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    Context contextH = w56.h();
                    if (contextH == null && context != null) {
                        contextH = context.getApplicationContext();
                    }
                    if (contextH == null) {
                        throw new IllegalStateException("DbConnectionProvider: storageContext is null and context is null");
                    }
                    a = new x56(contextH);
                    z6b.q("DbConnectionProvider", "DbConnectionProvider initialized");
                }
            }
        }
        return a;
    }

    public static SQLiteDatabase b(Context context) {
        return a(context).getReadableDatabase();
    }

    public static boolean c(int i) {
        String str;
        if (a == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                if (i > 0) {
                    str = "PRAGMA incremental_vacuum(" + i + ")";
                } else {
                    str = "PRAGMA incremental_vacuum";
                }
                Cursor cursorRawQuery = writableDatabase.rawQuery(str, null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                z6b.k("DbConnectionProvider", "Incremental vacuum executed: pages=" + i);
                return true;
            }
            return false;
        } catch (Exception e2) {
            z6b.p("DbConnectionProvider", "Failed to perform incremental vacuum", e2);
            return false;
        }
    }

    public static int d() {
        return e("PASSIVE");
    }

    public static int e(String str) {
        if (a == null) {
            return -1;
        }
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                Cursor cursorRawQuery = writableDatabase.rawQuery("PRAGMA wal_checkpoint(" + str + ")", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            return cursorRawQuery.getInt(2);
                        }
                    } finally {
                        cursorRawQuery.close();
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception e2) {
            z6b.p("DbConnectionProvider", "Failed to perform WAL checkpoint(" + str + ")", e2);
        }
    }

    public static void f() {
        if (a == null) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            if (writableDatabase != null && writableDatabase.isOpen()) {
                Cursor cursorRawQuery = writableDatabase.rawQuery("PRAGMA wal_checkpoint(PASSIVE)", null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                Cursor cursorRawQuery2 = writableDatabase.rawQuery("PRAGMA shrink_memory", null);
                if (cursorRawQuery2 != null) {
                    cursorRawQuery2.close();
                }
                z6b.q("DbConnectionProvider", "Memory released due to system pressure");
            }
        } catch (Exception e2) {
            z6b.p("DbConnectionProvider", "Failed to release memory", e2);
        }
    }
}
