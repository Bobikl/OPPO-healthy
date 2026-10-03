package com.heytap.health.bitmap;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/bitmap/HeartRateCandleBean;", "", "hour", "", "low", "high", "(III)V", "getHigh", "()I", "getHour", "getLow", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HeartRateCandleBean {
    public static final int $stable = 0;
    private final int high;
    private final int hour;
    private final int low;

    public HeartRateCandleBean(int i, int i2, int i3) {
        this.hour = i;
        this.low = i2;
        this.high = i3;
    }

    public static /* synthetic */ HeartRateCandleBean copy$default(HeartRateCandleBean heartRateCandleBean, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = heartRateCandleBean.hour;
        }
        if ((i4 & 2) != 0) {
            i2 = heartRateCandleBean.low;
        }
        if ((i4 & 4) != 0) {
            i3 = heartRateCandleBean.high;
        }
        return heartRateCandleBean.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHigh() {
        return this.high;
    }

    @NotNull
    public final HeartRateCandleBean copy(int hour, int low, int high) {
        return new HeartRateCandleBean(hour, low, high);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateCandleBean)) {
            return false;
        }
        HeartRateCandleBean heartRateCandleBean = (HeartRateCandleBean) other;
        return this.hour == heartRateCandleBean.hour && this.low == heartRateCandleBean.low && this.high == heartRateCandleBean.high;
    }

    public final int getHigh() {
        return this.high;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getLow() {
        return this.low;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.low)) * 31) + Integer.hashCode(this.high);
    }

    @NotNull
    public String toString() {
        return "HeartRateCandleBean(hour=" + this.hour + ", low=" + this.low + ", high=" + this.high + ")";
    }
}
