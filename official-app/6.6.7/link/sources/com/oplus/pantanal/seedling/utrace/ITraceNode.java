package com.oplus.pantanal.seedling.utrace;

import android.os.Bundle;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J$\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\bH&J$\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\bH&J$\u0010\u0012\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH&J0\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00162\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH&J&\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH&J0\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016H&J0\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016H&¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/utrace/ITraceNode;", "", "endCompleteNodeTrace", "", "resultCode", "", ParserTag.TAG_FLAG, "traceCtxJson", "", "endNodeTrace", "traceCtxStr", "isComplete", "", "errorCodeTrace", "bundle", "Landroid/os/Bundle;", "errorCode", "errorMsg", "errorNodeTrace", UTraceSQLiteHelperKt.COL_SPAN_NAME, "startHeadCodeTrace", UTraceSQLiteHelperKt.COL_TAGS, "", "startHeadNodeTrace", TraceConstants.KEY_PKG_NAME, TraceConstants.KEY_ACTION, "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "intents", "", "startNodeTrace", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ITraceNode {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void endNodeTrace$default(ITraceNode iTraceNode, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endNodeTrace");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        iTraceNode.endNodeTrace(str, z);
    }

    static /* synthetic */ void errorCodeTrace$default(ITraceNode iTraceNode, Bundle bundle, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorCodeTrace");
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        iTraceNode.errorCodeTrace(bundle, i, str);
    }

    static /* synthetic */ void errorNodeTrace$default(ITraceNode iTraceNode, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorNodeTrace");
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        iTraceNode.errorNodeTrace(str, str2, str3);
    }

    static /* synthetic */ String startHeadCodeTrace$default(ITraceNode iTraceNode, String str, Map map, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startHeadCodeTrace");
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        return iTraceNode.startHeadCodeTrace(str, map, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String startNodeTrace$default(ITraceNode iTraceNode, Bundle bundle, String str, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startNodeTrace");
        }
        if ((i & 4) != 0) {
            map = null;
        }
        return iTraceNode.startNodeTrace(bundle, str, (Map<String, String>) map);
    }

    void endCompleteNodeTrace(int resultCode, int flag, @NotNull String traceCtxJson);

    void endNodeTrace(@Nullable String traceCtxStr, boolean isComplete);

    void errorCodeTrace(@Nullable Bundle bundle, int errorCode, @NotNull String errorMsg);

    void errorCodeTrace(@Nullable String traceCtxStr, int errorCode, @NotNull String errorMsg);

    void errorNodeTrace(@Nullable String traceCtxStr, @NotNull String spanName, @NotNull String errorMsg);

    @NotNull
    String startHeadCodeTrace(@NotNull String spanName, @NotNull Map<String, String> tags, @Nullable Bundle bundle);

    @NotNull
    String startHeadNodeTrace(@NotNull String pkgName, @NotNull SeedlingIntent intent, @NotNull Bundle bundle);

    @NotNull
    String startHeadNodeTrace(@NotNull String pkgName, @NotNull List<SeedlingIntent> intents, @NotNull Bundle bundle);

    @NotNull
    String startNodeTrace(@NotNull Bundle bundle, @NotNull String spanName, @Nullable Map<String, String> tags);

    @NotNull
    String startNodeTrace(@NotNull String traceCtxJson, @NotNull String spanName, @Nullable Map<String, String> tags);

    static /* synthetic */ void errorCodeTrace$default(ITraceNode iTraceNode, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorCodeTrace");
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        iTraceNode.errorCodeTrace(str, i, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String startNodeTrace$default(ITraceNode iTraceNode, String str, String str2, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startNodeTrace");
        }
        if ((i & 4) != 0) {
            map = null;
        }
        return iTraceNode.startNodeTrace(str, str2, (Map<String, String>) map);
    }
}
