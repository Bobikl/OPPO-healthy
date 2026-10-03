package com.heytap.health.hrv.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/hrv/bean/HrvRank;", "", "ageGroup", "", "ageRange", "", "percentRank", "", "(ILjava/lang/String;F)V", "getAgeGroup", "()I", "getAgeRange", "()Ljava/lang/String;", "getPercentRank", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "hrv_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HrvRank {
    public static final int $stable = 0;
    private final int ageGroup;

    @NotNull
    private final String ageRange;
    private final float percentRank;

    public HrvRank(int i, @NotNull String ageRange, float f) {
        Intrinsics.checkNotNullParameter(ageRange, "ageRange");
        this.ageGroup = i;
        this.ageRange = ageRange;
        this.percentRank = f;
    }

    public static /* synthetic */ HrvRank copy$default(HrvRank hrvRank, int i, String str, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hrvRank.ageGroup;
        }
        if ((i2 & 2) != 0) {
            str = hrvRank.ageRange;
        }
        if ((i2 & 4) != 0) {
            f = hrvRank.percentRank;
        }
        return hrvRank.copy(i, str, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAgeGroup() {
        return this.ageGroup;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgeRange() {
        return this.ageRange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPercentRank() {
        return this.percentRank;
    }

    @NotNull
    public final HrvRank copy(int ageGroup, @NotNull String ageRange, float percentRank) {
        Intrinsics.checkNotNullParameter(ageRange, "ageRange");
        return new HrvRank(ageGroup, ageRange, percentRank);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrvRank)) {
            return false;
        }
        HrvRank hrvRank = (HrvRank) other;
        return this.ageGroup == hrvRank.ageGroup && Intrinsics.areEqual(this.ageRange, hrvRank.ageRange) && Float.compare(this.percentRank, hrvRank.percentRank) == 0;
    }

    public final int getAgeGroup() {
        return this.ageGroup;
    }

    @NotNull
    public final String getAgeRange() {
        return this.ageRange;
    }

    public final float getPercentRank() {
        return this.percentRank;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.ageGroup) * 31) + this.ageRange.hashCode()) * 31) + Float.hashCode(this.percentRank);
    }

    @NotNull
    public String toString() {
        return "HrvRank(ageGroup=" + this.ageGroup + ", ageRange=" + this.ageRange + ", percentRank=" + this.percentRank + ")";
    }
}
