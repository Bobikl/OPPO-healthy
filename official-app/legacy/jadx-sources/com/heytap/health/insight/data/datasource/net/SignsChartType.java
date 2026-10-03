package com.heytap.health.insight.data.datasource.net;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/SignsChartType;", "", "chartType", "", "maxVer", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getChartType", "()Ljava/lang/String;", "getMaxVer", "()I", "COMBINED_SIGN", "HORIZON", "COLOR", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SignsChartType {
    COMBINED_SIGN("lineBar", 1),
    HORIZON("horizonBar", 0),
    COLOR("zoneBar", 0);


    @NotNull
    private final String chartType;
    private final int maxVer;

    SignsChartType(String str, int i) {
        this.chartType = str;
        this.maxVer = i;
    }

    @NotNull
    public final String getChartType() {
        return this.chartType;
    }

    public final int getMaxVer() {
        return this.maxVer;
    }
}
