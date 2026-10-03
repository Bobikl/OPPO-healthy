package com.oplus.utrace.hlog;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.sdk.UTraceApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 ,2\u00020\u0001:\u0001,B_\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u0006\u0010*\u001a\u00020\u0003J\b\u0010+\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/oplus/utrace/hlog/UploadParams;", "", HLogConst.KEY_BUSINESS, "", "traceId", "", "beginTime", "endTime", HLogConst.KEY_USE_WIFI, "", HLogConst.KEY_MAX_FILE_SIZE, HLogConst.KEY_UPLOAD_FLAG, "Lcom/oplus/utrace/hlog/UploadFlag;", "simFdTimeout", HLogConst.KEY_SEND_FROM, HLogConst.KEY_TRACE_PKG, HLogConst.KEY_RAW_CONTENT, "(Ljava/lang/String;JJJZJLcom/oplus/utrace/hlog/UploadFlag;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeginTime", "()J", "createTime", "getCreateTime", "getEndTime", "getMaxFileSize", "pushData", "Lcom/oplus/utrace/hlog/PushData;", "getPushData", "()Lcom/oplus/utrace/hlog/PushData;", "value", "Lcom/oplus/utrace/hlog/IHLogReporter;", "reporter", "getReporter", "()Lcom/oplus/utrace/hlog/IHLogReporter;", "setReporter", "(Lcom/oplus/utrace/hlog/IHLogReporter;)V", "getSendFrom", "()Ljava/lang/String;", "getSimFdTimeout", "()Z", "getTraceId", "getUploadFlag", "()Lcom/oplus/utrace/hlog/UploadFlag;", "toKey", "toString", "Companion", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UploadParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long createTime;
    private final long maxFileSize;

    @NotNull
    private final PushData pushData;

    @NotNull
    private final String sendFrom;
    private final boolean simFdTimeout;

    @NotNull
    private final UploadFlag uploadFlag;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/oplus/utrace/hlog/UploadParams$Companion;", "", "()V", "from", "Lcom/oplus/utrace/hlog/UploadParams;", TraceConstants.KEY_ACTION, "Landroid/content/Intent;", "fromAndInitReporter", "getUploadFlag", "Lcom/oplus/utrace/hlog/UploadFlag;", "pkg", "", "getUploadFlag$utrace_sdk_log_logRelease", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UploadParams from(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
            String stringExtra = intent.getStringExtra(HLogConst.KEY_BUSINESS);
            String str = stringExtra == null ? "" : stringExtra;
            long longExtra = intent.getLongExtra("traceId", 0L);
            long longExtra2 = intent.getLongExtra("startTime", 0L);
            long longExtra3 = intent.getLongExtra("endTime", 0L);
            boolean booleanExtra = intent.getBooleanExtra(HLogConst.KEY_USE_WIFI, false);
            long longExtra4 = intent.getLongExtra(HLogConst.KEY_MAX_FILE_SIZE, 0L);
            Context context = UTraceApp.mContext;
            UploadFlag uploadFlag$utrace_sdk_log_logRelease = getUploadFlag$utrace_sdk_log_logRelease(intent, context != null ? context.getPackageName() : null);
            boolean booleanExtra2 = intent.getBooleanExtra(HLogConst.KEY_EXTRAS_SIM_FD_TIMEOUT, false);
            String stringExtra2 = intent.getStringExtra(HLogConst.KEY_SEND_FROM);
            String str2 = stringExtra2 == null ? "" : stringExtra2;
            String stringExtra3 = intent.getStringExtra(HLogConst.KEY_TRACE_PKG);
            if (stringExtra3 == null) {
                stringExtra3 = UTraceApp.mPkgName;
            }
            String str3 = stringExtra3;
            Intrinsics.checkNotNullExpressionValue(str3, "intent.getStringExtra(KE…?: UTraceApp.getPkgName()");
            String stringExtra4 = intent.getStringExtra(HLogConst.KEY_RAW_CONTENT);
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            return new UploadParams(str, longExtra, longExtra2, longExtra3, booleanExtra, longExtra4, uploadFlag$utrace_sdk_log_logRelease, booleanExtra2, str2, str3, stringExtra4, null);
        }

        @NotNull
        public final UploadParams fromAndInitReporter(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
            UploadParams uploadParamsFrom = from(intent);
            uploadParamsFrom.setReporter(new HLogReporter().setPushData(uploadParamsFrom.getPushData()));
            return uploadParamsFrom;
        }

        @VisibleForTesting
        @NotNull
        public final UploadFlag getUploadFlag$utrace_sdk_log_logRelease(@NotNull Intent intent, @Nullable String pkg) {
            UploadFlag uploadFlag;
            UploadFlag uploadFlag2;
            Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
            UploadFlag uploadFlagFrom = UploadFlag.INSTANCE.from(intent.getIntExtra(HLogConst.KEY_UPLOAD_FLAG, 0));
            if (uploadFlagFrom != null) {
                return uploadFlagFrom;
            }
            if (pkg == null || (uploadFlag2 = HLogUtils.INSTANCE.getDefaultUploadFlags$utrace_sdk_log_logRelease().get(pkg)) == null) {
                uploadFlag = null;
            } else {
                UploadFlag uploadFlag3 = UploadFlag.CAN_UPLOAD;
                if (uploadFlag2 != uploadFlag3) {
                    uploadFlag3 = UploadFlag.NO_UPLOAD;
                }
                uploadFlag = uploadFlag3;
            }
            return uploadFlag == null ? UploadFlag.CAN_UPLOAD : uploadFlag;
        }
    }

    public /* synthetic */ UploadParams(String str, long j, long j2, long j3, boolean z, long j4, UploadFlag uploadFlag, boolean z2, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, j3, z, j4, uploadFlag, z2, str2, str3, str4);
    }

    public final long getBeginTime() {
        return this.pushData.getBeginTime();
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getEndTime() {
        return this.pushData.getEndTime();
    }

    public final long getMaxFileSize() {
        return this.maxFileSize;
    }

    @NotNull
    public final PushData getPushData() {
        return this.pushData;
    }

    @Nullable
    public final IHLogReporter getReporter() {
        return this.pushData.getReporter();
    }

    @NotNull
    public final String getSendFrom() {
        return this.sendFrom;
    }

    public final boolean getSimFdTimeout() {
        return this.simFdTimeout;
    }

    public final long getTraceId() {
        return this.pushData.getTraceId();
    }

    @NotNull
    public final UploadFlag getUploadFlag() {
        return this.uploadFlag;
    }

    public final void setReporter(@Nullable IHLogReporter iHLogReporter) {
        this.pushData.setReporter(iHLogReporter);
    }

    @NotNull
    public final String toKey() {
        return this.pushData.getBusiness() + '-' + getTraceId() + '-' + getBeginTime() + '-' + getEndTime();
    }

    @NotNull
    public String toString() {
        return "UploadParams(sendFrom=" + this.sendFrom + ", uploadFlag=" + this.uploadFlag + ", pushData=" + this.pushData + ')';
    }

    private UploadParams(String str, long j, long j2, long j3, boolean z, long j4, UploadFlag uploadFlag, boolean z2, String str2, String str3, String str4) {
        this.maxFileSize = j4;
        this.uploadFlag = uploadFlag;
        this.simFdTimeout = z2;
        this.sendFrom = str2;
        this.pushData = new PushData(str, j, j2, j3, z, str3, str4, null, 128, null);
        this.createTime = SystemClock.elapsedRealtime();
    }
}
