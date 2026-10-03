package com.oplus.utrace.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.lib.NodeID;
import com.oplus.utrace.lib.UTraceRecordV2;
import com.oplus.utrace.utils.Logs;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 H2\u00020\u0001:\u0001HB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\\\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001fH\u0002J$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J@\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0018\u0001`(H\u0003J\u000e\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u001cJ\b\u0010+\u001a\u00020*H\u0002J\u0006\u0010,\u001a\u00020*J~\u0010-\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00010\u001c2\u0006\u00100\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001fH\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u000e\u00106\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\rJ\u0010\u00107\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u00108\u001a\u00020*2\u0006\u0010#\u001a\u00020\u001cH\u0002J\u001c\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001f2\u0006\u0010:\u001a\u00020\u001cH\u0002J \u0010;\u001a\b\u0012\u0004\u0012\u00020\r0<2\u0006\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010=\u001a\u000203H\u0007J4\u0010>\u001a\u00020*2\u0006\u0010#\u001a\u00020\u001c2\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0'j\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r`(H\u0002J4\u0010?\u001a\u00020*2\u0006\u0010#\u001a\u00020\u001c2\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0'j\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r`(H\u0003Jc\u0010@\u001a\u00020*2!\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020*0B26\u0010F\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\r¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020*0GH\u0007R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/oplus/utrace/db/DBWrapper;", "Landroid/os/Handler$Callback;", "db", "Landroid/database/sqlite/SQLiteDatabase;", "looper", "Landroid/os/Looper;", "flushDelay", "", "cacheSize", "", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/os/Looper;JI)V", "cache", "", "Lcom/oplus/utrace/lib/UTraceRecordV2;", "getDb", "()Landroid/database/sqlite/SQLiteDatabase;", "setDb", "(Landroid/database/sqlite/SQLiteDatabase;)V", "handler", "Landroid/os/Handler;", "correctRecord", "record", "type", "status", "startTime", "endTime", UTraceSQLiteHelperKt.COL_HAS_ERROR, UTraceSQLiteHelperKt.COL_INFO, "", "errorCode", UTraceSQLiteHelperKt.COL_TAGS, "", "correctStartAndEndTime", "Lkotlin/Pair;", "cursorToRecord", "traceId", "cursor", "Landroid/database/Cursor;", "records", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "deleteTrace", "", "flushSpans", "flushSpansSync", "getNewRecord", UTraceSQLiteHelperKt.COL_SPAN_ID, UTraceSQLiteHelperKt.COL_PARENT_ID, UTraceSQLiteHelperKt.COL_SPAN_NAME, UTraceSQLiteHelperKt.COL_SPAN_TYPE, "handleMessage", "", "msg", "Landroid/os/Message;", "insertSpan", "insertSpan2DB", "internalDeleteTrace", "parseMap", "text", "queryAllSpans", "", "deleteAfterQuery", "queryAllSpansFromCache", "queryAllSpansFromDB", "restoreAllSpans", "before", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", ParserTag.DATA_SAME_COUNT, "receiveSpans", "Lkotlin/Function2;", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDBWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBWrapper.kt\ncom/oplus/utrace/db/DBWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1549#2:360\n1620#2,3:361\n766#2:364\n857#2,2:365\n1855#2,2:367\n1#3:369\n*S KotlinDebug\n*F\n+ 1 DBWrapper.kt\ncom/oplus/utrace/db/DBWrapper\n*L\n81#1:360\n81#1:361,3\n90#1:364\n90#1:365,2\n92#1:367,2\n*E\n"})
public final class DBWrapper implements Handler.Callback {
    private static final int DEFAULT_CACHE_SIZE = 200;
    private static final long DEFAULT_FLUSH_DELAY = 1000;
    private static final int MSG_FLUSH = 100;

    @NotNull
    private final List<UTraceRecordV2> cache;
    private final int cacheSize;

    @NotNull
    private SQLiteDatabase db;
    private final long flushDelay;

    @NotNull
    private final Handler handler;

    @NotNull
    private static final String[] RECORD_COLUMNS = {UTraceSQLiteHelperKt.COL_SPAN_ID, UTraceSQLiteHelperKt.COL_SPAN_NAME, UTraceSQLiteHelperKt.COL_PARENT_ID, "startTime", "endTime", UTraceSQLiteHelperKt.COL_INFO, "status", UTraceSQLiteHelperKt.COL_HAS_ERROR, UTraceSQLiteHelperKt.COL_STATUS_CODE, "type", UTraceSQLiteHelperKt.COL_SPAN_TYPE, UTraceSQLiteHelperKt.COL_TAGS};

    public DBWrapper(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull Looper looper, long j, int i) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.db = sQLiteDatabase;
        this.flushDelay = j;
        this.cacheSize = i;
        this.cache = new ArrayList();
        this.handler = new Handler(looper, this);
    }

    private final UTraceRecordV2 correctRecord(UTraceRecordV2 record, int type, int status, long startTime, long endTime, int hasError, String info, int errorCode, Map<String, String> tags) {
        if (type == UTraceRecordV2.RecordType.END.getValue()) {
            record.setStatus(status);
            record.setEndTime(endTime);
        }
        if (type == UTraceRecordV2.RecordType.ERROR.getValue()) {
            record.setHasError(hasError);
            record.setInfo(info);
            record.setStatusCode(errorCode);
        }
        if (type == UTraceRecordV2.RecordType.SPAN_TAG.getValue()) {
            record.setTags(MapsKt.plus(record.getTags(), tags));
        }
        if (record.getStartTime() > startTime && startTime > 0) {
            record.setStartTime(startTime);
        }
        if (record.getEndTime() < endTime) {
            record.setEndTime(endTime);
        }
        return record;
    }

    private final Pair<Long, Long> correctStartAndEndTime(long startTime, long endTime) {
        long jCurrentTimeMillis;
        if (startTime == 0 && endTime == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            startTime = jCurrentTimeMillis;
        } else {
            if (startTime == 0) {
                startTime = endTime;
            }
            if (endTime == 0) {
                jCurrentTimeMillis = startTime;
            } else {
                long j = startTime;
                startTime = endTime;
                jCurrentTimeMillis = j;
            }
        }
        return new Pair<>(Long.valueOf(jCurrentTimeMillis), Long.valueOf(startTime));
    }

    @SuppressLint({"Range"})
    private final UTraceRecordV2 cursorToRecord(String traceId, Cursor cursor, HashMap<String, UTraceRecordV2> records) {
        UTraceRecordV2 uTraceRecordV2CorrectRecord;
        String string = cursor.getString(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_SPAN_ID));
        String string2 = cursor.getString(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_SPAN_NAME));
        String string3 = cursor.getString(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_PARENT_ID));
        long j = cursor.getLong(cursor.getColumnIndex("startTime"));
        long j2 = cursor.getLong(cursor.getColumnIndex("endTime"));
        String string4 = cursor.getString(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_INFO));
        int i = cursor.getInt(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_STATUS_CODE));
        int i2 = cursor.getInt(cursor.getColumnIndex("status"));
        int i3 = cursor.getInt(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_HAS_ERROR));
        int i4 = cursor.getInt(cursor.getColumnIndex("type"));
        int i5 = cursor.getInt(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_SPAN_TYPE));
        String string5 = cursor.getString(cursor.getColumnIndex(UTraceSQLiteHelperKt.COL_TAGS));
        Intrinsics.checkNotNullExpressionValue(string5, "cursor.getString(cursor.getColumnIndex(COL_TAGS))");
        Map<String, String> map = parseMap(string5);
        int iUpdateType = i4 == UTraceRecordV2.RecordType.NONE.getValue() ? UTraceSQLiteHelper.INSTANCE.updateType(i2, i3) : i4;
        Pair<Long, Long> pairCorrectStartAndEndTime = correctStartAndEndTime(j, j2);
        long jLongValue = ((Number) pairCorrectStartAndEndTime.component1()).longValue();
        long jLongValue2 = ((Number) pairCorrectStartAndEndTime.component2()).longValue();
        UTraceRecordV2 uTraceRecordV2 = records != null ? records.get(string) : null;
        if (uTraceRecordV2 == null) {
            Intrinsics.checkNotNullExpressionValue(string, UTraceSQLiteHelperKt.COL_SPAN_ID);
            Intrinsics.checkNotNullExpressionValue(string2, UTraceSQLiteHelperKt.COL_SPAN_NAME);
            Intrinsics.checkNotNullExpressionValue(string4, UTraceSQLiteHelperKt.COL_INFO);
            uTraceRecordV2CorrectRecord = getNewRecord(traceId, string, string3, string2, jLongValue, jLongValue2, i2, string4, i3, i, iUpdateType, i5, map);
        } else {
            if (StringsKt.isBlank(uTraceRecordV2.getSpanName())) {
                Intrinsics.checkNotNullExpressionValue(string2, UTraceSQLiteHelperKt.COL_SPAN_NAME);
                if (!StringsKt.isBlank(string2)) {
                    uTraceRecordV2.setSpanName(string2);
                }
            }
            Intrinsics.checkNotNullExpressionValue(string4, UTraceSQLiteHelperKt.COL_INFO);
            uTraceRecordV2CorrectRecord = correctRecord(uTraceRecordV2, iUpdateType, i2, jLongValue, jLongValue2, i3, string4, i, map);
        }
        if (records != null) {
            Intrinsics.checkNotNullExpressionValue(string, UTraceSQLiteHelperKt.COL_SPAN_ID);
            records.put(string, uTraceRecordV2CorrectRecord);
        }
        return uTraceRecordV2CorrectRecord;
    }

    private final void flushSpans() {
        Object obj;
        if (!this.cache.isEmpty()) {
            Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "flushSpans() cache.size=" + this.cache.size() + " db=" + DBWrapperKt.getName(this.db));
            try {
                Result.Companion companion = Result.Companion;
                DBWrapperKt.withTransaction(this.db, new Function1<SQLiteDatabase, Unit>() { // from class: com.oplus.utrace.db.DBWrapper$flushSpans$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((SQLiteDatabase) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SQLiteDatabase sQLiteDatabase) {
                        Intrinsics.checkNotNullParameter(sQLiteDatabase, "it");
                        List list = this.$this_runCatching.cache;
                        DBWrapper dBWrapper = this.$this_runCatching;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            dBWrapper.insertSpan2DB((UTraceRecordV2) it.next());
                        }
                    }
                });
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.e("UTrace.Lib.DBWrapper", "flushSpans: " + th2.getMessage() + ", db=" + DBWrapperKt.getName(this.db), th2);
            }
            this.cache.clear();
        }
    }

    private final UTraceRecordV2 getNewRecord(String traceId, String spanId, String parentId, String spanName, long startTime, long endTime, int status, String info, int hasError, int errorCode, int type, int spanType, Map<String, String> tags) {
        Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "getNewRecord parent=parentId current=" + spanId + " traceId=" + traceId + " status=" + status + " type=" + type);
        NodeID.Companion companion = NodeID.INSTANCE;
        return new UTraceRecordV2(traceId, companion.parseComposedSpanId(spanId), parentId != null ? companion.parseComposedSpanId(parentId) : null, spanName, startTime, endTime, status, info, hasError, errorCode, type, spanType, tags);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSpan2DB(UTraceRecordV2 record) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("traceId", record.getTraceID());
        contentValues.put(UTraceSQLiteHelperKt.COL_SPAN_ID, record.getCurrent().getSpanID(true));
        contentValues.put(UTraceSQLiteHelperKt.COL_SPAN_NAME, record.getSpanName());
        NodeID parent = record.getParent();
        contentValues.put(UTraceSQLiteHelperKt.COL_PARENT_ID, parent != null ? parent.getSpanID(true) : null);
        contentValues.put("startTime", Long.valueOf(record.getStartTime()));
        contentValues.put("endTime", Long.valueOf(record.getEndTime()));
        contentValues.put("status", Integer.valueOf(record.getStatus()));
        contentValues.put(UTraceSQLiteHelperKt.COL_INFO, record.getInfo());
        contentValues.put(UTraceSQLiteHelperKt.COL_STATUS_CODE, Integer.valueOf(record.getStatusCode()));
        contentValues.put(UTraceSQLiteHelperKt.COL_HAS_ERROR, Integer.valueOf(record.getHasError()));
        contentValues.put("type", Integer.valueOf(record.getType()));
        contentValues.put(UTraceSQLiteHelperKt.COL_SPAN_TYPE, Integer.valueOf(record.getSpanType()));
        contentValues.put(UTraceSQLiteHelperKt.COL_TAGS, new JSONObject(record.getTags()).toString());
        this.db.insert(UTraceSQLiteHelperKt.TRACE_TABLE_NAME, null, contentValues);
    }

    private final void internalDeleteTrace(final String traceId) {
        Object obj;
        Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "internalDeleteTrace() traceId=" + traceId);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Integer.valueOf(this.db.delete(UTraceSQLiteHelperKt.TRACE_TABLE_NAME, "traceId=?", new String[]{traceId})));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e("UTrace.Lib.DBWrapper", "internalDeleteTrace() " + th2.getMessage(), th2);
        }
        List<UTraceRecordV2> list = this.cache;
        final Function1<UTraceRecordV2, Boolean> function1 = new Function1<UTraceRecordV2, Boolean>() { // from class: com.oplus.utrace.db.DBWrapper.internalDeleteTrace.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean invoke(@NotNull UTraceRecordV2 uTraceRecordV2) {
                Intrinsics.checkNotNullParameter(uTraceRecordV2, "it");
                return Boolean.valueOf(Intrinsics.areEqual(uTraceRecordV2.getTraceID(), traceId));
            }
        };
        list.removeIf(new Predicate() { // from class: com.oplus.utrace.db.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return DBWrapper.internalDeleteTrace$lambda$14(function1, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean internalDeleteTrace$lambda$14(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private final Map<String, String> parseMap(String text) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = null;
            if (!(!StringsKt.isBlank(text))) {
                text = null;
            }
            if (text != null) {
                jSONObject = new JSONObject(text);
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "it.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(next, Node.I_KEY);
                    String string = jSONObject.getString(next);
                    Intrinsics.checkNotNullExpressionValue(string, "it.getString(key)");
                    linkedHashMap.put(next, string);
                }
            }
            obj = Result.constructor-impl(jSONObject);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e("UTrace.Lib.DBWrapper", "parseMap error: " + th2.getMessage());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ List queryAllSpans$default(DBWrapper dBWrapper, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dBWrapper.queryAllSpans(str, z);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0135  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0135, please report this as an issue */
    private final void queryAllSpansFromCache(String traceId, HashMap<String, UTraceRecordV2> records) {
        String str;
        String str2;
        Object obj;
        Throwable th;
        HashMap<String, UTraceRecordV2> map;
        DBWrapper dBWrapper = this;
        HashMap<String, UTraceRecordV2> map2 = records;
        String str3 = "queryAllSpansFromCache() traceId=";
        String str4 = "UTrace.Lib.DBWrapper";
        try {
            Result.Companion companion = Result.Companion;
            Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "queryAllSpansFromCache() traceId=" + traceId + " reading from cache ...");
            List<UTraceRecordV2> list = dBWrapper.cache;
            ArrayList<UTraceRecordV2> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((UTraceRecordV2) obj2).getTraceID(), traceId)) {
                    arrayList.add(obj2);
                }
            }
            for (UTraceRecordV2 uTraceRecordV2 : arrayList) {
                String spanID = uTraceRecordV2.getCurrent().getSpanID(true);
                Pair<Long, Long> pairCorrectStartAndEndTime = dBWrapper.correctStartAndEndTime(uTraceRecordV2.getStartTime(), uTraceRecordV2.getEndTime());
                long jLongValue = ((Number) pairCorrectStartAndEndTime.component1()).longValue();
                long jLongValue2 = ((Number) pairCorrectStartAndEndTime.component2()).longValue();
                UTraceRecordV2 uTraceRecordV3 = map2.get(spanID);
                if (uTraceRecordV3 == null) {
                    NodeID parent = uTraceRecordV2.getParent();
                    str = str4;
                    str2 = str3;
                    try {
                        map = records;
                        map.put(spanID, getNewRecord(traceId, spanID, parent != null ? parent.getSpanID(true) : null, uTraceRecordV2.getSpanName(), jLongValue, jLongValue2, uTraceRecordV2.getStatus(), uTraceRecordV2.getInfo(), uTraceRecordV2.getHasError(), uTraceRecordV2.getStatusCode(), uTraceRecordV2.getType(), uTraceRecordV2.getSpanType(), uTraceRecordV2.getTags()));
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                        th = Result.exceptionOrNull-impl(obj);
                        if (th != null) {
                            Logs.INSTANCE.e(str, str2 + traceId + " failure: " + th.getMessage(), th);
                        }
                    }
                } else {
                    str = str4;
                    str2 = str3;
                    map = map2;
                    map.put(spanID, correctRecord(uTraceRecordV3, uTraceRecordV2.getType(), uTraceRecordV2.getStatus(), jLongValue, jLongValue2, uTraceRecordV2.getHasError(), uTraceRecordV2.getInfo(), uTraceRecordV2.getStatusCode(), uTraceRecordV2.getTags()));
                }
                dBWrapper = this;
                map2 = map;
                str4 = str;
                str3 = str2;
            }
            str = str4;
            str2 = str3;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th3) {
            th = th3;
            str = str4;
            str2 = str3;
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            Logs.INSTANCE.e(str, str2 + traceId + " failure: " + th.getMessage(), th);
        }
    }

    @SuppressLint({"Range"})
    private final void queryAllSpansFromDB(String traceId, HashMap<String, UTraceRecordV2> records) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "queryAllSpansFromDB() traceId=" + traceId + " reading from db ...");
            Cursor cursorQuery = this.db.query(UTraceSQLiteHelperKt.TRACE_TABLE_NAME, RECORD_COLUMNS, "traceId=?", new String[]{traceId}, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                while (cursor.moveToNext()) {
                    Intrinsics.checkNotNullExpressionValue(cursor, "it");
                    cursorToRecord(traceId, cursor, records);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, (Throwable) null);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            Logs.INSTANCE.e("UTrace.Lib.DBWrapper", "queryAllSpansFromDB() traceId=" + traceId + " failure: " + th4.getMessage(), th4);
        }
    }

    public final void deleteTrace(@NotNull String traceId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        internalDeleteTrace(traceId);
    }

    public final void flushSpansSync() {
        this.handler.removeMessages(100);
        flushSpans();
    }

    @NotNull
    public final SQLiteDatabase getDb() {
        return this.db;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 100) {
            return true;
        }
        Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "MSG_FLUSH do flushSpans() db=" + DBWrapperKt.getName(this.db));
        flushSpans();
        return true;
    }

    public final void insertSpan(@NotNull UTraceRecordV2 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.cache.add(record);
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.d("UTrace.Lib.DBWrapper", "insertSpan() traceId=" + record.getTraceID() + " cache.size=" + this.cache.size() + " record=" + record + " db=" + DBWrapperKt.getName(this.db));
        }
        if (this.cache.size() >= this.cacheSize) {
            flushSpans();
            this.handler.removeMessages(100);
        } else if (this.cache.size() == 1) {
            this.handler.sendEmptyMessageDelayed(100, this.flushDelay);
        }
    }

    @SuppressLint({"Range"})
    @NotNull
    public final List<UTraceRecordV2> queryAllSpans(@NotNull String traceId, boolean deleteAfterQuery) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        HashMap<String, UTraceRecordV2> map = new HashMap<>();
        queryAllSpansFromDB(traceId, map);
        queryAllSpansFromCache(traceId, map);
        if (deleteAfterQuery) {
            internalDeleteTrace(traceId);
        }
        Collection<UTraceRecordV2> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "records.values");
        List<UTraceRecordV2> list = CollectionsKt.toList(collectionValues);
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryAllSpans() traceId=");
            sb.append(traceId);
            sb.append(" result.size=");
            sb.append(list.size());
            sb.append(" result=");
            List<UTraceRecordV2> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (UTraceRecordV2 uTraceRecordV2 : list2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uTraceRecordV2.getParent());
                sb2.append('|');
                sb2.append(uTraceRecordV2.getCurrent());
                arrayList.add(sb2.toString());
            }
            sb.append(arrayList);
            logs.d("UTrace.Lib.DBWrapper", sb.toString());
        }
        return list;
    }

    @SuppressLint({"Range"})
    public final void restoreAllSpans(@NotNull Function1<? super Integer, Unit> before, @NotNull Function2<? super String, ? super UTraceRecordV2, Unit> receiveSpans) {
        Object obj;
        Intrinsics.checkNotNullParameter(before, "before");
        Intrinsics.checkNotNullParameter(receiveSpans, "receiveSpans");
        try {
            Result.Companion companion = Result.Companion;
            Logs.INSTANCE.d("UTrace.Lib.DBWrapper", "restoreAllSpans() enter");
            Cursor cursorQuery = this.db.query(UTraceSQLiteHelperKt.TRACE_TABLE_NAME, null, null, null, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                before.invoke(Integer.valueOf(cursor.getCount()));
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndex("traceId"));
                    Intrinsics.checkNotNullExpressionValue(string, "traceId");
                    Intrinsics.checkNotNullExpressionValue(cursor, "it");
                    receiveSpans.invoke(string, cursorToRecord(string, cursor, null));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, (Throwable) null);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            Logs.INSTANCE.e("UTrace.Lib.DBWrapper", "restoreAllSpans() failure: " + th4.getMessage(), th4);
        }
    }

    public final void setDb(@NotNull SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<set-?>");
        this.db = sQLiteDatabase;
    }

    public /* synthetic */ DBWrapper(SQLiteDatabase sQLiteDatabase, Looper looper, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDatabase, looper, (i2 & 4) != 0 ? 1000L : j, (i2 & 8) != 0 ? 200 : i);
    }
}
