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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/recommend/bean/SleepData;", "", "sleepScore", "", "sleepScoreDesType", "sleepDuration", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSleepDuration", "()Ljava/lang/Integer;", "setSleepDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSleepScore", "setSleepScore", "getSleepScoreDesType", "setSleepScoreDesType", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/sports/recommend/bean/SleepData;", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepData {
    public static final int $stable = 8;

    @Nullable
    private Integer sleepDuration;

    @Nullable
    private Integer sleepScore;

    @Nullable
    private Integer sleepScoreDesType;

    public SleepData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SleepData copy$default(SleepData sleepData, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sleepData.sleepScore;
        }
        if ((i & 2) != 0) {
            num2 = sleepData.sleepScoreDesType;
        }
        if ((i & 4) != 0) {
            num3 = sleepData.sleepDuration;
        }
        return sleepData.copy(num, num2, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSleepScoreDesType() {
        return this.sleepScoreDesType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSleepDuration() {
        return this.sleepDuration;
    }

    @NotNull
    public final SleepData copy(@Nullable Integer sleepScore, @Nullable Integer sleepScoreDesType, @Nullable Integer sleepDuration) {
        return new SleepData(sleepScore, sleepScoreDesType, sleepDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepData)) {
            return false;
        }
        SleepData sleepData = (SleepData) other;
        return Intrinsics.areEqual(this.sleepScore, sleepData.sleepScore) && Intrinsics.areEqual(this.sleepScoreDesType, sleepData.sleepScoreDesType) && Intrinsics.areEqual(this.sleepDuration, sleepData.sleepDuration);
    }

    @Nullable
    public final Integer getSleepDuration() {
        return this.sleepDuration;
    }

    @Nullable
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    public final Integer getSleepScoreDesType() {
        return this.sleepScoreDesType;
    }

    public int hashCode() {
        Integer num = this.sleepScore;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sleepScoreDesType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sleepDuration;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setSleepDuration(@Nullable Integer num) {
        this.sleepDuration = num;
    }

    public final void setSleepScore(@Nullable Integer num) {
        this.sleepScore = num;
    }

    public final void setSleepScoreDesType(@Nullable Integer num) {
        this.sleepScoreDesType = num;
    }

    @NotNull
    public String toString() {
        return "SleepData(sleepScore=" + this.sleepScore + ", sleepScoreDesType=" + this.sleepScoreDesType + ", sleepDuration=" + this.sleepDuration + ")";
    }

    public SleepData(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.sleepScore = num;
        this.sleepScoreDesType = num2;
        this.sleepDuration = num3;
    }

    public /* synthetic */ SleepData(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
