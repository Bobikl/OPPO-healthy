package com.heytap.health.insight.data.datasource.sp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/insight/data/datasource/sp/InsightHomeSp;", "", "()V", "lastFetchInsightTime", "", "getLastFetchInsightTime", "()J", "setLastFetchInsightTime", "(J)V", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InsightHomeSp {
    public static final int $stable = 8;
    private long lastFetchInsightTime = -1;

    public final long getLastFetchInsightTime() {
        return this.lastFetchInsightTime;
    }

    public final void setLastFetchInsightTime(long j2) {
        this.lastFetchInsightTime = j2;
    }
}
