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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fJ\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003Js\u0010(\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006/"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/SleepHabitCluster;", "", "sleepTimePercentiles", "", "", "", "wakeTimePercentiles", "maxDistance", "clusterId", "clusterNum", "clusterDayDistribution", "clusterPercent", "(Ljava/util/Map;Ljava/util/Map;DIILjava/util/Map;I)V", "getClusterDayDistribution", "()Ljava/util/Map;", "setClusterDayDistribution", "(Ljava/util/Map;)V", "getClusterId", "()I", "setClusterId", "(I)V", "getClusterNum", "setClusterNum", "getClusterPercent", "setClusterPercent", "getMaxDistance", "()D", "setMaxDistance", "(D)V", "getSleepTimePercentiles", "setSleepTimePercentiles", "getWakeTimePercentiles", "setWakeTimePercentiles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SleepHabitCluster {

    @NotNull
    private Map<Integer, Integer> clusterDayDistribution;
    private int clusterId;
    private int clusterNum;
    private int clusterPercent;
    private double maxDistance;

    @NotNull
    private Map<Integer, Double> sleepTimePercentiles;

    @NotNull
    private Map<Integer, Double> wakeTimePercentiles;

    public SleepHabitCluster() {
        this(null, null, 0.0d, 0, 0, null, 0, 127, null);
    }

    @NotNull
    public final Map<Integer, Double> component1() {
        return this.sleepTimePercentiles;
    }

    @NotNull
    public final Map<Integer, Double> component2() {
        return this.wakeTimePercentiles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMaxDistance() {
        return this.maxDistance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getClusterId() {
        return this.clusterId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getClusterNum() {
        return this.clusterNum;
    }

    @NotNull
    public final Map<Integer, Integer> component6() {
        return this.clusterDayDistribution;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getClusterPercent() {
        return this.clusterPercent;
    }

    @NotNull
    public final SleepHabitCluster copy(@NotNull Map<Integer, Double> sleepTimePercentiles, @NotNull Map<Integer, Double> wakeTimePercentiles, double maxDistance, int clusterId, int clusterNum, @NotNull Map<Integer, Integer> clusterDayDistribution, int clusterPercent) {
        Intrinsics.checkNotNullParameter(sleepTimePercentiles, "sleepTimePercentiles");
        Intrinsics.checkNotNullParameter(wakeTimePercentiles, "wakeTimePercentiles");
        Intrinsics.checkNotNullParameter(clusterDayDistribution, "clusterDayDistribution");
        return new SleepHabitCluster(sleepTimePercentiles, wakeTimePercentiles, maxDistance, clusterId, clusterNum, clusterDayDistribution, clusterPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepHabitCluster)) {
            return false;
        }
        SleepHabitCluster sleepHabitCluster = (SleepHabitCluster) other;
        return Intrinsics.areEqual(this.sleepTimePercentiles, sleepHabitCluster.sleepTimePercentiles) && Intrinsics.areEqual(this.wakeTimePercentiles, sleepHabitCluster.wakeTimePercentiles) && Intrinsics.areEqual((Object) Double.valueOf(this.maxDistance), (Object) Double.valueOf(sleepHabitCluster.maxDistance)) && this.clusterId == sleepHabitCluster.clusterId && this.clusterNum == sleepHabitCluster.clusterNum && Intrinsics.areEqual(this.clusterDayDistribution, sleepHabitCluster.clusterDayDistribution) && this.clusterPercent == sleepHabitCluster.clusterPercent;
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
    public final Map<Integer, Double> getSleepTimePercentiles() {
        return this.sleepTimePercentiles;
    }

    @NotNull
    public final Map<Integer, Double> getWakeTimePercentiles() {
        return this.wakeTimePercentiles;
    }

    public int hashCode() {
        return (((((((((((this.sleepTimePercentiles.hashCode() * 31) + this.wakeTimePercentiles.hashCode()) * 31) + Double.hashCode(this.maxDistance)) * 31) + Integer.hashCode(this.clusterId)) * 31) + Integer.hashCode(this.clusterNum)) * 31) + this.clusterDayDistribution.hashCode()) * 31) + Integer.hashCode(this.clusterPercent);
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

    public final void setSleepTimePercentiles(@NotNull Map<Integer, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sleepTimePercentiles = map;
    }

    public final void setWakeTimePercentiles(@NotNull Map<Integer, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.wakeTimePercentiles = map;
    }

    @NotNull
    public String toString() {
        return "SleepHabitCluster(sleepTimePercentiles=" + this.sleepTimePercentiles + ", wakeTimePercentiles=" + this.wakeTimePercentiles + ", maxDistance=" + this.maxDistance + ", clusterId=" + this.clusterId + ", clusterNum=" + this.clusterNum + ", clusterDayDistribution=" + this.clusterDayDistribution + ", clusterPercent=" + this.clusterPercent + ')';
    }

    public SleepHabitCluster(@NotNull Map<Integer, Double> sleepTimePercentiles, @NotNull Map<Integer, Double> wakeTimePercentiles, double d, int i, int i2, @NotNull Map<Integer, Integer> clusterDayDistribution, int i3) {
        Intrinsics.checkNotNullParameter(sleepTimePercentiles, "sleepTimePercentiles");
        Intrinsics.checkNotNullParameter(wakeTimePercentiles, "wakeTimePercentiles");
        Intrinsics.checkNotNullParameter(clusterDayDistribution, "clusterDayDistribution");
        this.sleepTimePercentiles = sleepTimePercentiles;
        this.wakeTimePercentiles = wakeTimePercentiles;
        this.maxDistance = d;
        this.clusterId = i;
        this.clusterNum = i2;
        this.clusterDayDistribution = clusterDayDistribution;
        this.clusterPercent = i3;
    }

    public /* synthetic */ SleepHabitCluster(Map map, Map map2, double d, int i, int i2, Map map3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i4 & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map2, (i4 & 4) != 0 ? 0.0d : d, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? MapsKt__MapsKt.emptyMap() : map3, (i4 & 64) == 0 ? i3 : 0);
    }
}
