package com.oplus.utrace.db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.oplus.utrace.lib.SpanType;
import com.oplus.utrace.lib.UTraceRecordV2;
import com.oplus.utrace.utils.Logs;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\"\u0010\u0015\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0003¨\u0006\u0018"}, d2 = {"Lcom/oplus/utrace/db/UTraceSQLiteHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "name", "", "factory", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "version", "", "(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V", "createTable", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "statement", "tableName", "onCreate", "onDowngrade", "oldVersion", "newVersion", "onUpgrade", "upgrade2", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UTraceSQLiteHelper extends SQLiteOpenHelper {
    private static final int CURRENT_VERSION = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/utrace/db/UTraceSQLiteHelper$Companion;", "", "()V", "CURRENT_VERSION", "", "updateType", "status", UTraceSQLiteHelperKt.COL_HAS_ERROR, "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int updateType(int status, int hasError) {
            if (status == UTraceRecordV2.Status.START.getValue()) {
                return hasError == UTraceRecordV2.StatusError.ERROR.getValue() ? UTraceRecordV2.RecordType.ERROR.getValue() : UTraceRecordV2.RecordType.START.getValue();
            }
            if (status != UTraceRecordV2.Status.END_COMPLETE.getValue() && status != UTraceRecordV2.Status.END_RETURN.getValue() && status != UTraceRecordV2.Status.END_GO_AHEAD.getValue()) {
                return UTraceRecordV2.RecordType.NONE.getValue();
            }
            return UTraceRecordV2.RecordType.END.getValue();
        }
    }

    public /* synthetic */ UTraceSQLiteHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 & 4) != 0 ? null : cursorFactory, (i2 & 8) != 0 ? 2 : i);
    }

    private final void createTable(SQLiteDatabase db, String statement, String tableName) {
        Object obj;
        Unit unit;
        Logs.INSTANCE.i("UTrace.Lib.SQLiteHelper", "createTable() table=" + tableName);
        try {
            Result.Companion companion = Result.Companion;
            if (db != null) {
                db.execSQL(statement);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w("UTrace.Lib.SQLiteHelper", "createTable table=" + tableName + " exception=" + th2);
        }
    }

    @SuppressLint({"Range"})
    private final void upgrade2(SQLiteDatabase db) {
        Object obj;
        Cursor cursorQuery;
        String str = "alter table trace add column type integer DEFAULT " + UTraceRecordV2.RecordType.NONE.getValue();
        String str2 = "alter table trace add column spanType integer DEFAULT " + SpanType.CodeSpans.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append("update trace set statusCode=-3 where hasError=");
        UTraceRecordV2.StatusError statusError = UTraceRecordV2.StatusError.ERROR;
        sb.append(statusError.getValue());
        sb.append(" and trim(info)!=''");
        String string = sb.toString();
        String str3 = "update trace set statusCode=-1 where hasError=" + statusError.getValue() + " and trim(info)=''";
        try {
            Result.Companion companion = Result.Companion;
            if (db != null) {
                db.execSQL("create table traceConfig(traceId varchar(30) primary key,tags varchar(200),flags varchar(200))");
            }
            if (db != null) {
                db.execSQL("alter table trace add column statusCode integer DEFAULT 0");
            }
            if (db != null) {
                db.execSQL(str);
            }
            if (db != null) {
                db.execSQL(str2);
            }
            if (db != null) {
                db.execSQL("alter table trace add column tags varchar(200) DEFAULT ''");
            }
            if (db != null) {
                db.execSQL(string);
            }
            if (db != null) {
                db.execSQL(str3);
            }
            Unit unit = null;
            if (db != null && (cursorQuery = db.query(UTraceSQLiteHelperKt.TRACE_TABLE_NAME, new String[]{"traceId", "status", UTraceSQLiteHelperKt.COL_HAS_ERROR}, null, null, null, null, null)) != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    while (cursor2.moveToNext()) {
                        String string2 = cursor2.getString(cursor2.getColumnIndex("traceId"));
                        db.execSQL("update trace set type=" + INSTANCE.updateType(cursor2.getInt(cursor2.getColumnIndex("status")), cursor2.getInt(cursor2.getColumnIndex(UTraceSQLiteHelperKt.COL_HAS_ERROR))) + " where traceId=" + string2);
                    }
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, (Throwable) null);
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursor, th);
                        throw th2;
                    }
                }
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            Logs.INSTANCE.w("UTrace.Lib.SQLiteHelper", "onUpgrade db exception: " + th4);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@Nullable SQLiteDatabase db) {
        Logs.INSTANCE.d("UTrace.Lib.SQLiteHelper", "onCreate db=" + db);
        createTable(db, UTraceSQLiteHelperKt.CREATE_TRACE_TABLE, UTraceSQLiteHelperKt.TRACE_TABLE_NAME);
        createTable(db, "create table traceConfig(traceId varchar(30) primary key,tags varchar(200),flags varchar(200))", UTraceSQLiteHelperKt.CONFIG_TABLE_NAME);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
        Logs.INSTANCE.i("UTrace.Lib.SQLiteHelper", "onDowngrade() " + oldVersion + " -> " + newVersion);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
        Object obj;
        Logs logs = Logs.INSTANCE;
        logs.i("UTrace.Lib.SQLiteHelper", "onUpgrade() " + oldVersion + " -> " + newVersion);
        try {
            Result.Companion companion = Result.Companion;
            if (oldVersion <= 1 && newVersion >= 2) {
                upgrade2(db);
            }
            logs.d("UTrace.Lib.SQLiteHelper", "onUpgrade, success.");
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w("UTrace.Lib.SQLiteHelper", "onUpgrade exception=" + th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTraceSQLiteHelper(@NotNull Context context, @NotNull String str, @Nullable SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "name");
    }
}
