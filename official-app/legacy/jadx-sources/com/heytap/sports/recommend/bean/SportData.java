package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003Jz\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018¨\u00066"}, d2 = {"Lcom/heytap/sports/recommend/bean/SportData;", "", "lastSportDuration", "", "lastSportDurationDesType", "restHeartRate", "maxHeartRate", "hrZone", "", "lastSport", "Lcom/heytap/sports/recommend/bean/LastSport;", "todaySportStrengthType", "todaySportList", "Lcom/heytap/sports/recommend/bean/TodaySport;", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;ILjava/util/List;)V", "getHrZone", "()Ljava/util/List;", "setHrZone", "(Ljava/util/List;)V", "getLastSport", "setLastSport", "getLastSportDuration", "()I", "setLastSportDuration", "(I)V", "getLastSportDurationDesType", "setLastSportDurationDesType", "getMaxHeartRate", "()Ljava/lang/Integer;", "setMaxHeartRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRestHeartRate", "setRestHeartRate", "getTodaySportList", "setTodaySportList", "getTodaySportStrengthType", "setTodaySportStrengthType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;ILjava/util/List;)Lcom/heytap/sports/recommend/bean/SportData;", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportData {
    public static final int $stable = 8;

    @Nullable
    private List<Integer> hrZone;

    @Nullable
    private List<LastSport> lastSport;
    private int lastSportDuration;
    private int lastSportDurationDesType;

    @Nullable
    private Integer maxHeartRate;

    @Nullable
    private Integer restHeartRate;

    @Nullable
    private List<TodaySport> todaySportList;
    private int todaySportStrengthType;

    public SportData(int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Integer> list, @Nullable List<LastSport> list2, int i3, @Nullable List<TodaySport> list3) {
        this.lastSportDuration = i;
        this.lastSportDurationDesType = i2;
        this.restHeartRate = num;
        this.maxHeartRate = num2;
        this.hrZone = list;
        this.lastSport = list2;
        this.todaySportStrengthType = i3;
        this.todaySportList = list3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLastSportDuration() {
        return this.lastSportDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLastSportDurationDesType() {
        return this.lastSportDurationDesType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRestHeartRate() {
        return this.restHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Nullable
    public final List<Integer> component5() {
        return this.hrZone;
    }

    @Nullable
    public final List<LastSport> component6() {
        return this.lastSport;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTodaySportStrengthType() {
        return this.todaySportStrengthType;
    }

    @Nullable
    public final List<TodaySport> component8() {
        return this.todaySportList;
    }

    @NotNull
    public final SportData copy(int lastSportDuration, int lastSportDurationDesType, @Nullable Integer restHeartRate, @Nullable Integer maxHeartRate, @Nullable List<Integer> hrZone, @Nullable List<LastSport> lastSport, int todaySportStrengthType, @Nullable List<TodaySport> todaySportList) {
        return new SportData(lastSportDuration, lastSportDurationDesType, restHeartRate, maxHeartRate, hrZone, lastSport, todaySportStrengthType, todaySportList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportData)) {
            return false;
        }
        SportData sportData = (SportData) other;
        return this.lastSportDuration == sportData.lastSportDuration && this.lastSportDurationDesType == sportData.lastSportDurationDesType && Intrinsics.areEqual(this.restHeartRate, sportData.restHeartRate) && Intrinsics.areEqual(this.maxHeartRate, sportData.maxHeartRate) && Intrinsics.areEqual(this.hrZone, sportData.hrZone) && Intrinsics.areEqual(this.lastSport, sportData.lastSport) && this.todaySportStrengthType == sportData.todaySportStrengthType && Intrinsics.areEqual(this.todaySportList, sportData.todaySportList);
    }

    @Nullable
    public final List<Integer> getHrZone() {
        return this.hrZone;
    }

    @Nullable
    public final List<LastSport> getLastSport() {
        return this.lastSport;
    }

    public final int getLastSportDuration() {
        return this.lastSportDuration;
    }

    public final int getLastSportDurationDesType() {
        return this.lastSportDurationDesType;
    }

    @Nullable
    public final Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Nullable
    public final Integer getRestHeartRate() {
        return this.restHeartRate;
    }

    @Nullable
    public final List<TodaySport> getTodaySportList() {
        return this.todaySportList;
    }

    public final int getTodaySportStrengthType() {
        return this.todaySportStrengthType;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.lastSportDuration) * 31) + Integer.hashCode(this.lastSportDurationDesType)) * 31;
        Integer num = this.restHeartRate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxHeartRate;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.hrZone;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<LastSport> list2 = this.lastSport;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.todaySportStrengthType)) * 31;
        List<TodaySport> list3 = this.todaySportList;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setHrZone(@Nullable List<Integer> list) {
        this.hrZone = list;
    }

    public final void setLastSport(@Nullable List<LastSport> list) {
        this.lastSport = list;
    }

    public final void setLastSportDuration(int i) {
        this.lastSportDuration = i;
    }

    public final void setLastSportDurationDesType(int i) {
        this.lastSportDurationDesType = i;
    }

    public final void setMaxHeartRate(@Nullable Integer num) {
        this.maxHeartRate = num;
    }

    public final void setRestHeartRate(@Nullable Integer num) {
        this.restHeartRate = num;
    }

    public final void setTodaySportList(@Nullable List<TodaySport> list) {
        this.todaySportList = list;
    }

    public final void setTodaySportStrengthType(int i) {
        this.todaySportStrengthType = i;
    }

    @NotNull
    public String toString() {
        return "SportData(lastSportDuration=" + this.lastSportDuration + ", lastSportDurationDesType=" + this.lastSportDurationDesType + ", restHeartRate=" + this.restHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", hrZone=" + this.hrZone + ", lastSport=" + this.lastSport + ", todaySportStrengthType=" + this.todaySportStrengthType + ", todaySportList=" + this.todaySportList + ")";
    }

    public /* synthetic */ SportData(int i, int i2, Integer num, Integer num2, List list, List list2, int i3, List list3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? null : list, list2, i3, (i4 & 128) != 0 ? null : list3);
    }
}
