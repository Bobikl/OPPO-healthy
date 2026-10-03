package com.oplus.utrace.hlog;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.statistics.OplusTrack;
import com.oplus.utrace.hlog.upload.HLogFileHelper;
import com.oplus.utrace.hlog.upload.HLogUploadHelper;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.Providers;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.UtilsKt;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002J1\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016JO\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\"\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00122\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010'\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0002J;\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010)¨\u0006+"}, d2 = {"Lcom/oplus/utrace/hlog/HLogFilesCollector;", "Landroid/content/ContentProvider;", "()V", "call", "Landroid/os/Bundle;", "authority", "", ParserTag.TAG_METHOD, "arg", BridgeConstant.KEY_EXTRAS, "delegateReport", "", "delete", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "extractLogFilesFD", "", "Landroid/os/ParcelFileDescriptor;", "bundle", "reporter", "Lcom/oplus/utrace/hlog/HLogReporter;", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "startCollectLogFileAndCallUmsLogUpload", "extraBundle", "startUploadHLog", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogFilesCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogFilesCollector.kt\ncom/oplus/utrace/hlog/HLogFilesCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,437:1\n1#2:438\n12744#3,2:439\n32#4,2:441\n*S KotlinDebug\n*F\n+ 1 HLogFilesCollector.kt\ncom/oplus/utrace/hlog/HLogFilesCollector\n*L\n390#1:439,2\n398#1:441,2\n*E\n"})
public final class HLogFilesCollector extends ContentProvider {
    public static final int CODE_UPLOAD_FILE_FAIL = -2;
    public static final int CODE_UPLOAD_FILE_SUCCESS = 200;

    @NotNull
    private static final String KEY_APP_ID = "key_app_id";

    @NotNull
    private static final String KEY_DATA_MAP = "key_data_map";

    @NotNull
    private static final String KEY_EVENT_ID = "key_event_id";

    @NotNull
    public static final String KEY_FILES = "logFiles";

    @NotNull
    private static final String KEY_LOG_TAG = "key_log_tag";

    @NotNull
    public static final String KEY_UPLOAD_FILE_RESULT_MSG = "msg";

    @NotNull
    public static final String KEY_UPLOAD_FILE_RESULT_RESULT_CODE = "result";

    @NotNull
    public static final String METHOD_COLLECT_PUSH_LOG_FILE = "collect_h_log";

    @NotNull
    public static final String METHOD_DELEGATE_DCS_REPORT = "delegateDcsReport";

    @NotNull
    public static final String METHOD_PULL_LOG_FILE = "upload_h_log";

    @NotNull
    public static final String METHOD_RECV_FILES = "receiveLogFiles";

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogFiles";

    @Nullable
    private static Uri collectorUri;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<Long, HLogUploaderTask> uploaders = new HashMap<>();

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070%H\u0000¢\u0006\u0002\b&J\b\u0010'\u001a\u0004\u0018\u00010\u0014J\u0016\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002J2\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00072\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002000%2\u0006\u00101\u001a\u000202J!\u00103\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u00020\u0007H\u0000¢\u0006\u0002\b5R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R*\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/oplus/utrace/hlog/HLogFilesCollector$Companion;", "", "()V", "CODE_UPLOAD_FILE_FAIL", "", "CODE_UPLOAD_FILE_SUCCESS", "KEY_APP_ID", "", "KEY_DATA_MAP", "KEY_EVENT_ID", "KEY_FILES", "KEY_LOG_TAG", "KEY_UPLOAD_FILE_RESULT_MSG", "KEY_UPLOAD_FILE_RESULT_RESULT_CODE", "METHOD_COLLECT_PUSH_LOG_FILE", "METHOD_DELEGATE_DCS_REPORT", "METHOD_PULL_LOG_FILE", "METHOD_RECV_FILES", "TAG", "collectorUri", "Landroid/net/Uri;", "isLogEnabled", "", "()Z", "uploaders", "Ljava/util/HashMap;", "", "Lcom/oplus/utrace/hlog/HLogUploaderTask;", "Lkotlin/collections/HashMap;", "delegateReport", "", "context", "Landroid/content/Context;", "appId", "logTag", "eventId", "logMap", "", "delegateReport$utrace_sdk_log_logRelease", "getUmsHLogFileUploadUri", "processMessage", "pushData", "Lcom/oplus/utrace/hlog/PushData;", "processMessageInThread", HLogFilesCollector.METHOD_RECV_FILES, "traceId", "targetPkg", "fds", "Landroid/os/ParcelFileDescriptor;", "reporter", "Lcom/oplus/utrace/hlog/HLogReporter;", "resolveLogCollectorUri", "suggestPackage", "resolveLogCollectorUri$utrace_sdk_log_logRelease", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHLogFilesCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogFilesCollector.kt\ncom/oplus/utrace/hlog/HLogFilesCollector$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,437:1\n1855#2,2:438\n1549#2:443\n1620#2,3:444\n3792#3:440\n4307#3,2:441\n215#4,2:447\n*S KotlinDebug\n*F\n+ 1 HLogFilesCollector.kt\ncom/oplus/utrace/hlog/HLogFilesCollector$Companion\n*L\n135#1:438,2\n150#1:443\n150#1:444,3\n148#1:440\n148#1:441,2\n179#1:447,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void processMessage$lambda$0(Context context, PushData pushData) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(pushData, "$pushData");
            Companion companion = HLogFilesCollector.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            companion.processMessageInThread(context, pushData);
        }

        private final void processMessageInThread(Context context, PushData pushData) {
            Logs logs = Logs.INSTANCE;
            logs.d(HLogFilesCollector.TAG, '[' + pushData.getTraceId() + "] processMessageInThread() pushData=" + pushData);
            long traceId = pushData.getTraceId();
            if (HLogFilesCollector.uploaders.containsKey(Long.valueOf(traceId))) {
                logs.i(HLogFilesCollector.TAG, '[' + pushData.getTraceId() + "] processMessageInThread() duplicated traceId=" + traceId);
                IHLogReporter reporter = pushData.getReporter();
                if (reporter != null) {
                    IHLogReporter.DefaultImpls.report$default(reporter, IHLogReporter.Codes.Start_120004_duplicated, null, 2, null);
                    return;
                }
                return;
            }
            SafeHandlerThread thread$utrace_sdk_log_logRelease = HLogUtils.INSTANCE.getThread$utrace_sdk_log_logRelease();
            HLogUploaderTask hLogUploaderTask = new HLogUploaderTask(context, thread$utrace_sdk_log_logRelease != null ? thread$utrace_sdk_log_logRelease.getHandler() : null, pushData, new Function1<PushData, Unit>() { // from class: com.oplus.utrace.hlog.HLogFilesCollector$Companion$processMessageInThread$1
                public final void invoke(@NotNull PushData pushData2) {
                    Intrinsics.checkNotNullParameter(pushData2, "it");
                    HLogFilesCollector.uploaders.remove(Long.valueOf(pushData2.getTraceId()));
                    Logs.INSTANCE.d("UTrace.Sdk.HLogFiles", '[' + pushData2.getTraceId() + "] processMessageInThread() traceId=" + pushData2.getTraceId() + " is finished");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PushData) obj);
                    return Unit.INSTANCE;
                }
            });
            HLogFilesCollector.uploaders.put(Long.valueOf(traceId), hLogUploaderTask);
            logs.d(HLogFilesCollector.TAG, '[' + traceId + "] processMessageInThread() traceId=" + traceId + " is cached");
            hLogUploaderTask.start();
        }

        public static /* synthetic */ Uri resolveLogCollectorUri$utrace_sdk_log_logRelease$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.resolveLogCollectorUri$utrace_sdk_log_logRelease(context, str);
        }

        public final void delegateReport$utrace_sdk_log_logRelease(@NotNull Context context, @NotNull String appId, @NotNull String logTag, @NotNull String eventId, @NotNull Map<String, String> logMap) {
            Object obj;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(logTag, "logTag");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(logMap, "logMap");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : logMap.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().also {\n    …\n            }.toString()");
            Bundle bundle = new Bundle();
            bundle.putString(HLogFilesCollector.KEY_APP_ID, appId);
            bundle.putString(HLogFilesCollector.KEY_LOG_TAG, logTag);
            bundle.putString(HLogFilesCollector.KEY_EVENT_ID, eventId);
            bundle.putString(HLogFilesCollector.KEY_DATA_MAP, string);
            try {
                Result.Companion companion = Result.Companion;
                Uri uri = null;
                Uri uriResolveLogCollectorUri$utrace_sdk_log_logRelease$default = resolveLogCollectorUri$utrace_sdk_log_logRelease$default(this, context, null, 2, null);
                if (uriResolveLogCollectorUri$utrace_sdk_log_logRelease$default != null) {
                    Providers.unstableProviderCall$default(Providers.INSTANCE, context, uriResolveLogCollectorUri$utrace_sdk_log_logRelease$default, HLogFilesCollector.METHOD_DELEGATE_DCS_REPORT, null, bundle, 8, null);
                    uri = uriResolveLogCollectorUri$utrace_sdk_log_logRelease$default;
                }
                obj = Result.constructor-impl(uri);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.w(HLogFilesCollector.TAG, "delegateReport() provider call exception=" + th2, th2);
            }
        }

        @Nullable
        public final Uri getUmsHLogFileUploadUri() {
            try {
                Result.Companion companion = Result.Companion;
                return Uri.parse("content://com.oplus.pantanal.ums.hlogcollector");
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
                return null;
            }
        }

        public final boolean isLogEnabled() {
            return HLogConfigHelper.INSTANCE.isLogEnabled$utrace_sdk_log_logRelease();
        }

        public final void processMessage(@NotNull final Context context, @NotNull final PushData pushData) {
            Handler handler;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pushData, "pushData");
            Logs logs = Logs.INSTANCE;
            logs.i(HLogFilesCollector.TAG, '[' + pushData.getTraceId() + "] processMessage() pushData=" + pushData + " isLogEnabled=" + isLogEnabled());
            HLogReporter pushData2 = new HLogReporter().setPushData(pushData);
            pushData.setReporter(pushData2);
            if (!isLogEnabled()) {
                pushData2.report(IHLogReporter.Codes.Start_120001_hlog_disabled, "isLogEnabled=false");
                return;
            }
            if (!StringsKt.isBlank(pushData.getTracePkg())) {
                SafeHandlerThread thread$utrace_sdk_log_logRelease = HLogUtils.INSTANCE.getThread$utrace_sdk_log_logRelease();
                if (thread$utrace_sdk_log_logRelease != null && (handler = thread$utrace_sdk_log_logRelease.getHandler()) != null) {
                    handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            HLogFilesCollector.Companion.processMessage$lambda$0(context, pushData);
                        }
                    });
                }
                IHLogReporter.DefaultImpls.report$default(pushData2, IHLogReporter.Codes.Start_120003_enqueue, null, 2, null);
                return;
            }
            logs.i(HLogFilesCollector.TAG, '[' + pushData.getTraceId() + "] processMessage() tracePkg is blank. pushData=" + pushData);
            pushData2.report(IHLogReporter.Codes.Start_120002_invalid_message, "targetPkg is blank");
        }

        public final void receiveLogFiles(long traceId, @NotNull String targetPkg, @NotNull Map<String, ? extends ParcelFileDescriptor> fds, @NotNull HLogReporter reporter) {
            Unit unit;
            Intrinsics.checkNotNullParameter(targetPkg, "targetPkg");
            Intrinsics.checkNotNullParameter(fds, "fds");
            Intrinsics.checkNotNullParameter(reporter, "reporter");
            HLogUploaderTask hLogUploaderTask = (HLogUploaderTask) HLogFilesCollector.uploaders.get(Long.valueOf(traceId));
            if (hLogUploaderTask != null) {
                hLogUploaderTask.receiveLogFiles(targetPkg, fds, reporter);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                Logs.INSTANCE.d(HLogFilesCollector.TAG, '[' + traceId + "] collect file upload,receiveLogFiles() no uploaders found");
                IHLogReporter.DefaultImpls.report$default(reporter, IHLogReporter.Codes.RecvFds_150004_no_uploader, null, 2, null);
                for (ParcelFileDescriptor parcelFileDescriptor : fds.values()) {
                    try {
                        Result.Companion companion = Result.Companion;
                        parcelFileDescriptor.close();
                        Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Result.constructor-impl(ResultKt.createFailure(th));
                    }
                }
            }
        }

        @Nullable
        public final Uri resolveLogCollectorUri$utrace_sdk_log_logRelease(@NotNull Context context, @NotNull String suggestPackage) {
            Uri uriResolveUriWithComponent;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(suggestPackage, "suggestPackage");
            if (HLogFilesCollector.collectorUri == null) {
                String[] strArr = {suggestPackage, "com.oplus.utrace", "com.oplus.pantanal.ums"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    String str = strArr[i];
                    if (!StringsKt.isBlank(str)) {
                        arrayList.add(str);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ComponentName((String) it.next(), HLogFilesCollector.class.getName()));
                }
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        uriResolveUriWithComponent = null;
                        break;
                    }
                    uriResolveUriWithComponent = Providers.INSTANCE.resolveUriWithComponent(context, (ComponentName) it2.next(), false);
                } while (uriResolveUriWithComponent == null);
                Logs.INSTANCE.i(HLogFilesCollector.TAG, "resolveLogCollectorUri() suggestPackage=" + suggestPackage + " result=" + uriResolveUriWithComponent);
                HLogFilesCollector.collectorUri = uriResolveUriWithComponent;
            }
            return HLogFilesCollector.collectorUri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void call$lambda$3(HLogFilesCollector hLogFilesCollector, Bundle bundle, HLogReporter hLogReporter, String str, Long l) {
        Intrinsics.checkNotNullParameter(hLogFilesCollector, "this$0");
        Intrinsics.checkNotNullParameter(hLogReporter, "$reporter");
        Map<String, ParcelFileDescriptor> mapExtractLogFilesFD = hLogFilesCollector.extractLogFilesFD(bundle, hLogReporter);
        if (str == null || !(!mapExtractLogFilesFD.isEmpty())) {
            return;
        }
        INSTANCE.receiveLogFiles(l.longValue(), str, mapExtractLogFilesFD, hLogReporter);
    }

    private final void delegateReport(Bundle extras) {
        if (extras == null) {
            Logs.INSTANCE.i(TAG, "delegateReport() invalid extras=null");
            return;
        }
        String string = extras.getString(KEY_APP_ID);
        String string2 = extras.getString(KEY_LOG_TAG);
        String string3 = extras.getString(KEY_EVENT_ID);
        String string4 = extras.getString(KEY_DATA_MAP);
        String[] strArr = {string, string2, string3, string4};
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
                break;
            }
        }
        if (z) {
            Logs.INSTANCE.i(TAG, "delegateReport() invalid data extras=" + extras);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (string4 != null) {
            JSONObject jSONObject = new JSONObject(string4);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "o.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNullExpressionValue(next, "k");
                String strOptString = jSONObject.optString(next);
                Intrinsics.checkNotNullExpressionValue(strOptString, "o.optString(k)");
                linkedHashMap.put(next, strOptString);
            }
        }
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.d(TAG, "delegateReport() with (" + string + ',' + string2 + ',' + string3 + ") and logMap=" + linkedHashMap);
        }
        Context context = getContext();
        if (context != null) {
            OplusTrack.onCommon(context, string, string2, string3, linkedHashMap);
        }
    }

    private final Map<String, ParcelFileDescriptor> extractLogFilesFD(Bundle bundle, HLogReporter reporter) {
        Object obj;
        Map<String, ParcelFileDescriptor> mapEmptyMap;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final ArrayList arrayList = new ArrayList();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(bundle != null ? bundle.getBundle(KEY_FILES) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, "extractLogFilesFD() exception=" + th2);
        } else {
            th2 = null;
        }
        Bundle bundle2 = (Bundle) (Result.isFailure-impl(obj) ? null : obj);
        if (bundle2 == null || (mapEmptyMap = UtilsKt.extractFdsFromBundle(bundle2, new Function2<String, Throwable, Unit>() { // from class: com.oplus.utrace.hlog.HLogFilesCollector$extractLogFilesFD$result$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((String) obj2, (Throwable) obj3);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str, @NotNull Throwable th3) {
                Intrinsics.checkNotNullParameter(str, "fileName");
                Intrinsics.checkNotNullParameter(th3, "exception");
                Ref.ObjectRef<Throwable> objectRef2 = objectRef;
                if (objectRef2.element == null) {
                    objectRef2.element = th3;
                }
                arrayList.add(str);
            }
        })) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if (mapEmptyMap.isEmpty() || (!arrayList.isEmpty()) || th2 != null || objectRef.element != null) {
            reporter.setExtras(TuplesKt.to("get_fd_failed_names", arrayList), TuplesKt.to("get_fd_names", mapEmptyMap.keySet()), TuplesKt.to("get_fds_exception", th2), TuplesKt.to("get_fd_exception", objectRef.element)).report(IHLogReporter.Codes.RecvFds_150003_extract_fds, "extracted " + mapEmptyMap.size() + ", failed " + arrayList.size());
        }
        return mapEmptyMap;
    }

    private final Bundle startCollectLogFileAndCallUmsLogUpload(Bundle extraBundle) {
        Object obj;
        Object obj2;
        Context applicationContext;
        try {
            Result.Companion companion = Result.Companion;
            Context context = getContext();
            obj = Result.constructor-impl((context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        String str = "";
        if (Result.isFailure-impl(obj)) {
            obj = "";
        }
        Logs logs = Logs.INSTANCE;
        logs.i(TAG, "collect file upload, pkgName = " + ((String) obj));
        Bundle bundle = new Bundle();
        int i = -2;
        if (extraBundle != null) {
            try {
                Intent intent = new Intent();
                intent.putExtras(extraBundle);
                boolean zOnActionUploadNeedProxy = HLogFileHelper.onActionUploadNeedProxy(TAG, UploadParams.INSTANCE.fromAndInitReporter(intent), bundle);
                logs.i(TAG, "collect file upload,collect result " + zOnActionUploadNeedProxy);
                if (zOnActionUploadNeedProxy) {
                    i = 200;
                }
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
            }
        } else {
            str = "call collect_h_log extras is null";
        }
        obj2 = Result.constructor-impl(Unit.INSTANCE);
        Throwable th3 = Result.exceptionOrNull-impl(obj2);
        if (th3 != null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "解析异常";
            }
            str = message;
        }
        bundle.putInt("result", i);
        bundle.putString("msg", str);
        return bundle;
    }

    private final Bundle startUploadHLog(Bundle bundle) {
        Object obj;
        Object obj2;
        Context applicationContext;
        try {
            Result.Companion companion = Result.Companion;
            Context context = getContext();
            obj = Result.constructor-impl((context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        String strOnActionUploadDirectUpload = "";
        if (Result.isFailure-impl(obj)) {
            obj = "";
        }
        Logs.INSTANCE.i(TAG, "collect file upload, pkgName = " + ((String) obj));
        Bundle bundle2 = new Bundle();
        int i = -2;
        if (bundle != null) {
            try {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                strOnActionUploadDirectUpload = new HLogUploadHelper().onActionUploadDirectUpload(UploadParams.INSTANCE.fromAndInitReporter(intent));
                if (strOnActionUploadDirectUpload.length() == 0) {
                    i = 200;
                }
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
            }
        } else {
            strOnActionUploadDirectUpload = "call collect_h_log extras is null";
        }
        obj2 = Result.constructor-impl(Unit.INSTANCE);
        Throwable th3 = Result.exceptionOrNull-impl(obj2);
        if (th3 != null) {
            String message = th3.getMessage();
            if (message == null) {
                message = "解析异常";
            }
            strOnActionUploadDirectUpload = message;
        }
        bundle2.putInt("result", i);
        bundle2.putString("msg", strOnActionUploadDirectUpload);
        return bundle2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String authority, @NotNull String method, @Nullable String arg, @Nullable final Bundle extras) {
        Object obj;
        Handler handler;
        Object obj2;
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
        final String callingPackage = getCallingPackage();
        Logs.INSTANCE.i(TAG, "call() callingPkg=" + callingPackage + " method=" + method + " arg=" + arg + " extras=" + extras + " authority=" + authority);
        final HLogReporter extras2 = new HLogReporter().setExtras(TuplesKt.to("calling_pkg", callingPackage), TuplesKt.to(ParserTag.TAG_METHOD, method));
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(extras != null ? Long.valueOf(extras.getLong("traceId")) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, "call() method=" + method + " exception=" + th2);
        } else {
            th2 = null;
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        final Long l = (Long) obj;
        switch (method.hashCode()) {
            case -1356166353:
                if (method.equals(METHOD_PULL_LOG_FILE)) {
                    return startUploadHLog(extras);
                }
                break;
            case -1114432616:
                if (method.equals(METHOD_COLLECT_PUSH_LOG_FILE)) {
                    return startCollectLogFileAndCallUmsLogUpload(extras);
                }
                break;
            case 186307990:
                if (method.equals(METHOD_RECV_FILES)) {
                    if (l != null) {
                        IHLogReporter.DefaultImpls.report$default(extras2.setPushData(l.longValue(), callingPackage == null ? "" : callingPackage, (Object) null), IHLogReporter.Codes.RecvFds_150002_enqueue, null, 2, null);
                        SafeHandlerThread thread$utrace_sdk_log_logRelease = HLogUtils.INSTANCE.getThread$utrace_sdk_log_logRelease();
                        if (thread$utrace_sdk_log_logRelease != null && (handler = thread$utrace_sdk_log_logRelease.getHandler()) != null) {
                            handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    HLogFilesCollector.call$lambda$3(this.i, extras, extras2, callingPackage, l);
                                }
                            });
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("message", "enqueued");
                        return bundle;
                    }
                    Logs.INSTANCE.w(TAG, "call() method=" + method + " traceId=null");
                    extras2.report(IHLogReporter.Codes.RecvFds_150001_invalid_call, "traceId==null");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("message", "traceId==null exception=" + th2);
                    return bundle2;
                }
                break;
            case 586825251:
                if (method.equals(METHOD_DELEGATE_DCS_REPORT)) {
                    try {
                        delegateReport(extras);
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                        break;
                    } catch (Throwable th3) {
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
                    }
                    Throwable th4 = Result.exceptionOrNull-impl(obj2);
                    if (th4 != null) {
                        Logs.INSTANCE.w(TAG, "call() method=" + method + " exception=" + th4);
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("message", "done");
                    return bundle3;
                }
                break;
        }
        Bundle bundle4 = new Bundle();
        bundle4.putString("message", "unknown method '" + method + '\'');
        return bundle4;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        return 0;
    }
}
