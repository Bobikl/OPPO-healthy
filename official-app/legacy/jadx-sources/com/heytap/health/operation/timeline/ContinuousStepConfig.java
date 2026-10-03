package com.heytap.health.operation.timeline;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/operation/timeline/ContinuousStepConfig;", "", "stepsAMinLeast", "", "stepsTotalLeast", "startMin", "endMin", "(IIII)V", "getEndMin", "()I", "getStartMin", "getStepsAMinLeast", "getStepsTotalLeast", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "operation_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ContinuousStepConfig {
    public static final int $stable = 0;
    private final int endMin;
    private final int startMin;
    private final int stepsAMinLeast;
    private final int stepsTotalLeast;

    public ContinuousStepConfig(int i, int i2, int i3, int i4) {
        this.stepsAMinLeast = i;
        this.stepsTotalLeast = i2;
        this.startMin = i3;
        this.endMin = i4;
    }

    public static /* synthetic */ ContinuousStepConfig copy$default(ContinuousStepConfig continuousStepConfig, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = continuousStepConfig.stepsAMinLeast;
        }
        if ((i5 & 2) != 0) {
            i2 = continuousStepConfig.stepsTotalLeast;
        }
        if ((i5 & 4) != 0) {
            i3 = continuousStepConfig.startMin;
        }
        if ((i5 & 8) != 0) {
            i4 = continuousStepConfig.endMin;
        }
        return continuousStepConfig.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStepsAMinLeast() {
        return this.stepsAMinLeast;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStepsTotalLeast() {
        return this.stepsTotalLeast;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStartMin() {
        return this.startMin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEndMin() {
        return this.endMin;
    }

    @NotNull
    public final ContinuousStepConfig copy(int stepsAMinLeast, int stepsTotalLeast, int startMin, int endMin) {
        return new ContinuousStepConfig(stepsAMinLeast, stepsTotalLeast, startMin, endMin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContinuousStepConfig)) {
            return false;
        }
        ContinuousStepConfig continuousStepConfig = (ContinuousStepConfig) other;
        return this.stepsAMinLeast == continuousStepConfig.stepsAMinLeast && this.stepsTotalLeast == continuousStepConfig.stepsTotalLeast && this.startMin == continuousStepConfig.startMin && this.endMin == continuousStepConfig.endMin;
    }

    public final int getEndMin() {
        return this.endMin;
    }

    public final int getStartMin() {
        return this.startMin;
    }

    public final int getStepsAMinLeast() {
        return this.stepsAMinLeast;
    }

    public final int getStepsTotalLeast() {
        return this.stepsTotalLeast;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.stepsAMinLeast) * 31) + Integer.hashCode(this.stepsTotalLeast)) * 31) + Integer.hashCode(this.startMin)) * 31) + Integer.hashCode(this.endMin);
    }

    @NotNull
    public String toString() {
        return "ContinuousStepConfig(stepsAMinLeast=" + this.stepsAMinLeast + ", stepsTotalLeast=" + this.stepsTotalLeast + ", startMin=" + this.startMin + ", endMin=" + this.endMin + ")";
    }
}
