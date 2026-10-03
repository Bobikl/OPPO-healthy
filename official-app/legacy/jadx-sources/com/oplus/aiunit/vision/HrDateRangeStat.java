package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lf9, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/lf9;", "", "Lcom/oplus/aiunit/vision/h69;", "a", "b", "", "Lcom/oplus/aiunit/vision/c49;", "c", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/h69;", b2n.f, "()Lcom/oplus/aiunit/vision/h69;", "beforeStat", MapSchema.FIELD_NAME_ENTRY, "afterStat", "Ljava/util/List;", "f", "()Ljava/util/List;", "beforeDataList", "d", "afterDataList", "<init>", "(Lcom/oplus/aiunit/vision/h69;Lcom/oplus/aiunit/vision/h69;Ljava/util/List;Ljava/util/List;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HrDateRangeStat {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final HeartRateStat beforeStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final HeartRateStat afterStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<c49> beforeDataList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<c49> afterDataList;

    /* JADX WARN: Multi-variable type inference failed */
    public HrDateRangeStat(@NotNull HeartRateStat beforeStat, @NotNull HeartRateStat afterStat, @NotNull List<? extends c49> beforeDataList, @NotNull List<? extends c49> afterDataList) {
        Intrinsics.checkNotNullParameter(beforeStat, "beforeStat");
        Intrinsics.checkNotNullParameter(afterStat, "afterStat");
        Intrinsics.checkNotNullParameter(beforeDataList, "beforeDataList");
        Intrinsics.checkNotNullParameter(afterDataList, "afterDataList");
        this.beforeStat = beforeStat;
        this.afterStat = afterStat;
        this.beforeDataList = beforeDataList;
        this.afterDataList = afterDataList;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HeartRateStat getBeforeStat() {
        return this.beforeStat;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HeartRateStat getAfterStat() {
        return this.afterStat;
    }

    @NotNull
    public final List<c49> c() {
        return this.afterDataList;
    }

    @NotNull
    public final List<c49> d() {
        return this.afterDataList;
    }

    @NotNull
    public final HeartRateStat e() {
        return this.afterStat;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrDateRangeStat)) {
            return false;
        }
        HrDateRangeStat hrDateRangeStat = (HrDateRangeStat) other;
        return Intrinsics.areEqual(this.beforeStat, hrDateRangeStat.beforeStat) && Intrinsics.areEqual(this.afterStat, hrDateRangeStat.afterStat) && Intrinsics.areEqual(this.beforeDataList, hrDateRangeStat.beforeDataList) && Intrinsics.areEqual(this.afterDataList, hrDateRangeStat.afterDataList);
    }

    @NotNull
    public final List<c49> f() {
        return this.beforeDataList;
    }

    @NotNull
    public final HeartRateStat g() {
        return this.beforeStat;
    }

    public int hashCode() {
        return (((((this.beforeStat.hashCode() * 31) + this.afterStat.hashCode()) * 31) + this.beforeDataList.hashCode()) * 31) + this.afterDataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "HrDateRangeStat(beforeStat=" + this.beforeStat + ", afterStat=" + this.afterStat + ", beforeDataList=" + this.beforeDataList + ", afterDataList=" + this.afterDataList + ")";
    }
}
