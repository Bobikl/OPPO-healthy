package com.oplus.aiunit.vision;

import androidx.sqlite.db.SupportSQLiteDatabase;
import com.heytap.baselib.database.utils.SQLiteDowngradeException;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/t16;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "oldVersion", "newVersion", "", "a", "<init>", "()V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public class t16 {
    public void a(@Nullable SupportSQLiteDatabase db, int oldVersion, int newVersion) {
        throw new SQLiteDowngradeException("Can't downgrade database from version " + oldVersion + " to " + newVersion);
    }
}
