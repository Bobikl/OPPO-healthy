package com.heytap.health.watchface.business.creation.db;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.nd4;
import com.oplus.aiunit.vision.ud4;
import com.oplus.aiunit.vision.vo6;
import com.oplus.aiunit.vision.y80;
import com.oplus.aiunit.vision.z0j;
import com.oplus.aiunit.vision.zaf;
import java.nio.charset.StandardCharsets;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;

/* JADX INFO: loaded from: classes19.dex */
@Database(entities = {ud4.class}, exportSchema = false, version = 3)
abstract class CreationDatabase extends RoomDatabase {
    public static final String ENCRYPTED_DATABASE_NAME = "creation_encrypted.db";
    public static final String OLD_DATABASE_NAME = "creation.db";
    public static final String TAG = "CreationDatabase";
    public static volatile CreationDatabase g;
    public static final AesGcmAndroidKeyStore f = AesGcmAndroidKeyStore.g();
    public static final Object h = new Object();
    public static final Migration i = new b(1, 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Migration f6858j = new c(2, 3);

    public class a implements SQLiteDatabaseHook {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;

        public a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void postKey(SQLiteConnection sQLiteConnection) {
            ltl.d(CreationDatabase.TAG, "[postKey] isHasKeyStore " + this.a);
            if (this.a) {
                CreationDatabase.i(sQLiteConnection, this.b);
            }
        }

        @Override // net.zetetic.database.sqlcipher.SQLiteDatabaseHook
        public void preKey(SQLiteConnection sQLiteConnection) {
            ltl.a(CreationDatabase.TAG, "[preKey] sqlite ... ");
        }
    }

    public class b extends Migration {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("alter table creationrecord add column isDelete INTEGER NOT NULL default 0");
        }
    }

    public class c extends Migration {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("alter table creationrecord add column packageName TEXT");
        }
    }

    public static void d() {
        if (g != null) {
            g = null;
        }
    }

    public static CreationDatabase f() {
        CreationDatabase creationDatabase;
        synchronized (h) {
            if (g == null) {
                Context contextA = b78.a();
                h(contextA);
                String strG = g(contextA);
                boolean z = strG != null;
                g = (CreationDatabase) Room.databaseBuilder(contextA.getApplicationContext(), CreationDatabase.class, ENCRYPTED_DATABASE_NAME).addMigrations(i).addMigrations(f6858j).fallbackToDestructiveMigration().openHelperFactory(new SupportOpenHelperFactory(z ? strG.getBytes(StandardCharsets.UTF_8) : "watch_face_database_db_key".getBytes(StandardCharsets.UTF_8), new a(z, strG), true)).build();
                if (z) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    j();
                    ltl.d(TAG, "[updateBlurMacData] ,cost time " + (System.currentTimeMillis() - jCurrentTimeMillis));
                }
            }
            creationDatabase = g;
        }
        return creationDatabase;
    }

    public static String g(Context context) {
        AesGcmAndroidKeyStore aesGcmAndroidKeyStore = f;
        boolean zI = aesGcmAndroidKeyStore.i("watch_face_database_db_key", null);
        if (!zI) {
            return null;
        }
        String strB = aesGcmAndroidKeyStore.b("watch_face_database_db_key", null);
        if (TextUtils.isEmpty(strB)) {
            strB = vo6.b(context, y80.DB_KEY);
        }
        if (strB.length() > 8) {
            ltl.d(TAG, "initDbKey dbKey is " + gdb.a(strB.substring(strB.length() - 8)) + " , hasKey is " + zI);
        }
        return strB.trim();
    }

    public static void h(Context context) {
        try {
            System.loadLibrary("sqlcipher");
        } catch (UnsatisfiedLinkError e2) {
            ltl.d(TAG, "System.loadLibrary failed, trying ReLinker: " + e2.getMessage());
            try {
                zaf.a(context, "sqlcipher");
            } catch (Throwable th) {
                ltl.d(TAG, "ReLinker loadLibrary failed: " + th.getMessage());
                gxe.o("CreationDatabase, loadLibrary error");
            }
        }
    }

    public static void i(SQLiteConnection sQLiteConnection, String str) {
        ltl.a(TAG, "[reKey] old key " + str);
        try {
            sQLiteConnection.execute("PRAGMA KEY = '" + str + "';", null, null);
            sQLiteConnection.execute("PRAGMA rekey = 'watch_face_database_db_key'", null, null);
            f.l("watch_face_database_db_key");
            ltl.d(TAG, "postKey reKey successful");
        } catch (Exception e2) {
            ltl.d(TAG, "postKey reKey e:" + e2.getMessage());
        }
    }

    public static void j() {
        ltl.a(TAG, "[updateBlurMacData] update old to encrypt mac.");
        nd4 nd4VarE = g.e();
        List<ud4> listJ = nd4VarE.j();
        if (listJ != null) {
            ltl.a(TAG, "[updateEncryptMac] update creationRecords " + listJ.size());
            for (ud4 ud4Var : listJ) {
                if (z0j.i(ud4Var.a)) {
                    nd4VarE.o(ud4Var);
                    ud4Var.a = z0j.a(ud4Var.a);
                    nd4VarE.n(ud4Var);
                }
            }
        }
    }

    public abstract nd4 e();
}
