package com.heytap.health.settings.watch.sporthealthsettings.utils.research;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/ResearchProjectItemState;", "", "projectCode", "", "joinTime", "", "state", "", "updateTime", "(Ljava/lang/String;JIJ)V", "getJoinTime", "()J", "getProjectCode", "()Ljava/lang/String;", "getState", "()I", "getUpdateTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchProjectItemState {
    public static final int $stable = 0;
    private final long joinTime;

    @NotNull
    private final String projectCode;
    private final int state;
    private final long updateTime;

    public ResearchProjectItemState(@NotNull String projectCode, long j2, int i, long j3) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        this.projectCode = projectCode;
        this.joinTime = j2;
        this.state = i;
        this.updateTime = j3;
    }

    public static /* synthetic */ ResearchProjectItemState copy$default(ResearchProjectItemState researchProjectItemState, String str, long j2, int i, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = researchProjectItemState.projectCode;
        }
        if ((i2 & 2) != 0) {
            j2 = researchProjectItemState.joinTime;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = researchProjectItemState.state;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j3 = researchProjectItemState.updateTime;
        }
        return researchProjectItemState.copy(str, j4, i3, j3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProjectCode() {
        return this.projectCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getJoinTime() {
        return this.joinTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final ResearchProjectItemState copy(@NotNull String projectCode, long joinTime, int state, long updateTime) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        return new ResearchProjectItemState(projectCode, joinTime, state, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchProjectItemState)) {
            return false;
        }
        ResearchProjectItemState researchProjectItemState = (ResearchProjectItemState) other;
        return Intrinsics.areEqual(this.projectCode, researchProjectItemState.projectCode) && this.joinTime == researchProjectItemState.joinTime && this.state == researchProjectItemState.state && this.updateTime == researchProjectItemState.updateTime;
    }

    public final long getJoinTime() {
        return this.joinTime;
    }

    @NotNull
    public final String getProjectCode() {
        return this.projectCode;
    }

    public final int getState() {
        return this.state;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((this.projectCode.hashCode() * 31) + Long.hashCode(this.joinTime)) * 31) + Integer.hashCode(this.state)) * 31) + Long.hashCode(this.updateTime);
    }

    @NotNull
    public String toString() {
        return "ResearchProjectItemState(projectCode=" + this.projectCode + ", joinTime=" + this.joinTime + ", state=" + this.state + ", updateTime=" + this.updateTime + ")";
    }
}
