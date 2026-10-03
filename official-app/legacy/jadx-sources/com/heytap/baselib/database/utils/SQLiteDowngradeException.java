package com.heytap.baselib.database.utils;

import android.database.sqlite.SQLiteException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/baselib/database/utils/SQLiteDowngradeException;", "Landroid/database/sqlite/SQLiteException;", "error", "", "(Ljava/lang/String;)V", "TapDatabase"}, k = 1, mv = {1, 1, 16})
public final class SQLiteDowngradeException extends SQLiteException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQLiteDowngradeException(@NotNull String error) {
        super(error);
        Intrinsics.checkParameterIsNotNull(error, "error");
    }
}
