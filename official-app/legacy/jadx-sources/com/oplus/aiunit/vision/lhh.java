package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/lhh;", "", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "heartRateAverageList", "c", "typicalHeightList", "", "I", "()I", MapSchema.FIELD_NAME_ENTRY, "(I)V", "chartAverageHr", "d", "f", "warningNum", "<init>", "()V", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class lhh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> heartRateAverageList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> typicalHeightList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int chartAverageHr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int warningNum;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getChartAverageHr() {
        return this.chartAverageHr;
    }

    @NotNull
    public final List<TimeStampedData> b() {
        return this.heartRateAverageList;
    }

    @NotNull
    public final List<TimeStampedData> c() {
        return this.typicalHeightList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getWarningNum() {
        return this.warningNum;
    }

    public final void e(int i) {
        this.chartAverageHr = i;
    }

    public final void f(int i) {
        this.warningNum = i;
    }
}
