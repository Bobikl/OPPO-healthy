package com.heytap.health.insight.data.datasource.net;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/RecentDataBean;", "", "date", "", "dataList", "", "Lcom/heytap/health/insight/data/datasource/net/RecentDataItem;", "(ILjava/util/List;)V", "getDataList", "()Ljava/util/List;", "getDate", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecentDataBean {
    public static final int $stable = 8;

    @NotNull
    private final List<RecentDataItem> dataList;
    private final int date;

    public RecentDataBean(int i, @NotNull List<RecentDataItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.date = i;
        this.dataList = dataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentDataBean copy$default(RecentDataBean recentDataBean, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentDataBean.date;
        }
        if ((i2 & 2) != 0) {
            list = recentDataBean.dataList;
        }
        return recentDataBean.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final List<RecentDataItem> component2() {
        return this.dataList;
    }

    @NotNull
    public final RecentDataBean copy(int date, @NotNull List<RecentDataItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new RecentDataBean(date, dataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentDataBean)) {
            return false;
        }
        RecentDataBean recentDataBean = (RecentDataBean) other;
        return this.date == recentDataBean.date && Intrinsics.areEqual(this.dataList, recentDataBean.dataList);
    }

    @NotNull
    public final List<RecentDataItem> getDataList() {
        return this.dataList;
    }

    public final int getDate() {
        return this.date;
    }

    public int hashCode() {
        return (Integer.hashCode(this.date) * 31) + this.dataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecentDataBean(date=" + this.date + ", dataList=" + this.dataList + ")";
    }
}
