package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006+"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/TimeCluster;", "", "clusterId", "", "clusterNum", "clusterPercent", "timePercentiles", "", "", "clusterDayDistribution", "maxDistance", "(IIILjava/util/Map;Ljava/util/Map;D)V", "getClusterDayDistribution", "()Ljava/util/Map;", "setClusterDayDistribution", "(Ljava/util/Map;)V", "getClusterId", "()I", "setClusterId", "(I)V", "getClusterNum", "setClusterNum", "getClusterPercent", "setClusterPercent", "getMaxDistance", "()D", "setMaxDistance", "(D)V", "getTimePercentiles", "setTimePercentiles", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TimeCluster {

    @NotNull
    private Map<Integer, Integer> clusterDayDistribution;
    private int clusterId;
    private int clusterNum;
    private int clusterPercent;
    private double maxDistance;

    @NotNull
    private Map<Integer, Double> timePercentiles;

    public TimeCluster() {
        this(0, 0, 0, null, null, 0.0d, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeCluster copy$default(TimeCluster timeCluster, int i, int i2, int i3, Map map, Map map2, double d, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = timeCluster.clusterId;
        }
        if ((i4 & 2) != 0) {
            i2 = timeCluster.clusterNum;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = timeCluster.clusterPercent;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            map = timeCluster.timePercentiles;
        }
        Map map3 = map;
        if ((i4 & 16) != 0) {
            map2 = timeCluster.clusterDayDistribution;
        }
        Map map4 = map2;
        if ((i4 & 32) != 0) {
            d = timeCluster.maxDistance;
        }
        return timeCluster.copy(i, i5, i6, map3, map4, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClusterId() {
        return this.clusterId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getClusterNum() {
        return this.clusterNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getClusterPercent() {
        return this.clusterPercent;
    }

    @NotNull
    public final Map<Integer, Double> component4() {
        return this.timePercentiles;
    }

    @NotNull
    public final Map<Integer, Integer> component5() {
        return this.clusterDayDistribution;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMaxDistance() {
        return this.maxDistance;
    }

    @NotNull
    public final TimeCluster copy(int clusterId, int clusterNum, int clusterPercent, @NotNull Map<Integer, Double> timePercentiles, @NotNull Map<Integer, Integer> clusterDayDistribution, double maxDistance) {
        Intrinsics.checkNotNullParameter(timePercentiles, "timePercentiles");
        Intrinsics.checkNotNullParameter(clusterDayDistribution, "clusterDayDistribution");
        return new TimeCluster(clusterId, clusterNum, clusterPercent, timePercentiles, clusterDayDistribution, maxDistance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeCluster)) {
            return false;
        }
        TimeCluster timeCluster = (TimeCluster) other;
        return this.clusterId == timeCluster.clusterId && this.clusterNum == timeCluster.clusterNum && this.clusterPercent == timeCluster.clusterPercent && Intrinsics.areEqual(this.timePercentiles, timeCluster.timePercentiles) && Intrinsics.areEqual(this.clusterDayDistribution, timeCluster.clusterDayDistribution) && Intrinsics.areEqual((Object) Double.valueOf(this.maxDistance), (Object) Double.valueOf(timeCluster.maxDistance));
    }

    @NotNull
    public final Map<Integer, Integer> getClusterDayDistribution() {
        return this.clusterDayDistribution;
    }

    public final int getClusterId() {
        return this.clusterId;
    }

    public final int getClusterNum() {
        return this.clusterNum;
    }

    public final int getClusterPercent() {
        return this.clusterPercent;
    }

    public final double getMaxDistance() {
        return this.maxDistance;
    }

    @NotNull
    public final Map<Integer, Double> getTimePercentiles() {
        return this.timePercentiles;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.clusterId) * 31) + Integer.hashCode(this.clusterNum)) * 31) + Integer.hashCode(this.clusterPercent)) * 31) + this.timePercentiles.hashCode()) * 31) + this.clusterDayDistribution.hashCode()) * 31) + Double.hashCode(this.maxDistance);
    }

    public final void setClusterDayDistribution(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.clusterDayDistribution = map;
    }

    public final void setClusterId(int i) {
        this.clusterId = i;
    }

    public final void setClusterNum(int i) {
        this.clusterNum = i;
    }

    public final void setClusterPercent(int i) {
        this.clusterPercent = i;
    }

    public final void setMaxDistance(double d) {
        this.maxDistance = d;
    }

    public final void setTimePercentiles(@NotNull Map<Integer, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.timePercentiles = map;
    }

    @NotNull
    public String toString() {
        return "TimeCluster(clusterId=" + this.clusterId + ", clusterNum=" + this.clusterNum + ", clusterPercent=" + this.clusterPercent + ", timePercentiles=" + this.timePercentiles + ", clusterDayDistribution=" + this.clusterDayDistribution + ", maxDistance=" + this.maxDistance + ')';
    }

    public TimeCluster(int i, int i2, int i3, @NotNull Map<Integer, Double> timePercentiles, @NotNull Map<Integer, Integer> clusterDayDistribution, double d) {
        Intrinsics.checkNotNullParameter(timePercentiles, "timePercentiles");
        Intrinsics.checkNotNullParameter(clusterDayDistribution, "clusterDayDistribution");
        this.clusterId = i;
        this.clusterNum = i2;
        this.clusterPercent = i3;
        this.timePercentiles = timePercentiles;
        this.clusterDayDistribution = clusterDayDistribution;
        this.maxDistance = d;
    }

    public /* synthetic */ TimeCluster(int i, int i2, int i3, Map map, Map map2, double d, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i4 & 16) != 0 ? MapsKt__MapsKt.emptyMap() : map2, (i4 & 32) != 0 ? 0.0d : d);
    }
}
