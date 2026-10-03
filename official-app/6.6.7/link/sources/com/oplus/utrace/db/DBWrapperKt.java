package com.oplus.utrace.db;

import android.database.sqlite.SQLiteDatabase;
import com.oplus.utrace.utils.Logs;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"TAG", "", "name", "Landroid/database/sqlite/SQLiteDatabase;", "getName", "(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;", "withTransaction", "", "block", "Lkotlin/Function1;", "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDBWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBWrapper.kt\ncom/oplus/utrace/db/DBWrapperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
public final class DBWrapperKt {

    @NotNull
    private static final String TAG = "UTrace.Lib.DBWrapper";

    @NotNull
    public static final String getName(@NotNull SQLiteDatabase sQLiteDatabase) {
        Object obj;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(new File(sQLiteDatabase.getPath()).getName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isFailure-impl(obj)) {
            obj = "";
        }
        return (String) obj;
    }

    public static final void withTransaction(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull Function1<? super SQLiteDatabase, Unit> function1) {
        Object obj;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(function1, "block");
        sQLiteDatabase.beginTransaction();
        try {
            Result.Companion companion = Result.Companion;
            function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, "withTransaction() exception=" + th2, th2);
        }
        sQLiteDatabase.endTransaction();
    }
}
