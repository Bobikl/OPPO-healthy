package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006+"}, d2 = {"Lcom/heytap/health/cardiovascular/model/BloodPressureInfo;", "", "state", "", "countdown", "leftDayInfo", "", "Lcom/heytap/health/cardiovascular/model/TimeToIntValueInfo;", "startDayTime", "endDayTime", "focusStartOffsetTime", "focusEndOffsetTime", "valueList", "Lcom/heytap/health/cardiovascular/model/TimeToFloatValueInfo;", "bloodPressureType", "(IILjava/util/List;IILjava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getBloodPressureType", "()I", "getCountdown", "getEndDayTime", "getFocusEndOffsetTime", "()Ljava/util/List;", "getFocusStartOffsetTime", "getLeftDayInfo", "getStartDayTime", "getState", "getValueList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BloodPressureInfo {
    public static final int $stable = 8;
    private final int bloodPressureType;
    private final int countdown;
    private final int endDayTime;

    @Nullable
    private final List<Integer> focusEndOffsetTime;

    @Nullable
    private final List<Integer> focusStartOffsetTime;

    @Nullable
    private final List<TimeToIntValueInfo> leftDayInfo;
    private final int startDayTime;
    private final int state;

    @Nullable
    private final List<TimeToFloatValueInfo> valueList;

    public BloodPressureInfo(int i, int i2, @Nullable List<TimeToIntValueInfo> list, int i3, int i4, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<TimeToFloatValueInfo> list4, int i5) {
        this.state = i;
        this.countdown = i2;
        this.leftDayInfo = list;
        this.startDayTime = i3;
        this.endDayTime = i4;
        this.focusStartOffsetTime = list2;
        this.focusEndOffsetTime = list3;
        this.valueList = list4;
        this.bloodPressureType = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCountdown() {
        return this.countdown;
    }

    @Nullable
    public final List<TimeToIntValueInfo> component3() {
        return this.leftDayInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStartDayTime() {
        return this.startDayTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getEndDayTime() {
        return this.endDayTime;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.focusStartOffsetTime;
    }

    @Nullable
    public final List<Integer> component7() {
        return this.focusEndOffsetTime;
    }

    @Nullable
    public final List<TimeToFloatValueInfo> component8() {
        return this.valueList;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getBloodPressureType() {
        return this.bloodPressureType;
    }

    @NotNull
    public final BloodPressureInfo copy(int state, int countdown, @Nullable List<TimeToIntValueInfo> leftDayInfo, int startDayTime, int endDayTime, @Nullable List<Integer> focusStartOffsetTime, @Nullable List<Integer> focusEndOffsetTime, @Nullable List<TimeToFloatValueInfo> valueList, int bloodPressureType) {
        return new BloodPressureInfo(state, countdown, leftDayInfo, startDayTime, endDayTime, focusStartOffsetTime, focusEndOffsetTime, valueList, bloodPressureType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureInfo)) {
            return false;
        }
        BloodPressureInfo bloodPressureInfo = (BloodPressureInfo) other;
        return this.state == bloodPressureInfo.state && this.countdown == bloodPressureInfo.countdown && Intrinsics.areEqual(this.leftDayInfo, bloodPressureInfo.leftDayInfo) && this.startDayTime == bloodPressureInfo.startDayTime && this.endDayTime == bloodPressureInfo.endDayTime && Intrinsics.areEqual(this.focusStartOffsetTime, bloodPressureInfo.focusStartOffsetTime) && Intrinsics.areEqual(this.focusEndOffsetTime, bloodPressureInfo.focusEndOffsetTime) && Intrinsics.areEqual(this.valueList, bloodPressureInfo.valueList) && this.bloodPressureType == bloodPressureInfo.bloodPressureType;
    }

    public final int getBloodPressureType() {
        return this.bloodPressureType;
    }

    public final int getCountdown() {
        return this.countdown;
    }

    public final int getEndDayTime() {
        return this.endDayTime;
    }

    @Nullable
    public final List<Integer> getFocusEndOffsetTime() {
        return this.focusEndOffsetTime;
    }

    @Nullable
    public final List<Integer> getFocusStartOffsetTime() {
        return this.focusStartOffsetTime;
    }

    @Nullable
    public final List<TimeToIntValueInfo> getLeftDayInfo() {
        return this.leftDayInfo;
    }

    public final int getStartDayTime() {
        return this.startDayTime;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final List<TimeToFloatValueInfo> getValueList() {
        return this.valueList;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.state) * 31) + Integer.hashCode(this.countdown)) * 31;
        List<TimeToIntValueInfo> list = this.leftDayInfo;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.startDayTime)) * 31) + Integer.hashCode(this.endDayTime)) * 31;
        List<Integer> list2 = this.focusStartOffsetTime;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.focusEndOffsetTime;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TimeToFloatValueInfo> list4 = this.valueList;
        return ((iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 31) + Integer.hashCode(this.bloodPressureType);
    }

    @NotNull
    public String toString() {
        return "BloodPressureInfo(state=" + this.state + ", countdown=" + this.countdown + ", leftDayInfo=" + this.leftDayInfo + ", startDayTime=" + this.startDayTime + ", endDayTime=" + this.endDayTime + ", focusStartOffsetTime=" + this.focusStartOffsetTime + ", focusEndOffsetTime=" + this.focusEndOffsetTime + ", valueList=" + this.valueList + ", bloodPressureType=" + this.bloodPressureType + ")";
    }

    public /* synthetic */ BloodPressureInfo(int i, int i2, List list, int i3, int i4, List list2, List list3, List list4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i6 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i6 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i6 & 256) == 0 ? i5 : 0);
    }
}
