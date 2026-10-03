package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.stress.Stress;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fxi, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020(\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010'\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b\u001d\u0010*R\u001a\u0010,\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\u000b\u0010 R\u001a\u0010/\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 ¨\u00062"}, d2 = {"Lcom/oplus/aiunit/vision/fxi;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/stress/Stress;", "a", "Lcom/heytap/databaseengine/model/stress/Stress;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/databaseengine/model/stress/Stress;", "lastData", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "b", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "c", "()Lcom/heytap/databaseengine/model/stress/StressDataStat;", "setCurStat", "(Lcom/heytap/databaseengine/model/stress/StressDataStat;)V", "curStat", "", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", "Ljava/util/List;", "()Ljava/util/List;", "chartData", "d", "I", b2n.f, "()I", "minStress", "f", "maxStress", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", c8l.SPAN_KEY, "i", "getPriority", "priority", "<init>", "(Lcom/heytap/databaseengine/model/stress/Stress;Lcom/heytap/databaseengine/model/stress/StressDataStat;Ljava/util/List;IILjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StressCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Stress lastData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public StressDataStat curStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<HealthSingleBarEntry> chartData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int minStress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int maxStress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int priority;

    public StressCardState(@Nullable Stress stress, @Nullable StressDataStat stressDataStat, @NotNull List<HealthSingleBarEntry> chartData, int i, int i2, @NotNull String ssoid, long j2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.lastData = stress;
        this.curStat = stressDataStat;
        this.chartData = chartData;
        this.minStress = i;
        this.maxStress = i2;
        this.ssoid = ssoid;
        this.dataTime = j2;
        this.span = i3;
        this.priority = i4;
    }

    @Override // com.oplus.aiunit.vision.g27
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @NotNull
    public final List<HealthSingleBarEntry> b() {
        return this.chartData;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final StressDataStat getCurStat() {
        return this.curStat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getDataTime() {
        return this.dataTime;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Stress getLastData() {
        return this.lastData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressCardState)) {
            return false;
        }
        StressCardState stressCardState = (StressCardState) other;
        return Intrinsics.areEqual(this.lastData, stressCardState.lastData) && Intrinsics.areEqual(this.curStat, stressCardState.curStat) && Intrinsics.areEqual(this.chartData, stressCardState.chartData) && this.minStress == stressCardState.minStress && this.maxStress == stressCardState.maxStress && Intrinsics.areEqual(getSsoid(), stressCardState.getSsoid()) && getDataTime() == stressCardState.getDataTime() && getSpan() == stressCardState.getSpan() && getPriority() == stressCardState.getPriority();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        Stress stress = this.lastData;
        int iHashCode = (stress == null ? 0 : stress.hashCode()) * 31;
        StressDataStat stressDataStat = this.curStat;
        return ((((((((((((((iHashCode + (stressDataStat != null ? stressDataStat.hashCode() : 0)) * 31) + this.chartData.hashCode()) * 31) + Integer.hashCode(this.minStress)) * 31) + Integer.hashCode(this.maxStress)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "StressCardState(lastData=" + this.lastData + ", curStat=" + this.curStat + ", chartData=" + this.chartData + ", minStress=" + this.minStress + ", maxStress=" + this.maxStress + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ StressCardState(Stress stress, StressDataStat stressDataStat, List list, int i, int i2, String str, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(stress, (i5 & 2) != 0 ? null : stressDataStat, (i5 & 4) != 0 ? new ArrayList() : list, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, str, j2, (i5 & 128) != 0 ? 1 : i3, (i5 & 256) != 0 ? 9 : i4);
    }
}
