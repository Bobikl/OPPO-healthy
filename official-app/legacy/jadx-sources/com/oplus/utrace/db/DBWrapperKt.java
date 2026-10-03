package com.oplus.utrace.db;

import android.database.sqlite.SQLiteDatabase;
import com.oplus.utrace.utils.Logs;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"TAG", "", "name", "Landroid/database/sqlite/SQLiteDatabase;", "getName", "(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;", "withTransaction", "", "block", "Lkotlin/Function1;", "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDBWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBWrapper.kt\ncom/oplus/utrace/db/DBWrapperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
public final class DBWrapperKt {

    @NotNull
    private static final String TAG = "UTrace.Lib.DBWrapper";

    @NotNull
    public static final String getName(@NotNull SQLiteDatabase sQLiteDatabase) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(new File(sQLiteDatabase.getPath()).getName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = "";
        }
        return (String) objM5287constructorimpl;
    }

    public static final void withTransaction(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull Function1<? super SQLiteDatabase, Unit> block) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        sQLiteDatabase.beginTransaction();
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.w(TAG, "withTransaction() exception=" + thM5290exceptionOrNullimpl, thM5290exceptionOrNullimpl);
        }
        sQLiteDatabase.endTransaction();
    }
}
