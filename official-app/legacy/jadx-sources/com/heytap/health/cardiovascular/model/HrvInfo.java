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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/cardiovascular/model/HrvInfo;", "", "hrvValueList", "", "Lcom/heytap/health/cardiovascular/model/TimeToIntValueInfo;", "hrvState", "", "hrvWeekState", "hrvFocusBehaviorList", "Lcom/heytap/health/cardiovascular/model/HrvFocusBehaviorItem;", "hrvLatestValue", "(Ljava/util/List;IILjava/util/List;I)V", "getHrvFocusBehaviorList", "()Ljava/util/List;", "getHrvLatestValue", "()I", "getHrvState", "getHrvValueList", "getHrvWeekState", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HrvInfo {
    public static final int $stable = 8;

    @Nullable
    private final List<HrvFocusBehaviorItem> hrvFocusBehaviorList;
    private final int hrvLatestValue;
    private final int hrvState;

    @Nullable
    private final List<TimeToIntValueInfo> hrvValueList;
    private final int hrvWeekState;

    public HrvInfo() {
        this(null, 0, 0, null, 0, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HrvInfo copy$default(HrvInfo hrvInfo, List list, int i, int i2, List list2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = hrvInfo.hrvValueList;
        }
        if ((i4 & 2) != 0) {
            i = hrvInfo.hrvState;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = hrvInfo.hrvWeekState;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            list2 = hrvInfo.hrvFocusBehaviorList;
        }
        List list3 = list2;
        if ((i4 & 16) != 0) {
            i3 = hrvInfo.hrvLatestValue;
        }
        return hrvInfo.copy(list, i5, i6, list3, i3);
    }

    @Nullable
    public final List<TimeToIntValueInfo> component1() {
        return this.hrvValueList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHrvState() {
        return this.hrvState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHrvWeekState() {
        return this.hrvWeekState;
    }

    @Nullable
    public final List<HrvFocusBehaviorItem> component4() {
        return this.hrvFocusBehaviorList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHrvLatestValue() {
        return this.hrvLatestValue;
    }

    @NotNull
    public final HrvInfo copy(@Nullable List<TimeToIntValueInfo> hrvValueList, int hrvState, int hrvWeekState, @Nullable List<HrvFocusBehaviorItem> hrvFocusBehaviorList, int hrvLatestValue) {
        return new HrvInfo(hrvValueList, hrvState, hrvWeekState, hrvFocusBehaviorList, hrvLatestValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrvInfo)) {
            return false;
        }
        HrvInfo hrvInfo = (HrvInfo) other;
        return Intrinsics.areEqual(this.hrvValueList, hrvInfo.hrvValueList) && this.hrvState == hrvInfo.hrvState && this.hrvWeekState == hrvInfo.hrvWeekState && Intrinsics.areEqual(this.hrvFocusBehaviorList, hrvInfo.hrvFocusBehaviorList) && this.hrvLatestValue == hrvInfo.hrvLatestValue;
    }

    @Nullable
    public final List<HrvFocusBehaviorItem> getHrvFocusBehaviorList() {
        return this.hrvFocusBehaviorList;
    }

    public final int getHrvLatestValue() {
        return this.hrvLatestValue;
    }

    public final int getHrvState() {
        return this.hrvState;
    }

    @Nullable
    public final List<TimeToIntValueInfo> getHrvValueList() {
        return this.hrvValueList;
    }

    public final int getHrvWeekState() {
        return this.hrvWeekState;
    }

    public int hashCode() {
        List<TimeToIntValueInfo> list = this.hrvValueList;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.hrvState)) * 31) + Integer.hashCode(this.hrvWeekState)) * 31;
        List<HrvFocusBehaviorItem> list2 = this.hrvFocusBehaviorList;
        return ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + Integer.hashCode(this.hrvLatestValue);
    }

    @NotNull
    public String toString() {
        return "HrvInfo(hrvValueList=" + this.hrvValueList + ", hrvState=" + this.hrvState + ", hrvWeekState=" + this.hrvWeekState + ", hrvFocusBehaviorList=" + this.hrvFocusBehaviorList + ", hrvLatestValue=" + this.hrvLatestValue + ")";
    }

    public HrvInfo(@Nullable List<TimeToIntValueInfo> list, int i, int i2, @Nullable List<HrvFocusBehaviorItem> list2, int i3) {
        this.hrvValueList = list;
        this.hrvState = i;
        this.hrvWeekState = i2;
        this.hrvFocusBehaviorList = list2;
        this.hrvLatestValue = i3;
    }

    public /* synthetic */ HrvInfo(List list, int i, int i2, List list2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 16) == 0 ? i3 : 0);
    }
}
