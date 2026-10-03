package com.heytap.store.platform.htrouter.base;

import com.heytap.store.platform.htrouter.facade.template.ILogger;
import com.heytap.store.platform.htrouter.utils.DefaultLogger;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/platform/htrouter/base/InternalGlobalLogger;", "Lcom/heytap/store/platform/htrouter/facade/template/ILogger;", "logger", "(Lcom/heytap/store/platform/htrouter/facade/template/ILogger;)V", FragmentStyle.DEBUG, "", "tag", "", "message", "error", MapSchema.FIELD_NAME_ENTRY, "", UTraceSQLiteHelperKt.COL_INFO, "setLogSwitch", "isShowLog", "", "setLogger", "iLogger", "setStackTraceSwitch", "isShowStackTrace", "warning", "Companion", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class InternalGlobalLogger extends ILogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<InternalGlobalLogger>() { // from class: com.heytap.store.platform.htrouter.base.InternalGlobalLogger$Companion$INSTANCE$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final InternalGlobalLogger invoke() {
            return new InternalGlobalLogger(null, 1, 0 == true ? 1 : 0);
        }
    });

    @JvmField
    @NotNull
    public ILogger logger;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/htrouter/base/InternalGlobalLogger$Companion;", "", "()V", "INSTANCE", "Lcom/heytap/store/platform/htrouter/base/InternalGlobalLogger;", "getINSTANCE", "()Lcom/heytap/store/platform/htrouter/base/InternalGlobalLogger;", "INSTANCE$delegate", "Lkotlin/Lazy;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InternalGlobalLogger getINSTANCE() {
            return (InternalGlobalLogger) InternalGlobalLogger.INSTANCE$delegate.getValue();
        }
    }

    private InternalGlobalLogger(ILogger iLogger) {
        this.logger = iLogger;
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void debug(@Nullable String tag, @Nullable String message) {
        this.logger.debug(tag, message);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void error(@Nullable String tag, @Nullable String message) {
        this.logger.error(tag, message);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void info(@Nullable String tag, @Nullable String message) {
        this.logger.info(tag, message);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void setLogSwitch(boolean isShowLog) {
        this.logger.setLogSwitch(isShowLog);
    }

    public final void setLogger(@NotNull ILogger iLogger) {
        Intrinsics.checkNotNullParameter(iLogger, "iLogger");
        this.logger = iLogger;
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void setStackTraceSwitch(boolean isShowStackTrace) {
        this.logger.setStackTraceSwitch(isShowStackTrace);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void warning(@Nullable String tag, @Nullable String message) {
        this.logger.warning(tag, message);
    }

    public /* synthetic */ InternalGlobalLogger(ILogger iLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefaultLogger() : iLogger);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.ILogger
    public void error(@Nullable String tag, @Nullable String message, @Nullable Throwable e2) {
        this.logger.error(tag, message, e2);
    }
}
