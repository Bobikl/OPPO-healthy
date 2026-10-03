package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.disturb.bean.DisturbBarData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ww5, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/ww5;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "chartStartTime", "Z", "c", "()Z", "showEmptyChart", "", "Lcom/heytap/health/sleep/disturb/bean/DisturbBarData;", "Ljava/util/List;", "()Ljava/util/List;", "barDataList", "<init>", "(JZLjava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DisturbWeekBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long chartStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean showEmptyChart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<DisturbBarData> barDataList;

    /* JADX WARN: Multi-variable type inference failed */
    public DisturbWeekBean(long j2, boolean z, @NotNull List<? extends DisturbBarData> barDataList) {
        Intrinsics.checkNotNullParameter(barDataList, "barDataList");
        this.chartStartTime = j2;
        this.showEmptyChart = z;
        this.barDataList = barDataList;
    }

    @NotNull
    public final List<DisturbBarData> a() {
        return this.barDataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowEmptyChart() {
        return this.showEmptyChart;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisturbWeekBean)) {
            return false;
        }
        DisturbWeekBean disturbWeekBean = (DisturbWeekBean) other;
        return this.chartStartTime == disturbWeekBean.chartStartTime && this.showEmptyChart == disturbWeekBean.showEmptyChart && Intrinsics.areEqual(this.barDataList, disturbWeekBean.barDataList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chartStartTime) * 31;
        boolean z = this.showEmptyChart;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.barDataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DisturbWeekBean(chartStartTime=" + this.chartStartTime + ", showEmptyChart=" + this.showEmptyChart + ", barDataList=" + this.barDataList + ")";
    }
}
