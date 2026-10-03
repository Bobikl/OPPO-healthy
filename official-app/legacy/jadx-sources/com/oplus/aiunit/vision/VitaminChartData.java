package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.y1l, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR4\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R4\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\t\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/y1l;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", MapSchema.FIELD_NAME_ENTRY, "(I)V", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "", "Lkotlin/Pair;", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "sunshineEntries", "d", "manualEntries", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VitaminChartData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public List<Pair<Integer, Float>> sunshineEntries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<Pair<Integer, Float>> manualEntries;

    public VitaminChartData() {
        this(0, null, null, 7, null);
    }

    @NotNull
    public final List<Pair<Integer, Float>> a() {
        return this.manualEntries;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final List<Pair<Integer, Float>> c() {
        return this.sunshineEntries;
    }

    public final void d(@NotNull List<Pair<Integer, Float>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.manualEntries = list;
    }

    public final void e(int i) {
        this.startDate = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VitaminChartData)) {
            return false;
        }
        VitaminChartData vitaminChartData = (VitaminChartData) other;
        return this.startDate == vitaminChartData.startDate && Intrinsics.areEqual(this.sunshineEntries, vitaminChartData.sunshineEntries) && Intrinsics.areEqual(this.manualEntries, vitaminChartData.manualEntries);
    }

    public final void f(@NotNull List<Pair<Integer, Float>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sunshineEntries = list;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.startDate) * 31) + this.sunshineEntries.hashCode()) * 31) + this.manualEntries.hashCode();
    }

    @NotNull
    public String toString() {
        return "VitaminChartData(startDate=" + this.startDate + ", sunshineEntries=" + this.sunshineEntries + ", manualEntries=" + this.manualEntries + ")";
    }

    public VitaminChartData(int i, @NotNull List<Pair<Integer, Float>> sunshineEntries, @NotNull List<Pair<Integer, Float>> manualEntries) {
        Intrinsics.checkNotNullParameter(sunshineEntries, "sunshineEntries");
        Intrinsics.checkNotNullParameter(manualEntries, "manualEntries");
        this.startDate = i;
        this.sunshineEntries = sunshineEntries;
        this.manualEntries = manualEntries;
    }

    public /* synthetic */ VitaminChartData(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
