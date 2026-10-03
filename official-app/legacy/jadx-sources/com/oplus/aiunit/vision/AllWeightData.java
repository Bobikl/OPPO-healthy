package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u00, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/u00;", "", "", "mode", "", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "a", "", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "latest", "getLightest", "lightest", "c", "getHeaviest", "heaviest", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AllWeightData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<WeightBodyFat> latest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<WeightBodyFat> lightest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<WeightBodyFat> heaviest;

    public AllWeightData() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final List<WeightBodyFat> a(int mode) {
        if (mode != 1) {
            return mode != 2 ? this.latest : this.heaviest;
        }
        return this.lightest;
    }

    @NotNull
    public final List<WeightBodyFat> b() {
        return this.latest;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllWeightData)) {
            return false;
        }
        AllWeightData allWeightData = (AllWeightData) other;
        return Intrinsics.areEqual(this.latest, allWeightData.latest) && Intrinsics.areEqual(this.lightest, allWeightData.lightest) && Intrinsics.areEqual(this.heaviest, allWeightData.heaviest);
    }

    public int hashCode() {
        return (((this.latest.hashCode() * 31) + this.lightest.hashCode()) * 31) + this.heaviest.hashCode();
    }

    @NotNull
    public String toString() {
        return "AllWeightData(latest=" + this.latest + ", lightest=" + this.lightest + ", heaviest=" + this.heaviest + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllWeightData(@NotNull List<? extends WeightBodyFat> latest, @NotNull List<? extends WeightBodyFat> lightest, @NotNull List<? extends WeightBodyFat> heaviest) {
        Intrinsics.checkNotNullParameter(latest, "latest");
        Intrinsics.checkNotNullParameter(lightest, "lightest");
        Intrinsics.checkNotNullParameter(heaviest, "heaviest");
        this.latest = latest;
        this.lightest = lightest;
        this.heaviest = heaviest;
    }

    public /* synthetic */ AllWeightData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
