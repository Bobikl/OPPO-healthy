package com.heytap.health.interconnection.weather;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018Jt\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012¨\u0006:"}, d2 = {"Lcom/heytap/health/interconnection/weather/UltravioletItem;", "", "hourth", "", ClickApiEntity.TIME, "", "weatherCode", "darkWeatherIcon", "", "weatherIcon", "weatherDesc", "temp", "rainProbability", "uvIndex", "(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDarkWeatherIcon", "()Ljava/lang/String;", "setDarkWeatherIcon", "(Ljava/lang/String;)V", "getHourth", "()I", "setHourth", "(I)V", "getRainProbability", "()Ljava/lang/Integer;", "setRainProbability", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTemp", "setTemp", "getTime", "()J", "setTime", "(J)V", "getUvIndex", "setUvIndex", "getWeatherCode", "setWeatherCode", "getWeatherDesc", "setWeatherDesc", "getWeatherIcon", "setWeatherIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/interconnection/weather/UltravioletItem;", "equals", "", "other", "hashCode", "toString", "device_interconnection_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UltravioletItem {

    @Nullable
    private String darkWeatherIcon;
    private int hourth;

    @Nullable
    private Integer rainProbability;

    @Nullable
    private Integer temp;
    private long time;

    @Nullable
    private Integer uvIndex;
    private int weatherCode;

    @Nullable
    private String weatherDesc;

    @Nullable
    private String weatherIcon;

    public UltravioletItem() {
        this(0, 0L, 0, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHourth() {
        return this.hourth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWeatherCode() {
        return this.weatherCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDarkWeatherIcon() {
        return this.darkWeatherIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWeatherIcon() {
        return this.weatherIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWeatherDesc() {
        return this.weatherDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTemp() {
        return this.temp;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getRainProbability() {
        return this.rainProbability;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getUvIndex() {
        return this.uvIndex;
    }

    @NotNull
    public final UltravioletItem copy(int hourth, long time, int weatherCode, @Nullable String darkWeatherIcon, @Nullable String weatherIcon, @Nullable String weatherDesc, @Nullable Integer temp, @Nullable Integer rainProbability, @Nullable Integer uvIndex) {
        return new UltravioletItem(hourth, time, weatherCode, darkWeatherIcon, weatherIcon, weatherDesc, temp, rainProbability, uvIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UltravioletItem)) {
            return false;
        }
        UltravioletItem ultravioletItem = (UltravioletItem) other;
        return this.hourth == ultravioletItem.hourth && this.time == ultravioletItem.time && this.weatherCode == ultravioletItem.weatherCode && Intrinsics.areEqual(this.darkWeatherIcon, ultravioletItem.darkWeatherIcon) && Intrinsics.areEqual(this.weatherIcon, ultravioletItem.weatherIcon) && Intrinsics.areEqual(this.weatherDesc, ultravioletItem.weatherDesc) && Intrinsics.areEqual(this.temp, ultravioletItem.temp) && Intrinsics.areEqual(this.rainProbability, ultravioletItem.rainProbability) && Intrinsics.areEqual(this.uvIndex, ultravioletItem.uvIndex);
    }

    @Nullable
    public final String getDarkWeatherIcon() {
        return this.darkWeatherIcon;
    }

    public final int getHourth() {
        return this.hourth;
    }

    @Nullable
    public final Integer getRainProbability() {
        return this.rainProbability;
    }

    @Nullable
    public final Integer getTemp() {
        return this.temp;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getUvIndex() {
        return this.uvIndex;
    }

    public final int getWeatherCode() {
        return this.weatherCode;
    }

    @Nullable
    public final String getWeatherDesc() {
        return this.weatherDesc;
    }

    @Nullable
    public final String getWeatherIcon() {
        return this.weatherIcon;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.hourth) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.weatherCode)) * 31;
        String str = this.darkWeatherIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.weatherIcon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.weatherDesc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.temp;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rainProbability;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.uvIndex;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setDarkWeatherIcon(@Nullable String str) {
        this.darkWeatherIcon = str;
    }

    public final void setHourth(int i) {
        this.hourth = i;
    }

    public final void setRainProbability(@Nullable Integer num) {
        this.rainProbability = num;
    }

    public final void setTemp(@Nullable Integer num) {
        this.temp = num;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    public final void setUvIndex(@Nullable Integer num) {
        this.uvIndex = num;
    }

    public final void setWeatherCode(int i) {
        this.weatherCode = i;
    }

    public final void setWeatherDesc(@Nullable String str) {
        this.weatherDesc = str;
    }

    public final void setWeatherIcon(@Nullable String str) {
        this.weatherIcon = str;
    }

    @NotNull
    public String toString() {
        return "UltravioletItem(hourth=" + this.hourth + ", time=" + this.time + ", weatherCode=" + this.weatherCode + ", darkWeatherIcon=" + this.darkWeatherIcon + ", weatherIcon=" + this.weatherIcon + ", weatherDesc=" + this.weatherDesc + ", temp=" + this.temp + ", rainProbability=" + this.rainProbability + ", uvIndex=" + this.uvIndex + ")";
    }

    public UltravioletItem(int i, long j2, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.hourth = i;
        this.time = j2;
        this.weatherCode = i2;
        this.darkWeatherIcon = str;
        this.weatherIcon = str2;
        this.weatherDesc = str3;
        this.temp = num;
        this.rainProbability = num2;
        this.uvIndex = num3;
    }

    public /* synthetic */ UltravioletItem(int i, long j2, int i2, String str, String str2, String str3, Integer num, Integer num2, Integer num3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : num2, (i3 & 256) != 0 ? null : num3);
    }
}
