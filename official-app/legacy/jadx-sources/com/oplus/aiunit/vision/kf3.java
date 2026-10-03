package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes19.dex */
public class kf3 {
    public static final AtomicReference<SQLiteDatabase> a = new AtomicReference<>();
    public static final AtomicReference<SQLiteOpenHelper> b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<mf3> f13252c = new AtomicReference<>();

    public static class a extends SQLiteOpenHelper {
        public a(@NonNull Context context, @NonNull String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            TrackLogger.h("DRS_SDK_COMMON_ClientDataBase", "Creating table: %s", "client_data");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS client_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT NOT NULL,event_time INTEGER,app_id TEXT,status INTEGER,retry_count INTEGER,create_time INTEGER,update_time INTEGER,data_size INTEGER,priority INTEGER,is_exception_event INTEGER,exception_type TEXT,exception_code TEXT);");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_client_data_status ON client_data (status);");
            TrackLogger.h("DRS_SDK_COMMON_ClientDataBase", "Table %s created", "client_data");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            TrackLogger.c("DRS_SDK_COMMON_ClientDataBase", "Database downgrade: %s -> %s", Integer.valueOf(i), Integer.valueOf(i2));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            TrackLogger.c("DRS_SDK_COMMON_ClientDataBase", "Database upgrade: %s -> %s", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static mf3 a(@NonNull Context context, String str) {
        AtomicReference<mf3> atomicReference = f13252c;
        mf3 mf3Var = atomicReference.get();
        if (mf3Var == null) {
            synchronized (kf3.class) {
                mf3Var = atomicReference.get();
                if (mf3Var == null) {
                    SQLiteDatabase sQLiteDatabaseB = b(context, str);
                    if (sQLiteDatabaseB == null || !sQLiteDatabaseB.isOpen()) {
                        TrackLogger.e("DRS_SDK_COMMON_ClientDataBase", "Failed to create ClientDataDao, database is null or closed", new Object[0]);
                    } else {
                        mf3 mf3Var2 = new mf3(sQLiteDatabaseB);
                        atomicReference.set(mf3Var2);
                        mf3Var = mf3Var2;
                    }
                }
            }
        }
        return mf3Var;
    }

    public static SQLiteDatabase b(@NonNull Context context, String str) {
        SQLiteDatabase writableDatabase;
        AtomicReference<SQLiteDatabase> atomicReference = a;
        SQLiteDatabase sQLiteDatabase = atomicReference.get();
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return sQLiteDatabase;
        }
        synchronized (kf3.class) {
            SQLiteDatabase sQLiteDatabase2 = atomicReference.get();
            if (sQLiteDatabase2 == null || !sQLiteDatabase2.isOpen()) {
                Context applicationContext = context.getApplicationContext();
                String str2 = fxe.b(applicationContext) + "_drs_obus_sqlite";
                a aVar = new a(applicationContext, str2);
                writableDatabase = aVar.getWritableDatabase();
                b.set(aVar);
                atomicReference.set(writableDatabase);
                TrackLogger.h("DRS_SDK_COMMON_ClientDataBase", "obus-sdk SQLite database created/opened successfully, name=%s", str2);
            } else {
                writableDatabase = sQLiteDatabase2;
            }
        }
        return writableDatabase;
    }
}
