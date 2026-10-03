package com.oplus.utrace.hlog;

import android.content.Context;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.utils.DcsCommon;
import com.oplus.utrace.utils.DcsWrapper;
import com.oplus.utrace.utils.Logs;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J=\u0010\u0018\u001a\u00020\u00002.\u0010\u0019\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b0\u001a\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\n\u001a\u00020!H\u0016J\"\u0010 \u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/oplus/utrace/hlog/HLogReporter;", "Lcom/oplus/utrace/hlog/IHLogReporter;", "()V", BridgeConstant.KEY_EXTRAS, "", "", "", HLogFilesCollector.KEY_FILES, "", "Lcom/oplus/utrace/hlog/HLogReporter$LogFileInfo;", "pushData", "targetPkg", "traceId", "", "mergeTo", ParserTag.TAG_TARGET, "report", "", "code", "Lcom/oplus/utrace/hlog/IHLogReporter$Codes;", "message", "reportDirect", "directOnly", "", "setExtras", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lcom/oplus/utrace/hlog/HLogReporter;", "setLogFiles", "files", "Ljava/io/File;", "setPushData", "Lcom/oplus/utrace/hlog/PushData;", "Companion", "LogFileInfo", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogReporter.kt\ncom/oplus/utrace/hlog/HLogReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,140:1\n1549#2:141\n1620#2,3:142\n1549#2:150\n1620#2,3:151\n1#3:145\n13579#4,2:146\n215#5,2:148\n*S KotlinDebug\n*F\n+ 1 HLogReporter.kt\ncom/oplus/utrace/hlog/HLogReporter\n*L\n60#1:141\n60#1:142,3\n110#1:150\n110#1:151,3\n68#1:146,2\n105#1:148,2\n*E\n"})
public final class HLogReporter implements IHLogReporter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TIMESTAMP_FORMAT = "yyyyMMdd HHmmss.SSS";

    @Nullable
    private Object pushData;
    private long traceId;

    @NotNull
    private String targetPkg = "";

    @NotNull
    private List<LogFileInfo> logFiles = CollectionsKt.emptyList();

    @NotNull
    private final Map<String, Object> extras = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/oplus/utrace/hlog/HLogReporter$Companion;", "", "()V", "TIMESTAMP_FORMAT", "", "packageName", "getPackageName", "()Ljava/lang/String;", "versionName", "getVersionName", "init", "", "context", "Landroid/content/Context;", "init$utrace_sdk_log_logRelease", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPackageName() {
            return DcsWrapper.INSTANCE.getPackageName$utrace_sdk_log_logRelease();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getVersionName() {
            return DcsWrapper.INSTANCE.getVersionName$utrace_sdk_log_logRelease();
        }

        public final void init$utrace_sdk_log_logRelease(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DcsWrapper.INSTANCE.init(context);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/oplus/utrace/hlog/HLogReporter$LogFileInfo;", "", "name", "", "size", "", "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getSize", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LogFileInfo {

        @NotNull
        private final String name;
        private final long size;

        public LogFileInfo(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.name = str;
            this.size = j;
        }

        public static /* synthetic */ LogFileInfo copy$default(LogFileInfo logFileInfo, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logFileInfo.name;
            }
            if ((i & 2) != 0) {
                j = logFileInfo.size;
            }
            return logFileInfo.copy(str, j);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        public final LogFileInfo copy(@NotNull String name, long size) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new LogFileInfo(name, size);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogFileInfo)) {
                return false;
            }
            LogFileInfo logFileInfo = (LogFileInfo) other;
            return Intrinsics.areEqual(this.name, logFileInfo.name) && this.size == logFileInfo.size;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final long getSize() {
            return this.size;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Long.hashCode(this.size);
        }

        @NotNull
        public String toString() {
            return "LogFileInfo(name=" + this.name + ", size=" + this.size + ')';
        }
    }

    @NotNull
    public final HLogReporter mergeTo(@Nullable IHLogReporter target) {
        HLogReporter hLogReporter = target instanceof HLogReporter ? (HLogReporter) target : null;
        if (hLogReporter == null) {
            return this;
        }
        hLogReporter.extras.putAll(this.extras);
        return hLogReporter;
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    public void report(@NotNull IHLogReporter.Codes code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        reportDirect(code, false, message);
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    public void reportDirect(@NotNull IHLogReporter.Codes code, boolean directOnly, @NotNull String message) throws JSONException {
        String string;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        DcsWrapper dcsWrapper = DcsWrapper.INSTANCE;
        if (!dcsWrapper.getAvailable$utrace_sdk_log_logRelease()) {
            Logs.INSTANCE.i("UTrace.Sdk.HLogReporter", dcsWrapper.getLogPrefix$utrace_sdk_log_logRelease() + " report() DCS is not available");
            return;
        }
        if (directOnly && !dcsWrapper.getDirectReport()) {
            Logs.INSTANCE.i("UTrace.Sdk.HLogReporter", "report() only in UMS,like time changed");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_time", new SimpleDateFormat(TIMESTAMP_FORMAT, Locale.getDefault()).format(new Date(System.currentTimeMillis())));
        for (Map.Entry<String, Object> entry : this.extras.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        List<LogFileInfo> list = this.logFiles;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (LogFileInfo logFileInfo : list) {
            arrayList.add(MapsKt.mapOf(new Pair[]{TuplesKt.to("name", logFileInfo.getName()), TuplesKt.to("size", Long.valueOf(logFileInfo.getSize()))}));
        }
        JSONArray jSONArray = new JSONArray((Collection) arrayList);
        Pair[] pairArr = new Pair[11];
        pairArr[0] = TuplesKt.to("code", String.valueOf(code.getValue()));
        pairArr[1] = TuplesKt.to("message", '(' + code.name() + ')' + message);
        pairArr[2] = TuplesKt.to("trace_id", String.valueOf(this.traceId));
        pairArr[3] = TuplesKt.to("target_pkg", this.targetPkg);
        pairArr[4] = TuplesKt.to("push_data", String.valueOf(this.pushData));
        Companion companion = INSTANCE;
        pairArr[5] = TuplesKt.to("app_package", companion.getPackageName());
        pairArr[6] = TuplesKt.to("app_version_name", companion.getVersionName());
        pairArr[7] = TuplesKt.to("utrace_version_name", "2.0.44-25e9612-20260202-124920");
        if (this.logFiles.isEmpty()) {
            string = "";
        } else {
            string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "logFilesJson.toString()");
        }
        pairArr[8] = TuplesKt.to("log_files", string);
        pairArr[9] = TuplesKt.to(BridgeConstant.KEY_EXTRAS, jSONObject.toString());
        pairArr[10] = TuplesKt.to("config", HLogConfigHelper.INSTANCE.getLocalHLogCtrl$utrace_sdk_log_logRelease().toJsonString());
        DcsWrapper.INSTANCE.report(DcsCommon.LOG_TAG_ULOG, DcsCommon.EVENT_ID_HLOG_REPORTER, MapsKt.mutableMapOf(pairArr));
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    public /* bridge */ /* synthetic */ IHLogReporter setExtras(Pair[] pairArr) {
        return setExtras((Pair<String, ? extends Object>[]) pairArr);
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    public /* bridge */ /* synthetic */ IHLogReporter setLogFiles(List list) {
        return setLogFiles((List<? extends File>) list);
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    @NotNull
    public HLogReporter setExtras(@NotNull Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<String, ? extends Object> pair : pairs) {
            Object second = pair.getSecond();
            if (second != null) {
                this.extras.put((String) pair.getFirst(), second);
            } else {
                this.extras.remove(pair.getFirst());
            }
        }
        return this;
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    @NotNull
    public HLogReporter setLogFiles(@NotNull List<? extends File> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        List<? extends File> list = files;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (File file : list) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            arrayList.add(new LogFileInfo(name, file.length()));
        }
        this.logFiles = arrayList;
        Map<String, Object> map = this.extras;
        Iterator it = arrayList.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((LogFileInfo) it.next()).getSize();
        }
        map.put("log_files_size", Long.valueOf(size));
        return this;
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    @NotNull
    public HLogReporter setPushData(long traceId, @NotNull String targetPkg, @Nullable Object pushData) {
        Intrinsics.checkNotNullParameter(targetPkg, "targetPkg");
        this.traceId = traceId;
        this.targetPkg = targetPkg;
        this.pushData = pushData;
        return this;
    }

    @Override // com.oplus.utrace.hlog.IHLogReporter
    @NotNull
    public HLogReporter setPushData(@NotNull PushData pushData) {
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        return setPushData(pushData.getTraceId(), pushData.getTracePkg(), (Object) pushData);
    }
}
