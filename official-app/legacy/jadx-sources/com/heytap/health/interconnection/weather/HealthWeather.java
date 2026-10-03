package com.heytap.health.interconnection.weather;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006 "}, d2 = {"Lcom/heytap/health/interconnection/weather/HealthWeather;", "", "resultCode", "", "weatherCode", "uvIndex", "minTemp", "", "maxTemp", "humidity", "(IIIDDD)V", "getHumidity", "()D", "getMaxTemp", "getMinTemp", "getResultCode", "()I", "getUvIndex", "getWeatherCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "device_interconnection_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthWeather {
    private final double humidity;
    private final double maxTemp;
    private final double minTemp;
    private final int resultCode;
    private final int uvIndex;
    private final int weatherCode;

    public HealthWeather() {
        this(0, 0, 0, 0.0d, 0.0d, 0.0d, 63, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWeatherCode() {
        return this.weatherCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUvIndex() {
        return this.uvIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMinTemp() {
        return this.minTemp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMaxTemp() {
        return this.maxTemp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getHumidity() {
        return this.humidity;
    }

    @NotNull
    public final HealthWeather copy(int resultCode, int weatherCode, int uvIndex, double minTemp, double maxTemp, double humidity) {
        return new HealthWeather(resultCode, weatherCode, uvIndex, minTemp, maxTemp, humidity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthWeather)) {
            return false;
        }
        HealthWeather healthWeather = (HealthWeather) other;
        return this.resultCode == healthWeather.resultCode && this.weatherCode == healthWeather.weatherCode && this.uvIndex == healthWeather.uvIndex && Double.compare(this.minTemp, healthWeather.minTemp) == 0 && Double.compare(this.maxTemp, healthWeather.maxTemp) == 0 && Double.compare(this.humidity, healthWeather.humidity) == 0;
    }

    public final double getHumidity() {
        return this.humidity;
    }

    public final double getMaxTemp() {
        return this.maxTemp;
    }

    public final double getMinTemp() {
        return this.minTemp;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getUvIndex() {
        return this.uvIndex;
    }

    public final int getWeatherCode() {
        return this.weatherCode;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.weatherCode)) * 31) + Integer.hashCode(this.uvIndex)) * 31) + Double.hashCode(this.minTemp)) * 31) + Double.hashCode(this.maxTemp)) * 31) + Double.hashCode(this.humidity);
    }

    @NotNull
    public String toString() {
        return "HealthWeather(resultCode=" + this.resultCode + ", weatherCode=" + this.weatherCode + ", uvIndex=" + this.uvIndex + ", minTemp=" + this.minTemp + ", maxTemp=" + this.maxTemp + ", humidity=" + this.humidity + ")";
    }

    public HealthWeather(int i, int i2, int i3, double d, double d2, double d3) {
        this.resultCode = i;
        this.weatherCode = i2;
        this.uvIndex = i3;
        this.minTemp = d;
        this.maxTemp = d2;
        this.humidity = d3;
    }

    public /* synthetic */ HealthWeather(int i, int i2, int i3, double d, double d2, double d3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? 0.0d : d, (i4 & 16) != 0 ? 0.0d : d2, (i4 & 32) == 0 ? d3 : 0.0d);
    }
}
