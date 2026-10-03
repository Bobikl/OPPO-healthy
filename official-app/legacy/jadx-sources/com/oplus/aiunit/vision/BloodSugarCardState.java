package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ts1, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\b\u0002\u0010&\u001a\u00020 \u0012\b\b\u0002\u0010)\u001a\u00020 \u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020.\u0012\b\b\u0002\u00104\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010)\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010-\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u00101\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b\u0013\u00100R\u001a\u00104\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b\u000b\u00103R\u001a\u00107\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00103¨\u0006:"}, d2 = {"Lcom/oplus/aiunit/vision/ts1;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "a", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "d", "()Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "setLastData", "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;)V", "lastData", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "b", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "c", "()Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "setLastBloodSugarStat", "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;)V", "lastBloodSugarStat", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "lineDataList", "", "D", b2n.g, "()D", "setSumMinValue", "(D)V", "sumMinValue", b2n.f, "setSumMaxValue", "sumMaxValue", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", "I", "()I", c8l.SPAN_KEY, "i", "getPriority", "priority", "<init>", "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;Ljava/util/List;DDLjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BloodSugarCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public BloodSugar lastData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public BloodSugarStat lastBloodSugarStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<TimeStampedData> lineDataList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public double sumMinValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public double sumMaxValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int priority;

    public BloodSugarCardState(@Nullable BloodSugar bloodSugar, @Nullable BloodSugarStat bloodSugarStat, @NotNull List<TimeStampedData> lineDataList, double d, double d2, @NotNull String ssoid, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(lineDataList, "lineDataList");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.lastData = bloodSugar;
        this.lastBloodSugarStat = bloodSugarStat;
        this.lineDataList = lineDataList;
        this.sumMinValue = d;
        this.sumMaxValue = d2;
        this.ssoid = ssoid;
        this.dataTime = j2;
        this.span = i;
        this.priority = i2;
    }

    @Override // com.oplus.aiunit.vision.g27
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public long getDataTime() {
        return this.dataTime;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BloodSugarStat getLastBloodSugarStat() {
        return this.lastBloodSugarStat;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BloodSugar getLastData() {
        return this.lastData;
    }

    @NotNull
    public final List<TimeStampedData> e() {
        return this.lineDataList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodSugarCardState)) {
            return false;
        }
        BloodSugarCardState bloodSugarCardState = (BloodSugarCardState) other;
        return Intrinsics.areEqual(this.lastData, bloodSugarCardState.lastData) && Intrinsics.areEqual(this.lastBloodSugarStat, bloodSugarCardState.lastBloodSugarStat) && Intrinsics.areEqual(this.lineDataList, bloodSugarCardState.lineDataList) && Double.compare(this.sumMinValue, bloodSugarCardState.sumMinValue) == 0 && Double.compare(this.sumMaxValue, bloodSugarCardState.sumMaxValue) == 0 && Intrinsics.areEqual(getSsoid(), bloodSugarCardState.getSsoid()) && getDataTime() == bloodSugarCardState.getDataTime() && getSpan() == bloodSugarCardState.getSpan() && getPriority() == bloodSugarCardState.getPriority();
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getSumMaxValue() {
        return this.sumMaxValue;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getSumMinValue() {
        return this.sumMinValue;
    }

    public int hashCode() {
        BloodSugar bloodSugar = this.lastData;
        int iHashCode = (bloodSugar == null ? 0 : bloodSugar.hashCode()) * 31;
        BloodSugarStat bloodSugarStat = this.lastBloodSugarStat;
        return ((((((((((((((iHashCode + (bloodSugarStat != null ? bloodSugarStat.hashCode() : 0)) * 31) + this.lineDataList.hashCode()) * 31) + Double.hashCode(this.sumMinValue)) * 31) + Double.hashCode(this.sumMaxValue)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "BloodSugarCardState(lastData=" + this.lastData + ", lastBloodSugarStat=" + this.lastBloodSugarStat + ", lineDataList=" + this.lineDataList + ", sumMinValue=" + this.sumMinValue + ", sumMaxValue=" + this.sumMaxValue + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ BloodSugarCardState(BloodSugar bloodSugar, BloodSugarStat bloodSugarStat, List list, double d, double d2, String str, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bloodSugar, (i3 & 2) != 0 ? null : bloodSugarStat, (i3 & 4) != 0 ? new ArrayList() : list, (i3 & 8) != 0 ? 0.0d : d, (i3 & 16) != 0 ? 0.0d : d2, str, j2, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? 6 : i2);
    }
}
