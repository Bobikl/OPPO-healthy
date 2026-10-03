package com.heytap.store.apm.config;

import androidx.camera.core.RetryPolicy;
import com.nearme.instant.xcard.track.IEventTrackerKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001b¨\u0006%"}, d2 = {"Lcom/heytap/store/apm/config/ApmConfig;", "", "()V", "apmEnable", "", "getApmEnable", "()Z", "setApmEnable", "(Z)V", "ctaPassed", "getCtaPassed", "setCtaPassed", "errorKey", "", "", "getErrorKey", "()Ljava/util/List;", "setErrorKey", "(Ljava/util/List;)V", IEventTrackerKt.CFG_LOG_ENABLE, "getLogEnable", "setLogEnable", "pageTimeOut", "", "getPageTimeOut", "()J", "setPageTimeOut", "(J)V", "pageTrackerEnable", "getPageTrackerEnable", "setPageTrackerEnable", "reportEnable", "getReportEnable", "setReportEnable", "timeOut", "getTimeOut", "setTimeOut", "apm_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApmConfig {
    private boolean ctaPassed;
    private boolean logEnable;
    private boolean apmEnable = true;
    private long timeOut = RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
    private long pageTimeOut = 5000;
    private boolean reportEnable = true;

    @NotNull
    private List<String> errorKey = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"加载失败", "系统繁忙", "网络繁忙", "下架"});
    private boolean pageTrackerEnable = true;

    public final boolean getApmEnable() {
        return this.apmEnable;
    }

    public final boolean getCtaPassed() {
        return this.ctaPassed;
    }

    @NotNull
    public final List<String> getErrorKey() {
        return this.errorKey;
    }

    public final boolean getLogEnable() {
        return this.logEnable;
    }

    public final long getPageTimeOut() {
        return this.pageTimeOut;
    }

    public final boolean getPageTrackerEnable() {
        return this.pageTrackerEnable;
    }

    public final boolean getReportEnable() {
        return this.reportEnable;
    }

    public final long getTimeOut() {
        return this.timeOut;
    }

    public final void setApmEnable(boolean z) {
        this.apmEnable = z;
    }

    public final void setCtaPassed(boolean z) {
        this.ctaPassed = z;
    }

    public final void setErrorKey(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.errorKey = list;
    }

    public final void setLogEnable(boolean z) {
        this.logEnable = z;
    }

    public final void setPageTimeOut(long j2) {
        this.pageTimeOut = j2;
    }

    public final void setPageTrackerEnable(boolean z) {
        this.pageTrackerEnable = z;
    }

    public final void setReportEnable(boolean z) {
        this.reportEnable = z;
    }

    public final void setTimeOut(long j2) {
        this.timeOut = j2;
    }
}
