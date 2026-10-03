package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ina, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ina;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getAllDuration", "()J", "allDuration", "b", "getAllCalories", "allCalories", "c", "monthDuration", "<init>", "(JJJ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class KeepHomeStatisticsBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long allDuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long allCalories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long monthDuration;

    public KeepHomeStatisticsBean(long j2, long j3, long j4) {
        this.allDuration = j2;
        this.allCalories = j3;
        this.monthDuration = j4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMonthDuration() {
        return this.monthDuration;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeepHomeStatisticsBean)) {
            return false;
        }
        KeepHomeStatisticsBean keepHomeStatisticsBean = (KeepHomeStatisticsBean) other;
        return this.allDuration == keepHomeStatisticsBean.allDuration && this.allCalories == keepHomeStatisticsBean.allCalories && this.monthDuration == keepHomeStatisticsBean.monthDuration;
    }

    public int hashCode() {
        return (((Long.hashCode(this.allDuration) * 31) + Long.hashCode(this.allCalories)) * 31) + Long.hashCode(this.monthDuration);
    }

    @NotNull
    public String toString() {
        return "KeepHomeStatisticsBean(allDuration=" + this.allDuration + ", allCalories=" + this.allCalories + ", monthDuration=" + this.monthDuration + ")";
    }
}
