package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes17.dex */
@TargetApi(30)
public class u3d {
    public static final int STATE_NONE = -1;
    public static final int STATE_NO_START = 0;
    public static final int STATE_START = 1;
    public static final Uri a = Uri.parse("content://com.oplus.appmanager.provider.db/settings_table");
    public static final Uri b = Uri.parse("content://com.coloros.appmanager.provider.db/settings_table");

    public static boolean a(int i) {
        return i == 1 || i == 0;
    }

    @SuppressLint({"Range"})
    public static int b(Context context, String str) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(b, null, "packageName = ?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("startState"));
                        cursorQuery.close();
                        return i;
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            a7b.b("AppManagerProviderUtils", "getOldStartState: cursor is null or empty");
            if (cursorQuery == null) {
                return -1;
            }
            cursorQuery.close();
            return -1;
        } catch (Exception e2) {
            a7b.b("AppManagerProviderUtils", "getOldStartState exception: " + e2);
            return -1;
        }
    }

    @SuppressLint({"Range"})
    public static int c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(a, null, "packageName = ?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("startState"));
                        cursorQuery.close();
                        return i;
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                a7b.b("AppManagerProviderUtils", "getStartState: cursor is empty ");
                cursorQuery.close();
                return -1;
            }
            int iB = b(context, str);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return iB;
        } catch (Exception unused) {
            return b(context, str);
        }
    }

    public static boolean d(Context context) {
        return c(context, context.getPackageName()) != -1;
    }

    public static void e(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str) || !a(i)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("packageName", str);
        contentValues.put("startState", Integer.valueOf(i));
        try {
            try {
                context.getContentResolver().insert(a, contentValues);
            } catch (Exception unused) {
                context.getContentResolver().insert(b, contentValues);
            }
        } catch (Exception unused2) {
            a7b.b("AppManagerProviderUtils", "put: error !! can not insert !!");
        }
        a7b.f("AppManagerProviderUtils", "put: packageName = " + str + ", startState = " + i);
    }
}
