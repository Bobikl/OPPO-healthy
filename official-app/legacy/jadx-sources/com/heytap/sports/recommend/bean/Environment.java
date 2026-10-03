package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/heytap/sports/recommend/bean/Environment;", "", "weatherType", "", "temperature", "", "humidity", "uv", "(ILjava/util/List;II)V", "getHumidity", "()I", "setHumidity", "(I)V", "getTemperature", "()Ljava/util/List;", "setTemperature", "(Ljava/util/List;)V", "getUv", "setUv", "getWeatherType", "setWeatherType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Environment {
    public static final int $stable = 8;
    private int humidity;

    @NotNull
    private List<Integer> temperature;
    private int uv;
    private int weatherType;

    public Environment() {
        this(0, null, 0, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Environment copy$default(Environment environment, int i, List list, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = environment.weatherType;
        }
        if ((i4 & 2) != 0) {
            list = environment.temperature;
        }
        if ((i4 & 4) != 0) {
            i2 = environment.humidity;
        }
        if ((i4 & 8) != 0) {
            i3 = environment.uv;
        }
        return environment.copy(i, list, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWeatherType() {
        return this.weatherType;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHumidity() {
        return this.humidity;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUv() {
        return this.uv;
    }

    @NotNull
    public final Environment copy(int weatherType, @NotNull List<Integer> temperature, int humidity, int uv) {
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        return new Environment(weatherType, temperature, humidity, uv);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return this.weatherType == environment.weatherType && Intrinsics.areEqual(this.temperature, environment.temperature) && this.humidity == environment.humidity && this.uv == environment.uv;
    }

    public final int getHumidity() {
        return this.humidity;
    }

    @NotNull
    public final List<Integer> getTemperature() {
        return this.temperature;
    }

    public final int getUv() {
        return this.uv;
    }

    public final int getWeatherType() {
        return this.weatherType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.weatherType) * 31) + this.temperature.hashCode()) * 31) + Integer.hashCode(this.humidity)) * 31) + Integer.hashCode(this.uv);
    }

    public final void setHumidity(int i) {
        this.humidity = i;
    }

    public final void setTemperature(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.temperature = list;
    }

    public final void setUv(int i) {
        this.uv = i;
    }

    public final void setWeatherType(int i) {
        this.weatherType = i;
    }

    @NotNull
    public String toString() {
        return "Environment(weatherType=" + this.weatherType + ", temperature=" + this.temperature + ", humidity=" + this.humidity + ", uv=" + this.uv + ")";
    }

    public Environment(int i, @NotNull List<Integer> temperature, int i2, int i3) {
        Intrinsics.checkNotNullParameter(temperature, "temperature");
        this.weatherType = i;
        this.temperature = temperature;
        this.humidity = i2;
        this.uv = i3;
    }

    public /* synthetic */ Environment(int i, List list, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
