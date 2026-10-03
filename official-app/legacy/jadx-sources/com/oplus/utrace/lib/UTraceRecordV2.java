package com.oplus.utrace.lib;

import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.oplus.utrace.utils.Logs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0004OPQRB\u0095\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\u0010\u0014J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\u0099\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u000e\u001a\u00020HJ\t\u0010J\u001a\u00020\fHÖ\u0001J\u0006\u0010K\u001a\u00020\u0003J\u0006\u0010L\u001a\u00020MJ\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 ¨\u0006S"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecordV2;", "", UTraceRecordV2.KEY_TRACE_ID, "", UTraceRecordV2.KEY_CURRENT, "Lcom/oplus/utrace/lib/NodeID;", UTraceRecordV2.KEY_PARENT, "spanName", "startTime", "", "endTime", "status", "", "info", "hasError", "statusCode", "type", "spanType", "tags", "", "(Ljava/lang/String;Lcom/oplus/utrace/lib/NodeID;Lcom/oplus/utrace/lib/NodeID;Ljava/lang/String;JJILjava/lang/String;IIIILjava/util/Map;)V", "getCurrent", "()Lcom/oplus/utrace/lib/NodeID;", "setCurrent", "(Lcom/oplus/utrace/lib/NodeID;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getHasError", "()I", "setHasError", "(I)V", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "getParent", "setParent", "getSpanName", "setSpanName", "getSpanType", "setSpanType", "getStartTime", "setStartTime", "getStatus", "setStatus", "getStatusCode", "setStatusCode", "getTags", "()Ljava/util/Map;", "setTags", "(Ljava/util/Map;)V", "getTraceID", "setTraceID", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toJsonString", "toLegacyObj", "Lcom/oplus/utrace/lib/UTraceRecord;", "toString", "Companion", "RecordType", "Status", "StatusError", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UTraceRecordV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_CURRENT = "current";

    @NotNull
    private static final String KEY_END_TIME = "endTime";

    @NotNull
    private static final String KEY_HAS_ERROR = "hasError";

    @NotNull
    private static final String KEY_INFO = "info";

    @NotNull
    private static final String KEY_PARENT = "parent";

    @NotNull
    private static final String KEY_SPAN_NAME = "spanName";

    @NotNull
    private static final String KEY_SPAN_TYPE = "spanType";

    @NotNull
    private static final String KEY_START_TIME = "startTime";

    @NotNull
    private static final String KEY_STATUS = "status";

    @NotNull
    private static final String KEY_STATUS_CODE = "statusCode";

    @NotNull
    private static final String KEY_TAGS = "tags";

    @NotNull
    private static final String KEY_TRACE_ID = "traceID";

    @NotNull
    private static final String KEY_TYPE = "type";

    @NotNull
    private NodeID current;
    private long endTime;
    private int hasError;

    @NotNull
    private String info;

    @Nullable
    private NodeID parent;

    @NotNull
    private String spanName;
    private int spanType;
    private long startTime;
    private int status;
    private int statusCode;

    @NotNull
    private Map<String, String> tags;

    @NotNull
    private String traceID;
    private int type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecordV2$Companion;", "", "()V", "KEY_CURRENT", "", "KEY_END_TIME", "KEY_HAS_ERROR", "KEY_INFO", "KEY_PARENT", "KEY_SPAN_NAME", "KEY_SPAN_TYPE", "KEY_START_TIME", "KEY_STATUS", "KEY_STATUS_CODE", "KEY_TAGS", "KEY_TRACE_ID", "KEY_TYPE", "fromJSONString", "Lcom/oplus/utrace/lib/UTraceRecordV2;", "jsonString", "fromLegacyObj", "legacy", "Lcom/oplus/utrace/lib/UTraceRecord;", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final UTraceRecordV2 fromJSONString(@NotNull String jsonString) {
            Object objM5287constructorimpl;
            UTraceRecordV2 uTraceRecordV2;
            NodeID nodeID;
            Map map;
            String str = "";
            String jsonString2 = jsonString;
            Intrinsics.checkNotNullParameter(jsonString2, "jsonString");
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!(!StringsKt__StringsJVMKt.isBlank(jsonString))) {
                    jsonString2 = null;
                }
                if (jsonString2 != null) {
                    JSONObject jSONObject = new JSONObject(jsonString2);
                    String traceID = jSONObject.optString(UTraceRecordV2.KEY_TRACE_ID, "");
                    String strOptString = jSONObject.optString(UTraceRecordV2.KEY_CURRENT, "");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "json.optString(KEY_CURRENT, \"\")");
                    NodeID nodeID2 = new NodeID(strOptString);
                    if (jSONObject.has(UTraceRecordV2.KEY_PARENT)) {
                        String strOptString2 = jSONObject.optString(UTraceRecordV2.KEY_PARENT, "");
                        Intrinsics.checkNotNullExpressionValue(strOptString2, "json.optString(KEY_PARENT, \"\")");
                        nodeID = new NodeID(strOptString2);
                    } else {
                        nodeID = null;
                    }
                    String spanName = jSONObject.optString("spanName", "");
                    long jOptLong = jSONObject.optLong("startTime", 0L);
                    long jOptLong2 = jSONObject.optLong("endTime", 0L);
                    int iOptInt = jSONObject.optInt("status", 0);
                    String info = jSONObject.optString("info", "");
                    int iOptInt2 = jSONObject.optInt("hasError", StatusError.NO_ERROR.getValue());
                    int iOptInt3 = jSONObject.optInt("statusCode", 0);
                    int iOptInt4 = jSONObject.optInt("type", RecordType.NONE.getValue());
                    int iOptInt5 = jSONObject.optInt("spanType", SpanType.CodeSpans.getValue());
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                    if (jSONObjectOptJSONObject != null) {
                        Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(KEY_TAGS)");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        Intrinsics.checkNotNullExpressionValue(itKeys, "it.keys()");
                        while (itKeys.hasNext()) {
                            String key = itKeys.next();
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            String strOptString3 = jSONObjectOptJSONObject.optString(key, str);
                            Intrinsics.checkNotNullExpressionValue(strOptString3, "it.optString(key, \"\")");
                            linkedHashMap.put(key, strOptString3);
                            str = str;
                        }
                        map = MapsKt__MapsKt.toMap(linkedHashMap);
                    } else {
                        map = null;
                    }
                    Intrinsics.checkNotNullExpressionValue(traceID, "traceID");
                    Intrinsics.checkNotNullExpressionValue(spanName, "spanName");
                    Intrinsics.checkNotNullExpressionValue(info, "info");
                    uTraceRecordV2 = new UTraceRecordV2(traceID, nodeID2, nodeID, spanName, jOptLong, jOptLong2, iOptInt, info, iOptInt2, iOptInt3, iOptInt4, iOptInt5, map == null ? MapsKt__MapsKt.emptyMap() : map);
                } else {
                    uTraceRecordV2 = null;
                }
                objM5287constructorimpl = Result.m5287constructorimpl(uTraceRecordV2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                Logs.INSTANCE.e("UTraceRecordV2", "jsonString parse to json error: " + thM5290exceptionOrNullimpl.getMessage(), thM5290exceptionOrNullimpl);
            }
            return (UTraceRecordV2) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
        }

        @NotNull
        public final UTraceRecordV2 fromLegacyObj(@NotNull UTraceRecord legacy) {
            Intrinsics.checkNotNullParameter(legacy, "legacy");
            return new UTraceRecordV2(legacy.getTraceID(), legacy.getCurrent(), legacy.getParent(), legacy.getSpanName(), legacy.getStartTime(), legacy.getEndTime(), legacy.getStatus(), legacy.getInfo(), legacy.getHasError(), 0, RecordType.NONE.getValue(), SpanType.CodeSpans.getValue(), MapsKt__MapsKt.emptyMap());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecordV2$RecordType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "NONE", "START", "END", WeightData_A3.IMPEDANCE_STATUS_ERROR, "SPAN_TAG", "TRACE_TAG", "TRACE_FLAG", "Companion", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum RecordType {
        NONE(0),
        START(1),
        END(2),
        ERROR(3),
        SPAN_TAG(4),
        TRACE_TAG(5),
        TRACE_FLAG(6);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecordV2$RecordType$Companion;", "", "()V", "find", "Lcom/oplus/utrace/lib/UTraceRecordV2$RecordType;", "value", "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nUTraceRecordV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UTraceRecordV2.kt\ncom/oplus/utrace/lib/UTraceRecordV2$RecordType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:13:0x001d  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final RecordType find(int value) {
                for (RecordType recordType : RecordType.values()) {
                    if (recordType.getValue() == value) {
                        if (recordType == null) {
                            return RecordType.NONE;
                        }
                        return recordType;
                    }
                }
                recordType = null;
                if (recordType == null) {
                    return RecordType.NONE;
                }
                return recordType;
            }
        }

        RecordType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecordV2$Status;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "START", "END_GO_AHEAD", "END_COMPLETE", "END_RETURN", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Status {
        START(0),
        END_GO_AHEAD(1),
        END_COMPLETE(2),
        END_RETURN(3);

        private int value;

        Status(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecordV2$StatusError;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "NO_ERROR", WeightData_A3.IMPEDANCE_STATUS_ERROR, "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum StatusError {
        NO_ERROR(0),
        ERROR(1);

        private int value;

        StatusError(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }
    }

    public UTraceRecordV2() {
        this(null, null, null, null, 0L, 0L, 0, null, 0, 0, 0, 0, null, 8191, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTraceID() {
        return this.traceID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSpanType() {
        return this.spanType;
    }

    @NotNull
    public final Map<String, String> component13() {
        return this.tags;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NodeID getCurrent() {
        return this.current;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NodeID getParent() {
        return this.parent;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpanName() {
        return this.spanName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHasError() {
        return this.hasError;
    }

    @NotNull
    public final UTraceRecordV2 copy(@NotNull String traceID, @NotNull NodeID current, @Nullable NodeID parent, @NotNull String spanName, long startTime, long endTime, int status, @NotNull String info, int hasError, int statusCode, int type, int spanType, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new UTraceRecordV2(traceID, current, parent, spanName, startTime, endTime, status, info, hasError, statusCode, type, spanType, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UTraceRecordV2)) {
            return false;
        }
        UTraceRecordV2 uTraceRecordV2 = (UTraceRecordV2) other;
        return Intrinsics.areEqual(this.traceID, uTraceRecordV2.traceID) && Intrinsics.areEqual(this.current, uTraceRecordV2.current) && Intrinsics.areEqual(this.parent, uTraceRecordV2.parent) && Intrinsics.areEqual(this.spanName, uTraceRecordV2.spanName) && this.startTime == uTraceRecordV2.startTime && this.endTime == uTraceRecordV2.endTime && this.status == uTraceRecordV2.status && Intrinsics.areEqual(this.info, uTraceRecordV2.info) && this.hasError == uTraceRecordV2.hasError && this.statusCode == uTraceRecordV2.statusCode && this.type == uTraceRecordV2.type && this.spanType == uTraceRecordV2.spanType && Intrinsics.areEqual(this.tags, uTraceRecordV2.tags);
    }

    @NotNull
    public final NodeID getCurrent() {
        return this.current;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getHasError() {
        return this.hasError;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final NodeID getParent() {
        return this.parent;
    }

    @NotNull
    public final String getSpanName() {
        return this.spanName;
    }

    public final int getSpanType() {
        return this.spanType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getTraceID() {
        return this.traceID;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean hasError() {
        return this.hasError == StatusError.ERROR.getValue();
    }

    public int hashCode() {
        int iHashCode = ((this.traceID.hashCode() * 31) + this.current.hashCode()) * 31;
        NodeID nodeID = this.parent;
        return ((((((((((((((((((((iHashCode + (nodeID == null ? 0 : nodeID.hashCode())) * 31) + this.spanName.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.status)) * 31) + this.info.hashCode()) * 31) + Integer.hashCode(this.hasError)) * 31) + Integer.hashCode(this.statusCode)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.spanType)) * 31) + this.tags.hashCode();
    }

    public final void setCurrent(@NotNull NodeID nodeID) {
        Intrinsics.checkNotNullParameter(nodeID, "<set-?>");
        this.current = nodeID;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setHasError(int i) {
        this.hasError = i;
    }

    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.info = str;
    }

    public final void setParent(@Nullable NodeID nodeID) {
        this.parent = nodeID;
    }

    public final void setSpanName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.spanName = str;
    }

    public final void setSpanType(int i) {
        this.spanType = i;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setTags(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.tags = map;
    }

    public final void setTraceID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.traceID = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public final String toJsonString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_TRACE_ID, this.traceID);
        jSONObject.put(KEY_CURRENT, this.current.toJsonString());
        NodeID nodeID = this.parent;
        jSONObject.put(KEY_PARENT, nodeID != null ? nodeID.toJsonString() : null);
        jSONObject.put("spanName", this.spanName);
        jSONObject.put("startTime", this.startTime);
        jSONObject.put("endTime", this.endTime);
        jSONObject.put("status", this.status);
        jSONObject.put("info", this.info);
        jSONObject.put("hasError", this.hasError);
        jSONObject.put("statusCode", this.statusCode);
        jSONObject.put("type", this.type);
        jSONObject.put("spanType", this.spanType);
        jSONObject.put("tags", new JSONObject(this.tags));
        Logs.INSTANCE.d("UTraceRecordV2", "toJsonString, " + jSONObject);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "resultJson.toString()");
        return string;
    }

    @NotNull
    public final UTraceRecord toLegacyObj() {
        return new UTraceRecord(this.traceID, this.current, this.parent, this.spanName, this.startTime, this.endTime, this.status, this.info, this.hasError);
    }

    @NotNull
    public String toString() {
        return "UTraceRecordV2(traceID=" + this.traceID + ", current=" + this.current + ", parent=" + this.parent + ", spanName=" + this.spanName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", info=" + this.info + ", hasError=" + this.hasError + ", statusCode=" + this.statusCode + ", type=" + this.type + ", spanType=" + this.spanType + ", tags=" + this.tags + ')';
    }

    public UTraceRecordV2(@NotNull String traceID, @NotNull NodeID current, @Nullable NodeID nodeID, @NotNull String spanName, long j2, long j3, int i, @NotNull String info, int i2, int i3, int i4, int i5, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.traceID = traceID;
        this.current = current;
        this.parent = nodeID;
        this.spanName = spanName;
        this.startTime = j2;
        this.endTime = j3;
        this.status = i;
        this.info = info;
        this.hasError = i2;
        this.statusCode = i3;
        this.type = i4;
        this.spanType = i5;
        this.tags = tags;
    }

    public /* synthetic */ UTraceRecordV2(String str, NodeID nodeID, NodeID nodeID2, String str2, long j2, long j3, int i, String str3, int i2, int i3, int i4, int i5, Map map, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? new NodeID() : nodeID, (i6 & 4) != 0 ? null : nodeID2, (i6 & 8) != 0 ? "" : str2, (i6 & 16) != 0 ? 0L : j2, (i6 & 32) == 0 ? j3 : 0L, (i6 & 64) != 0 ? 0 : i, (i6 & 128) == 0 ? str3 : "", (i6 & 256) != 0 ? StatusError.NO_ERROR.getValue() : i2, (i6 & 512) == 0 ? i3 : 0, (i6 & 1024) != 0 ? RecordType.NONE.getValue() : i4, (i6 & 2048) != 0 ? SpanType.CodeSpans.getValue() : i5, (i6 & 4096) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
