package com.heytap.health.home.datacard;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/home/datacard/RankParams;", "", "ssoid", "", "region", "totalSteps", "", "modifyTime", "", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "getModifyTime", "()J", "getRegion", "()Ljava/lang/String;", "getSsoid", "getTotalSteps", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RankParams {
    public static final int $stable = 0;
    private final long modifyTime;

    @NotNull
    private final String region;

    @NotNull
    private final String ssoid;
    private final int totalSteps;

    public RankParams(@NotNull String ssoid, @NotNull String region, int i, long j2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(region, "region");
        this.ssoid = ssoid;
        this.region = region;
        this.totalSteps = i;
        this.modifyTime = j2;
    }

    public static /* synthetic */ RankParams copy$default(RankParams rankParams, String str, String str2, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rankParams.ssoid;
        }
        if ((i2 & 2) != 0) {
            str2 = rankParams.region;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = rankParams.totalSteps;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j2 = rankParams.modifyTime;
        }
        return rankParams.copy(str, str3, i3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getModifyTime() {
        return this.modifyTime;
    }

    @NotNull
    public final RankParams copy(@NotNull String ssoid, @NotNull String region, int totalSteps, long modifyTime) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(region, "region");
        return new RankParams(ssoid, region, totalSteps, modifyTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankParams)) {
            return false;
        }
        RankParams rankParams = (RankParams) other;
        return Intrinsics.areEqual(this.ssoid, rankParams.ssoid) && Intrinsics.areEqual(this.region, rankParams.region) && this.totalSteps == rankParams.totalSteps && this.modifyTime == rankParams.modifyTime;
    }

    public final long getModifyTime() {
        return this.modifyTime;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        return (((((this.ssoid.hashCode() * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.totalSteps)) * 31) + Long.hashCode(this.modifyTime);
    }

    @NotNull
    public String toString() {
        return "RankParams(ssoid=" + this.ssoid + ", region=" + this.region + ", totalSteps=" + this.totalSteps + ", modifyTime=" + this.modifyTime + ")";
    }
}
