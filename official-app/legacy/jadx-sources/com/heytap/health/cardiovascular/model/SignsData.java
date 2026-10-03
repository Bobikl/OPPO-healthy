package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0098\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/heytap/health/cardiovascular/model/SignsData;", "", "type", "", "legend", "", "timeList", "", "", "values", "baselines", "safeUpperLimit", "safeLowerLimit", "totalDays", "currentDays", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBaselines", "()Ljava/util/List;", "getCurrentDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLegend", "()Ljava/lang/String;", "getSafeLowerLimit", "getSafeUpperLimit", "getTimeList", "getTotalDays", "getType", "getValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/cardiovascular/model/SignsData;", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SignsData {
    public static final int $stable = 8;

    @Nullable
    private final List<Integer> baselines;

    @Nullable
    private final Integer currentDays;

    @Nullable
    private final String legend;

    @Nullable
    private final List<Integer> safeLowerLimit;

    @Nullable
    private final List<Integer> safeUpperLimit;

    @Nullable
    private final List<Long> timeList;

    @Nullable
    private final Integer totalDays;

    @Nullable
    private final Integer type;

    @Nullable
    private final List<Long> values;

    public SignsData() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLegend() {
        return this.legend;
    }

    @Nullable
    public final List<Long> component3() {
        return this.timeList;
    }

    @Nullable
    public final List<Long> component4() {
        return this.values;
    }

    @Nullable
    public final List<Integer> component5() {
        return this.baselines;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.safeUpperLimit;
    }

    @Nullable
    public final List<Integer> component7() {
        return this.safeLowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTotalDays() {
        return this.totalDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCurrentDays() {
        return this.currentDays;
    }

    @NotNull
    public final SignsData copy(@Nullable Integer type, @Nullable String legend, @Nullable List<Long> timeList, @Nullable List<Long> values, @Nullable List<Integer> baselines, @Nullable List<Integer> safeUpperLimit, @Nullable List<Integer> safeLowerLimit, @Nullable Integer totalDays, @Nullable Integer currentDays) {
        return new SignsData(type, legend, timeList, values, baselines, safeUpperLimit, safeLowerLimit, totalDays, currentDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignsData)) {
            return false;
        }
        SignsData signsData = (SignsData) other;
        return Intrinsics.areEqual(this.type, signsData.type) && Intrinsics.areEqual(this.legend, signsData.legend) && Intrinsics.areEqual(this.timeList, signsData.timeList) && Intrinsics.areEqual(this.values, signsData.values) && Intrinsics.areEqual(this.baselines, signsData.baselines) && Intrinsics.areEqual(this.safeUpperLimit, signsData.safeUpperLimit) && Intrinsics.areEqual(this.safeLowerLimit, signsData.safeLowerLimit) && Intrinsics.areEqual(this.totalDays, signsData.totalDays) && Intrinsics.areEqual(this.currentDays, signsData.currentDays);
    }

    @Nullable
    public final List<Integer> getBaselines() {
        return this.baselines;
    }

    @Nullable
    public final Integer getCurrentDays() {
        return this.currentDays;
    }

    @Nullable
    public final String getLegend() {
        return this.legend;
    }

    @Nullable
    public final List<Integer> getSafeLowerLimit() {
        return this.safeLowerLimit;
    }

    @Nullable
    public final List<Integer> getSafeUpperLimit() {
        return this.safeUpperLimit;
    }

    @Nullable
    public final List<Long> getTimeList() {
        return this.timeList;
    }

    @Nullable
    public final Integer getTotalDays() {
        return this.totalDays;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final List<Long> getValues() {
        return this.values;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.legend;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Long> list = this.timeList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.values;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.baselines;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.safeUpperLimit;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.safeLowerLimit;
        int iHashCode7 = (iHashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num2 = this.totalDays;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.currentDays;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SignsData(type=" + this.type + ", legend=" + this.legend + ", timeList=" + this.timeList + ", values=" + this.values + ", baselines=" + this.baselines + ", safeUpperLimit=" + this.safeUpperLimit + ", safeLowerLimit=" + this.safeLowerLimit + ", totalDays=" + this.totalDays + ", currentDays=" + this.currentDays + ")";
    }

    public SignsData(@Nullable Integer num, @Nullable String str, @Nullable List<Long> list, @Nullable List<Long> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable List<Integer> list5, @Nullable Integer num2, @Nullable Integer num3) {
        this.type = num;
        this.legend = str;
        this.timeList = list;
        this.values = list2;
        this.baselines = list3;
        this.safeUpperLimit = list4;
        this.safeLowerLimit = list5;
        this.totalDays = num2;
        this.currentDays = num3;
    }

    public /* synthetic */ SignsData(Integer num, String str, List list, List list2, List list3, List list4, List list5, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3);
    }
}
