package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.store.apm.PageTrackBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.x48, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/x48;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getSportMode", "()I", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "b", "J", "()J", "monthDistance", "c", "monthTime", "d", "totalDistance", MapSchema.FIELD_NAME_ENTRY, PageTrackBean.TOTAL_TIME, "f", "totalCalories", "<init>", "(IJJJJJ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GenericHeadStats {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long monthDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long monthTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long totalDistance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long totalTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long totalCalories;

    public GenericHeadStats() {
        this(0, 0L, 0L, 0L, 0L, 0L, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMonthDistance() {
        return this.monthDistance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMonthTime() {
        return this.monthTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTotalCalories() {
        return this.totalCalories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTotalTime() {
        return this.totalTime;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericHeadStats)) {
            return false;
        }
        GenericHeadStats genericHeadStats = (GenericHeadStats) other;
        return this.sportMode == genericHeadStats.sportMode && this.monthDistance == genericHeadStats.monthDistance && this.monthTime == genericHeadStats.monthTime && this.totalDistance == genericHeadStats.totalDistance && this.totalTime == genericHeadStats.totalTime && this.totalCalories == genericHeadStats.totalCalories;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.sportMode) * 31) + Long.hashCode(this.monthDistance)) * 31) + Long.hashCode(this.monthTime)) * 31) + Long.hashCode(this.totalDistance)) * 31) + Long.hashCode(this.totalTime)) * 31) + Long.hashCode(this.totalCalories);
    }

    @NotNull
    public String toString() {
        return "GenericHeadStats(sportMode=" + this.sportMode + ", monthDistance=" + this.monthDistance + ", monthTime=" + this.monthTime + ", totalDistance=" + this.totalDistance + ", totalTime=" + this.totalTime + ", totalCalories=" + this.totalCalories + ")";
    }

    public GenericHeadStats(int i, long j2, long j3, long j4, long j5, long j6) {
        this.sportMode = i;
        this.monthDistance = j2;
        this.monthTime = j3;
        this.totalDistance = j4;
        this.totalTime = j5;
        this.totalCalories = j6;
    }

    public /* synthetic */ GenericHeadStats(int i, long j2, long j3, long j4, long j5, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -2 : i, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) != 0 ? 0L : j4, (i2 & 16) != 0 ? 0L : j5, (i2 & 32) == 0 ? j6 : 0L);
    }
}
