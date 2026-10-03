package com.coloros.sceneservice.m;

import android.database.Cursor;

/* JADX INFO: loaded from: classes13.dex */
public class c {
    public static final String TAG = "CursorUtils";

    public static Double a(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndex(str) < 0 ? Double.valueOf(0.0d) : Double.valueOf(cursor.getDouble(cursor.getColumnIndex(str)));
        } catch (Exception e2) {
            f.e(TAG, "getDouble e = " + e2);
            return Double.valueOf(0.0d);
        }
    }

    public static Float b(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndex(str) < 0 ? Float.valueOf(0.0f) : Float.valueOf(cursor.getFloat(cursor.getColumnIndex(str)));
        } catch (Exception e2) {
            f.e(TAG, "getFloat e = " + e2);
            return Float.valueOf(0.0f);
        }
    }

    public static int c(Cursor cursor, String str) {
        try {
            if (cursor.getColumnIndex(str) < 0) {
                return 0;
            }
            return cursor.getInt(cursor.getColumnIndex(str));
        } catch (Exception e2) {
            f.e(TAG, "getInt e = " + e2);
            return 0;
        }
    }

    public static Long d(Cursor cursor, String str) {
        try {
            if (cursor.getColumnIndex(str) < 0) {
                return 0L;
            }
            return Long.valueOf(cursor.getLong(cursor.getColumnIndex(str)));
        } catch (Exception e2) {
            f.e(TAG, "getLong e = " + e2);
            return 0L;
        }
    }

    public static String e(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex < 0) {
                return null;
            }
            return cursor.getString(columnIndex);
        } catch (Exception e2) {
            f.e(TAG, "getString e = " + e2);
            return null;
        }
    }
}
