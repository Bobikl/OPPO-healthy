package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l3j, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/l3j;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "hour", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "uvIndex", "temperature", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "weather", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SunshineAdviceItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int hour;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer uvIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Integer temperature;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String weather;

    public SunshineAdviceItem(int i, @Nullable Integer num, @Nullable Integer num2, @NotNull String weather) {
        Intrinsics.checkNotNullParameter(weather, "weather");
        this.hour = i;
        this.uvIndex = num;
        this.temperature = num2;
        this.weather = weather;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTemperature() {
        return this.temperature;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getUvIndex() {
        return this.uvIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWeather() {
        return this.weather;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SunshineAdviceItem)) {
            return false;
        }
        SunshineAdviceItem sunshineAdviceItem = (SunshineAdviceItem) other;
        return this.hour == sunshineAdviceItem.hour && Intrinsics.areEqual(this.uvIndex, sunshineAdviceItem.uvIndex) && Intrinsics.areEqual(this.temperature, sunshineAdviceItem.temperature) && Intrinsics.areEqual(this.weather, sunshineAdviceItem.weather);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.hour) * 31;
        Integer num = this.uvIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.temperature;
        return ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.weather.hashCode();
    }

    @NotNull
    public String toString() {
        return "SunshineAdviceItem(hour=" + this.hour + ", uvIndex=" + this.uvIndex + ", temperature=" + this.temperature + ", weather=" + this.weather + ")";
    }
}
