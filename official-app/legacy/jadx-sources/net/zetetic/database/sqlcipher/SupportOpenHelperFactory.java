package net.zetetic.database.sqlcipher;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes11.dex */
public class SupportOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private static final int UNCHANGED = -1;
    private final boolean enableWriteAheadLogging;
    private final SQLiteDatabaseHook hook;
    private final int minimumSupportedVersion;
    private final byte[] password;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        int i = this.minimumSupportedVersion;
        return i == -1 ? new SupportHelper(configuration, this.password, this.hook, this.enableWriteAheadLogging) : new SupportHelper(configuration, this.password, this.hook, this.enableWriteAheadLogging, i);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(bArr, sQLiteDatabaseHook, z, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.password = bArr;
        this.hook = sQLiteDatabaseHook;
        this.enableWriteAheadLogging = z;
        this.minimumSupportedVersion = i;
    }
}
