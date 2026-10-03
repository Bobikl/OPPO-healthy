package com.oplus.utrace.hlog;

import android.util.Log;
import com.heytap.log.Logger;
import com.heytap.log.uploader.UploadManager;
import com.oplus.utrace.sdk.IUploadListener;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.TraceUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/oplus/utrace/hlog/HLogUploadWrapper;", "Lcom/heytap/log/uploader/UploadManager$UploaderListener;", "logger", "Lcom/heytap/log/Logger;", "(Lcom/heytap/log/Logger;)V", "finished", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listener", "Lcom/oplus/utrace/sdk/IUploadListener;", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "logPrefix$delegate", "Lkotlin/Lazy;", "uploadRunnable", "Ljava/lang/Runnable;", "listenBy", "onUploaderFailed", "", "message", "onUploaderSuccess", "startUpload", "uploadFor", "pushRawContent", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HLogUploadWrapper implements UploadManager.UploaderListener {
    private IUploadListener listener;

    @Nullable
    private final Logger logger;
    private Runnable uploadRunnable;

    @NotNull
    private final Lazy logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.hlog.HLogUploadWrapper$logPrefix$2
        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null);
        }
    });

    @NotNull
    private final AtomicBoolean finished = new AtomicBoolean(false);

    public HLogUploadWrapper(@Nullable Logger logger) {
        this.logger = logger;
    }

    private final String getLogPrefix() {
        return (String) this.logPrefix$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFor$lambda$2(HLogUploadWrapper hLogUploadWrapper, String str) {
        Object obj;
        Unit unit;
        Intrinsics.checkNotNullParameter(hLogUploadWrapper, "this$0");
        Intrinsics.checkNotNullParameter(str, "$pushRawContent");
        Logs.INSTANCE.d("UTrace.Sdk.HLogUploader", hLogUploadWrapper.getLogPrefix() + " invoke upload on " + hLogUploadWrapper.logger + " with (" + str + ')');
        IUploadListener iUploadListener = null;
        try {
            Result.Companion companion = Result.Companion;
            Logger logger = hLogUploadWrapper.logger;
            if (logger != null) {
                logger.checkOPushDataContent(str);
            }
            Logger logger2 = hLogUploadWrapper.logger;
            if (logger2 != null) {
                logger2.setUploaderListener(hLogUploadWrapper);
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
            Log.i("UTrace.Sdk.HLogUploader", hLogUploadWrapper.getLogPrefix() + " invoke upload on " + hLogUploadWrapper.logger + " with exception=" + th2);
            IUploadListener iUploadListener2 = hLogUploadWrapper.listener;
            if (iUploadListener2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listener");
            } else {
                iUploadListener = iUploadListener2;
            }
            iUploadListener.onUploadFail("exception=" + th2);
        }
    }

    @NotNull
    public final HLogUploadWrapper listenBy(@NotNull IUploadListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    public void onUploaderFailed(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logs.INSTANCE.i("UTrace.Sdk.HLogUploader", getLogPrefix() + " onUploaderFailed: " + message);
        if (this.finished.getAndSet(true)) {
            return;
        }
        IUploadListener iUploadListener = this.listener;
        if (iUploadListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            iUploadListener = null;
        }
        iUploadListener.onUploadFail("onUploaderFailed: " + message);
    }

    public void onUploaderSuccess() {
        Logs.INSTANCE.i("UTrace.Sdk.HLogUploader", getLogPrefix() + " onUploaderSuccess");
        if (this.finished.getAndSet(true)) {
            return;
        }
        IUploadListener iUploadListener = this.listener;
        if (iUploadListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            iUploadListener = null;
        }
        iUploadListener.onUploadSuccess("onUploaderSuccess");
    }

    public final void startUpload() {
        Runnable runnable = this.uploadRunnable;
        if (runnable == null) {
            Logs.INSTANCE.e("UTrace.Sdk.HLogUploader", getLogPrefix() + " startUpload() should initialize uploadRunnable first");
            return;
        }
        IUploadListener iUploadListener = this.listener;
        if (iUploadListener == null) {
            Logs.INSTANCE.e("UTrace.Sdk.HLogUploader", getLogPrefix() + " startUpload() should initialize listener first");
            return;
        }
        if (this.logger == null) {
            if (iUploadListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listener");
                iUploadListener = null;
            }
            iUploadListener.onUploadFail("logger==null");
            return;
        }
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadRunnable");
            runnable = null;
        }
        runnable.run();
    }

    @NotNull
    public final HLogUploadWrapper uploadFor(@NotNull final String pushRawContent) {
        Intrinsics.checkNotNullParameter(pushRawContent, "pushRawContent");
        this.uploadRunnable = new Runnable() { // from class: com.oplus.utrace.hlog.i
            @Override // java.lang.Runnable
            public final void run() {
                HLogUploadWrapper.uploadFor$lambda$2(this.i, pushRawContent);
            }
        };
        return this;
    }
}
