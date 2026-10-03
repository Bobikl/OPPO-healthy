package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.sleep.bean.SleepDayBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hbh, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010#\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010'\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001c\u0010&R\u001a\u0010(\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u000b\u0010\u0018R\u001a\u0010+\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/hbh;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "a", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "c", "()Lcom/heytap/health/sleep/bean/SleepDayBean;", "data", "", "Lcom/heytap/health/core/widget/charts/data/SleepUnitData;", "b", "Ljava/util/List;", "()Ljava/util/List;", "chartData", "I", b2n.f, "()I", "setSumTotalSleepTime", "(I)V", "sumTotalSleepTime", "d", "f", "setSumSleepScore", "sumSleepScore", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", c8l.SPAN_KEY, b2n.g, "getPriority", "priority", "<init>", "(Lcom/heytap/health/sleep/bean/SleepDayBean;Ljava/util/List;IILjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SleepCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final SleepDayBean data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<SleepUnitData> chartData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int sumTotalSleepTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int sumSleepScore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int priority;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepCardState(@Nullable SleepDayBean sleepDayBean, @NotNull List<? extends SleepUnitData> chartData, int i, int i2, @NotNull String ssoid, long j2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.data = sleepDayBean;
        this.chartData = chartData;
        this.sumTotalSleepTime = i;
        this.sumSleepScore = i2;
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
    public final List<SleepUnitData> b() {
        return this.chartData;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SleepDayBean getData() {
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
        if (!(other instanceof SleepCardState)) {
            return false;
        }
        SleepCardState sleepCardState = (SleepCardState) other;
        return Intrinsics.areEqual(this.data, sleepCardState.data) && Intrinsics.areEqual(this.chartData, sleepCardState.chartData) && this.sumTotalSleepTime == sleepCardState.sumTotalSleepTime && this.sumSleepScore == sleepCardState.sumSleepScore && Intrinsics.areEqual(getSsoid(), sleepCardState.getSsoid()) && getDataTime() == sleepCardState.getDataTime() && getSpan() == sleepCardState.getSpan() && getPriority() == sleepCardState.getPriority();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSumSleepScore() {
        return this.sumSleepScore;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSumTotalSleepTime() {
        return this.sumTotalSleepTime;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        SleepDayBean sleepDayBean = this.data;
        return ((((((((((((((sleepDayBean == null ? 0 : sleepDayBean.hashCode()) * 31) + this.chartData.hashCode()) * 31) + Integer.hashCode(this.sumTotalSleepTime)) * 31) + Integer.hashCode(this.sumSleepScore)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "SleepCardState(data=" + this.data + ", chartData=" + this.chartData + ", sumTotalSleepTime=" + this.sumTotalSleepTime + ", sumSleepScore=" + this.sumSleepScore + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ SleepCardState(SleepDayBean sleepDayBean, List list, int i, int i2, String str, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(sleepDayBean, (i5 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, str, j2, (i5 & 64) != 0 ? 1 : i3, (i5 & 128) != 0 ? 3 : i4);
    }
}
