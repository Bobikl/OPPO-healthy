package com.heytap.health.interconnection.weather;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetailItem;", "", ClickApiEntity.TIME, "", "sunriseTime", "sunsetTime", "(JJJ)V", "getSunriseTime", "()J", "setSunriseTime", "(J)V", "getSunsetTime", "setSunsetTime", "getTime", "setTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_interconnection_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DailyWeatherForecastDetailItem {
    private long sunriseTime;
    private long sunsetTime;
    private long time;

    public DailyWeatherForecastDetailItem() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ DailyWeatherForecastDetailItem copy$default(DailyWeatherForecastDetailItem dailyWeatherForecastDetailItem, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = dailyWeatherForecastDetailItem.time;
        }
        long j5 = j2;
        if ((i & 2) != 0) {
            j3 = dailyWeatherForecastDetailItem.sunriseTime;
        }
        long j6 = j3;
        if ((i & 4) != 0) {
            j4 = dailyWeatherForecastDetailItem.sunsetTime;
        }
        return dailyWeatherForecastDetailItem.copy(j5, j6, j4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSunriseTime() {
        return this.sunriseTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSunsetTime() {
        return this.sunsetTime;
    }

    @NotNull
    public final DailyWeatherForecastDetailItem copy(long time, long sunriseTime, long sunsetTime) {
        return new DailyWeatherForecastDetailItem(time, sunriseTime, sunsetTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyWeatherForecastDetailItem)) {
            return false;
        }
        DailyWeatherForecastDetailItem dailyWeatherForecastDetailItem = (DailyWeatherForecastDetailItem) other;
        return this.time == dailyWeatherForecastDetailItem.time && this.sunriseTime == dailyWeatherForecastDetailItem.sunriseTime && this.sunsetTime == dailyWeatherForecastDetailItem.sunsetTime;
    }

    public final long getSunriseTime() {
        return this.sunriseTime;
    }

    public final long getSunsetTime() {
        return this.sunsetTime;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Long.hashCode(this.sunriseTime)) * 31) + Long.hashCode(this.sunsetTime);
    }

    public final void setSunriseTime(long j2) {
        this.sunriseTime = j2;
    }

    public final void setSunsetTime(long j2) {
        this.sunsetTime = j2;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    @NotNull
    public String toString() {
        return "DailyWeatherForecastDetailItem(time=" + this.time + ", sunriseTime=" + this.sunriseTime + ", sunsetTime=" + this.sunsetTime + ")";
    }

    public DailyWeatherForecastDetailItem(long j2, long j3, long j4) {
        this.time = j2;
        this.sunriseTime = j3;
        this.sunsetTime = j4;
    }

    public /* synthetic */ DailyWeatherForecastDetailItem(long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j4);
    }
}
