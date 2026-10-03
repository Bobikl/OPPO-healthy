package com.oplus.utrace.hlog;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.heytap.log.HLog;
import com.heytap.log.ISimpleLog;
import com.heytap.log.Logger;
import com.heytap.log.uploader.UploadManager;
import com.oplus.aiunit.vision.gsi;
import com.oplus.aiunit.vision.hsi;
import com.oplus.aiunit.vision.rde;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.utrace.sdk.IULogger;
import com.oplus.utrace.sdk.IUploadListener;
import com.oplus.utrace.sdk.UTraceApp;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.SafeHandlerThread;
import com.oplus.utrace.utils.TraceUtil;
import com.oplus.utrace.utils.UserUnlockManager;
import com.oplus.utrace.utils.UtilsKt;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007*\u0001W\b\u0000\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bZ\u0010[J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J1\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016J\"\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010%\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016J\"\u0010%\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010&\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016J\"\u0010&\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010'\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016J\"\u0010'\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010(\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016J\"\u0010(\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J$\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020,H\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR(\u0010B\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bB\u0010A\u0012\u0004\bG\u0010H\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010I\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010H\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010JR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lcom/oplus/utrace/hlog/ULoggerImpl;", "Lcom/oplus/utrace/sdk/IULogger;", "Landroid/os/Handler$Callback;", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/gsi;", "deviceIds", "", "initLogger", "initOpenId", "", rde.PAY_SDK_OUID, "", "checkOuid", "forceFlush", "tryFlushInThread", "registerActivityLifecycleCallback", "unregisterActivityLifecycleCallback", "release", "pushRawContent", "Lcom/oplus/utrace/sdk/IUploadListener;", "listener", "upload", "available", "deleteLog", "", "currentTime", "Lkotlin/Triple;", "canFlush$utrace_sdk_log_logRelease", "(ZJ)Lkotlin/Triple;", "canFlush", "tag", "message", "", "d", "", "tr", "i", "v", "w", "e", "priority", "msg", "println", "Landroid/os/Message;", "handleMessage", "context$1", "Landroid/content/Context;", "Lcom/heytap/log/Logger;", "logger", "Lcom/heytap/log/Logger;", "Lcom/heytap/log/ISimpleLog;", "simpleLog", "Lcom/heytap/log/ISimpleLog;", "logFilePath", "Ljava/lang/String;", "getLogFilePath$utrace_sdk_log_logRelease", "()Ljava/lang/String;", "logPrefix", "Lcom/oplus/utrace/hlog/HLogReceiver;", "receiver", "Lcom/oplus/utrace/hlog/HLogReceiver;", "isRequestOpenId", "Z", "retryCount", "I", "pendingLogCount", "getPendingLogCount$utrace_sdk_log_logRelease", "()I", "setPendingLogCount$utrace_sdk_log_logRelease", "(I)V", "getPendingLogCount$utrace_sdk_log_logRelease$annotations", "()V", "flushBaseTime", "J", "getFlushBaseTime$utrace_sdk_log_logRelease", "()J", "setFlushBaseTime$utrace_sdk_log_logRelease", "(J)V", "getFlushBaseTime$utrace_sdk_log_logRelease$annotations", "lastSyncFlushTime", "Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "getHandler", "()Landroid/os/Handler;", "handler", "com/oplus/utrace/hlog/ULoggerImpl$activityLifecycleCallbacks$1", "activityLifecycleCallbacks", "Lcom/oplus/utrace/hlog/ULoggerImpl$activityLifecycleCallbacks$1;", "<init>", "(Landroid/content/Context;)V", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0})
public final class ULoggerImpl implements IULogger, Handler.Callback {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static Context context;

    @NotNull
    private final ULoggerImpl$activityLifecycleCallbacks$1 activityLifecycleCallbacks;

    @NotNull
    private final Context context$1;
    private long flushBaseTime;

