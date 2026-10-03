package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import com.oplus.statistics.OplusTrack;
import com.oplus.utrace.hlog.HLogFilesCollector;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nJ*\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120)R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001b\u0010\u0017\u001a\u00020\u00128@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012@BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001f¨\u0006*"}, d2 = {"Lcom/oplus/utrace/utils/DcsWrapper;", "", "()V", "value", "", "available", "getAvailable$utrace_sdk_log_logRelease", "()Z", "setAvailable", "(Z)V", "Landroid/content/Context;", "context", "getContext$utrace_sdk_log_logRelease", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "directApps", "", "", "[Ljava/lang/String;", "directReport", "getDirectReport", "setDirectReport", "logPrefix", "getLogPrefix$utrace_sdk_log_logRelease", "()Ljava/lang/String;", "logPrefix$delegate", "Lkotlin/Lazy;", "packageName", "getPackageName$utrace_sdk_log_logRelease", "setPackageName", "(Ljava/lang/String;)V", "versionName", "getVersionName$utrace_sdk_log_logRelease", "setVersionName", "init", "", "report", "logTag", "eventId", "data", "", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class DcsWrapper {
    private static boolean available;

    @Nullable
    private static Context context;
    private static boolean directReport;

    @NotNull
    public static final DcsWrapper INSTANCE = new DcsWrapper();

    @NotNull
    private static final Lazy logPrefix$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.utils.DcsWrapper$logPrefix$2
        @NotNull
        public final String invoke() {
            return TraceUtil.generateLogPrefix$utrace_sdk_log_logRelease$default(null, 1, null);
        }
    });

    @NotNull
    private static final String[] directApps = {"com.oplus.utrace", "com.oplus.pantanal.ums"};

    @NotNull
    private static String packageName = "";

    @NotNull
    private static String versionName = "";

    private DcsWrapper() {
    }

    private final void setAvailable(boolean z) {
        available = z;
    }

    private final void setContext(Context context2) {
        context = context2;
    }

    private final void setPackageName(String str) {
        packageName = str;
    }

    private final void setVersionName(String str) {
        versionName = str;
    }

    public final boolean getAvailable$utrace_sdk_log_logRelease() {
        return available;
    }

    @Nullable
    public final Context getContext$utrace_sdk_log_logRelease() {
        return context;
    }

    public final boolean getDirectReport() {
        return directReport;
    }

    @NotNull
    public final String getLogPrefix$utrace_sdk_log_logRelease() {
        return (String) logPrefix$delegate.getValue();
    }

    @NotNull
    public final String getPackageName$utrace_sdk_log_logRelease() {
        return packageName;
    }

    @NotNull
    public final String getVersionName$utrace_sdk_log_logRelease() {
        return versionName;
    }

    public final void init(@NotNull Context context2) {
        Object obj;
        Intrinsics.checkNotNullParameter(context2, "context");
        if (context != null) {
            return;
        }
        setContext(context2);
        String packageName2 = context2.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
        setPackageName(packageName2);
        setVersionName(UtilsKt.getAppVersionName(context2, packageName));
        Logs.INSTANCE.d("UTrace.Sdk.DcsWrapper", getLogPrefix$utrace_sdk_log_logRelease() + " init() packageName=" + packageName + " versionName=" + versionName + " context=" + context2);
        if (!ArraysKt.contains(directApps, packageName)) {
            directReport = false;
            setAvailable(true);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            OplusTrack.init(context2);
            directReport = true;
            setAvailable(true);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w("UTrace.Sdk.DcsWrapper", INSTANCE.getLogPrefix$utrace_sdk_log_logRelease() + " init() exception=" + th2);
        }
    }

    public final void report(@NotNull String logTag, @NotNull String eventId, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(data, "data");
        Context context2 = context;
        if (context2 == null) {
            return;
        }
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.i("UTrace.Sdk.DcsWrapper", getLogPrefix$utrace_sdk_log_logRelease() + " report(" + logTag + ',' + eventId + ") available=" + available + " directReport=" + directReport + " data=" + data + " context=" + context);
        }
        if (available) {
            if (directReport) {
                OplusTrack.onCommon(context2, DcsCommon.APP_ID, logTag, eventId, data);
            } else {
                HLogFilesCollector.INSTANCE.delegateReport$utrace_sdk_log_logRelease(context2, DcsCommon.APP_ID, logTag, eventId, data);
            }
        }
    }

    public final void setDirectReport(boolean z) {
        directReport = z;
    }
}
