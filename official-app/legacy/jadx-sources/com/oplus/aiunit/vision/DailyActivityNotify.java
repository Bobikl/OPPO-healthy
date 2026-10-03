package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.gq4, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/gq4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/spe;", "a", "Lcom/oplus/aiunit/vision/spe;", "()Lcom/oplus/aiunit/vision/spe;", "activityComplete", "b", "activityPraise", "c", "dailyReport", "d", "weekReport", "<init>", "(Lcom/oplus/aiunit/vision/spe;Lcom/oplus/aiunit/vision/spe;Lcom/oplus/aiunit/vision/spe;Lcom/oplus/aiunit/vision/spe;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DailyActivityNotify {
    public static final int $stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final PrefStruct activityComplete;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final PrefStruct activityPraise;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final PrefStruct dailyReport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final PrefStruct weekReport;

    static {
        int i = PrefStruct.$stable;
        $stable = i | i | i | i;
    }

    public DailyActivityNotify(@NotNull PrefStruct activityComplete, @Nullable PrefStruct prefStruct, @NotNull PrefStruct dailyReport, @NotNull PrefStruct weekReport) {
        Intrinsics.checkNotNullParameter(activityComplete, "activityComplete");
        Intrinsics.checkNotNullParameter(dailyReport, "dailyReport");
        Intrinsics.checkNotNullParameter(weekReport, "weekReport");
        this.activityComplete = activityComplete;
        this.activityPraise = prefStruct;
        this.dailyReport = dailyReport;
        this.weekReport = weekReport;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PrefStruct getActivityComplete() {
        return this.activityComplete;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PrefStruct getActivityPraise() {
        return this.activityPraise;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PrefStruct getDailyReport() {
        return this.dailyReport;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final PrefStruct getWeekReport() {
        return this.weekReport;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyActivityNotify)) {
            return false;
        }
        DailyActivityNotify dailyActivityNotify = (DailyActivityNotify) other;
        return Intrinsics.areEqual(this.activityComplete, dailyActivityNotify.activityComplete) && Intrinsics.areEqual(this.activityPraise, dailyActivityNotify.activityPraise) && Intrinsics.areEqual(this.dailyReport, dailyActivityNotify.dailyReport) && Intrinsics.areEqual(this.weekReport, dailyActivityNotify.weekReport);
    }

    public int hashCode() {
        int iHashCode = this.activityComplete.hashCode() * 31;
        PrefStruct prefStruct = this.activityPraise;
        return ((((iHashCode + (prefStruct == null ? 0 : prefStruct.hashCode())) * 31) + this.dailyReport.hashCode()) * 31) + this.weekReport.hashCode();
    }

    @NotNull
    public String toString() {
        return "DailyActivityNotify(activityComplete=" + this.activityComplete + ", activityPraise=" + this.activityPraise + ", dailyReport=" + this.dailyReport + ", weekReport=" + this.weekReport + ")";
    }
}
