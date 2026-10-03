package com.heytap.health.hrv.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/hrv/bean/StressDayBean;", "", "()V", "chartDataList", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "getChartDataList", "()Ljava/util/List;", "setChartDataList", "(Ljava/util/List;)V", "curMaxTime", "", "getCurMaxTime", "()J", "setCurMaxTime", "(J)V", "curMinTime", "getCurMinTime", "setCurMinTime", "hrv_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StressDayBean {
    public static final int $stable = 8;

    @NotNull
    private List<TimeStampedData> chartDataList = new ArrayList();
    private long curMaxTime;
    private long curMinTime;

    @NotNull
    public final List<TimeStampedData> getChartDataList() {
        return this.chartDataList;
    }

    public final long getCurMaxTime() {
        return this.curMaxTime;
    }

    public final long getCurMinTime() {
        return this.curMinTime;
    }

    public final void setChartDataList(@NotNull List<TimeStampedData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.chartDataList = list;
    }

    public final void setCurMaxTime(long j2) {
        this.curMaxTime = j2;
    }

    public final void setCurMinTime(long j2) {
        this.curMinTime = j2;
    }
}
