package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BY\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\u001d\u0012\u0006\u0010)\u001a\u00020\u001d¢\u0006\u0004\b0\u00101B=\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020\u001d¢\u0006\u0004\b0\u00102R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f\"\u0004\b \u0010!R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0004\u0010\u001f\"\u0004\b#\u0010!R\"\u0010&\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0011\u0010\u001f\"\u0004\b%\u0010!R\"\u0010)\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001e\u001a\u0004\b\f\u0010\u001f\"\u0004\b(\u0010!R\"\u0010/\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010+\u001a\u0004\b'\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/fg9;", "", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "a", "Ljava/util/List;", b2n.f, "()Ljava/util/List;", "setLineList", "(Ljava/util/List;)V", "lineList", "Lcom/oplus/aiunit/vision/bzj;", "b", MapSchema.FIELD_NAME_ENTRY, "setDataList", "dataList", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "c", "f", "setHrvStatList", "hrvStatList", "", "d", "Z", "i", "()Z", "setShowNullChart", "(Z)V", "isShowNullChart", "", "J", "()J", "setChartStartTime", "(J)V", "chartStartTime", "setChartEndTime", "chartEndTime", "setChartLowestVisibleTime", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, b2n.g, "setChartHighestVisibleTime", BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "I", "()I", "j", "(I)V", "validLastDataIndex", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZJJJJ)V", "(Ljava/util/List;Ljava/util/List;ZJJ)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class fg9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<? extends TimeStampedData> lineList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<TimeStampedCandleData> dataList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<PhysicalMentalStat> hrvStatList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isShowNullChart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long chartStartTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long chartLowestVisibleTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long chartHighestVisibleTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int validLastDataIndex;

    public fg9(@NotNull List<? extends TimeStampedData> lineList, @NotNull List<TimeStampedCandleData> dataList, @NotNull List<PhysicalMentalStat> hrvStatList, boolean z, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(lineList, "lineList");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(hrvStatList, "hrvStatList");
        this.lineList = lineList;
        this.dataList = dataList;
        this.hrvStatList = hrvStatList;
        this.isShowNullChart = z;
        this.chartStartTime = j2;
        this.chartEndTime = j3;
        this.chartLowestVisibleTime = j4;
        this.chartHighestVisibleTime = j5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getChartEndTime() {
        return this.chartEndTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChartHighestVisibleTime() {
        return this.chartHighestVisibleTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getChartLowestVisibleTime() {
        return this.chartLowestVisibleTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    @NotNull
    public final List<TimeStampedCandleData> e() {
        return this.dataList;
    }

    @NotNull
    public final List<PhysicalMentalStat> f() {
        return this.hrvStatList;
    }

    @NotNull
    public final List<TimeStampedData> g() {
        return this.lineList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getValidLastDataIndex() {
        return this.validLastDataIndex;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsShowNullChart() {
        return this.isShowNullChart;
    }

    public final void j(int i) {
        this.validLastDataIndex = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fg9(@NotNull List<? extends TimeStampedData> lineList, @NotNull List<TimeStampedCandleData> dataList, boolean z, long j2, long j3) {
        this(lineList, dataList, new ArrayList(), z, j2, j3, 0L, 0L);
        Intrinsics.checkNotNullParameter(lineList, "lineList");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
    }
}
