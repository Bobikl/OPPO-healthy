package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.hii, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R4\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R$\u0010(\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b\t\u0010%\"\u0004\b&\u0010'R$\u0010+\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/hii;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "f", "()I", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "b", "cardType", "", "c", "J", b2n.f, "()J", "startTime", "", "Lkotlin/Pair;", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "dataList", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Double;", "()Ljava/lang/Double;", "lastTotalValue", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "()Lcom/heytap/databaseengine/model/TrackMetadataStat;", b2n.g, "(Lcom/heytap/databaseengine/model/TrackMetadataStat;)V", "bestRecord", "j", "(Ljava/lang/Double;)V", "runAvgTimeData", "<init>", "(IIJLjava/util/List;Ljava/lang/Double;Lcom/heytap/databaseengine/model/TrackMetadataStat;Ljava/lang/Double;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportStatCardBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int cardType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public List<Pair<Long, Double>> dataList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Double lastTotalValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public TrackMetadataStat bestRecord;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public Double runAvgTimeData;

    public SportStatCardBean(int i, int i2, long j2, @NotNull List<Pair<Long, Double>> dataList, @Nullable Double d, @Nullable TrackMetadataStat trackMetadataStat, @Nullable Double d2) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.sportMode = i;
        this.cardType = i2;
        this.startTime = j2;
        this.dataList = dataList;
        this.lastTotalValue = d;
        this.bestRecord = trackMetadataStat;
        this.runAvgTimeData = d2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TrackMetadataStat getBestRecord() {
        return this.bestRecord;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    public final List<Pair<Long, Double>> c() {
        return this.dataList;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getLastTotalValue() {
        return this.lastTotalValue;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getRunAvgTimeData() {
        return this.runAvgTimeData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportStatCardBean)) {
            return false;
        }
        SportStatCardBean sportStatCardBean = (SportStatCardBean) other;
        return this.sportMode == sportStatCardBean.sportMode && this.cardType == sportStatCardBean.cardType && this.startTime == sportStatCardBean.startTime && Intrinsics.areEqual(this.dataList, sportStatCardBean.dataList) && Intrinsics.areEqual((Object) this.lastTotalValue, (Object) sportStatCardBean.lastTotalValue) && Intrinsics.areEqual(this.bestRecord, sportStatCardBean.bestRecord) && Intrinsics.areEqual((Object) this.runAvgTimeData, (Object) sportStatCardBean.runAvgTimeData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final void h(@Nullable TrackMetadataStat trackMetadataStat) {
        this.bestRecord = trackMetadataStat;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.sportMode) * 31) + Integer.hashCode(this.cardType)) * 31) + Long.hashCode(this.startTime)) * 31) + this.dataList.hashCode()) * 31;
        Double d = this.lastTotalValue;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        TrackMetadataStat trackMetadataStat = this.bestRecord;
        int iHashCode3 = (iHashCode2 + (trackMetadataStat == null ? 0 : trackMetadataStat.hashCode())) * 31;
        Double d2 = this.runAvgTimeData;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public final void i(@NotNull List<Pair<Long, Double>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void j(@Nullable Double d) {
        this.runAvgTimeData = d;
    }

    @NotNull
    public String toString() {
        return "SportStatCardBean(sportMode=" + this.sportMode + ", cardType=" + this.cardType + ", startTime=" + this.startTime + ", dataList=" + this.dataList + ", lastTotalValue=" + this.lastTotalValue + ", bestRecord=" + this.bestRecord + ", runAvgTimeData=" + this.runAvgTimeData + ")";
    }

    public /* synthetic */ SportStatCardBean(int i, int i2, long j2, List list, Double d, TrackMetadataStat trackMetadataStat, Double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j2, list, (i3 & 16) != 0 ? null : d, (i3 & 32) != 0 ? null : trackMetadataStat, (i3 & 64) != 0 ? null : d2);
    }
}
