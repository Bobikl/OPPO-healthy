package com.oplus.pantaconnect.sdk.logger;

import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\u0004\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "", "tag", "", "logger", "Lcom/oplus/pantaconnect/sdk/logger/Logger;", "(Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/logger/Logger;)V", FragmentStyle.DEBUG, "", "msg", "error", "throwable", "", UTraceSQLiteHelperKt.COL_INFO, "level", "Lcom/oplus/pantaconnect/sdk/logger/Logger$Level;", "printPTCSdkInfo", "warning", "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SdkLogger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Logger logger;

    @NotNull
    private final String tag;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/oplus/pantaconnect/sdk/logger/SdkLogger$Companion;", "", "()V", "getDefault", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "tag", "", "logger", "Lcom/oplus/pantaconnect/sdk/logger/Logger;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SdkLogger getDefault$default(Companion companion, String str, Logger logger, int i, Object obj) {
            if ((i & 2) != 0) {
                logger = PlatformInitialization.INSTANCE.getPlatformLogger();
            }
            return companion.getDefault(str, logger);
        }

        @JvmStatic
        @NotNull
        public final SdkLogger getDefault(@NotNull String tag, @NotNull Logger logger) {
            return new SdkLogger("PTC.SDK." + tag, logger, null);
        }
    }

    public /* synthetic */ SdkLogger(String str, Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, logger);
    }

    @JvmStatic
    @NotNull
    public static final SdkLogger getDefault(@NotNull String str, @NotNull Logger logger) {
        return INSTANCE.getDefault(str, logger);
    }

    private final void logger(String msg, Logger.Level level) {
        if (msg == null) {
            msg = "empty";
        }
        this.logger.log(level, this.tag, msg);
    }

    public final void debug(@Nullable String msg) {
        logger(msg, Logger.Level.DEBUG);
    }

    public final void error(@Nullable String msg, @Nullable Throwable throwable) {
        StringBuilder sb = new StringBuilder();
        sb.append(msg);
        sb.append(throwable != null ? throwable.getMessage() : null);
        logger(sb.toString(), Logger.Level.ERROR);
    }

    public final void info(@Nullable String msg) {
        logger(msg, Logger.Level.INFO);
    }

    public final void printPTCSdkInfo() {
        logger("PantaConnect Framework version: " + PlatformInitialization.INSTANCE.getFrameworkVersionName$core_release() + ", PantaConnect SDK version: 1.0.3-betaa1cc9ef, SDK build time: dev-build-cache-friendly, SDK commit id: a1cc9ef", Logger.Level.INFO);
    }

    public final void warning(@Nullable String msg) {
        logger(msg, Logger.Level.WARNING);
    }

    private SdkLogger(String str, Logger logger) {
        this.tag = str;
        this.logger = logger;
    }

    public final void error(@Nullable String msg) {
        logger(msg, Logger.Level.ERROR);
    }

    public final void warning(@Nullable String msg, @Nullable Throwable throwable) {
        StringBuilder sb = new StringBuilder();
        sb.append(msg);
        sb.append(throwable != null ? throwable.getMessage() : null);
        logger(sb.toString(), Logger.Level.WARNING);
    }
}
