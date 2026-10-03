package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l39, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020%\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001e\u0010#R\u001a\u0010(\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b\u001a\u0010'R\u001a\u0010)\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\f\u0010\u0016R\u001a\u0010,\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/l39;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lcom/heytap/databaseengine/model/HeartRate;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "data", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "b", "chartData", "I", b2n.f, "()I", "setSumMinHeartRate", "(I)V", "sumMinHeartRate", "d", "f", "setSumMaxHeartRate", "sumMaxHeartRate", MapSchema.FIELD_NAME_ENTRY, b2n.g, "setSumRestHeartRate", "sumRestHeartRate", "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", c8l.SPAN_KEY, "i", "getPriority", "priority", "<init>", "(Ljava/util/List;Ljava/util/List;IIILjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HeartRateCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<HeartRate> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<HealthCandleEntry> chartData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int sumMinHeartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int sumMaxHeartRate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int sumRestHeartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int priority;

    /* JADX WARN: Multi-variable type inference failed */
    public HeartRateCardState(@NotNull List<? extends HeartRate> data, @NotNull List<? extends HealthCandleEntry> chartData, int i, int i2, int i3, @NotNull String ssoid, long j2, int i4, int i5) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.data = data;
        this.chartData = chartData;
        this.sumMinHeartRate = i;
        this.sumMaxHeartRate = i2;
        this.sumRestHeartRate = i3;
        this.ssoid = ssoid;
        this.dataTime = j2;
        this.span = i4;
        this.priority = i5;
    }

    @Override // com.oplus.aiunit.vision.g27
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @NotNull
    public final List<HealthCandleEntry> b() {
        return this.chartData;
    }

    @NotNull
    public final List<HeartRate> c() {
        return this.data;
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
        if (!(other instanceof HeartRateCardState)) {
            return false;
        }
        HeartRateCardState heartRateCardState = (HeartRateCardState) other;
        return Intrinsics.areEqual(this.data, heartRateCardState.data) && Intrinsics.areEqual(this.chartData, heartRateCardState.chartData) && this.sumMinHeartRate == heartRateCardState.sumMinHeartRate && this.sumMaxHeartRate == heartRateCardState.sumMaxHeartRate && this.sumRestHeartRate == heartRateCardState.sumRestHeartRate && Intrinsics.areEqual(getSsoid(), heartRateCardState.getSsoid()) && getDataTime() == heartRateCardState.getDataTime() && getSpan() == heartRateCardState.getSpan() && getPriority() == heartRateCardState.getPriority();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSumMaxHeartRate() {
        return this.sumMaxHeartRate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSumMinHeartRate() {
        return this.sumMinHeartRate;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSumRestHeartRate() {
        return this.sumRestHeartRate;
    }

    public int hashCode() {
        return (((((((((((((((this.data.hashCode() * 31) + this.chartData.hashCode()) * 31) + Integer.hashCode(this.sumMinHeartRate)) * 31) + Integer.hashCode(this.sumMaxHeartRate)) * 31) + Integer.hashCode(this.sumRestHeartRate)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "HeartRateCardState(data=" + this.data + ", chartData=" + this.chartData + ", sumMinHeartRate=" + this.sumMinHeartRate + ", sumMaxHeartRate=" + this.sumMaxHeartRate + ", sumRestHeartRate=" + this.sumRestHeartRate + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ HeartRateCardState(List list, List list2, int i, int i2, int i3, String str, long j2, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i6 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, str, j2, (i6 & 128) != 0 ? 1 : i4, (i6 & 256) != 0 ? 2 : i5);
    }
}
