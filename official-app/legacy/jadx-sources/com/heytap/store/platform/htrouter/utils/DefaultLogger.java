package com.heytap.store.platform.htrouter.utils;

import android.util.Log;
import com.heytap.store.platform.htrouter.facade.template.ILogger;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\u0013\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u001c\u0010\u0019\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/platform/htrouter/utils/DefaultLogger;", "Lcom/heytap/store/platform/htrouter/facade/template/ILogger;", "()V", "checkPrintPermissionAndReact", "", "detail", "Lkotlin/Function0;", FragmentStyle.DEBUG, "tag", "", "message", "error", MapSchema.FIELD_NAME_ENTRY, "", "getExtInfo", "stackTraceElement", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "getTag", UTraceSQLiteHelperKt.COL_INFO, "setLogSwitch", "isShowLog", "", "setStackTraceSwitch", "isShowStackTrace", "warning", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class DefaultLogger extends ILogger {
    private final void checkPrintPermissionAndReact(Function0<Unit> detail) {
        if (getIsShowLog()) {
            detail.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getExtInfo(StackTraceElement stackTraceElement) {
        StringBuilder sb = new StringBuilder("[");
        if (getIsShowStackTrace()) {
            sb.append("ThreadId = ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getId());
            sb.append(" & ");
            sb.append("ThreadName = ");
            Thread threadCurrentThread2 = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "Thread.currentThread()");
            sb.append(threadCurrentThread2.getName());
            sb.append(" & ");
            sb.append("FileName = ");
            sb.append(stackTraceElement != null ? stackTraceElement.getFileName() : null);
            sb.append(" & ");
            sb.append("ClassName = ");
            sb.append(stackTraceElement != null ? stackTraceElement.getClassName() : null);
            sb.append(" & ");
            sb.append("MethodName = ");
            sb.append(stackTraceElement != null ? stackTraceElement.getMethodName() : null);
            sb.append(" & ");
            sb.append("LineNumber = ");
            sb.append(stackTraceElement != null ? Integer.valueOf(stackTraceElement.getLineNumber()) : null);
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StackTraceElement getStackTraceElement() {
        try {
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            return threadCurrentThread.getStackTrace()[3];
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTag(String tag) {
        return tag == null || tag.length() == 0 ? getDefaultTag() : tag;
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void debug(@Nullable final String tag, @Nullable final String message) {
        checkPrintPermissionAndReact(new Function0<Unit>() { // from class: com.heytap.store.platform.htrouter.utils.DefaultLogger.debug.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String tag2 = DefaultLogger.this.getTag(tag);
                StringBuilder sb = new StringBuilder();
                sb.append(message);
                DefaultLogger defaultLogger = DefaultLogger.this;
                sb.append(defaultLogger.getExtInfo(defaultLogger.getStackTraceElement()));
                Log.i(tag2, sb.toString());
            }
        });
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void error(@Nullable final String tag, @Nullable final String message) {
        checkPrintPermissionAndReact(new Function0<Unit>() { // from class: com.heytap.store.platform.htrouter.utils.DefaultLogger.error.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String tag2 = DefaultLogger.this.getTag(tag);
                StringBuilder sb = new StringBuilder();
                sb.append(message);
                DefaultLogger defaultLogger = DefaultLogger.this;
                sb.append(defaultLogger.getExtInfo(defaultLogger.getStackTraceElement()));
                Log.e(tag2, sb.toString());
            }
        });
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void info(@Nullable final String tag, @Nullable final String message) {
        checkPrintPermissionAndReact(new Function0<Unit>() { // from class: com.heytap.store.platform.htrouter.utils.DefaultLogger.info.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String tag2 = DefaultLogger.this.getTag(tag);
                StringBuilder sb = new StringBuilder();
                sb.append(message);
                DefaultLogger defaultLogger = DefaultLogger.this;
                sb.append(defaultLogger.getExtInfo(defaultLogger.getStackTraceElement()));
                Log.i(tag2, sb.toString());
            }
        });
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void setLogSwitch(boolean isShowLog) {
        setShowLog(isShowLog);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void setStackTraceSwitch(boolean isShowStackTrace) {
        setShowStackTrace(isShowStackTrace);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void warning(@Nullable final String tag, @Nullable final String message) {
        checkPrintPermissionAndReact(new Function0<Unit>() { // from class: com.heytap.store.platform.htrouter.utils.DefaultLogger.warning.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String tag2 = DefaultLogger.this.getTag(tag);
                StringBuilder sb = new StringBuilder();
                sb.append(message);
                DefaultLogger defaultLogger = DefaultLogger.this;
                sb.append(defaultLogger.getExtInfo(defaultLogger.getStackTraceElement()));
                Log.w(tag2, sb.toString());
            }
        });
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void error(@Nullable final String tag, @Nullable final String message, @Nullable final Throwable e2) {
        checkPrintPermissionAndReact(new Function0<Unit>() { // from class: com.heytap.store.platform.htrouter.utils.DefaultLogger.error.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Log.e(DefaultLogger.this.getTag(tag), message, e2);
            }
        });
    }
}
