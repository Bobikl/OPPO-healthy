package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006+"}, d2 = {"Lcom/heytap/sports/recommend/bean/VitalSignsData;", "", "sleepHrv", "", "sleepHrvDesType", "wristTemperatureDesType", "sleepBloodOxygen", "sleepBloodOxygenDesType", "physicalMental", "physicalMentalDesType", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPhysicalMental", "()Ljava/lang/Integer;", "setPhysicalMental", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPhysicalMentalDesType", "setPhysicalMentalDesType", "getSleepBloodOxygen", "setSleepBloodOxygen", "getSleepBloodOxygenDesType", "setSleepBloodOxygenDesType", "getSleepHrv", "setSleepHrv", "getSleepHrvDesType", "setSleepHrvDesType", "getWristTemperatureDesType", "setWristTemperatureDesType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/sports/recommend/bean/VitalSignsData;", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VitalSignsData {
    public static final int $stable = 8;

    @Nullable
    private Integer physicalMental;

    @Nullable
    private Integer physicalMentalDesType;

    @Nullable
    private Integer sleepBloodOxygen;

    @Nullable
    private Integer sleepBloodOxygenDesType;

    @Nullable
    private Integer sleepHrv;

    @Nullable
    private Integer sleepHrvDesType;

    @Nullable
    private Integer wristTemperatureDesType;

    public VitalSignsData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ VitalSignsData copy$default(VitalSignsData vitalSignsData, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, Object obj) {
        if ((i & 1) != 0) {
            num = vitalSignsData.sleepHrv;
        }
        if ((i & 2) != 0) {
            num2 = vitalSignsData.sleepHrvDesType;
        }
        Integer num8 = num2;
        if ((i & 4) != 0) {
            num3 = vitalSignsData.wristTemperatureDesType;
        }
        Integer num9 = num3;
        if ((i & 8) != 0) {
            num4 = vitalSignsData.sleepBloodOxygen;
        }
        Integer num10 = num4;
        if ((i & 16) != 0) {
            num5 = vitalSignsData.sleepBloodOxygenDesType;
        }
        Integer num11 = num5;
        if ((i & 32) != 0) {
            num6 = vitalSignsData.physicalMental;
        }
        Integer num12 = num6;
        if ((i & 64) != 0) {
            num7 = vitalSignsData.physicalMentalDesType;
        }
        return vitalSignsData.copy(num, num8, num9, num10, num11, num12, num7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSleepHrv() {
        return this.sleepHrv;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSleepHrvDesType() {
        return this.sleepHrvDesType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWristTemperatureDesType() {
        return this.wristTemperatureDesType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSleepBloodOxygen() {
        return this.sleepBloodOxygen;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSleepBloodOxygenDesType() {
        return this.sleepBloodOxygenDesType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPhysicalMental() {
        return this.physicalMental;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPhysicalMentalDesType() {
        return this.physicalMentalDesType;
    }

    @NotNull
    public final VitalSignsData copy(@Nullable Integer sleepHrv, @Nullable Integer sleepHrvDesType, @Nullable Integer wristTemperatureDesType, @Nullable Integer sleepBloodOxygen, @Nullable Integer sleepBloodOxygenDesType, @Nullable Integer physicalMental, @Nullable Integer physicalMentalDesType) {
        return new VitalSignsData(sleepHrv, sleepHrvDesType, wristTemperatureDesType, sleepBloodOxygen, sleepBloodOxygenDesType, physicalMental, physicalMentalDesType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VitalSignsData)) {
            return false;
        }
        VitalSignsData vitalSignsData = (VitalSignsData) other;
        return Intrinsics.areEqual(this.sleepHrv, vitalSignsData.sleepHrv) && Intrinsics.areEqual(this.sleepHrvDesType, vitalSignsData.sleepHrvDesType) && Intrinsics.areEqual(this.wristTemperatureDesType, vitalSignsData.wristTemperatureDesType) && Intrinsics.areEqual(this.sleepBloodOxygen, vitalSignsData.sleepBloodOxygen) && Intrinsics.areEqual(this.sleepBloodOxygenDesType, vitalSignsData.sleepBloodOxygenDesType) && Intrinsics.areEqual(this.physicalMental, vitalSignsData.physicalMental) && Intrinsics.areEqual(this.physicalMentalDesType, vitalSignsData.physicalMentalDesType);
    }

    @Nullable
    public final Integer getPhysicalMental() {
        return this.physicalMental;
    }

    @Nullable
    public final Integer getPhysicalMentalDesType() {
        return this.physicalMentalDesType;
    }

    @Nullable
    public final Integer getSleepBloodOxygen() {
        return this.sleepBloodOxygen;
    }

    @Nullable
    public final Integer getSleepBloodOxygenDesType() {
        return this.sleepBloodOxygenDesType;
    }

    @Nullable
    public final Integer getSleepHrv() {
        return this.sleepHrv;
    }

    @Nullable
    public final Integer getSleepHrvDesType() {
        return this.sleepHrvDesType;
    }

    @Nullable
    public final Integer getWristTemperatureDesType() {
        return this.wristTemperatureDesType;
    }

    public int hashCode() {
        Integer num = this.sleepHrv;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sleepHrvDesType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.wristTemperatureDesType;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sleepBloodOxygen;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.sleepBloodOxygenDesType;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.physicalMental;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.physicalMentalDesType;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final void setPhysicalMental(@Nullable Integer num) {
        this.physicalMental = num;
    }

    public final void setPhysicalMentalDesType(@Nullable Integer num) {
        this.physicalMentalDesType = num;
    }

    public final void setSleepBloodOxygen(@Nullable Integer num) {
        this.sleepBloodOxygen = num;
    }

    public final void setSleepBloodOxygenDesType(@Nullable Integer num) {
        this.sleepBloodOxygenDesType = num;
    }

    public final void setSleepHrv(@Nullable Integer num) {
        this.sleepHrv = num;
    }

    public final void setSleepHrvDesType(@Nullable Integer num) {
        this.sleepHrvDesType = num;
    }

    public final void setWristTemperatureDesType(@Nullable Integer num) {
        this.wristTemperatureDesType = num;
    }

    @NotNull
    public String toString() {
        return "VitalSignsData(sleepHrv=" + this.sleepHrv + ", sleepHrvDesType=" + this.sleepHrvDesType + ", wristTemperatureDesType=" + this.wristTemperatureDesType + ", sleepBloodOxygen=" + this.sleepBloodOxygen + ", sleepBloodOxygenDesType=" + this.sleepBloodOxygenDesType + ", physicalMental=" + this.physicalMental + ", physicalMentalDesType=" + this.physicalMentalDesType + ")";
    }

    public VitalSignsData(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7) {
        this.sleepHrv = num;
        this.sleepHrvDesType = num2;
        this.wristTemperatureDesType = num3;
        this.sleepBloodOxygen = num4;
        this.sleepBloodOxygenDesType = num5;
        this.physicalMental = num6;
        this.physicalMentalDesType = num7;
    }

    public /* synthetic */ VitalSignsData(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7);
    }
}
