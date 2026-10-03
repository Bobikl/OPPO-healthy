package com.oplus.utrace.hlog.upload;

import android.os.ParcelFileDescriptor;
import com.oplus.utrace.hlog.HLogConfigHelper;
import com.oplus.utrace.hlog.HLogFilesCollector;
import com.oplus.utrace.hlog.HLogReporter;
import com.oplus.utrace.hlog.IHLogReporter;
import com.oplus.utrace.hlog.UploadParams;
import com.oplus.utrace.sdk.IULogger;
import com.oplus.utrace.sdk.IUploadListener;
import com.oplus.utrace.sdk.ULog;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.TraceUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J2\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/oplus/utrace/hlog/upload/HLogUploadHelper;", "", "()V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "logPrefix$delegate", "Lkotlin/Lazy;", "onActionUploadDirectUpload", "params", "Lcom/oplus/utrace/hlog/UploadParams;", "startUpload", "", "logger", "Lcom/oplus/utrace/sdk/IULogger;", "startUploadProxyLogFile", "traceId", "", "pkg", "fds", "", "Landroid/os/ParcelFileDescriptor;", "reporter", "Lcom/oplus/utrace/hlog/HLogReporter;", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogUploadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogUploadHelper.kt\ncom/oplus/utrace/hlog/upload/HLogUploadHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1549#2:122\n1620#2,3:123\n*S KotlinDebug\n*F\n+ 1 HLogUploadHelper.kt\ncom/oplus/utrace/hlog/upload/HLogUploadHelper\n*L\n69#1:122\n69#1:123,3\n*E\n"})
public final class HLogUploadHelper {

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogUploadHelper";

    @NotNull
    private final Lazy logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.hlog.upload.HLogUploadHelper$logPrefix$2
        {
            super(0);
        }

        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease(this.this$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLogPrefix() {
        return (String) this.logPrefix$delegate.getValue();
    }

    private final void startUpload(IULogger logger, final UploadParams params) {
        Logs.INSTANCE.i(TAG, getLogPrefix() + "[pkg=" + params.getPushData().getTracePkg() + ",traceId=" + params.getTraceId() + ",开始发起日志上传] collect file upload real start upload, onActionUploadDirectUpload invoke logger.upload() with uploadParams=" + params);
        logger.upload(params.getPushData().getRawContent(), new IUploadListener() { // from class: com.oplus.utrace.hlog.upload.HLogUploadHelper.startUpload.1
            @Override // com.oplus.utrace.sdk.IUploadListener
            public void onUploadFail(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IHLogReporter reporter = params.getReporter();
                if (reporter != null) {
                    reporter.report(IHLogReporter.Codes.Receiver_130004_upload_fail, message);
                }
                Logs.INSTANCE.i(HLogUploadHelper.TAG, this.getLogPrefix() + "[pkg=" + params.getPushData().getTracePkg() + ",traceId=" + params.getTraceId() + ",日志上传失败],onActionUploadDirectUpload upload fail,message=" + message);
            }

            @Override // com.oplus.utrace.sdk.IUploadListener
            public void onUploadSuccess(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IHLogReporter reporter = params.getReporter();
                if (reporter != null) {
                    reporter.report(IHLogReporter.Codes.Receiver_130000_upload_succ, message);
                }
                Logs.INSTANCE.i(HLogUploadHelper.TAG, this.getLogPrefix() + "[pkg=" + params.getPushData().getTracePkg() + ",traceId=" + params.getTraceId() + ",日志上传成功],onActionUploadDirectUpload upload success,message=" + message);
            }
        });
    }

    @NotNull
    public final String onActionUploadDirectUpload(@NotNull UploadParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (!HLogConfigHelper.INSTANCE.isLogEnabled$utrace_sdk_log_logRelease()) {
            Logs.INSTANCE.w(TAG, getLogPrefix() + "[pkg=" + params.getPushData().getTracePkg() + ",traceId=" + params.getTraceId() + ",本入口开关处于关闭状态] onActionUploadDirectUpload collect file upload，logEnabled is false");
            IHLogReporter reporter = params.getReporter();
            if (reporter == null) {
                return "hLog logEnabled is false";
            }
            reporter.report(IHLogReporter.Codes.Receiver_130002_disabled, "isLogEnabled=false");
            return "hLog logEnabled is false";
        }
        IULogger mLogger$utrace_sdk_log_logRelease = ULog.INSTANCE.getMLogger$utrace_sdk_log_logRelease();
        if (mLogger$utrace_sdk_log_logRelease == null) {
            Logs.INSTANCE.w(TAG, getLogPrefix() + "[pkg=" + params.getPushData().getTracePkg() + ",traceId=" + params.getTraceId() + ",本入口ULog.mLogger为空终止上传] onActionUploadDirectUpload collect file upload mLogger is null");
            IHLogReporter reporter2 = params.getReporter();
            if (reporter2 == null) {
                return "onActionUploadDirectUpload logger is null";
            }
            reporter2.report(IHLogReporter.Codes.Receiver_130002_disabled, "logger==null");
            return "onActionUploadDirectUpload logger is null";
        }
        Pair<List<File>, String> logFiles = HLogFileHelper.getLogFiles(TAG, params);
        List<? extends File> list = (List) logFiles.component1();
        String str = (String) logFiles.component2();
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(getLogPrefix());
        sb.append("[pkg=");
        sb.append(params.getPushData().getTracePkg());
        sb.append(",traceId=");
        sb.append(params.getTraceId());
        sb.append(",收集到的日志文件] collect file upload onActionUploadDirectUpload files=");
        List<? extends File> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getName());
        }
        sb.append(arrayList);
        sb.append(" msg=");
        sb.append(str);
        logs.d(TAG, sb.toString());
        IHLogReporter reporter3 = params.getReporter();
        if (reporter3 != null) {
            reporter3.setLogFiles(list);
        }
        startUpload(mLogger$utrace_sdk_log_logRelease, params);
        return "";
    }

    public final void startUploadProxyLogFile(long traceId, @NotNull String pkg, @NotNull Map<String, ? extends ParcelFileDescriptor> fds, @NotNull HLogReporter reporter) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(fds, "fds");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        HLogFilesCollector.INSTANCE.receiveLogFiles(traceId, pkg, fds, reporter);
    }
}
