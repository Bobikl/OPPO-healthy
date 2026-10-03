package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.rj3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\"\u0010\u001a¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/rj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "a", "Ljava/util/List;", "()Ljava/util/List;", "chartList", "b", "Ljava/lang/String;", "()Ljava/lang/String;", b2n.f, "(Ljava/lang/String;)V", DBHealthReviewPlan.DESC, "c", "I", "f", "()I", MapSchema.FIELD_NAME_KEY, "(I)V", "relax", "d", "i", "medium", MapSchema.FIELD_NAME_ENTRY, "j", "midToHigh", b2n.g, "hight", "<init>", "(Ljava/util/List;Ljava/lang/String;IIII)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CoachHistoryData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<TimeStampedData> chartList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String desc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int relax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int medium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int midToHigh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int hight;

    public CoachHistoryData() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    @NotNull
    public final List<TimeStampedData> a() {
        return this.chartList;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHight() {
        return this.hight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMedium() {
        return this.medium;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMidToHigh() {
        return this.midToHigh;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachHistoryData)) {
            return false;
        }
        CoachHistoryData coachHistoryData = (CoachHistoryData) other;
        return Intrinsics.areEqual(this.chartList, coachHistoryData.chartList) && Intrinsics.areEqual(this.desc, coachHistoryData.desc) && this.relax == coachHistoryData.relax && this.medium == coachHistoryData.medium && this.midToHigh == coachHistoryData.midToHigh && this.hight == coachHistoryData.hight;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRelax() {
        return this.relax;
    }

    public final void g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc = str;
    }

    public final void h(int i) {
        this.hight = i;
    }

    public int hashCode() {
        return (((((((((this.chartList.hashCode() * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.relax)) * 31) + Integer.hashCode(this.medium)) * 31) + Integer.hashCode(this.midToHigh)) * 31) + Integer.hashCode(this.hight);
    }

    public final void i(int i) {
        this.medium = i;
    }

    public final void j(int i) {
        this.midToHigh = i;
    }

    public final void k(int i) {
        this.relax = i;
    }

    @NotNull
    public String toString() {
        return "CoachHistoryData(chartList=" + this.chartList + ", desc=" + this.desc + ", relax=" + this.relax + ", medium=" + this.medium + ", midToHigh=" + this.midToHigh + ", hight=" + this.hight + ")";
    }

    public CoachHistoryData(@NotNull List<TimeStampedData> chartList, @NotNull String desc, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(chartList, "chartList");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.chartList = chartList;
        this.desc = desc;
        this.relax = i;
        this.medium = i2;
        this.midToHigh = i3;
        this.hight = i4;
    }

    public /* synthetic */ CoachHistoryData(List list, String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new ArrayList() : list, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) == 0 ? i4 : 0);
    }
}
