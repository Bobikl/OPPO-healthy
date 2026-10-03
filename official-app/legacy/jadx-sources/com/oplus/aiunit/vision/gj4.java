package com.oplus.aiunit.vision;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.io.FilesKt__UtilsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/gj4;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "a", MapSchema.FIELD_NAME_ENTRY, "", "c", "d", "b", "<init>", "()V", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class gj4 {

    @NotNull
    public static final String BAK_NAME = "bak_database.db";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_NAME = "database.db";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.gj4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/gj4$a;", "", "", "flag", "", "b", "a", "c", "", "BAK_NAME", "Ljava/lang/String;", "SOURCE_NAME", "SP_KEY_BACKUP_DATA_FLAG", "SP_KEY_BACKUP_SUCCESS", "SP_KEY_BACKUP_TIME", "SP_KEY_RECOVERY_FLAG", "SP_MANE_DB_SAFE", "TAG", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a() {
            return v9g.x("SP_MANE_DB_SAFE").r("SP_KEY_RECOVERY_FLAG", false);
        }

        @JvmStatic
        public final void b(boolean flag) {
            v9g.x("SP_MANE_DB_SAFE").W("SP_KEY_BACKUP_DATA_FLAG", flag);
        }

        @JvmStatic
        public final void c(boolean flag) {
            v9g.x("SP_MANE_DB_SAFE").W("SP_KEY_RECOVERY_FLAG", flag);
        }
    }

    public final void a(@NotNull SupportSQLiteDatabase db) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(db, "db");
        if (b()) {
            return;
        }
        a7b.f("DBSafe", "database backup start");
        Cursor cursorQuery = null;
        try {
            try {
                File databasePath = b78.a().getDatabasePath(SOURCE_NAME);
                if (databasePath != null && databasePath.exists()) {
                    cursorQuery = db.query("PRAGMA wal_checkpoint(FULL);");
                    int i3 = 0;
                    if (cursorQuery.moveToFirst()) {
                        i3 = cursorQuery.getInt(0);
                        i = cursorQuery.getInt(1);
                        i2 = cursorQuery.getInt(2);
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    a7b.f("DBSafe", "busy：" + i3 + ", log:" + i + ", checkPointed:" + i2);
                    if (i3 == 0 && i == i2) {
                        int length = (int) databasePath.length();
                        String parent = databasePath.getParent();
                        if (parent != null) {
                            String str = parent + "/bak_database.db";
                            FilesKt__UtilsKt.copyTo(databasePath, new File(str), true, length);
                            a7b.f("DBSafe", "database backup copy success, target path is " + str);
                        }
                        v9g.x("SP_MANE_DB_SAFE").S("SP_KEY_BACKUP_SUCCESS", 1);
                        d();
                        if (cursorQuery.isClosed()) {
                            return;
                        }
                        cursorQuery.close();
                        return;
                    }
                    a7b.f("DBSafe", "backup checkpoint fail");
                    if (cursorQuery.isClosed()) {
                        return;
                    }
                    cursorQuery.close();
                    return;
                }
                a7b.b("DBSafe", "sourceDbFile is null or not exist");
            } catch (Exception e2) {
                a7b.b("DBSafe", "database backup failed, exception is " + e2.getMessage());
                if (0 == 0 || cursorQuery.isClosed()) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean b() {
        if (!v9g.x("SP_MANE_DB_SAFE").r("SP_KEY_BACKUP_DATA_FLAG", false)) {
            a7b.f("DBSafe", "no new data insert database");
            return true;
        }
        if (System.currentTimeMillis() - v9g.x("SP_MANE_DB_SAFE").A("SP_KEY_BACKUP_TIME") >= 86400000) {
            return false;
        }
        a7b.f("DBSafe", "backup time interval should over one day");
        return true;
    }

    public final boolean c() {
        a7b.f("DBSafe", "database recovery start");
        try {
            File databasePath = b78.a().getDatabasePath(BAK_NAME);
            if (databasePath != null && databasePath.exists()) {
                int length = (int) databasePath.length();
                String parent = databasePath.getParent();
                if (parent != null) {
                    String str = parent + "/database.db";
                    FilesKt__UtilsKt.copyTo(databasePath, new File(str), true, length);
                    if (v9g.x("SP_MANE_DB_SAFE").z("SP_KEY_BACKUP_SUCCESS", 0) < 1) {
                        databasePath.delete();
                    }
                    new File(parent + "/database.db-wal").delete();
                    new File(parent + "/database.db-shm").delete();
                    a7b.f("DBSafe", "database recovery copy success, target path is " + str);
                }
                return true;
            }
            a7b.b("DBSafe", "bakPath is null or not exist");
            return false;
        } catch (Exception e2) {
            a7b.b("DBSafe", "database recovery failed, exception is " + e2);
        }
    }

    public final void d() {
        a7b.f("DBSafe", "refresh flag");
        INSTANCE.b(false);
        v9g.x("SP_MANE_DB_SAFE").T("SP_KEY_BACKUP_TIME", System.currentTimeMillis());
    }

    public final void e() {
        a7b.f("DBSafe", "remove backup data file");
        File databasePath = b78.a().getDatabasePath(BAK_NAME);
        if (databasePath == null || !databasePath.exists()) {
            a7b.f("DBSafe", "backDbFile is null or not exist");
            return;
        }
        try {
            databasePath.delete();
        } catch (Exception e2) {
            a7b.b("DBSafe", e2.toString());
        }
    }
}
