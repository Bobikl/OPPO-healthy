package com.heytap.health.interconnection.weather;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/health/interconnection/weather/UltraVioleResponseData;", "", "dailyForecast", "Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetail;", "hourlyForeCast", "Lcom/heytap/health/interconnection/weather/UltraVioleData;", "realTimeData", "Lcom/heytap/health/interconnection/weather/UltravioletItem;", "(Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetail;Lcom/heytap/health/interconnection/weather/UltraVioleData;Lcom/heytap/health/interconnection/weather/UltravioletItem;)V", "getDailyForecast", "()Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetail;", "setDailyForecast", "(Lcom/heytap/health/interconnection/weather/DailyWeatherForecastDetail;)V", "getHourlyForeCast", "()Lcom/heytap/health/interconnection/weather/UltraVioleData;", "setHourlyForeCast", "(Lcom/heytap/health/interconnection/weather/UltraVioleData;)V", "getRealTimeData", "()Lcom/heytap/health/interconnection/weather/UltravioletItem;", "setRealTimeData", "(Lcom/heytap/health/interconnection/weather/UltravioletItem;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_interconnection_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UltraVioleResponseData {

    @Nullable
    private DailyWeatherForecastDetail dailyForecast;

    @Nullable
    private UltraVioleData hourlyForeCast;

    @Nullable
    private UltravioletItem realTimeData;

    public UltraVioleResponseData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UltraVioleResponseData copy$default(UltraVioleResponseData ultraVioleResponseData, DailyWeatherForecastDetail dailyWeatherForecastDetail, UltraVioleData ultraVioleData, UltravioletItem ultravioletItem, int i, Object obj) {
        if ((i & 1) != 0) {
            dailyWeatherForecastDetail = ultraVioleResponseData.dailyForecast;
        }
        if ((i & 2) != 0) {
            ultraVioleData = ultraVioleResponseData.hourlyForeCast;
        }
        if ((i & 4) != 0) {
            ultravioletItem = ultraVioleResponseData.realTimeData;
        }
        return ultraVioleResponseData.copy(dailyWeatherForecastDetail, ultraVioleData, ultravioletItem);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DailyWeatherForecastDetail getDailyForecast() {
        return this.dailyForecast;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UltraVioleData getHourlyForeCast() {
        return this.hourlyForeCast;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UltravioletItem getRealTimeData() {
        return this.realTimeData;
    }

    @NotNull
    public final UltraVioleResponseData copy(@Nullable DailyWeatherForecastDetail dailyForecast, @Nullable UltraVioleData hourlyForeCast, @Nullable UltravioletItem realTimeData) {
        return new UltraVioleResponseData(dailyForecast, hourlyForeCast, realTimeData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UltraVioleResponseData)) {
            return false;
        }
        UltraVioleResponseData ultraVioleResponseData = (UltraVioleResponseData) other;
        return Intrinsics.areEqual(this.dailyForecast, ultraVioleResponseData.dailyForecast) && Intrinsics.areEqual(this.hourlyForeCast, ultraVioleResponseData.hourlyForeCast) && Intrinsics.areEqual(this.realTimeData, ultraVioleResponseData.realTimeData);
    }

    @Nullable
    public final DailyWeatherForecastDetail getDailyForecast() {
        return this.dailyForecast;
    }

    @Nullable
    public final UltraVioleData getHourlyForeCast() {
        return this.hourlyForeCast;
    }

    @Nullable
    public final UltravioletItem getRealTimeData() {
        return this.realTimeData;
    }

    public int hashCode() {
        DailyWeatherForecastDetail dailyWeatherForecastDetail = this.dailyForecast;
        int iHashCode = (dailyWeatherForecastDetail == null ? 0 : dailyWeatherForecastDetail.hashCode()) * 31;
        UltraVioleData ultraVioleData = this.hourlyForeCast;
        int iHashCode2 = (iHashCode + (ultraVioleData == null ? 0 : ultraVioleData.hashCode())) * 31;
        UltravioletItem ultravioletItem = this.realTimeData;
        return iHashCode2 + (ultravioletItem != null ? ultravioletItem.hashCode() : 0);
    }

    public final void setDailyForecast(@Nullable DailyWeatherForecastDetail dailyWeatherForecastDetail) {
        this.dailyForecast = dailyWeatherForecastDetail;
    }

    public final void setHourlyForeCast(@Nullable UltraVioleData ultraVioleData) {
        this.hourlyForeCast = ultraVioleData;
    }

    public final void setRealTimeData(@Nullable UltravioletItem ultravioletItem) {
        this.realTimeData = ultravioletItem;
    }

    @NotNull
    public String toString() {
        return "UltraVioleResponseData(dailyForecast=" + this.dailyForecast + ", hourlyForeCast=" + this.hourlyForeCast + ", realTimeData=" + this.realTimeData + ")";
    }

    public UltraVioleResponseData(@Nullable DailyWeatherForecastDetail dailyWeatherForecastDetail, @Nullable UltraVioleData ultraVioleData, @Nullable UltravioletItem ultravioletItem) {
        this.dailyForecast = dailyWeatherForecastDetail;
        this.hourlyForeCast = ultraVioleData;
        this.realTimeData = ultravioletItem;
    }

    public /* synthetic */ UltraVioleResponseData(DailyWeatherForecastDetail dailyWeatherForecastDetail, UltraVioleData ultraVioleData, UltravioletItem ultravioletItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dailyWeatherForecastDetail, (i & 2) != 0 ? null : ultraVioleData, (i & 4) != 0 ? null : ultravioletItem);
    }
}
