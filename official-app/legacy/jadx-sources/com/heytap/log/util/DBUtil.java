package com.heytap.log.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes19.dex */
public class DBUtil {
    private static int BUFFER_SIZE = 40000;
    public static String DB_NAME = "usetrace.db";
    public static String DB_PATH;
    private static Context mContext;
    private static SQLiteDatabase mDatabase;

    public static void closeDatabase() {
        SQLiteDatabase sQLiteDatabase = mDatabase;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        mDatabase.close();
        mDatabase = null;
    }

    public static SQLiteDatabase getInstance(String str) {
        DB_PATH = str;
        if (mDatabase == null) {
            synchronized (DBUtil.class) {
                mDatabase = openDatabase();
            }
        }
        return mDatabase;
    }

    private static SQLiteDatabase openDatabase() {
        return SQLiteDatabase.openDatabase(DB_PATH + "/usetrace.db", null, 1);
    }

    public static void setDatabase(SQLiteDatabase sQLiteDatabase) {
        mDatabase = sQLiteDatabase;
    }

    public SQLiteDatabase getDatabase() {
        return mDatabase;
    }
}
