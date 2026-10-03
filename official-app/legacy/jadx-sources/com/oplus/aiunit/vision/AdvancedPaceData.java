package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hq, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\t\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\t¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0017\u0010\u000fR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/hq;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "a", "Ljava/util/List;", "()Ljava/util/List;", "setHrList", "(Ljava/util/List;)V", "hrList", "b", "d", "setPcList", "pcList", "Lcom/oplus/aiunit/vision/s9i;", "c", "setOriDisList", "oriDisList", "setOriHrList", "oriHrList", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AdvancedPaceData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<? extends TimeStampedData> hrList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public List<? extends TimeStampedData> pcList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<SportChartOriginData> oriDisList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public List<SportChartOriginData> oriHrList;

    public AdvancedPaceData(@NotNull List<? extends TimeStampedData> hrList, @NotNull List<? extends TimeStampedData> pcList, @NotNull List<SportChartOriginData> oriDisList, @NotNull List<SportChartOriginData> oriHrList) {
        Intrinsics.checkNotNullParameter(hrList, "hrList");
        Intrinsics.checkNotNullParameter(pcList, "pcList");
        Intrinsics.checkNotNullParameter(oriDisList, "oriDisList");
        Intrinsics.checkNotNullParameter(oriHrList, "oriHrList");
        this.hrList = hrList;
        this.pcList = pcList;
        this.oriDisList = oriDisList;
        this.oriHrList = oriHrList;
    }

    @NotNull
    public final List<TimeStampedData> a() {
        return this.hrList;
    }

    @NotNull
    public final List<SportChartOriginData> b() {
        return this.oriDisList;
    }

    @NotNull
    public final List<SportChartOriginData> c() {
        return this.oriHrList;
    }

    @NotNull
    public final List<TimeStampedData> d() {
        return this.pcList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedPaceData)) {
            return false;
        }
        AdvancedPaceData advancedPaceData = (AdvancedPaceData) other;
        return Intrinsics.areEqual(this.hrList, advancedPaceData.hrList) && Intrinsics.areEqual(this.pcList, advancedPaceData.pcList) && Intrinsics.areEqual(this.oriDisList, advancedPaceData.oriDisList) && Intrinsics.areEqual(this.oriHrList, advancedPaceData.oriHrList);
    }

    public int hashCode() {
        return (((((this.hrList.hashCode() * 31) + this.pcList.hashCode()) * 31) + this.oriDisList.hashCode()) * 31) + this.oriHrList.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdvancedPaceData(hrList=" + this.hrList + ", pcList=" + this.pcList + ", oriDisList=" + this.oriDisList + ", oriHrList=" + this.oriHrList + ")";
    }
}
