package com.oplus.aiunit.vision;

import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "a", "TapDatabase"}, k = 2, mv = {1, 4, 0})
public final class aoj {
    public static final void a(@NotNull SupportSQLiteDatabase endTransactionSafety) {
        Intrinsics.checkParameterIsNotNull(endTransactionSafety, "$this$endTransactionSafety");
        try {
            if (endTransactionSafety.inTransaction()) {
                endTransactionSafety.endTransaction();
            }
        } catch (Throwable unused) {
        }
    }
}
