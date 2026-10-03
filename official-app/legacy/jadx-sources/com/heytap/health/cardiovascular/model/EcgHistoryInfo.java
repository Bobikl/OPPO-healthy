package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/cardiovascular/model/EcgHistoryInfo;", "", "ecgResult", "", "stateList", "", "Lcom/heytap/health/cardiovascular/model/TimeToIntValueInfo;", "(ILjava/util/List;)V", "getEcgResult", "()I", "getStateList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EcgHistoryInfo {
    public static final int $stable = 8;
    private final int ecgResult;

    @Nullable
    private final List<TimeToIntValueInfo> stateList;

    public EcgHistoryInfo(int i, @Nullable List<TimeToIntValueInfo> list) {
        this.ecgResult = i;
        this.stateList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcgHistoryInfo copy$default(EcgHistoryInfo ecgHistoryInfo, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ecgHistoryInfo.ecgResult;
        }
        if ((i2 & 2) != 0) {
            list = ecgHistoryInfo.stateList;
        }
        return ecgHistoryInfo.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEcgResult() {
        return this.ecgResult;
    }

    @Nullable
    public final List<TimeToIntValueInfo> component2() {
        return this.stateList;
    }

    @NotNull
    public final EcgHistoryInfo copy(int ecgResult, @Nullable List<TimeToIntValueInfo> stateList) {
        return new EcgHistoryInfo(ecgResult, stateList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgHistoryInfo)) {
            return false;
        }
        EcgHistoryInfo ecgHistoryInfo = (EcgHistoryInfo) other;
        return this.ecgResult == ecgHistoryInfo.ecgResult && Intrinsics.areEqual(this.stateList, ecgHistoryInfo.stateList);
    }

    public final int getEcgResult() {
        return this.ecgResult;
    }

    @Nullable
    public final List<TimeToIntValueInfo> getStateList() {
        return this.stateList;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.ecgResult) * 31;
        List<TimeToIntValueInfo> list = this.stateList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "EcgHistoryInfo(ecgResult=" + this.ecgResult + ", stateList=" + this.stateList + ")";
    }
}
