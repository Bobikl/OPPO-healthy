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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lcom/heytap/health/interconnection/weather/UltraVioleBean;", "", "forecastTime", "", "expireTime", "hourlyWeatherForecastDetailList", "", "Lcom/heytap/health/interconnection/weather/UltravioletItem;", "sunriseTime", "sunsetTime", "(JJLjava/util/List;JJ)V", "getExpireTime", "()J", "setExpireTime", "(J)V", "getForecastTime", "setForecastTime", "getHourlyWeatherForecastDetailList", "()Ljava/util/List;", "setHourlyWeatherForecastDetailList", "(Ljava/util/List;)V", "getSunriseTime", "setSunriseTime", "getSunsetTime", "setSunsetTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_interconnection_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UltraVioleBean {
    private long expireTime;
    private long forecastTime;

    @Nullable
    private List<UltravioletItem> hourlyWeatherForecastDetailList;
    private long sunriseTime;
    private long sunsetTime;

    public UltraVioleBean() {
        this(0L, 0L, null, 0L, 0L, 31, null);
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
    public final List<UltravioletItem> component3() {
        return this.hourlyWeatherForecastDetailList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSunriseTime() {
        return this.sunriseTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSunsetTime() {
        return this.sunsetTime;
    }

    @NotNull
    public final UltraVioleBean copy(long forecastTime, long expireTime, @Nullable List<UltravioletItem> hourlyWeatherForecastDetailList, long sunriseTime, long sunsetTime) {
        return new UltraVioleBean(forecastTime, expireTime, hourlyWeatherForecastDetailList, sunriseTime, sunsetTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UltraVioleBean)) {
            return false;
        }
        UltraVioleBean ultraVioleBean = (UltraVioleBean) other;
        return this.forecastTime == ultraVioleBean.forecastTime && this.expireTime == ultraVioleBean.expireTime && Intrinsics.areEqual(this.hourlyWeatherForecastDetailList, ultraVioleBean.hourlyWeatherForecastDetailList) && this.sunriseTime == ultraVioleBean.sunriseTime && this.sunsetTime == ultraVioleBean.sunsetTime;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final long getForecastTime() {
        return this.forecastTime;
    }

    @Nullable
    public final List<UltravioletItem> getHourlyWeatherForecastDetailList() {
        return this.hourlyWeatherForecastDetailList;
    }

    public final long getSunriseTime() {
        return this.sunriseTime;
    }

    public final long getSunsetTime() {
        return this.sunsetTime;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.forecastTime) * 31) + Long.hashCode(this.expireTime)) * 31;
        List<UltravioletItem> list = this.hourlyWeatherForecastDetailList;
        return ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.sunriseTime)) * 31) + Long.hashCode(this.sunsetTime);
    }

    public final void setExpireTime(long j2) {
        this.expireTime = j2;
    }

    public final void setForecastTime(long j2) {
        this.forecastTime = j2;
    }

    public final void setHourlyWeatherForecastDetailList(@Nullable List<UltravioletItem> list) {
        this.hourlyWeatherForecastDetailList = list;
    }

    public final void setSunriseTime(long j2) {
        this.sunriseTime = j2;
    }

    public final void setSunsetTime(long j2) {
        this.sunsetTime = j2;
    }

    @NotNull
    public String toString() {
        return "UltraVioleBean(forecastTime=" + this.forecastTime + ", expireTime=" + this.expireTime + ", hourlyWeatherForecastDetailList=" + this.hourlyWeatherForecastDetailList + ", sunriseTime=" + this.sunriseTime + ", sunsetTime=" + this.sunsetTime + ")";
    }

    public UltraVioleBean(long j2, long j3, @Nullable List<UltravioletItem> list, long j4, long j5) {
        this.forecastTime = j2;
        this.expireTime = j3;
        this.hourlyWeatherForecastDetailList = list;
        this.sunriseTime = j4;
        this.sunsetTime = j5;
    }

    public /* synthetic */ UltraVioleBean(long j2, long j3, List list, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? null : list, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5);
    }
}
