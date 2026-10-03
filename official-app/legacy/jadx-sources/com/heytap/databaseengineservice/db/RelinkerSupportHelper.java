package com.heytap.databaseengineservice.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.oplus.aiunit.vision.zaf;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes15.dex */
public class RelinkerSupportHelper implements SupportSQLiteOpenHelper {
    public SQLiteOpenHelper i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f2833j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f2834l = new Object();
    public volatile boolean m;

    public class a extends SQLiteOpenHelper {
        public final /* synthetic */ SupportSQLiteOpenHelper.Configuration i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, SupportSQLiteOpenHelper.Configuration configuration) {
            super(context, str, str2, cursorFactory, i, i2, databaseErrorHandler, sQLiteDatabaseHook, z);
            this.i = configuration;
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.i.callback.onConfigure(sQLiteDatabase);
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.i.callback.onCreate(sQLiteDatabase);
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.i.callback.onDowngrade(sQLiteDatabase, i, i2);
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            this.i.callback.onOpen(sQLiteDatabase);
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.i.callback.onUpgrade(sQLiteDatabase, i, i2);
        }
    }

    public RelinkerSupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        try {
            System.loadLibrary("sqlcipher");
        } catch (UnsatisfiedLinkError unused) {
            zaf.a(configuration.context, "sqlcipher");
        }
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f2833j = bArrCopyOf;
        this.k = z;
        this.i = new a(configuration.context, configuration.name, bArrCopyOf != null ? new String(bArrCopyOf, StandardCharsets.UTF_8) : "", null, configuration.callback.version, 0, null, sQLiteDatabaseHook, true, configuration);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.i.getName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        try {
            SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
            if (this.k && this.f2833j != null) {
                synchronized (this.f2834l) {
                    if (!this.m) {
                        Arrays.fill(this.f2833j, (byte) 0);
                        this.m = true;
                    }
                }
            }
            return writableDatabase;
        } catch (SQLiteException e2) {
            synchronized (this.f2834l) {
                if (this.f2833j == null || !this.m) {
                    throw e2;
                }
                throw new IllegalStateException("The passphrase appears to be cleared. This happens by default the first time you use the factory to open a database, so we can remove the cleartext passphrase from memory. If you close the database yourself, please use a fresh SupportOpenHelperFactory to reopen it. If something else (e.g., Room) closed the database, and you cannot control that, use SupportOpenHelperFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information.", e2);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.i.setWriteAheadLoggingEnabled(z);
    }
}
