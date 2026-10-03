package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.oplus.utrace.lib.HLogConst;
import com.oplus.utrace.sdk.UTraceApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/utrace/utils/UTraceInternalExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "()V", "report", "", "t", "Ljava/lang/Thread;", "e", "", "uncaughtException", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUTraceInternalExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UTraceInternalExceptionHandler.kt\ncom/oplus/utrace/utils/UTraceInternalExceptionHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,71:1\n1#2:72\n1282#3:73\n12744#3,2:74\n1283#3:76\n*S KotlinDebug\n*F\n+ 1 UTraceInternalExceptionHandler.kt\ncom/oplus/utrace/utils/UTraceInternalExceptionHandler\n*L\n32#1:73\n33#1:74,2\n32#1:76\n*E\n"})
public final class UTraceInternalExceptionHandler implements Thread.UncaughtExceptionHandler {
    public UTraceInternalExceptionHandler() {
        Context context = UTraceApp.mContext;
        if (context != null) {
            DcsWrapper.INSTANCE.init(context);
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    private final void report(Thread t, Throwable e) {
        Context context = UTraceApp.mContext;
        if (context == null) {
            return;
        }
        Pair[] pairArr = new Pair[10];
        String qualifiedName = Reflection.getOrCreateKotlinClass(e.getClass()).getQualifiedName();
        if (qualifiedName == null) {
            qualifiedName = "unknown";
        }
        pairArr[0] = TuplesKt.to("exception_class", qualifiedName);
        String message = e.getMessage();
        if (message == null) {
            message = e.toString();
        }
        pairArr[1] = TuplesKt.to("exception_message", message);
        pairArr[2] = TuplesKt.to("callstack", ExceptionsKt.stackTraceToString(e));
        pairArr[3] = TuplesKt.to("thread_name", t.getName());
        pairArr[4] = TuplesKt.to("process_name", UtilsKt.getProcessName(context));
        pairArr[5] = TuplesKt.to("sdk_version", "2.0.44-25e9612-20260202-124920");
        pairArr[6] = TuplesKt.to("app_name", context.getPackageName());
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        pairArr[7] = TuplesKt.to("app_version", UtilsKt.getAppVersionName(context, packageName));
        pairArr[8] = TuplesKt.to("module_name", UTraceApp.moduleName);
        pairArr[9] = TuplesKt.to("exception_timestamp", new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis())));
        DcsWrapper.INSTANCE.report(DcsCommon.LOG_TAG_INTERNAL, DcsCommon.EVENT_ID_CAUGHT_EXCEPTION, MapsKt.mutableMapOf(pairArr));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread t, @NotNull Throwable e) throws Throwable {
        StackTraceElement stackTraceElement;
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        StackTraceElement[] stackTrace = e.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            String[] strArr = {"com.oplus.utrace", HLogConst.HLOG_PKG};
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    z = false;
                    break;
                }
                String str = strArr[i2];
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                if (StringsKt.startsWith$default(className, str + '.', false, 2, (Object) null)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                break;
            } else {
                i++;
            }
        }
        if (!Intrinsics.areEqual(stackTraceElement != null ? Boolean.valueOf(!Intrinsics.areEqual(stackTraceElement.getClassName(), Reflection.getOrCreateKotlinClass(SafeHandlerThread.class).getQualifiedName())) : null, Boolean.TRUE)) {
            throw e;
        }
        try {
            Result.Companion companion = Result.Companion;
            Logs.INSTANCE.w("UTrace.Sdk.Exception", "caught exception in thread '" + t.getName() + "': " + e, e);
            report(t, e);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) == null || !Logs.INSTANCE.getDebuggable()) {
            return;
        }
        Log.e("UTrace.Sdk.Exception", "caught exception in uncaughtException: " + e, e);
    }
}
