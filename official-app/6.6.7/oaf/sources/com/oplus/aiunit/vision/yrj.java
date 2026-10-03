package com.oplus.aiunit.vision;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "a", "TapDatabase"}, k = 2, mv = {1, 4, 0})
public final class yrj {
    public static final void a(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkParameterIsNotNull(supportSQLiteDatabase, "$this$endTransactionSafety");
        try {
            if (supportSQLiteDatabase.inTransaction()) {
                supportSQLiteDatabase.endTransaction();
            }
        } catch (Throwable unused) {
        }
    }
}
