package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bbi, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/bbi;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "f", "()I", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "b", "J", "()J", "countDistance", "c", "longestDistance", "d", "fastSpeed", MapSchema.FIELD_NAME_ENTRY, "mostDuration", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "runningTarget", "<init>", "(IJJIILjava/lang/Integer;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportHeadCountBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long countDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long longestDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int fastSpeed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int mostDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer runningTarget;

    public SportHeadCountBean() {
        this(0, 0L, 0L, 0, 0, null, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCountDistance() {
        return this.countDistance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFastSpeed() {
        return this.fastSpeed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLongestDistance() {
        return this.longestDistance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMostDuration() {
        return this.mostDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getRunningTarget() {
        return this.runningTarget;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportHeadCountBean)) {
            return false;
        }
        SportHeadCountBean sportHeadCountBean = (SportHeadCountBean) other;
        return this.sportMode == sportHeadCountBean.sportMode && this.countDistance == sportHeadCountBean.countDistance && this.longestDistance == sportHeadCountBean.longestDistance && this.fastSpeed == sportHeadCountBean.fastSpeed && this.mostDuration == sportHeadCountBean.mostDuration && Intrinsics.areEqual(this.runningTarget, sportHeadCountBean.runningTarget);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.sportMode) * 31) + Long.hashCode(this.countDistance)) * 31) + Long.hashCode(this.longestDistance)) * 31) + Integer.hashCode(this.fastSpeed)) * 31) + Integer.hashCode(this.mostDuration)) * 31;
        Integer num = this.runningTarget;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportHeadCountBean(sportMode=" + this.sportMode + ", countDistance=" + this.countDistance + ", longestDistance=" + this.longestDistance + ", fastSpeed=" + this.fastSpeed + ", mostDuration=" + this.mostDuration + ", runningTarget=" + this.runningTarget + ")";
    }

    public SportHeadCountBean(int i, long j2, long j3, int i2, int i3, @Nullable Integer num) {
        this.sportMode = i;
        this.countDistance = j2;
        this.longestDistance = j3;
        this.fastSpeed = i2;
        this.mostDuration = i3;
        this.runningTarget = num;
    }

    public /* synthetic */ SportHeadCountBean(int i, long j2, long j3, int i2, int i3, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 100 : i, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) == 0 ? j3 : 0L, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) == 0 ? i3 : 0, (i4 & 32) != 0 ? null : num);
    }
}
