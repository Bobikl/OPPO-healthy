package com.heytap.health.settings.watch.sporthealthsettings.utils.research;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.ebe;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/SyncProjectState;", "", "projectCode", "", ebe.KEY_USER_INFO, "Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/ProjectUserInfo;", "userProjectActions", "", "Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/ProjectAction;", "deviceModel", "extra", "(Ljava/lang/String;Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/ProjectUserInfo;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceModel", "()Ljava/lang/String;", "getExtra", "getProjectCode", "getUserInfo", "()Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/ProjectUserInfo;", "getUserProjectActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncProjectState {
    public static final int $stable = 8;

    @NotNull
    private final String deviceModel;

    @Nullable
    private final String extra;

    @NotNull
    private final String projectCode;

    @Nullable
    private final ProjectUserInfo userInfo;

    @NotNull
    private final List<ProjectAction> userProjectActions;

    public SyncProjectState(@NotNull String projectCode, @Nullable ProjectUserInfo projectUserInfo, @NotNull List<ProjectAction> userProjectActions, @NotNull String deviceModel, @Nullable String str) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        Intrinsics.checkNotNullParameter(userProjectActions, "userProjectActions");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.projectCode = projectCode;
        this.userInfo = projectUserInfo;
        this.userProjectActions = userProjectActions;
        this.deviceModel = deviceModel;
        this.extra = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncProjectState copy$default(SyncProjectState syncProjectState, String str, ProjectUserInfo projectUserInfo, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncProjectState.projectCode;
        }
        if ((i & 2) != 0) {
            projectUserInfo = syncProjectState.userInfo;
        }
        ProjectUserInfo projectUserInfo2 = projectUserInfo;
        if ((i & 4) != 0) {
            list = syncProjectState.userProjectActions;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = syncProjectState.deviceModel;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = syncProjectState.extra;
        }
        return syncProjectState.copy(str, projectUserInfo2, list2, str4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProjectCode() {
        return this.projectCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProjectUserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    public final List<ProjectAction> component3() {
        return this.userProjectActions;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final SyncProjectState copy(@NotNull String projectCode, @Nullable ProjectUserInfo userInfo, @NotNull List<ProjectAction> userProjectActions, @NotNull String deviceModel, @Nullable String extra) {
        Intrinsics.checkNotNullParameter(projectCode, "projectCode");
        Intrinsics.checkNotNullParameter(userProjectActions, "userProjectActions");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new SyncProjectState(projectCode, userInfo, userProjectActions, deviceModel, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncProjectState)) {
            return false;
        }
        SyncProjectState syncProjectState = (SyncProjectState) other;
        return Intrinsics.areEqual(this.projectCode, syncProjectState.projectCode) && Intrinsics.areEqual(this.userInfo, syncProjectState.userInfo) && Intrinsics.areEqual(this.userProjectActions, syncProjectState.userProjectActions) && Intrinsics.areEqual(this.deviceModel, syncProjectState.deviceModel) && Intrinsics.areEqual(this.extra, syncProjectState.extra);
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getProjectCode() {
        return this.projectCode;
    }

    @Nullable
    public final ProjectUserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    public final List<ProjectAction> getUserProjectActions() {
        return this.userProjectActions;
    }

    public int hashCode() {
        int iHashCode = this.projectCode.hashCode() * 31;
        ProjectUserInfo projectUserInfo = this.userInfo;
        int iHashCode2 = (((((iHashCode + (projectUserInfo == null ? 0 : projectUserInfo.hashCode())) * 31) + this.userProjectActions.hashCode()) * 31) + this.deviceModel.hashCode()) * 31;
        String str = this.extra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SyncProjectState(projectCode=" + this.projectCode + ", userInfo=" + this.userInfo + ", userProjectActions=" + this.userProjectActions + ", deviceModel=" + this.deviceModel + ", extra=" + this.extra + ")";
    }
}
