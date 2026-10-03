package com.oplus.utrace.hlog;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.heytap.log.Logger;
import com.oplus.aiunit.vision.d14;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oplus.utrace.hlog.upload.HLogHandlerPushCollectFile;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.lib.PackageNames;
import com.oplus.utrace.sdk.IUploadListener;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UtilsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\nH\u0002J*\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0&2\u0006\u0010'\u001a\u00020(J$\u0010)\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0&H\u0002J\u0016\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0-H\u0002J\u0006\u0010.\u001a\u00020\nJ\b\u0010/\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/oplus/utrace/hlog/HLogUploaderTask;", "Landroid/os/Handler$Callback;", "context", "Landroid/content/Context;", "handler", "Landroid/os/Handler;", "pushData", "Lcom/oplus/utrace/hlog/PushData;", "onFinish", "Lkotlin/Function1;", "", "(Landroid/content/Context;Landroid/os/Handler;Lcom/oplus/utrace/hlog/PushData;Lkotlin/jvm/functions/Function1;)V", "logFilePath", "", "logPrefix", "state", "Lcom/oplus/utrace/hlog/UploadState;", "targetPkgs", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "checkIfUpload", "checkUploadFlag", "Lcom/oplus/utrace/hlog/UploadFlag;", "pkg", "copyLogFile", "fileName", "parcelFd", "Landroid/os/ParcelFileDescriptor;", "doUpload", "finishInThread", "handleMessage", "msg", "Landroid/os/Message;", "onUploadFinishImpl", HLogFilesCollector.METHOD_RECV_FILES, "targetPkg", "fds", "", "reporter", "Lcom/oplus/utrace/hlog/HLogReporter;", "receiveLogFilesInThread", "sendBroadcasts", "", "collectFailList", "", TextEntity.ELLIPSIZE_START, "startInThread", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHLogUploaderTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HLogUploaderTask.kt\ncom/oplus/utrace/hlog/HLogUploaderTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,424:1\n819#2:425\n847#2,2:426\n1855#2,2:428\n1855#2,2:434\n1774#2,4:438\n1855#2,2:449\n215#3,2:430\n215#3,2:432\n215#3,2:436\n483#4,7:442\n*S KotlinDebug\n*F\n+ 1 HLogUploaderTask.kt\ncom/oplus/utrace/hlog/HLogUploaderTask\n*L\n98#1:425\n98#1:426,2\n100#1:428,2\n182#1:434,2\n316#1:438,4\n251#1:449,2\n114#1:430,2\n130#1:432,2\n288#1:436,2\n325#1:442,7\n*E\n"})
public final class HLogUploaderTask implements Handler.Callback {

    @NotNull
    private final Context context;

    @Nullable
    private final Handler handler;

    @NotNull
    private final String logFilePath;

    @NotNull
    private final String logPrefix;

    @NotNull
    private final Function1<PushData, Unit> onFinish;

    @NotNull
    private final PushData pushData;

    @NotNull
    private UploadState state;

    @NotNull
    private final HashMap<String, Boolean> targetPkgs;

    /* JADX WARN: Multi-variable type inference failed */
    public HLogUploaderTask(@NotNull Context context, @Nullable Handler handler, @NotNull PushData pushData, @NotNull Function1<? super PushData, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        Intrinsics.checkNotNullParameter(function1, "onFinish");
        this.context = context;
        this.handler = handler;
        this.pushData = pushData;
        this.onFinish = function1;
        this.state = UploadState.INIT;
        this.logFilePath = HLogUtils.defaultLogUploadPath(context, pushData.getTraceId());
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(pushData.getTraceId());
        sb.append(']');
        this.logPrefix = sb.toString();
        this.targetPkgs = new HashMap<>();
    }

