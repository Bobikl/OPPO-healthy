package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.drs.base.concurrent.DeviceTier;
import com.oplus.drs.core.config.entity.DebugModeEntity;

/* JADX INFO: loaded from: classes6.dex */
public class x56 extends SQLiteOpenHelper {
    public x56(Context context) {
        super(h(context), zz4.DB_NAME, (SQLiteDatabase.CursorFactory) null, 3);
    }

    public static Context h(Context context) {
        Context contextH = w56.h();
        return contextH != null ? contextH : context;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery;
        Throwable th;
        if (sQLiteDatabase == null) {
            return;
        }
        Cursor cursorRawQuery2 = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(data_reconciliation)", null);
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (cursorRawQuery != null) {
                    try {
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                        }
                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("name"));
                        if ("source_process".equals(string)) {
                            z2 = true;
                        } else if ("upload_request_count".equals(string)) {
                            z3 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (!z2) {
                    sQLiteDatabase.execSQL("ALTER TABLE data_reconciliation ADD COLUMN source_process INTEGER DEFAULT 0");
                }
                if (!z3) {
                    sQLiteDatabase.execSQL("ALTER TABLE data_reconciliation ADD COLUMN upload_request_count INTEGER DEFAULT 0");
                }
                try {
                    cursorRawQuery2 = sQLiteDatabase.rawQuery("PRAGMA table_info(host_config)", null);
                    while (cursorRawQuery2 != null && cursorRawQuery2.moveToNext()) {
                        if (DebugModeEntity.KEY_AREA.equals(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndexOrThrow("name")))) {
                            z = true;
                            break;
                        }
                    }
                    if (cursorRawQuery2 != null) {
                        cursorRawQuery2.close();
                    }
                    if (!z) {
                        sQLiteDatabase.execSQL("ALTER TABLE host_config ADD COLUMN area TEXT");
                    }
                    sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_recon_source ON data_reconciliation(source_process)");
                } catch (Throwable th3) {
                    if (cursorRawQuery2 != null) {
                        cursorRawQuery2.close();
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                cursorRawQuery = null;
                th = th4;
            }
        } catch (Throwable unused) {
        }
    }

    public final void g(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA " + str + HttpUtils.EQUAL_SIGN + str2, null);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Exception e2) {
            z6b.v("DrsSQLiteOpenHelper", "Failed to set PRAGMA " + str + HttpUtils.EQUAL_SIGN + str2, e2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.enableWriteAheadLogging();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(false);
        g(sQLiteDatabase, "synchronous", "NORMAL");
        g(sQLiteDatabase, "temp_store", "MEMORY");
        g(sQLiteDatabase, "busy_timeout", String.valueOf(5000));
        DeviceTier deviceTierG = u56.g();
        int iC = zz4.c(deviceTierG);
        g(sQLiteDatabase, "cache_size", String.valueOf(iC));
        long jE = zz4.e(deviceTierG);
        g(sQLiteDatabase, "mmap_size", String.valueOf(jE));
        long jD = zz4.d(deviceTierG);
        g(sQLiteDatabase, "journal_size_limit", String.valueOf(jD));
        int iF = zz4.f(deviceTierG);
        g(sQLiteDatabase, "wal_autocheckpoint", String.valueOf(iF));
        g(sQLiteDatabase, "auto_vacuum", "INCREMENTAL");
        z6b.q("DrsSQLiteOpenHelper", "PRAGMA configured: tier=" + deviceTierG + ", cache_size=" + iC + ", mmap_size=" + jE + ", wal_autocheckpoint=" + iF + ", journal_size_limit=" + jD);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        z6b.q("DrsSQLiteOpenHelper", "onCreate: creating tables and indexes");
        for (String str : zz4.b()) {
            sQLiteDatabase.execSQL(str);
        }
        for (String str2 : zz4.a()) {
            sQLiteDatabase.execSQL(str2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        z6b.q("DrsSQLiteOpenHelper", "onUpgrade: " + i + " -> " + i2);
        a(sQLiteDatabase);
        for (String str : zz4.a()) {
            sQLiteDatabase.execSQL(str);
        }
    }
}
