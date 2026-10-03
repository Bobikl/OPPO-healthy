package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.TrackMetadataStat;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.yji, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/yji;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "d", "()J", "currentTime", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "b", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "records", "c", "bestDistance", "bestDuration", "I", "()I", "bestPace", "<init>", "(JLjava/util/List;JJI)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportsHomeRecordData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long currentTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<TrackMetadataStat> records;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long bestDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long bestDuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int bestPace;

    public SportsHomeRecordData() {
        this(0L, null, 0L, 0L, 0, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBestDistance() {
        return this.bestDistance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBestDuration() {
        return this.bestDuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBestPace() {
        return this.bestPace;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    public final List<TrackMetadataStat> e() {
        return this.records;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsHomeRecordData)) {
            return false;
        }
        SportsHomeRecordData sportsHomeRecordData = (SportsHomeRecordData) other;
        return this.currentTime == sportsHomeRecordData.currentTime && Intrinsics.areEqual(this.records, sportsHomeRecordData.records) && this.bestDistance == sportsHomeRecordData.bestDistance && this.bestDuration == sportsHomeRecordData.bestDuration && this.bestPace == sportsHomeRecordData.bestPace;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.currentTime) * 31) + this.records.hashCode()) * 31) + Long.hashCode(this.bestDistance)) * 31) + Long.hashCode(this.bestDuration)) * 31) + Integer.hashCode(this.bestPace);
    }

    @NotNull
    public String toString() {
        return "SportsHomeRecordData(currentTime=" + this.currentTime + ", records=" + this.records + ", bestDistance=" + this.bestDistance + ", bestDuration=" + this.bestDuration + ", bestPace=" + this.bestPace + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportsHomeRecordData(long j2, @NotNull List<? extends TrackMetadataStat> records, long j3, long j4, int i) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.currentTime = j2;
        this.records = records;
        this.bestDistance = j3;
        this.bestDuration = j4;
        this.bestPace = i;
    }

    public /* synthetic */ SportsHomeRecordData(long j2, List list, long j3, long j4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? System.currentTimeMillis() : j2, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) == 0 ? j4 : 0L, (i2 & 16) != 0 ? 0 : i);
    }
}
