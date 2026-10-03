package com.heytap.health.wallet.network.common.rsp;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.fkj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/wallet/network/common/rsp/CombinationSwitchStatus;", "", fkj.PARAM_SWITCH_STATUS, "", "isSupport", "", "(Ljava/lang/String;Z)V", "()Z", "setSupport", "(Z)V", "getSwitchStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CombinationSwitchStatus {
    private boolean isSupport;

    @Nullable
    private final String switchStatus;

    public CombinationSwitchStatus(@Nullable String str, boolean z) {
        this.switchStatus = str;
        this.isSupport = z;
    }

    public static /* synthetic */ CombinationSwitchStatus copy$default(CombinationSwitchStatus combinationSwitchStatus, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = combinationSwitchStatus.switchStatus;
        }
        if ((i & 2) != 0) {
            z = combinationSwitchStatus.isSupport;
        }
        return combinationSwitchStatus.copy(str, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSwitchStatus() {
        return this.switchStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    public final CombinationSwitchStatus copy(@Nullable String switchStatus, boolean isSupport) {
        return new CombinationSwitchStatus(switchStatus, isSupport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinationSwitchStatus)) {
            return false;
        }
        CombinationSwitchStatus combinationSwitchStatus = (CombinationSwitchStatus) other;
        return Intrinsics.areEqual(this.switchStatus, combinationSwitchStatus.switchStatus) && this.isSupport == combinationSwitchStatus.isSupport;
    }

    @Nullable
    public final String getSwitchStatus() {
        return this.switchStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        String str = this.switchStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isSupport;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    public final void setSupport(boolean z) {
        this.isSupport = z;
    }

    @NotNull
    public String toString() {
        return "CombinationSwitchStatus(switchStatus=" + this.switchStatus + ", isSupport=" + this.isSupport + ")";
    }

    public /* synthetic */ CombinationSwitchStatus(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