    @NotNull
    private final Lazy handler$delegate;
    private volatile boolean isRequestOpenId;
    private long lastSyncFlushTime;

    @NotNull
    private final String logFilePath;

    @NotNull
    private final String logPrefix;

    @Nullable
    private volatile Logger logger;
    private volatile int pendingLogCount;

    @Nullable
    private HLogReceiver receiver;
    private volatile int retryCount;

    @Nullable
    private volatile ISimpleLog simpleLog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ULoggerImpl$Companion$unlockListener$1 unlockListener = new UserUnlockManager.UserUnlockListener() { // from class: com.oplus.utrace.hlog.ULoggerImpl$Companion$unlockListener$1
        @Override // com.oplus.utrace.utils.UserUnlockManager.UserUnlockListener
        public void onUserUnlock() {
            if (!UtilsKt.isUserUnlocked() || ULoggerImpl.context == null) {
                return;
            }
            UserUnlockManager.INSTANCE.unregisterListener(this);
            Context context2 = ULoggerImpl.context;
            if (context2 != null) {
                ULoggerImpl.INSTANCE.loadAndQueryHLogConfig(context2);
            }
        }
    };

    @Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/utrace/hlog/ULoggerImpl$Companion;", "", "()V", "context", "Landroid/content/Context;", "unlockListener", "com/oplus/utrace/hlog/ULoggerImpl$Companion$unlockListener$1", "Lcom/oplus/utrace/hlog/ULoggerImpl$Companion$unlockListener$1;", "loadAndQuery", "", "loadAndQueryHLogConfig", "quit", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void loadAndQueryHLogConfig(Context context) {
            HLogConfigHelper hLogConfigHelper = HLogConfigHelper.INSTANCE;
            hLogConfigHelper.loadHLogConfigFromSp(context);
            hLogConfigHelper.queryHLogConfig(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void quit$lambda$0() {
            HLogConfigHelper.INSTANCE.release();
        }

        public final synchronized void loadAndQuery(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ULoggerImpl.context = context;
            if (UtilsKt.isUserUnlocked()) {
                loadAndQueryHLogConfig(context);
            } else {
                UserUnlockManager.INSTANCE.registerListener(ULoggerImpl.unlockListener);
            }
            HLogReporter.INSTANCE.init$utrace_sdk_log_logRelease(context);
        }

        public final void quit() {
            Handler handler;
            Logs.INSTANCE.i("UTrace.Sdk.HLog.ULoggerImpl", TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null) + " quit()");
            HLog.quit();
            HLogUtils hLogUtils = HLogUtils.INSTANCE;
            SafeHandlerThread thread$utrace_sdk_log_logRelease = hLogUtils.getThread$utrace_sdk_log_logRelease();
            if (thread$utrace_sdk_log_logRelease != null && (handler = thread$utrace_sdk_log_logRelease.getHandler()) != null) {
                handler.post(new Runnable() { // from class: com.oplus.utrace.hlog.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ULoggerImpl.Companion.quit$lambda$0();
                    }
                });
            }
            SafeHandlerThread thread$utrace_sdk_log_logRelease2 = hLogUtils.getThread$utrace_sdk_log_logRelease();
            if (thread$utrace_sdk_log_logRelease2 != null) {
                thread$utrace_sdk_log_logRelease2.quit();
            }
            UserUnlockManager.INSTANCE.unregisterListener(ULoggerImpl.unlockListener);
        }
    }

    public ULoggerImpl(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context$1 = context2;
        this.logFilePath = HLogUtils.defaultLogPath(context2);
        String strGenerateLogPrefix$utrace_sdk_log_logRelease = TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease(this);
        this.logPrefix = strGenerateLogPrefix$utrace_sdk_log_logRelease;
        this.handler$delegate = LazyKt.lazy(new Function0<Handler>() { // from class: com.oplus.utrace.hlog.ULoggerImpl$handler$2
            {
                super(0);
            }

            @NotNull
            public final Handler invoke() {
                Looper mainLooper;
                SafeHandlerThread commonThread = TraceUtil.INSTANCE.getCommonThread();
                if (commonThread == null || (mainLooper = commonThread.getLooper()) == null) {
                    mainLooper = Looper.getMainLooper();
                }
                return new Handler(mainLooper, this.this$0);
            }
        });
        boolean z = UTraceApp.INSTANCE.getMEnabled$utrace_sdk_log_logRelease() && UTraceApp.mContext != null;
        boolean zIsLogEnabled$utrace_sdk_log_logRelease = HLogConfigHelper.INSTANCE.isLogEnabled$utrace_sdk_log_logRelease();
        Logs.INSTANCE.i("UTrace.Sdk.HLog.ULoggerImpl", strGenerateLogPrefix$utrace_sdk_log_logRelease + " init ULoggerImpl. switchOn=" + z + " logEnabled=" + zIsLogEnabled$utrace_sdk_log_logRelease + " context=" + context2);
        if (z && zIsLogEnabled$utrace_sdk_log_logRelease) {
            TraceUtil.runSafeThread$utrace_sdk_log_logRelease(new Function0<Unit>() { // from class: com.oplus.utrace.hlog.ULoggerImpl.1
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    if (HLogUtils.isInPlugin()) {
                        HLogUtils.ensureLibraryDirectories$utrace_sdk_log_logRelease();
                    }
                    HLogConfigHelper hLogConfigHelper = HLogConfigHelper.INSTANCE;
                    gsi deviceIds$utrace_sdk_log_logRelease = hLogConfigHelper.getDeviceIds$utrace_sdk_log_logRelease();
                    String strB = deviceIds$utrace_sdk_log_logRelease != null ? deviceIds$utrace_sdk_log_logRelease.b() : null;
                    if (strB == null || strB.length() == 0) {
                        ULoggerImpl uLoggerImpl = ULoggerImpl.this;
                        uLoggerImpl.initOpenId(uLoggerImpl.context$1);
                        return;
                    }
                    gsi deviceIds$utrace_sdk_log_logRelease2 = hLogConfigHelper.getDeviceIds$utrace_sdk_log_logRelease();
                    if (deviceIds$utrace_sdk_log_logRelease2 != null) {
                        ULoggerImpl uLoggerImpl2 = ULoggerImpl.this;
                        uLoggerImpl2.initLogger(uLoggerImpl2.context$1, deviceIds$utrace_sdk_log_logRelease2);
                    }
                }
            });
        }
        this.activityLifecycleCallbacks = new ULoggerImpl$activityLifecycleCallbacks$1(this);
    }

    private final boolean checkOuid(String ouid) {
        if (ouid == null || ouid.length() == 0) {
            return false;
        }
        return !(StringsKt.replace$default(ouid, "0", "", false, 4, (Object) null).length() == 0);
    }

    @VisibleForTesting
    public static /* synthetic */ void getFlushBaseTime$utrace_sdk_log_logRelease$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingLogCount$utrace_sdk_log_logRelease$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initLogger(Context context2, gsi deviceIds) {
        Logs logs = Logs.INSTANCE;
        logs.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initLogger() context=" + context2);
        getHandler().removeMessages(300);
        this.logger = HLogUtils.buildLogger(context2, deviceIds, this.logFilePath);
        Logger logger = this.logger;
        this.simpleLog = logger != null ? logger.getSimpleLog() : null;
        logs.i("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initLogger() logger=" + this.logger + " simpleLog=" + this.simpleLog + " logFilePath=" + this.logFilePath);
        Logger logger2 = this.logger;
        if (logger2 != null) {
            this.receiver = HLogReceiver.INSTANCE.register$utrace_sdk_log_logRelease(context2);
            logs.setLogger(this);
            logger2.setUploaderListener(new UploadManager.UploaderListener() { // from class: com.oplus.utrace.hlog.ULoggerImpl$initLogger$2$1
                public void onUploaderFailed(@Nullable String p0) {
                    Logs.INSTANCE.w("UTrace.Sdk.HLog.ULoggerImpl", this.this$0.logPrefix + " onUploaderFailed() " + p0);
                }

                public void onUploaderSuccess() {
                    Logs.INSTANCE.d("UTrace.Sdk.HLog.ULoggerImpl", this.this$0.logPrefix + " onUploaderSuccess()");
                }
            });
            registerActivityLifecycleCallback();
            getHandler().sendEmptyMessageDelayed(300, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initOpenId(Context context2) {
        Object obj;
        Logs logs = Logs.INSTANCE;
        logs.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initOpenId() isRequestOpenId=" + this.isRequestOpenId);
        if (this.isRequestOpenId) {
            return;
        }
        HLogConfigHelper hLogConfigHelper = HLogConfigHelper.INSTANCE;
        gsi deviceIds$utrace_sdk_log_logRelease = hLogConfigHelper.getDeviceIds$utrace_sdk_log_logRelease();
        if (checkOuid(deviceIds$utrace_sdk_log_logRelease != null ? deviceIds$utrace_sdk_log_logRelease.b() : null)) {
            logs.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initOpenId() checkOuid=true");
            return;
        }
        if (this.retryCount > 3) {
            logs.e("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initOpenId retryCount is more than 3,so will not request ouid");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            this.isRequestOpenId = true;
            logs.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initOpenId() start request openId");
            hsi.j(context2);
            gsi gsiVarI = hsi.i(context2, gsi.Type_OUID | gsi.Type_DUID);
            this.isRequestOpenId = false;
            if (checkOuid(gsiVarI.b())) {
                this.retryCount = 0;
                hLogConfigHelper.setDeviceIds$utrace_sdk_log_logRelease(gsiVarI);
                Intrinsics.checkNotNullExpressionValue(gsiVarI, UTraceSQLiteHelperKt.COL_INFO);
                initLogger(context2, gsiVarI);
            } else {
                this.retryCount++;
                logs.w("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initOpenId() end request openId ,openId is null.retryCount=" + this.retryCount);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.i("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " initOpenId() exception=" + th2.getMessage(), th2);
        }
    }

    private final void registerActivityLifecycleCallback() {
        Context applicationContext = this.context$1.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryFlushInThread(boolean forceFlush) {
        Object obj;
        Unit unit;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Triple<Boolean, Boolean, Boolean> tripleCanFlush$utrace_sdk_log_logRelease = canFlush$utrace_sdk_log_logRelease(forceFlush, jElapsedRealtime);
        boolean zBooleanValue = ((Boolean) tripleCanFlush$utrace_sdk_log_logRelease.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) tripleCanFlush$utrace_sdk_log_logRelease.component2()).booleanValue();
        if (((Boolean) tripleCanFlush$utrace_sdk_log_logRelease.component3()).booleanValue()) {
            this.flushBaseTime = jElapsedRealtime;
        }
        if (zBooleanValue) {
            this.pendingLogCount = 0;
            try {
                Result.Companion companion = Result.Companion;
                Logger logger = this.logger;
                if (logger != null) {
                    logger.flush(zBooleanValue2);
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
                Log.i("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " tryFlushInThread() exception=" + th2);
            }
            this.flushBaseTime = jElapsedRealtime;
            if (zBooleanValue2) {
                this.lastSyncFlushTime = jElapsedRealtime;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterActivityLifecycleCallback() {
        Context applicationContext = this.context$1.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
    }

    @Override // com.oplus.utrace.sdk.IULogger
    public boolean available() {
        return (this.logger == null || this.simpleLog == null) ? false : true;
    }

    @VisibleForTesting
    @NotNull
    public final Triple<Boolean, Boolean, Boolean> canFlush$utrace_sdk_log_logRelease(boolean forceFlush, long currentTime) {
        long j = currentTime - this.flushBaseTime;
        if (j < 5000) {
            Boolean bool = Boolean.FALSE;
            return new Triple<>(bool, bool, bool);
        }
        int i = this.pendingLogCount;
        if (i <= 0) {
            Boolean bool2 = Boolean.FALSE;
            return new Triple<>(bool2, bool2, Boolean.TRUE);
        }
        boolean z = forceFlush || i >= 100 || j >= 15000;
        boolean z2 = forceFlush || currentTime - this.lastSyncFlushTime >= 60000;
        if (z && Logs.INSTANCE.getDebuggable()) {
            Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " can flush logger=" + this.logger + " logCount=" + i + " elapseTime=" + (j / 1000) + " forceFlush=" + forceFlush + " sync=" + z2 + " version=2.0.44-25e9612-20260202-124920");
        }
        return new Triple<>(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z));
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int d(@NotNull String tag, @NotNull String message) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Logs.INSTANCE.getDebuggable()) {
            return 0;
        }
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.d(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " d(2) exception=" + th2.getMessage(), th2);
        }
        return 0;
    }

    @Override // com.oplus.utrace.sdk.IULogger
    public void deleteLog() {
        Object obj;
        Logs.INSTANCE.i("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " deleteLog() logger=" + this.logger);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(FilesKt.deleteRecursively(new File(this.logFilePath))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.i("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " deleteLog() exception=" + th2);
        }
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int e(@NotNull String tag, @NotNull String message) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.e(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " e(2) exception=" + th2.getMessage(), th2);
        return 0;
    }

    /* JADX INFO: renamed from: getFlushBaseTime$utrace_sdk_log_logRelease, reason: from getter */
    public final long getFlushBaseTime() {
        return this.flushBaseTime;
    }

    @NotNull
    /* JADX INFO: renamed from: getLogFilePath$utrace_sdk_log_logRelease, reason: from getter */
    public final String getLogFilePath() {
        return this.logFilePath;
    }

    /* JADX INFO: renamed from: getPendingLogCount$utrace_sdk_log_logRelease, reason: from getter */
    public final int getPendingLogCount() {
        return this.pendingLogCount;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 300) {
            return false;
        }
        if (this.logger == null) {
            return true;
        }
        tryFlushInThread(false);
        getHandler().sendEmptyMessageDelayed(300, 5000L);
        return true;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int i(@NotNull String tag, @NotNull String message) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.i(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " i(2) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int println(int priority, @Nullable String tag, @Nullable String msg) {
        Object obj;
        if (!(tag == null || StringsKt.isBlank(tag))) {
            if (!(msg == null || StringsKt.isBlank(msg))) {
                try {
                    Result.Companion companion = Result.Companion;
                    if (priority == 2) {
                        ISimpleLog iSimpleLog = this.simpleLog;
                        if (iSimpleLog != null) {
                            iSimpleLog.v(tag, msg);
                        }
                    } else if (priority == 3) {
                        ISimpleLog iSimpleLog2 = this.simpleLog;
                        if (iSimpleLog2 != null) {
                            iSimpleLog2.d(tag, msg);
                        }
                    } else if (priority == 4) {
                        ISimpleLog iSimpleLog3 = this.simpleLog;
                        if (iSimpleLog3 != null) {
                            iSimpleLog3.i(tag, msg);
                        }
                    } else if (priority == 5) {
                        ISimpleLog iSimpleLog4 = this.simpleLog;
                        if (iSimpleLog4 != null) {
                            iSimpleLog4.w(tag, msg);
                        }
                    } else {
                        if (priority != 6) {
                            return 0;
                        }
                        ISimpleLog iSimpleLog5 = this.simpleLog;
                        if (iSimpleLog5 != null) {
                            iSimpleLog5.e(tag, msg);
                        }
                    }
                    this.pendingLogCount++;
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " println() exception=" + th2.getMessage(), th2);
                }
            }
        }
        return 0;
    }

    @Override // com.oplus.utrace.sdk.IULogger
    public void release() {
        TraceUtil.runSafeThread$utrace_sdk_log_logRelease(new Function0<Unit>() { // from class: com.oplus.utrace.hlog.ULoggerImpl.release.1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Object obj;
                Logs logs = Logs.INSTANCE;
                logs.i("UTrace.Sdk.HLog.ULoggerImpl", ULoggerImpl.this.logPrefix + " release() logger=" + ULoggerImpl.this.logger);
                logs.setLogger(null);
                ULoggerImpl.this.getHandler().removeMessages(300);
                ULoggerImpl.this.simpleLog = null;
                ULoggerImpl uLoggerImpl = ULoggerImpl.this;
                try {
                    Result.Companion companion = Result.Companion;
                    Logger logger = uLoggerImpl.logger;
                    if (logger != null) {
                        logger.quit();
                        logger.exit();
                    } else {
                        logger = null;
                    }
                    obj = Result.constructor-impl(logger);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                ULoggerImpl uLoggerImpl2 = ULoggerImpl.this;
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    Log.i("UTrace.Sdk.HLog.ULoggerImpl", uLoggerImpl2.logPrefix + " release() exception=" + th2, th2);
                }
                ULoggerImpl.this.logger = null;
                ULoggerImpl.this.retryCount = 0;
                ULoggerImpl.this.setPendingLogCount$utrace_sdk_log_logRelease(0);
                ULoggerImpl.this.setFlushBaseTime$utrace_sdk_log_logRelease(0L);
                ULoggerImpl.this.lastSyncFlushTime = 0L;
                HLogReceiver hLogReceiver = ULoggerImpl.this.receiver;
                if (hLogReceiver != null) {
                    hLogReceiver.unregister$utrace_sdk_log_logRelease(ULoggerImpl.this.context$1);
                }
                ULoggerImpl.this.receiver = null;
                ULoggerImpl.this.unregisterActivityLifecycleCallback();
            }
        });
    }

    public final void setFlushBaseTime$utrace_sdk_log_logRelease(long j) {
        this.flushBaseTime = j;
    }

    public final void setPendingLogCount$utrace_sdk_log_logRelease(int i) {
        this.pendingLogCount = i;
    }

    @Override // com.oplus.utrace.sdk.IULogger
    public void upload(@NotNull String pushRawContent, @NotNull IUploadListener listener) {
        Intrinsics.checkNotNullParameter(pushRawContent, "pushRawContent");
        Intrinsics.checkNotNullParameter(listener, "listener");
        new HLogUploadWrapper(this.logger).uploadFor(pushRawContent).listenBy(listener).startUpload();
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int v(@NotNull String tag, @NotNull String message) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.v(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " v(2) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int w(@NotNull String tag, @NotNull String message) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.w(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " w(2) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int e(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.e(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " e(3) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int i(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.i(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " i(3) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int v(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.v(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " v(3) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int w(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.w(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return 0;
        }
        Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " w(3) exception=" + th2.getMessage(), th2);
        return 0;
    }

    @Override // com.oplus.utrace.utils.ILogger
    public int d(@NotNull String tag, @NotNull String message, @Nullable Throwable tr) {
        Object obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Logs.INSTANCE.getDebuggable()) {
            return 0;
        }
        try {
            Result.Companion companion = Result.Companion;
            ISimpleLog iSimpleLog = this.simpleLog;
            if (iSimpleLog != null) {
                iSimpleLog.d(tag, message);
            }
            this.pendingLogCount++;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d("UTrace.Sdk.HLog.ULoggerImpl", this.logPrefix + " d(3) exception=" + th2.getMessage(), th2);
        }
        return 0;
    }
}
