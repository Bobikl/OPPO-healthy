package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fje, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020&\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010%\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010)\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u001e\u0010(R\u001a\u0010*\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u000b\u0010\u001aR\u001a\u0010-\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001a¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/fje;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "a", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "c", "()Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "setCurStat", "(Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;)V", "curStat", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "b", "Ljava/util/List;", "()Ljava/util/List;", "chartDataList", "I", "f", "()I", "setSumAvgStress", "(I)V", "sumAvgStress", "d", b2n.f, "setSumStressState", "sumStressState", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", c8l.SPAN_KEY, b2n.g, "getPriority", "priority", "<init>", "(Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;Ljava/util/List;IILjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PhysicalMentalCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public PhysicalMentalStat curStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<TimeStampedData> chartDataList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int sumAvgStress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int sumStressState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int priority;

    public PhysicalMentalCardState(@Nullable PhysicalMentalStat physicalMentalStat, @Nullable List<TimeStampedData> list, int i, int i2, @NotNull String ssoid, long j2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.curStat = physicalMentalStat;
        this.chartDataList = list;
        this.sumAvgStress = i;
        this.sumStressState = i2;
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

    @Nullable
    public final List<TimeStampedData> b() {
        return this.chartDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhysicalMentalStat getCurStat() {
        return this.curStat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getDataTime() {
        return this.dataTime;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalMentalCardState)) {
            return false;
        }
        PhysicalMentalCardState physicalMentalCardState = (PhysicalMentalCardState) other;
        return Intrinsics.areEqual(this.curStat, physicalMentalCardState.curStat) && Intrinsics.areEqual(this.chartDataList, physicalMentalCardState.chartDataList) && this.sumAvgStress == physicalMentalCardState.sumAvgStress && this.sumStressState == physicalMentalCardState.sumStressState && Intrinsics.areEqual(getSsoid(), physicalMentalCardState.getSsoid()) && getDataTime() == physicalMentalCardState.getDataTime() && getSpan() == physicalMentalCardState.getSpan() && getPriority() == physicalMentalCardState.getPriority();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSumAvgStress() {
        return this.sumAvgStress;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSumStressState() {
        return this.sumStressState;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        PhysicalMentalStat physicalMentalStat = this.curStat;
        int iHashCode = (physicalMentalStat == null ? 0 : physicalMentalStat.hashCode()) * 31;
        List<TimeStampedData> list = this.chartDataList;
        return ((((((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.sumAvgStress)) * 31) + Integer.hashCode(this.sumStressState)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "PhysicalMentalCardState(curStat=" + this.curStat + ", chartDataList=" + this.chartDataList + ", sumAvgStress=" + this.sumAvgStress + ", sumStressState=" + this.sumStressState + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ PhysicalMentalCardState(PhysicalMentalStat physicalMentalStat, List list, int i, int i2, String str, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : physicalMentalStat, (i5 & 2) != 0 ? null : list, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, str, j2, (i5 & 64) != 0 ? 1 : i3, (i5 & 128) != 0 ? 4 : i4);
    }
}
