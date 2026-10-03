package com.heytap.store.platform.htrouter.facade.template;

import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&J&\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\nH&J\u001c\u0010\u001a\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/template/ILogger;", "", "()V", "defaultTag", "", "getDefaultTag", "()Ljava/lang/String;", "setDefaultTag", "(Ljava/lang/String;)V", "isShowLog", "", "()Z", "setShowLog", "(Z)V", "isShowStackTrace", "setShowStackTrace", FragmentStyle.DEBUG, "", "tag", "message", "error", MapSchema.FIELD_NAME_ENTRY, "", UTraceSQLiteHelperKt.COL_INFO, "setLogSwitch", "setStackTraceSwitch", "warning", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public abstract class ILogger {

    @NotNull
    private String defaultTag = "HTRouter::";
    private boolean isShowLog;
    private boolean isShowStackTrace;

    public abstract void debug(@Nullable String tag, @Nullable String message);

    public abstract void error(@Nullable String tag, @Nullable String message);

    public abstract void error(@Nullable String tag, @Nullable String message, @Nullable Throwable e2);

    @NotNull
    public final String getDefaultTag() {
        return this.defaultTag;
    }

    public abstract void info(@Nullable String tag, @Nullable String message);

    /* JADX INFO: renamed from: isShowLog, reason: from getter */
    public final boolean getIsShowLog() {
        return this.isShowLog;
    }

    /* JADX INFO: renamed from: isShowStackTrace, reason: from getter */
    public final boolean getIsShowStackTrace() {
        return this.isShowStackTrace;
    }

    public final void setDefaultTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultTag = str;
    }

    public abstract void setLogSwitch(boolean isShowLog);

    public final void setShowLog(boolean z) {
        this.isShowLog = z;
    }

    public final void setShowStackTrace(boolean z) {
        this.isShowStackTrace = z;
    }

    public abstract void setStackTraceSwitch(boolean isShowStackTrace);

    public abstract void warning(@Nullable String tag, @Nullable String message);
}
