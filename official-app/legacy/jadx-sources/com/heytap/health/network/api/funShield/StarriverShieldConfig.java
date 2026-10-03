package com.heytap.health.network.api.funShield;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/network/api/funShield/StarriverShieldConfig;", "", "starRiverFeature", "", "starRiverOta1Version", "", "astraFeature", "(ZIZ)V", "getAstraFeature", "()Z", "getStarRiverFeature", "getStarRiverOta1Version", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StarriverShieldConfig {
    private final boolean astraFeature;
    private final boolean starRiverFeature;
    private final int starRiverOta1Version;

    public StarriverShieldConfig(boolean z, int i, boolean z2) {
        this.starRiverFeature = z;
        this.starRiverOta1Version = i;
        this.astraFeature = z2;
    }

    public static /* synthetic */ StarriverShieldConfig copy$default(StarriverShieldConfig starriverShieldConfig, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = starriverShieldConfig.starRiverFeature;
        }
        if ((i2 & 2) != 0) {
            i = starriverShieldConfig.starRiverOta1Version;
        }
        if ((i2 & 4) != 0) {
            z2 = starriverShieldConfig.astraFeature;
        }
        return starriverShieldConfig.copy(z, i, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getStarRiverFeature() {
        return this.starRiverFeature;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStarRiverOta1Version() {
        return this.starRiverOta1Version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAstraFeature() {
        return this.astraFeature;
    }

    @NotNull
    public final StarriverShieldConfig copy(boolean starRiverFeature, int starRiverOta1Version, boolean astraFeature) {
        return new StarriverShieldConfig(starRiverFeature, starRiverOta1Version, astraFeature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarriverShieldConfig)) {
            return false;
        }
        StarriverShieldConfig starriverShieldConfig = (StarriverShieldConfig) other;
        return this.starRiverFeature == starriverShieldConfig.starRiverFeature && this.starRiverOta1Version == starriverShieldConfig.starRiverOta1Version && this.astraFeature == starriverShieldConfig.astraFeature;
    }

    public final boolean getAstraFeature() {
        return this.astraFeature;
    }

    public final boolean getStarRiverFeature() {
        return this.starRiverFeature;
    }

    public final int getStarRiverOta1Version() {
        return this.starRiverOta1Version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.starRiverFeature;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + Integer.hashCode(this.starRiverOta1Version)) * 31;
        boolean z2 = this.astraFeature;
        return iHashCode + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "StarriverShieldConfig(starRiverFeature=" + this.starRiverFeature + ", starRiverOta1Version=" + this.starRiverOta1Version + ", astraFeature=" + this.astraFeature + ")";
    }
}
