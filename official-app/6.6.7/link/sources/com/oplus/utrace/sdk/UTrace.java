package com.oplus.utrace.sdk;

import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0007J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J$\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\nH\u0007J\"\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\nH\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J*\u0010\u001c\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/oplus/utrace/sdk/UTrace;", "", "()V", "utraceContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "addSpanTags", "", "myCtx", UTraceSQLiteHelperKt.COL_TAGS, "", "", "addTraceTags", "clearContext", TextEntity.ELLIPSIZE_END, "completionType", "Lcom/oplus/utrace/sdk/CompletionType;", "crossDevice", "", "error", "errorInfo", "errorCode", "", "getContext", "setContext", "setFlag", ParserTag.TAG_FLAG, "value", "", TextEntity.ELLIPSIZE_START, UTraceSQLiteHelperKt.COL_SPAN_ID, UTraceSQLiteHelperKt.COL_SPAN_NAME, "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UTrace {

    @NotNull
    public static final UTrace INSTANCE = new UTrace();

    @NotNull
    private static final UTraceContext utraceContext = new UTraceContext();

    private UTrace() {
    }

    @JvmStatic
    public static final void addSpanTags(@NotNull UTraceContext myCtx, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(myCtx, "myCtx");
        Intrinsics.checkNotNullParameter(tags, UTraceSQLiteHelperKt.COL_TAGS);
    }

    @JvmStatic
    public static final void addTraceTags(@NotNull UTraceContext myCtx, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(myCtx, "myCtx");
        Intrinsics.checkNotNullParameter(tags, UTraceSQLiteHelperKt.COL_TAGS);
    }

    @JvmStatic
    public static final void clearContext() {
    }

    @JvmStatic
    @JvmOverloads
    public static final void end(@NotNull UTraceContext uTraceContext) {
        Intrinsics.checkNotNullParameter(uTraceContext, "myCtx");
        end$default(uTraceContext, null, false, 6, null);
    }

    public static /* synthetic */ void end$default(UTraceContext uTraceContext, CompletionType completionType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            completionType = CompletionType.GOAHEAD;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        end(uTraceContext, completionType, z);
    }

    @JvmStatic
    public static final void error(@Nullable UTraceContext myCtx, int errorCode, @NotNull String errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
    }

    @JvmStatic
    @Nullable
    public static final UTraceContext getContext() {
        return utraceContext;
    }

    @JvmStatic
    public static final void setContext(@NotNull UTraceContext myCtx) {
        Intrinsics.checkNotNullParameter(myCtx, "myCtx");
    }

    @JvmStatic
    public static final void setFlag(@NotNull UTraceContext myCtx, int flag, long value) {
        Intrinsics.checkNotNullParameter(myCtx, "myCtx");
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UTraceContext start(@Nullable UTraceContext uTraceContext) {
        return start$default(uTraceContext, null, null, 6, null);
    }

    public static /* synthetic */ UTraceContext start$default(UTraceContext uTraceContext, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return start(uTraceContext, str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final void end(@NotNull UTraceContext uTraceContext, @NotNull CompletionType completionType) {
        Intrinsics.checkNotNullParameter(uTraceContext, "myCtx");
        Intrinsics.checkNotNullParameter(completionType, "completionType");
        end$default(uTraceContext, completionType, false, 4, null);
    }

    @Deprecated(message = "请使用带 error code 的接口")
    @JvmStatic
    public static final void error(@NotNull UTraceContext myCtx, @NotNull String errorInfo) {
        Intrinsics.checkNotNullParameter(myCtx, "myCtx");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UTraceContext start(@Nullable UTraceContext uTraceContext, @Nullable String str) {
        return start$default(uTraceContext, str, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void end(@NotNull UTraceContext myCtx, @NotNull CompletionType completionType, boolean crossDevice) {
        Intrinsics.checkNotNullParameter(myCtx, "myCtx");
        Intrinsics.checkNotNullParameter(completionType, "completionType");
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UTraceContext start(@Nullable UTraceContext myCtx, @Nullable String spanId, @Nullable String spanName) {
        return utraceContext;
    }
}