    private final boolean checkIfUpload() {
        int i;
        Collection<Boolean> collectionValues = this.targetPkgs.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "targetPkgs.values");
        Collection<Boolean> collection = collectionValues;
        if (collection.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = collection.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((!((Boolean) it.next()).booleanValue()) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i == 0) {
            doUpload();
            return true;
        }
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(this.logPrefix);
        sb.append(" 还有其他跨进程收集日志未返回，等待其他进程收集结果，collect file upload,checkIfUpload() pendingCount=");
        sb.append(i);
        sb.append(" pending=");
        HashMap<String, Boolean> map = this.targetPkgs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (!entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        sb.append(linkedHashMap.keySet());
        logs.d("UTrace.Sdk.HLogUploaderTask", sb.toString());
        return false;
    }

    private final UploadFlag checkUploadFlag(String pkg) {
        if (ArraysKt.contains(PackageNames.INSTANCE.getUTRACE_DEMO_APPS(), pkg)) {
            Object orDefault = this.pushData.getExtras().getOrDefault(HLogConst.KEY_EXTRAS_UPLOAD_FLAG, 0);
            Integer num = orDefault instanceof Integer ? (Integer) orDefault : null;
            if (num != null) {
                UploadFlag uploadFlagFrom = UploadFlag.INSTANCE.from(num.intValue());
                if (uploadFlagFrom != null) {
                    return uploadFlagFrom;
                }
            }
        }
        return HLogUtils.INSTANCE.getDefaultUploadFlags$utrace_sdk_log_logRelease().getOrDefault(pkg, UploadFlag.CAN_UPLOAD);
    }

    private final void copyLogFile(String fileName, ParcelFileDescriptor parcelFd) throws Throwable {
        String str;
        Object obj;
        Logs logs = Logs.INSTANCE;
        logs.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " 开始本次日志文件的拷贝， copyLogFile() fileName=" + fileName);
        if (StringsKt.contains$default(fileName, HLogConst.HLOG_BUSINESS_NAME, false, 2, (Object) null)) {
            str = fileName;
        } else {
            str = "ums_" + fileName;
        }
        File file = new File(this.logFilePath, str);
        try {
            Result.Companion companion = Result.Companion;
            logs.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " copyLogFile() fileName=" + fileName + "->" + str + " total=" + UtilsKt.copyFileWithFD(file, parcelFd));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return;
        }
        Logs.INSTANCE.w("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " copyLogFile() fileName=" + fileName + " exception=" + th2, th2);
        throw th2;
    }

