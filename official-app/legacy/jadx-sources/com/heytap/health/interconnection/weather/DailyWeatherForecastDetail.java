package com.heytap.health.interconnection.weather;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetail;", "", "forecastTime", "", "expireTime", "dailyWeatherForecastDetailList", "", "Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetailItem;", "(JJLjava/util/List;)V", "getDailyWeatherForecastDetailList", "()Ljava/util/List;", "setDailyWeatherForecastDetailList", "(Ljava/util/List;)V", "getExpireTime", "()J", "setExpireTime", "(J)V", "getForecastTime", "setForecastTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_interconnection_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DailyWeatherForecastDetail {

    @Nullable
    private List<DailyWeatherForecastDetailItem> dailyWeatherForecastDetailList;
    private long expireTime;
    private long forecastTime;

    public DailyWeatherForecastDetail() {
        this(0L, 0L, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyWeatherForecastDetail copy$default(DailyWeatherForecastDetail dailyWeatherForecastDetail, long j2, long j3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = dailyWeatherForecastDetail.forecastTime;
        }
        long j4 = j2;
        if ((i & 2) != 0) {
            j3 = dailyWeatherForecastDetail.expireTime;
        }
        long j5 = j3;
        if ((i & 4) != 0) {
            list = dailyWeatherForecastDetail.dailyWeatherForecastDetailList;
        }
        return dailyWeatherForecastDetail.copy(j4, j5, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getForecastTime() {
        return this.forecastTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final List<DailyWeatherForecastDetailItem> component3() {
        return this.dailyWeatherForecastDetailList;
    }

    @NotNull
    public final DailyWeatherForecastDetail copy(long forecastTime, long expireTime, @Nullable List<DailyWeatherForecastDetailItem> dailyWeatherForecastDetailList) {
        return new DailyWeatherForecastDetail(forecastTime, expireTime, dailyWeatherForecastDetailList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyWeatherForecastDetail)) {
            return false;
        }
        DailyWeatherForecastDetail dailyWeatherForecastDetail = (DailyWeatherForecastDetail) other;
        return this.forecastTime == dailyWeatherForecastDetail.forecastTime && this.expireTime == dailyWeatherForecastDetail.expireTime && Intrinsics.areEqual(this.dailyWeatherForecastDetailList, dailyWeatherForecastDetail.dailyWeatherForecastDetailList);
    }

    @Nullable
    public final List<DailyWeatherForecastDetailItem> getDailyWeatherForecastDetailList() {
        return this.dailyWeatherForecastDetailList;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final long getForecastTime() {
        return this.forecastTime;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.forecastTime) * 31) + Long.hashCode(this.expireTime)) * 31;
        List<DailyWeatherForecastDetailItem> list = this.dailyWeatherForecastDetailList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setDailyWeatherForecastDetailList(@Nullable List<DailyWeatherForecastDetailItem> list) {
        this.dailyWeatherForecastDetailList = list;
    }

    public final void setExpireTime(long j2) {
        this.expireTime = j2;
    }

    public final void setForecastTime(long j2) {
        this.forecastTime = j2;
    }

    @NotNull
    public String toString() {
        return "DailyWeatherForecastDetail(forecastTime=" + this.forecastTime + ", expireTime=" + this.expireTime + ", dailyWeatherForecastDetailList=" + this.dailyWeatherForecastDetailList + ")";
    }

    public DailyWeatherForecastDetail(long j2, long j3, @Nullable List<DailyWeatherForecastDetailItem> list) {
        this.forecastTime = j2;
        this.expireTime = j3;
        this.dailyWeatherForecastDetailList = list;
    }

    public /* synthetic */ DailyWeatherForecastDetail(long j2, long j3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? null : list);
    }
}
