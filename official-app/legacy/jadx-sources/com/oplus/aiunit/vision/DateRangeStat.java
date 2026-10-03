package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.p05, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/p05;", "", "Lcom/oplus/aiunit/vision/hti;", "a", "b", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/hti;", "d", "()Lcom/oplus/aiunit/vision/hti;", "beforeAvgStat", "f", "curAvgStat", "", "c", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "beforeStatList", "afterStatList", "<init>", "(Lcom/oplus/aiunit/vision/hti;Lcom/oplus/aiunit/vision/hti;Ljava/util/List;Ljava/util/List;)V", "sport_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DateRangeStat {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final StepStat beforeAvgStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final StepStat curAvgStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<StepStat> beforeStatList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<StepStat> afterStatList;

    public DateRangeStat(@NotNull StepStat beforeAvgStat, @NotNull StepStat curAvgStat, @NotNull List<StepStat> beforeStatList, @NotNull List<StepStat> afterStatList) {
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
    /* JADX INFO: renamed from: a, reason: from getter */
    public final StepStat getBeforeAvgStat() {
        return this.beforeAvgStat;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final StepStat getCurAvgStat() {
        return this.curAvgStat;
    }

    @NotNull
    public final List<StepStat> c() {
        return this.afterStatList;
    }

    @NotNull
    public final StepStat d() {
        return this.beforeAvgStat;
    }

    @NotNull
    public final List<StepStat> e() {
        return this.beforeStatList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateRangeStat)) {
            return false;
        }
        DateRangeStat dateRangeStat = (DateRangeStat) other;
        return Intrinsics.areEqual(this.beforeAvgStat, dateRangeStat.beforeAvgStat) && Intrinsics.areEqual(this.curAvgStat, dateRangeStat.curAvgStat) && Intrinsics.areEqual(this.beforeStatList, dateRangeStat.beforeStatList) && Intrinsics.areEqual(this.afterStatList, dateRangeStat.afterStatList);
    }

    @NotNull
    public final StepStat f() {
        return this.curAvgStat;
    }

    public int hashCode() {
        return (((((this.beforeAvgStat.hashCode() * 31) + this.curAvgStat.hashCode()) * 31) + this.beforeStatList.hashCode()) * 31) + this.afterStatList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DateRangeStat(beforeAvgStat=" + this.beforeAvgStat + ", curAvgStat=" + this.curAvgStat + ", beforeStatList=" + this.beforeStatList + ", afterStatList=" + this.afterStatList + ")";
    }
}
