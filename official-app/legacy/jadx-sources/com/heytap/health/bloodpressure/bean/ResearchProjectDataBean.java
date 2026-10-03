package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/heytap/health/bloodpressure/bean/ResearchProjectDataBean;", "", "joinTime", "", "stage", "", "state", "taskFinishDays", ClickApiEntity.TIME, "", "riskTime", "(JIII[JJ)V", "getJoinTime", "()J", "getRiskTime", "getStage", "()I", "getState", "getTaskFinishDays", "getTime", "()[J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchProjectDataBean {
    public static final int $stable = 8;
    private final long joinTime;
    private final long riskTime;
    private final int stage;
    private final int state;
    private final int taskFinishDays;

    @NotNull
    private final long[] time;

    public ResearchProjectDataBean(long j2, int i, int i2, int i3, @NotNull long[] time, long j3) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.joinTime = j2;
        this.stage = i;
        this.state = i2;
        this.taskFinishDays = i3;
        this.time = time;
        this.riskTime = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getJoinTime() {
        return this.joinTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStage() {
        return this.stage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTaskFinishDays() {
        return this.taskFinishDays;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long[] getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getRiskTime() {
        return this.riskTime;
    }

    @NotNull
    public final ResearchProjectDataBean copy(long joinTime, int stage, int state, int taskFinishDays, @NotNull long[] time, long riskTime) {
        Intrinsics.checkNotNullParameter(time, "time");
        return new ResearchProjectDataBean(joinTime, stage, state, taskFinishDays, time, riskTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchProjectDataBean)) {
            return false;
        }
        ResearchProjectDataBean researchProjectDataBean = (ResearchProjectDataBean) other;
        return this.joinTime == researchProjectDataBean.joinTime && this.stage == researchProjectDataBean.stage && this.state == researchProjectDataBean.state && this.taskFinishDays == researchProjectDataBean.taskFinishDays && Intrinsics.areEqual(this.time, researchProjectDataBean.time) && this.riskTime == researchProjectDataBean.riskTime;
    }

    public final long getJoinTime() {
        return this.joinTime;
    }

    public final long getRiskTime() {
        return this.riskTime;
    }

    public final int getStage() {
        return this.stage;
    }

    public final int getState() {
        return this.state;
    }

    public final int getTaskFinishDays() {
        return this.taskFinishDays;
    }

    @NotNull
    public final long[] getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.joinTime) * 31) + Integer.hashCode(this.stage)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.taskFinishDays)) * 31) + Arrays.hashCode(this.time)) * 31) + Long.hashCode(this.riskTime);
    }

    @NotNull
    public String toString() {
        return "ResearchProjectDataBean(joinTime=" + this.joinTime + ", stage=" + this.stage + ", state=" + this.state + ", taskFinishDays=" + this.taskFinishDays + ", time=" + Arrays.toString(this.time) + ", riskTime=" + this.riskTime + ")";
    }
}
