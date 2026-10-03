package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/cardiovascular/model/WristTemperatureInfo;", "", "wristTempValue", "", "baseLineLeftTime", "", "state", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBaseLineLeftTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getState", "getWristTempValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/cardiovascular/model/WristTemperatureInfo;", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WristTemperatureInfo {
    public static final int $stable = 0;

    @Nullable
    private final Integer baseLineLeftTime;

    @Nullable
    private final Integer state;

    @Nullable
    private final Float wristTempValue;

    public WristTemperatureInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WristTemperatureInfo copy$default(WristTemperatureInfo wristTemperatureInfo, Float f, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = wristTemperatureInfo.wristTempValue;
        }
        if ((i & 2) != 0) {
            num = wristTemperatureInfo.baseLineLeftTime;
        }
        if ((i & 4) != 0) {
            num2 = wristTemperatureInfo.state;
        }
        return wristTemperatureInfo.copy(f, num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getWristTempValue() {
        return this.wristTempValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBaseLineLeftTime() {
        return this.baseLineLeftTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @NotNull
    public final WristTemperatureInfo copy(@Nullable Float wristTempValue, @Nullable Integer baseLineLeftTime, @Nullable Integer state) {
        return new WristTemperatureInfo(wristTempValue, baseLineLeftTime, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WristTemperatureInfo)) {
            return false;
        }
        WristTemperatureInfo wristTemperatureInfo = (WristTemperatureInfo) other;
        return Intrinsics.areEqual((Object) this.wristTempValue, (Object) wristTemperatureInfo.wristTempValue) && Intrinsics.areEqual(this.baseLineLeftTime, wristTemperatureInfo.baseLineLeftTime) && Intrinsics.areEqual(this.state, wristTemperatureInfo.state);
    }

    @Nullable
    public final Integer getBaseLineLeftTime() {
        return this.baseLineLeftTime;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final Float getWristTempValue() {
        return this.wristTempValue;
    }

    public int hashCode() {
        Float f = this.wristTempValue;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.baseLineLeftTime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.state;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WristTemperatureInfo(wristTempValue=" + this.wristTempValue + ", baseLineLeftTime=" + this.baseLineLeftTime + ", state=" + this.state + ")";
    }

    public WristTemperatureInfo(@Nullable Float f, @Nullable Integer num, @Nullable Integer num2) {
        this.wristTempValue = f;
        this.baseLineLeftTime = num;
        this.state = num2;
    }

    public /* synthetic */ WristTemperatureInfo(Float f, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
