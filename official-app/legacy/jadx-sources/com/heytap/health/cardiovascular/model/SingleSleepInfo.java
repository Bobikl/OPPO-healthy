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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/cardiovascular/model/SingleSleepInfo;", "", "state", "", "sleepScore", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSleepScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getState", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/cardiovascular/model/SingleSleepInfo;", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SingleSleepInfo {
    public static final int $stable = 0;

    @Nullable
    private final Integer sleepScore;

    @Nullable
    private final Integer state;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleSleepInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SingleSleepInfo copy$default(SingleSleepInfo singleSleepInfo, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = singleSleepInfo.state;
        }
        if ((i & 2) != 0) {
            num2 = singleSleepInfo.sleepScore;
        }
        return singleSleepInfo.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @NotNull
    public final SingleSleepInfo copy(@Nullable Integer state, @Nullable Integer sleepScore) {
        return new SingleSleepInfo(state, sleepScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleSleepInfo)) {
            return false;
        }
        SingleSleepInfo singleSleepInfo = (SingleSleepInfo) other;
        return Intrinsics.areEqual(this.state, singleSleepInfo.state) && Intrinsics.areEqual(this.sleepScore, singleSleepInfo.sleepScore);
    }

    @Nullable
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    public int hashCode() {
        Integer num = this.state;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sleepScore;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SingleSleepInfo(state=" + this.state + ", sleepScore=" + this.sleepScore + ")";
    }

    public SingleSleepInfo(@Nullable Integer num, @Nullable Integer num2) {
        this.state = num;
        this.sleepScore = num2;
    }

    public /* synthetic */ SingleSleepInfo(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
