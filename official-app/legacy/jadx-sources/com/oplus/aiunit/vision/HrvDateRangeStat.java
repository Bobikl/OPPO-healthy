package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kg9, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/kg9;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/fh9;", "a", "Lcom/oplus/aiunit/vision/fh9;", "b", "()Lcom/oplus/aiunit/vision/fh9;", "beforeAvgStat", "d", "curAvgStat", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "beforeStatList", "afterStatList", "<init>", "(Lcom/oplus/aiunit/vision/fh9;Lcom/oplus/aiunit/vision/fh9;Ljava/util/List;Ljava/util/List;)V", "health_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HrvDateRangeStat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final HrvStat beforeAvgStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final HrvStat curAvgStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<HrvStat> beforeStatList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<HrvStat> afterStatList;

    public HrvDateRangeStat(@NotNull HrvStat beforeAvgStat, @NotNull HrvStat curAvgStat, @NotNull List<HrvStat> beforeStatList, @NotNull List<HrvStat> afterStatList) {
        Intrinsics.checkNotNullParameter(beforeAvgStat, "beforeAvgStat");
        Intrinsics.checkNotNullParameter(curAvgStat, "curAvgStat");
        Intrinsics.checkNotNullParameter(beforeStatList, "beforeStatList");
        Intrinsics.checkNotNullParameter(afterStatList, "afterStatList");
        this.beforeAvgStat = beforeAvgStat;
        this.curAvgStat = curAvgStat;
        this.beforeStatList = beforeStatList;
        this.afterStatList = afterStatList;
    }

    @NotNull
    public final List<HrvStat> a() {
        return this.afterStatList;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HrvStat getBeforeAvgStat() {
        return this.beforeAvgStat;
    }

    @NotNull
    public final List<HrvStat> c() {
        return this.beforeStatList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final HrvStat getCurAvgStat() {
        return this.curAvgStat;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrvDateRangeStat)) {
            return false;
        }
        HrvDateRangeStat hrvDateRangeStat = (HrvDateRangeStat) other;
        return Intrinsics.areEqual(this.beforeAvgStat, hrvDateRangeStat.beforeAvgStat) && Intrinsics.areEqual(this.curAvgStat, hrvDateRangeStat.curAvgStat) && Intrinsics.areEqual(this.beforeStatList, hrvDateRangeStat.beforeStatList) && Intrinsics.areEqual(this.afterStatList, hrvDateRangeStat.afterStatList);
    }

    public int hashCode() {
        return (((((this.beforeAvgStat.hashCode() * 31) + this.curAvgStat.hashCode()) * 31) + this.beforeStatList.hashCode()) * 31) + this.afterStatList.hashCode();
    }

    @NotNull
    public String toString() {
        return "HrvDateRangeStat(beforeAvgStat=" + this.beforeAvgStat + ", curAvgStat=" + this.curAvgStat + ", beforeStatList=" + this.beforeStatList + ", afterStatList=" + this.afterStatList + ")";
    }
}
