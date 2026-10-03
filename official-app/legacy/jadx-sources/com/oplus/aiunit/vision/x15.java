package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import java.io.File;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;

/* JADX INFO: loaded from: classes15.dex */
public class x15 {
    public static final String TAG = "DbMigrateUtil";

    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public static void a(Context context, String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2;
        boolean zDelete;
        StringBuilder sb;
        File databasePath = context.getDatabasePath(str);
        boolean zExists = databasePath.exists();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("exists:");
        sb2.append(zExists);
        sb2.append("   path:");
        sb2.append(databasePath.getAbsolutePath());
        if (zExists) {
            File databasePath2 = context.getDatabasePath(str2);
            SQLiteDatabase sQLiteDatabase3 = null;
            Cursor cursor2 = null;
            cursorRawQuery = null;
            Cursor cursorRawQuery = null;
            SQLiteDatabase sQLiteDatabase4 = null;
            try {
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(databasePath.getAbsolutePath(), "", (SQLiteDatabase.CursorFactory) null, (DatabaseErrorHandler) null, (SQLiteDatabaseHook) null);
                try {
                    boolean z = true;
                    sQLiteDatabaseOpenOrCreateDatabase.rawExecSQL(String.format("ATTACH DATABASE '%s' AS encrypted KEY '%s'", databasePath2.getAbsolutePath(), str3), new Object[0]);
                    sQLiteDatabaseOpenOrCreateDatabase.rawExecSQL("select sqlcipher_export('encrypted')", new Object[0]);
                    sQLiteDatabaseOpenOrCreateDatabase.rawExecSQL("DETACH DATABASE encrypted", new Object[0]);
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                    SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase2 = SQLiteDatabase.openOrCreateDatabase(databasePath2.getAbsolutePath(), str3, (SQLiteDatabase.CursorFactory) null, (DatabaseErrorHandler) null, (SQLiteDatabaseHook) null);
                    try {
                        cursorRawQuery = sQLiteDatabaseOpenOrCreateDatabase2.rawQuery("select * from contact_lite limit 0", (String[]) null);
                        if (cursorRawQuery != null) {
                            if (cursorRawQuery.getColumnIndex("contact_last_md5") != -1) {
                                z = false;
                            }
                            if (z) {
                                sQLiteDatabaseOpenOrCreateDatabase2.rawExecSQL("ALTER TABLE contact_lite ADD COLUMN contact_last_md5 TEXT", new Object[0]);
                            }
                        }
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        sQLiteDatabaseOpenOrCreateDatabase2.close();
                        zDelete = databasePath.delete();
                        sb = new StringBuilder();
                    } catch (Exception unused) {
                        sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase2;
                        cursor = cursorRawQuery;
                        sQLiteDatabase4 = sQLiteDatabaseOpenOrCreateDatabase;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.close();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        zDelete = databasePath.delete();
                        sb = new StringBuilder();
                    } catch (Throwable th2) {
                        sQLiteDatabase2 = sQLiteDatabaseOpenOrCreateDatabase2;
                        cursor2 = cursorRawQuery;
                        sQLiteDatabase3 = sQLiteDatabaseOpenOrCreateDatabase;
                        th = th2;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.close();
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                        }
                        boolean zDelete2 = databasePath.delete();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("delete:");
                        sb3.append(zDelete2);
                        throw th;
                    }
                } catch (Exception unused2) {
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase3 = sQLiteDatabaseOpenOrCreateDatabase;
                    th = th;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                    boolean zDelete3 = databasePath.delete();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("delete:");
                    sb4.append(zDelete3);
                    throw th;
                }
            } catch (Exception unused3) {
                cursor = null;
                sQLiteDatabase = null;
            } catch (Throwable th4) {
                th = th4;
            }
            sb.append("delete:");
            sb.append(zDelete);
        }
    }
}
