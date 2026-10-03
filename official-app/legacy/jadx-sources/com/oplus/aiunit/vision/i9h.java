package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BK\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-B/\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b,\u0010.R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\f\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010%\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b\u0010\u0010\u001b\"\u0004\b$\u0010\u001dR\"\u0010+\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010'\u001a\u0004\b#\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/i9h;", "", "", "Lcom/oplus/aiunit/vision/bzj;", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "b", "setBreathRateStatList", "breathRateStatList", "", "c", "Z", b2n.g, "()Z", "setShowNullChart", "(Z)V", "isShowNullChart", "", "d", "J", MapSchema.FIELD_NAME_ENTRY, "()J", "setChartStartTime", "(J)V", "chartStartTime", "setChartEndTime", "chartEndTime", "setChartLowestVisibleTime", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, b2n.f, "setChartHighestVisibleTime", BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "I", "()I", "i", "(I)V", "validLastDataIndex", "<init>", "(Ljava/util/List;Ljava/util/List;ZJJJJ)V", "(Ljava/util/List;ZJJ)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class i9h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<TimeStampedCandleData> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<BreathRateStat> breathRateStatList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isShowNullChart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long chartStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long chartLowestVisibleTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long chartHighestVisibleTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int validLastDataIndex;

    public i9h(@NotNull List<TimeStampedCandleData> dataList, @NotNull List<BreathRateStat> breathRateStatList, boolean z, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        this.dataList = dataList;
        this.breathRateStatList = breathRateStatList;
        this.isShowNullChart = z;
        this.chartStartTime = j2;
        this.chartEndTime = j3;
        this.chartLowestVisibleTime = j4;
        this.chartHighestVisibleTime = j5;
    }

    @NotNull
    public final List<BreathRateStat> a() {
        return this.breathRateStatList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChartEndTime() {
        return this.chartEndTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getChartHighestVisibleTime() {
        return this.chartHighestVisibleTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getChartLowestVisibleTime() {
        return this.chartLowestVisibleTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    @NotNull
    public final List<TimeStampedCandleData> f() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getValidLastDataIndex() {
        return this.validLastDataIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsShowNullChart() {
        return this.isShowNullChart;
    }

    public final void i(int i) {
        this.validLastDataIndex = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i9h(@NotNull List<TimeStampedCandleData> dataList, boolean z, long j2, long j3) {
        this(dataList, new ArrayList(), z, j2, j3, 0L, 0L);
        Intrinsics.checkNotNullParameter(dataList, "dataList");
    }
}
