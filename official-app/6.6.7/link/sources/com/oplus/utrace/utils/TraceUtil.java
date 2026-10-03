package com.oplus.utrace.utils;

import android.content.Context;
import android.os.Handler;
import com.oplus.utrace.sdk.UTraceApp;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u000fJ\u0019\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\b\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u001b\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0001¢\u0006\u0002\b\u001cR\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/oplus/utrace/utils/TraceUtil;", "", "()V", "commonThread", "Lcom/oplus/utrace/utils/SafeHandlerThread;", "getCommonThread", "()Lcom/oplus/utrace/utils/SafeHandlerThread;", "commonThread$delegate", "Lkotlin/Lazy;", "generateFileNamePrefix", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "moduleName", "generateFileNamePrefix$utrace_sdk_log_logRelease", "generateLogPrefix", "that", "generateLogPrefix$utrace_sdk_log_logRelease", "newHandlerThread", "name", "newHandlerThread$utrace_sdk_log_logRelease", "quit", "", "quit$utrace_sdk_log_logRelease", "runSafeThread", "block", "Lkotlin/Function0;", "runSafeThread$utrace_sdk_log_logRelease", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTraceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraceUtil.kt\ncom/oplus/utrace/utils/TraceUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public final class TraceUtil {

    @NotNull
    public static final TraceUtil INSTANCE = new TraceUtil();

    @NotNull
    private static final Lazy commonThread$delegate = LazyKt.lazy(new Function0<SafeHandlerThread>() { // from class: com.oplus.utrace.utils.TraceUtil$commonThread$2
        @Nullable
        public final SafeHandlerThread invoke() {
            return TraceUtil.newHandlerThread$utrace_sdk_log_logRelease("UTrace.Sdk.CommonLooper");
        }
    });

    private TraceUtil() {
    }

    @JvmStatic
    @NotNull
    public static final Pair<String, String> generateFileNamePrefix$utrace_sdk_log_logRelease(@NotNull Context context, @NotNull String moduleName) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Regex regex = new Regex("[^0-9a-zA-Z]+");
        String processName = UtilsKt.getProcessName(context);
        if (StringsKt.contains$default(processName, ':', false, 2, (Object) null)) {
            strSubstring = processName.substring(StringsKt.lastIndexOf$default(processName, ':', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (StringsKt.isBlank(strSubstring)) {
                strSubstring = "unknown";
            }
        } else {
            strSubstring = "main";
        }
        return TuplesKt.to(regex.replace(strSubstring, "_"), regex.replace(ArraysKt.joinToString$default(new String[]{context.getPackageName(), moduleName}, "_", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "_"));
    }

    public static /* synthetic */ Pair generateFileNamePrefix$utrace_sdk_log_logRelease$default(Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = UTraceApp.moduleName;
        }
        return generateFileNamePrefix$utrace_sdk_log_logRelease(context, str);
    }

    @JvmStatic
    @NotNull
    public static final String generateLogPrefix$utrace_sdk_log_logRelease(@Nullable Object that) {
        return '[' + UTraceApp.moduleName + '|' + UtilsKt.getProcessName(UTraceApp.mContext) + ']';
    }

    public static /* synthetic */ String generateLogPrefix$utrace_sdk_log_logRelease$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return generateLogPrefix$utrace_sdk_log_logRelease(obj);
    }

    @JvmStatic
    @Nullable
    public static final SafeHandlerThread newHandlerThread$utrace_sdk_log_logRelease(@NotNull String name) {
        Object obj;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.Companion;
            SafeHandlerThread safeHandlerThread = new SafeHandlerThread(name);
            safeHandlerThread.setExceptionHandler(new UTraceInternalExceptionHandler());
            safeHandlerThread.start();
            obj = Result.constructor-impl(safeHandlerThread);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        return (SafeHandlerThread) obj;
    }

    @JvmStatic
    public static final void quit$utrace_sdk_log_logRelease() {
        Handler handler;
        TraceUtil traceUtil = INSTANCE;
        SafeHandlerThread commonThread = traceUtil.getCommonThread();
        if (commonThread != null && (handler = commonThread.getHandler()) != null) {
            handler.removeCallbacksAndMessages(null);
        }
        SafeHandlerThread commonThread2 = traceUtil.getCommonThread();
        if (commonThread2 != null) {
            commonThread2.quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runSafeThread$lambda$6(Function0 function0) {
        Object obj;
        Intrinsics.checkNotNullParameter(function0, "$block");
        try {
            Result.Companion companion = Result.Companion;
            function0.invoke();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e("UTrace.Sdk.Utils", "runSafeThread exception=" + th2);
        }
    }

    @JvmStatic
    public static final void runSafeThread$utrace_sdk_log_logRelease(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        new Thread(new Runnable() { // from class: com.oplus.utrace.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                TraceUtil.runSafeThread$lambda$6(block);
            }
        }).start();
    }

    @Nullable
    public final SafeHandlerThread getCommonThread() {
        return (SafeHandlerThread) commonThread$delegate.getValue();
    }
}
