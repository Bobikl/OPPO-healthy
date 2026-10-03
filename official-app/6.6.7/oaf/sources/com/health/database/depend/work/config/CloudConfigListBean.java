package com.health.database.depend.work.config;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/health/database/depend/work/config/CloudConfigListBean;", "", "startTime", "", "endTime", "rate", "(III)V", "getEndTime", "()I", "setEndTime", "(I)V", "getRate", "setRate", "getStartTime", "setStartTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "depend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CloudConfigListBean {
    private int endTime;
    private int rate;
    private int startTime;

    public CloudConfigListBean() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ CloudConfigListBean copy$default(CloudConfigListBean cloudConfigListBean, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cloudConfigListBean.startTime;
        }
        if ((i4 & 2) != 0) {
            i2 = cloudConfigListBean.endTime;
        }
        if ((i4 & 4) != 0) {
            i3 = cloudConfigListBean.rate;
        }
        return cloudConfigListBean.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRate() {
        return this.rate;
    }

    @NotNull
    public final CloudConfigListBean copy(int startTime, int endTime, int rate) {
        return new CloudConfigListBean(startTime, endTime, rate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudConfigListBean)) {
            return false;
        }
        CloudConfigListBean cloudConfigListBean = (CloudConfigListBean) other;
        return this.startTime == cloudConfigListBean.startTime && this.endTime == cloudConfigListBean.endTime && this.rate == cloudConfigListBean.rate;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getRate() {
        return this.rate;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.endTime)) * 31) + Integer.hashCode(this.rate);
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setRate(int i) {
        this.rate = i;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    @NotNull
    public String toString() {
        return "CloudConfigListBean(startTime=" + this.startTime + ", endTime=" + this.endTime + ", rate=" + this.rate + ")";
    }

    public CloudConfigListBean(int i, int i2, int i3) {
        this.startTime = i;
        this.endTime = i2;
        this.rate = i3;
    }

    public /* synthetic */ CloudConfigListBean(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
