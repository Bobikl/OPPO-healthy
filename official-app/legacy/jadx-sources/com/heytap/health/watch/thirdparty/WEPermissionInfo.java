package com.heytap.health.watch.thirdparty;

import com.oplus.aiunit.vision.tpe;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/watch/thirdparty/WEPermissionInfo;", "Ljava/io/Serializable;", "permissionName", "", "isAuth", "", tpe.LAST_UPDATE_TIME, "", "(Ljava/lang/String;ZJ)V", "()Z", "setAuth", "(Z)V", "getLastUpdateTime", "()J", "setLastUpdateTime", "(J)V", "getPermissionName", "()Ljava/lang/String;", "setPermissionName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WEPermissionInfo implements Serializable {
    private boolean isAuth;
    private long lastUpdateTime;

    @NotNull
    private String permissionName;

    public WEPermissionInfo(@NotNull String permissionName, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
        this.permissionName = permissionName;
        this.isAuth = z;
        this.lastUpdateTime = j2;
    }

    public static /* synthetic */ WEPermissionInfo copy$default(WEPermissionInfo wEPermissionInfo, String str, boolean z, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wEPermissionInfo.permissionName;
        }
        if ((i & 2) != 0) {
            z = wEPermissionInfo.isAuth;
        }
        if ((i & 4) != 0) {
            j2 = wEPermissionInfo.lastUpdateTime;
        }
        return wEPermissionInfo.copy(str, z, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPermissionName() {
        return this.permissionName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAuth() {
        return this.isAuth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final WEPermissionInfo copy(@NotNull String permissionName, boolean isAuth, long lastUpdateTime) {
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
        return new WEPermissionInfo(permissionName, isAuth, lastUpdateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WEPermissionInfo)) {
            return false;
        }
        WEPermissionInfo wEPermissionInfo = (WEPermissionInfo) other;
        return Intrinsics.areEqual(this.permissionName, wEPermissionInfo.permissionName) && this.isAuth == wEPermissionInfo.isAuth && this.lastUpdateTime == wEPermissionInfo.lastUpdateTime;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final String getPermissionName() {
        return this.permissionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.permissionName.hashCode() * 31;
        boolean z = this.isAuth;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Long.hashCode(this.lastUpdateTime);
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    public final void setAuth(boolean z) {
        this.isAuth = z;
    }

    public final void setLastUpdateTime(long j2) {
        this.lastUpdateTime = j2;
    }

    public final void setPermissionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permissionName = str;
    }

    @NotNull
    public String toString() {
        return "WEPermissionInfo(permissionName=" + this.permissionName + ", isAuth=" + this.isAuth + ", lastUpdateTime=" + this.lastUpdateTime + ")";
    }
}
