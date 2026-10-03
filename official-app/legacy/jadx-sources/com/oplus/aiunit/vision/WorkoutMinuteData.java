package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xzl, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/xzl;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "startTime", "b", "getEndTime", "endTime", "c", NotificationCompat.CATEGORY_WORKOUT, "<init>", "(JJJ)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WorkoutMinuteData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long endTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long workout;

    public WorkoutMinuteData(long j2, long j3, long j4) {
        this.startTime = j2;
        this.endTime = j3;
        this.workout = j4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getWorkout() {
        return this.workout;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutMinuteData)) {
            return false;
        }
        WorkoutMinuteData workoutMinuteData = (WorkoutMinuteData) other;
        return this.startTime == workoutMinuteData.startTime && this.endTime == workoutMinuteData.endTime && this.workout == workoutMinuteData.workout;
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Long.hashCode(this.workout);
    }

    @NotNull
    public String toString() {
        return "WorkoutMinuteData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", workout=" + this.workout + ")";
    }
}
