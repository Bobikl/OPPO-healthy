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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/cardiovascular/model/CardioHistoryInfo;", "", "ecgAbnormalHistoryList", "", "Lcom/heytap/health/cardiovascular/model/EcgHistoryInfo;", "restHeartRateHistoryList", "Lcom/heytap/health/cardiovascular/model/TimeToIntValueInfoWithBaseLine;", "pwvHistoryAvgList", "Lcom/heytap/health/cardiovascular/model/TimeToFloatValueInfo;", "sleepHeartRateHistoryList", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEcgAbnormalHistoryList", "()Ljava/util/List;", "getPwvHistoryAvgList", "getRestHeartRateHistoryList", "getSleepHeartRateHistoryList", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardioHistoryInfo {
    public static final int $stable = 8;

    @Nullable
    private final List<EcgHistoryInfo> ecgAbnormalHistoryList;

    @Nullable
    private final List<TimeToFloatValueInfo> pwvHistoryAvgList;

    @Nullable
    private final List<TimeToIntValueInfoWithBaseLine> restHeartRateHistoryList;

    @Nullable
    private final List<TimeToIntValueInfoWithBaseLine> sleepHeartRateHistoryList;

    public CardioHistoryInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardioHistoryInfo copy$default(CardioHistoryInfo cardioHistoryInfo, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardioHistoryInfo.ecgAbnormalHistoryList;
        }
        if ((i & 2) != 0) {
            list2 = cardioHistoryInfo.restHeartRateHistoryList;
        }
        if ((i & 4) != 0) {
            list3 = cardioHistoryInfo.pwvHistoryAvgList;
        }
        if ((i & 8) != 0) {
            list4 = cardioHistoryInfo.sleepHeartRateHistoryList;
        }
        return cardioHistoryInfo.copy(list, list2, list3, list4);
    }

    @Nullable
    public final List<EcgHistoryInfo> component1() {
        return this.ecgAbnormalHistoryList;
    }

    @Nullable
    public final List<TimeToIntValueInfoWithBaseLine> component2() {
        return this.restHeartRateHistoryList;
    }

    @Nullable
    public final List<TimeToFloatValueInfo> component3() {
        return this.pwvHistoryAvgList;
    }

    @Nullable
    public final List<TimeToIntValueInfoWithBaseLine> component4() {
        return this.sleepHeartRateHistoryList;
    }

    @NotNull
    public final CardioHistoryInfo copy(@Nullable List<EcgHistoryInfo> ecgAbnormalHistoryList, @Nullable List<TimeToIntValueInfoWithBaseLine> restHeartRateHistoryList, @Nullable List<TimeToFloatValueInfo> pwvHistoryAvgList, @Nullable List<TimeToIntValueInfoWithBaseLine> sleepHeartRateHistoryList) {
        return new CardioHistoryInfo(ecgAbnormalHistoryList, restHeartRateHistoryList, pwvHistoryAvgList, sleepHeartRateHistoryList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardioHistoryInfo)) {
            return false;
        }
        CardioHistoryInfo cardioHistoryInfo = (CardioHistoryInfo) other;
        return Intrinsics.areEqual(this.ecgAbnormalHistoryList, cardioHistoryInfo.ecgAbnormalHistoryList) && Intrinsics.areEqual(this.restHeartRateHistoryList, cardioHistoryInfo.restHeartRateHistoryList) && Intrinsics.areEqual(this.pwvHistoryAvgList, cardioHistoryInfo.pwvHistoryAvgList) && Intrinsics.areEqual(this.sleepHeartRateHistoryList, cardioHistoryInfo.sleepHeartRateHistoryList);
    }

    @Nullable
    public final List<EcgHistoryInfo> getEcgAbnormalHistoryList() {
        return this.ecgAbnormalHistoryList;
    }

    @Nullable
    public final List<TimeToFloatValueInfo> getPwvHistoryAvgList() {
        return this.pwvHistoryAvgList;
    }

    @Nullable
    public final List<TimeToIntValueInfoWithBaseLine> getRestHeartRateHistoryList() {
        return this.restHeartRateHistoryList;
    }

    @Nullable
    public final List<TimeToIntValueInfoWithBaseLine> getSleepHeartRateHistoryList() {
        return this.sleepHeartRateHistoryList;
    }

    public int hashCode() {
        List<EcgHistoryInfo> list = this.ecgAbnormalHistoryList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TimeToIntValueInfoWithBaseLine> list2 = this.restHeartRateHistoryList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TimeToFloatValueInfo> list3 = this.pwvHistoryAvgList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TimeToIntValueInfoWithBaseLine> list4 = this.sleepHeartRateHistoryList;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardioHistoryInfo(ecgAbnormalHistoryList=" + this.ecgAbnormalHistoryList + ", restHeartRateHistoryList=" + this.restHeartRateHistoryList + ", pwvHistoryAvgList=" + this.pwvHistoryAvgList + ", sleepHeartRateHistoryList=" + this.sleepHeartRateHistoryList + ")";
    }

    public CardioHistoryInfo(@Nullable List<EcgHistoryInfo> list, @Nullable List<TimeToIntValueInfoWithBaseLine> list2, @Nullable List<TimeToFloatValueInfo> list3, @Nullable List<TimeToIntValueInfoWithBaseLine> list4) {
        this.ecgAbnormalHistoryList = list;
        this.restHeartRateHistoryList = list2;
        this.pwvHistoryAvgList = list3;
        this.sleepHeartRateHistoryList = list4;
    }

    public /* synthetic */ CardioHistoryInfo(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4);
    }
}
