package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.h1i, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/h1i;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "snoringRiskAssessmentSwitch", "automaticSnoringMonitorSwitch", "<init>", "(ZZ)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SnoringRisk {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean snoringRiskAssessmentSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean automaticSnoringMonitorSwitch;

    public SnoringRisk(boolean z, boolean z2) {
        this.snoringRiskAssessmentSwitch = z;
        this.automaticSnoringMonitorSwitch = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutomaticSnoringMonitorSwitch() {
        return this.automaticSnoringMonitorSwitch;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSnoringRiskAssessmentSwitch() {
        return this.snoringRiskAssessmentSwitch;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoringRisk)) {
            return false;
        }
        SnoringRisk snoringRisk = (SnoringRisk) other;
        return this.snoringRiskAssessmentSwitch == snoringRisk.snoringRiskAssessmentSwitch && this.automaticSnoringMonitorSwitch == snoringRisk.automaticSnoringMonitorSwitch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.snoringRiskAssessmentSwitch;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.automaticSnoringMonitorSwitch;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "SnoringRisk(snoringRiskAssessmentSwitch=" + this.snoringRiskAssessmentSwitch + ", automaticSnoringMonitorSwitch=" + this.automaticSnoringMonitorSwitch + ")";
    }
}
