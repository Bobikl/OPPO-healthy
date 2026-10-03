package com.oplus.utrace.db;

import com.oplus.utrace.lib.SpanType;
import com.oplus.utrace.lib.UTraceRecordV2;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"COL_CONTAINS_HEAD", "", "COL_END_TIME", "COL_FLAGS", "COL_HAS_ERROR", "COL_INFO", "COL_PARENT_ID", "COL_SPAN_ID", "COL_SPAN_NAME", "COL_SPAN_NUM", "COL_SPAN_TYPE", "COL_START_TIME", "COL_STATUS", "COL_STATUS_CODE", "COL_TAGS", "COL_TRACE_ID", "COL_TYPE", "CONFIG_TABLE_NAME", "CREATE_CONFIG_TABLE", "CREATE_TRACE_TABLE", "EXT_DB", "TAG", "TRACE_DB_NAME", "TRACE_TABLE_NAME", "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UTraceSQLiteHelperKt {

    @NotNull
    public static final String COL_CONTAINS_HEAD = "containsHead";

    @NotNull
    public static final String COL_END_TIME = "endTime";

    @NotNull
    public static final String COL_FLAGS = "flags";

    @NotNull
    public static final String COL_HAS_ERROR = "hasError";

    @NotNull
    public static final String COL_INFO = "info";

    @NotNull
    public static final String COL_PARENT_ID = "parentId";

    @NotNull
    public static final String COL_SPAN_ID = "spanId";

    @NotNull
    public static final String COL_SPAN_NAME = "spanName";

    @NotNull
    public static final String COL_SPAN_NUM = "spanNum";

    @NotNull
    public static final String COL_SPAN_TYPE = "spanType";

    @NotNull
    public static final String COL_START_TIME = "startTime";

    @NotNull
    public static final String COL_STATUS = "status";

    @NotNull
    public static final String COL_STATUS_CODE = "statusCode";

    @NotNull
    public static final String COL_TAGS = "tags";

    @NotNull
    public static final String COL_TRACE_ID = "traceId";

    @NotNull
    public static final String COL_TYPE = "type";

    @NotNull
    public static final String CONFIG_TABLE_NAME = "traceConfig";

    @NotNull
    private static final String CREATE_CONFIG_TABLE = "create table traceConfig(traceId varchar(30) primary key,tags varchar(200),flags varchar(200))";

    @NotNull
    private static final String CREATE_TRACE_TABLE = "create table trace(id integer primary key autoincrement,traceId varchar(30),spanId varchar(40),spanName varchar(30),parentId varchar(30),startTime integer DEFAULT 0,endTime integer DEFAULT 0,info varchar(200),statusCode integer DEFAULT 0,status integer DEFAULT " + UTraceRecordV2.Status.START.getValue() + ",hasError integer DEFAULT " + UTraceRecordV2.StatusError.NO_ERROR.getValue() + ",type integer DEFAULT " + UTraceRecordV2.RecordType.NONE.getValue() + ",spanType integer DEFAULT " + SpanType.CodeSpans.getValue() + ",tags varchar(200))";

    @NotNull
    public static final String EXT_DB = ".db";

    @NotNull
    private static final String TAG = "UTrace.Lib.SQLiteHelper";

    @NotNull
    public static final String TRACE_DB_NAME = "utrace.db";

    @NotNull
    public static final String TRACE_TABLE_NAME = "trace";
}
