package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J0\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/cardiovascular/model/AssessmentExtraInfo;", "", "step", "", "activityCount", "ecgUninstalled", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getActivityCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEcgUninstalled", "()Z", "getStep", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/heytap/health/cardiovascular/model/AssessmentExtraInfo;", "equals", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AssessmentExtraInfo {
    public static final int $stable = 0;

    @Nullable
    private final Integer activityCount;
    private final boolean ecgUninstalled;

    @Nullable
    private final Integer step;

    public AssessmentExtraInfo() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ AssessmentExtraInfo copy$default(AssessmentExtraInfo assessmentExtraInfo, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = assessmentExtraInfo.step;
        }
        if ((i & 2) != 0) {
            num2 = assessmentExtraInfo.activityCount;
        }
        if ((i & 4) != 0) {
            z = assessmentExtraInfo.ecgUninstalled;
        }
        return assessmentExtraInfo.copy(num, num2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStep() {
        return this.step;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getActivityCount() {
        return this.activityCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEcgUninstalled() {
        return this.ecgUninstalled;
    }

    @NotNull
    public final AssessmentExtraInfo copy(@Nullable Integer step, @Nullable Integer activityCount, boolean ecgUninstalled) {
        return new AssessmentExtraInfo(step, activityCount, ecgUninstalled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssessmentExtraInfo)) {
            return false;
        }
        AssessmentExtraInfo assessmentExtraInfo = (AssessmentExtraInfo) other;
        return Intrinsics.areEqual(this.step, assessmentExtraInfo.step) && Intrinsics.areEqual(this.activityCount, assessmentExtraInfo.activityCount) && this.ecgUninstalled == assessmentExtraInfo.ecgUninstalled;
    }

    @Nullable
    public final Integer getActivityCount() {
        return this.activityCount;
    }

    public final boolean getEcgUninstalled() {
        return this.ecgUninstalled;
    }

    @Nullable
    public final Integer getStep() {
        return this.step;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        Integer num = this.step;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.activityCount;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.ecgUninstalled;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode2 + r3;
    }

    @NotNull
    public String toString() {
        return "AssessmentExtraInfo(step=" + this.step + ", activityCount=" + this.activityCount + ", ecgUninstalled=" + this.ecgUninstalled + ")";
    }

    public AssessmentExtraInfo(@Nullable Integer num, @Nullable Integer num2, boolean z) {
        this.step = num;
        this.activityCount = num2;
        this.ecgUninstalled = z;
    }

    public /* synthetic */ AssessmentExtraInfo(Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? false : z);
    }
}
