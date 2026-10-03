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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/SyncProjectResponseItem;", "", "joinTime", "", "projectCode", "", "state", "", "updateTime", "extra", "(JLjava/lang/String;IJLjava/lang/String;)V", "getExtra", "()Ljava/lang/String;", "getJoinTime", "()J", "getProjectCode", "getState", "()I", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncProjectResponseItem {
    public static final int $stable = 0;

    @Nullable
    private final String extra;
    private final long joinTime;

    @NotNull
    private final String projectCode;
    private final int state;
    private final long updateTime;

    public SyncProjectResponseItem(long j2, @NotNull String projectCode, int i, long j3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        this.joinTime = j2;
        this.projectCode = projectCode;
        this.state = i;
        this.updateTime = j3;
        this.extra = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getJoinTime() {
        return this.joinTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProjectCode() {
        return this.projectCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final SyncProjectResponseItem copy(long joinTime, @NotNull String projectCode, int state, long updateTime, @Nullable String extra) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        return new SyncProjectResponseItem(joinTime, projectCode, state, updateTime, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncProjectResponseItem)) {
            return false;
        }
        SyncProjectResponseItem syncProjectResponseItem = (SyncProjectResponseItem) other;
        return this.joinTime == syncProjectResponseItem.joinTime && Intrinsics.areEqual(this.projectCode, syncProjectResponseItem.projectCode) && this.state == syncProjectResponseItem.state && this.updateTime == syncProjectResponseItem.updateTime && Intrinsics.areEqual(this.extra, syncProjectResponseItem.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
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
        int iHashCode = ((((((Long.hashCode(this.joinTime) * 31) + this.projectCode.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + Long.hashCode(this.updateTime)) * 31;
        String str = this.extra;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SyncProjectResponseItem(joinTime=" + this.joinTime + ", projectCode=" + this.projectCode + ", state=" + this.state + ", updateTime=" + this.updateTime + ", extra=" + this.extra + ")";
    }
}
