package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.bean.ConsumptionCompareData;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.iu2, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/iu2;", "", "Lcom/oplus/aiunit/vision/mu2;", "a", "b", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/mu2;", "f", "()Lcom/oplus/aiunit/vision/mu2;", "beforeStat", "d", "afterStat", "", "Lcom/heytap/health/daily/bean/ConsumptionCompareData;", "c", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "beforeDataList", "afterDataList", "<init>", "(Lcom/oplus/aiunit/vision/mu2;Lcom/oplus/aiunit/vision/mu2;Ljava/util/List;Ljava/util/List;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalorieDateRangeStat {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final CalorieStat beforeStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final CalorieStat afterStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<ConsumptionCompareData> beforeDataList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<ConsumptionCompareData> afterDataList;

    public CalorieDateRangeStat(@NotNull CalorieStat beforeStat, @NotNull CalorieStat afterStat, @NotNull List<ConsumptionCompareData> beforeDataList, @NotNull List<ConsumptionCompareData> afterDataList) {
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
    public final CalorieStat getBeforeStat() {
        return this.beforeStat;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final CalorieStat getAfterStat() {
        return this.afterStat;
    }

    @NotNull
    public final List<ConsumptionCompareData> c() {
        return this.afterDataList;
    }

    @NotNull
    public final CalorieStat d() {
        return this.afterStat;
    }

    @NotNull
    public final List<ConsumptionCompareData> e() {
        return this.beforeDataList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalorieDateRangeStat)) {
            return false;
        }
        CalorieDateRangeStat calorieDateRangeStat = (CalorieDateRangeStat) other;
        return Intrinsics.areEqual(this.beforeStat, calorieDateRangeStat.beforeStat) && Intrinsics.areEqual(this.afterStat, calorieDateRangeStat.afterStat) && Intrinsics.areEqual(this.beforeDataList, calorieDateRangeStat.beforeDataList) && Intrinsics.areEqual(this.afterDataList, calorieDateRangeStat.afterDataList);
    }

    @NotNull
    public final CalorieStat f() {
        return this.beforeStat;
    }

    public int hashCode() {
        return (((((this.beforeStat.hashCode() * 31) + this.afterStat.hashCode()) * 31) + this.beforeDataList.hashCode()) * 31) + this.afterDataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalorieDateRangeStat(beforeStat=" + this.beforeStat + ", afterStat=" + this.afterStat + ", beforeDataList=" + this.beforeDataList + ", afterDataList=" + this.afterDataList + ")";
    }
}