    private final void doUpload() {
        List<? extends File> listEmptyList;
        final String str = "[pkg=" + this.pushData.getTracePkg() + ",traceId=" + this.pushData.getTraceId() + ']';
        Logs logs = Logs.INSTANCE;
        logs.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + str + " 检测状态是否可以上传 collect file upload,doUpload() pushData=" + this.pushData + " state=" + this.state);
        if (this.state != UploadState.STARTED) {
            IHLogReporter reporter = this.pushData.getReporter();
            if (reporter != null) {
                reporter.report(IHLogReporter.Codes.RecvFds_150005_uploader_error, "expected STARTED, statue=" + this.state);
                return;
            }
            return;
        }
        this.state = UploadState.UPLOADING;
        IHLogReporter reporter2 = this.pushData.getReporter();
        if (reporter2 != null) {
            File[] fileArrListFiles = new File(this.logFilePath).listFiles();
            if (fileArrListFiles == null || (listEmptyList = ArraysKt.toList(fileArrListFiles)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            reporter2.setLogFiles(listEmptyList);
        }
        final Logger loggerBuildLogger = HLogUtils.buildLogger(this.context, HLogConfigHelper.INSTANCE.getDeviceIds$utrace_sdk_log_logRelease(), this.logFilePath);
        if (loggerBuildLogger == null) {
            logs.w("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " doUpload() logger is null");
            IHLogReporter reporter3 = this.pushData.getReporter();
            if (reporter3 != null) {
                reporter3.report(IHLogReporter.Codes.UploadSvc_160003_hlog_error, "logger==null");
                return;
            }
            return;
        }
        new HLogUploadWrapper(loggerBuildLogger);
        logs.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + str + " 开始发起日志上传，collect file upload real start upload, doUpload invoke logger.upload() with pushData = " + this.pushData);
        new HLogUploadWrapper(loggerBuildLogger).uploadFor(this.pushData.getRawContent()).listenBy(new IUploadListener() { // from class: com.oplus.utrace.hlog.HLogUploaderTask.doUpload.1
            private final void exit() {
                Object obj;
                Logger logger = loggerBuildLogger;
                try {
                    Result.Companion companion = Result.Companion;
                    logger.quit();
                    logger.exit();
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                HLogUploaderTask hLogUploaderTask = HLogUploaderTask.this;
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    Log.i("UTrace.Sdk.HLogUploaderTask", hLogUploaderTask.logPrefix + " onUploadFinish() exception=" + th2);
                }
                HLogUploaderTask.this.onUploadFinishImpl();
            }

            @Override // com.oplus.utrace.sdk.IUploadListener
            public void onUploadFail(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IHLogReporter reporter4 = HLogUploaderTask.this.pushData.getReporter();
                if (reporter4 != null) {
                    reporter4.report(IHLogReporter.Codes.UploadSvc_160004_upload_fail, message);
                }
                Logs.INSTANCE.i("UTrace.Sdk.HLogUploaderTask", HLogUploaderTask.this.logPrefix + str + " 日志上传失败,doUpload upload fail,message=" + message);
                exit();
            }

            @Override // com.oplus.utrace.sdk.IUploadListener
            public void onUploadSuccess(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IHLogReporter reporter4 = HLogUploaderTask.this.pushData.getReporter();
                if (reporter4 != null) {
                    reporter4.report(IHLogReporter.Codes.UploadSvc_160000_upload_succ, "upload success");
                }
                Logs.INSTANCE.i("UTrace.Sdk.HLogUploaderTask", HLogUploaderTask.this.logPrefix + str + " ,日志上传成功,doUpload upload success,message=" + message);
                exit();
            }
        }).startUpload();
    }

    private final void finishInThread() {
        Logs.INSTANCE.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " finishInThread() pushData=" + this.pushData + " state=" + this.state);
        this.state = UploadState.FIN;
        FilesKt.deleteRecursively(new File(this.logFilePath));
        this.onFinish.invoke(this.pushData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessage$lambda$12(HLogUploaderTask hLogUploaderTask) {
        Intrinsics.checkNotNullParameter(hLogUploaderTask, "this$0");
        if (hLogUploaderTask.checkIfUpload()) {
            return;
        }
        hLogUploaderTask.finishInThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessage$lambda$13(HLogUploaderTask hLogUploaderTask) {
        Intrinsics.checkNotNullParameter(hLogUploaderTask, "this$0");
        hLogUploaderTask.finishInThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUploadFinishImpl() {
        Handler handler;
        Logs.INSTANCE.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " onUploadFinishImpl()");
        SafeHandlerThread commonThread = TraceUtil.INSTANCE.getCommonThread();
        if (commonThread != null && (handler = commonThread.getHandler()) != null) {
            handler.removeMessages(202);
        }
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: com.oplus.utrace.hlog.m
                @Override // java.lang.Runnable
                public final void run() {
                    HLogUploaderTask.onUploadFinishImpl$lambda$24(this.i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUploadFinishImpl$lambda$24(HLogUploaderTask hLogUploaderTask) {
        Intrinsics.checkNotNullParameter(hLogUploaderTask, "this$0");
        hLogUploaderTask.finishInThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void receiveLogFiles$lambda$16(HLogUploaderTask hLogUploaderTask, String str, Map map) {
        Intrinsics.checkNotNullParameter(hLogUploaderTask, "this$0");
        Intrinsics.checkNotNullParameter(str, "$targetPkg");
        Intrinsics.checkNotNullParameter(map, "$fds");
        hLogUploaderTask.receiveLogFilesInThread(str, map);
        for (ParcelFileDescriptor parcelFileDescriptor : map.values()) {
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

    private final void receiveLogFilesInThread(String targetPkg, Map<String, ? extends ParcelFileDescriptor> fds) {
        SafeHandlerThread commonThread;
        Handler handler;
        IHLogReporter extras;
        Object obj;
        String str = "[pkg=" + targetPkg + ",traceId=" + this.pushData.getTraceId() + ",”收到跨进程回调的日志“]";
        Logs.INSTANCE.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + str + " collect file upload,receiveLogFilesInThread() pkg=" + targetPkg + " fds.size=" + fds.size() + " state=" + this.state);
        if (this.state != UploadState.STARTED) {
            IHLogReporter reporter = this.pushData.getReporter();
            if (reporter != null) {
                reporter.report(IHLogReporter.Codes.RecvFds_150005_uploader_error, "expected STARTED, state=" + this.state);
                return;
            }
            return;
        }
        if (!this.targetPkgs.containsKey(targetPkg)) {
            IHLogReporter reporter2 = this.pushData.getReporter();
            if (reporter2 != null) {
                reporter2.report(IHLogReporter.Codes.RecvFds_150005_uploader_error, "unexpected targetPkg=" + targetPkg + ", expected=" + this.targetPkgs.keySet());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Throwable th = null;
        for (Map.Entry<String, ? extends ParcelFileDescriptor> entry : fds.entrySet()) {
            String key = entry.getKey();
            ParcelFileDescriptor value = entry.getValue();
            try {
                Result.Companion companion = Result.Companion;
                copyLogFile(key, value);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            Throwable th3 = Result.exceptionOrNull-impl(obj);
            if (th3 != null) {
                Logs.INSTANCE.w("UTrace.Sdk.HLogUploaderTask", this.logPrefix + str + " collect file upload,receiveLogFilesInThread() copyLogFile exception=" + th3, th3);
                if (th == null) {
                    th = th3;
                }
                arrayList.add(key);
            }
        }
        this.targetPkgs.put(targetPkg, Boolean.TRUE);
        if (!arrayList.isEmpty()) {
            String str2 = "copy log files fails: " + arrayList.size() + '/' + fds.size() + ", exception=" + th;
            IHLogReporter reporter3 = this.pushData.getReporter();
            if (reporter3 != null && (extras = reporter3.setExtras(TuplesKt.to("copy_failed_names", arrayList))) != null) {
                extras.report(IHLogReporter.Codes.RecvFds_150006_copy_error, str2);
            }
        }
        if (!checkIfUpload() || (commonThread = TraceUtil.INSTANCE.getCommonThread()) == null || (handler = commonThread.getHandler()) == null) {
            return;
        }
        handler.removeMessages(201);
    }

    private final int sendBroadcasts(List<String> collectFailList) {
        IHLogReporter extras;
        Object obj;
        Intent intent = new Intent(HLogConst.PUSH_TO_UPLOAD_ACTION);
        intent.putExtra(HLogConst.KEY_BUSINESS, this.pushData.getBusiness());
        intent.putExtra("traceId", this.pushData.getTraceId());
        intent.putExtra("startTime", this.pushData.getBeginTime());
        intent.putExtra("endTime", this.pushData.getEndTime());
        intent.putExtra(HLogConst.KEY_USE_WIFI, this.pushData.getUseWifi());
        intent.putExtra(HLogConst.KEY_MAX_FILE_SIZE, HLogUploaderTaskKt.DEFAULT_MAX_FILE_SIZE);
        intent.putExtra(HLogConst.KEY_SEND_FROM, this.context.getPackageName());
        intent.putExtra(HLogConst.KEY_TRACE_PKG, this.pushData.getTracePkg());
        intent.putExtra(HLogConst.KEY_RAW_CONTENT, this.pushData.getRawContent());
        if (ArraysKt.contains(PackageNames.INSTANCE.getUTRACE_DEMO_APPS(), this.context.getPackageName())) {
            intent.putExtra(HLogConst.KEY_EXTRAS_SIM_FD_TIMEOUT, Intrinsics.areEqual(this.pushData.getExtras().get(HLogConst.KEY_EXTRAS_SIM_FD_TIMEOUT), Boolean.TRUE));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        Throwable th = null;
        for (String str : collectFailList) {
            UploadFlag uploadFlagCheckUploadFlag = checkUploadFlag(str);
            Logs logs = Logs.INSTANCE;
            logs.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " sendBroadcasts() packageName=" + str + " uploadFlag=" + uploadFlagCheckUploadFlag);
            UploadFlag uploadFlag = UploadFlag.NEED_PROXY;
            if (uploadFlagCheckUploadFlag != uploadFlag) {
                this.targetPkgs.put(str, Boolean.TRUE);
            }
            if (uploadFlagCheckUploadFlag == UploadFlag.NO_UPLOAD) {
                arrayList.add(str);
            } else {
                Intent intent2 = new Intent(intent);
                intent2.putExtra(HLogConst.KEY_UPLOAD_FLAG, uploadFlagCheckUploadFlag.getValue());
                intent2.setPackage(str);
                try {
                    Result.Companion companion = Result.Companion;
                    logs.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " 该入口通过广播继续收集日志，sendBroadcasts() packageName=" + str + " context=" + this.context + " intent=" + intent2 + " uploadFlag=" + uploadFlagCheckUploadFlag);
                    try {
                        this.context.sendOrderedBroadcast(intent2, null);
                        arrayList2.add(str);
                        if (uploadFlagCheckUploadFlag == uploadFlag) {
                            i++;
                        }
                        obj = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                Throwable th4 = Result.exceptionOrNull-impl(obj);
                if (th4 != null) {
                    Logs.INSTANCE.w("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " sendBroadcasts exception=" + th4);
                    if (th == null) {
                        th = th4;
                    }
                }
            }
        }
        IHLogReporter reporter = this.pushData.getReporter();
        if (reporter != null && (extras = reporter.setExtras(TuplesKt.to("NO_UPLOAD", arrayList), TuplesKt.to("broadcast", arrayList2), TuplesKt.to("exception", th))) != null) {
            extras.report(IHLogReporter.Codes.Start_120000_broadcast, "broadcast " + arrayList2.size());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(HLogUploaderTask hLogUploaderTask) {
        Intrinsics.checkNotNullParameter(hLogUploaderTask, "this$0");
        hLogUploaderTask.startInThread();
    }

    private final void startInThread() {
        Handler handler;
        Logs.INSTANCE.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " startInThread() pushData=" + this.pushData + " state=" + this.state);
        if (this.state != UploadState.INIT) {
            IHLogReporter reporter = this.pushData.getReporter();
            if (reporter != null) {
                reporter.report(IHLogReporter.Codes.Start_120005_uploader_error, "expect INIT. state=" + this.state);
                return;
            }
            return;
        }
        this.state = UploadState.STARTED;
        List listSplit$default = StringsKt.split$default(this.pushData.getTracePkg(), new String[]{d14.COMMA_REGEX}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.targetPkgs.put((String) it.next(), Boolean.FALSE);
        }
        Logs.INSTANCE.i("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " startInThread() targetPkgs=" + this.targetPkgs.keySet());
        ArrayList arrayList2 = new ArrayList();
        new HLogHandlerPushCollectFile().startCollectAppUploadHLog(this.context, this.pushData, this.targetPkgs, arrayList2);
        Iterator<Map.Entry<String, Boolean>> it2 = this.targetPkgs.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (!arrayList2.contains(key)) {
                this.targetPkgs.put(key, Boolean.TRUE);
            }
        }
        if (arrayList2.isEmpty()) {
            Logs.INSTANCE.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " 日志已通过provider收集完成,push collect and upload finish");
            IHLogReporter reporter2 = this.pushData.getReporter();
            if (reporter2 != null) {
                reporter2.report(IHLogReporter.Codes.Proxy_180002_result, "push collect and upload finish");
                return;
            }
            return;
        }
        int iSendBroadcasts = sendBroadcasts(arrayList2);
        Iterator<Map.Entry<String, Boolean>> it3 = this.targetPkgs.entrySet().iterator();
        while (it3.hasNext()) {
            if (checkUploadFlag(it3.next().getKey()) == UploadFlag.NEED_PROXY) {
                iSendBroadcasts++;
            }
        }
        Logs.INSTANCE.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " startInThread() sendBroadcasts returns " + iSendBroadcasts);
        if (iSendBroadcasts == 0) {
            finishInThread();
            return;
        }
        SafeHandlerThread commonThread = TraceUtil.INSTANCE.getCommonThread();
        if (commonThread == null || (handler = commonThread.getHandler()) == null) {
            return;
        }
        handler.removeMessages(201);
        handler.sendEmptyMessageDelayed(201, 30000L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 201) {
            Logs.INSTANCE.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " handleMessage() MSG_UPLOAD");
            Handler handler = this.handler;
            if (handler == null) {
                return true;
            }
            handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.j
                @Override // java.lang.Runnable
                public final void run() {
                    HLogUploaderTask.handleMessage$lambda$12(this.i);
                }
            });
            return true;
        }
        if (i != 202) {
            return true;
        }
        Logs.INSTANCE.d("UTrace.Sdk.HLogUploaderTask", this.logPrefix + " handleMessage() MSG_FINISH");
        Handler handler2 = this.handler;
        if (handler2 == null) {
            return true;
        }
        handler2.post(new Runnable() { // from class: com.oplus.utrace.hlog.k
            @Override // java.lang.Runnable
            public final void run() {
                HLogUploaderTask.handleMessage$lambda$13(this.i);
            }
        });
        return true;
    }

    public final void receiveLogFiles(@NotNull final String targetPkg, @NotNull final Map<String, ? extends ParcelFileDescriptor> fds, @NotNull HLogReporter reporter) {
        Intrinsics.checkNotNullParameter(targetPkg, "targetPkg");
        Intrinsics.checkNotNullParameter(fds, "fds");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        PushData pushData = this.pushData;
        pushData.setReporter(reporter.mergeTo(pushData.getReporter()).setExtras(TuplesKt.to("recv_fds", fds.keySet())));
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.n
                @Override // java.lang.Runnable
                public final void run() {
                    HLogUploaderTask.receiveLogFiles$lambda$16(this.i, targetPkg, fds);
                }
            });
        }
    }

    public final void start() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.l
                @Override // java.lang.Runnable
                public final void run() {
                    HLogUploaderTask.start$lambda$0(this.i);
                }
            });
        }
    }
}
