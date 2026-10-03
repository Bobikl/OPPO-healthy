package com.heytap.health.health.familymode.request;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006/"}, d2 = {"Lcom/heytap/health/health/familymode/request/WristTemperatureObject;", "", "baseLineLeftTime", "", "startTimestamp", "", "endTimestamp", "wristTemperature", DBWristTemperatureStat.SYMPTOMS, DBWristTemperatureStat.ACTIONS, "state", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getActions", "()Ljava/lang/Integer;", "setActions", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBaseLineLeftTime", "setBaseLineLeftTime", "getEndTimestamp", "()Ljava/lang/Long;", "setEndTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStartTimestamp", "setStartTimestamp", "getState", "setState", "getSymptoms", "setSymptoms", "getWristTemperature", "setWristTemperature", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/health/familymode/request/WristTemperatureObject;", "equals", "", "other", "hashCode", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WristTemperatureObject {

    @Nullable
    private Integer actions;

    @Nullable
    private Integer baseLineLeftTime;

    @Nullable
    private Long endTimestamp;

    @Nullable
    private Long startTimestamp;

    @Nullable
    private Integer state;

    @Nullable
    private Integer symptoms;

    @Nullable
    private Integer wristTemperature;

    public WristTemperatureObject(@Nullable Integer num, @Nullable Long l2, @Nullable Long l3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.baseLineLeftTime = num;
        this.startTimestamp = l2;
        this.endTimestamp = l3;
        this.wristTemperature = num2;
        this.symptoms = num3;
        this.actions = num4;
        this.state = num5;
    }

    public static /* synthetic */ WristTemperatureObject copy$default(WristTemperatureObject wristTemperatureObject, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wristTemperatureObject.baseLineLeftTime;
        }
        if ((i & 2) != 0) {
            l2 = wristTemperatureObject.startTimestamp;
        }
        Long l4 = l2;
        if ((i & 4) != 0) {
            l3 = wristTemperatureObject.endTimestamp;
        }
        Long l5 = l3;
        if ((i & 8) != 0) {
            num2 = wristTemperatureObject.wristTemperature;
        }
        Integer num6 = num2;
        if ((i & 16) != 0) {
            num3 = wristTemperatureObject.symptoms;
        }
        Integer num7 = num3;
        if ((i & 32) != 0) {
            num4 = wristTemperatureObject.actions;
        }
        Integer num8 = num4;
        if ((i & 64) != 0) {
            num5 = wristTemperatureObject.state;
        }
        return wristTemperatureObject.copy(num, l4, l5, num6, num7, num8, num5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBaseLineLeftTime() {
        return this.baseLineLeftTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getWristTemperature() {
        return this.wristTemperature;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSymptoms() {
        return this.symptoms;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getActions() {
        return this.actions;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @NotNull
    public final WristTemperatureObject copy(@Nullable Integer baseLineLeftTime, @Nullable Long startTimestamp, @Nullable Long endTimestamp, @Nullable Integer wristTemperature, @Nullable Integer symptoms, @Nullable Integer actions, @Nullable Integer state) {
        return new WristTemperatureObject(baseLineLeftTime, startTimestamp, endTimestamp, wristTemperature, symptoms, actions, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WristTemperatureObject)) {
            return false;
        }
        WristTemperatureObject wristTemperatureObject = (WristTemperatureObject) other;
        return Intrinsics.areEqual(this.baseLineLeftTime, wristTemperatureObject.baseLineLeftTime) && Intrinsics.areEqual(this.startTimestamp, wristTemperatureObject.startTimestamp) && Intrinsics.areEqual(this.endTimestamp, wristTemperatureObject.endTimestamp) && Intrinsics.areEqual(this.wristTemperature, wristTemperatureObject.wristTemperature) && Intrinsics.areEqual(this.symptoms, wristTemperatureObject.symptoms) && Intrinsics.areEqual(this.actions, wristTemperatureObject.actions) && Intrinsics.areEqual(this.state, wristTemperatureObject.state);
    }

    @Nullable
    public final Integer getActions() {
        return this.actions;
    }

    @Nullable
    public final Integer getBaseLineLeftTime() {
        return this.baseLineLeftTime;
    }

    @Nullable
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final Integer getSymptoms() {
        return this.symptoms;
    }

    @Nullable
    public final Integer getWristTemperature() {
        return this.wristTemperature;
    }

    public int hashCode() {
        Integer num = this.baseLineLeftTime;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l2 = this.startTimestamp;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endTimestamp;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.wristTemperature;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.symptoms;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.actions;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.state;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final void setActions(@Nullable Integer num) {
        this.actions = num;
    }

    public final void setBaseLineLeftTime(@Nullable Integer num) {
        this.baseLineLeftTime = num;
    }

    public final void setEndTimestamp(@Nullable Long l2) {
        this.endTimestamp = l2;
    }

    public final void setStartTimestamp(@Nullable Long l2) {
        this.startTimestamp = l2;
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }

    public final void setSymptoms(@Nullable Integer num) {
        this.symptoms = num;
    }

    public final void setWristTemperature(@Nullable Integer num) {
        this.wristTemperature = num;
    }

    @NotNull
    public String toString() {
        return "WristTemperatureObject(baseLineLeftTime=" + this.baseLineLeftTime + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", wristTemperature=" + this.wristTemperature + ", symptoms=" + this.symptoms + ", actions=" + this.actions + ", state=" + this.state + ")";
    }
}
